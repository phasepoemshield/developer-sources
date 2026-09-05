/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00500
 *  minecraft.class01226
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05970
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07050
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07427
 *  minecraft.class07434
 *  minecraft.class07459
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07956
 *  minecraft.class07957
 *  minecraft.class07960
 *  minecraft.class07962
 *  minecraft.class07993
 *  minecraft.class08036
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00500;
import minecraft.class01226;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05970;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07427;
import minecraft.class07434;
import minecraft.class07459;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07633;
import minecraft.class07956;
import minecraft.class07957;
import minecraft.class07960;
import minecraft.class07962;
import minecraft.class07993;
import minecraft.class08036;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class07652
extends class07633 {
    private static final class01325 N = class07078.J.E().N(0.5f).y(0.665f);

    protected void method_5712(class07209 class072092, class00500 class005002) {
        this.method_5783(class04909.BU, 0.15f, 1.0f);
    }

    public class07652(class07078<? extends class07652> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public static class05300 B() {
        return class07633.Ne().N(class05298.n, 10.0).N(class05298.l, (double)0.2f);
    }

    protected class04891 s() {
        return class04909.BM;
    }

    @Override
    public class07082 N(class08036 class080362, class07050 class070502) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class080362, class070502, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class07082)callbackInfoReturnable.getReturnValue();
        }
        class06584 class065842 = class080362.method_5998(class070502);
        if (class065842.N(class06570.jU) && !this.method_6109()) {
            class080362.method_5783(class04909.Bz, 1.0f, 1.0f);
            class06584 class065843 = class05970.N((class06584)class065842, (class08036)class080362, (class06584)class06570.jT.E());
            class080362.method_6122(class070502, class065843);
            return class07082.N;
        }
        return super.N(class080362, class070502);
    }

    private void N(class08036 class080362, class07050 class070502, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2) && class080362.method_31549().u) {
            callbackInfoReturnable.setReturnValue((Object)super.N(class080362, class070502));
        }
    }

    @Override
    public boolean N(class06584 class065842) {
        return class065842.N(class01226.Ng);
    }

    protected void l_() {
        this.e.N(0, (class07473)new class07427((class07079)this));
        this.e.N(1, (class07473)new class07993((class07475)this, 2.0));
        this.e.N(2, (class07473)new class07434((class07633)this, 1.0));
        this.e.N(3, (class07473)new class07960((class07475)this, 1.25, class065842 -> class065842.N(class01226.Ng), false));
        this.e.N(4, (class07473)new class07459((class07633)this, 1.25));
        this.e.N(5, (class07473)new class07957((class07475)this, 1.0));
        this.e.N(6, (class07473)new class07962((class07079)this, class08036.class, 6.0f));
        this.e.N(7, (class07473)new class07956((class07079)this));
    }

    public class04891 method_6002() {
        return class04909.BB;
    }

    public float method_6107() {
        return 0.4f;
    }

    public class01325 method_55694(class01312 class013122) {
        return this.method_6109() ? N : super.method_55694(class013122);
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.BZ;
    }
}

