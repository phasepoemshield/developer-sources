/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04995
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class07082
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08036
 *  minecraft.class08057
 *  minecraft.class08791
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04995;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class07082;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07204;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08036;
import minecraft.class08057;
import minecraft.class08791;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07184
extends class07204 {
    public static final MapCodec<class07184> N = class07184.y(class07184::new);
    private static final class00494 y = class00891.y((double)14.0, (double)0.0, (double)16.0);

    private void L(class00500 class005002, class07299 class072992, class07209 class072092) {
        class08057 class080572 = class072992.method_8621();
        for (int i = 0; i < 1000; ++i) {
            class07209 class072093 = class072092.method_10069(class072992.field_9229.y(16) - class072992.field_9229.y(16), class072992.field_9229.y(8) - class072992.field_9229.y(8), class072992.field_9229.y(16) - class072992.field_9229.y(16));
            if (!class072992.method_8320(class072093).P() || !class080572.N(class072093) || class072992.method_31606(class072093)) continue;
            if (class072992.method_8608()) {
                for (int j = 0; j < 128; ++j) {
                    double d = class072992.field_9229.U();
                    float f = (class072992.field_9229.z() - 0.5f) * 0.2f;
                    float f2 = (class072992.field_9229.z() - 0.5f) * 0.2f;
                    float f3 = (class072992.field_9229.z() - 0.5f) * 0.2f;
                    double d2 = class04995.u((double)d, (double)class072093.method_10263(), (double)class072092.method_10263()) + (class072992.field_9229.U() - 0.5) + 0.5;
                    double d3 = class04995.u((double)d, (double)class072093.method_10264(), (double)class072092.method_10264()) + class072992.field_9229.U() - 0.5;
                    double d4 = class04995.u((double)d, (double)class072093.method_10260(), (double)class072092.method_10260()) + (class072992.field_9229.U() - 0.5) + 0.5;
                    class072992.method_8406((class07126)class07107.NM, d2, d3, d4, (double)f, (double)f2, (double)f3);
                }
            } else {
                class072992.method_8652(class072093, class005002, 2);
                class072992.method_8650(class072092, false);
            }
            return;
        }
    }

    public class07184(class01362 class013622) {
        super(class013622);
    }

    public class00494 z(class00500 class005002) {
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            return y;
        }
        return super.z(class005002);
    }

    @Override
    protected int y() {
        return 5;
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            callbackInfoReturnable.setReturnValue((Object)class00389.y());
        }
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        class00494 class004942 = y;
        class00494 class004943 = class004942;
        class004943 = new CallbackInfoReturnable("", true, (Object)class004943);
        this.N(class005002, class072902, class072092, class060922, (CallbackInfoReturnable)class004943);
        if (class004943.isCancelled()) {
            return (class00494)class004943.getReturnValue();
        }
        return class004942;
    }

    public MapCodec<class07184> N() {
        return N;
    }

    @Override
    public int N(class00500 class005002, class07290 class072902, class07209 class072092) {
        return -16777216;
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        this.L(class005002, class072992, class072092);
        return class07082.N;
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    protected void a_(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362) {
        this.L(class005002, class072992, class072092);
    }
}

