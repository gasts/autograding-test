package test.java;

import main.java.de.hems.ConsoleOutput;
import org.junit.jupiter.api.*;


class ConsoleOutputTest {

    ConsoleOutput outputClass;

    @BeforeEach
    void setUp() {
        outputClass = new ConsoleOutput();
    }

    @AfterAll
    static void tearDown() {
        System.out.println("fin!");
    }

    @Test
    @DisplayName("Positive Parameter")
    void add1() {
        System.out.println("add(5,5) -> 10");
        Assertions.assertEquals(10,outputClass.add(5,5));
    }

    @Test
    @DisplayName("Negative Parameter")
    void add2(){
        System.out.println("add(-1,-10) -> -11");
        Assertions.assertEquals(-11, outputClass.add(-1,-10));
    }

    @Test
    @DisplayName("Mixed Parameter")
    void add3(){
        System.out.println("add(10,-5) - > 5");
        Assertions.assertEquals(5, outputClass.add(10,-5));
    }
}