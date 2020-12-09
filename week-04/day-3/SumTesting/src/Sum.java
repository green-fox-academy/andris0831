
import java.util.ArrayList;
import java.util.List;

public class Sum {

    public Integer sumOfElements(List<Integer> elements) throws IllegalArgumentException {
        if (elements == null) {
            throw new IllegalArgumentException();
        }
        Integer sum = 0;
        for (Integer element : elements) {
                sum += element;
            }
                return sum;
        }
    }


