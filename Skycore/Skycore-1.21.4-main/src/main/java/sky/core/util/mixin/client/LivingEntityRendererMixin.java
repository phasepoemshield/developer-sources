package sky.core.util.mixin.client;

import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import sky.core.ui.tags.TagsUtil;

@Mixin(LivingEntityRenderer.class)
public abstract class LivingEntityRendererMixin {
    @Inject(method = "hasLabel", at = @At("HEAD"), cancellable = true)
    private void skycore$hideVanillaNameTag(LivingEntity entity, double squaredDistanceToCamera, CallbackInfoReturnable<Boolean> cir) {
        if (TagsUtil.shouldHideVanillaNameTag(entity)) {
            cir.setReturnValue(false);
        }
    }

    @Inject(method = "updateRenderState", at = @At("TAIL"))
    private void skycore$clearVanillaNameTag(LivingEntity entity, LivingEntityRenderState state, float tickDelta, CallbackInfo ci) {
        if (TagsUtil.shouldHideVanillaNameTag(entity)) {
            state.displayName = null;
            state.nameLabelPos = null;
        }
    }
}
