import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testCalculate() {
        List<Float> numbers = new ArrayList<>();
        numbers.add(5.0f);
        numbers.add(3.0f);
        List<String> operations = new ArrayList<>();
        operations.add("+");
        Calculator.Calculate(numbers, operations);
        assertEquals(8.0f, Calculator.finalResult);
      
    }
}
