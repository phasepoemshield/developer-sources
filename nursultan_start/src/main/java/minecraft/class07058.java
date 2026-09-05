/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06584
 *  minecraft.class07299
 *  minecraft.class07323
 *  minecraft.class07438
 */
package minecraft;

import minecraft.class04782;
import minecraft.class04995;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07299;
import minecraft.class07323;
import minecraft.class07438;

public class class07058 {
    public static final float N = 20.0f;
    public static final float y = 25.0f;
    public static final float L = 2.0f;
    public static final float u = 0.2f;
    private static final int i = 4;

    public static float N(class07438 class074382, float f, class07072 class070722, float f2, float f3) {
        float f4;
        class07299 class072992;
        float f5 = 2.0f + f3 / 4.0f;
        float f6 = class04995.N((float)(f2 - f / f5), (float)(f2 * 0.2f), (float)20.0f) / 25.0f;
        class06584 class065842 = class070722.i();
        if (class065842 != null && (class072992 = class074382.method_73183()) instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            f4 = class04995.N((float)class07323.L((class04782)class047822, (class06584)class065842, (class07049)class074382, (class07072)class070722, (float)f6), (float)0.0f, (float)1.0f);
        } else {
            f4 = f6;
        }
        float f7 = 1.0f - f4;
        return f * f7;
    }

    public static float N(float f, float f2) {
        float f3 = class04995.N((float)f2, (float)0.0f, (float)20.0f);
        return f * (1.0f - f3 / 25.0f);
    }
}

