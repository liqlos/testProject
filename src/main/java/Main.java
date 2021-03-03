import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> namesList = new ArrayList<>() {{
            add("Bob");
            add("Alice");
            add("Joe");
            add("bob");
            add("alice");
            add("dEN");
        }};

        StringUtils.printSortedCounting(namesList);
    }
}
