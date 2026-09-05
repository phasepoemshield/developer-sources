/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.features.block.interaction.Block1_14
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class08713
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.features.block.interaction.Block1_14;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class08713;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class03710
extends class00891 {
    private static final class00494 N = class00891.y((double)4.0, (double)0.0, (double)10.0);

    public class03710(class01362 class013622) {
        super(class013622);
    }

    private void N(class00500 class005002, class05487 class054872, class07209 class072092, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14) && Block1_14.isExceptBlockForAttachWithPiston((class00891)class054872.method_8320(class072092).i())) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112 == class07211.field_11033 && !this.a_(class005002, class054872, class072092)) {
            return class00869.N.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return N;
    }

    protected abstract MapCodec<? extends class03710> N();

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        boolean bl = class03710.N_6((class05487)class054872, (class07209)class072092.method_10074(), (class07211)class07211.field_11036);
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, bl);
        this.N(class005002, class054872, class072092, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return bl;
    }
}

