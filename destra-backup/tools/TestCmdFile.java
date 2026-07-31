import java.io.*;

public final class TestCmdFile {
    public static void main(String[] args) throws Exception {
        String[] paths = {"testfile_cmd.txt", "D:\\destra-backup\\testfile_cmd.txt"};
        for (String p : paths) {
            File f = new File(p);
            System.out.println(p + " exists=" + f.exists() + " len=" + f.length());
        }
        File root = new File(".");
        File[] all = root.listFiles();
        System.out.println("total in '.': " + (all == null ? "null" : all.length));
        if (all != null) {
            for (File f : all) {
                if (f.getName().contains("test") || f.getName().contains("map")) {
                    System.out.println("  " + f.getName() + " " + f.length());
                }
            }
        }
    }
}
