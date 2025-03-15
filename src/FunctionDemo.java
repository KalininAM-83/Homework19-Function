import java.util.function.Function;

public class FunctionDemo implements Function<Integer, String> {
    @Override
    public String apply(Integer integer) {
        if (integer < 0) {
            return "Отрицательное число";
        }
        if (integer == 0) {
            return "Ноль";
        }
        if (integer > 0) {
            return "Положительное число";
        }
        return "";
    }
}
