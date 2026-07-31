/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.mixin;

import kotakbaz.rain.guard.b_0;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ClientPlayerEntity.class})
public abstract class GuardPlayerMixin {
    @Inject(method={"method_5773"}, at={@At(value="HEAD")})
    private void rain$guardMeshPlayer(CallbackInfo ci) {
        b_0.probe(4, "1.21.8");
    }
}

