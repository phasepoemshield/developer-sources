/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00018
 *  minecraft.class00044
 *  minecraft.class00155
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class07049
 *  minecraft.class08036
 */
package minecraft;

import minecraft.class00018;
import minecraft.class00044;
import minecraft.class00155;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class07049;
import minecraft.class08036;

public class class08678
extends class00155 {
    private final class08036 m;
    private final class07049 P;
    private final boolean s;
    private final float T;
    private final float b;
    private final float j;

    public void P() {
        if (this.P.method_31481() || !this.m.method_5765() || this.m.method_5854() != this.P) {
            this.y();
            return;
        }
        if (this.T()) {
            this.u = this.T;
            return;
        }
        float f = this.b();
        this.u = f >= 0.01f && this.j() ? this.j * class04995.y((float)f, (float)this.T, (float)this.b) : this.T;
    }

    protected boolean T() {
        return this.s != this.P.method_5869();
    }

    public class08678(class08036 class080362, class07049 class070492, boolean bl, class04891 class048912, class04911 class049112, float f, float f2, float f3) {
        super(class048912, class049112, class00044.v());
        this.m = class080362;
        this.P = class070492;
        this.s = bl;
        this.T = f;
        this.b = f2;
        this.j = f3;
        this.U = class00018.field_5478;
        this.Z = true;
        this.z = 0;
        this.u = f;
    }

    protected float b() {
        return (float)this.P.method_18798().M();
    }

    public boolean s() {
        return !this.P.method_5701();
    }

    protected boolean j() {
        return true;
    }

    public boolean w_() {
        return true;
    }
}

