/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09719
 *  Nursultan.class09731
 *  Nursultan.class09734
 *  Nursultan.class09735
 *  Nursultan.class09742
 */
package ru.argentoz.msdf.tools;

import Nursultan.class09719;
import Nursultan.class09731;
import Nursultan.class09734;
import Nursultan.class09735;
import Nursultan.class09742;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.imageio.ImageIO;

public final class AtlasDemo {
    private AtlasDemo() {
    }

    public static void main(String[] stringArray) throws Exception {
        String string;
        String string2 = string = stringArray.length > 0 ? stringArray[0] : AtlasDemo.N();
        if (string == null) {
            System.err.println("No font given and none found under C:\\Windows\\Fonts.");
            return;
        }
        String string3 = stringArray.length > 1 ? stringArray[1] : "Hello MSDF \u2014 AVA Wave 123";
        float f = stringArray.length > 2 ? Float.parseFloat(stringArray[2]) : 48.0f;
        class09734 class097342 = new class09734(class09735.MTSDF, 40.0, 6.0, 256, 8192);
        byte[] byArray = Files.readAllBytes(Path.of(string, new String[0]));
        byte[] byArray2 = null;
        int n = 0;
        int n2 = 0;
        try (ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();
             class09742 class097422 = class09742.N((byte[])byArray, (class09734)class097342, (Executor)executorService);){
            Object object;
            string3.codePoints().forEach(arg_0 -> ((class09742)class097422).N(arg_0));
            long l = System.nanoTime() + 15000000000L;
            boolean bl = false;
            while (System.nanoTime() < l && !bl) {
                object = class097422.N();
                if (object.y()) {
                    n = object.L();
                    n2 = object.u();
                    byArray2 = new byte[n * n2 * object.i()];
                }
                if (object.N() && byArray2 != null) {
                    AtlasDemo.N((class09731)object, class097422.L(), class097422.u(), byArray2, n);
                }
                if (bl = AtlasDemo.N(class097422, string3, f)) continue;
                Thread.sleep(4L);
            }
            if (byArray2 == null) {
                n = class097422.u();
                n2 = class097422.i();
                byArray2 = new byte[n * n2 * class097422.R()];
                AtlasDemo.N(class097422.L(), class097422.u(), byArray2, n, 0, 0, n, n2, class097422.R());
            }
            if (!bl) {
                System.err.println("Warning: not all glyphs baked within the timeout.");
            }
            object = Path.of("build", "atlas-demo");
            Files.createDirectories((Path)object, new FileAttribute[0]);
            AtlasDemo.N(byArray2, n, n2, object.resolve("atlas.png"));
            AtlasDemo.N(class097422, string3, f, byArray2, n, n2, object.resolve("text.png"));
            System.out.println("Wrote " + String.valueOf(object.resolve("atlas.png")) + " (" + n + "x" + n2 + ")");
            System.out.println("Wrote " + String.valueOf(object.resolve("text.png")));
        }
    }

    private static float N(byte[] byArray, int n, int n2, int n3) {
        int n4 = (n3 * n + n2) * 4;
        float f = (float)(byArray[n4] & 0xFF) / 255.0f;
        float f2 = (float)(byArray[n4 + 1] & 0xFF) / 255.0f;
        float f3 = (float)(byArray[n4 + 2] & 0xFF) / 255.0f;
        return Math.max(Math.min(f, f2), Math.min(Math.max(f, f2), f3));
    }

    private static float N(float f, float f2, float f3) {
        return f + (f2 - f) * f3;
    }

    private static float N(float f) {
        return f < 0.0f ? 0.0f : (f > 1.0f ? 1.0f : f);
    }

    private static int N(int n, int n2, int n3) {
        return n < n2 ? n2 : (n > n3 ? n3 : n);
    }

    private static String N() {
        for (String string : new String[]{"arial.ttf", "segoeui.ttf", "tahoma.ttf", "times.ttf"}) {
            Path path = Path.of("C:\\Windows\\Fonts", string);
            if (!Files.isRegularFile(path, new LinkOption[0])) continue;
            return path.toString();
        }
        return null;
    }

    private static boolean N(class09742 class097422, String string, float f) {
        class09719 class097192 = new class09719();
        return string.codePoints().allMatch(n -> class097422.N(n, f, class097192));
    }

    private static void N(class09731 class097312, ByteBuffer byteBuffer, int n, byte[] byArray, int n2) {
        for (int i = 0; i < class097312.M(); ++i) {
            AtlasDemo.N(byteBuffer, n, byArray, n2, class097312.N(i), class097312.y(i), class097312.L(i), class097312.u(i), class097312.i());
        }
    }

    private static void N(ByteBuffer byteBuffer, int n, byte[] byArray, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = n5 * n7;
        for (int i = 0; i < n6; ++i) {
            int n9 = ((n4 + i) * n + n3) * n7;
            int n10 = ((n4 + i) * n2 + n3) * n7;
            byteBuffer.get(n9, byArray, n10, n8);
        }
    }

