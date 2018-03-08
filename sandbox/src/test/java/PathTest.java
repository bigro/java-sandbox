import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {

    @Test
    public void Pathでgetできる色々() throws Exception {
        Path path = Paths.get("src/test/resources/test.txt");
        System.out.println("toString: " + path.toString());
        System.out.println("FileName: " + path.getFileName());
        System.out.println("FileSystem: " + path.getFileSystem());
        System.out.println("NameCount: " + path.getNameCount());
        System.out.println("Parent: " + path.getParent());
        System.out.println("Root: " + path.getRoot());
    }
}
