/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class12010
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.settings.impl.DebugSettings
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00717
 *  minecraft.class00860
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01929
 *  minecraft.class02484
 *  minecraft.class02841
 *  minecraft.class02854
 *  minecraft.class03556
 *  minecraft.class03767
 *  minecraft.class04770
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class05970
 *  minecraft.class06092
 *  minecraft.class06501
 *  minecraft.class06573
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06638
 *  minecraft.class07001
 *  minecraft.class07027
 *  minecraft.class07049
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07752
 *  minecraft.class08036
 *  minecraft.class08092
 *  minecraft.class08162
 *  minecraft.class08303
 *  minecraft.class08329
 *  minecraft.class08983
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class12010;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Map;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00717;
import minecraft.class00860;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01929;
import minecraft.class02484;
import minecraft.class02841;
import minecraft.class02854;
import minecraft.class03556;
import minecraft.class03767;
import minecraft.class04770;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class05970;
import minecraft.class06092;
import minecraft.class06501;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06638;
import minecraft.class06912;
import minecraft.class06942;
import minecraft.class07001;
import minecraft.class07027;
import minecraft.class07049;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07752;
import minecraft.class08036;
import minecraft.class08092;
import minecraft.class08162;
import minecraft.class08303;
import minecraft.class08329;
import minecraft.class08983;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06918
extends class06581
implements class12010 {
    @Deprecated
    private final class00891 N;

    public class00891 L() {
        return this.N;
    }

    public @Nullable class06942 L(class06942 class069422) {
        return class069422;
    }

    public class06918(class00891 class008912, class06573 class065732) {
        super(class065732);
        this.N = class008912;
    }

    public @Nullable class00500 u(class06942 class069422) {
        class00500 class005002 = this.L().N(class069422);
        return class005002 != null && this.N(class069422, class005002) ? class005002 : null;
    }

    public boolean u() {
        return !(this.L() instanceof class07027);
    }

    protected boolean y() {
        return true;
    }

    protected boolean y(class06942 class069422, class00500 class005002) {
        return class069422.method_8045().method_8652(class069422.method_8037(), class005002, 11);
    }

    public class07082 y(class06942 class069422) {
        if (!this.L().N(class069422.method_8045().method_45162())) {
            return class07082.u;
        }
        if (!class069422.N()) {
            return class07082.u;
        }
        class06942 class069423 = this.L(class069422);
        if (class069423 == null) {
            return class07082.u;
        }
        class00500 class005002 = this.u(class069423);
        if (class005002 == null) {
            return class07082.u;
        }
        if (!this.y(class069423, class005002)) {
            return class07082.u;
        }
        class07209 class072092 = class069423.method_8037();
        class07299 class072992 = class069423.method_8045();
        class08036 class080362 = class069423.method_8036();
        class06584 class065842 = class069423.method_8041();
        class00500 class005003 = class072992.method_8320(class072092);
        if (class005003.N(class005002.i())) {
            class005003 = this.N(class072092, class072992, class065842, class005003);
            this.N(class072092, class072992, class080362, class065842, class005003);
            class06918.N(class072992, class072092, class065842);
            class005003.i().N(class072992, class072092, class005003, (class07438)class080362, class065842);
            if (class080362 instanceof class04770) {
                class06912.w.N((class04770)class080362, class072092, class065842);
            }
        }
        class07752 class077522 = class005003.O();
        float f = class077522.y() * 0.8f;
        float f2 = (class077522.N() + 1.0f) / 2.0f;
        class04911 class049112 = class04911.field_15245;
        class07299 class072993 = class072992;
        class08036 class080363 = class080362;
        class07209 class072093 = class072092;
        class04891 class048912 = this.N(class005003);
        if (this.N(class072993, (class07049)class080363, class072093, class048912, class049112, f2, f)) {
            class072993.method_8396((class07049)class080363, class072093, class048912, class049112, f2, f);
        }
        class072992.N((class03556)class01194.Z, class072092, class01164.N((class07049)class080362, (class00500)class005003));
        class065842.N(1, (class07438)class080362);
        return class07082.N;
    }

    public void N(class00717 class007172) {
        class02854 class028542 = (class02854)class007172.N().N(class02484.NG, (Object)class02854.N);
        if (class028542 != null) {
            class05970.N((class00717)class007172, (Iterable)class028542.i());
        }
    }

    public class07082 N(class06501 class065012) {
        class07082 class070822 = this.y(new class06942(class065012));
        if (!class070822.N() && class065012.method_8041().L(class02484.w)) {
            return super.N(class065012.method_8045(), class065012.method_8036(), class065012.method_20287());
        }
        return class070822;
    }

    public void N(Map<class00891, class06581> map, class06581 class065812) {
        map.put(this.L(), class065812);
    }

    public /* synthetic */ class00500 N(class06942 class069422) {
        return this.u(class069422);
    }

    public static void N(class06584 class065842, class00404<?> class004042, class08303 class083032) {
        class083032.L("id");
        if (class083032.N()) {
            class065842.y(class02484.NB);
        } else {
            class00394.N((class08329)class083032, class004042);
            class065842.N(class02484.NB, (Object)class08983.N(class004042, (class07001)class083032.y()));
        }
    }

    private void N(class06942 class069422, class00500 class005002, CallbackInfoReturnable callbackInfoReturnable) {
        class00891 class008912;
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2) && ((class008912 = class005002.i()) == class00869.LA || class008912 == class00869.BH)) {
            class07299 class072992 = class069422.method_8045();
            class07209 class072092 = class069422.method_8037();
            boolean bl = false;
            for (class07211 class072112 : class07221.field_11062) {
                class00500 class005003 = class072992.method_8320(class072092.method_10093(class072112));
                if (class005003.i() != class008912) continue;
                if (bl) {
                    callbackInfoReturnable.setReturnValue((Object)false);
                    return;
                }
                bl = true;
                if (class005003.L((class08092)class00860.i) == class06638.field_12569) continue;
                callbackInfoReturnable.setReturnValue((Object)false);
                return;
            }
        }
    }

    private boolean N(class07299 class072992, class07049 class070492, class07209 class072092, class04891 class048912, class04911 class049112, float f, float f2) {
        return !DebugSettings.INSTANCE.serversidePlaceSounds.isEnabled();
    }

    private static void N(class07299 class072992, class07209 class072092, class06584 class065842) {
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 != null) {
            class003942.y(class065842);
            class003942.method_5431();
        }
    }

    protected boolean N(class07209 class072092, class07299 class072992, @Nullable class08036 class080362, class06584 class065842, class00500 class005002) {
        return class06918.N(class072992, class080362, class072092, class065842);
    }

    protected boolean N(class06942 class069422, class00500 class005002) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class069422, class005002, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        class08036 class080362 = class069422.method_8036();
        return (!this.y() || class005002.N((class05487)class069422.method_8045(), class069422.method_8037())) && class069422.method_8045().method_8628(class005002, class069422.method_8037(), class06092.N((class08036)class080362));
    }

    private class00500 N(class07209 class072092, class07299 class072992, class06584 class065842, class00500 class005002) {
        class02841 class028412 = (class02841)class065842.a_(class02484.Nl, (Object)class02841.N);
        if (class028412.N()) {
            return class005002;
        }
        class00500 class005003 = class028412.N(class005002);
        if (class005003 != class005002) {
            class072992.method_8652(class072092, class005003, 2);
        }
        return class005003;
    }

    public boolean N(class06584 class065842, @Nullable class08036 class080362) {
        class08983 class089832;
        if (class080362 != null && class080362.method_75004().hasPermission(class08162.y) && (class089832 = (class08983)class065842.method_58694(class02484.NB)) != null) {
            return ((class00404)class089832.N()).method_65166();
        }
        return false;
    }

    public static boolean N(class07299 class072992, @Nullable class08036 class080362, class07209 class072092, class06584 class065842) {
        class00394 class003942;
        if (class072992.method_8608()) {
            return false;
        }
        class08983 class089832 = (class08983)class065842.method_58694(class02484.NB);
        if (class089832 != null && (class003942 = class072992.method_8321(class072092)) != null) {
            class00404 var6 = class003942.O();
            if (var6 != class089832.N()) {
                return false;
            }
            if (var6.method_65166() && (class080362 == null || !class080362.method_7338())) {
                return false;
            }
            return class089832.N(class003942, (class01929)class072992.method_30349());
        }
        return false;
    }

    protected class04891 N(class00500 class005002) {
        return class005002.O().i();
    }

    public class03767 method_45322() {
        return this.L().method_45322();
    }
}

