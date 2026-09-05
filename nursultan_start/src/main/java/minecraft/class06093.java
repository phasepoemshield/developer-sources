/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class04688
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07322
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import minecraft.class00494;
import minecraft.class00500;
import minecraft.class04688;
import minecraft.class06092;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07322;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06093
implements class06092 {
    private final boolean N;
    private final double y;
    private final boolean L;
    private class06584 u;
    private final boolean i;
    private final @Nullable class07049 R;

    @Override
    public boolean L() {
        return this.N;
    }

    public class06584 M() {
        this.N((CallbackInfoReturnable)null);
        return this.u;
    }

    @Deprecated
    protected class06093(class07049 class070492, boolean bl, boolean bl2) {
        this(class070492.method_21752(), bl2, class070492.method_23318(), class06093.N((Object)class070492, class07438.class) ? ((class07438)class070492).method_6047() : class06584.E, bl, class070492);
        this.N(class070492, bl, bl2, null);
    }

    public class06093(boolean bl, boolean bl2, double d, class06584 class065842, boolean bl3, @Nullable class07049 class070492) {
        this.N = bl;
        this.L = bl2;
        this.y = d;
        this.u = class065842;
        this.i = bl3;
        this.R = class070492;
    }

    private void B() {
        if (this.u == null) {
            this.u = this.R instanceof class07438 ? ((class07438)this.R).method_6047() : class06584.E;
        }
    }

    @Override
    public boolean i() {
        return this.L;
    }

    @Override
    public boolean u() {
        return this.i;
    }

    private void N(class07049 class070492, boolean bl, boolean bl2, CallbackInfo callbackInfo) {
        this.u = null;
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        this.B();
    }

    public void N_55(class06581 class065812, CallbackInfoReturnable callbackInfoReturnable) {
        this.B();
    }

    @Override
    public boolean N(class06581 class065812) {
        this.N_55(class065812, null);
        return this.u.N(class065812);
    }

    @Override
    public class00494 N(class00500 class005002, class07322 class073222, class07209 class072092) {
        return class005002.y((class07290)class073222, class072092, (class06092)this);
    }

    @Override
    public boolean N(class04688 class046882, class04688 class046883) {
        class07049 class070492 = this.R;
        if (class070492 instanceof class07438) {
            return ((class07438)class070492).method_26319(class046883) && !class046882.N().N(class046883.N());
        }
        return false;
    }

    @Override
    public boolean N(class00494 class004942, class07209 class072092, boolean bl) {
        return this.y > (double)class072092.method_10264() + class004942.method_1105(class07185.field_11052) - (double)1.0E-5f;
    }

    private static boolean N(Object object, Class clazz) {
        return false;
    }

    public @Nullable class07049 R() {
        return this.R;
    }
}

