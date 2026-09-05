/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09368
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  java.lang.MatchException
 *  minecraft.class00513
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class02733
 *  minecraft.class02752
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06760
 *  minecraft.class06993
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class08036
 *  minecraft.class08064
 *  minecraft.class08083
 *  minecraft.class08092
 *  minecraft.class08713
 *  minecraft.class08791
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class09368;
import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Map;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00513;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class02733;
import minecraft.class02752;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06760;
import minecraft.class06993;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08083;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00483
extends class06760 {
    public static final MapCodec<class00483> N = class00483.y(class00483::new);
    public static final class08064<class08083> L = class06665.yE;
    public static final class06667 u = class06665.Y;
    public static final int i = 4;
    private static final class00494 R = class00891.L((double)16.0, (double)0.0, (double)4.0);
    private static final Map<class07211, class00494> M = class00389.u(class00389.N(R, class00891.L((double)4.0, (double)4.0, (double)16.0)));
    private static final Map<class07211, class00494> B = class00389.u(class00389.N(R, class00891.L((double)4.0, (double)4.0, (double)20.0)));
    private static final class00494 Z;
    private static final class00494 O;
    private static final class00494 F;
    private static final class00494 A;
    private static final class00494 f;
    private static final class00494 C;
    private static final class00494 S;
    private static final class00494 x;
    private static final class00494 D;
    private static final class00494 h;
    private static final class00494 r;
    private static final class00494 NN;
    private boolean Ny = false;

    public class00483(class01362 class013622) {
        super(class013622);
        this.P((class00500)((Object)((class00500)((Object)((class00500)((Object)((class00500)this.Q.y()).y((class08092)y, (Comparable)class07211.field_11043))).y((class08092)L, (Comparable)class08083.field_12637))).y((class08092)u, Boolean.valueOf(false))));
    }

    public class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            return switch (class09368.N[((class07211)class005002.L((class08092)y)).ordinal()]) {
                default -> throw new MatchException(null, null);
                case 1 -> class00389.N(C, x);
                case 2 -> class00389.N(f, S);
                case 3 -> class00389.N(A, h);
                case 4 -> class00389.N(F, D);
                case 5 -> class00389.N(O, NN);
                case 6 -> class00389.N(Z, r);
            };
        }
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            this.Ny = true;
            return this.N(class005002, class072902, class072092, class060922);
        }
        return super.y_4(class005002, class072902, class072092, class060922);
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L((class08092)y)));
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L, u});
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)((Object)class005002.y((class08092)y, (Comparable)class069932.N((class07211)class005002.L((class08092)y))));
    }

    public class06584 N(class05487 class054872, class07209 class072092, class00500 class005002, boolean bl) {
        return new class06584((class07310)(class005002.L((class08092)L) == class08083.field_12634 ? class00869.yd : class00869.yq));
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (this.Ny) {
            this.Ny = false;
            return;
        }
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            callbackInfoReturnable.setReturnValue((Object)(switch (class09368.N[((class07211)class005002.L((class08092)y)).ordinal()]) {
                default -> throw new MatchException(null, null);
                case 1 -> C;
                case 2 -> f;
                case 3 -> A;
                case 4 -> F;
                case 5 -> O;
                case 6 -> Z;
            }));
        }
    }

    protected MapCodec<class00483> N() {
        return N;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        class07209 class072093 = class072092.method_10093(((class07211)class005002.L((class08092)y)).b());
        if (this.N(class005002, class047822.method_8320(class072093))) {
            class047822.N(class072093, true);
        }
    }

    public class00500 N(class07299 class072992, class07209 class072092, class00500 class005002, class08036 class080362) {
        class07209 class072093;
        if (!class072992.method_8608() && class080362.method_66324() && this.N(class005002, class072992.method_8320(class072093 = class072092.method_10093(((class07211)class005002.L((class08092)y)).b())))) {
            class072992.N(class072093, false);
        }
        return super.N(class072992, class072092, class005002, class080362);
    }

    private boolean N(class00500 class005002, class00500 class005003) {
        class00891 class008912 = class005002.L((class08092)L) == class08083.field_12637 ? class00869.yq : class00869.yd;
        return class005003.N(class008912) && (Boolean)class005003.L((class08092)class00513.L) != false && class005003.L((class08092)y) == class005002.L((class08092)y);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return ((Boolean)class005002.L((class08092)u) != false ? M : B).get(class005002.L((class08092)y));
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        if (class005002.N((class05487)class072992, class072092)) {
            class072992.method_8492(class072092.method_10093(((class07211)class005002.L((class08092)y)).b()), class008912, class02752.N((class02733)class027332, (class07211)((class07211)class005002.L((class08092)y)).b()));
        }
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112.b() == class005002.L((class08092)y) && !class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class00500 class005003 = class054872.method_8320(class072092.method_10093(((class07211)class005002.L((class08092)y)).b()));
        return this.N(class005002, class005003) || class005003.N(class00869.LN) && class005003.L((class08092)y) == class005002.L((class08092)y);
    }

    protected boolean a_(class00500 class005002) {
        return true;
    }
}

