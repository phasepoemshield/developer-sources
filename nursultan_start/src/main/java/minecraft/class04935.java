/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00379
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00860
 *  minecraft.class00869
 *  minecraft.class01001
 *  minecraft.class01201
 *  minecraft.class01207
 *  minecraft.class01209
 *  minecraft.class01210
 *  minecraft.class01219
 *  minecraft.class01224
 *  minecraft.class01231
 *  minecraft.class01233
 *  minecraft.class01894
 *  minecraft.class03298
 *  minecraft.class04688
 *  minecraft.class05163
 *  minecraft.class05282
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06273
 *  minecraft.class06993
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07541
 *  minecraft.class07830
 *  minecraft.class08088
 *  minecraft.class08092
 */
package minecraft;

import minecraft.class00379;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00860;
import minecraft.class00869;
import minecraft.class01001;
import minecraft.class01201;
import minecraft.class01207;
import minecraft.class01209;
import minecraft.class01210;
import minecraft.class01219;
import minecraft.class01224;
import minecraft.class01231;
import minecraft.class01233;
import minecraft.class01894;
import minecraft.class03298;
import minecraft.class04688;
import minecraft.class04878;
import minecraft.class04902;
import minecraft.class04939;
import minecraft.class05163;
import minecraft.class05282;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06273;
import minecraft.class06993;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07541;
import minecraft.class07830;
import minecraft.class08088;
import minecraft.class08092;

public class class04935
extends class01209 {
    private final class04902 i;
    private final float R;
    private final boolean M;

    public class04935(class01224 class012242, class01894 class018942, class07209 class072092, class06993 class069932, float f, class04902 class049022, boolean bl) {
        super(class04878.o, 0, class012242, class018942, class018942.toString(), class04935.N(class069932, f, class049022), class072092);
        this.R = f;
        this.i = class049022;
        this.M = bl;
    }

    private class04935(class01224 class012242, class07001 class070012, class06993 class069932, float f, class04902 class049022, boolean bl) {
        super(class04878.o, class070012, class012242, class018942 -> class04935.N(class069932, f, class049022));
        this.R = f;
        this.i = class049022;
        this.M = bl;
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        int n = class059742.method_8624(class07830.field_13195, this.u.method_10263(), this.u.method_10260());
        this.u = new class07209(this.u.method_10263(), n, this.u.method_10260());
        class07209 class072093 = class01207.N((class07209)new class07209(this.y.N().method_10263() - 1, 0, this.y.N().method_10260() - 1), (class07111)class07111.field_11302, (class06993)this.L.u(), (class07209)class07209.field_10980).method_10081((class00753)this.u);
        this.u = new class07209(this.u.method_10263(), this.N(this.u, (class07290)class059742, class072093), this.u.method_10260());
        super.N(class059742, class053242, class080882, class060692, class051632, class073212, class072092);
    }

    protected void N(String string, class07209 class072092, class01001 class010012, class06069 class060692, class05163 class051632) {
        class07541 class075412;
        if ("chest".equals(string)) {
            class010012.method_8652(class072092, (class00500)class00869.LA.W().y((class08092)class00860.R, (Comparable)Boolean.valueOf(class010012.method_8316(class072092).N(class01231.N))), 2);
            class00394 class003942 = class010012.method_8321(class072092);
            if (class003942 instanceof class00379) {
                ((class00379)class003942).N(this.M ? class06273.g : class06273.O, class060692.B());
            }
        } else if ("drowned".equals(string) && (class075412 = (class07541)class07078.X.N((class07299)class010012.method_8410(), class06113.field_16474)) != null) {
            class075412.NW();
            class075412.method_5725(class072092, 0.0f, 0.0f);
            class075412.N(class010012, class010012.method_8404(class072092), class06113.field_16474, null);
            class010012.y((class07049)class075412);
            if (class072092.method_10264() > class010012.method_8615()) {
                class010012.method_8652(class072092, class00869.N.W(), 2);
            } else {
                class010012.method_8652(class072092, class00869.K.W(), 2);
            }
        }
    }

    private int N(class07209 class072092, class07290 class072902, class07209 class072093) {
        int n = class072092.method_10264();
        int n2 = 512;
        int n3 = n - 1;
        int n4 = 0;
        for (class07209 class072094 : class07209.method_10097((class07209)class072092, (class07209)class072093)) {
            int n5 = class072094.method_10263();
            int n6 = class072094.method_10260();
            int n7 = class072092.method_10264() - 1;
            class07218 class072182 = new class07218(n5, n7, n6);
            class00500 class005002 = class072902.method_8320((class07209)class072182);
            class04688 class046882 = class072902.method_8316((class07209)class072182);
            while ((class005002.P() || class046882.N(class01231.N) || class005002.N(class01210.NQ)) && n7 > class072902.method_31607() + 1) {
                class072182.N(n5, --n7, n6);
                class005002 = class072902.method_8320((class07209)class072182);
                class046882 = class072902.method_8316((class07209)class072182);
            }
            n2 = Math.min(n2, n7);
            if (n7 >= n3 - 2) continue;
            ++n4;
        }
        int n8 = Math.abs(class072092.method_10263() - class072093.method_10263());
        if (n3 - n2 > 2 && n4 > n8 - 2) {
            n = n2 + 1;
        }
        return n;
    }

    protected void N(class03298 class032982, class07001 class070012) {
        super.N(class032982, class070012);
        class070012.N("Rot", class06993.field_56670, (Object)this.L.u());
        class070012.N("Integrity", this.R);
        class070012.N("BiomeType", class04902.field_56682, (Object)this.i);
        class070012.N("IsLarge", this.M);
    }

    public static class04935 N(class01224 class012242, class07001 class070012) {
        class06993 class069932 = (class06993)class070012.N_15("Rot", class06993.field_56670).orElseThrow();
        float f = class070012.y("Integrity", 0.0f);
        class04902 class049022 = (class04902)((Object)class070012.N_15("BiomeType", class04902.field_56682).orElseThrow());
        boolean bl = class070012.y("IsLarge", false);
        return new class04935(class012242, class070012, class069932, f, class049022, bl);
    }

    private static class01233 N(class06993 class069932, float f, class04902 class049022) {
        class01219 class012192 = class049022 == class04902.field_14528 ? class04939.y : class04939.N;
        return new class01233().N(class069932).N(class07111.field_11302).N((class01219)new class01201(f)).N((class01219)class05282.u).N(class012192);
    }
}

