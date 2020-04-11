package test.java;

import main.java.de.hems.InputOutput;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class InputOutputTest {

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    PrintStream originOut = System.out;
    PrintStream originErr = System.err;

    @BeforeEach
    void setUp(){
        System.out.println("sout: Setup streams");
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    @DisplayName("System.out.print() und System.err.print() test")
    void test(){
        InputOutput coClass = new InputOutput();
        coClass.systemOutPrint("SYS-DEMO");
        coClass.systemErrPrint("ERR-DEMO");
        Assertions.assertEquals("SYS-DEMO", outContent.toString());
        Assertions.assertEquals("ERR-DEMO", errContent.toString());
    }

    @Test
    @DisplayName("True auf True Test")
    void test2(){
        Assertions.assertEquals(true, true);
    }

    @AfterEach
    void tearDown(){
        System.setOut(originOut);
        System.setErr(originErr);
        System.out.println("sout: unconfig streams done");
    }

}
