/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00577
 *  minecraft.class00580
 *  minecraft.class00937
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04995
 *  minecraft.class05936
 *  minecraft.class06176
 *  minecraft.class07536
 *  org.joml.Matrix3x2f
 *  org.joml.Matrix3x2fc
 */
package minecraft;

import minecraft.class00392;
import minecraft.class00577;
import minecraft.class00580;
import minecraft.class00937;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04995;
import minecraft.class05936;
import minecraft.class06176;
import minecraft.class07536;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;

public class class03510 {
    public static final class03510 N = new class03510(class06176.N);
    public static final class03510 y = new class03510(class06176.y);
    public static final class03510 L = new class03510(class06176.L);
    private static final int u = 123;
    private static final int i = 69;
    private static final float R = -0.34906584f;
    private final class00392 M;

    public class03510(class00392 class003922) {
        this.M = class003922;
    }

    public void N(class01054 class010542, int n, class01590 class015902, float f) {
        int n2 = class015902.N((class05936)this.M);
        class00580 class005802 = class010542.B();
        float f2 = (1.8f - class04995.L((float)(class04995.m((double)((float)(class07536.L() % 1000L) / 1000.0f * ((float)Math.PI * 2))) * 0.1f))) * 100.0f / (float)(n2 + 32);
        Matrix3x2f matrix3x2f = new Matrix3x2f(class005802.N().N()).translate((float)n / 2.0f + 123.0f, 69.0f).rotate(-0.34906584f).scale(f2);
        class00577 class005772 = class005802.N().y(f).N((Matrix3x2fc)matrix3x2f);
        class005802.N(class00937.field_62009, -n2 / 2, -8, class005772, this.M);
    }
}

