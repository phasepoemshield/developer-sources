/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  minecraft.class00389
 *  minecraft.class00394
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01226
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class02484
 *  minecraft.class02733
 *  minecraft.class02752
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06183
 *  minecraft.class06237
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07101
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07796
 *  minecraft.class08036
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08791
 *  minecraft.class08983
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.Map;
import minecraft.class00389;
import minecraft.class00394;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01226;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class02484;
import minecraft.class02733;
import minecraft.class02752;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06119;
import minecraft.class06183;
import minecraft.class06237;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07101;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07796;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08791;
import minecraft.class08983;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06127
extends class07796 {
    public static final MapCodec<class06127> N = class06127.y(class06127::new);
    public static final class08064<class07211> y = class07101.R;
    public static final class06667 L = class06665.k;
    public static final class06667 u = class06665.b;
    private static final class00494 i = class00389.N((class00494)class00891.y((double)16.0, (double)0.0, (double)2.0), (class00494)class00891.y((double)8.0, (double)2.0, (double)14.0));
    private static final Map<class07211, class00494> R = class00389.L((class00494)class00389.N((class00494)class00891.N((double)16.0, (double)10.0, (double)14.0, (double)1.0, (double)5.333333), (class00494[])new class00494[]{class00891.N((double)16.0, (double)12.0, (double)16.0, (double)5.333333, (double)9.666667), class00891.N((double)16.0, (double)14.0, (double)18.0, (double)9.666667, (double)14.0), i}));
    private static final int M = 2;
    private static final class00494 B;

    public class06127(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y(y, (Comparable)class07211.field_11043)).y((class08092)L, (Comparable)Boolean.valueOf(false))).y((class08092)u, (Comparable)Boolean.valueOf(false)));
    }

    protected class00494 z(class00500 class005002) {
        return i;
    }

    private static void y(@Nullable class07438 class074382, class07299 class072992, class07209 class072092, class00500 class005002, class06584 class065842) {
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 instanceof class06119) {
            ((class06119)class003942).N(class065842.y(1, class074382));
            class06127.N((class07049)class074382, class072992, class072092, class005002, true);
            class072992.method_8396(null, class072092, class04909.Le, class04911.field_15245, 1.0f, 1.0f);
        }
    }

    protected int y(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        return class072112 == class07211.field_11036 && (Boolean)class005002.L((class08092)L) != false ? 15 : 0;
    }

    private static void y(class07299 class072992, class07209 class072092, class00500 class005002) {
        class02733 class027332 = class02752.N((class07299)class072992, (class07211)((class07211)class005002.L(y)).b(), (class07211)class07211.field_11036);
        class072992.method_8452(class072092.method_10074(), class005002.i(), class027332);
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

    protected boolean N(class00500 class005002) {
        return true;
    }

    protected int N_8(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        return (Boolean)class005002.L((class08092)L) != false ? 15 : 0;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        if (((Boolean)class005002.L((class08092)L)).booleanValue()) {
            class06127.y((class07299)class047822, class072092, class005002);
        }
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        class06127.N((class07299)class047822, class072092, class005002, false);
    }

    protected @Nullable class06237 N(class00500 class005002, class07299 class072992, class07209 class072092) {
        if (!((Boolean)class005002.L((class08092)u)).booleanValue()) {
            return null;
        }
        return super.N(class005002, class072992, class072092);
    }

    private void N(class07299 class072992, class07209 class072092, class08036 class080362) {
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 instanceof class06119) {
            class080362.method_17355((class06237)((class06119)class003942));
            class080362.method_7281(class01235.NG);
        }
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            callbackInfoReturnable.setReturnValue((Object)B);
        }
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            if (!class072992.method_8608()) {
                this.N(class072992, class072092, class080362);
            }
            return class07082.N;
        }
        return class07082.L;
    }

    protected class07082 N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832) {
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            return class07082.R;
        }
        if (class065842.N(class01226.yj)) {
            return class06127.N((class07438)class080362, class072992, class072092, class005002, class065842) ? class07082.N : class07082.i;
        }
        if (class065842.R() && class070502 == class07050.field_5808) {
            return class07082.i;
        }
        return class07082.R;
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        class00394 class003942;
        if (((Boolean)class005002.L((class08092)u)).booleanValue() && (class003942 = class072992.method_8321(class072092)) instanceof class06119) {
            return ((class06119)class003942).M();
        }
        return 0;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L, u});
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(y)));
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(y, (Comparable)class069932.N((class07211)class005002.L(y)));
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return R.get(class005002.L(y));
    }

    public class00500 N(class06942 class069422) {
        class08983 class089832;
        class07299 class072992 = class069422.method_8045();
        class06584 class065842 = class069422.method_8041();
        class08036 class080362 = class069422.method_8036();
        boolean bl = false;
        if (!class072992.method_8608() && class080362 != null && class080362.method_7338() && (class089832 = (class08983)class065842.method_58694(class02484.NB)) != null && class089832.N("Book")) {
            bl = true;
        }
        return (class00500)((class00500)this.W().y(y, (Comparable)class069422.method_8042().b())).y((class08092)u, (Comparable)Boolean.valueOf(bl));
    }

    public MapCodec<class06127> N() {
        return N;
    }

    private static void N(class07299 class072992, class07209 class072092, class00500 class005002, boolean bl) {
        class072992.method_8652(class072092, (class00500)class005002.y((class08092)L, (Comparable)Boolean.valueOf(bl)), 3);
        class06127.y(class072992, class072092, class005002);
    }

    public static void N(class07299 class072992, class07209 class072092, class00500 class005002) {
        class06127.N(class072992, class072092, class005002, true);
        class072992.N(class072092, class005002.i(), 2);
        class072992.N(1043, class072092, 0);
    }

    public static void N(@Nullable class07049 class070492, class07299 class072992, class07209 class072092, class00500 class005002, boolean bl) {
        class00500 class005003 = (class00500)((class00500)class005002.y((class08092)L, (Comparable)Boolean.valueOf(false))).y((class08092)u, (Comparable)Boolean.valueOf(bl));
        class072992.method_8652(class072092, class005003, 3);
        class072992.N((class03556)class01194.L, class072092, class01164.N((class07049)class070492, (class00500)class005003));
        class06127.y(class072992, class072092, class005002);
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class06119(class072092, class005002);
    }

    public static boolean N(@Nullable class07438 class074382, class07299 class072992, class07209 class072092, class00500 class005002, class06584 class065842) {
        if (!((Boolean)class005002.L((class08092)u)).booleanValue()) {
            if (!class072992.method_8608()) {
                class06127.y(class074382, class072992, class072092, class005002, class065842);
            }
            return true;
        }
        return false;
    }

    protected boolean a_(class00500 class005002) {
        return true;
    }

    protected boolean i_(class00500 class005002) {
        return true;
    }
}

