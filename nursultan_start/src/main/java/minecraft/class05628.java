/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.buffers.GpuBuffer$MappedView
 *  com.mojang.blaze3d.systems.CommandEncoder
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class00623
 *  minecraft.class00647
 *  minecraft.class02566
 *  minecraft.class05216
 *  minecraft.class06541
 *  minecraft.class07536
 *  minecraft.class08066
 *  minecraft.class08280
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class00623;
import minecraft.class00647;
import minecraft.class02566;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class07536;
import minecraft.class08066;
import minecraft.class08280;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05628 {
    private static final Logger y = LogUtils.getLogger();
    public static final String N = "screenshots";

    public static void N(File file, @Nullable String string, class08066 class080662, int n, Consumer<class00392> consumer) {
        class05628.N(class080662, n, (class08280 class082802) -> {
            File file2 = new File(file, N);
            file2.mkdir();
            File file3 = string == null ? class05628.N(file2) : new File(file2, string);
            class07536.Z().execute(() -> {
                try (class08280 class082803 = class082802;){
                    class082802.N(file3);
                    class05216 class052162 = class00392.y((String)file3.getName()).N(class06541.field_1073).N(class004052 -> class004052.N((class00647)new class00623(file3.getAbsoluteFile())));
                    consumer.accept((class00392)class00392.N((String)"screenshot.success", (Object[])new Object[]{class052162}));
                }
                catch (Exception exception) {
                    y.warn("Couldn't save screenshot", (Throwable)exception);
                    consumer.accept((class00392)class00392.N((String)"screenshot.failure", (Object[])new Object[]{exception.getMessage()}));
                }
            });
        });
    }

    public static void N(class08066 class080662, Consumer<class08280> consumer) {
        class05628.N(class080662, 1, consumer);
    }

    public static void N(class08066 class080662, int n, Consumer<class08280> consumer) {
        int n2 = class080662.N;
        int n3 = class080662.y;
        GpuTexture gpuTexture = class080662.L();
        if (gpuTexture == null) {
            throw new IllegalStateException("Tried to capture screenshot of an incomplete framebuffer");
        }
        if (n2 % n != 0 || n3 % n != 0) {
            throw new IllegalArgumentException("Image size is not divisible by downscale factor");
        }
        GpuBuffer gpuBuffer = RenderSystem.getDevice().createBuffer(() -> "Screenshot buffer", 9, (long)n2 * (long)n3 * (long)gpuTexture.getFormat().pixelSize());
        CommandEncoder commandEncoder = RenderSystem.getDevice().createCommandEncoder();
        RenderSystem.getDevice().createCommandEncoder().copyTextureToBuffer(gpuTexture, gpuBuffer, 0L, () -> {
            try (GpuBuffer.MappedView mappedView = commandEncoder.mapBuffer(gpuBuffer, true, false);){
                int n4 = n3 / n;
                int n5 = n2 / n;
                class08280 class082802 = new class08280(n5, n4, false);
                for (int i = 0; i < n4; ++i) {
                    for (int j = 0; j < n5; ++j) {
                        int n6;
                        int n7;
                        if (n == 1) {
                            n7 = mappedView.data().getInt((j + i * n2) * gpuTexture.getFormat().pixelSize());
                            class082802.N(j, n3 - i - 1, n7 | 0xFF000000);
                            continue;
                        }
                        n7 = 0;
                        int n8 = 0;
                        int n9 = 0;
                        for (n6 = 0; n6 < n; ++n6) {
                            for (int k = 0; k < n; ++k) {
                                int n10 = mappedView.data().getInt((j * n + n6 + (i * n + k) * n2) * gpuTexture.getFormat().pixelSize());
                                n7 += class02566.L((int)n10);
                                n8 += class02566.u((int)n10);
                                n9 += class02566.i((int)n10);
                            }
                        }
                        n6 = n * n;
                        class082802.N(j, n4 - i - 1, class02566.y((int)255, (int)(n7 / n6), (int)(n8 / n6), (int)(n9 / n6)));
                    }
                }
                consumer.accept(class082802);
            }
            gpuBuffer.close();
        }, 0);
    }

    private static File N(File file) {
        String string = class07536.R();
        int n = 1;
        File file2;
        while ((file2 = new File(file, string + (String)(n == 1 ? "" : "_" + n) + ".png")).exists()) {
            ++n;
        }
        return file2;
    }

    public static void N(File file, class08066 class080662, Consumer<class00392> consumer) {
        class05628.N(file, null, class080662, 1, consumer);
    }
}

