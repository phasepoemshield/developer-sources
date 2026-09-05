/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00807
 *  minecraft.class00869
 *  minecraft.class03967
 *  minecraft.class04995
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07290
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class00807;
import minecraft.class00869;
import minecraft.class03967;
import minecraft.class04995;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07290;

public class class01554
extends class06391<class03967> {
    private static boolean L(class00500 class005002) {
        return class005002.N(class00869.zn) || class005002.N(class00869.ib) || class005002.N(class00869.mf);
    }

    public class01554(Codec<class03967> codec) {
        super(codec);
    }

    private int y(int n, int n2, int n3) {
        float f = 1.0f;
        return class04995.u((float)((1.0f - (float)Math.pow(n, 2.0) / ((float)n2 * 1.0f)) * (float)n3 / 2.0f));
    }

    private int y(class06069 class060692, int n, int n2, int n3) {
        float f = 1.0f + class060692.z() / 2.0f;
        return class04995.u((float)((1.0f - (float)n / ((float)n2 * f)) * (float)n3 / 2.0f));
    }

    private double N(int n, int n2, class07209 class072092, int n3, class06069 class060692) {
        return (double)(10.0f * class04995.N((float)class060692.z(), (float)0.2f, (float)0.8f) / (float)n3) + Math.pow(n - class072092.method_10263(), 2.0) + Math.pow(n2 - class072092.method_10260(), 2.0) - Math.pow(n3, 2.0);
    }

    private double N(int n, int n2, class07209 class072092, int n3, int n4, double d) {
        return Math.pow(((double)(n - class072092.method_10263()) * Math.cos(d) - (double)(n2 - class072092.method_10260()) * Math.sin(d)) / (double)n3, 2.0) + Math.pow(((double)(n - class072092.method_10263()) * Math.sin(d) + (double)(n2 - class072092.method_10260()) * Math.cos(d)) / (double)n4, 2.0) - 1.0;
    }

    private int N(class06069 class060692, int n, int n2, int n3) {
        float f = 3.5f - class060692.z();
        float f2 = (1.0f - (float)Math.pow(n, 2.0) / ((float)n2 * f)) * (float)n3;
        if (n2 > 15 + class060692.y(5)) {
            int n4 = n < 3 + class060692.y(6) ? n / 2 : n;
            f2 = (1.0f - (float)n4 / ((float)n2 * f * 0.4f)) * (float)n3;
        }
        return class04995.u((float)(f2 / 2.0f));
    }

    private void N(class07284 class072842, class07209 class072092, int n, int n2, boolean bl, int n3) {
        int n4 = bl ? n3 : n / 2;
        for (int i = -n4; i <= n4; ++i) {
            for (int j = -n4; j <= n4; ++j) {
                for (int k = 0; k <= n2; ++k) {
                    class07209 class072093 = class072092.method_10069(i, k, j);
                    class00500 class005002 = class072842.method_8320(class072093);
                    if (!class01554.L(class005002) && !class005002.N(class00869.is)) continue;
                    if (this.N((class07290)class072842, class072093)) {
                        this.N((class00807)class072842, class072093, class00869.N.W());
                        this.N((class00807)class072842, class072093.method_10084(), class00869.N.W());
                        continue;
                    }
                    if (!class01554.L(class005002)) continue;
                    class00500[] class00500Array = new class00500[]{class072842.method_8320(class072093.method_10067()), class072842.method_8320(class072093.method_10078()), class072842.method_8320(class072093.method_10095()), class072842.method_8320(class072093.method_10072())};
                    int n5 = 0;
                    class00500[] class00500Array2 = class00500Array;
                    int n6 = class00500Array2.length;
                    for (int i2 = 0; i2 < n6; ++i2) {
                        if (class01554.L(class00500Array2[i2])) continue;
                        ++n5;
                    }
                    if (n5 < 3) continue;
                    this.N((class00807)class072842, class072093, class00869.N.W());
                }
            }
        }
    }

    private boolean N(class07290 class072902, class07209 class072092) {
        return class072902.method_8320(class072092.method_10074()).P();
    }

    private void N(class07284 class072842, class07209 class072092) {
        if (class072842.method_8320(class072092.method_10084()).N(class00869.is)) {
            this.N((class00807)class072842, class072092.method_10084(), class00869.N.W());
        }
    }

    private void N(int n, int n2, class07209 class072092, class07284 class072842, boolean bl, double d, class07209 class072093, int n3, int n4) {
        int n5 = n + 1 + n3 / 3;
        int n6 = Math.min(n - 3, 3) + n4 / 2 - 1;
        for (int i = -n5; i < n5; ++i) {
            for (int j = -n5; j < n5; ++j) {
                class07209 class072094;
                class00500 class005002;
                if (!(this.N(i, j, class072093, n5, n6, d) < 0.0) || !class01554.L(class005002 = class072842.method_8320(class072094 = class072092.method_10069(i, n2, j))) && !class005002.N(class00869.ib)) continue;
                if (bl) {
                    this.N((class00807)class072842, class072094, class00869.K.W());
                    continue;
                }
                this.N((class00807)class072842, class072094, class00869.N.W());
                this.N(class072842, class072094);
            }
        }
    }

    private void N(class06069 class060692, class07284 class072842, int n, int n2, class07209 class072092, boolean bl, int n3, double d, int n4) {
        int n5;
        int n6;
        int n7 = class060692.Z() ? -1 : 1;
        int n8 = class060692.Z() ? -1 : 1;
        int n9 = class060692.y(Math.max(n / 2 - 2, 1));
        if (class060692.Z()) {
            n9 = n / 2 + 1 - class060692.y(Math.max(n - n / 2 - 1, 1));
        }
        int n10 = class060692.y(Math.max(n / 2 - 2, 1));
        if (class060692.Z()) {
            n10 = n / 2 + 1 - class060692.y(Math.max(n - n / 2 - 1, 1));
        }
        if (bl) {
            n9 = n10 = class060692.y(Math.max(n3 - 5, 1));
        }
        class07209 class072093 = new class07209(n7 * n9, 0, n8 * n10);
        double d2 = bl ? d + 1.5707963267948966 : class060692.U() * 2.0 * Math.PI;
        for (n6 = 0; n6 < n2 - 3; ++n6) {
            n5 = this.N(class060692, n6, n2, n);
            this.N(n5, n6, class072092, class072842, false, d2, class072093, n3, n4);
        }
        for (n6 = -1; n6 > -n2 + class060692.y(5); --n6) {
            n5 = this.y(class060692, -n6, n2, n);
            this.N(n5, n6, class072092, class072842, true, d2, class072093, n3, n4);
        }
    }

    public boolean N(class06058<class03967> class060582) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        class07209 class072092 = class060582.i();
        class05974 class059742 = class060582.y();
        class072092 = new class07209(class072092.method_10263(), class060582.L().R(), class072092.method_10260());
        class06069 class060692 = class060582.u();
        boolean bl = class060692.U() > 0.7;
        class00500 class005002 = ((class03967)class060582.R()).y;
        double d = class060692.U() * 2.0 * Math.PI;
        int n6 = 11 - class060692.y(5);
        int n7 = 3 + class060692.y(3);
        boolean bl2 = class060692.U() > 0.7;
        int n8 = 11;
        int n9 = n5 = bl2 ? class060692.y(6) + 6 : class060692.y(15) + 3;
        if (!bl2 && class060692.U() > 0.9) {
            n5 += class060692.y(19) + 7;
        }
        int n10 = Math.min(n5 + class060692.y(11), 18);
        int n11 = Math.min(n5 + class060692.y(7) - class060692.y(5), 11);
        int n12 = bl2 ? n6 : 11;
        for (n4 = -n12; n4 < n12; ++n4) {
            for (n3 = -n12; n3 < n12; ++n3) {
                for (n2 = 0; n2 < n5; ++n2) {
                    int n13 = n = bl2 ? this.y(n2, n5, n11) : this.N(class060692, n2, n5, n11);
                    if (!bl2 && n4 >= n) continue;
                    this.N((class07284)class059742, class060692, class072092, n5, n4, n2, n3, n, n12, bl2, n7, d, bl, class005002);
                }
            }
        }
        this.N((class07284)class059742, class072092, n11, n5, bl2, n6);
        for (n4 = -n12; n4 < n12; ++n4) {
            for (n3 = -n12; n3 < n12; ++n3) {
                for (n2 = -1; n2 > -n10; --n2) {
                    n = bl2 ? class04995.u((float)((float)n12 * (1.0f - (float)Math.pow(n2, 2.0) / ((float)n10 * 8.0f)))) : n12;
                    int n14 = this.y(class060692, -n2, n10, n11);
                    if (n4 >= n14) continue;
                    this.N((class07284)class059742, class060692, class072092, n10, n4, n2, n3, n14, n, bl2, n7, d, bl, class005002);
                }
            }
        }
        int n15 = bl2 ? (class060692.U() > 0.1 ? 1 : 0) : (n4 = class060692.U() > 0.7 ? 1 : 0);
        if (n4 != 0) {
            this.N(class060692, (class07284)class059742, n11, n5, class072092, bl2, n6, d, n7);
        }
        return true;
    }

    private void N(class07284 class072842, class06069 class060692, class07209 class072092, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, int n7, double d, boolean bl2, class00500 class005002) {
        double d2;
        double d3 = d2 = bl ? this.N(n2, n4, class07209.field_10980, n6, this.N(n3, n, n7), d) : this.N(n2, n4, class07209.field_10980, n5, class060692);
        if (d2 < 0.0) {
            double d4;
            class07209 class072093 = class072092.method_10069(n2, n3, n4);
            double d5 = d4 = bl ? -0.5 : (double)(-6 - class060692.y(3));
            if (d2 > d4 && class060692.U() > 0.9) {
                return;
            }
            this.N(class072093, class072842, class060692, n - n3, n, bl, bl2, class005002);
        }
    }

    private void N(class07209 class072092, class07284 class072842, class06069 class060692, int n, int n2, boolean bl, boolean bl2, class00500 class005002) {
        class00500 class005003 = class072842.method_8320(class072092);
        if (class005003.P() || class005003.N(class00869.ib) || class005003.N(class00869.iT) || class005003.N(class00869.K)) {
            int n3;
            boolean bl3 = !bl || class060692.U() > 0.05;
            int n4 = n3 = bl ? 3 : 2;
            if (bl2 && !class005003.N(class00869.K) && (double)n <= (double)class060692.y(Math.max(1, n2 / n3)) + (double)n2 * 0.6 && bl3) {
                this.N((class00807)class072842, class072092, class00869.ib.W());
            } else {
                this.N((class00807)class072842, class072092, class005002);
            }
        }
    }

    private int N(int n, int n2, int n3) {
        int n4 = n3;
        if (n > 0 && n2 - n <= 3) {
            n4 -= 4 - (n2 - n);
        }
        return n4;
    }
}

