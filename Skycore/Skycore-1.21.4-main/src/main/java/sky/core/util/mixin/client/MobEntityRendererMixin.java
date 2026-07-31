package sky.core.util.mixin.client;

import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.entity.mob.MobEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import sky.core.ui.tags.TagsUtil;

@Mixin(MobEntityRenderer.class)
public abstract class MobEntityRendererMixin {
    @Inject(method = "hasLabel", at = @At("HEAD"), cancellable = true)
    private void skycore$hideVanillaNameTag(MobEntity entity, double squaredDistanceToCamera, CallbackInfoReturnable<Boolean> cir) {
        if (TagsUtil.shouldHideVanillaNameTag(entity)) {
            cir.setReturnValue(false);
        }
    }
}
