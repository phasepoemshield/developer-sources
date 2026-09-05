/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class06889
 *  minecraft.class07438
 */
package minecraft;

import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07438;

public class class02768 {
    private static final float N = 0.2617994f;
    private static final float y = -0.2617994f;
    private float L;
    private float u;
    private float i;
    private float R;
    private float M;
    private float B;
    private final class07438 Z;

    public float L(float f) {
        return class04995.B((float)f, (float)this.B, (float)this.i);
    }

    public class02768(class07438 class074382) {
        this.Z = class074382;
    }

    public float y(float f) {
        return class04995.B((float)f, (float)this.M, (float)this.u);
    }

    public void N() {
        float f;
        float f2;
        float f3;
        this.R = this.L;
        this.M = this.u;
        this.B = this.i;
        if (this.Z.method_6128()) {
            float f4 = 1.0f;
            class06889 class068892 = this.Z.method_18798();
            if (class068892.B < 0.0) {
                class06889 class068893 = class068892.u();
                f4 = 1.0f - (float)Math.pow(-class068893.B, 1.5);
            }
            f3 = class04995.B((float)f4, (float)0.2617994f, (float)0.34906584f);
            f2 = class04995.B((float)f4, (float)-0.2617994f, (float)-1.5707964f);
            f = 0.0f;
        } else if (this.Z.method_18276()) {
            f3 = 0.6981317f;
            f2 = -0.7853982f;
            f = 0.08726646f;
        } else {
            f3 = 0.2617994f;
            f2 = -0.2617994f;
            f = 0.0f;
        }
        this.L += (f3 - this.L) * 0.3f;
        this.u += (f - this.u) * 0.3f;
        this.i += (f2 - this.i) * 0.3f;
    }

    public float N(float f) {
        return class04995.B((float)f, (float)this.R, (float)this.L);
    }
}

