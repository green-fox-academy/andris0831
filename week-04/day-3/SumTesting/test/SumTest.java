import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {

    Sum sum;


    @Before
    public void setup() {
        sum = new Sum();
    }

    @Test
    public void sumOfElements_test() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        Integer expected = 15;
        Integer actual = sum.sumOfElements(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void sumOfElements_test2() {
        List<Integer> numbers = new ArrayList<>();
        Integer expected = 0;
        Integer actual = sum.sumOfElements(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void sumOfElements_test3() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        Integer expected = 3;
        Integer actual = sum.sumOfElements(numbers);
        assertEquals(expected, actual);
    }

    @Test (expected = IllegalArgumentException.class)
    public void sumOfElements_test4() {
        sum.sumOfElements(null);
    }
}