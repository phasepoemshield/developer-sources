/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00780
 *  minecraft.class00869
 *  minecraft.class01210
 *  minecraft.class01231
 *  minecraft.class05487
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06391
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class00780;
import minecraft.class00869;
import minecraft.class01210;
import minecraft.class01231;
import minecraft.class01579;
import minecraft.class05487;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class07209;

@Deprecated
public class class01551
extends class06391<class01579> {
    private static final class00500 NE = class00869.mr.W();

    private boolean L(class00500 class005002) {
        return !class005002.N(class01210.Lu);
    }

    public class01551(Codec<class01579> codec) {
        super(codec);
    }

    public boolean N(class06058<class01579> class060582) {
        int n;
        int n2;
        class07209 class072092 = class060582.i();
        class05974 class059742 = class060582.y();
        class06069 class060692 = class060582.u();
        class01579 class015792 = (class01579)class060582.R();
        if (class072092.method_10264() <= class059742.method_31607() + 4) {
            return false;
        }
        class072092 = class072092.method_10087(4);
        boolean[] blArray = new boolean[2048];
        int n3 = class060692.y(4) + 4;
        for (int i = 0; i < n3; ++i) {
            double d = class060692.U() * 6.0 + 3.0;
            double d2 = class060692.U() * 4.0 + 2.0;
            double d3 = class060692.U() * 6.0 + 3.0;
            double d4 = class060692.U() * (16.0 - d - 2.0) + 1.0 + d / 2.0;
            double d5 = class060692.U() * (8.0 - d2 - 4.0) + 2.0 + d2 / 2.0;
            double d6 = class060692.U() * (16.0 - d3 - 2.0) + 1.0 + d3 / 2.0;
            for (int j = 1; j < 15; ++j) {
                for (int k = 1; k < 15; ++k) {
                    for (int i2 = 1; i2 < 7; ++i2) {
                        double d7 = ((double)j - d4) / (d / 2.0);
                        double d8 = ((double)i2 - d5) / (d2 / 2.0);
                        double d9 = ((double)k - d6) / (d3 / 2.0);
                        if (!(d7 * d7 + d8 * d8 + d9 * d9 < 1.0)) continue;
                        blArray[(j * 16 + k) * 8 + i2] = true;
                    }
                }
            }
        }
        class00500 class005002 = class015792.N().N(class060692, class072092);
        for (n2 = 0; n2 < 16; ++n2) {
            for (n = 0; n < 16; ++n) {
                for (int i = 0; i < 8; ++i) {
                    boolean bl;
                    boolean bl2 = bl = !blArray[(n2 * 16 + n) * 8 + i] && (n2 < 15 && blArray[((n2 + 1) * 16 + n) * 8 + i] || n2 > 0 && blArray[((n2 - 1) * 16 + n) * 8 + i] || n < 15 && blArray[(n2 * 16 + n + 1) * 8 + i] || n > 0 && blArray[(n2 * 16 + (n - 1)) * 8 + i] || i < 7 && blArray[(n2 * 16 + n) * 8 + i + 1] || i > 0 && blArray[(n2 * 16 + n) * 8 + (i - 1)]);
                    if (!bl) continue;
                    class00500 class005003 = class059742.method_8320(class072092.method_10069(n2, i, n));
                    if (i >= 4 && class005003.T()) {
                        return false;
                    }
                    if (i >= 4 || class005003.B() || class059742.method_8320(class072092.method_10069(n2, i, n)) == class005002) continue;
                    return false;
                }
            }
        }
        for (n2 = 0; n2 < 16; ++n2) {
            for (n = 0; n < 16; ++n) {
                for (int i = 0; i < 8; ++i) {
                    class07209 class072093;
                    if (!blArray[(n2 * 16 + n) * 8 + i] || !this.L(class059742.method_8320(class072093 = class072092.method_10069(n2, i, n)))) continue;
                    boolean bl = i >= 4;
                    class059742.method_8652(class072093, bl ? NE : class005002, 2);
                    if (!bl) continue;
                    class059742.N(class072093, NE.i(), 0);
                    this.N_59(class059742, class072093);
                }
            }
        }
        class00500 class005004 = class015792.y().N(class060692, class072092);
        if (!class005004.P()) {
            for (n = 0; n < 16; ++n) {
                for (int i = 0; i < 16; ++i) {
                    for (int j = 0; j < 8; ++j) {
                        class00500 class005005;
                        boolean bl;
                        boolean bl3 = bl = !blArray[(n * 16 + i) * 8 + j] && (n < 15 && blArray[((n + 1) * 16 + i) * 8 + j] || n > 0 && blArray[((n - 1) * 16 + i) * 8 + j] || i < 15 && blArray[(n * 16 + i + 1) * 8 + j] || i > 0 && blArray[(n * 16 + (i - 1)) * 8 + j] || j < 7 && blArray[(n * 16 + i) * 8 + j + 1] || j > 0 && blArray[(n * 16 + i) * 8 + (j - 1)]);
                        if (!bl || j >= 4 && class060692.y(2) == 0 || !(class005005 = class059742.method_8320(class072092.method_10069(n, j, i))).B() || class005005.N(class01210.Li)) continue;
                        class07209 class072094 = class072092.method_10069(n, j, i);
                        class059742.method_8652(class072094, class005004, 2);
                        this.N_59(class059742, class072094);
                    }
                }
            }
        }
        if (class005002.Y().N(class01231.N)) {
            for (n = 0; n < 16; ++n) {
                for (int i = 0; i < 16; ++i) {
                    int n4 = 4;
                    class07209 class072095 = class072092.method_10069(n, 4, i);
                    if (!((class00780)class059742.i(class072095).N()).N((class05487)class059742, class072095, false) || !this.L(class059742.method_8320(class072095))) continue;
                    class059742.method_8652(class072095, class00869.iT.W(), 2);
                }
            }
        }
        return true;
    }
}

