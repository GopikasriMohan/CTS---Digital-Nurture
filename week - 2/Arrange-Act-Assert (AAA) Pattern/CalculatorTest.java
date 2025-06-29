import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
}

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void setUp() {
        // Setup: runs before each test
        calculator = new Calculator();
        System.out.println("Setup executed");
    }

    @AfterEach
    public void tearDown() {
        // Teardown: runs after each test
        calculator = null;
        System.out.println("Teardown executed");
    }

    @Test
    public void testAddition() {
        // Arrange
        int a = 10;
        int b = 5;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {
        // Arrange
        int a = 10;
        int b = 5;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(5, result);
    }
}
