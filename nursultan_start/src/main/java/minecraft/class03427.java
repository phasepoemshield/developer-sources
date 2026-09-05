/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04798
 *  minecraft.class05042
 *  minecraft.class05207
 *  minecraft.class05474
 *  minecraft.class06202
 *  minecraft.class07074
 *  minecraft.class07086
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import minecraft.class03386;
import minecraft.class04798;
import minecraft.class05042;
import minecraft.class05207;
import minecraft.class05474;
import minecraft.class06202;
import minecraft.class07074;
import minecraft.class07086;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03427
implements class05207 {
    private final boolean N;
    private final boolean y;
    private class05042 L;
    private long u;
    private long i;
    private boolean R;
    private class07086 M;
    private boolean B;

    public long L() {
        return this.i;
    }

    public boolean T() {
        return this.B;
    }

    public class03427(class07086 class070862, boolean bl, boolean bl2) {
        this.M = class070862;
        this.N = bl;
        this.y = bl2;
    }

    public boolean B() {
        return this.R;
    }

    public class07086 s() {
        return this.M;
    }

    public boolean U() {
        return this.N;
    }

    public float u() {
        if (this.y) {
            return 1.0f;
        }
        return 32.0f;
    }

    public void y(boolean bl) {
        this.R = bl;
    }

    public void y(long l) {
        this.i = l;
    }

    public long y() {
        return this.u;
    }

    public void N(boolean bl) {
        this.B = bl;
    }

    public void N(class07086 class070862) {
        this.M = class070862;
    }

    public double N(class05474 class054742) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueD();
        }
        if (this.y) {
            return class054742.method_31607();
        }
        return 63.0;
    }

    public class05042 N() {
        return this.L;
    }

    public void N(class07074 class070742, class05474 class054742) {
        super.N(class070742, class054742);
    }

    public void N(class05042 class050422) {
        this.L = class050422;
    }

    public void N(long l) {
        this.u = l;
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (((class03386)class06202.Nq().i_5).s().W() != class04798.field_27888) {
            callbackInfoReturnable.setReturnValue((Object)Double.NEGATIVE_INFINITY);
        }
    }

    public boolean R() {
        return false;
    }
}

