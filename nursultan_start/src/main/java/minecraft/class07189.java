/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  minecraft.class00379
 *  minecraft.class00389
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01118
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class01514
 *  minecraft.class03965
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class05982
 *  minecraft.class06025
 *  minecraft.class06029
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06237
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06695
 *  minecraft.class06940
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07082
 *  minecraft.class07101
 *  minecraft.class07281
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07490
 *  minecraft.class08036
 *  minecraft.class08044
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08713
 *  minecraft.class08791
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import minecraft.class00379;
import minecraft.class00389;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01118;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class01514;
import minecraft.class03965;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class05982;
import minecraft.class06025;
import minecraft.class06029;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06237;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06695;
import minecraft.class06940;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07082;
import minecraft.class07101;
import minecraft.class07107;
import minecraft.class07111;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07281;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07490;
import minecraft.class08036;
import minecraft.class08044;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07189
extends class05982<class07281>
implements class06084 {
    public static final MapCodec<class07189> N = class07189.y(class07189::new);
    public static final class08064<class07211> y = class07101.R;
    public static final class06667 L = class06665.q;
    private static final class00494 u = class00891.y((double)14.0, (double)0.0, (double)14.0);
    private static final class00392 i = class00392.L((String)"container.enderchest");
    private static final class00494 R;

    public class07189(class01362 class013622) {
        super(class013622, () -> class00404.field_11901);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y(y, (Comparable)((Object)class07211.field_11043))).y((class08092)L, (Comparable)Boolean.valueOf(false)));
    }

    public class00494 z(class00500 class005002) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_4_2) || ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            return u;
        }
        return super.z(class005002);
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)L)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)L)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L});
    }

    public MapCodec<class07189> N() {
        return N;
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_4_2)) {
            callbackInfoReturnable.setReturnValue((Object)class00389.y());
        } else if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            callbackInfoReturnable.setReturnValue((Object)R);
        }
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        class00394 class003942 = class047822.method_8321(class072092);
        if (class003942 instanceof class07281) {
            ((class07281)class003942).N();
        }
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class07281(class072092, class005002);
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080363, class06183 class061832) {
        class06940 class069402 = class080363.method_7274();
        class00394 class003942 = class072992.method_8321(class072092);
        if (class069402 == null || !(class003942 instanceof class07281)) {
            return class07082.N;
        }
        class07281 class072812 = (class07281)class003942;
        class07209 class072093 = class072092.method_10084();
        if (class072992.method_8320(class072093).u((class07290)class072992, class072093)) {
            return class07082.N;
        }
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            class069402.N(class072812);
            class080363.method_17355((class06237)new class03965((n, class080442, class080362) -> class07490.N((int)n, (class08044)class080442, (class06695)class069402), i));
            class080363.method_7281(class01235.NE);
            class01514.N((class04782)class047822, (class08036)class080363, (boolean)true);
        }
        return class07082.N;
    }

    public class00500 N(class06942 class069422) {
        class04688 class046882 = class069422.method_8045().method_8316(class069422.method_8037());
        return (class00500)((class00500)this.W().y(y, (Comparable)((Object)class069422.method_8042().b()))).y((class08092)L, (Comparable)Boolean.valueOf(class046882.N() == class04684.L));
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return u;
    }

    public class06025<? extends class00379> N(class00500 class005002, class07299 class072992, class07209 class072092, boolean bl) {
        return class06029::y;
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)((Object)class005002.L(y))));
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(y, (Comparable)((Object)class069932.N((class07211)((Object)class005002.L(y)))));
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        for (int i = 0; i < 3; ++i) {
            int n = class060692.y(2) * 2 - 1;
            int n2 = class060692.y(2) * 2 - 1;
            double d = (double)class072092.method_10263() + 0.5 + 0.25 * (double)n;
            double d2 = (float)class072092.method_10264() + class060692.z();
            double d3 = (double)class072092.method_10260() + 0.5 + 0.25 * (double)n2;
            double d4 = class060692.z() * (float)n;
            double d5 = ((double)class060692.z() - 0.5) * 0.125;
            double d6 = class060692.z() * (float)n2;
            class072992.method_8406((class07126)class07107.NM, d, d2, d3, d4, d5, d6);
        }
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072992, class00500 class005002, class00404<T> class004042) {
        return class072992.method_8608() ? class07189.N(class004042, (class00404)class00404.field_11901, class07281::N) : null;
    }
}

