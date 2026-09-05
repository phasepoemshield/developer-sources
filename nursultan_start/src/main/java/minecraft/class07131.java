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
 *  minecraft.class00517
 *  minecraft.class00753
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class02615
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08713
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.OptionalInt;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00753;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class02615;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06942;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08713;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class07131
extends class00891
implements class06084 {
    public static final int L = 7;
    public static final class08071 u = class06665.NJ;
    public static final class06667 i = class06665.w;
    public static final class06667 R = class06665.q;
    protected final float M;
    private static final int N = 1;
    private static boolean y = true;

    public static OptionalInt T(class00500 class005002) {
        if (class005002.N(class01210.g)) {
            return OptionalInt.of(0);
        }
        if (class005002.y((class08092)u)) {
            return OptionalInt.of((Integer)class005002.L((class08092)u));
        }
        return OptionalInt.empty();
    }

    public class07131(float f, class01362 class013622) {
        super(class013622);
        this.M = f;
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)u, (Comparable)Integer.valueOf(7))).y((class08092)i, (Comparable)Boolean.valueOf(false))).y((class08092)R, (Comparable)Boolean.valueOf(false)));
    }

    private static int b(class00500 class005002) {
        return class07131.T(class005002).orElse(7);
    }

    protected boolean U(class00500 class005002) {
        return (Boolean)class005002.L((class08092)i) == false && (Integer)class005002.L((class08092)u) == 7;
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)R)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    protected class00494 u(class00500 class005002, class07290 class072902, class07209 class072092) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return class00389.N();
    }

    private void y(class07299 class072992, class07209 class072092, class06069 class060692, class00500 class005002, class07209 class072093) {
        if (class060692.z() >= this.M) {
            return;
        }
        if (class07131.N((class00494)class005002.M((class07290)class072992, class072093), (class07211)class07211.field_11036)) {
            return;
        }
        this.N(class072992, class072092, class060692);
    }

    private static class00500 y(class00500 class005002, class07284 class072842, class07209 class072092) {
        int n = 7;
        class07218 class072182 = new class07218();
        for (class07211 class072112 : class07211.values()) {
            class072182.N((class00753)class072092, class072112);
            n = Math.min(n, class07131.b(class072842.method_8320((class07209)class072182)) + 1);
            if (n == 1) break;
        }
        return (class00500)class005002.y((class08092)u, (Comparable)Integer.valueOf(n));
    }

    protected boolean y(class00500 class005002, class00500 class005003, class07211 class072112) {
        if (!y && class005003.i() instanceof class07131) {
            return true;
        }
        return super.y(class005002, class005003, class072112);
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (this.U(class005002)) {
            class07131.y((class00500)class005002, (class07299)class047822, (class07209)class072092);
            class047822.method_8650(class072092, false);
        }
    }

    private static void N(class07299 class072992, class07209 class072092, class06069 class060692, class00500 class005002, class07209 class072093) {
        if (!class072992.method_8520(class072092.method_10084())) {
            return;
        }
        if (class060692.y(15) != 1) {
            return;
        }
        if (class005002.G() && class005002.L((class07290)class072992, class072093, class07211.field_11036)) {
            return;
        }
        class02615.N((class07299)class072992, (class07209)class072092, (class06069)class060692, (class07126)class07107.W);
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().betweenInclusive(ProtocolVersion.v1_14, ProtocolVersion.v1_15_2)) {
            callbackInfoReturnable.setReturnValue((Object)super.u(class005002, class072902, class072092));
        }
    }

    public class00500 N(class06942 class069422) {
        class04688 class046882 = class069422.method_8045().method_8316(class069422.method_8037());
        return class07131.y((class00500)((class00500)this.W().y((class08092)i, (Comparable)Boolean.valueOf(true))).y((class08092)R, (Comparable)Boolean.valueOf(class046882.N() == class04684.L)), (class07284)class069422.method_8045(), class069422.method_8037());
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{u, i, R});
    }

    protected abstract void N(class07299 var1, class07209 var2, class06069 var3);

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        class047822.method_8652(class072092, class07131.y(class005002, (class07284)class047822, class072092), 3);
    }

    public static void N(boolean bl) {
        y = bl;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        int n;
        if (((Boolean)class005002.L((class08092)R)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        if ((n = class07131.b(class005003) + 1) != 1 || (Integer)class005002.L((class08092)u) != n) {
            class087132.N(class072092, (class00891)this, 1);
        }
        return class005002;
    }

    public abstract MapCodec<? extends class07131> N();

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        super.N_20(class005002, class072992, class072092, class060692);
        class07209 class072093 = class072092.method_10074();
        class00500 class005003 = class072992.method_8320(class072093);
        class07131.N(class072992, class072092, class060692, class005003, class072093);
        this.y(class072992, class072092, class060692, class005003, class072093);
    }

    protected int b_(class00500 class005002) {
        return 1;
    }

    protected boolean e_(class00500 class005002) {
        return (Integer)class005002.L((class08092)u) == 7 && (Boolean)class005002.L((class08092)i) == false;
    }
}

