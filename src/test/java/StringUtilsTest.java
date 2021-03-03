import org.junit.jupiter.api.*;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

class StringUtilsTest {

    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final PrintStream originalOutStream = System.out;

    @BeforeAll
    public static void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void printSortedCountingTest() {

        List<String> testList = new ArrayList<>() {{
            add("Bob");
            add("Alice");
            add("Joe");
            add("bob");
            add("alice");
            add("dEN");
        }};

        String expectedOut = "{Alice=2, Bob=2, Den=1, Joe=1}\n";

        StringUtils.printSortedCounting(testList);
        Assertions.assertEquals(expectedOut.trim(), outContent.toString().trim());
    }

    @AfterAll
    public static void restoreStream() {
        System.setOut(originalOutStream);
    }


}