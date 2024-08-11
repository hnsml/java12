import org.example.Square;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    void testArea()
    {
        Square square = new Square(5);
        assertEquals(25, square.Area(), 0.001);
    }
}
