package sky.core.util.mixin.client;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import sky.core.module.impl.combat.HitBoxModule;
import sky.core.util.NoRenderUtil;

@Mixin(Entity.class)
public abstract class EntityMixin {
    @Inject(method = "getTargetingMargin", at = @At("HEAD"), cancellable = true)
    private void skycore$expandHitBox(CallbackInfoReturnable<Float> cir) {
        Entity self = (Entity) (Object) this;
        if (!(self instanceof LivingEntity)) {
            return;
        }

        HitBoxModule module = HitBoxModule.INSTANCE;
        if (!module.isEnabled()) {
            return;
        }

        cir.setReturnValue(module.size.get());
    }

    @Inject(method = "isGlowing", at = @At("HEAD"), cancellable = true)
    private void skycore$hideGlow(CallbackInfoReturnable<Boolean> cir) {
        if (NoRenderUtil.shouldCancel(NoRenderUtil.Type.GLOWING)) {
            cir.setReturnValue(false);
        }
    }
}
