import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    Anagram anagram;

    @Before
    public void setup() {
        anagram = new Anagram();
    }

    @Test
    public void isStringsAnagramms_test() {
        boolean expected = true;
        boolean actual = anagram.isStringsAnagramms("apple", "apple");
        assertEquals(expected, actual);
    }

    @Test
    public void isStringsAnagramms_oneStringIsLonger() {
        boolean expected = false;
        boolean actual = anagram.isStringsAnagramms("house", "corporation");
        assertEquals(expected, actual);
    }

    @Test
    public void isStringsAnagramms_oneStringIs() {
        boolean expected = false;
        boolean actual = anagram.isStringsAnagramms("", "dog");
    }

}