import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinksFile() throws IOException {
        MarkdownParse test1 = new MarkdownParse();
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);

        ArrayList<String> result = test1.getLinks(content);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(expected, result);
    }

    @Test
    public void getLinksFile2() throws IOException {
        MarkdownParse test1 = new MarkdownParse();
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);

        ArrayList<String> result = test1.getLinks(content);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(expected, result);
    }

    @Test
    public void getLinksFile3() throws IOException {
        MarkdownParse test1 = new MarkdownParse();
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);

        ArrayList<String> result = test1.getLinks(content);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://something.com");
        expected.add("some-thing.asdf");
        assertEquals(expected, result);
    }

    @Test
    public void getLinksFile4() throws IOException {
        MarkdownParse test1 = new MarkdownParse();
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);

        ArrayList<String> result = test1.getLinks(content);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://something.com");
        expected.add("some-thing.asdf");
        assertEquals(expected, result);
    }

    @Test
    public void getLinksFile5() throws IOException {
        MarkdownParse test1 = new MarkdownParse();
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);

        ArrayList<String> result = test1.getLinks(content);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://something.com");
        expected.add("some-thing.asdf");
        assertEquals(expected, result);
    }

    @Test
    public void snippet1Test() throws IOException {
        MarkdownParse snippet1 = new MarkdownParse();
        Path fileName = Path.of("snippet1.md");
        String content = Files.readString(fileName);
        ArrayList<String> result = snippet1.getLinks(content);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("'google.com");
        assertEquals(expected, result);
    }

    @Test
    public void snippet2Test() throws IOException {
        MarkdownParse snippet2 = new MarkdownParse();
        Path fileName = Path.of("snippet2.md");
        String content = Files.readString(fileName);
        ArrayList<String> result = snippet2.getLinks(content);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("a.com");
        expected.add("a.com(())");
        expected.add("example.com");
        assertEquals(expected, result);
    }

    @Test
    public void snippet3Test() throws IOException {
        MarkdownParse snippet3 = new MarkdownParse();
        Path fileName = Path.of("snippet3.md");
        String content = Files.readString(fileName);
        ArrayList<String> result = snippet3.getLinks(content);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
        assertEquals(expected, result);
    } 
}