/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.util.math.MatrixStack
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.\u0635\u0650;

@Mixin(value={GameRenderer.class})
public abstract class MixinRenderTweaksGameRenderer {
    @Inject(method={"method_3198"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$cancelHurtCamera(MatrixStack matrices, float tickProgress, CallbackInfo ci) {
        if (\u0635\u0650.INSTANCE.isEnabled() && ((Boolean)\u0635\u0650.INSTANCE.getNoHurtCam().getValue()).booleanValue()) {
            ci.cancel();
        }
    }
}

