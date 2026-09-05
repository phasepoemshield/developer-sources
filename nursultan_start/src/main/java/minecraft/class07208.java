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
 *  minecraft.class00511
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class01231
 *  minecraft.class01362
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06202
 *  minecraft.class06665
 *  minecraft.class06942
 *  minecraft.class07049
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08713
 *  minecraft.class08791
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00511;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class01231;
import minecraft.class01362;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06202;
import minecraft.class06665;
import minecraft.class06942;
import minecraft.class07049;
import minecraft.class07188;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07208
extends class00891 {
    public static final MapCodec<class07208> N = class07208.y(class07208::new);
    public static final class08071 y = class06665.NC;
    private static final class00494 u = class00891.y((double)16.0, (double)0.0, (double)15.0);
    public static final int L = 7;

    public class07208(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Integer.valueOf(0)));
    }

    public class00494 z(class00500 class005002) {
        if (class06202.Nq() != null && class06202.Nq().q()) {
            return super.z(class005002);
        }
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_9_3)) {
            return u;
        }
        return super.z(class005002);
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        int n = (Integer)class005002.L((class08092)y);
        if (class07208.N((class05487)class047822, class072092) || class047822.method_8520(class072092.method_10084())) {
            if (n < 7) {
                class047822.method_8652(class072092, (class00500)class005002.y((class08092)y, (Comparable)Integer.valueOf(7)), 2);
            }
        } else if (n > 0) {
            class047822.method_8652(class072092, (class00500)class005002.y((class08092)y, (Comparable)Integer.valueOf(n - 1)), 2);
        } else if (!class07208.N((class07290)class047822, class072092)) {
            class07208.N(null, class005002, (class07299)class047822, class072092);
        }
    }

    private static boolean N(class05487 class054872, class07209 class072092) {
        for (class07209 class072093 : class07209.method_10097(class072092.method_10069(-4, 0, -4), class072092.method_10069(4, 1, 4))) {
            if (!class054872.method_8316(class072093).N(class01231.N)) continue;
            return true;
        }
        return false;
    }

    private static boolean N(class07290 class072902, class07209 class072092) {
        return class072902.method_8320(class072092.method_10084()).N(class01210.La);
    }

    public static void N(@Nullable class07049 class070492, class00500 class005002, class07299 class072992, class07209 class072092) {
        class00500 class005003 = class07208.N_19((class00500)class005002, (class00500)class00869.z.W(), (class07284)class072992, (class07209)class072092);
        class072992.method_8501(class072092, class005003);
        class072992.N((class03556)class01194.L, class072092, class01164.N((class07049)class070492, (class00500)class005003));
    }

    public MapCodec<class07208> N() {
        return N;
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (class06202.Nq() != null && class06202.Nq().q()) {
            return;
        }
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_9_3)) {
            callbackInfoReturnable.setReturnValue((Object)class00389.y());
        }
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
    }

    public class00500 N(class06942 class069422) {
        if (!this.W().N((class05487)class069422.method_8045(), class069422.method_8037())) {
            return class00869.z.W();
        }
        return super.N(class069422);
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112 == class07211.field_11036 && !class005002.N(class054872, class072092)) {
            class087132.N(class072092, (class00891)this, 1);
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return u;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (!class005002.N((class05487)class047822, class072092)) {
            class07208.N(null, class005002, (class07299)class047822, class072092);
        }
    }

    public void N(class07299 class072992, class00500 class005002, class07209 class072092, class07049 class070492, double d) {
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            if ((double)class072992.field_9229.z() < d - 0.5 && class070492 instanceof class07438 && (class070492 instanceof class08036 || ((Boolean)class047822.method_64395().N(class07305.I)).booleanValue()) && class070492.method_17681() * class070492.method_17681() * class070492.method_17682() > 0.512f) {
                class07208.N(class070492, class005002, class072992, class072092);
            }
        }
        super.N(class072992, class005002, class072092, class070492, d);
    }

    protected boolean a_(class00500 class005002) {
        return true;
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class00500 class005003 = class054872.method_8320(class072092.method_10084());
        return !class005003.B() || class005003.i() instanceof class07188 || class005003.i() instanceof class00511;
    }
}

