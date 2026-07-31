package sky.core.util.mixin.client;

import net.minecraft.client.render.Camera;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import sky.core.util.NoRenderUtil;

@Mixin(Camera.class)
public class CameraMixin {
    @Inject(method = "clipToSpace", at = @At("HEAD"), cancellable = true)
    private void skycore$disableCameraClip(float desiredCameraDistance, CallbackInfoReturnable<Float> cir) {
        if (NoRenderUtil.shouldCancel(NoRenderUtil.Type.CAMERA_CLIP)) {
            cir.setReturnValue(desiredCameraDistance);
        }
    }
}
