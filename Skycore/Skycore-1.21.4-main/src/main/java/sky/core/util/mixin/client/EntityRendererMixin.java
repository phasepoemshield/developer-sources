package sky.core.util.mixin.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.state.ArmorStandEntityRenderState;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import sky.core.ui.tags.TagsUtil;
import sky.core.util.NoRenderUtil;

@Mixin(EntityRenderer.class)
public class EntityRendererMixin {
    @Inject(method = "hasLabel", at = @At("HEAD"), cancellable = true)
    private void skycore$hideVanillaNameTag(Entity entity, double squaredDistanceToCamera, CallbackInfoReturnable<Boolean> cir) {
        if (TagsUtil.shouldHideVanillaNameTag(entity)) {
            cir.setReturnValue(false);
        }
    }

    @Inject(method = "updateRenderState", at = @At("TAIL"))
    private void skycore$clearVanillaNameTag(Entity entity, EntityRenderState state, float tickDelta, CallbackInfo ci) {
        if (TagsUtil.shouldHideVanillaNameTag(entity)) {
            state.displayName = null;
            state.nameLabelPos = null;
        }
    }

    @Inject(method = "renderLabelIfPresent", at = @At("HEAD"), cancellable = true)
    private void skycore$hideHolograms(
            EntityRenderState state,
            Text text,
            MatrixStack matrices,
            VertexConsumerProvider vertexConsumers,
            int light,
            CallbackInfo ci
    ) {
        if (state instanceof ArmorStandEntityRenderState
                && NoRenderUtil.shouldCancel(NoRenderUtil.Type.HOLOGRAMS)) {
            ci.cancel();
        }
    }
}
