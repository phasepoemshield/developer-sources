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

// $VF: Compiled from MixinFiguraNetworkStuff.java
@Mixin(targets = "other/figura/backend2/NetworkStuff", remap = false)
@Pseudo
public abstract class MixinFiguraNetworkStuff {
   @Inject(method = "getSizeLimit", at = @At("HEAD"), cancellable = true, remap = false)
   private static void rain$keepLocalAvatarSizeLimit(CallbackInfoReturnable<Integer> cir) {
      cir.setReturnValue(Integer.MAX_VALUE);
   }

   @Inject(
      method = {
            "tick",
            "auth",
            "reAuth",
            "connect",
            "checkVersion",
            "setLimits",
            "getUser",
            "uploadAvatar",
            "deleteAvatar",
            "equipAvatar",
            "getAvatar",
            "sendPing",
            "subscribeAll",
            "unsubscribeAll"
      },
      at = @At("HEAD"),
      cancellable = true,
      remap = false
   )
   private static void rain$blockFiguraBackendVoidCalls(CallbackInfo ci) {
      ci.cancel();
   }

   @Inject(method = "getResourcesHashes", at = @At("HEAD"), cancellable = true, remap = false)
   private static void rain$blockFiguraResourceHashes(CallbackInfoReturnable<InputStream> cir) {
      cir.setReturnValue(new ByteArrayInputStream("{}".getBytes(StandardCharsets.UTF_8)));
   }

   @Inject(method = "getResource", at = @At("HEAD"), cancellable = true, remap = false)
   private static void rain$blockFiguraResourceDownload(CallbackInfoReturnable<InputStream> cir) {
      cir.setReturnValue(new ByteArrayInputStream(new byte[0]));
   }

   @Inject(method = "isConnected", at = @At("HEAD"), cancellable = true, remap = false)
   private static void rain$forceFiguraBackendOffline(CallbackInfoReturnable<Boolean> cir) {
      cir.setReturnValue(false);
   }

   @Inject(method = "canUpload", at = @At("HEAD"), cancellable = true, remap = false)
   private static void rain$blockFiguraUploads(CallbackInfoReturnable<Boolean> cir) {
      cir.setReturnValue(false);
   }
}
