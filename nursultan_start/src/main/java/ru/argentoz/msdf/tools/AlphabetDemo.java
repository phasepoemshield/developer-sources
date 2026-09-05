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

public final class AlphabetDemo {
    private static final String N = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int y = 13;

    private AlphabetDemo() {
    }

    public static void main(String[] stringArray) throws IOException {
        int n;
        boolean bl;
        String string = stringArray[0];
        int n2 = stringArray.length > 1 ? Integer.parseInt(stringArray[1]) : 48;
        int n3 = stringArray.length > 2 ? Integer.parseInt(stringArray[2]) : 96;
        String string2 = stringArray.length > 3 ? stringArray[3] : "jts";
        String string3 = stringArray.length > 4 ? stringArray[4] : N;
        double d = 6.0;
        boolean bl2 = bl = !string2.equals("none");
        if (bl) {
            class09716.N((class09747)(string2.equals("area") ? class09747.AWT_AREA : class09747.JTS));
        }
        int n4 = string3.length();
        int n5 = (n4 + 13 - 1) / 13;
        BufferedImage bufferedImage = new BufferedImage(13 * n3, n5 * n3, 1);
        for (int i = 0; i < bufferedImage.getHeight(); ++i) {
            for (n = 0; n < bufferedImage.getWidth(); ++n) {
                bufferedImage.setRGB(n, i, n % n3 == 0 || i % n3 == 0 ? 0x202020 : 0);
            }
        }
        try (Object object = class09745.N((String)string);){
            object.N(bl);
            for (n = 0; n < n4; ++n) {
                char c = string3.charAt(n);
                if (object.N((int)c) == 0) continue;
                AlphabetDemo.N(object.N((int)c, n2, n2, d), n2, d, bufferedImage, n % 13 * n3, n / 13 * n3, n3);
            }
        }
        object = Path.of("build", "glyph-demo");
        Files.createDirectories((Path)object, new FileAttribute[0]);
        File file = object.resolve("alphabet-" + string2 + ".png").toFile();
        ImageIO.write((RenderedImage)bufferedImage, "png", file);
        System.out.println("Wrote " + file.getAbsolutePath() + "  (" + string2 + ", sdf=" + n2 + ")");
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
            float f = AlphabetDemo.N(class097552, n, n2, i);
            float f2 = AlphabetDemo.N(class097552, n + 1, n2, i);
            float f3 = AlphabetDemo.N(class097552, n, n2 + 1, i);
            float f4 = AlphabetDemo.N(class097552, n + 1, n2 + 1, i);
            float f5 = (float)((double)f + (double)(f2 - f) * d3);
            float f6 = (float)((double)f3 + (double)(f4 - f3) * d3);
            fArray[i] = (float)((double)f5 + (double)(f6 - f5) * d4);
        }
        return AlphabetDemo.N(fArray[0], fArray[1], fArray[2]);
    }

    private static void N(class09755 class097552, int n, double d, BufferedImage bufferedImage, int n2, int n3, int n4) {
        double d2 = d * ((double)n4 / (double)n);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n4; ++j) {
                double d3 = ((double)j + 0.5) * (double)n / (double)n4 - 0.5;
                double d4 = ((double)i + 0.5) * (double)n / (double)n4 - 0.5;
                float f = AlphabetDemo.N(class097552, d3, d4);
                int n5 = Math.round(AlphabetDemo.N((float)(d2 * ((double)f - 0.5) + 0.5)) * 255.0f);
                bufferedImage.setRGB(n2 + j, n3 + (n4 - 1 - i), n5 << 16 | n5 << 8 | n5);
            }
        }
    }
}

