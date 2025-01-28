import org.junit.jupiter.api.*;

public class JUnitExamples {



    @Test
    void firstTest(){
        System.out.println("Here is firstTest()");
    }

    @Test
    @DisplayName("Here is da")
    void secondTest(){
        System.out.println("Here is secodTest()");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Here is beforeEach()");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("Here is afterall");
    }
    @AfterEach
    void afterEach(){
        System.out.println("Here is AfterEach");
    }

}
