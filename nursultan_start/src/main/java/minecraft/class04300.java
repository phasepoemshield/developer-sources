/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03882
 *  minecraft.class04562
 *  minecraft.class04571
 *  minecraft.class04573
 *  minecraft.class04995
 */
package minecraft;

import minecraft.class03882;
import minecraft.class04562;
import minecraft.class04571;
import minecraft.class04573;
import minecraft.class04995;

public class class04300 {
    private static final float N = -0.51f;
    private static final float y = -0.4f;
    private static final float L = 0.1f;
    private static final float u = -0.15f;
    private static final class04573<Float> i = class04573.y;
    private static final class04573<Float> R = class04573.N(f -> f < 0.0f ? f : f * 2.0f);
    private static final class04573<Float> M = class04573.N(f -> 1.25f - 6.25f / (f + 5.0f));
    private static final class04573<Float> B = class04573.N(f -> f * 2.0f);

    public static <C, I extends class04573<C>> class04562<C, I> y(I i, I i2, I i3, I i4, boolean bl) {
        class04573<Float> var5 = bl ? B : class04300.i;
        float f = 0.65f;
        return class04562.N(i, var5).N(-0.11f, 0.0f).N(0.03f, class04300.N(i2, i3, i4, 1.0f, 0.5f, 0.0f, 0.0f, var5)).N(0.65f, class04300.N(i2, i3, i4, 1.0f, 1.0f, 1.0f, 0.0f, var5)).N();
    }

    private static <C, I extends class04573<C>> class04562<C, I> N(I i, float f, float f2, float f3, float f4, float f5, float f6, class04573<Float> class045732) {
        float f7 = Math.max(0.5f * (f2 - f), f6);
        float f8 = 5.0f * (f3 - f2);
        return class04562.N(i, class045732).N(-1.0f, f, f7).N(-0.4f, f2, Math.min(f7, f8)).N(0.0f, f3, f8).N(0.4f, f4, 2.0f * (f4 - f3)).N(1.0f, f5, 0.7f * (f5 - f4)).N();
    }

    private static float N(float f) {
        float f2 = 1.17f;
        float f3 = 0.46082947f;
        float f4 = 1.0f - (1.0f - f) * 0.5f;
        return 0.5f * (1.0f - f) / (0.46082947f * f4) - 1.17f;
    }

    public static <C, I extends class04573<C>> class04562<C, I> N(I i, I i2, float f, float f2, float f3, float f4, float f5, float f6, boolean bl, boolean bl2, class04573<Float> class045732) {
        float f7 = 0.6f;
        float f8 = 0.5f;
        float f9 = 0.5f;
        class04562<C, I> class045622 = class04300.N(i2, class04995.B((float)f4, (float)0.6f, (float)1.5f), bl2, class045732);
        class04562<C, I> class045623 = class04300.N(i2, class04995.B((float)f4, (float)0.6f, (float)1.0f), bl2, class045732);
        class04562<C, I> class045624 = class04300.N(i2, f4, bl2, class045732);
        class04562<C, float> class045625 = class04300.N(i2, f - 0.15f, 0.5f * f4, class04995.B((float)0.5f, (float)0.5f, (float)0.5f) * f4, 0.5f * f4, 0.6f * f4, 0.5f, class045732);
        class04562<C, float> class045626 = class04300.N(i2, f, f5 * f4, f2 * f4, 0.5f * f4, 0.6f * f4, 0.5f, class045732);
        class04562<C, float> class045627 = class04300.N(i2, f, f5, f5, f2, f3, 0.5f, class045732);
        class04562<C, float> class045628 = class04300.N(i2, f, f5, f5, f2, f3, 0.5f, class045732);
        class04562 class045629 = class04562.N(i2, class045732).N(-1.0f, f).N(-0.4f, class045627).N(0.0f, f3 + 0.07f).N();
        class04562<C, float> class0456210 = class04300.N(i2, -0.02f, f6, f6, f2, f3, 0.0f, class045732);
        class04571 class045712 = class04562.N(i, class045732).N(-0.85f, class045622).N(-0.7f, class045623).N(-0.4f, class045624).N(-0.35f, class045625).N(-0.1f, class045626).N(0.2f, class045627);
        if (bl) {
            class045712.N(0.4f, class045628).N(0.45f, class045629).N(0.55f, class045629).N(0.58f, class045628);
        }
        class045712.N(0.7f, class0456210);
        return class045712.N();
    }

