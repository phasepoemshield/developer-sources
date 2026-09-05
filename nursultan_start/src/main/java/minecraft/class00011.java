/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00044
 *  minecraft.class00155
 *  minecraft.class02726
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class07504
 */
package minecraft;

import minecraft.class00044;
import minecraft.class00155;
import minecraft.class02726;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class07504;

public class class00011
extends class00155 {
    private static final float m = 0.0f;
    private static final float P = 0.7f;
    private static final float s = 0.0f;
    private static final float T = 1.0f;
    private static final float b = 0.0025f;
    private final class07504 j;
    private float v = 0.0f;

    public void P() {
        boolean bl;
        if (this.j.method_31481()) {
            this.y();
            return;
        }
        this.R = (float)this.j.method_23317();
        this.M = (float)this.j.method_23318();
        this.B = (float)this.j.method_23321();
        float f = (float)this.j.method_18798().Z();
        boolean bl2 = bl = !this.j.method_52172() && this.j.N() instanceof class02726;
        if (f >= 0.01f && this.j.method_73183().method_54719().Z() && !bl) {
            this.v = class04995.N((float)(this.v + 0.0025f), (float)0.0f, (float)1.0f);
            this.u = class04995.B((float)class04995.N((float)f, (float)0.0f, (float)0.5f), (float)0.0f, (float)0.7f);
        } else {
            this.v = 0.0f;
            this.u = 0.0f;
        }
    }

    public class00011(class07504 class075042) {
        super(class04909.by, class04911.field_15254, class00044.v());
        this.j = class075042;
        this.Z = true;
        this.z = 0;
        this.u = 0.0f;
        this.R = (float)class075042.method_23317();
        this.M = (float)class075042.method_23318();
        this.B = (float)class075042.method_23321();
    }

    public boolean s() {
        return !this.j.method_5701();
    }

    public boolean w_() {
        return true;
    }
}

