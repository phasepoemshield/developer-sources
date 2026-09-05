/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00753
 *  minecraft.class01001
 *  minecraft.class01209
 *  minecraft.class01219
 *  minecraft.class01224
 *  minecraft.class01233
 *  minecraft.class01894
 *  minecraft.class03136
 *  minecraft.class03298
 *  minecraft.class05074
 *  minecraft.class05163
 *  minecraft.class05282
 *  minecraft.class05324
 *  minecraft.class05946
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06993
 *  minecraft.class07001
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07321
 *  minecraft.class07830
 *  minecraft.class08088
 */
package minecraft;

import minecraft.class00753;
import minecraft.class01001;
import minecraft.class01209;
import minecraft.class01219;
import minecraft.class01224;
import minecraft.class01233;
import minecraft.class01894;
import minecraft.class03136;
import minecraft.class03298;
import minecraft.class04878;
import minecraft.class04914;
import minecraft.class05074;
import minecraft.class05163;
import minecraft.class05282;
import minecraft.class05324;
import minecraft.class05946;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06993;
import minecraft.class07001;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07321;
import minecraft.class07830;
import minecraft.class08088;

public class class04940
extends class01209 {
    private final boolean i;

    public class04940(class01224 class012242, class01894 class018942, class07209 class072092, class06993 class069932, boolean bl) {
        super(class04878.Ny, 0, class012242, class018942, class018942.toString(), class04940.N(class069932), class072092);
        this.i = bl;
    }

    public class04940(class01224 class012242, class07001 class070012) {
        super(class04878.Ny, class070012, class012242, class018942 -> class04940.N((class06993)class070012.N_15("Rot", class06993.field_56670).orElseThrow()));
        this.i = class070012.y("isBeached", false);
    }

    public boolean y() {
        class00753 class007532 = this.y.N();
        return class007532.method_10263() > 32 || class007532.method_10264() > 32;
    }

    public int N(int n, class06069 class060692) {
        return n - this.y.N().method_10264() / 2 - class060692.y(3);
    }

    public void N(int n) {
        this.u = new class07209(this.u.method_10263(), n, this.u.method_10260());
    }

    protected void N(class03298 class032982, class07001 class070012) {
        super.N(class032982, class070012);
        class070012.N("isBeached", this.i);
        class070012.N("Rot", class06993.field_56670, (Object)this.L.u());
    }

    private static class01233 N(class06993 class069932) {
        return new class01233().N(class069932).N(class07111.field_11302).N(class04914.N).N((class01219)class05282.u);
    }

    protected void N(String string, class07209 class072092, class01001 class010012, class06069 class060692, class05163 class051632) {
        class05946<class05074> var6 = class04914.y.get(string);
        if (var6 != null) {
            class03136.N((class07290)class010012, (class06069)class060692, (class07209)class072092.method_10074(), var6);
        }
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        if (this.y()) {
            super.N(class059742, class053242, class080882, class060692, class051632, class073212, class072092);
            return;
        }
        int n = class059742.method_31600() + 1;
        int n2 = 0;
        class00753 class007532 = this.y.N();
        class07830 class078302 = this.i ? class07830.field_13194 : class07830.field_13195;
        int n3 = class007532.method_10263() * class007532.method_10260();
        if (n3 == 0) {
            n2 = class059742.method_8624(class078302, this.u.method_10263(), this.u.method_10260());
        } else {
            class07209 class072093 = this.u.method_10069(class007532.method_10263() - 1, 0, class007532.method_10260() - 1);
            for (class07209 class072094 : class07209.method_10097((class07209)this.u, (class07209)class072093)) {
                int n4 = class059742.method_8624(class078302, class072094.method_10263(), class072094.method_10260());
                n2 += n4;
                n = Math.min(n, n4);
            }
            n2 /= n3;
        }
        this.N(this.i ? this.N(n, class060692) : n2);
        super.N(class059742, class053242, class080882, class060692, class051632, class073212, class072092);
    }
}

