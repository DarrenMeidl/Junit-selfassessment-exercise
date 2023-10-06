import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FizzbuzzTest {
    @Test
    void numEqualsFive() {
        System.out.println("TEST 1: Num = 5");
        int num = 5;
        String expected = "buzz";
        Fizzbuzz f = new Fizzbuzz();
        String actual = f.fizzBuzz(num);
        assertEquals(expected, actual);
        System.out.println("EXPECTED: "+expected+" ACTUAL: " + actual);
        System.out.println("");
    }
    @Test
    void numEqualsThree() {
        System.out.println("TEST 2: Num = 3");
        int num = 3;
        String expected = "fizz";
        Fizzbuzz f = new Fizzbuzz();
        String actual = f.fizzBuzz(num);
        assertEquals(expected, actual);
        System.out.println("EXPECTED: "+expected+" ACTUAL: " + actual);
        System.out.println("");
    }
    @Test
    void numEqualsFifteen() {
        System.out.println("TEST 3: Num = 15");
        int num = 15;
        String expected = "fizzbuzz";
        Fizzbuzz f = new Fizzbuzz();
        String actual = f.fizzBuzz(num);
        assertEquals(expected, actual);
        System.out.println("EXPECTED: "+expected+" ACTUAL: " + actual);
        System.out.println("");
    }

    @Test
    void numEqualsMinusThirty() {
        System.out.println("TEST 4: Num = -30");
        int num = -30;
        String expected = "fizzbuzz";
        Fizzbuzz f = new Fizzbuzz();
        String actual = f.fizzBuzz(num);
        assertEquals(expected, actual);
        System.out.println("EXPECTED: "+expected+" ACTUAL: " + actual);
        System.out.println("");
    }

    @Test
    void numEqualsZero() {
        System.out.println("TEST 5: Num = 0");
        int num = 0;
        String expected = "fizzbuzz";
        Fizzbuzz f = new Fizzbuzz();
        String actual = f.fizzBuzz(num);
        assertEquals(expected, actual);
        System.out.println("EXPECTED: "+expected+" ACTUAL: " + actual);
        System.out.println("");
    }

    @Test
    void numEqualsFour() {
        System.out.println("TEST 6: Num = 4");
        int num = 4;
        String expected = "4";
        Fizzbuzz f = new Fizzbuzz();
        String actual = f.fizzBuzz(num);
        assertEquals(expected, actual);
        System.out.println("EXPECTED: "+expected+" ACTUAL: " + actual);
        System.out.println("");
    }

    @Test
    void numEqualsMinusSeven() {
        System.out.println("TEST 7: Num = -7");
        int num = -7;
        String expected = "-7";
        Fizzbuzz f = new Fizzbuzz();
        String actual = f.fizzBuzz(num);
        assertEquals(expected, actual);
        System.out.println("EXPECTED: "+expected+" ACTUAL: " + actual);
        System.out.println("");
    }
}