/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.junit.Test;

import java.io.FileInputStream;
import java.util.Properties;

public class SystemPropertyTest {
    @Test
    public void SystemPropertyを取得するよ() throws Exception {
        System.out.println("file.separator: " + System.getProperty("file.separator"));
        System.out.println("java.class.path: " + System.getProperty("java.class.path"));
        System.out.println("java.home: " + System.getProperty("java.home"));
        System.out.println("java.vendor: " + System.getProperty("java.vendor"));
        System.out.println("java.vendor.url: " + System.getProperty("java.vendor.url"));
        System.out.println("java.version: " + System.getProperty("java.version"));
        System.out.println("line.separator: " + System.getProperty("line.separator"));
        System.out.println("os.arch: " + System.getProperty("os.name"));
        System.out.println("os.version: " + System.getProperty("os.version"));
        System.out.println("path.separator: " + System.getProperty("path.separator"));
        System.out.println("user.dir: " + System.getProperty("user.dir"));
        System.out.println("user.home: " + System.getProperty("user.homer"));
        System.out.println("user.name: " + System.getProperty("user.name"));
    }

    @Test
    public void SystemPropertyをファイルから追加するよ() throws Exception {
        FileInputStream propFile = new FileInputStream( "myProperties.txt");
        // 最初にデフォルトのSystemPropertyを取得してPropertiesをインスタンス化する。
        // new Properties() のような書き方もできてしまうので、SystemPropertyが全部吹っ飛ばないように注意。　
        Properties p = new Properties(System.getProperties());
        // これでデフォルトにmyProperties.txtに記述したプロパティが追加された形になる。
        p.load(propFile);

        // PropertiesインスタンスをSystemPropertyとしてセットする。
        System.setProperties(p);

        // プロパティの一覧を表示する。
        System.getProperties().list(System.out);

        // 追加したプロパティで値が取得できる。
        System.out.println(System.getProperty("subliminal.message"));
    }
}
