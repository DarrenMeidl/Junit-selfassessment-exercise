import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FizzbuzzTest {
    @Test
    void numEqualsFive() {
        int num = 5;
        String expected = "buzz";
        Fizzbuzz f = new Fizzbuzz();
        String actual = f.fizzBuzz(num);
        assertEquals(expected, actual);
    }
}