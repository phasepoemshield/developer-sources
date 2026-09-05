/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.IntArrayFIFOQueue
 *  minecraft.class02566
 *  minecraft.class08280
 *  org.lwjgl.system.MemoryUtil
 *  org.slf4j.Logger
 */
package com.mojang.blaze3d.platform;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBuffer$MappedView;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntArrayFIFOQueue;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntUnaryOperator;
import minecraft.class02566;
import minecraft.class08280;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

public class TextureUtil {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final int MIN_MIPMAP_LEVEL = 0;
    private static final int DEFAULT_IMAGE_BUFFER_SIZE = 8192;
    private static final int[][] DIRECTIONS = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    private static int pack(int n, int n2, int n3) {
        return n + n2 * n3;
    }

    private static int x(int n, int n2) {
        return n % n2;
    }

    private static int y(int n, int n2) {
        return n / n2;
    }

    public static ByteBuffer readResource(InputStream inputStream) throws IOException {
        ReadableByteChannel readableByteChannel = Channels.newChannel(inputStream);
        if (readableByteChannel instanceof SeekableByteChannel) {
            SeekableByteChannel seekableByteChannel = (SeekableByteChannel)readableByteChannel;
            return TextureUtil.readResource(readableByteChannel, (int)seekableByteChannel.size() + 1);
        }
        return TextureUtil.readResource(readableByteChannel, 8192);
    }

    private static ByteBuffer readResource(ReadableByteChannel readableByteChannel, int n) throws IOException {
        ByteBuffer byteBuffer = MemoryUtil.memAlloc((int)n);
        try {
            while (readableByteChannel.read(byteBuffer) != -1) {
                if (byteBuffer.hasRemaining()) continue;
                byteBuffer = MemoryUtil.memRealloc((ByteBuffer)byteBuffer, (int)(byteBuffer.capacity() * 2));
            }
            byteBuffer.flip();
            return byteBuffer;
        }
        catch (IOException iOException) {
            MemoryUtil.memFree((Buffer)byteBuffer);
            throw iOException;
        }
    }

