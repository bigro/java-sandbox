import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

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

    @Test
    public void resolveSiblingの挙動() throws Exception {
        Path path = Paths.get("src/test/resources/test.txt");
        assertThat(path.toString()).isEqualTo("src/test/resources/test.txt");

        // resolveSiblingはPathの末端だけ変更できるっぽい
        Path path1 = path.resolveSibling("hoge.txt");
        assertThat(path1.toString()).isEqualTo("src/test/resources/hoge.txt");
    }
}
