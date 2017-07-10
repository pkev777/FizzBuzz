import org.junit.Test;

import java.util.Map;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @autor Yevhen Kalinichenko
 */
public class FizzBuzzSolutionTest {

    @Test
    public void testFizzBuzzSolutionsShouldBeEqualsToNumbersInRange() {
        // GIVEN
        final int startInclusive  = 1;
        final int endExclusive = 50;
        final int expectedCount = endExclusive - startInclusive;
        final FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution(startInclusive, endExclusive);

        // WHEN
        Map<Integer, String> solutions = fizzBuzzSolution.solve();

        // THEN
        assertThat("Solutions size should be equals numbers in range", solutions.size(), equalTo(expectedCount));
    }

    @Test
    public void testFizzSolutions() {
        // GIVEN
        final FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution(1, 100);

        // WHEN
        Map<Integer, String> solutions = fizzBuzzSolution.solve();

        // THEN
        assertThat("Number \"3\" should be marked with Fizz", solutions.get(3), equalTo("Fizz"));
        assertThat("Number \"5\" should be marked with Buzz", solutions.get(5), equalTo("Buzz"));
        assertThat("Number \"15\" should be marked with FizzBuzz", solutions.get(15), equalTo("FizzBuzz"));
        assertThat("Number \"7\" shouldn't be marked", solutions.get(7), equalTo("7"));
    }
}