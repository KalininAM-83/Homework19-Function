import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(-12, 3, 75, 0, -8);
        System.out.println("\nУзнаем тип каждого числа из нашего списка через отельный класс");
        list
                .stream()
                .map(new FunctionDemo())
                .forEach(System.out::println);

        System.out.println("\nУзнаем тип каждого числа из нашего списка через анонимную функцию");
        list
                .stream()
                .map(integer -> {
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
                })
                .forEach(System.out::println);
    }
}
