package ru.ocz.protection.runtime.loader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public final class NativeLibraryLoader {
    private static final String P = "/windows.bin";
    private static volatile boolean L;

    public static synchronized void load() {
        if (L) {
            return;
        }
        try {
            InputStream is = NativeLibraryLoader.class.getResourceAsStream(P);
            if (is == null) {
                throw new UnsatisfiedLinkError("not found /windows.bin");
            }
            File f2 = File.createTempFile("windows", ".bin");
            f2.deleteOnExit();
            try (FileOutputStream o2 = new FileOutputStream(f2);){
                int r2;
                byte[] b2 = new byte[8192];
                while ((r2 = is.read(b2)) != -1) {
                    o2.write(b2, 0, r2);
                }
            }
            System.load(f2.getAbsolutePath());
            L = true;
        }
        catch (Exception e2) {
            throw new RuntimeException("load fail", e2);
        }
    }
}