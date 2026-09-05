/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07079
 *  minecraft.class07430
 *  minecraft.class07473
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class07079;
import minecraft.class07430;
import minecraft.class07473;

public class class07956
extends class07473 {
    private final class07079 N;
    private double y;
    private double L;
    private int u;

    public void L() {
        double d = Math.PI * 2 * this.N.method_59922().U();
        this.y = Math.cos(d);
        this.L = Math.sin(d);
        this.u = 20 + this.N.method_59922().y(20);
    }

    public class07956(class07079 class070792) {
        this.N = class070792;
        this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
    }

    public boolean B() {
        return true;
    }

    public void i() {
        --this.u;
        this.N.p().N(this.N.method_23317() + this.y, this.N.method_23320(), this.N.method_23321() + this.L);
    }

    public boolean y() {
        return this.u >= 0;
    }

    public boolean N() {
        return this.N.method_59922().z() < 0.02f;
    }
}

