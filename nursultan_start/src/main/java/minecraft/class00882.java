/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class01210
 *  minecraft.class01231
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06665
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08400
 *  minecraft.class08713
 *  minecraft.class08791
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01231;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06665;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08400;
import minecraft.class08713;
import minecraft.class08791;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00882
extends class00891 {
    public static final MapCodec<class00882> N = class00882.y(class00882::new);
    public static final class08071 y = class06665.Nk;
    public static final int L = 15;
    private static final class00494 u = class00891.y(14.0, 0.0, 16.0);
    private static final class00494 i = class00891.y(14.0, 0.0, 15.0);
    private static final int R = 3;
    private static final int M = 8;
    private static final double B = 0.1;
    private static final double Z = 0.25;
    private static final class00494 O;

    public class00882(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Integer.valueOf(0)));
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        class07209 class072093 = class072092.method_10084();
        if (!class047822.R(class072093)) {
            return;
        }
        int n = 1;
        int n2 = (Integer)class005002.L((class08092)y);
        while (class047822.method_8320(class072092.method_10087(n)).N((class00891)this)) {
            if (++n != 3 || n2 != 15) continue;
            return;
        }
        if (n2 == 8 && this.a_(this.W(), (class05487)class047822, class072092.method_10084())) {
            double d;
            double d2 = d = n >= 3 ? 0.25 : 0.1;
            if (class060692.U() <= d) {
                class047822.method_8501(class072093, class00869.iv.W());
            }
        } else if (n2 == 15 && n < 3) {
            class047822.method_8501(class072093, this.W());
            class00500 class005003 = (class00500)class005002.y((class08092)y, (Comparable)Integer.valueOf(0));
            class047822.method_8652(class072092, class005003, 260);
            class047822.method_41410(class005003, class072093, (class00891)this, null, false);
        }
        if (n2 < 15) {
            class047822.method_8652(class072092, (class00500)class005002.y((class08092)y, (Comparable)Integer.valueOf(n2 + 1)), 260);
        }
    }

    protected class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        class00494 class004942 = i;
        class00494 class004943 = class004942;
        class004943 = new CallbackInfoReturnable("", true, (Object)class004943);
        this.N(class005002, class072902, class072092, class060922, (CallbackInfoReturnable)class004943);
        if (class004943.isCancelled()) {
            return (class00494)class004943.getReturnValue();
        }
        return class004942;
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl) {
        class070492.method_64419(class072992.method_48963().U(), 1.0f);
    }

    @Override
    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            callbackInfoReturnable.setReturnValue((Object)O);
        }
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (!class005002.N((class05487)class047822, class072092)) {
            class047822.N(class072092, true);
        }
    }

    public MapCodec<class00882> N() {
        return N;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (!class005002.N(class054872, class072092)) {
            class087132.N(class072092, (class00891)this, 1);
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return u;
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        for (class07211 class072112 : class07221.field_11062) {
            if (!class054872.method_8320(class072092.method_10093(class072112)).B() && !class054872.method_8316(class072092.method_10093(class072112)).N(class01231.y)) continue;
            return false;
        }
        class00500 class005003 = class054872.method_8320(class072092.method_10074());
        return (class005003.N(class00869.ij) || class005003.N(class01210.I)) && !class054872.method_8320(class072092.method_10084()).T();
    }
}

