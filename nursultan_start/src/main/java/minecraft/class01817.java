/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01146
 *  minecraft.class01845
 *  minecraft.class03222
 *  minecraft.class03229
 *  minecraft.class03231
 *  minecraft.class04995
 *  minecraft.class07209
 */
package minecraft;

import java.util.List;
import minecraft.class01146;
import minecraft.class01845;
import minecraft.class03222;
import minecraft.class03229;
import minecraft.class03231;
import minecraft.class04995;
import minecraft.class07209;

class class01817 {
    private static final long y = 2048L;
    class01845 N;

    class01817(List<class03229> list, class03222 class032222) {
        this.N = class01817.N(list, class032222, 0, 0);
        this.N(list, class032222, 2048.0f, 512.0f);
        this.N(list, class032222, 512.0f, 32.0f);
    }

    private void N(List<class03229> list, class03222 class032222, float f, float f2) {
        float f3 = 0.0f;
        float f4 = f2;
        class07209 class072092 = this.N.N();
        while (f4 <= f) {
            int n;
            int n2 = class072092.method_10263() + (int)(Math.sin(f3) * (double)f4);
            class01845 class018452 = class01817.N(list, class032222, n2, n = class072092.method_10260() + (int)(Math.cos(f3) * (double)f4));
            if (class018452.y() < this.N.y()) {
                this.N = class018452;
            }
            if (!((double)(f3 += f2 / f4) > Math.PI * 2)) continue;
            f3 = 0.0f;
            f4 += f2;
        }
    }

    private static class01845 N(List<class03229> list, class03222 class032222, int n, int n2) {
        class03231 class032312 = class032222.N(class01146.N((int)n), 0, class01146.N((int)n2));
        class03231 class032313 = new class03231(class032312.y(), class032312.L(), class032312.u(), class032312.i(), 0L, class032312.M());
        long l = Long.MAX_VALUE;
        for (class03229 class032292 : list) {
            l = Math.min(l, class032292.N(class032313));
        }
        long l2 = class04995.y((long)n) + class04995.y((long)n2);
        long l3 = l * class04995.y((long)2048L) + l2;
        return new class01845(new class07209(n, 0, n2), l3);
    }
}

