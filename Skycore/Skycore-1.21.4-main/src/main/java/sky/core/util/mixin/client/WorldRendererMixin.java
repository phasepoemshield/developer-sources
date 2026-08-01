package sky.core.util.mixin.client;

import net.minecraft.client.render.FrameGraphBuilder;
import net.minecraft.client.render.Fog;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import sky.core.util.NoRenderUtil;

@Mixin(WorldRenderer.class)
public class WorldRendererMixin {
    @Inject(method = "renderWeather", at = @At("HEAD"), cancellable = true)
    private void skycore$hideRain(FrameGraphBuilder frameGraphBuilder, Vec3d pos, float tickDelta, Fog fog, CallbackInfo ci) {
        if (NoRenderUtil.shouldCancel(NoRenderUtil.Type.RAIN)) {
            ci.cancel();
        }
    }
}
