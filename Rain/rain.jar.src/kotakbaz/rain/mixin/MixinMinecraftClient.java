/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.Rain;
import kotakbaz.rain.client.discord.a;
import kotakbaz.rain.module.ModuleManager;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={MinecraftClient.class})
public class MixinMinecraftClient {
    @Inject(method={"method_20539"}, at={@At(value="HEAD")}, cancellable=true)
    public void onOpenGameMenu(boolean pauseOnly, CallbackInfo ci) {
        if (Rain.INSTANCE.getCustomScreen() != null) {
            ci.cancel();
        }
    }

    @Inject(method={"method_18097"}, at={@At(value="TAIL")})
    private void rain$syncAvailabilityOnWorldChange(ClientWorld world, CallbackInfo ci) {
        ModuleManager.INSTANCE.syncAvailabilityStates();
    }

    @Inject(method={"close"}, at={@At(value="HEAD")})
    private void rain$shutdownDiscordRpc(CallbackInfo ci) {
        a.shutdown();
    }
}

