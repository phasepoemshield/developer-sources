/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.protocoltranslator.impl.ViaFabricPlusMappingDataLoader
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class06183
 *  minecraft.class06501
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.protocoltranslator.impl.ViaFabricPlusMappingDataLoader;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class06183;
import minecraft.class06501;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06942
extends class06501 {
    private final class07209 y;
    protected boolean N = true;

    public class07211 L() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class07211)callbackInfoReturnable.getReturnValue();
        }
        return class07211.N((class07049)this.method_8036())[0];
    }

    public class06942(class08036 class080362, class07050 class070502, class06584 class065842, class06183 class061832) {
        this(class080362.method_73183(), class080362, class070502, class065842, class061832);
    }

    public class06942(class07299 class072992, @Nullable class08036 class080362, class07050 class070502, class06584 class065842, class06183 class061832) {
        super(class072992, class080362, class070502, class065842, class061832);
        this.y = class061832.u().method_10093(class061832.i());
        this.N = class072992.method_8320(class061832.u()).N(this);
    }

    public class06942(class06501 class065012) {
        this(class065012.method_8045(), class065012.method_8036(), class065012.method_20287(), class065012.method_8041(), class065012.method_30344());
    }

    public class07211[] i() {
        int n;
        class07211[] class07211Array = class07211.N((class07049)this.method_8036());
        if (this.N) {
            return class07211Array;
        }
        class07211 class072112 = this.method_8038();
        for (n = 0; n < class07211Array.length && class07211Array[n] != class072112.b(); ++n) {
        }
        if (n > 0) {
            System.arraycopy(class07211Array, 0, class07211Array, 1, n);
            class07211Array[0] = class072112.b();
        }
        return class07211Array;
    }

    public class07211 u() {
        return class07211.N((class07049)this.method_8036(), (class07185)class07185.field_11052);
    }

    private void y(CallbackInfoReturnable callbackInfoReturnable) {
        if (!callbackInfoReturnable.getReturnValueZ() && ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            callbackInfoReturnable.setReturnValue((Object)(ViaFabricPlusMappingDataLoader.getBlockMaterial((class00891)this.method_8045().method_8320(this.method_8037()).i()).equals("decoration") && class00891.N((class06581)this.method_8041().B()).equals(class00869.BK) ? 1 : 0));
        }
    }

    public boolean y() {
        return this.N;
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        class06942 class069422 = this;
        class08036 class080362 = class069422.method_8036();
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            double d;
            class07209 class072092 = class069422.method_8037();
            double d2 = d = ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_10) ? 0.5 : 0.0;
            if (Math.abs(class080362.method_23317() - ((double)class072092.method_10263() + d)) < 2.0 && Math.abs(class080362.method_23321() - ((double)class072092.method_10260() + d)) < 2.0) {
                double d3 = class080362.method_23318() + (double)class080362.method_18381(class080362.method_18376());
                if (d3 - (double)class072092.method_10264() > 2.0) {
                    callbackInfoReturnable.setReturnValue((Object)class07211.field_11033);
                    return;
                }
                if ((double)class072092.method_10264() - d3 > 0.0) {
                    callbackInfoReturnable.setReturnValue((Object)class07211.field_11036);
                    return;
                }
            }
            callbackInfoReturnable.setReturnValue((Object)class080362.method_5735());
        }
    }

    public static class06942 N(class06942 class069422, class07209 class072092, class07211 class072112) {
        return new class06942(class069422.method_8045(), class069422.method_8036(), class069422.method_20287(), class069422.method_8041(), new class06183(new class06889((double)class072092.method_10263() + 0.5 + (double)class072112.P() * 0.5, (double)class072092.method_10264() + 0.5 + (double)class072112.s() * 0.5, (double)class072092.method_10260() + 0.5 + (double)class072112.T() * 0.5), class072112, class072092, false));
    }

    public boolean N() {
        boolean bl = this.N || this.method_8045().method_8320(this.method_8037()).N(this);
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, bl);
        this.y(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return bl;
    }

    public class07209 method_8037() {
        return this.N ? super.method_8037() : this.y;
    }
}

