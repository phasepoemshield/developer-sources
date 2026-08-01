package sky.core.util.mixin.client;

import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import sky.core.util.NoRenderUtil;

@Mixin(BackgroundRenderer.class)
public class BackgroundRendererMixin {
    @Inject(method = "getFogModifier", at = @At("HEAD"), cancellable = true)
    private static void skycore$hideBadEffectFog(Entity entity, float tickDelta, CallbackInfoReturnable<?> cir) {
        if (NoRenderUtil.shouldCancel(NoRenderUtil.Type.BAD_EFFECTS)) {
            cir.setReturnValue(null);
        }
    }
}
