/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06183
 *  minecraft.class06501
 *  minecraft.class06509
 *  minecraft.class06573
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06898
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07070
 *  minecraft.class07082
 *  minecraft.class07085
 *  minecraft.class07089
 *  minecraft.class07105
 *  minecraft.class07107
 *  minecraft.class07113
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08038
 *  net.fabricmc.fabric.impl.particle.BlockStateParticleEffectExtension
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.function.Predicate;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class01945;
import minecraft.class01965;
import minecraft.class01979;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06183;
import minecraft.class06501;
import minecraft.class06509;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06898;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07070;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07089;
import minecraft.class07105;
import minecraft.class07107;
import minecraft.class07113;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08038;
import net.fabricmc.fabric.impl.particle.BlockStateParticleEffectExtension;

public class class01951
extends class06581 {
    public static final int N = 10;
    private static final int y = 200;

    public class01951(class06573 class065732) {
        super(class065732);
    }

    private double y(class08036 class080362) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_2)) {
            return 5.0;
        }
        return class080362.method_55754();
    }

    public class06509 y(class06584 class065842) {
        return class06509.field_42717;
    }

    public void N(class07299 class072992, class07438 class074382, class06584 class065842, int n) {
        class06183 class061832;
        class08036 class080362;
        block11: {
            block10: {
                if (n < 0 || !(class074382 instanceof class08036)) {
                    class074382.method_6075();
                    return;
                }
                class080362 = (class08036)class074382;
                class07089 class070892 = this.N(class080362);
                if (!(class070892 instanceof class06183)) break block10;
                class061832 = (class06183)class070892;
                if (class070892.N() == class07113.field_1332) break block11;
            }
            class074382.method_6075();
            return;
        }
        if ((this.N(class065842, class074382) - n + 1) % 10 == 5) {
            class04891 class048912;
            class01979 class019792;
            Object object;
            class07070 class070702;
            class07209 class072092 = class061832.u();
            class00500 class005002 = class072992.method_8320(class072092);
            class07070 class070703 = class070702 = class074382.method_6058() == class07050.field_5808 ? class080362.method_6068() : class080362.method_6068().N();
            if (class005002.g() && class005002.b() != class06898.field_11455) {
                this.N(class072992, class061832, class005002, class074382.method_5828(0.0f), class070702);
            }
            if ((object = class005002.i()) instanceof class01979) {
                class019792 = (class01979)((Object)object);
                class048912 = class019792.L();
            } else {
                class048912 = class04909.ui;
            }
            class072992.N((class07049)class080362, class072092, class048912, class04911.field_15245);
            if (class072992 instanceof class04782) {
                boolean bl;
                class019792 = (class04782)class072992;
                class00394 class003942 = class072992.method_8321(class072092);
                if (class003942 instanceof class01965 && (bl = ((class01965)((Object)(object = (class01965)class003942))).N(class072992.N(), (class04782)class019792, (class07438)class080362, class061832.i(), class065842))) {
                    class07085 class070852 = class065842.equals(class080362.method_6118(class07085.field_6171)) ? class07085.field_6171 : class07085.field_6173;
                    class065842.N(1, (class07438)class080362, class070852);
                }
            }
        }
    }

    private class07105 N(class07105 class071052, class07299 class072992, class06183 class061832, class00500 class005002, class06889 class068892, class07070 class070702) {
        ((BlockStateParticleEffectExtension)class071052).fabric_setBlockPos(class061832.u());
        return class071052;
    }

    private void N(class07299 class072992, class06183 class061832, class00500 class005002, class06889 class068892, class07070 class070702) {
        double d = 3.0;
        int n = class070702 == class07070.field_6183 ? 1 : -1;
        int n2 = class072992.method_8409().y(7, 12);
        class07105 class071052 = this.N(new class07105(class07107.y, class005002), class072992, class061832, class005002, class068892, class070702);
        class07211 class072112 = class061832.i();
        class01945 class019452 = class01945.N(class068892, class072112);
        class06889 class068893 = class061832.y();
        for (int i = 0; i < n2; ++i) {
            class072992.method_8406((class07126)class071052, class068893.M - (double)(class072112 == class07211.field_11039 ? 1.0E-6f : 0.0f), class068893.B, class068893.Z - (double)(class072112 == class07211.field_11043 ? 1.0E-6f : 0.0f), class019452.N() * (double)n * 3.0 * class072992.method_8409().U(), 0.0, class019452.L() * (double)n * 3.0 * class072992.method_8409().U());
        }
    }

    private class07089 N(class08036 class080362) {
        class08036 class080363 = class080362;
        return class08038.N((class07049)class080362, (Predicate)class07042.B, (double)this.y(class080363));
    }

    public class07082 N(class06501 class065012) {
        class08036 class080362 = class065012.method_8036();
        if (class080362 != null && this.N(class080362).N() == class07113.field_1332) {
            class080362.method_6019(class065012.method_20287());
        }
        return class07082.L;
    }

    public int N(class06584 class065842, class07438 class074382) {
        return 200;
    }
}

