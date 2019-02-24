package test;

import com.ifpb.biblioteca.exceptions.DadosInvalidosException;
import com.ifpb.biblioteca.model.Dao.LivroDAO;
import com.ifpb.biblioteca.model.Dao.LivroDaoImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class LivroTest {

    private LivroDAO livroDAO;

    @Before
    public void iniciarTestes() throws DadosInvalidosException {
        MockitoAnnotations.initMocks(this);
        livroDAO = new LivroDaoImpl();
        livroDAO.cadastrar("Harry Potter",11,"Intriseca","JKR");
    }

    @Test
    public void cadastrar(){
        try {
            Assert.assertTrue(livroDAO.cadastrar("Harry Potter 2",12,"Intriseca","JKR"));
        } catch (DadosInvalidosException e) {
            // TODO Auto-generated catch block
        }
    }

    @Test
    public void cadastrarSemTitulo(){
        try {
            Assert.assertTrue(livroDAO.cadastrar(null,05,"Nova","Martin"));
        } catch (DadosInvalidosException e) {
            // TODO Auto-generated catch block
        }
    }

    @Test
    public void cadastrarCodigoInvalido(){
        try {
            Assert.assertTrue(livroDAO.cadastrar("Redes",05,"Terra","Gabriel"));
        } catch (DadosInvalidosException e) {
            // TODO Auto-generated catch block
        }
    }



}
