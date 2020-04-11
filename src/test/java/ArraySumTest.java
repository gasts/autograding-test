package test.java;

import main.java.de.hems.ArraySum;
import org.junit.jupiter.api.*;


class ArraySumTest {


    @BeforeAll
    static void setUp() {
        System.out.println("############################################");
        System.out.println("############################################");
        System.out.println("ArraySumTest");
        System.out.println("############################################");
        System.out.println("############################################");
        System.out.println("Call BeforeAll");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("Call AfterAll");
    }

    @Test
    @DisplayName("create and size test")
    void t1() {
      ArraySum a = new ArraySum(10);
      a.createArray();
      Assertions.assertEquals(10,a.getSize());
      Assertions.assertEquals(10,a.getArray().length);
    }

    @Test
    @DisplayName("fill array")
    void t2(){
        System.out.println("sys: fill array with number 2");
        ArraySum a = new ArraySum(10);
        a.createArray();
        a.fill(10);
        Assertions.assertEquals(145,a.getSum());
    }
}
