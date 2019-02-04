package test;

import com.ifpb.biblioteca.exceptions.LivroIndisponivelException;

import com.ifpb.biblioteca.model.Dao.ClienteDAO;
import com.ifpb.biblioteca.model.Dao.EmprestimoDAO;
import com.ifpb.biblioteca.model.Dao.EmprestimoDaoImpl;
import com.ifpb.biblioteca.model.Dao.LivroDAO;
import com.ifpb.biblioteca.model.Entities.Cliente;
import com.ifpb.biblioteca.model.Entities.Emprestimo;
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

public class EmprestimoTest {

    @Mock
    private ClienteDAO clienteDao;
    @Mock
    private LivroDAO livroDAO;
    
    
    private List<Livro> livros;
    private List<Emprestimo> emprestimos;
    private Map<String, Cliente> clientes;
    private EmprestimoDAO emprestimoDAO = new EmprestimoDaoImpl();
    private Cliente cliente;
    private String email = "TonynhoRodrigues@gmail.com";


    @Before
    public void iniciarTestes(){
        MockitoAnnotations.initMocks(this);
        cliente = new Cliente("222.222.222-02","Antõnio",
                LocalDate.now(),email,"321123");

        //-------------------------------------------------------------

        clientes = new HashMap<>();
        clientes.put("CamilinhaSG@gmail.com",new Cliente("111.111.111-01","Camila",
                LocalDate.now(),"CamilinhaSG@gmail.com","321123"));
        clientes.put("TonynhoRodrigues@gmail.com",new Cliente("222.222.222-02","Antônio",
                LocalDate.now(),"TonynhoRodrigues@gmail.com","321123"));

        //--------------------------------------------------------------

        livros = new ArrayList<>();
        livros.add(new Livro("Harry Potter",1,"Roco","J.K.Rolling"));
        livros.add(new Livro("Senhor dos Aneis",2,"Martins Fontes","J.R.R.Tolkien"));

        //---------------------------------------------------------------

        emprestimos = new ArrayList<>();
        emprestimos.add(new Emprestimo(livros.get(0),clientes.get("CamilinhaSG@gmail.com")));
        emprestimos.add(new Emprestimo(livros.get(1),clientes.get("TonynhoRodrigues@gmail.com")));
        emprestimoDAO.setEmprestimos(emprestimos);

    }


    @Test
    public void emprestimoSemLivro(){
        Mockito.when(clienteDao.buscar(email)).thenReturn(cliente);
        try {
            Assert.assertFalse(emprestimoDAO.emprestar(null,email,clienteDao));
        } catch (LivroIndisponivelException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void consultarEmprestimoErrado(){
        Assert.assertNull(emprestimoDAO.consultar(10));
    }

    @Test
    public void consultarEmprestimoCorreto(){
        Assert.assertNotNull(emprestimoDAO.consultar(2));
    }

}
