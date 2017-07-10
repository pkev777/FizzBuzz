import java.util.Objects;

/**
 * @autor Yevhen Kalinichenko
 */
public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = FIZZ + BUZZ;

    private final int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String getSolution() {
        final String solution;

        if (number % 3 == 0 && number % 5 == 0) {
            solution = FIZZ_BUZZ;
        } else if (number % 3 == 0) {
            solution = FIZZ;
        } else if (number % 5 == 0) {
            solution = BUZZ;
        } else {
            solution = String.valueOf(number);
        }

        return solution;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("FizzBuzz{");
        sb.append("number=").append(number);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FizzBuzz fizzBuzz = (FizzBuzz) o;
        return number == fizzBuzz.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
