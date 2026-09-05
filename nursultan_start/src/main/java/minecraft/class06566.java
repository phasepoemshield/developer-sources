/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class01235
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07488
 *  minecraft.class08005
 *  minecraft.class08036
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class01235;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07488;
import minecraft.class08005;
import minecraft.class08036;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06566
extends class06581 {
    public static float N = 1.5f;

    public class06566(class06573 class065732) {
        super(class065732);
    }

    @Override
    public class07082 N(class07299 class072992, class08036 class080362, class07050 class070502) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class072992, class080362, class070502, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class07082)callbackInfoReturnable.getReturnValue();
        }
        class06584 class065842 = class080362.method_5998(class070502);
        class072992.method_43128(null, class080362.method_23317(), class080362.method_23318(), class080362.method_23321(), class04909.Uy, class04911.field_15254, 0.5f, 0.4f / (class072992.method_8409().z() * 0.4f + 0.8f));
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            class08005.N(class07488::new, (class04782)class047822, (class06584)class065842, (class07438)class080362, (float)0.0f, (float)N, (float)1.0f);
        }
        class080362.method_7259(class01235.L.y((Object)this));
        class065842.N(1, (class07438)class080362);
        return class07082.N;
    }

    private void N(class07299 class072992, class08036 class080362, class07050 class070502, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8) && class080362.method_31549().u) {
            callbackInfoReturnable.setReturnValue((Object)class07082.i);
        }
    }
}

