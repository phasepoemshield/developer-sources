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
 *  minecraft.class00737
 *  minecraft.class00891
 *  minecraft.class01001
 *  minecraft.class01032
 *  minecraft.class01362
 *  minecraft.class02234
 *  minecraft.class02611
 *  minecraft.class04651
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class05042
 *  minecraft.class05487
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06584
 *  minecraft.class06681
 *  minecraft.class06889
 *  minecraft.class06898
 *  minecraft.class07049
 *  minecraft.class07279
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07796
 *  minecraft.class08400
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Set;
import minecraft.class00394;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00737;
import minecraft.class00891;
import minecraft.class01001;
import minecraft.class01032;
import minecraft.class01362;
import minecraft.class02234;
import minecraft.class02611;
import minecraft.class04651;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class05042;
import minecraft.class05487;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06584;
import minecraft.class06681;
import minecraft.class06889;
import minecraft.class06898;
import minecraft.class07049;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07279;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07796;
import minecraft.class08400;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07207
extends class07796
implements class02234 {
    public static final MapCodec<class07207> N = class07207.y(class07207::new);
    private static final class00494 y = class00891.y((double)16.0, (double)6.0, (double)12.0);
    private static final class00494 L;
    private static final class00494 u;

    public class07207(class01362 class013622) {
        super(class013622);
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        double d = (double)class072092.method_10263() + class060692.U();
        double d2 = (double)class072092.method_10264() + 0.8;
        double d3 = (double)class072092.method_10260() + class060692.U();
        class072992.method_8406((class07126)class07107.NZ, d, d2, d3, 0.0, 0.0, 0.0);
    }

    public class06584 N(class05487 class054872, class07209 class072092, class00500 class005002, boolean bl) {
        return class06584.E;
    }

    public @Nullable class01032 N(class04782 class047822, class07049 class070492, class07209 class072092) {
        Set var13;
        float f;
        float f2;
        class05042 class050422 = class047822.method_74854();
        boolean bl = class047822.method_27983() == class07299.field_25181;
        class05946 var7 = bl ? class050422.N() : class07299.field_25181;
        class07209 class072093 = bl ? class050422.y() : class04782.field_25144;
        class04782 class047823 = class047822.method_8503().N(var7);
        if (class047823 == null) {
            return null;
        }
        class06889 class068892 = class072093.method_61082();
        if (!bl) {
            class02611.N((class01001)class047823, (class07209)class07209.method_49638((class00737)class068892).method_10074(), (boolean)true);
            f2 = class07211.field_11039.U();
            f = 0.0f;
            var13 = class06681.N((Set[])new Set[]{class06681.field_54094, Set.of(class06681.field_12397)});
            if (class070492 instanceof class04770) {
                class068892 = class068892.N(0.0, 1.0, 0.0);
            }
        } else {
            f2 = class050422.u();
            f = class050422.i();
            var13 = class06681.N((Set[])new Set[]{class06681.field_54094, class06681.field_40711});
            if (class070492 instanceof class04770) {
                return ((class04770)class070492).method_60590(false, class01032.N);
            }
            class068892 = class070492.method_14245(class047823, class072093).method_61082();
        }
        return new class01032(class047823, class068892, class06889.L, f2, f, var13, class01032.y.N(class01032.L));
    }

    protected boolean N(class00500 class005002, class04651 class046512) {
        return false;
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            callbackInfoReturnable.setReturnValue((Object)L);
        } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_16_4)) {
            callbackInfoReturnable.setReturnValue((Object)u);
        }
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class07279(class072092, class005002);
    }

    public MapCodec<class07207> N() {
        return N;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return y;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class07049 class070492) {
        return class005002.R(class072902, class072092);
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl) {
        if (!class070492.method_5822(false)) return;
        if (!class072992.method_8608() && class072992.method_27983() == class07299.field_25181 && class070492 instanceof class04770) {
            class04770 class047702 = (class04770)class070492;
            if (!class047702.field_13969) {
                class047702.method_60594();
                return;
            }
        }
        class070492.method_60697((class02234)this, class072092);
    }

    protected class06898 d_(class00500 class005002) {
        return class06898.field_11455;
    }
}

