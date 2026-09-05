/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class07079
 *  minecraft.class07438
 *  minecraft.class07442
 *  minecraft.class07523
 */
package minecraft;

import minecraft.class00032;
import minecraft.class04995;
import minecraft.class07079;
import minecraft.class07438;
import minecraft.class07442;
import minecraft.class07523;

class class00029
extends class07442 {
    final /* synthetic */ class00032 N;

    class00029(class00032 class000322) {
        this.N = class000322;
        super((class07079)class000322);
    }

    public void N() {
        if (this.N.v()) {
            float f = class00029.N(this.N.method_36454());
            this.N.method_36456(this.N.method_36454() - f);
            this.N.method_5847(this.N.method_36454());
            return;
        }
        if (this.i > 0) {
            --this.i;
            double d = this.R - this.N.method_23317();
            double d2 = this.B - this.N.method_23321();
            this.N.method_36456(-((float)class04995.u((double)d, (double)d2)) * 57.295776f);
            ((class07438)this.N).fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(this.N.method_36454());
            ((class07438)this.N).fields_4212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(((class07438)this.N).fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue());
            return;
        }
        class07523.N((class07079)this.y);
    }

    public static float N(float f) {
        float f2 = f % 90.0f;
        if (f2 >= 45.0f) {
            f2 -= 90.0f;
        }
        if (f2 < -45.0f) {
            f2 += 90.0f;
        }
        return f2;
    }
}

