import java.io.*;
import java.nio.file.*;

public final class TestFile {
    public static void main(String[] args) throws Exception {
        String[] paths = {
            "tools/sg_ec_rename_map.txt",
            "tools_out/sg_ec_rename_map.txt",
            "D:\\destra-backup\\tools\\sg_ec_rename_map.txt"
        };
        for (String p : paths) {
            File f = new File(p);
            System.out.println(p + " exists=" + f.exists() + " canRead=" + f.canRead());
        }
        File toolsDir = new File("tools");
        File[] fs = toolsDir.listFiles((d, n) -> n.contains("sg_ec"));
        System.out.println("tools/ sg_ec files: " + (fs == null ? "null" : fs.length));
        if (fs != null) for (File f : fs) System.out.println("  " + f.getName());
    }
}
