import org.greenSnake.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void getText(){
        String text = "Hello";
        String result = new Main().hello();
        Assertions.assertEquals(text,result);
    }
}
