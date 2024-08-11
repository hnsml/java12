import org.example.Rhombus;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class RhombusTest {

    @Test
    void testArea()
    {
        Rhombus rhombus = new Rhombus(10, 12);
        assertEquals(60, rhombus.Area(), 0.001);
    }

}
