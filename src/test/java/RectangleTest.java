import org.example.Rectangle;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    void testArea()
    {
        Rectangle rectangle = new Rectangle(14, 7);
        assertEquals(98, rectangle.Area(), 0.001);
    }

}
