/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

@FunctionalInterface
public interface class03652<T> {
    public T get() throws IOException;

    public static class03652<InputStream> N(ZipFile zipFile, ZipEntry zipEntry) {
        return () -> zipFile.getInputStream(zipEntry);
    }

    public static class03652<InputStream> N(Path path) {
        return () -> Files.newInputStream(path, new OpenOption[0]);
    }
}

