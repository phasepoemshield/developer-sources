/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00737
 *  minecraft.class01235
 *  minecraft.class02649
 *  minecraft.class02661
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06501
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07210
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08005
 *  minecraft.class08006
 *  minecraft.class08036
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00737;
import minecraft.class01235;
import minecraft.class02649;
import minecraft.class02661;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06501;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08005;
import minecraft.class08006;
import minecraft.class08036;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06587
extends class06581
implements class02661 {
    public static final byte[] N = new byte[]{1, 2, 3};
    public static final double y = 0.15;

    public class06587(class06573 class065732) {
        super(class065732);
    }

    private static class06889 N(class07210 class072102, class07211 class072112) {
        return class072102.N().y((double)class072112.P() * 0.5000099999997474, (double)class072112.s() * 0.5000099999997474, (double)class072112.T() * 0.5000099999997474);
    }

    private void N(class06501 class065012, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_5)) {
            callbackInfoReturnable.setReturnValue((Object)class07082.N);
        }
    }

    private boolean N(class08036 class080362) {
        return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_11) && class080362.method_6128();
    }

    @Override
    public class07082 N(class06501 class065012) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class065012, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class07082)callbackInfoReturnable.getReturnValue();
        }
        class07299 class072992 = class065012.method_8045();
        class08036 class080362 = class065012.method_8036();
        if (class080362 != null && class080362.method_6128()) {
            return class07082.i;
        }
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            class06584 class065842 = class065012.method_8041();
            class06889 class068892 = class065012.method_17698();
            class07211 class072112 = class065012.method_8038();
            class08005.N((class08005)new class08006(class072992, (class07049)class065012.method_8036(), class068892.M + (double)class072112.P() * 0.15, class068892.B + (double)class072112.s() * 0.15, class068892.Z + (double)class072112.T() * 0.15, class065842), (class04782)class047822, (class06584)class065842);
            class065842.B(1);
        }
        return class07082.N;
    }

    @Override
    public class07082 N(class07299 class072992, class08036 class080362, class07050 class070502) {
        class08036 class080363 = class080362;
        if (this.N(class080363)) {
            class06584 class065842 = class080362.method_5998(class070502);
            if (class072992 instanceof class04782) {
                class04782 class047822 = (class04782)class072992;
                if (class080362.method_70988(null)) {
                    class072992.method_43129(null, (class07049)class080362, class04909.Tu, class04911.field_15254, 1.0f, 1.0f);
                }
                class08005.N((class08005)new class08006(class072992, class065842, (class07438)class080362), (class04782)class047822, (class06584)class065842);
                class065842.N(1, (class07438)class080362);
                class080362.method_7259(class01235.L.y((Object)this));
            }
            return class07082.N;
        }
        return class07082.i;
    }

    public class08005 N(class07299 class072992, class00737 class007372, class06584 class065842, class07211 class072112) {
        return new class08006(class072992, class065842.L(1), class007372.N(), class007372.y(), class007372.L(), true);
    }

    public class02649 N() {
        return class02649.N().N(class06587::N).N(1.0f).y(0.5f).N(1004).N();
    }
}

