/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.injection.ViaFabricPlusMixinPlugin
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class01362
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04782
 *  minecraft.class04823
 *  minecraft.class04835
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06342
 *  minecraft.class06584
 *  minecraft.class07003
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07536
 *  minecraft.class08036
 *  minecraft.class08791
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.injection.ViaFabricPlusMixinPlugin;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04782;
import minecraft.class04823;
import minecraft.class04835;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06342;
import minecraft.class06584;
import minecraft.class07003;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07536;
import minecraft.class08036;
import minecraft.class08791;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class00865
extends class00891 {
    protected static final int N = 4;
    private static final class00494 u = class00891.y(12.0, 4.0, 16.0);
    public static final class00494 y = (class00494)class07536.N(() -> {
        int n = 4;
        int n2 = 3;
        int n3 = 2;
        return class00389.N((class00494)class00389.y(), (class00494)class00389.N((class00494)class00891.N(16.0, 8.0, 0.0, 3.0), (class00494[])new class00494[]{class00891.N(8.0, 16.0, 0.0, 3.0), class00891.y(12.0, 0.0, 3.0), u}), (class07003)class07003.i);
    });
    protected final class04835 L;
    private static final class00494 i;
    private boolean R;

    public class00865(class01362 class013622, class04835 class048352) {
        super(class013622);
        this.L = class048352;
    }

    protected double U(class00500 class005002) {
        return 0.0;
    }

    public class00494 z(class00500 class005002) {
        this.R = true;
        return super.z(class005002);
    }

    protected class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2) || ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            return i;
        }
        return super.y_4(class005002, class072902, class072092, class060922);
    }

    public abstract boolean E(class00500 var1);

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class04651 class046512) {
    }

    protected abstract MapCodec<? extends class00865> N();

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return y;
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ViaFabricPlusMixinPlugin.MORE_CULLING_PRESENT && this.R) {
            this.R = false;
        } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            callbackInfoReturnable.setReturnValue((Object)class00389.y());
        } else if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            callbackInfoReturnable.setReturnValue((Object)i);
        }
    }

    protected class07082 N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832) {
        return ((class04823)this.L.y().get(class065842.B())).interact(class005002, class072992, class072092, class080362, class070502, class065842);
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    protected boolean N(class00500 class005002) {
        return true;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        class07209 class072093 = class06342.N((class07299)class047822, (class07209)class072092);
        if (class072093 == null) {
            return;
        }
        class04651 class046512 = class06342.N((class04782)class047822, (class07209)class072093);
        if (class046512 != class04684.N && this.N(class046512)) {
            this.N(class005002, (class07299)class047822, class072092, class046512);
        }
    }

    protected boolean N(class04651 class046512) {
        return false;
    }

    protected class00494 b_(class00500 class005002, class07290 class072902, class07209 class072092) {
        return u;
    }
}

