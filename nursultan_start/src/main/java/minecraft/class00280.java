/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08724
 *  minecraft.class08730
 *  org.apache.commons.compress.archivers.tar.TarArchiveEntry
 *  org.apache.commons.compress.archivers.tar.TarArchiveOutputStream
 */
package minecraft;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;
import java.util.zip.GZIPOutputStream;
import minecraft.class08724;
import minecraft.class08730;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;

public class class00280 {
    private static final long N = 0x140000000L;
    private static final String y = "world";
    private final BooleanSupplier L;
    private final Path u;

    private class00280(Path path, BooleanSupplier booleanSupplier) {
        this.L = booleanSupplier;
        this.u = path;
    }

    private void N(long l) {
        if (l > 0x140000000L) {
            throw new class08724(0x140000000L);
        }
    }

    private void N(TarArchiveOutputStream tarArchiveOutputStream, Path path, String string, boolean bl) throws IOException {
        if (this.L.getAsBoolean()) {
            throw new class08730();
        }
        this.N(tarArchiveOutputStream.getBytesWritten());
        File file = path.toFile();
        String string2 = bl ? string : string + file.getName();
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(file, string2);
        tarArchiveOutputStream.putArchiveEntry(tarArchiveEntry);
        if (file.isFile()) {
            try (FileInputStream fileInputStream = new FileInputStream(file);){
                fileInputStream.transferTo((OutputStream)tarArchiveOutputStream);
            }
            tarArchiveOutputStream.closeArchiveEntry();
        } else {
            tarArchiveOutputStream.closeArchiveEntry();
            File[] fileArray = file.listFiles();
            if (fileArray != null) {
                for (File file2 : fileArray) {
                    this.N(tarArchiveOutputStream, file2.toPath(), string2 + "/", false);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private File N() throws IOException {
        try (TarArchiveOutputStream tarArchiveOutputStream = null;){
            File file = File.createTempFile("realms-upload-file", ".tar.gz");
            tarArchiveOutputStream = new TarArchiveOutputStream((OutputStream)new GZIPOutputStream(new FileOutputStream(file)));
            tarArchiveOutputStream.setLongFileMode(3);
            this.N(tarArchiveOutputStream, this.u, y, true);
            if (this.L.getAsBoolean()) {
                throw new class08730();
            }
            tarArchiveOutputStream.finish();
            this.N(file.length());
            File file2 = file;
            return file2;
        }
    }

    public static File N(Path path, BooleanSupplier booleanSupplier) throws IOException {
        return new class00280(path, booleanSupplier).N();
    }
}

