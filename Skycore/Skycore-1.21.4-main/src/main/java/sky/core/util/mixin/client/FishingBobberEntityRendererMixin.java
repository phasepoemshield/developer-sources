package sky.core.util.mixin.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.FishingBobberEntityRenderer;
import net.minecraft.client.render.entity.state.FishingBobberEntityState;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import sky.core.util.NoRenderUtil;

@Mixin(FishingBobberEntityRenderer.class)
public class FishingBobberEntityRendererMixin {
    @Inject(method = "render", at = @At("HEAD"), cancellable = true)
    private void skycore$hideFishingRod(
            FishingBobberEntityState state,
            MatrixStack matrices,
            VertexConsumerProvider vertexConsumers,
            int light,
            CallbackInfo ci
    ) {
        if (NoRenderUtil.shouldCancel(NoRenderUtil.Type.FISHING_ROD)) {
            ci.cancel();
        }
    }
}
