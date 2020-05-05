import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTests {

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero_1() {
        SampleClass tester = new SampleClass(); // MyClass is tested

        // assert statements
        assertEquals(0, tester.multiply(10, 0), "10 x 0 must be 0");
    }

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero_2() {
        SampleClass tester = new SampleClass(); // MyClass is tested

        // assert statements
        assertEquals(0, tester.multiply(0, 10), "0 x 10 must be 0");
    }

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero_3() {
        SampleClass tester = new SampleClass(); // MyClass is tested

        // assert statements
        assertEquals(0, tester.multiply(0, 0), "0 x 0 must be 0");
    }
}