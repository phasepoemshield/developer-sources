/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class04200
 *  minecraft.class04209
 *  minecraft.class04213
 *  minecraft.class04215
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;
import java.util.zip.GZIPOutputStream;
import minecraft.class04200;
import minecraft.class04209;
import minecraft.class04213;
import minecraft.class04215;
import minecraft.class04231;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04242 {
    static final Logger N = LogUtils.getLogger();
    private static final int y = 4096;
    private static final String L = ".gz";
    private final Path u;
    private final String i;

    private class04242(Path path, String string) {
        this.u = path;
        this.i = string;
    }

    private static void N(ReadableByteChannel readableByteChannel, Path path) throws IOException {
        try (GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(Files.newOutputStream(path, new OpenOption[0]));){
            byte[] byArray = new byte[4096];
            ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
            while (readableByteChannel.read(byteBuffer) >= 0) {
                byteBuffer.flip();
                ((OutputStream)gZIPOutputStream).write(byArray, 0, byteBuffer.limit());
                byteBuffer.clear();
            }
        }
    }

    public class04209 N(LocalDate localDate) throws IOException {
        class04215 class042152;
        int n = 1;
        Set<class04215> set = this.N().L();
        while (set.contains(class042152 = new class04215(localDate, n++))) {
        }
        class04209 class042092 = new class04209(this.u.resolve(class042152.y(this.i)), class042152);
        Files.createFile(class042092.L(), new FileAttribute[0]);
        return class042092;
    }

    static void N(Path path, Path path2) throws IOException {
        if (Files.exists(path2, new LinkOption[0])) {
            throw new IOException("Compressed target file already exists: " + String.valueOf(path2));
        }
        try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.WRITE, StandardOpenOption.READ);){
            FileLock fileLock = fileChannel.tryLock();
            if (fileLock == null) {
                throw new IOException("Raw log file is already locked, cannot compress: " + String.valueOf(path));
            }
            class04242.N(fileChannel, path2);
            fileChannel.truncate(0L);
        }
        Files.delete(path);
    }

    public static class04242 N(Path path, String string) throws IOException {
        Files.createDirectories(path, new FileAttribute[0]);
        return new class04242(path, string);
    }

    private @Nullable class04200 N(Path path) {
        String string = path.getFileName().toString();
        int n = string.indexOf(46);
        if (n == -1) {
            return null;
        }
        class04215 class042152 = class04215.N((String)string.substring(0, n));
        if (class042152 != null) {
            String string2 = string.substring(n);
            if (string2.equals(this.i)) {
                return new class04209(path, class042152);
            }
            if (string2.equals(this.i + L)) {
                return new class04213(path, class042152);
            }
        }
        return null;
    }

    public class04231 N() throws IOException {
        try (Stream<Path> stream = Files.list(this.u);){
            class04231 class042312 = new class04231(stream.filter(path -> Files.isRegularFile(path, new LinkOption[0])).map(this::N).filter(Objects::nonNull).toList());
            return class042312;
        }
    }
}