    private static void N(byte[] byArray, int n, int n2, Path path) throws Exception {
        BufferedImage bufferedImage = new BufferedImage(n, n2, 2);
        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < n; ++j) {
                int n3 = (i * n + j) * 4;
                int n4 = byArray[n3] & 0xFF;
                int n5 = byArray[n3 + 1] & 0xFF;
                int n6 = byArray[n3 + 2] & 0xFF;
                bufferedImage.setRGB(j, n2 - 1 - i, 0xFF000000 | n4 << 16 | n5 << 8 | n6);
            }
        }
        ImageIO.write((RenderedImage)bufferedImage, "png", path.toFile());
    }

    private static void N(class09742 class097422, String string, float f, byte[] byArray, int n, int n2, Path path) throws Exception {
        double d = 0.0;
        int n3 = 0;
        class09719 class097192 = new class09719();
        for (int n4 : string.codePoints().toArray()) {
            if (n3 != 0) {
                d += class097422.N(n3, n4) * (double)f;
            }
            if (class097422.N(n4, f, class097192)) {
                d += (double)class097192.Z;
            }
            n3 = n4;
        }
        int n5 = Math.round(f * 0.4f);
        int n6 = Math.max(1, (int)Math.ceil(d) + 2 * n5);
        int n7 = Math.round(f * 1.6f);
        float f2 = (float)Math.round(class097422.z().N() * (double)f) + (float)n5 * 0.5f;
        BufferedImage bufferedImage = new BufferedImage(n6, n7, 2);
        for (int i = 0; i < n6 * n7; ++i) {
            bufferedImage.setRGB(i % n6, i / n6, -1);
        }
        float f3 = n5;
        n3 = 0;
        for (int n8 : string.codePoints().toArray()) {
            if (n3 != 0) {
                f3 = (float)((double)f3 + class097422.N(n3, n8) * (double)f);
            }
            n3 = n8;
            if (!class097422.N(n8, f, class097192)) continue;
            if (class097192.M <= class097192.i) {
                f3 += class097192.Z;
                continue;
            }
            float f4 = f3 + class097192.N;
            float f5 = f3 + class097192.L;
            float f6 = f2 - class097192.u;
            float f7 = f2 - class097192.y;
            int n9 = Math.max(0, (int)Math.floor(f4));
            int n10 = Math.min(n6, (int)Math.ceil(f5));
            int n11 = Math.max(0, (int)Math.floor(f6));
            int n12 = Math.min(n7, (int)Math.ceil(f7));
            for (int i = n11; i < n12; ++i) {
                for (int j = n9; j < n10; ++j) {
                    float f8 = ((float)j + 0.5f - f4) / (f5 - f4);
                    float f9 = class097192.i + f8 * (class097192.M - class097192.i);
                    float f10 = (f2 - ((float)i + 0.5f) - class097192.y) / (class097192.u - class097192.y);
                    float f11 = class097192.R + f10 * (class097192.B - class097192.R);
                    float f12 = AtlasDemo.N(byArray, n, n2, f9, f11);
                    float f13 = AtlasDemo.N(class097192.z * (f12 - 0.5f) + 0.5f);
                    if (f13 <= 0.0f) continue;
                    int n13 = bufferedImage.getRGB(j, i);
                    int n14 = n13 >> 16 & 0xFF;
                    int n15 = n13 >> 8 & 0xFF;
                    int n16 = n13 & 0xFF;
                    int n17 = Math.round((float)n14 * (1.0f - f13));
                    int n18 = Math.round((float)n15 * (1.0f - f13));
                    int n19 = Math.round((float)n16 * (1.0f - f13));
                    bufferedImage.setRGB(j, i, 0xFF000000 | n17 << 16 | n18 << 8 | n19);
                }
            }
            f3 += class097192.Z;
        }
        ImageIO.write((RenderedImage)bufferedImage, "png", path.toFile());
    }

    private static float N(byte[] byArray, int n, int n2, float f, float f2) {
        float f3 = f * (float)n - 0.5f;
        float f4 = f2 * (float)n2 - 0.5f;
        int n3 = AtlasDemo.N((int)Math.floor(f3), 0, n - 1);
        int n4 = AtlasDemo.N(n3 + 1, 0, n - 1);
        int n5 = AtlasDemo.N((int)Math.floor(f4), 0, n2 - 1);
        int n6 = AtlasDemo.N(n5 + 1, 0, n2 - 1);
        float f5 = AtlasDemo.N(f3 - (float)Math.floor(f3));
        float f6 = AtlasDemo.N(f4 - (float)Math.floor(f4));
        float f7 = AtlasDemo.N(byArray, n, n3, n5);
        float f8 = AtlasDemo.N(byArray, n, n4, n5);
        float f9 = AtlasDemo.N(byArray, n, n3, n6);
        float f10 = AtlasDemo.N(byArray, n, n4, n6);
        return AtlasDemo.N(AtlasDemo.N(f7, f8, f5), AtlasDemo.N(f9, f10, f5), f6);
    }
}

