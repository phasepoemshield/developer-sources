/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10739
 *  Nursultan.class10741
 *  com.mojang.logging.LogUtils
 *  minecraft.class01834
 *  minecraft.class01894
 *  minecraft.class02277
 *  minecraft.class05495
 *  minecraft.class05530
 *  minecraft.class07321
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10739;
import Nursultan.class10741;
import com.mojang.logging.LogUtils;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import minecraft.class01834;
import minecraft.class01894;
import minecraft.class02277;
import minecraft.class05495;
import minecraft.class05530;
import minecraft.class07321;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class07357
implements AutoCloseable {
    private static final Logger i = LogUtils.getLogger();
    private static final int R = 4096;
    protected static final int N = 1024;
    private static final int M = 5;
    private static final int B = 0;
    private static final ByteBuffer Z = ByteBuffer.allocateDirect(1);
    private static final String z = ".mcc";
    private static final int U = 128;
    private static final int E = 256;
    private static final int W = 0;
    public final class02277 y;
    private final Path m;
    private final FileChannel P;
    private final Path s;
    public final class05530 L;
    private final ByteBuffer T = ByteBuffer.allocateDirect(8192);
    private final IntBuffer b;
    private final IntBuffer j;
    protected final class05495 u = new class05495();

    private static int L() {
        return (int)(class07536.i() / 1000L);
    }

    private static int L(int n) {
        return (n + 4096 - 1) / 4096;
    }

    public DataOutputStream L(class07321 class073212) throws IOException {
        return new DataOutputStream(this.L.N((OutputStream)new class10739(this, class073212)));
    }

    private int M(class07321 class073212) {
        return this.b.get(class07357.B(class073212));
    }

    public class07357(class02277 class022772, Path path, Path path2, boolean bl) throws IOException {
        this(class022772, path, path2, class05530.N(), bl);
    }

    public class07357(class02277 class022772, Path path, Path path2, class05530 class055302, boolean bl) throws IOException {
        this.y = class022772;
        this.m = path;
        this.L = class055302;
        if (!Files.isDirectory(path2, new LinkOption[0])) {
            throw new IllegalArgumentException("Expected directory, got " + String.valueOf(path2.toAbsolutePath()));
        }
        this.s = path2;
        this.b = this.T.asIntBuffer();
        this.b.limit(1024);
        this.T.position(4096);
        this.j = this.T.asIntBuffer();
        this.P = bl ? FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.DSYNC) : FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE);
        this.u.N(0, 2);
        this.T.position(0);
        int n = this.P.read(this.T, 0L);
        if (n != -1) {
            if (n != 8192) {
                i.warn("Region file {} has truncated header: {}", (Object)path, (Object)n);
            }
            long l = Files.size(path);
            for (int i = 0; i < 1024; ++i) {
                int n2 = this.b.get(i);
                if (n2 == 0) continue;
                int n3 = class07357.y(n2);
                int n4 = class07357.N(n2);
                if (n3 < 2) {
                    class07357.i.warn("Region file {} has invalid sector at index: {}; sector {} overlaps with header", new Object[]{path, i, n3});
                    this.b.put(i, 0);
                    continue;
                }
                if (n4 == 0) {
                    class07357.i.warn("Region file {} has an invalid sector at index: {}; size has to be > 0", (Object)path, (Object)i);
                    this.b.put(i, 0);
                    continue;
                }
                if ((long)n3 * 4096L > l) {
                    class07357.i.warn("Region file {} has an invalid sector at index: {}; sector {} is out of bounds", new Object[]{path, i, n3});
                    this.b.put(i, 0);
                    continue;
                }
                this.u.N(n3, n4);
            }
        }
    }

    private static int B(class07321 class073212) {
        return class073212.U() + class073212.E() * 32;
    }

    private void i() throws IOException {
        this.T.position(0);
        this.P.write(this.T, 0L);
    }

    public boolean i(class07321 class073212) {
        return this.M(class073212) != 0;
    }

    @Override
    public void close() throws IOException {
        try {
            this.R();
        }
        finally {
            try {
                this.P.force(true);
            }
            finally {
                this.P.close();
            }
        }
    }

    public void u(class07321 class073212) throws IOException {
        int n = class07357.B(class073212);
        int n2 = this.b.get(n);
        if (n2 == 0) {
            return;
        }
        this.b.put(n, 0);
        this.j.put(n, class07357.L());
        this.i();
        Files.deleteIfExists(this.R(class073212));
        this.u.y(class07357.y(n2), class07357.N(n2));
    }

    private ByteBuffer u() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(5);
        byteBuffer.putInt(1);
        byteBuffer.put((byte)(this.L.y() | 0x80));
        byteBuffer.flip();
        return byteBuffer;
    }

    public void y() throws IOException {
        this.P.force(true);
    }

    public boolean y(class07321 class073212) {
        int n = this.M(class073212);
        if (n == 0) {
            return false;
        }
        int n2 = class07357.y(n);
        int n3 = class07357.N(n);
        ByteBuffer byteBuffer = ByteBuffer.allocate(5);
        try {
            this.P.read(byteBuffer, n2 * 4096);
            byteBuffer.flip();
            if (byteBuffer.remaining() != 5) {
                return false;
            }
            int n4 = byteBuffer.getInt();
            byte by = byteBuffer.get();
            if (class07357.N(by)) {
                if (!class05530.y((int)class07357.y(by))) {
                    return false;
                }
                if (!Files.isRegularFile(this.R(class073212), new LinkOption[0])) {
                    return false;
                }
            } else {
                if (!class05530.y((int)by)) {
                    return false;
                }
                if (n4 == 0) {
                    return false;
                }
                int n5 = n4 - 1;
                if (n5 < 0 || n5 > 4096 * n3) {
                    return false;
                }
            }
        }
        catch (IOException iOException) {
            return false;
        }
        return true;
    }

    private static int y(int n) {
        return n >> 8 & 0xFFFFFF;
    }

    private static byte y(byte by) {
        return (byte)(by & 0xFFFFFF7F);
    }

    private @Nullable DataInputStream N(class07321 class073212, byte by) throws IOException {
        Path path = this.R(class073212);
        if (!Files.isRegularFile(path, new LinkOption[0])) {
            i.error("External chunk path {} is not file", (Object)path);
            return null;
        }
        return this.N(class073212, by, Files.newInputStream(path, new OpenOption[0]));
    }

    public synchronized void N(class07321 class073212, ByteBuffer byteBuffer) throws IOException {
        class10741 class107412;
        int n;
        int n2 = class07357.B(class073212);
        int n3 = this.b.get(n2);
        int n4 = class07357.y(n3);
        int n5 = class07357.N(n3);
        int n6 = byteBuffer.remaining();
        int n7 = class07357.L(n6);
        if (n7 >= 256) {
            Path path = this.R(class073212);
            i.warn("Saving oversized chunk {} ({} bytes} to external file {}", new Object[]{class073212, n6, path});
            n7 = 1;
            n = this.u.N(n7);
            class107412 = this.N(path, byteBuffer);
            ByteBuffer byteBuffer2 = this.u();
            this.P.write(byteBuffer2, n * 4096);
        } else {
            n = this.u.N(n7);
            class107412 = () -> Files.deleteIfExists(this.R(class073212));
            this.P.write(byteBuffer, n * 4096);
        }
        this.b.put(n2, this.N(n, n7));
        this.j.put(n2, class07357.L());
        this.i();
        class107412.run();
        if (n4 != 0) {
            this.u.y(n4, n5);
        }
    }

    private static ByteArrayInputStream N(ByteBuffer byteBuffer, int n) {
        return new ByteArrayInputStream(byteBuffer.array(), byteBuffer.position(), n);
    }

    private @Nullable DataInputStream N(class07321 class073212, byte by, InputStream inputStream) throws IOException {
        class05530 class055302 = class05530.N((int)by);
        if (class055302 == class05530.i) {
            String string = new DataInputStream(inputStream).readUTF();
            class01894 class018942 = class01894.L((String)string);
            if (class018942 != null) {
                i.error("Unrecognized custom compression {}", (Object)class018942);
                return null;
            }
            i.error("Invalid custom compression id {}", (Object)string);
            return null;
        }
        if (class055302 == null) {
            i.error("Chunk {} has invalid chunk stream version {}", (Object)class073212, (Object)by);
            return null;
        }
        return new DataInputStream(class055302.N(inputStream));
    }

    public Path N() {
        return this.m;
    }

    public synchronized @Nullable DataInputStream N(class07321 class073212) throws IOException {
        int n = this.M(class073212);
        if (n == 0) {
            return null;
        }
        int n2 = class07357.y(n);
        int n3 = class07357.N(n) * 4096;
        ByteBuffer byteBuffer = ByteBuffer.allocate(n3);
        this.P.read(byteBuffer, n2 * 4096);
        byteBuffer.flip();
        if (byteBuffer.remaining() < 5) {
            i.error("Chunk {} header is truncated: expected {} but read {}", new Object[]{class073212, n3, byteBuffer.remaining()});
            return null;
        }
        int n4 = byteBuffer.getInt();
        byte by = byteBuffer.get();
        if (n4 == 0) {
            i.warn("Chunk {} is allocated, but stream is missing", (Object)class073212);
            return null;
        }
        int n5 = n4 - 1;
        if (class07357.N(by)) {
            if (n5 != 0) {
                i.warn("Chunk has both internal and external streams");
            }
            return this.N(class073212, class07357.y(by));
        }
        if (n5 > byteBuffer.remaining()) {
            i.error("Chunk {} stream is truncated: expected {} but read {}", new Object[]{class073212, n5, byteBuffer.remaining()});
            return null;
        }
        if (n5 < 0) {
            i.error("Declared size {} of chunk {} is negative", (Object)n4, (Object)class073212);
            return null;
        }
        class01834.M.N(this.y, class073212, this.L, n5);
        return this.N(class073212, by, class07357.N(byteBuffer, n5));
    }

    private static boolean N(byte by) {
        return (by & 0x80) != 0;
    }

    private int N(int n, int n2) {
        return n << 8 | n2;
    }

    private class10741 N(Path path, ByteBuffer byteBuffer) throws IOException {
        Path path2 = Files.createTempFile(this.s, "tmp", null, new FileAttribute[0]);
        try (FileChannel fileChannel = FileChannel.open(path2, StandardOpenOption.CREATE, StandardOpenOption.WRITE);){
            byteBuffer.position(5);
            fileChannel.write(byteBuffer);
        }
        return () -> Files.move(path2, path, StandardCopyOption.REPLACE_EXISTING);
    }

    private static int N(int n) {
        return n & 0xFF;
    }

    private Path R(class07321 class073212) {
        String string = "c." + class073212.B + "." + class073212.Z + z;
        return this.s.resolve(string);
    }

    private void R() throws IOException {
        int n;
        int n2 = (int)this.P.size();
        if (n2 != (n = class07357.L(n2) * 4096)) {
            ByteBuffer byteBuffer = Z.duplicate();
            byteBuffer.position(0);
            this.P.write(byteBuffer, n - 1);
        }
    }
}

