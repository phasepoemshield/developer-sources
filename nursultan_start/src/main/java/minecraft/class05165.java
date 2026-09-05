/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00379
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01001
 *  minecraft.class01207
 *  minecraft.class01209
 *  minecraft.class01219
 *  minecraft.class01224
 *  minecraft.class01233
 *  minecraft.class01894
 *  minecraft.class02610
 *  minecraft.class03298
 *  minecraft.class04878
 *  minecraft.class05282
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06273
 *  minecraft.class06993
 *  minecraft.class07001
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class07830
 *  minecraft.class08088
 */
package minecraft;

import minecraft.class00379;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01001;
import minecraft.class01207;
import minecraft.class01209;
import minecraft.class01219;
import minecraft.class01224;
import minecraft.class01233;
import minecraft.class01894;
import minecraft.class02610;
import minecraft.class03298;
import minecraft.class04878;
import minecraft.class05163;
import minecraft.class05173;
import minecraft.class05282;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06273;
import minecraft.class06993;
import minecraft.class07001;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07830;
import minecraft.class08088;

public class class05165
extends class01209 {
    public class05165(class01224 class012242, class01894 class018942, class07209 class072092, class06993 class069932, int n) {
        super(class04878.q, 0, class012242, class018942, class018942.toString(), class05165.N(class069932, class018942), class05165.N(class018942, class072092, n));
    }

    public class05165(class01224 class012242, class07001 class070012) {
        super(class04878.q, class070012, class012242, class018942 -> class05165.N((class06993)class070012.N_15("Rot", class06993.field_56670).orElseThrow(), class018942));
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        class07209 class072093;
        class00500 class005002;
        class01894 class018942 = class01894.N((String)this.N);
        class01233 class012332 = class05165.N(this.L.u(), class018942);
        class07209 class072094 = class05173.u.get(class018942);
        class07209 class072095 = this.u.method_10081((class00753)class01207.N((class01233)class012332, (class07209)new class07209(3 - class072094.method_10263(), 0, -class072094.method_10260())));
        int n = class059742.method_8624(class07830.field_13194, class072095.method_10263(), class072095.method_10260());
        class07209 class072096 = this.u;
        this.u = this.u.method_10069(0, n - 90 - 1, 0);
        super.N(class059742, class053242, class080882, class060692, class051632, class073212, class072092);
        if (class018942.equals((Object)class05173.y) && !(class005002 = class059742.method_8320((class072093 = this.u.method_10081((class00753)class01207.N((class01233)class012332, (class07209)new class07209(3, 0, 5)))).method_10074())).P() && !class005002.N(class00869.uW)) {
            class059742.method_8652(class072093, class00869.ib.W(), 3);
        }
        this.u = class072096;
    }

    protected void N(String string, class07209 class072092, class01001 class010012, class06069 class060692, class05163 class051632) {
        if (!"chest".equals(string)) {
            return;
        }
        class010012.method_8652(class072092, class00869.N.W(), 3);
        class00394 class003942 = class010012.method_8321(class072092.method_10074());
        if (class003942 instanceof class00379) {
            ((class00379)class003942).N(class06273.Y, class060692.B());
        }
    }

    protected void N(class03298 class032982, class07001 class070012) {
        super.N(class032982, class070012);
        class070012.N("Rot", class06993.field_56670, (Object)this.L.u());
    }

    private static class07209 N(class01894 class018942, class07209 class072092, int n) {
        return class072092.method_10081((class00753)class05173.u.get(class018942)).method_10087(n);
    }

    private static class01233 N(class06993 class069932, class01894 class018942) {
        return new class01233().N(class069932).N(class07111.field_11302).N(class05173.L.get(class018942)).N((class01219)class05282.y).N(class02610.field_52237);
    }
}

