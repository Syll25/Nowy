import org.example.Main;
import org.junit.Test;
import static org.junit.Assert.*;

public class FirstTest {

    @Test
    public void testFooBarLogic() {
        Main main = new Main();

        assertEquals("FooBar", main.fooBar(15));

        assertEquals("Foo", main.fooBar(9));

        assertEquals("Bar", main.fooBar(10));

        assertEquals("i = 7", main.fooBar(7));
    }
}
