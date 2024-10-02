import java.nio.file.*;

public class RemoveJrtFs {
    public static void main(String[] args) throws Exception {
        Files.deleteIfExists(Paths.get("/usr/lib/jvm/java-17-openjdk-amd64/lib/jrt-fs.jar"));
    }
}