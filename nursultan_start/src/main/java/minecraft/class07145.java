/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04891
 *  minecraft.class07438
 *  minecraft.class07473
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class04891;
import minecraft.class07148;
import minecraft.class07156;
import minecraft.class07438;
import minecraft.class07473;
import org.jspecify.annotations.Nullable;

public abstract class class07145
extends class07473 {
    protected int y;
    protected int L;
    final /* synthetic */ class07148 u;

    public void L() {
        this.y = this.N(this.m());
        this.u.y = this.M();
        this.L = this.u.field_6012 + this.Z();
        class04891 class048912 = this.E();
        if (class048912 != null) {
            this.u.method_5783(class048912, 1.0f, 1.0f);
        }
        this.u.N(this.W());
    }

    protected abstract int M();

    protected class07145(class07148 class071482) {
        this.u = class071482;
    }

    protected abstract int Z();

    public void i() {
        --this.y;
        if (this.y == 0) {
            this.U();
            this.u.method_5783(this.u.m(), 1.0f, 1.0f);
        }
    }

    protected int m() {
        return 20;
    }

    protected abstract void U();

    public boolean y() {
        class07438 class074382 = this.u.T();
        return class074382 != null && class074382.method_5805() && this.y > 0;
    }

    protected abstract @Nullable class04891 E();

    public boolean N() {
        class07438 class074382 = this.u.T();
        if (class074382 == null || !class074382.method_5805()) {
            return false;
        }
        if (this.u.n()) {
            return false;
        }
        return this.u.field_6012 >= this.L;
    }

    protected abstract class07156 W();
}

