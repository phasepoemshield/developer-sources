/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00500
 *  minecraft.class00886
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04891
 *  minecraft.class05487
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class07132
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Optional;
import minecraft.class00500;
import minecraft.class00886;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04891;
import minecraft.class05487;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class07132;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public interface class06084
extends class00886,
class07132 {
    private void N(class07438 class074382, class07290 class072902, class07209 class072092, class00500 class005002, class04651 class046512, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    private void N(class07284 class072842, class07209 class072092, class00500 class005002, class04688 class046882, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    default public class06584 N(@Nullable class07438 class074382, class07284 class072842, class07209 class072092, class00500 class005002) {
        if (((Boolean)class005002.L((class08092)class06665.q)).booleanValue()) {
            class072842.method_8652(class072092, (class00500)class005002.y((class08092)class06665.q, (Comparable)Boolean.valueOf(false)), 3);
            if (!class005002.N((class05487)class072842, class072092)) {
                class072842.N(class072092, true);
            }
            return new class06584((class07310)class06570.jE);
        }
        return class06584.E;
    }

    default public boolean N(class07284 class072842, class07209 class072092, class00500 class005002, class04688 class046882) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class072842, class072092, class005002, class046882, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        if (!((Boolean)class005002.L((class08092)class06665.q)).booleanValue() && class046882.N() == class04684.L) {
            if (!class072842.method_8608()) {
                class072842.method_8652(class072092, (class00500)class005002.y((class08092)class06665.q, (Comparable)Boolean.valueOf(true)), 3);
                class072842.N(class072092, class046882.N(), class046882.N().N((class05487)class072842));
            }
            return true;
        }
        return false;
    }

    default public boolean N(@Nullable class07438 class074382, class07290 class072902, class07209 class072092, class00500 class005002, class04651 class046512) {
        boolean bl = class046512 == class04684.L;
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, bl);
        this.N(class074382, class072902, class072092, class005002, class046512, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return bl;
    }

    default public Optional<class04891> s_() {
        return class04684.L.z();
    }
}

