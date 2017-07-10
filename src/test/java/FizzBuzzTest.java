import org.junit.Test;

import static java.lang.String.valueOf;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @autor Yevhen Kalinichenko
 */
public class FizzBuzzTest {

    @Test
    public void testFizz() {
        //GIVEN
        final FizzBuzz fizzBuzz = new FizzBuzz(3);
        final String FIZZ = "Fizz";

        //WHEN
        String solution = fizzBuzz.getSolution();

        //THEN
        assertThat("Expected that solution will be: " + FIZZ, solution, equalTo(FIZZ));
    }

    @Test
    public void testBuzz() {
        //GIVEN
        final FizzBuzz fizzBuzz = new FizzBuzz(5);
        final String BUZZ = "Buzz";

        //WHEN
        String solution = fizzBuzz.getSolution();

        //THEN
        assertThat("Expected that solution will be: " + BUZZ, solution, equalTo(BUZZ));
    }

    @Test
    public void testFizzBuzz() {
        //GIVEN
        final FizzBuzz fizzBuzz = new FizzBuzz(15);
        final String FIZZ_BUZZ = "FizzBuzz";

        //WHEN
        String solution = fizzBuzz.getSolution();

        //THEN
        assertThat("Expected that solution will be: " + FIZZ_BUZZ, solution, equalTo(FIZZ_BUZZ));
    }

    @Test
    public void testOtherNumber() {
        //GIVEN
        final int number = 16;
        final FizzBuzz fizzBuzz = new FizzBuzz(number);

        //WHEN
        String solution = fizzBuzz.getSolution();

        //THEN
        assertThat("Expected that solution will be: " + number, solution, equalTo(valueOf(number)));
    }
}