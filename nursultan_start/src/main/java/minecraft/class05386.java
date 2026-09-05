/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00044
 *  minecraft.class00155
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class04995
 */
package minecraft;

import minecraft.class00044;
import minecraft.class00155;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class04995;

public class class05386
extends class00155 {
    private int m;
    private int P;

    public void P() {
        if (this.P < 0) {
            this.y();
        }
        this.P += this.m;
        this.u = class04995.N((float)((float)this.P / 40.0f), (float)0.0f, (float)1.0f);
    }

    public class05386(class04891 class048912) {
        super(class048912, class04911.field_15256, class00044.v());
        this.Z = true;
        this.z = 0;
        this.u = 1.0f;
        this.E = true;
    }

    public void b() {
        this.P = Math.min(this.P, 40);
        this.m = -1;
    }

    public void j() {
        this.P = Math.max(0, this.P);
        this.m = 1;
    }
}

