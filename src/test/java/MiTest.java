import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MiTest {

    @Test
    public void testSaludar() {
        Main main = new Main();
        main.saludar();
    }

    @Test
    public void testSuma() {
        Assertions.assertEquals(7, new Main().sumar(3, 4));
    }

    @Test
    public void testSumaError() {
        Assertions.assertNotEquals(5, new Main().sumar(2, 2));
    }
}
