import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Triangle;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void testArea()
    {
        Triangle triangle = new Triangle(10, 5);
        assertEquals(25, triangle.Area(), 0.001);
    }
}
