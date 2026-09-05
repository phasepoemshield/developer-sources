/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00044
 *  minecraft.class00155
 *  minecraft.class04453
 *  minecraft.class04909
 *  minecraft.class04911
 */
package Nursultan;

import minecraft.class00044;
import minecraft.class00155;
import minecraft.class04453;
import minecraft.class04909;
import minecraft.class04911;

public class class09052
extends class00155 {
    public static final int m = 40;
    private final class04453 P;
    private int s;

    public void P() {
        if (this.P.method_31481() || this.s < 0) {
            this.y();
            return;
        }
        this.s = this.P.method_5869() ? ++this.s : (this.s -= 2);
        this.s = Math.min(this.s, 40);
        this.u = Math.max(0.0f, Math.min((float)this.s / 40.0f, 1.0f));
    }

    public class09052(class04453 class044532) {
        super(class04909.w, class04911.field_15256, class00044.v());
        this.P = class044532;
        this.Z = true;
        this.z = 0;
        this.u = 1.0f;
        this.E = true;
    }
}

