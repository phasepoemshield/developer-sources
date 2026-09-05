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
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import javax.imageio.ImageIO;

public final class GlyphPngDemo {
    private GlyphPngDemo() {
    }

    public static void main(String[] stringArray) throws IOException {
        String string;
        String string2 = string = stringArray.length > 0 ? stringArray[0] : GlyphPngDemo.N();
        if (string == null) {
            System.err.println("No system font found; pass a font path as the first argument.");
            System.exit(1);
        }
        int n = stringArray.length > 1 && !stringArray[1].isEmpty() ? stringArray[1].codePointAt(0) : 65;
        int n2 = stringArray.length > 2 ? Integer.parseInt(stringArray[2]) : 32;
        int n3 = stringArray.length > 3 ? Integer.parseInt(stringArray[3]) : 512;
        double d = 6.0;
        Path path = Path.of("build", "glyph-demo");
        Files.createDirectories(path, new FileAttribute[0]);
        try (class09745 class097452 = class09745.N((String)string);){
            class09755 class097552 = class097452.N(n, n2, n2, d);
            int n4 = Math.max(1, n3 / n2);
            GlyphPngDemo.N(class097552, path.resolve("msdf-raw.png").toFile(), n4);
            GlyphPngDemo.N(class097552, path.resolve("glyph-render.png").toFile(), n3, d);
            System.out.println("char='" + new String(Character.toChars(n)) + "' sdf=" + n2 + " out=" + n3 + " advance=" + class097552.i());
            System.out.println("Wrote: " + String.valueOf(path.toAbsolutePath()));
            System.out.println("  msdf-raw.png      (native 3-channel MSDF, nearest x" + n4 + ")");
            System.out.println("  glyph-render.png  (median + screen-px-range anti-aliasing)");
        }
    }

    private static int y(float f) {
        return Math.max(0, Math.min(255, Math.round(f * 255.0f)));
    }

    private static String N() {
        for (String string : new String[]{"arial.ttf", "segoeui.ttf", "tahoma.ttf", "verdana.ttf", "times.ttf"}) {
            Path path = Path.of("C:\\Windows\\Fonts", string);
            if (!Files.isRegularFile(path, new LinkOption[0])) continue;
            return path.toString();
        }
        return null;
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
            float f = GlyphPngDemo.N(class097552, n, n2, i);
            float f2 = GlyphPngDemo.N(class097552, n + 1, n2, i);
            float f3 = GlyphPngDemo.N(class097552, n, n2 + 1, i);
            float f4 = GlyphPngDemo.N(class097552, n + 1, n2 + 1, i);
            float f5 = (float)((double)f + (double)(f2 - f) * d3);
            float f6 = (float)((double)f3 + (double)(f4 - f3) * d3);
            fArray[i] = (float)((double)f5 + (double)(f6 - f5) * d4);
        }
        return GlyphPngDemo.N(fArray[0], fArray[1], fArray[2]);
    }

    private static float N(float f, float f2, float f3) {
        return Math.max(Math.min(f, f2), Math.min(Math.max(f, f2), f3));
    }

    private static float N(float f) {
        return f < 0.0f ? 0.0f : (f > 1.0f ? 1.0f : f);
    }

    private static void N(class09755 class097552, File file, int n) throws IOException {
        BufferedImage bufferedImage = new BufferedImage(class097552.y() * n, class097552.L() * n, 1);
        for (int i = 0; i < class097552.L(); ++i) {
            for (int j = 0; j < class097552.y(); ++j) {
                int n2 = GlyphPngDemo.y(class097552.N(j, i, 0));
                int n3 = GlyphPngDemo.y(class097552.N(j, i, 1));
                int n4 = GlyphPngDemo.y(class097552.N(j, i, 2));
                int n5 = n2 << 16 | n3 << 8 | n4;
                int n6 = class097552.L() - 1 - i;
                for (int k = 0; k < n; ++k) {
                    for (int i2 = 0; i2 < n; ++i2) {
                        bufferedImage.setRGB(j * n + i2, n6 * n + k, n5);
                    }
                }
            }
        }
        ImageIO.write((RenderedImage)bufferedImage, "png", file);
    }

    private static void N(class09755 class097552, File file, int n, double d) throws IOException {
        double d2 = d * ((double)n / (double)class097552.y());
        BufferedImage bufferedImage = new BufferedImage(n, n, 1);
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                double d3 = ((double)j + 0.5) * (double)class097552.y() / (double)n - 0.5;
                double d4 = ((double)i + 0.5) * (double)class097552.L() / (double)n - 0.5;
                float f = GlyphPngDemo.N(class097552, d3, d4);
                int n2 = Math.round(GlyphPngDemo.N((float)(d2 * ((double)f - 0.5) + 0.5)) * 255.0f);
                bufferedImage.setRGB(j, n - 1 - i, n2 << 16 | n2 << 8 | n2);
            }
        }
        ImageIO.write((RenderedImage)bufferedImage, "png", file);
    }
}

