/**
 * @autor Yevhen Kalinichenko
 */
public class PrintableFizzBuzzSolution {

    private final FizzBuzzSolution fizzBuzzSolution;

    public PrintableFizzBuzzSolution(FizzBuzzSolution fizzBuzzSolution) {
        this.fizzBuzzSolution = fizzBuzzSolution;
    }

    public void print() {
        fizzBuzzSolution.solve().forEach(System.out::println);
    }

    public static void main(String[] args) {
        PrintableFizzBuzzSolution printableFizzBuzzSolution = new PrintableFizzBuzzSolution(new FizzBuzzSolution(1, 100));
        printableFizzBuzzSolution.print();
    }

}
