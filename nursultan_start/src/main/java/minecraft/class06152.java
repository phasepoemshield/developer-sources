/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07430
 *  minecraft.class07473
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class06165;
import minecraft.class07430;
import minecraft.class07473;

class class06152
extends class07473 {
    int N;
    final /* synthetic */ class06165 y;

    public void L() {
        this.N = this.N(40);
    }

    public class06152(class06165 class061652) {
        this.y = class061652;
        this.N_71(EnumSet.of(class07430.field_18406, class07430.field_18407, class07430.field_18405));
    }

    public void i() {
        --this.N;
    }

    public void u() {
        this.y.M(false);
    }

    public boolean y() {
        return this.N() && this.N > 0;
    }

    public boolean N() {
        return this.y.n();
    }
}

