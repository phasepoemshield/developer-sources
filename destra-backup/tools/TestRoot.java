import java.io.*;

public final class TestRoot {
    public static void main(String[] args) throws Exception {
        File f1 = new File("sg_ec_map_cmd.txt");
        File f2 = new File("D:\\destra-backup\\sg_ec_map_cmd.txt");
        System.out.println("relative: " + f1.exists() + " " + f1.getAbsolutePath());
        System.out.println("absolute: " + f2.exists());
        File root = new File(".");
        System.out.println("root dir: " + root.getAbsolutePath());
        File[] fs = root.listFiles((d, n) -> n.contains("sg_ec"));
        System.out.println("root sg_ec: " + (fs == null ? "null" : fs.length));
        if (fs != null) for (File f : fs) System.out.println("  " + f.getName());
    }
}
