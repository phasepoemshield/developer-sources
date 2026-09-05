/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10939
 *  com.mojang.blaze3d.platform.TextureUtil
 *  com.mojang.jtracy.MemoryPool
 *  com.mojang.jtracy.TracyClient
 *  com.mojang.logging.LogUtils
 *  minecraft.class02566
 *  minecraft.class03726
 *  minecraft.class04284
 *  minecraft.class06417
 *  net.caffeinemc.mods.sodium.mixin.features.textures.NativeImageAccessor
 *  org.apache.commons.io.IOUtils
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.stb.STBImage
 *  org.lwjgl.stb.STBImageResize
 *  org.lwjgl.stb.STBImageWrite
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 *  org.lwjgl.util.freetype.FT_Bitmap
 *  org.lwjgl.util.freetype.FT_Face
 *  org.lwjgl.util.freetype.FreeType
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10939;
import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.jtracy.MemoryPool;
import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.function.IntUnaryOperator;
import minecraft.class02566;
import minecraft.class03726;
import minecraft.class04284;
import minecraft.class06417;
import minecraft.class08247;
import net.caffeinemc.mods.sodium.mixin.features.textures.NativeImageAccessor;
import org.apache.commons.io.IOUtils;
import org.jspecify.annotations.Nullable;
import org.lwjgl.stb.STBImage;
import org.lwjgl.stb.STBImageResize;
import org.lwjgl.stb.STBImageWrite;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.freetype.FT_Bitmap;
import org.lwjgl.util.freetype.FT_Face;
import org.lwjgl.util.freetype.FreeType;
import org.slf4j.Logger;