    public static <C, I extends class04573<C>> class04562<C, I> N(I i, I i2, I i3, boolean bl) {
        class04573<Float> var4 = bl ? R : class04300.i;
        class04562<C, I> class045622 = class04300.N(i2, i3, -0.15f, 0.0f, 0.0f, 0.1f, 0.0f, -0.03f, false, false, var4);
        class04562<C, I> class045623 = class04300.N(i2, i3, -0.1f, 0.03f, 0.1f, 0.1f, 0.01f, -0.03f, false, false, var4);
        class04562<C, I> class045624 = class04300.N(i2, i3, -0.1f, 0.03f, 0.1f, 0.7f, 0.01f, -0.03f, true, true, var4);
        class04562<C, I> class045625 = class04300.N(i2, i3, -0.05f, 0.03f, 0.1f, 1.0f, 0.01f, 0.01f, true, true, var4);
        return class04562.N(i, var4).N(-1.1f, 0.044f).N(-1.02f, -0.2222f).N(-0.51f, -0.2222f).N(-0.44f, -0.12f).N(-0.18f, -0.12f).N(-0.16f, class045622).N(-0.15f, class045622).N(-0.1f, class045623).N(0.25f, class045624).N(1.0f, class045625).N();
    }

    private static <C, I extends class04573<C>> class04562<C, I> N(I i, float f, boolean bl, class04573<Float> class045732) {
        class04571 class045712 = class04562.N(i, class045732);
        float f2 = -0.7f;
        float f3 = -1.0f;
        float f4 = class04300.N(-1.0f, f, -0.7f);
        float f5 = 1.0f;
        float f6 = class04300.N(1.0f, f, -0.7f);
        float f7 = class04300.N(f);
        float f8 = -0.65f;
        if (-0.65f < f7 && f7 < 1.0f) {
            float f9 = class04300.N(-0.65f, f, -0.7f);
            float f10 = -0.75f;
            float f11 = class04300.N(-0.75f, f, -0.7f);
            float f12 = class04300.N(f4, f11, -1.0f, -0.75f);
            class045712.N(-1.0f, f4, f12);
            class045712.N(-0.75f, f11);
            class045712.N(-0.65f, f9);
            float f13 = class04300.N(f7, f, -0.7f);
            float f14 = class04300.N(f13, f6, f7, 1.0f);
            float f15 = 0.01f;
            class045712.N(f7 - 0.01f, f13);
            class045712.N(f7, f13, f14);
            class045712.N(1.0f, f6, f14);
        } else {
            float f16 = class04300.N(f4, f6, -1.0f, 1.0f);
            if (bl) {
                class045712.N(-1.0f, Math.max(0.2f, f4));
                class045712.N(0.0f, class04995.B((float)0.5f, (float)f4, (float)f6), f16);
            } else {
                class045712.N(-1.0f, f4, f16);
            }
            class045712.N(1.0f, f6, f16);
        }
        return class045712.N();
    }

