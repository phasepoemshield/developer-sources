/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09745
 *  Nursultan.class09755
 */
package ru.argentoz.msdf.tools;

import Nursultan.class09745;
import Nursultan.class09755;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import javax.imageio.ImageIO;

public final class PixelFontDemo {
    private static final int[] N = new int[]{12, 18, 24};
    private static final int y = 14;

    private PixelFontDemo() {
    }

    public static void main(String[] stringArray) throws IOException {
        String string = stringArray[0];
        int n = stringArray.length > 1 ? stringArray[1].codePointAt(0) : 65;
        int n2 = 64;
        double d = 4.0;
        try (class09745 class097452 = class09745.N((String)string);){
            int n32;
            class09755 class097552 = class097452.N(n, n2, n2, d);
            int n4 = 6;
            int n5 = 0;
            for (int n32 : N) {
                n5 = Math.max(n5, n32 * 14);
            }
            int n6 = N.length * (n5 + n4) + n4;
            int n7 = 2 * (n5 + n4) + n4 + 14;
            BufferedImage bufferedImage = new BufferedImage(n6, n7, 1);
            PixelFontDemo.N(bufferedImage, 0x101010);
            n32 = n4;
            for (int n8 : N) {
                PixelFontDemo.N(class097552, n2, d, n8, false, bufferedImage, n32, n4);
                PixelFontDemo.N(class097552, n2, d, n8, true, bufferedImage, n32, n4 + n5 + n4 + 14);
                n32 += n5 + n4;
            }
            Object object = Path.of("build", "glyph-demo");
            Files.createDirectories((Path)object, new FileAttribute[0]);
            File file = object.resolve("pixelfont-" + n + ".png").toFile();
            ImageIO.write((RenderedImage)bufferedImage, "png", file);
            System.out.println("Wrote " + file.getAbsolutePath() + "  (top row = HARD cutoff, bottom = AA; sizes " + Arrays.toString(N) + " px, nearest x14)");
        }
    }

    private static float N(float f, float f2, float f3) {
        return Math.max(Math.min(f, f2), Math.min(Math.max(f, f2), f3));
    }

    private static float N(class09755 class097552, int n, int n2, int n3) {
        n = Math.max(0, Math.min(class097552.y() - 1, n));
        n2 = Math.max(0, Math.min(class097552.L() - 1, n2));
        return class097552.N(n, n2, n3);
    }

    private static float N(float f) {
        return f < 0.0f ? 0.0f : (f > 1.0f ? 1.0f : f);
    }

    private static void N(BufferedImage bufferedImage, int n) {
        for (int i = 0; i < bufferedImage.getHeight(); ++i) {
            for (int j = 0; j < bufferedImage.getWidth(); ++j) {
                bufferedImage.setRGB(j, i, n);
            }
        }
    }

    private static float N(class09755 class097552, double d, double d2) {
        int n = (int)Math.floor(d);
        int n2 = (int)Math.floor(d2);
        double d3 = d - (double)n;
        double d4 = d2 - (double)n2;
        float[] fArray = new float[3];
        for (int i = 0; i < 3; ++i) {
            float f = PixelFontDemo.N(class097552, n, n2, i);
            float f2 = PixelFontDemo.N(class097552, n + 1, n2, i);
            float f3 = PixelFontDemo.N(class097552, n, n2 + 1, i);
            float f4 = PixelFontDemo.N(class097552, n + 1, n2 + 1, i);
            float f5 = (float)((double)f + (double)(f2 - f) * d3);
            float f6 = (float)((double)f3 + (double)(f4 - f3) * d3);
            fArray[i] = (float)((double)f5 + (double)(f6 - f5) * d4);
        }
        return PixelFontDemo.N(fArray[0], fArray[1], fArray[2]);
    }

    private static void N(class09755 class097552, int n, double d, int n2, boolean bl, BufferedImage bufferedImage, int n3, int n4) {
        double d2 = d * ((double)n2 / (double)n);
        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < n2; ++j) {
                double d3 = ((double)j + 0.5) * (double)n / (double)n2 - 0.5;
                double d4 = ((double)i + 0.5) * (double)n / (double)n2 - 0.5;
                float f = PixelFontDemo.N(class097552, d3, d4);
                int n5 = Math.round((bl ? PixelFontDemo.N((float)(d2 * ((double)f - 0.5) + 0.5)) : (f >= 0.5f ? 1.0f : 0.0f)) * 255.0f);
                int n6 = n5 << 16 | n5 << 8 | n5;
                for (int k = 0; k < 14; ++k) {
                    for (int i2 = 0; i2 < 14; ++i2) {
                        bufferedImage.setRGB(n3 + j * 14 + i2, n4 + (n2 - 1 - i) * 14 + k, n6);
                    }
                }
            }
        }
    }
}

