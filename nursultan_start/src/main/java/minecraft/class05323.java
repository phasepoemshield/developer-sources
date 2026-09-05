/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10507
 *  minecraft.class06290
 */
package minecraft;

import Nursultan.class10507;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.nio.file.AccessDeniedException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import minecraft.class06290;

public class class05323
implements AutoCloseable {
    public static final String N = "session.lock";
    private final FileChannel y;
    private final FileLock L;
    private static final ByteBuffer u;

    private class05323(FileChannel fileChannel, FileLock fileLock) {
        this.y = fileChannel;
        this.L = fileLock;
    }

    static {
        byte[] byArray = "\u2603".getBytes(StandardCharsets.UTF_8);
        u = ByteBuffer.allocateDirect(byArray.length);
        u.put(byArray);
        u.flip();
    }

    @Override
    public void close() throws IOException {
        try {
            if (this.L.isValid()) {
                this.L.release();
            }
        }
        finally {
            if (this.y.isOpen()) {
                this.y.close();
            }
        }
    }

    /*
     * Enabled aggressive exception aggregation
     */
    public static boolean y(Path path) throws IOException {
        Path path2 = path.resolve(N);
        try (FileChannel fileChannel = FileChannel.open(path2, StandardOpenOption.WRITE);){
            boolean bl;
            block15: {
                FileLock fileLock = fileChannel.tryLock();
                try {
                    boolean bl2 = bl = fileLock == null;
                    if (fileLock == null) break block15;
                }
                catch (Throwable throwable) {
                    if (fileLock != null) {
                        try {
                            fileLock.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                fileLock.close();
            }
            return bl;
        }
        catch (AccessDeniedException accessDeniedException) {
            return true;
        }
        catch (NoSuchFileException noSuchFileException) {
            return false;
        }
    }

    public static class05323 N(Path path) throws IOException {
        Path path2 = path.resolve(N);
        class06290.L((Path)path);
        FileChannel fileChannel = FileChannel.open(path2, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        try {
            fileChannel.write(u.duplicate());
            fileChannel.force(true);
            FileLock fileLock = fileChannel.tryLock();
            if (fileLock == null) {
                throw class10507.N((Path)path2);
            }
            return new class05323(fileChannel, fileLock);
        }
        catch (IOException iOException) {
            try {
                fileChannel.close();
            }
            catch (IOException iOException2) {
                iOException.addSuppressed(iOException2);
            }
            throw iOException;
        }
    }

    public boolean N() {
        return this.L.isValid();
    }
}

