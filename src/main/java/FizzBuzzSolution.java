import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @autor Yevhen Kalinichenko
 */
public class FizzBuzzSolution {

    private final int startInclusive;
    private final int endExclusive;

    public FizzBuzzSolution(int from, int to) {
        this.startInclusive = from;
        this.endExclusive = to;
    }

    public List<String> solve() {
        return IntStream.range(startInclusive, endExclusive)
                .mapToObj(FizzBuzz::new)
                .map(FizzBuzz::getSolution)
                .collect(Collectors.toList());
    }

}
