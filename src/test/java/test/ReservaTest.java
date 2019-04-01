package test;

import com.ifpb.biblioteca.model.Dao.ReservaDAO;
import com.ifpb.biblioteca.model.Dao.ReservaDaoImpl;
import com.ifpb.biblioteca.model.Entities.Cliente;
import com.ifpb.biblioteca.model.Entities.Livro;
import com.ifpb.biblioteca.model.Enum.LivroEnum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;

public class ReservaTest {

    private ReservaDAO reservaDAO;
    private Livro livro;
    private Livro livro2;
    private Cliente cliente;
    private Cliente cliente2;



    @Before
    public void iniciarTestes(){
        MockitoAnnotations.initMocks(this);
        reservaDAO = new ReservaDaoImpl();
        livro = new Livro("Harry Potter",11,"Intriseca","JKR", LivroEnum.EMPRESTIMO);
        cliente = new Cliente("333.333.333-03", "Mailson", LocalDate.now(), "mailsuu@gmail.com" , "456123");

        //------------------------------------------------------------------

        livro2 = new Livro("O Hobbit",41,"AGSYDgAYSD","J.R.R.Tolkien",LivroEnum.EMPRESTIMO);
        cliente2 = new Cliente("444.444.444-04", "Lucas", LocalDate.now(), "luquinhas@gmail.com" , "456123");

        reservaDAO.reservarLivro(livro2,cliente2);
    }

    @Test
    public void realizarReserva(){
        Assert.assertTrue(reservaDAO.reservarLivro(livro,cliente));
    }

    @Test
    public void realizarReservaSemLivro(){
        Assert.assertNotNull(reservaDAO.reservarLivro(null,cliente));
    }

    @Test
    public void realizarReservaRepetida(){
        Assert.assertTrue(reservaDAO.reservarLivro(livro,cliente));
    }


}
