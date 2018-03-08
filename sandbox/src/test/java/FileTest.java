import org.junit.Test;

import java.io.File;

public class FileTest {

    @Test
    public void Fileでgetできる色々() throws Exception {
        File file = new File("src/test/resources/test.txt");
        System.out.println("toString: " + file.toString());
        System.out.println("Path: " + file.getPath());
        System.out.println("Parent: " + file.getParent());
        System.out.println("AbsolutePath: " + file.getAbsolutePath());
        System.out.println("CanonicalPath: " + file.getCanonicalPath());
        System.out.println("Name: " + file.getName());
        System.out.println("AbsoluteFile: " + file.getAbsoluteFile());
        System.out.println("CanonicalFile: " + file.getCanonicalFile());
        System.out.println("FreeSpace: " + file.getFreeSpace());
        System.out.println("ParentFile: " + file.getParentFile());
        System.out.println("TotalSpace: " + file.getTotalSpace());
        System.out.println("UsableSpace: " + file.getUsableSpace());
    }
}
