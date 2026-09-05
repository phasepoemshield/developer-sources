/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00500
 *  minecraft.class00737
 *  minecraft.class01194
 *  minecraft.class02649
 *  minecraft.class02661
 *  minecraft.class03556
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05440
 *  minecraft.class05467
 *  minecraft.class05847
 *  minecraft.class05989
 *  minecraft.class06069
 *  minecraft.class06501
 *  minecraft.class06665
 *  minecraft.class06758
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07210
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08005
 *  minecraft.class08029
 *  minecraft.class08092
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00500;
import minecraft.class00737;
import minecraft.class01194;
import minecraft.class02649;
import minecraft.class02661;
import minecraft.class03556;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05440;
import minecraft.class05467;
import minecraft.class05847;
import minecraft.class05989;
import minecraft.class06069;
import minecraft.class06501;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06758;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08005;
import minecraft.class08029;
import minecraft.class08092;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06567
extends class06581
implements class02661 {
    public class06567(class06573 class065732) {
        super(class065732);
    }

    public void N(class08005 class080052, double d, double d2, double d3, float f, float f2) {
    }

    public class02649 N() {
        return class02649.N().N((class072102, class072112) -> class06758.N((class07210)class072102, (double)1.0, (class06889)class06889.L)).N(6.6666665f).y(1.0f).N(1018).N();
    }

    private void N(class06501 class065012, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4) && class065012.method_8045().method_8608()) {
            callbackInfoReturnable.setReturnValue((Object)class07082.N);
        }
    }

    public class08005 N(class07299 class072992, class00737 class007372, class06584 class065842, class07211 class072112) {
        class06069 class060692 = class072992.method_8409();
        double d = class060692.N((double)class072112.P(), 0.11485000000000001);
        double d2 = class060692.N((double)class072112.s(), 0.11485000000000001);
        double d3 = class060692.N((double)class072112.T(), 0.11485000000000001);
        class06889 class068892 = new class06889(d, d2, d3);
        class08029 class080292 = new class08029(class072992, class007372.N(), class007372.y(), class007372.L(), class068892.u());
        class080292.N(class065842);
        return class080292;
    }

    private void N(class07299 class072992, class07209 class072092) {
        class06069 class060692 = class072992.method_8409();
        class072992.method_8396(null, class072092, class04909.Ul, class04911.field_15245, 1.0f, (class060692.z() - class060692.z()) * 0.2f + 1.0f);
    }

    @Override
    public class07082 N(class06501 class065012) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class065012, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class07082)callbackInfoReturnable.getReturnValue();
        }
        class07299 class072992 = class065012.method_8045();
        class07209 class072092 = class065012.method_8037();
        class00500 class005002 = class072992.method_8320(class072092);
        boolean bl = false;
        if (class05847.T((class00500)class005002) || class05440.v((class00500)class005002) || class05467.v((class00500)class005002)) {
            this.N(class072992, class072092);
            class072992.method_8501(class072092, (class00500)class005002.y((class08092)class06665.n, (Comparable)Boolean.valueOf(true)));
            class072992.N((class07049)class065012.method_8036(), (class03556)class01194.L, class072092);
            bl = true;
        } else if (class05989.N((class07299)class072992, (class07209)(class072092 = class072092.method_10093(class065012.method_8038())), (class07211)class065012.method_8042())) {
            this.N(class072992, class072092);
            class072992.method_8501(class072092, class05989.y((class07290)class072992, (class07209)class072092));
            class072992.N((class07049)class065012.method_8036(), (class03556)class01194.Z, class072092);
            bl = true;
        }
        if (bl) {
            class065012.method_8041().B(1);
            return class07082.N;
        }
        return class07082.u;
    }
}

