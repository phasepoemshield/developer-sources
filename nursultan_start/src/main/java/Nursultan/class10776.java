/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07473
 *  minecraft.class07637
 */
package Nursultan;

import minecraft.class07473;
import minecraft.class07637;

public class class10776
extends class07473 {
    private final class07637 N;
    private int y;

    public void L() {
        this.N.M(true);
        this.y = 0;
    }

    public class10776(class07637 class076372) {
        this.N = class076372;
    }

    public void u() {
        this.N.M(false);
        this.y = this.N.field_6012 + 200;
    }

    public boolean y() {
        if (this.N.method_5799() || !this.N.Q() && class07637.z((class07637)this.N).y(class10776.y((int)600)) == 1) {
            return false;
        }
        return class07637.U((class07637)this.N).y(class10776.y((int)2000)) != 1;
    }

    public boolean N() {
        return this.y < this.N.field_6012 && this.N.Q() && this.N.No() && class07637.Z((class07637)this.N).y(class10776.y((int)400)) == 1;
    }
}

