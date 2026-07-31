import java.io.*;

public final class ListToolsOut {
    public static void main(String[] args) throws Exception {
        File dir = new File("tools_out");
        System.out.println("exists=" + dir.exists() + " isDir=" + dir.isDirectory());
        File[] files = dir.listFiles();
        System.out.println("listFiles count: " + (files == null ? "null" : files.length));
        if (files != null) {
            for (File f : files) {
                System.out.println("  " + f.getName() + " " + f.length());
            }
        }
    }
}
