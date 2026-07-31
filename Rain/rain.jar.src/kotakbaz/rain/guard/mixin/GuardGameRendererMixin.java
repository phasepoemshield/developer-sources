/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.mixin;

import kotakbaz.rain.guard.b_0;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RenderTickCounter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GameRenderer.class})
public abstract class GuardGameRendererMixin {
    @Inject(method={"method_3192"}, at={@At(value="HEAD")})
    private void rain$guardMeshRender(RenderTickCounter tickCounter, boolean tick, CallbackInfo ci) {
        b_0.probe(6, "1.21.8");
    }
}

