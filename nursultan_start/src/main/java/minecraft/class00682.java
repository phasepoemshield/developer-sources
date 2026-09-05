/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class01231
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class03810
 *  minecraft.class03831
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class07050
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07085
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07295
 *  minecraft.class07299
 *  minecraft.class07473
 *  minecraft.class07633
 *  minecraft.class07862
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00687;
import minecraft.class01231;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class03810;
import minecraft.class03831;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class07050;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07295;
import minecraft.class07299;
import minecraft.class07473;
import minecraft.class07633;
import minecraft.class07862;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00682
extends class07862 {
    private final class00687 f = new class00687(this);
    private static final int C = 18000;
    private static final boolean S = false;
    private static final int x = 0;
    private static final class01325 D = class07078.yP.E().N(class03810.N().N(class03831.field_47743, 0.0f, class07078.yP.U() - 0.03125f, 0.0f)).N(0.5f);
    private boolean h = false;
    private int r = 0;

    protected void Q() {
    }

    protected class04891 method_5737() {
        if (this.method_24828()) {
            if (this.method_5782()) {
                ++this.A;
                if (this.A > 5 && this.A % 3 == 0) {
                    return class04909.kT;
                }
                if (this.A <= 5) {
                    return class04909.kj;
                }
            } else {
                return class04909.kj;
            }
        }
        return class04909.kP;
    }

    protected void method_5734(float f) {
        if (this.method_24828()) {
            super.method_5734(0.3f);
        } else {
            super.method_5734(Math.min(0.1f, f * 25.0f));
        }
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("SkeletonTrap", this.v());
        class083292.N("SkeletonTrapTime", this.r);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N(class082992.N("SkeletonTrap", false));
        this.r = class082992.N("SkeletonTrapTime", 0);
    }

    public class00682(class07078<? extends class00682> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    protected class04891 s() {
        if (this.method_5777(class01231.N)) {
            return class04909.ks;
        }
        return class04909.kE;
    }

    public boolean v() {
        return this.h;
    }

    public @Nullable class07077 y(class04782 class047822, class07077 class070772) {
        return (class07077)class07078.yP.N((class07299)class047822, class06113.field_16466);
    }

    public void N(boolean bl) {
        if (bl == this.h) {
            return;
        }
        this.h = bl;
        if (bl) {
            this.e.N(1, (class07473)this.f);
        } else {
            this.e.N((class07473)this.f);
        }
    }

    public class07082 N(class08036 class080362, class07050 class070502) {
        if (!this.I()) {
            return class07082.i;
        }
        return super.N(class080362, class070502);
    }

    public static boolean N(class07078<? extends class07633> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        if (class06113.N((class06113)class061132)) {
            return class06113.y((class06113)class061132) || class00682.N((class07295)class072842, (class07209)class072092);
        }
        return class07633.L(class070782, (class07284)class072842, (class06113)class061132, (class07209)class072092, (class06069)class060692);
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf(super.method_6120()));
        }
    }

    protected void N(class06069 class060692) {
        this.method_5996(class05298.T).N(class00682.N(() -> ((class06069)class060692).U()));
    }

    public static class05300 W() {
        return class00682.NK().N(class05298.n, 15.0).N(class05298.l, (double)0.2f);
    }

    protected void Y() {
        if (this.method_5799()) {
            this.method_5783(class04909.kb, 0.4f, 1.0f);
        } else {
            super.Y();
        }
    }

    public class04891 method_6002() {
        return class04909.kW;
    }

    public class01325 method_55694(class01312 class013122) {
        return this.method_6109() ? D : super.method_55694(class013122);
    }

    public void method_6007() {
        super.method_6007();
        if (this.v() && this.r++ >= 18000) {
            this.method_31472();
        }
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.km;
    }

    public float method_6120() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueF();
        }
        return 0.96f;
    }

    public boolean method_56991(class07085 class070852) {
        return true;
    }
}

