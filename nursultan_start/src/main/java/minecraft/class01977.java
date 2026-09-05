/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00394
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01194
 *  minecraft.class01226
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class01894
 *  minecraft.class02625
 *  minecraft.class03490
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class04160
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06551
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06704
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07041
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07107
 *  minecraft.class07111
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class07482
 *  minecraft.class07752
 *  minecraft.class07796
 *  minecraft.class08005
 *  minecraft.class08036
 *  minecraft.class08064
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
import java.util.List;
import minecraft.class00394;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01194;
import minecraft.class01226;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class01894;
import minecraft.class01958;
import minecraft.class01967;
import minecraft.class02625;
import minecraft.class03490;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class04160;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06551;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06704;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07041;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07107;
import minecraft.class07111;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class07482;
import minecraft.class07752;
import minecraft.class07796;
import minecraft.class08005;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class01977
extends class07796
implements class06084 {
    public static final MapCodec<class01977> N = class01977.y(class01977::new);
    public static final class01894 y = class01894.y((String)"sherds");
    public static final class08064<class07211> L = class06665.f;
    public static final class06667 u = class06665.yY;
    public static final class06667 i = class06665.q;
    private static final class00494 R = class00891.y((double)14.0, (double)0.0, (double)16.0);

    private class07041 L() {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21)) {
            return class07082.L;
        }
        return class07082.N;
    }

    public class01977(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y(L, (Comparable)class07211.field_11043)).y((class08092)i, (Comparable)Boolean.valueOf(false))).y((class08092)u, (Comparable)Boolean.valueOf(false)));
    }

    protected class07752 j(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            return class07752.yM;
        }
        return class07752.yR;
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)i)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    protected boolean N(class00500 class005002) {
        return true;
    }

    public class06584 N(class05487 class054872, class07209 class072092, class00500 class005002, boolean bl) {
        class00394 class003942 = class054872.method_8321(class072092);
        if (class003942 instanceof class01958) {
            class003942 = ((class01958)class003942).z();
            return class01958.N((class03490)class003942);
        }
        return super.N(class054872, class072092, class005002, bl);
    }

    protected void N(class07299 class072992, class00500 class005002, class06183 class061832, class08005 class080052) {
        class04782 class047822;
        class07209 class072092 = class061832.u();
        if (class072992 instanceof class04782 && class080052.method_36971(class047822 = (class04782)class072992, class072092) && class080052.N(class047822)) {
            class072992.method_8652(class072092, (class00500)class005002.y((class08092)u, (Comparable)Boolean.valueOf(true)), 260);
            class072992.N(class072092, true, (class07049)class080052);
        }
    }

    private void N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_2)) {
            callbackInfoReturnable.setReturnValue((Object)class07082.i);
        }
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(L)));
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(L, (Comparable)class069932.N((class07211)class005002.L(L)));
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        return class07482.N((class00394)class072992.method_8321(class072092));
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        class00394 class003942 = class072992.method_8321(class072092);
        if (!(class003942 instanceof class01958)) {
            return class07082.i;
        }
        class01958 class019582 = (class01958)class003942;
        class072992.method_8396(null, class072092, class04909.Bh, class04911.field_15245, 1.0f, 1.0f);
        class019582.N(class01967.field_46665);
        class072992.N((class07049)class080362, (class03556)class01194.L, class072092);
        return class07082.N;
    }

    protected class07082 N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class065842, class005002, class072992, class072092, class080362, class070502, class061832, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class07082)callbackInfoReturnable.getReturnValue();
        }
        class00394 class003942 = class072992.method_8321(class072092);
        if (!(class003942 instanceof class01958)) {
            return class07082.i;
        }
        class01958 class019582 = (class01958)class003942;
        if (class072992.method_8608()) {
            return this.L();
        }
        class003942 = class019582.N();
        if (!class065842.R() && (class003942.R() || class06584.L((class06584)class003942, (class06584)class065842) && class003942.c() < class003942.U())) {
            float f;
            class019582.N(class01967.field_46664);
            class080362.method_7259(class01235.L.y((Object)class065842.B()));
            class06584 class065843 = class065842.y(1, (class07438)class080362);
            if (class019582.method_5442()) {
                class019582.N(class065843);
                f = (float)class065843.c() / (float)class065843.U();
            } else {
                class003942.M(1);
                f = (float)class003942.c() / (float)class003942.U();
            }
            class072992.method_8396(null, class072092, class04909.BD, class04911.field_15245, 1.0f, 0.7f + 0.5f * f);
            if (class072992 instanceof class04782) {
                ((class04782)class072992).method_65096((class07126)class07107.yy, (double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 1.2, (double)class072092.method_10260() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
            }
            class019582.method_5431();
            class072992.N((class07049)class080362, (class03556)class01194.L, class072092);
            return class07082.N;
        }
        return class07082.R;
    }

    public class00500 N(class06942 class069422) {
        class04688 class046882 = class069422.method_8045().method_8316(class069422.method_8037());
        return (class00500)((class00500)((class00500)this.W().y(L, (Comparable)class069422.method_8042())).y((class08092)i, (Comparable)Boolean.valueOf(class046882.N() == class04684.L))).y((class08092)u, (Comparable)Boolean.valueOf(false));
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)i)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public MapCodec<class01977> N() {
        return N;
    }

    public class00500 N(class07299 class072992, class07209 class072092, class00500 class005002, class08036 class080362) {
        class06584 class065842 = class080362.method_6047();
        class00500 class005003 = class005002;
        if (class065842.N(class01226.LM) && !class07323.N((class06584)class065842, (class03530)class02625.b)) {
            class005003 = (class00500)class005002.y((class08092)u, (Comparable)Boolean.valueOf(true));
            class072992.method_8652(class072092, class005003, 260);
        }
        return super.N(class072992, class072092, class005003, class080362);
    }

    protected List<class06584> N(class00500 class005002, class04160 class041602) {
        class00394 class003942 = (class00394)class041602.y(class06551.z);
        if (class003942 instanceof class01958) {
            class01958 class019582 = (class01958)class003942;
            class041602.N(y, consumer -> {
                for (class06581 class065812 : class019582.z().N()) {
                    consumer.accept(class065812.E());
                }
            });
        }
        return super.N(class005002, class041602);
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        class06704.N((class00500)class005002, (class07299)class047822, (class07209)class072092);
    }

    public @Nullable class00394 N(class07209 class072092, class00500 class005002) {
        return new class01958(class072092, class005002);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L, i, u});
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return R;
    }
}

