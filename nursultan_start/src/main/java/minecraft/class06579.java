/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00696
 *  minecraft.class01194
 *  minecraft.class01235
 *  minecraft.class03529
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07299
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class08005
 *  minecraft.class08036
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00696;
import minecraft.class01194;
import minecraft.class01235;
import minecraft.class03529;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07299;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class08005;
import minecraft.class08036;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06579
extends class06581 {
    public class06579(class06573 class065732) {
        super(class065732);
    }

    @Override
    public class07082 N(class07299 class072992, class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        if (class080362.fields_57fa3311b0e9d3e9b883d09222919bf5a_2 != null) {
            if (!class072992.method_8608()) {
                int n = class080362.fields_57fa3311b0e9d3e9b883d09222919bf5a_2.N(class065842);
                class065842.N(n, (class07438)class080362, class070502.N());
            }
            class072992.method_43128(null, class080362.method_23317(), class080362.method_23318(), class080362.method_23321(), class04909.UV, class04911.field_15254, 1.0f, 0.4f / (class072992.method_8409().z() * 0.4f + 0.8f));
            class065842.N((class07049)class080362, (class03529<class01194>)class01194.Q);
        } else {
            class072992.method_43128(null, class080362.method_23317(), class080362.method_23318(), class080362.method_23321(), class04909.UH, class04911.field_15254, 0.5f, 0.4f / (class072992.method_8409().z() * 0.4f + 0.8f));
            if (class072992 instanceof class04782) {
                class04782 class047822 = (class04782)class072992;
                int n = (int)(class07323.y((class04782)class047822, (class06584)class065842, (class07049)class080362) * 20.0f);
                int n2 = class07323.N((class04782)class047822, (class06584)class065842, (class07049)class080362);
                class08005.N((class08005)new class00696(class080362, class072992, n2, n), (class04782)class047822, (class06584)class065842);
            }
            class080362.method_7259(class01235.L.y((Object)this));
            class065842.N((class07049)class080362, (class03529<class01194>)class01194.O);
        }
        this.N(class072992, class080362, class070502, null);
        return class07082.N;
    }

    private void N(class07299 class072992, class08036 class080362, class07050 class070502, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4)) {
            class080362.method_6104(class070502);
        }
    }
}

