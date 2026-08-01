package sky.core.util.mixin.client;

import com.darkmagician6.eventapi.EventManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import sky.core.events.EventRender3D;
import sky.core.util.NoRenderUtil;
import sky.core.util.render.WorldProjectionCapture;

@Mixin(GameRenderer.class)
public class GameRendererMixin {
    @Inject(method = "renderHand", at = @At("HEAD"))
    private void skycore$captureWorldMatrices(Camera camera, float tickDelta, Matrix4f matrix4f, CallbackInfo ci) {
        WorldProjectionCapture.capture(
                new Matrix4f(RenderSystem.getProjectionMatrix()),
                new Matrix4f(matrix4f)
        );
        EventManager.call(new EventRender3D(tickDelta, new MatrixStack()));
    }

    @Inject(method = "showFloatingItem", at = @At("HEAD"), cancellable = true)
    private void skycore$hideTotem(ItemStack stack, CallbackInfo ci) {
        if (NoRenderUtil.shouldCancel(NoRenderUtil.Type.TOTEM) && stack.isOf(Items.TOTEM_OF_UNDYING)) {
            ci.cancel();
        }
    }
}
