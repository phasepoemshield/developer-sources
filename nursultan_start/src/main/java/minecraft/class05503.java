/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00034
 *  minecraft.class00044
 *  minecraft.class00155
 *  minecraft.class04626
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class06202
 */
package minecraft;

import minecraft.class00034;
import minecraft.class00044;
import minecraft.class00155;
import minecraft.class04626;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class06202;

public abstract class class05503
extends class00155 {
    private static final float P = 0.0f;
    private static final float s = 1.2f;
    private static final float T = 0.0f;
    protected final class04626 m;
    private boolean b;

    public void P() {
        if (this.j() && !this.N()) {
            class06202.Nq().Nr().N((class00034)this.b());
            this.b = true;
        }
        if (this.m.method_31481() || this.b) {
            this.y();
            return;
        }
        this.R = (float)this.m.method_23317();
        this.M = (float)this.m.method_23318();
        this.B = (float)this.m.method_23321();
        float f = (float)this.m.method_18798().Z();
        if (f >= 0.01f) {
            this.i = class04995.B((float)class04995.N((float)f, (float)this.n(), (float)this.t()), (float)this.n(), (float)this.t());
            this.u = class04995.B((float)class04995.N((float)f, (float)0.0f, (float)0.5f), (float)0.0f, (float)1.2f);
        } else {
            this.i = 0.0f;
            this.u = 0.0f;
        }
    }

    public class05503(class04626 class046262, class04891 class048912, class04911 class049112) {
        super(class048912, class049112, class00044.v());
        this.m = class046262;
        this.R = (float)class046262.method_23317();
        this.M = (float)class046262.method_23318();
        this.B = (float)class046262.method_23321();
        this.Z = true;
        this.z = 0;
        this.u = 0.0f;
    }

    protected abstract class00155 b();

    public boolean s() {
        return !this.m.method_5701();
    }

    private float n() {
        if (this.m.method_6109()) {
            return 1.1f;
        }
        return 0.7f;
    }

    private float t() {
        if (this.m.method_6109()) {
            return 1.5f;
        }
        return 1.1f;
    }

    protected abstract boolean j();

    public boolean w_() {
        return true;
    }
}

