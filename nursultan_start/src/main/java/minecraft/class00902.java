/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00389
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00415
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class01118
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06237
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06704
 *  minecraft.class07082
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07482
 *  minecraft.class07796
 *  minecraft.class08036
 *  minecraft.class08092
 *  minecraft.class08791
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00389;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00415;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01118;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06237;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06704;
import minecraft.class07082;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07482;
import minecraft.class07796;
import minecraft.class08036;
import minecraft.class08092;
import minecraft.class08791;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00902
extends class07796 {
    public static final MapCodec<class00902> N = class00902.y(class00902::new);
    public static final class06667[] y = new class06667[]{class06665.m, class06665.P, class06665.s};
    private static final class00494 L = class00389.N((class00494)class00891.y(2.0, 2.0, 14.0), (class00494)class00891.y(14.0, 0.0, 2.0));
    private static final class00494 u;

    public class00902(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)y[0], (Comparable)Boolean.valueOf(false))).y((class08092)y[1], (Comparable)Boolean.valueOf(false))).y((class08092)y[2], (Comparable)Boolean.valueOf(false)));
    }

    protected boolean N(class00500 class005002) {
        return true;
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        return class07482.N((class00394)class072992.method_8321(class072092));
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        class06704.N((class00500)class005002, (class07299)class047822, (class07209)class072092);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y[0], y[1], y[2]});
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            callbackInfoReturnable.setReturnValue((Object)u);
        }
    }

    public MapCodec<class00902> N() {
        return N;
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class00415(class072092, class005002);
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072992, class00500 class005002, class00404<T> class004042) {
        return class072992.method_8608() ? null : class00902.N(class004042, (class00404)class00404.field_11894, class00415::N);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return L;
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        class00394 class003942;
        if (!class072992.method_8608() && (class003942 = class072992.method_8321(class072092)) instanceof class00415) {
            class00415 class004152 = (class00415)class003942;
            class080362.method_17355((class06237)class004152);
            class080362.method_7281(class01235.NL);
        }
        return class07082.N;
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        double d = (double)class072092.method_10263() + 0.4 + (double)class060692.z() * 0.2;
        double d2 = (double)class072092.method_10264() + 0.7 + (double)class060692.z() * 0.3;
        double d3 = (double)class072092.method_10260() + 0.4 + (double)class060692.z() * 0.2;
        class072992.method_8406((class07126)class07107.NZ, d, d2, d3, 0.0, 0.0, 0.0);
    }
}

