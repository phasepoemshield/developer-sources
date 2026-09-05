/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00500
 *  minecraft.class00608
 *  minecraft.class00886
 *  minecraft.class00891
 *  minecraft.class01194
 *  minecraft.class01231
 *  minecraft.class01235
 *  minecraft.class03556
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04770
 *  minecraft.class04799
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05787
 *  minecraft.class05835
 *  minecraft.class05970
 *  minecraft.class06183
 *  minecraft.class06570
 *  minecraft.class06573
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07107
 *  minecraft.class07113
 *  minecraft.class07126
 *  minecraft.class07132
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class08036
 *  net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant
 *  net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributes
 *  net.fabricmc.fabric.mixin.transfer.BucketItemAccessor
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00500;
import minecraft.class00608;
import minecraft.class00886;
import minecraft.class00891;
import minecraft.class01194;
import minecraft.class01231;
import minecraft.class01235;
import minecraft.class03556;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04770;
import minecraft.class04799;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05787;
import minecraft.class05835;
import minecraft.class05970;
import minecraft.class06183;
import minecraft.class06570;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06912;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07107;
import minecraft.class07113;
import minecraft.class07126;
import minecraft.class07132;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class08036;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributes;
import net.fabricmc.fabric.mixin.transfer.BucketItemAccessor;
import org.jspecify.annotations.Nullable;

public class class06913
extends class06581
implements class04799,
BucketItemAccessor {
    private final class04651 N;

    public class06913(class04651 class046512, class06573 class065732) {
        super(class065732);
        this.N = class046512;
    }

    public static class06584 y(class06584 class065842, class08036 class080362) {
        if (!class080362.method_56992()) {
            return new class06584((class07310)class06570.jU);
        }
        return class065842;
    }

    public class04651 N() {
        return this.N;
    }

    private class04891 N(class04891 class048912) {
        return FluidVariantAttributes.getHandlerOrDefault((class04651)this.N).getEmptySound(FluidVariant.of((class04651)this.N)).orElse(class048912);
    }

    private class06584 N(class06584 class065842, class08036 class080362, class06584 class065843) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_5)) {
            return class065843;
        }
        return class05970.N((class06584)class065842, (class08036)class080362, (class06584)class065843);
    }

    public class07082 N(class07299 class072992, class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        class06183 class061832 = class06913.N((class07299)class072992, (class08036)class080362, (class05835)(this.N == class04684.N ? class05835.field_1345 : class05835.field_1348));
        if (class061832.N() == class07113.field_1333) {
            return class07082.i;
        }
        if (class061832.N() == class07113.field_1332) {
            class07209 class072092;
            class07209 class072093 = class061832.u();
            class07211 class072112 = class061832.i();
            class07209 class072094 = class072093.method_10093(class072112);
            if (!class072992.method_8505((class07049)class080362, class072093) || !class080362.method_7343(class072094, class072112, class065842)) {
                return class07082.u;
            }
            if (this.N == class04684.N) {
                class00886 class008862;
                class00500 class005002 = class072992.method_8320(class072093);
                class00891 class008912 = class005002.i();
                if (class008912 instanceof class00886 && !(class008912 = (class008862 = (class00886)class008912).N((class07438)class080362, (class07284)class072992, class072093, class005002)).R()) {
                    class080362.method_7259(class01235.L.y((Object)this));
                    class008862.s_().ifPresent(class048912 -> class080362.method_5783(class048912, 1.0f, 1.0f));
                    class072992.N((class07049)class080362, (class03556)class01194.d, class072093);
                    class06584 class065843 = class05970.N((class06584)class065842, (class08036)class080362, (class06584)class008912);
                    if (!class072992.method_8608()) {
                        class06912.U.N((class04770)class080362, (class06584)class008912);
                    }
                    return class07082.N.N(class065843);
                }
                return class07082.u;
            }
            class00500 class005003 = class072992.method_8320(class072093);
            class07209 class072095 = class072092 = class005003.i() instanceof class07132 && this.N == class04684.L ? class072093 : class072094;
            if (this.N((class07438)class080362, class072992, class072092, class061832)) {
                this.N((class07438)class080362, class072992, class065842, class072092);
                if (class080362 instanceof class04770) {
                    class06912.w.N((class04770)class080362, class072092, class065842);
                }
                class080362.method_7259(class01235.L.y((Object)this));
                class06584 class065844 = class06913.y(class065842, class080362);
                class08036 class080363 = class080362;
                class06584 class065845 = class065842;
                class06584 class065846 = this.N(class065845, class080363, class065844);
                return class07082.N.N(class065846);
            }
            return class07082.u;
        }
        return class07082.i;
    }

    public void N(@Nullable class07438 class074382, class07299 class072992, class06584 class065842, class07209 class072092) {
    }

    public boolean N(@Nullable class07438 class074382, class07299 class072992, class07209 class072092, @Nullable class06183 class061832) {
        boolean bl;
        class07132 class071322;
        class04651 class046512 = this.N;
        if (!(class046512 instanceof class05787)) {
            return false;
        }
        class05787 class057872 = (class05787)class046512;
        class046512 = class072992.method_8320(class072092);
        class00891 class008912 = class046512.i();
        boolean bl2 = class046512.N(this.N);
        boolean bl3 = class074382 != null && class074382.method_5715();
        boolean bl4 = bl2 || class008912 instanceof class07132 && (class071322 = (class07132)class008912).N(class074382, (class07290)class072992, class072092, (class00500)class046512, this.N);
        boolean bl5 = bl = class046512.P() || bl4 && (!bl3 || class061832 == null);
        if (!bl) {
            return class061832 != null && this.N(class074382, class072992, class061832.u().method_10093(class061832.i()), null);
        }
        if (((Boolean)class072992.method_75728().N(class00608.Y, class072092)).booleanValue() && this.N.N(class01231.N)) {
            int n = class072092.method_10263();
            int n2 = class072092.method_10264();
            int n3 = class072092.method_10260();
            class072992.method_8396((class07049)class074382, class072092, class04909.Uq, class04911.field_15245, 0.5f, 2.6f + (class072992.field_9229.z() - class072992.field_9229.z()) * 0.8f);
            for (int i = 0; i < 8; ++i) {
                class072992.method_8406((class07126)class07107.Ny, (double)((float)n + class072992.field_9229.z()), (double)((float)n2 + class072992.field_9229.z()), (double)((float)n3 + class072992.field_9229.z()), 0.0, 0.0, 0.0);
            }
            return true;
        }
        if (class008912 instanceof class07132) {
            class07132 class071323 = (class07132)class008912;
            if (this.N == class04684.L) {
                class071323.N((class07284)class072992, class072092, (class00500)class046512, class057872.N(false));
                this.N(class074382, (class07284)class072992, class072092);
                return true;
            }
        }
        if (!class072992.method_8608() && bl2 && !class046512.T()) {
            class072992.N(class072092, true);
        }
        if (class072992.method_8652(class072092, this.N.M().B(), 11) || class046512.Y().u()) {
            this.N(class074382, (class07284)class072992, class072092);
            return true;
        }
        return false;
    }

    protected void N(@Nullable class07438 class074382, class07284 class072842, class07209 class072092) {
        class04891 class048912 = this.N.N(class01231.y) ? class04909.uj : class04909.us;
        class048912 = this.N(class048912);
        class072842.method_8396((class07049)class074382, class072092, class048912, class04911.field_15245, 1.0f, 1.0f);
        class072842.N((class07049)class074382, (class03556)class01194.w, class072092);
    }

    public /* synthetic */ class04651 fabric_getFluid() {
        return this.N;
    }
}