    private static <C, I extends class04573<C>> class04562<C, I> N(I i, I i2, I i3, float f, boolean bl, class04573<Float> class045732) {
        class04562 class045622 = class04562.N(i2, class045732).N(-0.2f, 6.3f).N(0.2f, f).N();
        class04571 class045712 = class04562.N(i, class045732).N(-0.6f, class045622).N(-0.5f, class04562.N(i2, class045732).N(-0.05f, 6.3f).N(0.05f, 2.67f).N()).N(-0.35f, class045622).N(-0.25f, class045622).N(-0.1f, class04562.N(i2, class045732).N(-0.05f, 2.67f).N(0.05f, 6.3f).N()).N(0.03f, class045622);
        if (bl) {
            class04562 class045623 = class04562.N(i2, class045732).N(0.0f, f).N(0.1f, 0.625f).N();
            class04562 class045624 = class04562.N(i3, class045732).N(-0.9f, f).N(-0.69f, class045623).N();
            class045712.N(0.35f, f).N(0.45f, class045624).N(0.55f, class045624).N(0.62f, f);
        } else {
            class04562 class045625 = class04562.N(i3, class045732).N(-0.7f, class045622).N(-0.15f, 1.37f).N();
            class04562 class045626 = class04562.N(i3, class045732).N(0.45f, class045622).N(0.7f, 1.56f).N();
            class045712.N(0.05f, class045626).N(0.4f, class045626).N(0.45f, class045625).N(0.55f, class045625).N(0.58f, f);
        }
        return class045712.N();
    }

    private static <C, I extends class04573<C>> class04562<C, I> N(I i, float f, class04573<Float> class045732) {
        float f2 = 0.63f * f;
        float f3 = 0.3f * f;
        return class04562.N(i, class045732).N(-0.01f, f2).N(0.01f, f3).N();
    }

    private static <C, I extends class04573<C>> class04562<C, I> N(I i, I i2, float f, float f2, class04573<Float> class045732) {
        float f3 = class03882.N((float)0.4f);
        float f4 = class03882.N((float)0.56666666f);
        float f5 = (f3 + f4) / 2.0f;
        class04571 class045712 = class04562.N(i2, class045732);
        class045712.N(f3, 0.0f);
        if (f2 > 0.0f) {
            class045712.N(f5, class04300.N(i, f2, class045732));
        } else {
            class045712.N(f5, 0.0f);
        }
        if (f > 0.0f) {
            class045712.N(1.0f, class04300.N(i, f, class045732));
        } else {
            class045712.N(1.0f, 0.0f);
        }
        return class045712.N();
    }

    private static <C, I extends class04573<C>> class04562<C, I> N(I i, I i2, I i3, float f, float f2, float f3, float f4, class04573<Float> class045732) {
        float f5 = -0.5775f;
        class04562<C, I> class045622 = class04300.N(i2, i3, f, f3, class045732);
        class04562<C, I> class045623 = class04300.N(i2, i3, f2, f4, class045732);
        return class04562.N(i, class045732).N(-1.0f, class045622).N(-0.78f, class045623).N(-0.5775f, class045623).N(-0.375f, 0.0f).N();
    }

    private static float N(float f, float f2, float f3, float f4) {
        return (f2 - f) / (f4 - f3);
    }

    public static <C, I extends class04573<C>> class04562<C, I> N(I i, I i2, I i3, I i4, boolean bl) {
        class04573<Float> var5 = bl ? M : class04300.i;
        return class04562.N(i, class04300.i).N(-0.19f, 3.95f).N(-0.15f, class04300.N(i2, i3, i4, 6.25f, true, class04300.i)).N(-0.1f, class04300.N(i2, i3, i4, 5.47f, true, var5)).N(0.03f, class04300.N(i2, i3, i4, 5.08f, true, var5)).N(0.06f, class04300.N(i2, i3, i4, 4.69f, false, var5)).N();
    }

    private static float N(float f, float f2, float f3) {
        float f4 = 1.17f;
        float f5 = 0.46082947f;
        float f6 = 1.0f - (1.0f - f2) * 0.5f;
        float f7 = 0.5f * (1.0f - f2);
        float f8 = (f + 1.17f) * 0.46082947f * f6 - f7;
        if (f < f3) {
            return Math.max(f8, -0.2222f);
        }
        return Math.max(f8, 0.0f);
    }
}

