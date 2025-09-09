import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class FileInputAndOutput {

    public static void main(String[] args) throws IOException {
        String dir = System.getProperty("user.dir");
        System.out.println(dir);

        PrintWriter out = new PrintWriter("myfile.txt",
                StandardCharsets.UTF_8);

        Scanner in = new Scanner(Path.of(
                "myfile.txt"),
                StandardCharsets.UTF_8);
    }

}
