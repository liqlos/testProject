import java.util.*;
import java.util.stream.Collectors;

public class StringUtils {
//TODO: проверка на null, stringBuilder, джавадоки, тесты. Вопрос по условиям: для символов нелатинского алфавита что делать с регистром букв?

    private static List<String> onlyFirstCapital(List<String> list) {
        list = list.stream().map(e -> e.substring(0, 1).toUpperCase() + e.substring(1).toLowerCase())
                .collect(Collectors.toList());
        return list;
    }

    private static TreeMap<String, Long> countDoublesAndSort(List<String> list) {
        Map<String, Long> counted = list.stream().collect(Collectors.groupingBy(k -> k, Collectors.counting()));
        return new TreeMap<>(counted);
    }

    public static void testTask(List<String> list) {
        list = onlyFirstCapital(list);
        System.out.println(countDoublesAndSort(list));
    }
}
