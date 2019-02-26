package test.testesdeintegacao;


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

public class ClienteTestI {

    private ClienteDAO clienteDao;

    @Mock
    private EmprestimoDAO emprestimoDao;

    @Before
    public void iniciarTestes() throws DadosInvalidosException {
        MockitoAnnotations.initMocks(this);
        clienteDao = new ClienteDaoImpl();
        clienteDao.cadastrar("333.333.333-03", "Mailson", LocalDate.now(), "mailsuu@gmail.com", "456123");
    }

    @Test
    public void deletarUsuarioPendente() throws UsuarioPendenteException {
        Assert.assertTrue(clienteDao.buscarPendencias("mailsuu@gmail.com", emprestimoDao).isEmpty());
        Assert.assertFalse(clienteDao.excluir("mailsuu@gmail.com"));
    }

    @Test
    public void cadastrarClienteExistente() throws DadosInvalidosException {
        Assert.assertFalse(clienteDao.cadastrar("333.333.333-03","Mailson",LocalDate.now(),"mailsuu@gmail.com","456123"));
    }
}
