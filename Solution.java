import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws IOException {
        Files.lines(Paths.get("c:/java/txt.txt"), StandardCharsets.UTF_8).forEach(System.out::println);}
    }