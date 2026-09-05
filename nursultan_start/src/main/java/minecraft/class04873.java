/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
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
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class08092
 *  minecraft.class08713
 *  minecraft.class08791
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
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
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class04873
extends class00891
implements class06084 {
    public static final MapCodec<class04873> y = class04873.y(class04873::new);
    public static final class06667 L = class06665.W;
    public static final class06667 u = class06665.q;
    private static final class00494 N = class00389.N((class00494)class00891.y((double)4.0, (double)7.0, (double)9.0), (class00494)class00891.y((double)6.0, (double)0.0, (double)7.0));
    private static final class00494 i = N.method_1096(0.0, 0.0625, 0.0).method_1097();
    private static final class00494 R;
    private static final class00494 M;

    public class04873(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y((class08092)L, (Comparable)Boolean.valueOf(false))).y((class08092)u, (Comparable)Boolean.valueOf(false)));
    }

    protected static class07211 U(class00500 class005002) {
        return (Boolean)class005002.L((class08092)L) != false ? class07211.field_11033 : class07211.field_11036;
    }

    public class00494 z(class00500 class005002) {
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            return (Boolean)class005002.L((class08092)L) != false ? i : N;
        }
        return super.z(class005002);
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    public @Nullable class00500 N(class06942 class069422) {
        class04688 class046882 = class069422.method_8045().method_8316(class069422.method_8037());
        for (class07211 class072112 : class069422.i()) {
            class00500 class005002;
            if (class072112.z() != class07185.field_11052 || !(class005002 = (class00500)this.W().y((class08092)L, (Comparable)Boolean.valueOf(class072112 == class07211.field_11036))).N((class05487)class069422.method_8045(), class069422.method_8037())) continue;
            return (class00500)class005002.y((class08092)u, (Comparable)Boolean.valueOf(class046882.N() == class04684.L));
        }
        return null;
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            callbackInfoReturnable.setReturnValue((Object)((Boolean)class005002.L((class08092)L) != false ? M : R));
        }
    }

    public MapCodec<? extends class04873> N() {
        return y;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        class00494 class004942 = (Boolean)class005002.L((class08092)L) != false ? i : N;
        class00494 class004943 = class004942;
        class004943 = new CallbackInfoReturnable("", true, (Object)class004943);
        this.N(class005002, class072902, class072092, class060922, (CallbackInfoReturnable)class004943);
        if (class004943.isCancelled()) {
            return (class00494)class004943.getReturnValue();
        }
        return class004942;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        if (class04873.U(class005002).b() == class072112 && !class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L, u});
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class07211 class072112 = class04873.U(class005002).b();
        return class00891.N_6((class05487)class054872, (class07209)class072092.method_10093(class072112), (class07211)class072112.b());
    }
}

