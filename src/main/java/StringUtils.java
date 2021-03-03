import java.util.*;
import java.util.stream.Collectors;

public class StringUtils {

    /**
     * @param list list of strings
     * @return list of strings where each string starts from capital letter
     * and other letters in lower case
     * if there is a possibility of space as first letter, you need to add trim() before substring methods
     */
    private static List<String> onlyFirstCapital(List<String> list) {
        list = list.stream().map(e -> e.substring(0, 1).toUpperCase() + e.substring(1).toLowerCase())
                .collect(Collectors.toList());
        return list;
    }

    /**
     * @param list list of strings
     * @return treemap sorted by keys where key is string from input list
     * and value is number of its repetitions in input list
     */
    private static TreeMap<String, Long> countDoublesAndSort(List<String> list) {
        Map<String, Long> counted = list.stream().collect(Collectors.groupingBy(k -> k, Collectors.counting()));
        return new TreeMap<>(counted);
    }

    /**
     * @param list list of strings
     * prints to console elements from list and number of its repetitions(case insensitive)
     * sorted in lexicographic order
     * displayed with first capital letter and the rest lower case
     */
    public static void printSortedCounting(List<String> list) {
        list = onlyFirstCapital(list);
        System.out.println(countDoublesAndSort(list));
    }
}
