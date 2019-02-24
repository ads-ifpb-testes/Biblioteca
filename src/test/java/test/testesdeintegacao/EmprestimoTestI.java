package test.testesdeintegacao;


import com.ifpb.biblioteca.exceptions.LivroIndisponivelException;

import com.ifpb.biblioteca.exceptions.LivroInvalidoException;
import com.ifpb.biblioteca.model.Dao.ClienteDAO;
import com.ifpb.biblioteca.model.Dao.EmprestimoDAO;
import com.ifpb.biblioteca.model.Dao.EmprestimoDaoImpl;
import com.ifpb.biblioteca.model.Dao.LivroDAO;
import com.ifpb.biblioteca.model.Entities.Cliente;
import com.ifpb.biblioteca.model.Entities.Emprestimo;
import com.ifpb.biblioteca.model.Enum.LivroEnum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.ifpb.biblioteca.model.Entities.Livro;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmprestimoTestI {

    @Mock
    private ClienteDAO clienteDao;
    @Mock
    private LivroDAO livroDAO;


    private EmprestimoDAO emprestimoDAO = new EmprestimoDaoImpl();
    private String email = "tonyy@gmail.com";
    private Cliente cliente =  new Cliente("222.222.222-02", "Antonio",
            LocalDate.now(), email, "321123");
    private Livro livro = new Livro("Harry Potter", 3, "Roco", "J.K.Rolling", LivroEnum.CONSULTA);


    @Before
    public void iniciarTestes() {
        MockitoAnnotations.initMocks(this);

    }

    @Test
    public void emprestimoLivroConsulta(){
        Mockito.when(clienteDao.buscar(email)).thenReturn(cliente);
        try {
            Assert.assertFalse(emprestimoDAO.emprestar(livro,email,clienteDao));
        } catch (LivroInvalidoException | LivroIndisponivelException e) {
            e.printStackTrace();
        }

    }
}
