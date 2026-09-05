/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00700
 *  minecraft.class00753
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class02607
 *  minecraft.class03556
 *  minecraft.class06501
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07051
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class08036
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.List;
import minecraft.class00700;
import minecraft.class00753;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class02607;
import minecraft.class03556;
import minecraft.class06501;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07051;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class08036;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06553
extends class06581 {
    public class06553(class06573 class065732) {
        super(class065732);
    }

    private void N(class06501 class065012, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21) && class065012.method_8045().method_8320(class065012.method_8037()).N(class01210.A)) {
            callbackInfoReturnable.setReturnValue((Object)class07082.N);
        }
    }

    public static class07082 N(class08036 class080362, class07299 class072992, class07209 class072092) {
        class00700 class007002 = null;
        List var4 = class02607.N((class07299)class072992, (class06889)class06889.y((class00753)class072092), (T class026072) -> class026072.yW() == class080362);
        boolean bl = false;
        for (class02607 class026073 : var4) {
            if (class007002 == null) {
                class007002 = class00700.N((class07299)class072992, (class07209)class072092);
                class007002.L();
            }
            if (!class026073.R(class007002)) continue;
            class026073.N((class07049)class007002, true);
            bl = true;
        }
        if (bl) {
            class072992.N((class03556)class01194.y, class072092, class01164.N((class07049)class080362));
            return class07082.y;
        }
        return class07082.i;
    }

    @Override
    public class07082 N(class06501 class065012) {
        class07209 class072092;
        class07299 class072992 = class065012.method_8045();
        if (class072992.method_8320(class072092 = class065012.method_8037()).N(class01210.A)) {
            class08036 class080362 = class065012.method_8036();
            if (!class072992.method_8608() && class080362 != null) {
                class07082 class070822 = class06553.N(class080362, class072992, class072092);
                class07082 class070823 = class070822;
                class070823 = new CallbackInfoReturnable("", true, (Object)class070823);
                this.N(class065012, (CallbackInfoReturnable)class070823);
                if (class070823.isCancelled()) {
                    return (class07082)class070823.getReturnValue();
                }
                return class070822;
            }
        }
        class07051 class070512 = class07082.i;
        class07051 class070513 = class070512;
        class070513 = new CallbackInfoReturnable("", true, (Object)class070513);
        this.N(class065012, (CallbackInfoReturnable)class070513);
        if (class070513.isCancelled()) {
            return (class07082)class070513.getReturnValue();
        }
        return class070512;
    }
}

