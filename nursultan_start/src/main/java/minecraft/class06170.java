/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02875
 *  minecraft.class03557
 *  minecraft.class03927
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05212
 *  minecraft.class05372
 *  minecraft.class05487
 *  minecraft.class05975
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07305
 *  minecraft.class07448
 *  minecraft.class07830
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class02875;
import minecraft.class03557;
import minecraft.class03927;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05212;
import minecraft.class05372;
import minecraft.class05487;
import minecraft.class05975;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06163;
import minecraft.class06179;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07305;
import minecraft.class07448;
import minecraft.class07830;
import org.jspecify.annotations.Nullable;

public class class06170
implements class05975 {
    private static final int y = 1200;
    public static final int N = 24000;
    private static final int L = 25;
    private static final int u = 75;
    private static final int i = 25;
    private static final int R = 10;
    private static final int M = 10;
    private final class06069 B = class06069.u();
    private final class05212 Z;
    private int z;
    private int U;
    private int E;

    public class06170(class05212 class052122) {
        this.Z = class052122;
        this.z = 1200;
        this.U = class052122.j();
        this.E = class052122.v();
        if (this.U == 0 && this.E == 0) {
            this.U = 24000;
            class052122.u(this.U);
            this.E = 25;
            class052122.i(this.E);
        }
    }

    private @Nullable class07209 N(class05487 class054872, class07209 class072092, int n) {
        class07209 class072093 = null;
        class02875 class028752 = class07448.N((class07078)class07078.yc);
        for (int i = 0; i < 10; ++i) {
            int n2;
            int n3;
            int n4 = class072092.method_10263() + this.B.y(n * 2) - n;
            class07209 class072094 = new class07209(n4, n3 = class054872.method_8624(class07830.field_13202, n4, n2 = class072092.method_10260() + this.B.y(n * 2) - n), n2);
            if (!class028752.isSpawnPositionOk(class054872, class072094, class07078.yc)) continue;
            class072093 = class072094;
            break;
        }
        return class072093;
    }

    private boolean N(class07290 class072902, class07209 class072092) {
        for (class07209 class072093 : class07209.method_10097((class07209)class072092, (class07209)class072092.method_10069(1, 2, 1))) {
            if (class072902.method_8320(class072093).M(class072902, class072093).method_1110()) continue;
            return false;
        }
        return true;
    }

    private void N(class04782 class047822, class06163 class061632, int n) {
        class07209 class072092 = this.N((class05487)class047822, class061632.method_24515(), n);
        if (class072092 == null) {
            return;
        }
        class06179 class061792 = (class06179)class07078.yJ.N(class047822, class072092, class06113.field_16467);
        if (class061792 == null) {
            return;
        }
        class061792.N((class07049)class061632, true);
    }

    private boolean N(class04782 class047822) {
        class04770 class047702 = class047822.method_18779();
        if (class047702 == null) {
            return true;
        }
        if (this.B.y(10) != 0) {
            return false;
        }
        class07209 class072093 = class047702.method_24515();
        int n = 48;
        class07209 class072094 = class047822.method_19494().u(class035562 -> class035562.N(class03927.P), class072092 -> true, class072093, 48, class05372.field_18489).orElse(class072093);
        class07209 class072095 = this.N((class05487)class047822, class072094, 48);
        if (class072095 != null && this.N((class07290)class047822, class072095)) {
            if (class047822.i(class072095).N(class03557.NL)) {
                return false;
            }
            class06163 class061632 = (class06163)class07078.yc.N(class047822, class072095, class06113.field_16467);
            if (class061632 != null) {
                for (int i = 0; i < 2; ++i) {
                    this.N(class047822, class061632, 4);
                }
                this.Z.N(class061632.method_5667());
                class061632.y(48000);
                class061632.N(class072094);
                class061632.N(class072094, 16);
                return true;
            }
        }
        return false;
    }

    public void N(class04782 class047822, boolean bl) {
        if (!((Boolean)class047822.method_64395().N(class07305.r)).booleanValue()) {
            return;
        }
        if (--this.z > 0) {
            return;
        }
        this.z = 1200;
        this.U -= 1200;
        this.Z.u(this.U);
        if (this.U > 0) {
            return;
        }
        this.U = 24000;
        int n = this.E;
        this.E = class04995.N((int)(this.E + 25), (int)25, (int)75);
        this.Z.i(this.E);
        if (this.B.y(100) > n) {
            return;
        }
        if (this.N(class047822)) {
            this.E = 25;
        }
    }
}