public final class class08280
implements AutoCloseable,
NativeImageAccessor {
    private static final Logger y = LogUtils.getLogger();
    private static final MemoryPool L = TracyClient.createMemoryPool((String)"NativeImage");
    private static final Set<StandardOpenOption> u = EnumSet.of(StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    private final class08247 i;
    private final int R;
    private final int M;
    private final boolean B;
    public long N;
    private final long Z;

    private boolean L(int n, int n2) {
        return n < 0 || n >= this.R || n2 < 0 || n2 >= this.M;
    }

    public class08247 L() {
        return this.i;
    }

    public void M() {
        class06417.N((long)this.N);
    }

    public class08280(int n, int n2, boolean bl) {
        this(class08247.field_4997, n, n2, bl);
    }

    public class08280(class08247 class082472, int n, int n2, boolean bl, long l) {
        if (n <= 0 || n2 <= 0) {
            throw new IllegalArgumentException("Invalid texture size: " + n + "x" + n2);
        }
        this.i = class082472;
        this.R = n;
        this.M = n2;
        this.B = bl;
        this.N = l;
        this.Z = (long)n * (long)n2 * (long)class082472.N();
    }

    public class08280(class08247 class082472, int n, int n2, boolean bl) {
        if (n <= 0 || n2 <= 0) {
            throw new IllegalArgumentException("Invalid texture size: " + n + "x" + n2);
        }
        this.i = class082472;
        this.R = n;
        this.M = n2;
        this.Z = (long)n * (long)n2 * (long)class082472.N();
        this.B = false;
        this.N = bl ? MemoryUtil.nmemCalloc((long)1L, (long)this.Z) : MemoryUtil.nmemAlloc((long)this.Z);
        L.malloc(this.N, (int)this.Z);
        if (this.N == 0L) {
            throw new IllegalStateException("Unable to allocate texture of size " + n + "x" + n2 + " (" + class082472.N() + " channels)");
        }
    }

    public String toString() {
        return "NativeImage[" + String.valueOf((Object)this.i) + " " + this.R + "x" + this.M + "@" + this.N + (this.B ? "S" : "N") + "]";
    }

    public long B() {
        return this.N;
    }

    private void Z() {
        if (this.N == 0L) {
            throw new IllegalStateException("Image is not allocated.");
        }
    }

    public int[] i() {
        int[] nArray = this.u();
        for (int i = 0; i < nArray.length; ++i) {
            nArray[i] = class02566.b((int)nArray[i]);
        }
        return nArray;
    }

    @Override
    public void close() {
        if (this.N != 0L) {
            if (this.B) {
                STBImage.nstbi_image_free((long)this.N);
            } else {
                MemoryUtil.nmemFree((long)this.N);
            }
            L.free(this.N);
        }
        this.N = 0L;
    }

    private int u(int n, int n2) {
        if (this.i != class08247.field_4997) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "getPixelRGBA only works on RGBA images; have %s", new Object[]{this.i}));
        }
        if (this.L(n, n2)) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "(%s, %s) outside of image bounds (%s, %s)", n, n2, this.R, this.M));
        }
        this.Z();
        long l = ((long)n + (long)n2 * (long)this.R) * 4L;
        return MemoryUtil.memGetInt((long)(this.N + l));
    }

    public int[] u() {
        if (this.i != class08247.field_4997) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "getPixels only works on RGBA images; have %s", new Object[]{this.i}));
        }
        this.Z();
        int[] nArray = new int[this.R * this.M];
        MemoryUtil.memIntBuffer((long)this.N, (int)(this.R * this.M)).get(nArray);
        return nArray;
    }

    public void y(int n, int n2, int n3) {
        this.N(n, n2, class02566.T((int)n3));
    }

    public byte y(int n, int n2) {
        if (!this.i.P()) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "no luminance or alpha in %s", new Object[]{this.i}));
        }
        if (this.L(n, n2)) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "(%s, %s) outside of image bounds (%s, %s)", n, n2, this.R, this.M));
        }
        int n3 = (n + n2 * this.R) * this.i.N() + this.i.j() / 8;
        return MemoryUtil.memGetByte((long)(this.N + (long)n3));
    }

    public int y() {
        return this.M;
    }

    public void N(class08280 class082802) {
        if (class082802.L() != this.i) {
            throw new UnsupportedOperationException("Image formats don't match.");
        }
        int n = this.i.N();
        this.Z();
        class082802.Z();
        if (this.R == class082802.R) {
            MemoryUtil.memCopy((long)class082802.N, (long)this.N, (long)Math.min(this.Z, class082802.Z));
        } else {
            int n2 = Math.min(this.N(), class082802.N());
            int n3 = Math.min(this.y(), class082802.y());
            for (int i = 0; i < n3; ++i) {
                int n4 = i * class082802.N() * n;
                int n5 = i * this.N() * n;
                MemoryUtil.memCopy((long)(class082802.N + (long)n4), (long)(this.N + (long)n5), (long)n2);
            }
        }
    }

    public void N(int n, int n2, int n3, int n4, int n5) {
        for (int i = n2; i < n2 + n4; ++i) {
            for (int j = n; j < n + n3; ++j) {
                this.y(j, i, n5);
            }
        }
    }

    public void N(int n, int n2, int n3, int n4, int n5, int n6, boolean bl, boolean bl2) {
        this.N(this, n, n2, n + n3, n2 + n4, n5, n6, bl, bl2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean N(WritableByteChannel writableByteChannel) throws IOException {
        class10939 class109392 = new class10939(writableByteChannel);
        try {
            int n = Math.min(this.y(), Integer.MAX_VALUE / this.N() / this.i.N());
            if (n < this.y()) {
                y.warn("Dropping image height from {} to {} to fit the size into 32-bit signed int", (Object)this.y(), (Object)n);
            }
            if (STBImageWrite.nstbi_write_png_to_func((long)class109392.address(), (long)0L, (int)this.N(), (int)n, (int)this.i.N(), (long)this.N, (int)0) == 0) {
                boolean bl = false;
                return bl;
            }
            class109392.N();
            boolean bl = true;
            return bl;
        }
        finally {
            class109392.free();
        }
    }

    public void N(Path path) throws IOException {
        if (!this.i.v()) {
            throw new UnsupportedOperationException("Don't know how to write format " + String.valueOf((Object)this.i));
        }
        this.Z();
        try (SeekableByteChannel seekableByteChannel = Files.newByteChannel(path, u, new FileAttribute[0]);){
            if (!this.N(seekableByteChannel)) {
                throw new IOException("Could not write image to the PNG file \"" + String.valueOf(path.toAbsolutePath()) + "\": " + STBImage.stbi_failure_reason());
            }
        }
    }

    public static class08280 N(InputStream inputStream) throws IOException {
        return class08280.N(class08247.field_4997, inputStream);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static class08280 N(@Nullable class08247 class082472, InputStream inputStream) throws IOException {
        ByteBuffer byteBuffer = null;
        try {
            byteBuffer = TextureUtil.readResource((InputStream)inputStream);
            class08280 class082802 = class08280.N(class082472, byteBuffer);
            return class082802;
        }
        finally {
            MemoryUtil.memFree((Buffer)byteBuffer);
            IOUtils.closeQuietly((InputStream)inputStream);
        }
    }

    public static class08280 N(ByteBuffer byteBuffer) throws IOException {
        return class08280.N(class08247.field_4997, byteBuffer);
    }

    public void N(int n, int n2, int n3, int n4, class08280 class082802) {
        this.Z();
        if (class082802.L() != this.i) {
            throw new UnsupportedOperationException("resizeSubRectTo only works for images of the same format.");
        }
        int n5 = this.i.N();
        STBImageResize.nstbir_resize_uint8((long)(this.N + (long)((n + n2 * this.N()) * n5)), (int)n3, (int)n4, (int)(this.N() * n5), (long)class082802.N, (int)class082802.N(), (int)class082802.y(), (int)0, (int)n5);
    }

    public void N(class08280 class082802, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, boolean bl2) {
        for (int i = 0; i < n6; ++i) {
            for (int j = 0; j < n5; ++j) {
                int n7 = bl ? n5 - 1 - j : j;
                int n8 = bl2 ? n6 - 1 - i : i;
                int n9 = this.u(n + j, n2 + i);
                class082802.N(n3 + n7, n4 + n8, n9);
            }
        }
    }

    public static class08280 N(@Nullable class08247 class082472, ByteBuffer byteBuffer) throws IOException {
        if (class082472 != null && !class082472.v()) {
            throw new UnsupportedOperationException("Don't know how to read format " + String.valueOf((Object)class082472));
        }
        if (MemoryUtil.memAddress((ByteBuffer)byteBuffer) == 0L) {
            throw new IllegalArgumentException("Invalid buffer");
        }
        class03726.N((ByteBuffer)byteBuffer);
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            IntBuffer intBuffer = memoryStack.mallocInt(1);
            IntBuffer intBuffer2 = memoryStack.mallocInt(1);
            IntBuffer intBuffer3 = memoryStack.mallocInt(1);
            ByteBuffer byteBuffer2 = STBImage.stbi_load_from_memory((ByteBuffer)byteBuffer, (IntBuffer)intBuffer, (IntBuffer)intBuffer2, (IntBuffer)intBuffer3, (int)(class082472 == null ? 0 : class082472.field_4994));
            if (byteBuffer2 == null) {
                throw new IOException("Could not load image: " + STBImage.stbi_failure_reason());
            }
            long l = MemoryUtil.memAddress((ByteBuffer)byteBuffer2);
            L.malloc(l, byteBuffer2.limit());
            class08280 class082802 = new class08280(class082472 == null ? class08247.N(intBuffer3.get(0)) : class082472, intBuffer.get(0), intBuffer2.get(0), true, l);
            return class082802;
        }
    }

    public class08280 N(IntUnaryOperator intUnaryOperator) {
        if (this.i != class08247.field_4997) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "function application only works on RGBA images; have %s", new Object[]{this.i}));
        }
        this.Z();
        class08280 class082802 = new class08280(this.R, this.M, false);
        int n = this.R * this.M;
        IntBuffer intBuffer = MemoryUtil.memIntBuffer((long)this.N, (int)n);
        IntBuffer intBuffer2 = MemoryUtil.memIntBuffer((long)class082802.N, (int)n);
        for (int i = 0; i < n; ++i) {
            int n2 = class02566.b((int)intBuffer.get(i));
            int n3 = intUnaryOperator.applyAsInt(n2);
            intBuffer2.put(i, class02566.T((int)n3));
        }
        return class082802;
    }

    public int N() {
        return this.R;
    }

    public void N(int n, int n2, int n3) {
        if (this.i != class08247.field_4997) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "setPixelRGBA only works on RGBA images; have %s", new Object[]{this.i}));
        }
        if (this.L(n, n2)) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "(%s, %s) outside of image bounds (%s, %s)", n, n2, this.R, this.M));
        }
        this.Z();
        long l = ((long)n + (long)n2 * (long)this.R) * 4L;
        MemoryUtil.memPutInt((long)(this.N + l), (int)n3);
    }

    public int N(int n, int n2) {
        return class02566.b((int)this.u(n, n2));
    }

    public boolean N(FT_Face fT_Face, int n) {
        if (this.i.N() != 1) {
            throw new IllegalArgumentException("Can only write fonts into 1-component images.");
        }
        if (class04284.y((int)FreeType.FT_Load_Glyph((FT_Face)fT_Face, (int)n, (int)4), (String)"Loading glyph")) {
            return false;
        }
        FT_Bitmap fT_Bitmap = Objects.requireNonNull(fT_Face.glyph(), "Glyph not initialized").bitmap();
        if (fT_Bitmap.pixel_mode() != 2) {
            throw new IllegalStateException("Rendered glyph was not 8-bit grayscale");
        }
        if (fT_Bitmap.width() != this.N() || fT_Bitmap.rows() != this.y()) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "Glyph bitmap of size %sx%s does not match image of size: %sx%s", fT_Bitmap.width(), fT_Bitmap.rows(), this.N(), this.y()));
        }
        int n2 = fT_Bitmap.width() * fT_Bitmap.rows();
        MemoryUtil.memCopy((long)MemoryUtil.memAddress((ByteBuffer)Objects.requireNonNull(fT_Bitmap.buffer(n2), "Glyph has no bitmap")), (long)this.N, (long)n2);
        return true;
    }

    public void N(File file) throws IOException {
        this.N(file.toPath());
    }

    private static class08280 N(ByteBuffer byteBuffer, byte[] byArray) throws IOException {
        byteBuffer.put(byArray);
        byteBuffer.rewind();
        return class08280.N(byteBuffer);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static class08280 N(byte[] byArray) throws IOException {
        if (MemoryStack.stackGet().getPointer() < byArray.length) {
            ByteBuffer byteBuffer = MemoryUtil.memAlloc((int)byArray.length);
            try {
                class08280 class082802 = class08280.N(byteBuffer, byArray);
                return class082802;
            }
            finally {
                MemoryUtil.memFree((Buffer)byteBuffer);
            }
        }
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            ByteBuffer byteBuffer = memoryStack.malloc(byArray.length);
            class08280 class082803 = class08280.N(byteBuffer, byArray);
            return class082803;
        }
    }

    public /* synthetic */ long sodium$getPixels() {
        return this.N;
    }

    @Deprecated
    public int[] R() {
        if (this.i != class08247.field_4997) {
            throw new UnsupportedOperationException("can only call makePixelArray for RGBA images.");
        }
        this.Z();
        int[] nArray = new int[this.N() * this.y()];
        for (int i = 0; i < this.y(); ++i) {
            for (int j = 0; j < this.N(); ++j) {
                nArray[j + i * this.N()] = this.N(j, i);
            }
        }
        return nArray;
    }
}

