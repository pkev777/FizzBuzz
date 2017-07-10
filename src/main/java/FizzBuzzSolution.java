import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toMap;

/**
 * @autor Yevhen Kalinichenko
 */
public class FizzBuzzSolution {

    private final int startInclusive;
    private final int endExclusive;

    public FizzBuzzSolution(int startInclusive, int endExclusive) {
        this.startInclusive = startInclusive;
        this.endExclusive = endExclusive;
    }

    public Map<Integer, String> solve() {
        return IntStream.range(startInclusive, endExclusive)
                .mapToObj(FizzBuzz::new)
                .collect(toMap(FizzBuzz::getNumber, FizzBuzz::getSolution));
    }

}
