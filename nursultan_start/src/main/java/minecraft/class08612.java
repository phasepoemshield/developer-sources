/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00864
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class08064
 *  minecraft.class08071
 *  minecraft.class08092
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.function.Function;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00864;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class08064;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08614;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class08612
extends class00864
implements class00873,
class08614 {
    public static final MapCodec<class08612> N = class08612.y(class08612::new);
    public static final class08064<class07211> y = class06665.f;
    public static final class08071 L = class06665.C;
    private final Function<class00500, class00494> M;
    private static final class00494 B;

    @Override
    public double L() {
        return 3.0;
    }

    public class08612(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y(y, (Comparable)class07211.field_11043)).y((class08092)L, (Comparable)Integer.valueOf(1)));
        this.M = this.i();
    }

    private Function<class00500, class00494> i() {
        return this.N(this.N(y, L));
    }

    @Override
    public class08071 u() {
        return L;
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return true;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L});
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        int n = (Integer)class005002.L((class08092)L);
        if (n < 4) {
            class047822.method_8652(class072092, (class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf(n + 1)), 2);
        } else {
            class08612.N_21((class07299)class047822, (class07209)class072092, (class06584)new class06584((class07310)this));
        }
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20)) {
            callbackInfoReturnable.setReturnValue((Object)B);
        }
    }

    public class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(y, (Comparable)class069932.N((class07211)class005002.L(y)));
    }

    public class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(y)));
    }

    public boolean N(class00500 class005002, class06942 class069422) {
        if (this.N(class005002, class069422, L)) {
            return true;
        }
        return super.N(class005002, class069422);
    }

    public class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return this.M.apply(class005002);
    }

    public MapCodec<class08612> N() {
        return N;
    }

    public class00500 N(class06942 class069422) {
        return this.N(class069422, (class00891)this, L, y);
    }
}

