/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.RenderTweaksModule;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GameRenderer.class})
public abstract class MixinRenderTweaksGameRenderer {
    @Inject(method={"method_3198"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$cancelHurtCamera(MatrixStack matrices, float tickProgress, CallbackInfo ci) {
        if (RenderTweaksModule.INSTANCE.isEnabled() && ((Boolean)RenderTweaksModule.INSTANCE.getNoHurtCam().getValue()).booleanValue()) {
            ci.cancel();
        }
    }
}

