/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.features.block.interaction.Block1_14
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07101
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08713
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.features.block.interaction.Block1_14;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Map;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07101;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08713;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07123
extends class00891
implements class06084 {
    public static final MapCodec<class07123> N = class07123.y(class07123::new);
    public static final class08064<class07211> y = class07101.R;
    public static final class06667 L = class06665.q;
    public static final Map<class07211, class00494> u = class00389.L((class00494)class00891.L((double)16.0, (double)13.0, (double)16.0));
    private static final Map i;
    private static final Map R;

    private Map L() {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            return i;
        }
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            return R;
        }
        return u;
    }

    public class07123(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y(y, (Comparable)((Object)class07211.field_11043))).y((class08092)L, (Comparable)Boolean.valueOf(false)));
    }

    public class00494 z(class00500 class005002) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8) || ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            return u.get(class005002.L(y));
        }
        return super.z(class005002);
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)L)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)((Object)class005002.L(y))));
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L});
    }

    private void N(class00500 class005002, class05487 class054872, class07209 class072092, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14) && Block1_14.isExceptBlockForAttachWithPiston((class00891)class054872.method_8320(class072092).i())) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    public MapCodec<class07123> N() {
        return N;
    }

    private boolean N(class07290 class072902, class07209 class072092, class07211 class072112) {
        return class072902.method_8320(class072092).L(class072902, class072092, class072112);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return (class00494)this.L().get(class005002.L(y));
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112.b() == class005002.L(y) && !class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        if (((Boolean)class005002.L((class08092)L)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public @Nullable class00500 N(class06942 class069422) {
        class00500 class005002;
        if (!class069422.y() && (class005002 = class069422.method_8045().method_8320(class069422.method_8037().method_10093(class069422.method_8038().b()))).N((class00891)this) && class005002.L(y) == class069422.method_8038()) {
            return null;
        }
        class005002 = this.W();
        class07299 class072992 = class069422.method_8045();
        class07209 class072092 = class069422.method_8037();
        class04688 class046882 = class069422.method_8045().method_8316(class069422.method_8037());
        for (class07211 class072112 : class069422.i()) {
            if (!class072112.z().L() || !(class005002 = (class00500)class005002.y(y, (Comparable)((Object)class072112.b()))).N((class05487)class072992, class072092)) continue;
            return (class00500)class005002.y((class08092)L, (Comparable)Boolean.valueOf(class046882.N() == class04684.L));
        }
        return null;
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(y, (Comparable)((Object)class069932.N((class07211)((Object)class005002.L(y)))));
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class07211 class072112 = (class07211)((Object)class005002.L(y));
        boolean bl = this.N((class07290)class054872, class072092.method_10093(class072112.b()), class072112);
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, bl);
        this.N(class005002, class054872, class072092, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return bl;
    }
}

