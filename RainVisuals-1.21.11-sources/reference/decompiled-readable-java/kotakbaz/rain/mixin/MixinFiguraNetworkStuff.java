/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Pseudo
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package kotakbaz.rain.mixin;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(targets={"other/figura/backend2/NetworkStuff"}, remap=false)
@Pseudo
public abstract class MixinFiguraNetworkStuff {
    @Inject(method={"getSizeLimit"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private static void rain$keepLocalAvatarSizeLimit(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue((Object)Integer.MAX_VALUE);
    }

    @Inject(method={"tick", "auth", "reAuth", "connect", "checkVersion", "setLimits", "getUser", "uploadAvatar", "deleteAvatar", "equipAvatar", "getAvatar", "sendPing", "subscribeAll", "unsubscribeAll"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private static void rain$blockFiguraBackendVoidCalls(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method={"getResourcesHashes"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private static void rain$blockFiguraResourceHashes(CallbackInfoReturnable<InputStream> cir) {
        cir.setReturnValue((Object)new ByteArrayInputStream("{}".getBytes(StandardCharsets.UTF_8)));
    }

    @Inject(method={"getResource"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private static void rain$blockFiguraResourceDownload(CallbackInfoReturnable<InputStream> cir) {
        cir.setReturnValue((Object)new ByteArrayInputStream(new byte[0]));
    }

    @Inject(method={"isConnected"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private static void rain$forceFiguraBackendOffline(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue((Object)false);
    }

    @Inject(method={"canUpload"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    private static void rain$blockFiguraUploads(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue((Object)false);
    }
}

