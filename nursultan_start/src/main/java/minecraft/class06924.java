/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  minecraft.class01235
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06509
 *  minecraft.class06573
 *  minecraft.class06577
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08005
 *  minecraft.class08036
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class01235;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06509;
import minecraft.class06573;
import minecraft.class06577;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08005;
import minecraft.class08036;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06924
extends class06577 {
    public static final int N = 20;
    public static final int y = 15;

    public class06924(class06573 class065732) {
        super(class065732);
    }

    public int y() {
        return 15;
    }

    public class06509 y(class06584 class065842) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.y(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class06509)callbackInfoReturnable.getReturnValue();
        }
        return class06509.field_8953;
    }

    private void y(CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_7tob1_7_3)) {
            callbackInfoReturnable.setReturnValue((Object)class06509.field_8952);
        }
    }

    public Predicate<class06584> N() {
        return L;
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_7tob1_7_3)) {
            callbackInfoReturnable.setReturnValue((Object)0);
        }
    }

    private void N(class07299 class072992, class08036 class080362, class07050 class070502, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_7tob1_7_3)) {
            class06584 class065842 = class080362.method_18808(class080362.method_5998(class070502));
            if (class065842.R()) {
                callbackInfoReturnable.setReturnValue((Object)class07082.u);
            } else {
                class065842.B(1);
                callbackInfoReturnable.setReturnValue((Object)class07082.i);
            }
        }
    }

    public boolean N(class06584 class065842, class07299 class072992, class07438 class074382, int n) {
        if (!(class074382 instanceof class08036)) {
            return false;
        }
        class08036 class080362 = (class08036)class074382;
        class06584 class065843 = class080362.method_18808(class065842);
        if (class065843.R()) {
            return false;
        }
        float f = class06924.N(this.N(class065842, class074382) - n);
        if ((double)f < 0.1) {
            return false;
        }
        List var9 = class06924.N((class06584)class065842, (class06584)class065843, (class07438)class080362);
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            if (!var9.isEmpty()) {
                this.N(class047822, (class07438)class080362, class080362.method_6058(), class065842, var9, f * 3.0f, 1.0f, f == 1.0f, null);
            }
        }
        class072992.method_43128(null, class080362.method_23317(), class080362.method_23318(), class080362.method_23321(), class04909.NK, class04911.field_15248, 1.0f, 1.0f / (class072992.method_8409().z() * 0.4f + 1.2f) + f * 0.5f);
        class080362.method_7259(class01235.L.y((Object)this));
        return true;
    }

    protected void N(class07438 class074382, class08005 class080052, int n, float f, float f2, float f3, @Nullable class07438 class074383) {
        class080052.N((class07049)class074382, class074382.method_36455(), class074382.method_36454() + f3, 0.0f, f, f2);
    }

    public static float N(int n) {
        float f = (float)n / 20.0f;
        if ((f = (f * f + f * 2.0f) / 3.0f) > 1.0f) {
            f = 1.0f;
        }
        return f;
    }

    public int N(class06584 class065842, class07438 class074382) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueI();
        }
        return 72000;
    }

    public class07082 N(class07299 class072992, class08036 class080362, class07050 class070502) {
        boolean bl;
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class072992, class080362, class070502, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class07082)callbackInfoReturnable.getReturnValue();
        }
        class06584 class065842 = class080362.method_5998(class070502);
        boolean bl2 = bl = !class080362.method_18808(class065842).R();
        if (class080362.method_56992() || bl) {
            class080362.method_6019(class070502);
            return class07082.L;
        }
        return class07082.u;
    }
}

