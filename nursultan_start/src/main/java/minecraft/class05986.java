/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00807
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01339
 *  minecraft.class04995
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class08088
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00807;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01339;
import minecraft.class04995;
import minecraft.class05974;
import minecraft.class06011;
import minecraft.class06020;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class08088;

public class class05986
extends class06391<class06020> {
    private static final float NE = 0.06f;

    public class05986(Codec<class06020> codec) {
        super(codec);
    }

    private void y(class05974 class059742, class06069 class060692, class06020 class060202, class07209 class072092, int n, boolean bl) {
        int n2;
        class07218 class072182 = new class07218();
        boolean bl2 = class060202.u.N(class00869.EJ);
        int n3 = Math.min(class060692.y(1 + n / 3) + 5, n);
        for (int i = n2 = n - n3; i <= n; ++i) {
            int n4;
            int n5 = n4 = i < n - class060692.y(3) ? 2 : 1;
            if (n3 > 8 && i < n2 + 4) {
                n4 = 3;
            }
            if (bl) {
                ++n4;
            }
            for (int j = -n4; j <= n4; ++j) {
                for (int k = -n4; k <= n4; ++k) {
                    boolean bl3 = j == -n4 || j == n4;
                    boolean bl4 = k == -n4 || k == n4;
                    boolean bl5 = !bl3 && !bl4 && i != n;
                    boolean bl6 = bl3 && bl4;
                    boolean bl7 = i < n2 + 3;
                    class072182.N((class00753)class072092, j, i, k);
                    if (!class05986.N(class059742, (class07209)class072182, class060202, false)) continue;
                    if (class060202.B && !class059742.method_8320(class072182.method_10074()).P()) {
                        class059742.N((class07209)class072182, true);
                    }
                    if (bl7) {
                        if (bl5) continue;
                        this.N((class07284)class059742, class060692, (class07209)class072182, class060202.u, bl2);
                        continue;
                    }
                    if (bl5) {
                        this.N((class07284)class059742, class060692, class060202, class072182, 0.1f, 0.2f, bl2 ? 0.1f : 0.0f);
                        continue;
                    }
                    if (bl6) {
                        this.N((class07284)class059742, class060692, class060202, class072182, 0.01f, 0.7f, bl2 ? 0.083f : 0.0f);
                        continue;
                    }
                    this.N((class07284)class059742, class060692, class060202, class072182, 5.0E-4f, 0.98f, bl2 ? 0.07f : 0.0f);
                }
            }
        }
    }

    private static void N(class07209 class072092, class07284 class072842, class06069 class060692) {
        class07218 class072182 = class072092.method_25503().N(class07211.field_11033);
        if (!class072842.R((class07209)class072182)) {
            return;
        }
        int n = class04995.N((class06069)class060692, (int)1, (int)5);
        if (class060692.y(7) == 0) {
            n *= 2;
        }
        int n2 = 23;
        int n3 = 25;
        class06011.N(class072842, class060692, class072182, n, 23, 25);
    }

    private void N(class07284 class072842, class06069 class060692, class07209 class072092, class00500 class005002, boolean bl) {
        if (class072842.method_8320(class072092.method_10074()).N(class005002.i())) {
            this.N((class00807)class072842, class072092, class005002);
        } else if ((double)class060692.z() < 0.15) {
            this.N((class00807)class072842, class072092, class005002);
            if (bl && class060692.y(11) == 0) {
                class05986.N(class072092, class072842, class060692);
            }
        }
    }

    private void N(class07284 class072842, class06069 class060692, class06020 class060202, class07218 class072182, float f, float f2, float f3) {
        if (class060692.z() < f) {
            this.N((class00807)class072842, (class07209)class072182, class060202.i);
        } else if (class060692.z() < f2) {
            this.N((class00807)class072842, (class07209)class072182, class060202.u);
            if (class060692.z() < f3) {
                class05986.N((class07209)class072182, class072842, class060692);
            }
        }
    }

    public boolean N(class06058<class06020> class060582) {
        class05974 class059742 = class060582.y();
        class07209 class072092 = class060582.i();
        class06069 class060692 = class060582.u();
        class08088 class080882 = class060582.L();
        class06020 class060202 = (class06020)class060582.R();
        class00891 class008912 = class060202.y.i();
        class07209 class072093 = null;
        if (class059742.method_8320(class072092.method_10074()).N(class008912)) {
            class072093 = class072092;
        }
        if (class072093 == null) {
            return false;
        }
        int n2 = class04995.N((class06069)class060692, (int)4, (int)13);
        if (class060692.y(12) == 0) {
            n2 *= 2;
        }
        if (!class060202.B) {
            int n = class080882.i();
            if (class072093.method_10264() + n2 + 1 >= n) {
                return false;
            }
        }
        boolean bl = !class060202.B && class060692.z() < 0.06f;
        class059742.method_8652(class072092, class00869.N.W(), 260);
        this.N(class059742, class060692, class060202, class072093, n2, bl);
        this.y(class059742, class060692, class060202, class072093, n2, bl);
        return true;
    }

    private void N(class05974 class059742, class06069 class060692, class06020 class060202, class07209 class072092, int n, boolean bl) {
        class07218 class072182 = new class07218();
        class00500 class005002 = class060202.L;
        int n2 = bl ? 1 : 0;
        for (int i = -n2; i <= n2; ++i) {
            for (int j = -n2; j <= n2; ++j) {
                boolean bl2 = bl && class04995.N((int)i) == n2 && class04995.N((int)j) == n2;
                for (int k = 0; k < n; ++k) {
                    class072182.N((class00753)class072092, i, k, j);
                    if (!class05986.N(class059742, (class07209)class072182, class060202, true)) continue;
                    if (class060202.B) {
                        if (!class059742.method_8320(class072182.method_10074()).P()) {
                            class059742.N((class07209)class072182, true);
                        }
                        class059742.method_8652((class07209)class072182, class005002, 3);
                        continue;
                    }
                    if (bl2) {
                        if (!(class060692.z() < 0.1f)) continue;
                        this.N((class00807)class059742, (class07209)class072182, class005002);
                        continue;
                    }
                    this.N((class00807)class059742, (class07209)class072182, class005002);
                }
            }
        }
    }

    private static boolean N(class05974 class059742, class07209 class072092, class06020 class060202, boolean bl) {
        if (class059742.method_16358(class072092, class01339::d)) {
            return true;
        }
        if (bl) {
            return class060202.M.test((Object)class059742, (Object)class072092);
        }
        return false;
    }
}

