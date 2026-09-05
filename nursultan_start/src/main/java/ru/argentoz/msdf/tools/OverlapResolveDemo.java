/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09716
 *  Nursultan.class09745
 *  Nursultan.class09747
 *  Nursultan.class09755
 */
package ru.argentoz.msdf.tools;

import Nursultan.class09716;
import Nursultan.class09745;
import Nursultan.class09747;
import Nursultan.class09755;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import javax.imageio.ImageIO;

public final class OverlapResolveDemo {
    private OverlapResolveDemo() {
    }

    public static void main(String[] stringArray) throws IOException {
        int n;
        String string = stringArray[0];
        int n2 = stringArray.length > 1 && !stringArray[1].isEmpty() ? stringArray[1].codePointAt(0) : 87;
        int n3 = stringArray.length > 2 ? Integer.parseInt(stringArray[2]) : 48;
        int n4 = n = stringArray.length > 3 ? Integer.parseInt(stringArray[3]) : 512;
        if (stringArray.length > 4 && stringArray[4].equals("area")) {
            class09716.N((class09747)class09747.AWT_AREA);
        }
        double d = 6.0;
        Path path = Path.of("build", "glyph-demo");
        Files.createDirectories(path, new FileAttribute[0]);
        try (class09745 class097452 = class09745.N((String)string);){
            class097452.N(false);
            OverlapResolveDemo.N(class097452.N(n2, n3, n3, d), n3, n, d, path.resolve(n2 + "-baseline-render.png").toFile());
            class097452.N(true);
            class09755 class097552 = class097452.N(n2, n3, n3, d);
            OverlapResolveDemo.N(class097552, n3, n, d, path.resolve(n2 + "-overlap-render.png").toFile());
            OverlapResolveDemo.N(class097552, n3, n, path.resolve(n2 + "-overlap-raw.png").toFile());
            OverlapResolveDemo.y(class097452.L(n2, n3, n3, d), n3, n, d, path.resolve(n2 + "-overlap-sdf.png").toFile());
        }
        System.out.println("Wrote baseline + overlap PNGs to " + String.valueOf(path.toAbsolutePath()));
    }

    private static void y(class09755 class097552, int n, int n2, double d, File file) throws IOException {
        double d2 = d * ((double)n2 / (double)n);
        BufferedImage bufferedImage = new BufferedImage(n2, n2, 1);
        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < n2; ++j) {
                double d3 = ((double)j + 0.5) * (double)n / (double)n2 - 0.5;
                double d4 = ((double)i + 0.5) * (double)n / (double)n2 - 0.5;
                int n3 = (int)Math.floor(d3);
                int n4 = (int)Math.floor(d4);
                double d5 = d3 - (double)n3;
                double d6 = d4 - (double)n4;
                float f = OverlapResolveDemo.N(class097552, n3, n4, 0);
                float f2 = OverlapResolveDemo.N(class097552, n3 + 1, n4, 0);
                float f3 = OverlapResolveDemo.N(class097552, n3, n4 + 1, 0);
                float f4 = OverlapResolveDemo.N(class097552, n3 + 1, n4 + 1, 0);
                float f5 = (float)((double)f + (double)(f2 - f) * d5);
                float f6 = (float)((double)f3 + (double)(f4 - f3) * d5);
                float f7 = (float)((double)f5 + (double)(f6 - f5) * d6);
                int n5 = Math.round(OverlapResolveDemo.y((float)(d2 * ((double)f7 - 0.5) + 0.5)) * 255.0f);
                bufferedImage.setRGB(j, n2 - 1 - i, n5 << 16 | n5 << 8 | n5);
            }
        }
        ImageIO.write((RenderedImage)bufferedImage, "png", file);
    }

    private static float y(float f) {
        return f < 0.0f ? 0.0f : (f > 1.0f ? 1.0f : f);
    }

    private static void N(class09755 class097552, int n, int n2, double d, File file) throws IOException {
        double d2 = d * ((double)n2 / (double)n);
        BufferedImage bufferedImage = new BufferedImage(n2, n2, 1);
        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < n2; ++j) {
                double d3 = ((double)j + 0.5) * (double)n / (double)n2 - 0.5;
                double d4 = ((double)i + 0.5) * (double)n / (double)n2 - 0.5;
                float f = OverlapResolveDemo.N(class097552, d3, d4);
                int n3 = Math.round(OverlapResolveDemo.y((float)(d2 * ((double)f - 0.5) + 0.5)) * 255.0f);
                bufferedImage.setRGB(j, n2 - 1 - i, n3 << 16 | n3 << 8 | n3);
            }
        }
        ImageIO.write((RenderedImage)bufferedImage, "png", file);
    }

    private static float N(float f, float f2, float f3) {
        return Math.max(Math.min(f, f2), Math.min(Math.max(f, f2), f3));
    }

    private static float N(class09755 class097552, int n, int n2, int n3) {
        n = Math.max(0, Math.min(class097552.y() - 1, n));
        n2 = Math.max(0, Math.min(class097552.L() - 1, n2));
        return class097552.N(n, n2, n3);
    }

    private static float N(class09755 class097552, double d, double d2) {
        int n = (int)Math.floor(d);
        int n2 = (int)Math.floor(d2);
        double d3 = d - (double)n;
        double d4 = d2 - (double)n2;
        float[] fArray = new float[3];
        for (int i = 0; i < 3; ++i) {
            float f = OverlapResolveDemo.N(class097552, n, n2, i);
            float f2 = OverlapResolveDemo.N(class097552, n + 1, n2, i);
            float f3 = OverlapResolveDemo.N(class097552, n, n2 + 1, i);
            float f4 = OverlapResolveDemo.N(class097552, n + 1, n2 + 1, i);
            float f5 = (float)((double)f + (double)(f2 - f) * d3);
            float f6 = (float)((double)f3 + (double)(f4 - f3) * d3);
            fArray[i] = (float)((double)f5 + (double)(f6 - f5) * d4);
        }
        return OverlapResolveDemo.N(fArray[0], fArray[1], fArray[2]);
    }

    private static void N(class09755 class097552, int n, int n2, File file) throws IOException {
        int n3 = Math.max(1, n2 / n);
        BufferedImage bufferedImage = new BufferedImage(n * n3, n * n3, 1);
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                int n4 = OverlapResolveDemo.N(class097552.N(j, i, 0));
                int n5 = OverlapResolveDemo.N(class097552.N(j, i, 1));
                int n6 = OverlapResolveDemo.N(class097552.N(j, i, 2));
                int n7 = n4 << 16 | n5 << 8 | n6;
                int n8 = n - 1 - i;
                for (int k = 0; k < n3; ++k) {
                    for (int i2 = 0; i2 < n3; ++i2) {
                        bufferedImage.setRGB(j * n3 + i2, n8 * n3 + k, n7);
                    }
                }
            }
        }
        ImageIO.write((RenderedImage)bufferedImage, "png", file);
    }

    private static int N(float f) {
        return Math.max(0, Math.min(255, Math.round(f * 255.0f)));
    }
}

