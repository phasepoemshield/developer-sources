import java.io.*;
import java.nio.file.*;

public final class TestEcDir {
    public static void main(String[] args) throws Exception {
        File dir = new File(".precompiled/sg/ec");
        System.out.println("exists=" + dir.exists() + " isDir=" + dir.isDirectory());
        File[] all = dir.listFiles();
        System.out.println("total files: " + (all == null ? "null" : all.length));
        if (all != null) {
            int nFiles = 0;
            for (File f : all) {
                if (f.getName().startsWith("N") && f.getName().endsWith(".class")) nFiles++;
            }
            System.out.println("N-prefixed: " + nFiles);
            // Show first 5
            int shown = 0;
            for (File f : all) {
                if (f.getName().startsWith("N") && shown < 5) {
                    System.out.println("  " + f.getName() + " " + f.length());
                    shown++;
                }
            }
        }
    }
}
