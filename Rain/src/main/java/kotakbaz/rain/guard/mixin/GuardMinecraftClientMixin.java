/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.mixin;

import kotakbaz.rain.guard.b_0;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={MinecraftClient.class})
public abstract class GuardMinecraftClientMixin {
    @Inject(method={"method_1574"}, at={@At(value="HEAD")})
    private void rain$guardMeshTick(CallbackInfo ci) {
        b_0.pulse(1, "1.21.8");
    }

    @Inject(method={"method_18097"}, at={@At(value="HEAD")})
    private void rain$guardMeshWorld(ClientWorld world, CallbackInfo ci) {
        b_0.probe(2, "1.21.8");
    }
}

