/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00608
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01194
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class02584
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04782
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06918
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08713
 *  minecraft.class08791
 *  minecraft.class08846
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Map;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00608;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01194;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class02584;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04782;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06918;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08713;
import minecraft.class08791;
import minecraft.class08846;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00757
extends class00891 {
    public static final MapCodec<class00757> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04206.i.T().fieldOf("potted").forGetter(class007572 -> class007572.u), (App)class00757.t()).apply(instance, class00757::new));
    private static final Map<class00891, class00891> y = Maps.newHashMap();
    private static final class00494 L = class00891.y((double)6.0, (double)0.0, (double)6.0);
    private final class00891 u;

    private boolean L() {
        return this.u == class00869.N;
    }

    public class00757(class00891 class008912, class01362 class013622) {
        super(class013622);
        this.u = class008912;
        y.put(class008912, this);
    }

    public class00500 U(class00500 class005002) {
        if (class005002.N(class00869.nh)) {
            return class00869.nr.W();
        }
        if (class005002.N(class00869.nr)) {
            return class00869.nh.W();
        }
        return class005002;
    }

    public class00891 y() {
        return this.u;
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        boolean bl;
        boolean bl2;
        if (this.e_(class005002) && (bl2 = this.u == class00869.nx) != (bl = ((class02584)class047822.method_75728().N(class00608.o, class072092)).y(bl2))) {
            class047822.method_8652(class072092, this.U(class005002), 3);
            class08846 class088462 = class08846.N((boolean)bl2).L();
            class088462.N(class047822, class072092, class060692);
            class047822.method_8396(null, class072092, class088462.i(), class04911.field_15245, 1.0f, 1.0f);
        }
        super.y_2(class005002, class047822, class072092, class060692);
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_10) && this.u != class00869.N) {
            callbackInfoReturnable.setReturnValue((Object)class07082.L);
        }
    }

    protected class07082 N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832) {
        class00891 class008912;
        class06581 class065812 = class065842.B();
        if (class065812 instanceof class06918) {
            class06918 class069182 = (class06918)class065812;
            class008912 = y.getOrDefault(class069182.L(), class00869.N);
        } else {
            class008912 = class00869.N;
        }
        class00500 class005003 = class008912.W();
        if (class005003.P()) {
            return class07082.R;
        }
        if (!this.L()) {
            return class07082.L;
        }
        class072992.method_8652(class072092, class005003, 3);
        class072992.N((class07049)class080362, (class03556)class01194.L, class072092);
        class080362.method_7281(class01235.Nz);
        class065842.N(1, (class07438)class080362);
        return class07082.N;
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        if (this.L()) {
            return class07082.L;
        }
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class07082)callbackInfoReturnable.getReturnValue();
        }
        class06584 class065842 = new class06584((class07310)this.u);
        if (!class080362.method_7270(class065842)) {
            class080362.method_7328(class065842, false);
        }
        class072992.method_8652(class072092, class00869.MJ.W(), 3);
        class072992.N((class07049)class080362, (class03556)class01194.L, class072092);
        return class07082.N;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return L;
    }

    public class06584 N(class05487 class054872, class07209 class072092, class00500 class005002, boolean bl) {
        if (this.L()) {
            return super.N(class054872, class072092, class005002, bl);
        }
        return new class06584((class07310)this.u);
    }

    public MapCodec<class00757> N() {
        return N;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112 == class07211.field_11033 && !class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected boolean e_(class00500 class005002) {
        return class005002.N(class00869.nh) || class005002.N(class00869.nr);
    }
}

