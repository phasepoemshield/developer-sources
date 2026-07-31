package sky.core.util.mixin.client;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.RunArgs;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import sky.core.util.client.SkycoreClient;

@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {
    @Inject(
            method = "<init>",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/debug/DebugRenderer;<init>(Lnet/minecraft/client/MinecraftClient;)V")
    )
    private void skycore$initRendering(RunArgs args, CallbackInfo ci) {
        SkycoreClient.initRendering();
    }
}
