/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00884
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08400
 *  minecraft.class08713
 *  minecraft.class08791
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00884;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08400;
import minecraft.class08713;
import minecraft.class08791;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07022
extends class00891 {
    public static final MapCodec<class07022> N = class07022.y(class07022::new);
    private static final class00494 y = class00891.y((double)16.0, (double)0.0, (double)14.0);
    private static final int L = 20;

    protected class00494 L(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return class00389.y();
    }

    public class07022(class01362 class013622) {
        super(class013622);
    }

    public float z() {
        return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4) ? 1.0f : super.z();
    }

    protected class00494 u(class00500 class005002, class07290 class072902, class07209 class072092) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return class00389.y();
    }

    protected float y(class00500 class005002, class07290 class072902, class07209 class072092) {
        return 0.2f;
    }

    protected class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return y;
    }

    public MapCodec<class07022> N() {
        return N;
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4)) {
            class070492.method_18799(class070492.method_18798().u(0.4, 1.0, 0.4));
        }
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().betweenInclusive(ProtocolVersion.v1_13, ProtocolVersion.v1_15_2)) {
            callbackInfoReturnable.setReturnValue((Object)class00389.N());
        }
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        class00884.y((class07284)class047822, (class07209)class072092.method_10084(), (class00500)class005002);
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112 == class07211.field_11036 && class005003.N(class00869.K)) {
            class087132.N(class072092, (class00891)this, 20);
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        class072992.N(class072092, (class00891)this, 20);
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }
}

