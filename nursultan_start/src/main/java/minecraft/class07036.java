/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01118
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class01751
 *  minecraft.class03556
 *  minecraft.class03568
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class04911
 *  minecraft.class05220
 *  minecraft.class05487
 *  minecraft.class05904
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06559
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07267
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07536
 *  minecraft.class07796
 *  minecraft.class08036
 *  minecraft.class08092
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Arrays;
import java.util.UUID;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01118;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class01751;
import minecraft.class03556;
import minecraft.class03568;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class04911;
import minecraft.class05220;
import minecraft.class05487;
import minecraft.class05904;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06559;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07267;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07536;
import minecraft.class07796;
import minecraft.class08036;
import minecraft.class08092;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class07036
extends class07796
implements class06084 {
    public static final class06667 N = class06665.q;
    private static final class00494 y = class00891.y((double)8.0, (double)0.0, (double)16.0);
    private final class05904 L;

    public class05904 L() {
        return this.L;
    }

    public class06889 T(class00500 class005002) {
        return new class06889(0.5, 0.5, 0.5);
    }

    public class07036(class05904 class059042, class01362 class013622) {
        super(class013622);
        this.L = class059042;
    }

    public abstract float U(class00500 var1);

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)N)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    private boolean y(class08036 class080362, class07267 class072672, boolean bl) {
        return Arrays.stream(class072672.N(bl).y(class080362.method_33793())).allMatch(class003922 -> class003922.equals((Object)class05220.N) || class003922.method_10851() instanceof class01751);
    }

    public static class05904 N(class00891 class008912) {
        class05904 class059042 = class008912 instanceof class07036 ? ((class07036)class008912).L() : class05904.y;
        return class059042;
    }

    public void N(class08036 class080362, class07267 class072672, boolean bl) {
        class072672.N(class080362.method_5667());
        class080362.method_7311(class072672, bl);
    }

    private boolean N(class08036 class080362, class07267 class072672) {
        UUID uUID = class072672.Z();
        return uUID != null && !uUID.equals(class080362.method_5667());
    }

    private void N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832, CallbackInfoReturnable callbackInfoReturnable) {
        if (!class072992.method_8608()) {
            return;
        }
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4)) {
            callbackInfoReturnable.setReturnValue((Object)class07082.N);
        } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_4)) {
            class06584 class065843 = class080362.method_5998(class070502);
            boolean bl = (class065843.B() instanceof class06559 || class065843.N(class06570.vU) || class065843.N(class06570.vz)) && class080362.method_7294();
            callbackInfoReturnable.setReturnValue((Object)(bl ? class07082.N : class07082.L));
        }
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072992, class00500 class005002, class00404<T> class004042) {
        return class07036.N(class004042, (class00404)class00404.field_11911, class07267::N);
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class07267(class072092, class005002);
    }

    protected class07082 N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832) {
        boolean bl;
        class03568 class035682;
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class065842, class005002, class072992, class072092, class080362, class070502, class061832, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class07082)callbackInfoReturnable.getReturnValue();
        }
        class00394 class003942 = class072992.method_8321(class072092);
        if (!(class003942 instanceof class07267)) {
            return class07082.i;
        }
        class07267 class072672 = (class07267)class003942;
        class06581 class065812 = class065842.B();
        class003942 = class065812 instanceof class03568 ? (class035682 = (class03568)class065812) : null;
        boolean bl2 = bl = class003942 != null && class080362.method_7294();
        if (!(class072992 instanceof class04782)) {
            return bl || class072672.z() ? class07082.N : class07082.L;
        }
        class065812 = (class04782)class072992;
        if (!bl || class072672.z() || this.N(class080362, class072672)) {
            return class07082.R;
        }
        boolean bl3 = class072672.N(class080362);
        if (class003942.N(class072672.N(bl3), class080362) && class003942.N((class07299)class065812, class072672, bl3, class080362)) {
            class072672.N((class04782)class065812, class080362, class072092, bl3);
            class080362.method_7259(class01235.L.y((Object)class065842.B()));
            class065812.N((class03556)class01194.L, class072672.d(), class01164.N((class07049)class080362, (class00500)class072672.w()));
            class065842.N(1, (class07438)class080362);
            return class07082.N;
        }
        return class07082.R;
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        class00394 class003942 = class072992.method_8321(class072092);
        if (!(class003942 instanceof class07267)) {
            return class07082.i;
        }
        class07267 class072672 = (class07267)class003942;
        if (!(class072992 instanceof class04782)) {
            class07536.y((Throwable)new IllegalStateException("Expected to only call this on server"));
            return class07082.L;
        }
        class003942 = (class04782)class072992;
        boolean bl = class072672.N(class080362);
        boolean bl2 = class072672.N((class04782)class003942, class080362, class072092, bl);
        if (class072672.z()) {
            class003942.N(null, class072672.d(), class072672.U(), class04911.field_15245);
            return class07082.y;
        }
        if (bl2) {
            return class07082.y;
        }
        if (!this.N(class080362, class072672) && class080362.method_7294() && this.y(class080362, class072672, bl)) {
            this.N(class080362, class072672, bl);
            return class07082.y;
        }
        return class07082.i;
    }

    protected abstract MapCodec<? extends class07036> N();

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return y;
    }

    public class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)N)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public boolean c_(class00500 class005002) {
        return true;
    }
}

