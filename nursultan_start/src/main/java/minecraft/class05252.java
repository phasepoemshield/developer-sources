/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01001
 *  minecraft.class03298
 *  minecraft.class04878
 *  minecraft.class04890
 *  minecraft.class05163
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06273
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07321
 *  minecraft.class07830
 *  minecraft.class08088
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01001;
import minecraft.class03298;
import minecraft.class04878;
import minecraft.class04890;
import minecraft.class05163;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06273;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07321;
import minecraft.class07830;
import minecraft.class08088;

public class class05252
extends class04890 {
    public class05252(class07209 class072092) {
        super(class04878.NN, 0, new class05163(class072092));
    }

    public class05252(class07001 class070012) {
        super(class04878.NN, class070012);
    }

    private boolean y(class00500 class005002) {
        return class005002 == class00869.K.W() || class005002 == class00869.V.W();
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        int n = class059742.method_8624(class07830.field_13195, this.k.B(), this.k.z());
        class07218 class072182 = new class07218(this.k.B(), n, this.k.z());
        while (class072182.method_10264() > class059742.method_31607()) {
            class00500 class005002 = class059742.method_8320((class07209)class072182);
            class00500 class005003 = class059742.method_8320(class072182.method_10074());
            if (class005003 == class00869.yL.W() || class005003 == class00869.y.W() || class005003 == class00869.M.W() || class005003 == class00869.L.W() || class005003 == class00869.i.W()) {
                class00500 class005004 = class005002.P() || this.y(class005002) ? class00869.e.W() : class005002;
                for (class07211 class072112 : class07211.values()) {
                    class07209 class072093 = class072182.method_10093(class072112);
                    class00500 class005005 = class059742.method_8320(class072093);
                    if (!class005005.P() && !this.y(class005005)) continue;
                    class07209 class072094 = class072093.method_10074();
                    class00500 class005006 = class059742.method_8320(class072094);
                    if ((class005006.P() || this.y(class005006)) && class072112 != class07211.field_11036) {
                        class059742.method_8652(class072093, class005003, 3);
                        continue;
                    }
                    class059742.method_8652(class072093, class005004, 3);
                }
                this.k = new class05163((class07209)class072182);
                this.N((class01001)class059742, class051632, class060692, (class07209)class072182, class06273.I, null);
                return;
            }
            class072182.y(0, -1, 0);
        }
    }

    protected void N(class03298 class032982, class07001 class070012) {
    }
}

