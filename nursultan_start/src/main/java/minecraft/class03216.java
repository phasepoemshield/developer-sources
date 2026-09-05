/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01817
 *  minecraft.class03865
 *  minecraft.class03877
 *  minecraft.class07209
 */
package minecraft;

import java.util.List;
import minecraft.class01817;
import minecraft.class03195;
import minecraft.class03222;
import minecraft.class03229;
import minecraft.class03231;
import minecraft.class03865;
import minecraft.class03877;
import minecraft.class07209;

public class class03216 {
    private static final boolean y = false;
    private static final float L = 10000.0f;
    protected static final int N = 7;

    public static long N(float f) {
        return (long)(f * 10000.0f);
    }

    public static float N(long l) {
        return (float)l / 10000.0f;
    }

    public static class03222 N() {
        class03877 class038772 = class03865.N();
        return new class03222(class038772, class038772, class038772, class038772, class038772, class038772, List.of());
    }

    public static class07209 N(List<class03229> list, class03222 class032222) {
        return new class01817(list, (class03222)class032222).N.N();
    }

    public static class03229 N(class03195 class031952, class03195 class031953, class03195 class031954, class03195 class031955, class03195 class031956, class03195 class031957, float f) {
        return new class03229(class031952, class031953, class031954, class031955, class031956, class031957, class03216.N(f));
    }

    public static class03229 N(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        return new class03229(class03195.N(f), class03195.N(f2), class03195.N(f3), class03195.N(f4), class03195.N(f5), class03195.N(f6), class03216.N(f7));
    }

    public static class03231 N(float f, float f2, float f3, float f4, float f5, float f6) {
        return new class03231(class03216.N(f), class03216.N(f2), class03216.N(f3), class03216.N(f4), class03216.N(f5), class03216.N(f6));
    }
}

