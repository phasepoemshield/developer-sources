/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00250
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00864
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class06092
 *  minecraft.class07049
 *  minecraft.class07133
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08400
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00250;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00864;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class06092;
import minecraft.class07049;
import minecraft.class07133;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08400;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00643
extends class00864 {
    public static final MapCodec<class00643> N = class00643.y(class00643::new);
    private static final class00494 y = class00891.y((double)14.0, (double)0.0, (double)1.5);
    private static final class00494 L;

    public class00643(class01362 class013622) {
        super(class013622);
    }

    protected boolean N(class00500 class005002, class07290 class072902, class07209 class072092) {
        class04688 class046882 = class072902.method_8316(class072092);
        class04688 class046883 = class072902.method_8316(class072092.method_10084());
        return (class046882.N() == class04684.L || class005002.i() instanceof class07133) && class046883.N() == class04684.N;
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            callbackInfoReturnable.setReturnValue((Object)L);
        }
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return y;
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl) {
        super.N(class005002, class072992, class072092, class070492, class084002, bl);
        if (class072992 instanceof class04782 && class070492 instanceof class00250) {
            class072992.N(new class07209((class00753)class072092), true, class070492);
        }
    }

    public MapCodec<class00643> N() {
        return N;
    }
}

