package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Logger;

import com.ifpb.biblioteca.exceptions.UsuarioPendenteException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.ifpb.biblioteca.exceptions.DadosInvalidosException;
import com.ifpb.biblioteca.model.Dao.ClienteDAO;
import com.ifpb.biblioteca.model.Dao.ClienteDaoImpl;
import com.ifpb.biblioteca.model.Dao.EmprestimoDAO;
import com.ifpb.biblioteca.model.Entities.Cliente;
import com.ifpb.biblioteca.model.Entities.Emprestimo;

public class ClienteTest {
	
	private ClienteDAO clienteDao;
	
	@Mock
	private EmprestimoDAO emprestimoDao;
	
	@Before
	public void iniciarTestes() throws DadosInvalidosException {
		MockitoAnnotations.initMocks(this);
		clienteDao = new ClienteDaoImpl();
		clienteDao.cadastrar("333.333.333-03", "Mailson", LocalDate.now(), "mailsuu@gmail.com" , "456123");
	}
	
	@Test
	public void cadastrarCliente() {
		try {
			Assert.assertTrue(clienteDao.cadastrar("111.111.111-01", "Lucas", LocalDate.now(), "luquinhasEvangelista@gmail.com" , "456123"));
		} catch (DadosInvalidosException e) {
			// TODO Auto-generated catch block
		}
	}
	
	@Test
	public void cadastrarClienteSemEmail() {
		try {
			Assert.assertTrue(clienteDao.cadastrar("111.111.111-01", "Lucas", LocalDate.now(), null , "456123"));
		} catch (DadosInvalidosException e) {
			// TODO Auto-generated catch block
		}
	}
	
	@Test
	public void buscarPendenciasSemEmprestimos() {
		Mockito.when(emprestimoDao.listarEmprestimos()).thenReturn(new ArrayList<Emprestimo>());
		Assert.assertEquals(new ArrayList<String>(), clienteDao.buscarPendencias("mailsuu@gmail.com",emprestimoDao));
	}

	
	
}
