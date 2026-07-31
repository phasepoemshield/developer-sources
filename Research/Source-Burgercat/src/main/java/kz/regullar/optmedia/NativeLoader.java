//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package kz.regullar.optmedia;

import com.sun.jna.Native;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Map;

public final class NativeLoader {
    private static boolean initialized = false;
    public static MediaLibrary INSTANCE;

    private NativeLoader() {
    }

    public static synchronized void load() {
        if (initialized) {
            return;
        }

        // J2cMedia.dll — Windows native. На macOS/Linux повторные Native.load
        // заливают latest.log (мегабайты UnsatisfiedLinkError каждый тик MediaPlayer).
        String os = System.getProperty("os.name", "").toLowerCase(java.util.Locale.ROOT);
        if (!os.contains("win")) {
            initialized = true;
            INSTANCE = null;
            return;
        }

        try {
            try (InputStream in = NativeLoader.class.getResourceAsStream("/data/J2cMedia.dll")) {
                if (in == null) {
                    throw new IllegalStateException("J2cMedia.dll not found in resources (/assets/J2cMedia.dll)");
                }

                Path tmp = Files.createTempFile("OptMedia1111", ".dll");
                tmp.toFile().deleteOnExit();
                Files.copy(in, tmp, new CopyOption[]{StandardCopyOption.REPLACE_EXISTING});
                Map<String, Object> options = new HashMap();
                INSTANCE = (MediaLibrary)Native.load(tmp.toAbsolutePath().toString(), MediaLibrary.class, options);
                initialized = true;
                System.out.println("[NativeLoader] Loaded native library from: " + String.valueOf(tmp.toAbsolutePath()));
            }

        } catch (UnsatisfiedLinkError ule) {
            initialized = true;
            throw new RuntimeException("Failed to load native J2cMedia.dll (UnsatisfiedLinkError): " + ule.getMessage(), ule);
        } catch (IOException ioe) {
            initialized = true;
            throw new RuntimeException("Failed to extract/load J2cMedia.dll from resources", ioe);
        } catch (Throwable t) {
            initialized = true;
            throw new RuntimeException("Unexpected error while loading native library: " + t.getMessage(), t);
        }
    }
}
