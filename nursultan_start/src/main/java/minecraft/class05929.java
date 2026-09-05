/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.TextureUtil
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class06846
 *  minecraft.class08280
 */
package minecraft;

import com.mojang.blaze3d.platform.TextureUtil;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class06846;
import minecraft.class08280;

public class class05929 {
    private static final String N = "item/";
    private static final float y = 0.5f;
    private static final float L = 0.3f;

    private class05929() {
    }

    public static class08280[] N(class01894 class018942, class08280[] class08280Array, int n, class06846 class068462, float f) {
        if (class068462 == class06846.field_64076) {
            class06846 class068463 = class068462 = class05929.N(class08280Array[0]) ? class06846.field_64078 : class06846.field_64077;
        }
        if (class08280Array.length == 1 && !class018942.N().startsWith(N)) {
            if (class068462 == class06846.field_64078 || class068462 == class06846.field_64079) {
                TextureUtil.solidify((class08280)class08280Array[0]);
            } else if (class068462 == class06846.field_64080) {
                TextureUtil.fillEmptyAreasWithDarkColor((class08280)class08280Array[0]);
            }
        }
        if (n + 1 <= class08280Array.length) {
            return class08280Array;
        }
        class08280[] class08280Array2 = new class08280[n + 1];
        class08280Array2[0] = class08280Array[0];
        boolean bl = class068462 == class06846.field_64078 || class068462 == class06846.field_64079 || class068462 == class06846.field_64080;
        float f2 = class068462 == class06846.field_64079 ? 0.3f : 0.5f;
        float f3 = bl ? class05929.N(class08280Array[0], f2, 1.0f) : 0.0f;
        for (int i = 1; i <= n; ++i) {
            if (i < class08280Array.length) {
                class08280Array2[i] = class08280Array[i];
            } else {
                class08280 class082802 = class08280Array2[i - 1];
                class08280 class082803 = new class08280(class082802.N() >> 1, class082802.y() >> 1, false);
                int n2 = class082803.N();
                int n3 = class082803.y();
                for (int j = 0; j < n2; ++j) {
                    for (int k = 0; k < n3; ++k) {
                        int n4 = class082802.N(j * 2 + 0, k * 2 + 0);
                        int n5 = class082802.N(j * 2 + 1, k * 2 + 0);
                        int n6 = class082802.N(j * 2 + 0, k * 2 + 1);
                        int n7 = class082802.N(j * 2 + 1, k * 2 + 1);
                        int n8 = class068462 == class06846.field_64080 ? class05929.N(n4, n5, n6, n7) : class02566.N((int)n4, (int)n5, (int)n6, (int)n7);
                        class082803.y(j, k, n8);
                    }
                }
                class08280Array2[i] = class082803;
            }
            if (!bl) continue;
            class05929.N(class08280Array2[i], f3, f2, f);
        }
        return class08280Array2;
    }

    private static boolean N(class08280 class082802) {
        for (int i = 0; i < class082802.N(); ++i) {
            for (int j = 0; j < class082802.y(); ++j) {
                if (class02566.y((int)class082802.N(i, j)) != 0) continue;
                return true;
            }
        }
        return false;
    }

    private static int N(int n, int n2, int n3, int n4) {
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        if (class02566.y((int)n) != 0) {
            f += class02566.N((int)class02566.y((int)n));
            f2 += class02566.N((int)class02566.L((int)n));
            f3 += class02566.N((int)class02566.u((int)n));
            f4 += class02566.N((int)class02566.i((int)n));
        }
        if (class02566.y((int)n2) != 0) {
            f += class02566.N((int)class02566.y((int)n2));
            f2 += class02566.N((int)class02566.L((int)n2));
            f3 += class02566.N((int)class02566.u((int)n2));
            f4 += class02566.N((int)class02566.i((int)n2));
        }
        if (class02566.y((int)n3) != 0) {
            f += class02566.N((int)class02566.y((int)n3));
            f2 += class02566.N((int)class02566.L((int)n3));
            f3 += class02566.N((int)class02566.u((int)n3));
            f4 += class02566.N((int)class02566.i((int)n3));
        }
        if (class02566.y((int)n4) != 0) {
            f += class02566.N((int)class02566.y((int)n4));
            f2 += class02566.N((int)class02566.L((int)n4));
            f3 += class02566.N((int)class02566.u((int)n4));
            f4 += class02566.N((int)class02566.i((int)n4));
        }
        return class02566.y((int)class02566.N((float)(f /= 4.0f)), (int)class02566.N((float)(f2 /= 4.0f)), (int)class02566.N((float)(f3 /= 4.0f)), (int)class02566.N((float)(f4 /= 4.0f)));
    }

    private static void N(class08280 class082802, float f, float f2, float f3) {
        int n;
        float f4 = 0.0f;
        float f5 = 4.0f;
        float f6 = 1.0f;
        float f7 = 1.0f;
        float f8 = Float.MAX_VALUE;
        int n2 = class082802.N();
        int n3 = class082802.y();
        for (n = 0; n < 5; ++n) {
            float f9 = class05929.N(class082802, f2, f6);
            float f10 = Math.abs(f9 - f);
            if (f10 < f8) {
                f8 = f10;
                f7 = f6;
            }
            if (f9 < f) {
                f4 = f6;
            } else {
                if (!(f9 > f)) break;
                f5 = f6;
            }
            f6 = (f4 + f5) * 0.5f;
        }
        for (n = 0; n < n3; ++n) {
            for (int i = 0; i < n2; ++i) {
                int n4 = class082802.N(i, n);
                float f11 = class02566.W((int)n4);
                f11 = f11 * f7 + f3 + 0.025f;
                f11 = Math.clamp((float)f11, (float)0.0f, (float)1.0f);
                class082802.y(i, n, class02566.N((float)f11, (int)n4));
            }
        }
    }

    private static float N(class08280 class082802, float f, float f2) {
        int n = class082802.N();
        int n2 = class082802.y();
        float f3 = 0.0f;
        int n3 = 4;
        for (int i = 0; i < n2 - 1; ++i) {
            for (int j = 0; j < n - 1; ++j) {
                float f4 = Math.clamp((float)(class02566.W((int)class082802.N(j, i)) * f2), (float)0.0f, (float)1.0f);
                float f5 = Math.clamp((float)(class02566.W((int)class082802.N(j + 1, i)) * f2), (float)0.0f, (float)1.0f);
                float f6 = Math.clamp((float)(class02566.W((int)class082802.N(j, i + 1)) * f2), (float)0.0f, (float)1.0f);
                float f7 = Math.clamp((float)(class02566.W((int)class082802.N(j + 1, i + 1)) * f2), (float)0.0f, (float)1.0f);
                float f8 = 0.0f;
                for (int k = 0; k < 4; ++k) {
                    float f9 = ((float)k + 0.5f) / 4.0f;
                    for (int i2 = 0; i2 < 4; ++i2) {
                        float f10 = ((float)i2 + 0.5f) / 4.0f;
                        if (!(f4 * (1.0f - f10) * (1.0f - f9) + f5 * f10 * (1.0f - f9) + f6 * (1.0f - f10) * f9 + f7 * f10 * f9 > f)) continue;
                        f8 += 1.0f;
                    }
                }
                f3 += f8 / 16.0f;
            }
        }
        return f3 / (float)((n - 1) * (n2 - 1));
    }
}

