/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10199
 *  com.viaversion.viafabricplus.injection.access.base.bedrock.IServerAddress
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  dev.kastle.netty.channel.nethernet.config.NetherNetAddress
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class10199;
import com.viaversion.viafabricplus.injection.access.base.bedrock.IServerAddress;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import dev.kastle.netty.channel.nethernet.config.NetherNetAddress;
import java.util.Optional;
import minecraft.class03420;
import minecraft.class03422;
import minecraft.class03437;
import minecraft.class03450;
import minecraft.class03452;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03459 {
    public static final class03459 N = new class03459(class03450.y, class03452.N(), class03422.N());
    private final class03450 L;
    public final class03452 y;
    private final class03422 u;

    private void L(class03420 class034202, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_16_4)) {
            callbackInfoReturnable.setReturnValue(this.L.resolve(class034202));
        }
    }

    class03459(class03450 class034502, class03452 class034522, class03422 class034222) {
        this.L = class034502;
        this.y = class034522;
        this.u = class034222;
    }

    private void y(class03420 class034202, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            callbackInfoReturnable.setReturnValue(this.L.resolve(class034202));
        }
    }

    public Optional<class03437> N(class03420 class034202) {
        Optional<class03437> optional;
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class034202, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (Optional)callbackInfoReturnable.getReturnValue();
        }
        CallbackInfoReturnable callbackInfoReturnable2 = new CallbackInfoReturnable("", true);
        this.y(class034202, callbackInfoReturnable2);
        if (callbackInfoReturnable2.isCancelled()) {
            return (Optional)callbackInfoReturnable2.getReturnValue();
        }
        CallbackInfoReturnable callbackInfoReturnable3 = new CallbackInfoReturnable("", true);
        this.L(class034202, callbackInfoReturnable3);
        if (callbackInfoReturnable3.isCancelled()) {
            return (Optional)callbackInfoReturnable3.getReturnValue();
        }
        Optional<class03437> var2 = this.L.resolve(class034202);
        if (var2.isPresent() && !this.u.N(var2.get()) || !this.u.N(class034202)) {
            return Optional.empty();
        }
        Optional<class03420> var3 = this.y.lookupRedirect(class034202);
        if (var3.isPresent()) {
            optional = this.L.resolve(var3.get()).filter(this.u::N);
        }
        return optional;
    }

    private void N(class03420 class034202, CallbackInfoReturnable callbackInfoReturnable) {
        IServerAddress iServerAddress;
        class03420 class034203 = class034202;
        if (class034203 instanceof IServerAddress && (iServerAddress = (IServerAddress)class034203).viaFabricPlus$getNetherNetAddress() != null) {
            class034203 = iServerAddress.viaFabricPlus$getNetherNetAddress();
            callbackInfoReturnable.setReturnValue(Optional.of(new class10199(this, (NetherNetAddress)class034203)));
        }
    }
}

