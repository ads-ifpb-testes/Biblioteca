import com.ifpb.biblioteca.exceptions.DadosInvalidosException;
import com.ifpb.biblioteca.model.Dao.FuncionarioDAO;
import com.ifpb.biblioteca.model.Dao.FuncionarioDaoImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;

public class FuncionarioTest {

    private FuncionarioDAO funcionarioDAO;

    @Before
    public void iniciarTestes () throws DadosInvalidosException {
        MockitoAnnotations.initMocks(this);
        funcionarioDAO = new FuncionarioDaoImpl();
        funcionarioDAO.cadastrar(2019001,"Mel Gibson","123","666.666.666.06", LocalDate.now());
    }

    @Test
    public void cadastrar(){
        try {
            Assert.assertTrue(funcionarioDAO.cadastrar(2019002,"Tony","hardware","656.323.989-11",LocalDate.now()));
        } catch (DadosInvalidosException e) {
            // TODO Auto-generated catch block
        }
    }

    @Test
    public void cadastrarMatriculaInvalida(){
        try {
            Assert.assertFalse(funcionarioDAO.cadastrar(2019002,"Escanor","leao","888.888.888-99",LocalDate.now()));
        } catch (DadosInvalidosException e) {
            // TODO Auto-generated catch block
        }
    }

    @Test
    public void cadastrarSemCPF(){
        try {
            Assert.assertFalse(funcionarioDAO.cadastrar(2019004,"Goku","kakaroto",null,LocalDate.now()));
        } catch (DadosInvalidosException e) {
            // TODO Auto-generated catch block
        }
    }
}
