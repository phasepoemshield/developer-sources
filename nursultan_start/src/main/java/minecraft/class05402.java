/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class04995
 *  minecraft.class06751
 *  minecraft.class07070
 *  minecraft.class08155
 */
package minecraft;

import minecraft.class01686;
import minecraft.class04995;
import minecraft.class06751;
import minecraft.class07070;
import minecraft.class08155;

public class class05402 {
    public static void N(class01686 class016862, float f, float f2) {
        class016862.M += f2 * (class04995.P((double)(f * 0.09f)) * 0.05f + 0.05f);
        class016862.i += f2 * (class04995.m((double)(f * 0.067f)) * 0.05f);
    }

    public static void N(class01686 class016862, class01686 class016863, float f) {
        class05402.N(class016862, f, 1.0f);
        class05402.N(class016863, f, -1.0f);
    }

    public static <T extends class06751> void N(class01686 class016862, class01686 class016863, boolean bl, T t) {
        if (t.Nc != class08155.field_63400) {
            float f = t.NX;
            float f2 = (float)(-Math.PI) / (bl ? 1.5f : 2.25f);
            float f3 = class04995.m((double)(f * (float)Math.PI));
            float f4 = class04995.m((double)((1.0f - (1.0f - f) * (1.0f - f)) * (float)Math.PI));
            class016863.M = 0.0f;
            class016863.R = -(0.1f - f3 * 0.6f);
            class016863.i = f2;
            class016863.i += f3 * 1.2f - f4 * 0.4f;
            class016862.M = 0.0f;
            class016862.R = 0.1f - f3 * 0.6f;
            class016862.i = f2;
            class016862.i += f3 * 1.2f - f4 * 0.4f;
        }
        class05402.N(class016863, class016862, t.P);
    }

    public static void N(class01686 class016862, class01686 class016863, class07070 class070702, float f, float f2) {
        float f3 = class04995.m((double)(f * (float)Math.PI));
        float f4 = class04995.m((double)((1.0f - (1.0f - f) * (1.0f - f)) * (float)Math.PI));
        class016862.M = 0.0f;
        class016863.M = 0.0f;
        class016862.R = 0.15707964f;
        class016863.R = -0.15707964f;
        if (class070702 == class07070.field_6183) {
            class016862.i = -1.8849558f + class04995.P((double)(f2 * 0.09f)) * 0.15f;
            class016863.i = -0.0f + class04995.P((double)(f2 * 0.19f)) * 0.5f;
            class016862.i += f3 * 2.2f - f4 * 0.4f;
            class016863.i += f3 * 1.2f - f4 * 0.4f;
        } else {
            class016862.i = -0.0f + class04995.P((double)(f2 * 0.19f)) * 0.5f;
            class016863.i = -1.8849558f + class04995.P((double)(f2 * 0.09f)) * 0.15f;
            class016862.i += f3 * 1.2f - f4 * 0.4f;
            class016863.i += f3 * 2.2f - f4 * 0.4f;
        }
        class05402.N(class016862, class016863, f2);
    }

    public static void N(class01686 class016862, class01686 class016863, float f, float f2, boolean bl) {
        class01686 class016864 = bl ? class016862 : class016863;
        class01686 class016865 = bl ? class016863 : class016862;
        class016864.R = bl ? -0.8f : 0.8f;
        class016865.i = class016864.i = -0.97079635f;
        float f3 = class04995.N((float)f2, (float)0.0f, (float)f) / f;
        class016865.R = class04995.B((float)f3, (float)0.4f, (float)0.85f) * (float)(bl ? 1 : -1);
        class016865.i = class04995.B((float)f3, (float)class016865.i, (float)-1.5707964f);
    }

    public static void N(class01686 class016862, class01686 class016863, class01686 class016864, boolean bl) {
        class01686 class016865 = bl ? class016862 : class016863;
        class01686 class016866 = bl ? class016863 : class016862;
        class016865.R = (bl ? -0.3f : 0.3f) + class016864.R;
        class016866.R = (bl ? 0.6f : -0.6f) + class016864.R;
        class016865.i = -1.5707964f + class016864.i + 0.1f;
        class016866.i = -1.5f + class016864.i;
    }
}

