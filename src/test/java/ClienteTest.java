import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ifpb.biblioteca.exceptions.DadosInvalidosException;
import com.ifpb.biblioteca.model.Dao.ClienteDAO;
import com.ifpb.biblioteca.model.Dao.ClienteDaoImpl;
import com.ifpb.biblioteca.model.Entities.Cliente;

public class ClienteTest {
	
	private ClienteDAO clienteDao;
	
	@Before
	public void iniciarTestes() {
		clienteDao = new ClienteDaoImpl();
	}
	@Test
	public void cadastrarCliente() {
		try {
			Assert.assertTrue(clienteDao.cadastrar("111.111.111-01", "Lucas", LocalDate.now(), "luquinhasEvangelista@gmail.com" , "456123"));
		} catch (DadosInvalidosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
