/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00018
 *  minecraft.class00044
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class07549
 */
package minecraft;

import minecraft.class00018;
import minecraft.class00044;
import minecraft.class00155;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class07549;

public class class00179
extends class00155 {
    private static final float m = 0.0f;
    private static final float P = 1.0f;
    private static final float s = 0.7f;
    private static final float T = 0.5f;
    private final class07549 b;

    public void P() {
        if (this.b.method_31481() || this.b.T() != null) {
            this.y();
            return;
        }
        this.R = (float)this.b.method_23317();
        this.M = (float)this.b.method_23318();
        this.B = (float)this.b.method_23321();
        float f = this.b.R(0.0f);
        this.u = 0.0f + 1.0f * f * f;
        this.i = 0.7f + 0.5f * f;
    }

    public class00179(class07549 class075492) {
        super(class04909.mZ, class04911.field_15251, class00044.v());
        this.b = class075492;
        this.U = class00018.field_5478;
        this.Z = true;
        this.z = 0;
    }

    public boolean s() {
        return !this.b.method_5701();
    }
}

