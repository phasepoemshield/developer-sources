/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  java.lang.MatchException
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06761
 *  minecraft.class06772
 *  minecraft.class06942
 *  minecraft.class07049
 *  minecraft.class07153
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07438
 *  minecraft.class08059
 *  minecraft.class08064
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08400
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.function.Function;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class03566;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06761;
import minecraft.class06772;
import minecraft.class06942;
import minecraft.class07049;
import minecraft.class07153;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07438;
import minecraft.class08059;
import minecraft.class08064;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08400;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03587
extends class06761
implements class00873 {
    public static final MapCodec<class03587> L = class03587.y(class03587::new);
    public static final int u = 4;
    public static final class08071 i = class06665.Nl;
    public static final class08064<class08059> R = class06761.y;
    private static final int M = 3;
    private static final int B = 1;
    private static final class00494 Z = class00891.y((double)6.0, (double)-1.0, (double)3.0);
    private static final class00494 O = class00891.y((double)10.0, (double)-1.0, (double)5.0);
    private final Function<class00500, class00494> F = this.L();
    private static final class00494 A;
    private static final class00494 f;
    private static final class00494[] C;
    private static final class00494[] S;

    private @Nullable class03566 L(class05487 class054872, class07209 class072092, class00500 class005002) {
        if (class03587.U(class005002)) {
            return new class03566(class072092, class005002);
        }
        class07209 class072093 = class072092.method_10074();
        class00500 class005003 = class054872.method_8320(class072093);
        if (class03587.U(class005003)) {
            return new class03566(class072093, class005003);
        }
        return null;
    }

    private Function<class00500, class00494> L() {
        int[] nArray = new int[]{0, 9, 11, 22, 26};
        return this.N(class005002 -> {
            int n = ((Integer)class005002.L((class08092)i) == 0 ? 4 : 6) + nArray[(Integer)class005002.L((class08092)i)];
            int n2 = (Integer)class005002.L((class08092)i) == 0 ? 6 : 10;
            return switch ((class08059)class005002.L(R)) {
                default -> throw new MatchException(null, null);
                case class08059.field_12607 -> class00891.y((double)n2, (double)-1.0, (double)Math.min(16, -1 + n));
                case class08059.field_12609 -> class00891.y((double)n2, (double)0.0, (double)Math.max(0, -1 + n - 16));
            };
        });
    }

    private boolean T(class00500 class005002) {
        return (Integer)class005002.L((class08092)i) >= 4;
    }

    public class03587(class01362 class013622) {
        super(class013622);
    }

    private static boolean U(class00500 class005002) {
        return class005002.N(class00869.El) && class005002.L(R) == class08059.field_12607;
    }

    private static boolean y(class05487 class054872, class07209 class072092) {
        return class06772.N((class05487)class054872, (class07209)class072092);
    }

    public void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        float f = class06772.N((class00891)this, (class07290)class047822, (class07209)class072092);
        if (class060692.y((int)(25.0f / f) + 1) == 0) {
            this.N(class047822, class005002, class072092, 1);
        }
    }

    private static boolean y(int n) {
        return n >= 3;
    }

    private void y(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
            if ((Integer)class005002.L((class08092)i) == 0) {
                callbackInfoReturnable.setReturnValue((Object)Z);
            } else {
                callbackInfoReturnable.setReturnValue((Object)(class005002.L(R) == class08059.field_12607 ? O : super.y_4(class005002, class072902, class072092, class060922)));
            }
        }
    }

    public class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.y(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        if (class005002.L(R) == class08059.field_12607) {
            return (Integer)class005002.L((class08092)i) == 0 ? Z : O;
        }
        return class00389.N();
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
            int n = (Integer)class005002.L((class08092)i);
            if (class005002.L(R) == class08059.field_12609) {
                callbackInfoReturnable.setReturnValue((Object)C[Math.min(Math.abs(4 - (n + 1)), C.length - 1)]);
            } else {
                callbackInfoReturnable.setReturnValue((Object)S[n]);
            }
        }
    }

    public MapCodec<class03587> N() {
        return L;
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        class03566 class035662 = this.L((class05487)class047822, class072092, class005002);
        if (class035662 == null) {
            return;
        }
        this.N(class047822, class035662.y(), class035662.N(), 1);
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        class03566 class035662 = this.L(class054872, class072092, class005002);
        if (class035662 == null) {
            return false;
        }
        return this.N(class054872, class035662.N(), class035662.y(), (Integer)class035662.y().L((class08092)i) + 1);
    }

    private boolean N(class05487 class054872, class07209 class072092, class00500 class005002, int n) {
        return !this.T(class005002) && class03587.y(class054872, class072092) && (!class03587.y(n) || class03587.N(class054872, class072092.method_10084()));
    }

    public void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl) {
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            if (class070492 instanceof class07153 && ((Boolean)class047822.method_64395().N(class07305.I)).booleanValue()) {
                class047822.N(class072092, true, class070492);
            }
        }
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{i});
        super.N(class005172);
    }

    protected boolean N(class00500 class005002, class07290 class072902, class07209 class072092) {
        return class005002.N(class00869.Lr);
    }

    public class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class03587.y((Integer)class005002.L((class08092)i))) {
            return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
        }
        return class005002.N(class054872, class072092) ? class005002 : class00869.N.W();
    }

    public class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return this.F.apply(class005002);
    }

    public @Nullable class00500 N(class06942 class069422) {
        return this.W();
    }

    private void N(class04782 class047822, class00500 class005002, class07209 class072092, int n) {
        int n2 = Math.min((Integer)class005002.L((class08092)i) + n, 4);
        if (!this.N((class05487)class047822, class072092, class005002, n2)) {
            return;
        }
        class00500 class005003 = (class00500)class005002.y((class08092)i, (Comparable)Integer.valueOf(n2));
        class047822.method_8652(class072092, class005003, 2);
        if (class03587.y(n2)) {
            class047822.method_8652(class072092.method_10084(), (class00500)class005003.y(R, (Comparable)class08059.field_12609), 3);
        }
    }

    private static boolean N(class05487 class054872, class07209 class072092) {
        class00500 class005002 = class054872.method_8320(class072092);
        return class005002.P() || class005002.N(class00869.El);
    }

    public boolean N(class00500 class005002, class06942 class069422) {
        return false;
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, @Nullable class07438 class074382, class06584 class065842) {
    }

    public boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        if (class03587.U(class005002) && !class03587.y(class054872, class072092)) {
            return false;
        }
        return super.a_(class005002, class054872, class072092);
    }

    public boolean e_(class00500 class005002) {
        return class005002.L(R) == class08059.field_12607 && !this.T(class005002);
    }
}

