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
        assertEquals(0, tester.multiply(10, 0), "10 x 0 must be 0");
    }

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero_4() {
        SampleClass tester = new SampleClass(); // MyClass is tested

        // assert statements
        assertEquals(0, tester.multiply(-1, 0), "10 x 0 must be 0");
    }

    @Test
    // failing test
    public void multiplicationOfZeroIntegersShouldReturnZero_5() {
        SampleClass tester = new SampleClass(); // MyClass is tested

        // assert statements
        assertEquals(10, tester.multiply(10, 10), "0 x 0 must be 0");
    }
}