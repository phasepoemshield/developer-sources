/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01001
 *  minecraft.class01209
 *  minecraft.class01219
 *  minecraft.class01224
 *  minecraft.class01233
 *  minecraft.class01894
 *  minecraft.class03298
 *  minecraft.class04878
 *  minecraft.class05163
 *  minecraft.class05282
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06993
 *  minecraft.class07001
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class08088
 */
package minecraft;

import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01001;
import minecraft.class01209;
import minecraft.class01219;
import minecraft.class01224;
import minecraft.class01233;
import minecraft.class01894;
import minecraft.class03298;
import minecraft.class04878;
import minecraft.class05163;
import minecraft.class05282;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06993;
import minecraft.class07001;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class08088;

public class class06028
extends class01209 {
    public class06028(class01224 class012242, class01894 class018942, class07209 class072092, class06993 class069932) {
        super(class04878.NL, 0, class012242, class018942, class018942.toString(), class06028.N(class069932), class072092);
    }

    public class06028(class01224 class012242, class07001 class070012) {
        super(class04878.NL, class070012, class012242, class018942 -> class06028.N((class06993)class070012.N_15("Rot", class06993.field_56670).orElseThrow()));
    }

    private void N(class05974 class059742, class06069 class060692, class05163 class051632, class05163 class051633) {
        int n;
        int n2;
        int n3;
        class07209 class072092;
        class06069 class060693 = class06069.y(class059742.method_8412()).L().N(class051632.M());
        if (class060693.z() < 0.5f && class059742.method_8320(class072092 = new class07209(n3 = class051632.B() + class060693.y(class051632.u()), n2 = class051632.Z(), n = class051632.z() + class060693.y(class051632.R()))).P() && class051633.y((class00753)class072092)) {
            class059742.method_8652(class072092, class00869.mu.W().N(class06993.N((class06069)class060693)), 2);
        }
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        class05163 class051633 = this.y.y(this.L, this.u);
        class051632.y(class051633);
        super.N(class059742, class053242, class080882, class060692, class051632, class073212, class072092);
        this.N(class059742, class060692, class051633, class051632);
    }

    protected void N(String string, class07209 class072092, class01001 class010012, class06069 class060692, class05163 class051632) {
    }

    protected void N(class03298 class032982, class07001 class070012) {
        super.N(class032982, class070012);
        class070012.N("Rot", class06993.field_56670, (Object)this.L.u());
    }

    private static class01233 N(class06993 class069932) {
        return new class01233().N(class069932).N(class07111.field_11302).N((class01219)class05282.u);
    }
}