    public static void fillEmptyAreasWithDarkColor(class08280 class082802) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8 = class082802.N();
        int n9 = class082802.y();
        int n10 = -1;
        int n11 = Integer.MAX_VALUE;
        for (n7 = 0; n7 < n8; ++n7) {
            for (n6 = 0; n6 < n9; ++n6) {
                int n12;
                n5 = class082802.N(n7, n6);
                n4 = class02566.y((int)n5);
                if (n4 == 0 || (n12 = (n3 = class02566.L((int)n5)) + (n2 = class02566.u((int)n5)) + (n = class02566.i((int)n5))) >= n11) continue;
                n11 = n12;
                n10 = n5;
            }
        }
        n7 = 3 * class02566.L((int)n10) / 4;
        n6 = 3 * class02566.u((int)n10) / 4;
        n5 = 3 * class02566.i((int)n10) / 4;
        n4 = class02566.y((int)0, (int)n7, (int)n6, (int)n5);
        for (n3 = 0; n3 < n8; ++n3) {
            for (n2 = 0; n2 < n9; ++n2) {
                n = class082802.N(n3, n2);
                if (class02566.y((int)n) != 0) continue;
                class082802.y(n3, n2, n4);
            }
        }
    }

    public static void writeAsPNG(Path path, String string, GpuTexture gpuTexture, int n, IntUnaryOperator intUnaryOperator) {
        RenderSystem.assertOnRenderThread();
        long l = 0L;
        for (int i = 0; i <= n; ++i) {
            l += (long)gpuTexture.getFormat().pixelSize() * (long)gpuTexture.getWidth(i) * (long)gpuTexture.getHeight(i);
        }
        if (l > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Exporting textures larger than 2GB is not supported");
        }
        GpuBuffer gpuBuffer = RenderSystem.getDevice().createBuffer(() -> "Texture output buffer", 9, l);
        CommandEncoder commandEncoder = RenderSystem.getDevice().createCommandEncoder();
        Runnable runnable = () -> {
            try (GpuBuffer$MappedView gpuBuffer$MappedView = commandEncoder.mapBuffer(gpuBuffer, true, false);){
                int n2 = 0;
                for (int i = 0; i <= n; ++i) {
                    int n3 = gpuTexture.getWidth(i);
                    int n4 = gpuTexture.getHeight(i);
                    try (class08280 class082802 = new class08280(n3, n4, false);){
                        for (int j = 0; j < n4; ++j) {
                            for (int k = 0; k < n3; ++k) {
                                int n5 = gpuBuffer$MappedView.data().getInt(n2 + (k + j * n3) * gpuTexture.getFormat().pixelSize());
                                class082802.N(k, j, intUnaryOperator.applyAsInt(n5));
                            }
                        }
                        Path path2 = path.resolve(string + "_" + i + ".png");
                        class082802.N(path2);
                        LOGGER.debug("Exported png to: {}", (Object)path2.toAbsolutePath());
                    }
                    catch (IOException iOException) {
                        LOGGER.debug("Unable to write: ", (Throwable)iOException);
                    }
                    n2 += gpuTexture.getFormat().pixelSize() * n3 * n4;
                }
            }
            gpuBuffer.close();
        };
        AtomicInteger atomicInteger = new AtomicInteger();
        int n2 = 0;
        for (int i = 0; i <= n; ++i) {
            commandEncoder.copyTextureToBuffer(gpuTexture, gpuBuffer, n2, () -> {
                if (atomicInteger.getAndIncrement() == n) {
                    runnable.run();
                }
            }, i);
            n2 += gpuTexture.getFormat().pixelSize() * gpuTexture.getWidth(i) * gpuTexture.getHeight(i);
        }
    }

    public static void solidify(class08280 class082802) {
        int n;
        int n2;
        int n3;
        int n4 = class082802.N();
        int n5 = class082802.y();
        int[] nArray = new int[n4 * n5];
        int[] nArray2 = new int[n4 * n5];
        Arrays.fill(nArray2, Integer.MAX_VALUE);
        IntArrayFIFOQueue intArrayFIFOQueue = new IntArrayFIFOQueue();
        for (n3 = 0; n3 < n4; ++n3) {
            for (n2 = 0; n2 < n5; ++n2) {
                n = class082802.N(n3, n2);
                if (class02566.y((int)n) == 0) continue;
                int n6 = TextureUtil.pack(n3, n2, n4);
                nArray2[n6] = 0;
                nArray[n6] = n;
                intArrayFIFOQueue.enqueue(n6);
            }
        }
        while (!intArrayFIFOQueue.isEmpty()) {
            n3 = intArrayFIFOQueue.dequeueInt();
            n2 = TextureUtil.x(n3, n4);
            n = TextureUtil.y(n3, n4);
            for (int[] nArray3 : DIRECTIONS) {
                int n7 = n2 + nArray3[0];
                int n8 = n + nArray3[1];
                int n9 = TextureUtil.pack(n7, n8, n4);
                if (n7 < 0 || n8 < 0 || n7 >= n4 || n8 >= n5 || nArray2[n9] <= nArray2[n3] + 1) continue;
                nArray2[n9] = nArray2[n3] + 1;
                nArray[n9] = nArray[n3];
                intArrayFIFOQueue.enqueue(n9);
            }
        }
        for (n3 = 0; n3 < n4; ++n3) {
            for (n2 = 0; n2 < n5; ++n2) {
                n = class082802.N(n3, n2);
                if (class02566.y((int)n) == 0) {
                    class082802.y(n3, n2, class02566.R((int)0, (int)nArray[TextureUtil.pack(n3, n2, n4)]));
                    continue;
                }
                class082802.y(n3, n2, n);
            }
        }
    }

    public static Path getDebugTexturePath() {
        return TextureUtil.getDebugTexturePath(Path.of(".", new String[0]));
    }

    public static Path getDebugTexturePath(Path path) {
        return path.resolve("screenshots").resolve("debug");
    }
}

