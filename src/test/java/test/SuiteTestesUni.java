package test;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        ClienteTest.class,
        EmprestimoTest.class,
        FuncionarioTest.class,
        LivroTest.class,
        ReservaTest.class
})

public class SuiteTestesUni {

}
