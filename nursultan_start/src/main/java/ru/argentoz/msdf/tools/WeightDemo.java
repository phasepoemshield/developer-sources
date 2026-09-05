/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09745
 *  Nursultan.class09749
 *  Nursultan.class09755
 */
package ru.argentoz.msdf.tools;

import Nursultan.class09745;
import Nursultan.class09749;
import Nursultan.class09755;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import javax.imageio.ImageIO;

public final class WeightDemo {
    private WeightDemo() {
    }

    public static void main(String[] stringArray) throws IOException {
        String string = stringArray[0];
        String string2 = stringArray.length > 1 ? stringArray[1] : "AaBbGgRe";
        int n = stringArray.length > 2 ? Integer.parseInt(stringArray[2]) : 6;
        int n2 = stringArray.length > 3 ? Integer.parseInt(stringArray[3]) : 48;
        int n3 = stringArray.length > 4 ? Integer.parseInt(stringArray[4]) : 96;
        double d = 6.0;
        try (class09745 class097452 = class09745.N((String)string);){
            int n4;
            class09749 class097492 = class097452.y();
            if (class097492 == null) {
                System.out.println(string + " has no variable 'wght' axis \u2014 weight cannot be varied. Try a variable font, e.g. C:\\Windows\\Fonts\\bahnschrift.ttf");
                return;
            }
            System.out.printf("wght axis: min=%.0f def=%.0f max=%.0f%n", Float.valueOf(class097492.N()), Float.valueOf(class097492.y()), Float.valueOf(class097492.L()));
            int n5 = string2.length();
            BufferedImage bufferedImage = new BufferedImage(n5 * n3, n * n3, 1);
            for (n4 = 0; n4 < bufferedImage.getHeight(); ++n4) {
                for (int i = 0; i < bufferedImage.getWidth(); ++i) {
                    bufferedImage.setRGB(i, n4, i % n3 == 0 || n4 % n3 == 0 ? 0x202020 : 0);
                }
            }
            for (n4 = 0; n4 < n; ++n4) {
                float f = n == 1 ? class097492.y() : class097492.N() + (class097492.L() - class097492.N()) * (float)n4 / (float)(n - 1);
                class097452.N(f);
                System.out.printf("  row %d -> weight %.0f%n", n4, Float.valueOf(class097452.L()));
                for (int i = 0; i < n5; ++i) {
                    char c = string2.charAt(i);
                    if (class097452.N((int)c) == 0) continue;
                    WeightDemo.N(class097452.N((int)c, n2, n2, d), n2, d, bufferedImage, i * n3, n4 * n3, n3);
                }
            }
            Path path = Path.of("build", "glyph-demo");
            Files.createDirectories(path, new FileAttribute[0]);
            File file = path.resolve("weights.png").toFile();
            ImageIO.write((RenderedImage)bufferedImage, "png", file);
            System.out.println("Wrote " + file.getAbsolutePath() + "  (" + n + " weights x " + n5 + " glyphs)");
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

    private static float N(class09755 class097552, double d, double d2) {
        int n = (int)Math.floor(d);
        int n2 = (int)Math.floor(d2);
        double d3 = d - (double)n;
        double d4 = d2 - (double)n2;
        float[] fArray = new float[3];
        for (int i = 0; i < 3; ++i) {
            float f = WeightDemo.N(class097552, n, n2, i);
            float f2 = WeightDemo.N(class097552, n + 1, n2, i);
            float f3 = WeightDemo.N(class097552, n, n2 + 1, i);
            float f4 = WeightDemo.N(class097552, n + 1, n2 + 1, i);
            float f5 = (float)((double)f + (double)(f2 - f) * d3);
            float f6 = (float)((double)f3 + (double)(f4 - f3) * d3);
            fArray[i] = (float)((double)f5 + (double)(f6 - f5) * d4);
        }
        return WeightDemo.N(fArray[0], fArray[1], fArray[2]);
    }

    private static void N(class09755 class097552, int n, double d, BufferedImage bufferedImage, int n2, int n3, int n4) {
        double d2 = d * ((double)n4 / (double)n);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n4; ++j) {
                double d3 = ((double)j + 0.5) * (double)n / (double)n4 - 0.5;
                double d4 = ((double)i + 0.5) * (double)n / (double)n4 - 0.5;
                float f = WeightDemo.N(class097552, d3, d4);
                int n5 = Math.round(WeightDemo.N((float)(d2 * ((double)f - 0.5) + 0.5)) * 255.0f);
                bufferedImage.setRGB(n2 + j, n3 + (n4 - 1 - i), n5 << 16 | n5 << 8 | n5);
            }
        }
    }
}

