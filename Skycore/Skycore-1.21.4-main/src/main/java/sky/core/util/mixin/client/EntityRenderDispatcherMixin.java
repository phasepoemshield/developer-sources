package sky.core.util.mixin.client;

import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexRendering;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import sky.core.module.impl.combat.HitBoxModule;
import sky.core.util.NoRenderUtil;

@Mixin(EntityRenderDispatcher.class)
public class EntityRenderDispatcherMixin {
    @Inject(method = "renderHitbox", at = @At("HEAD"), cancellable = true)
    private static void skycore$renderExpandedHitbox(
            MatrixStack matrices,
            VertexConsumer vertices,
            Entity entity,
            float tickDelta,
            float red,
            float green,
            float blue,
            CallbackInfo ci
    ) {
        HitBoxModule module = HitBoxModule.INSTANCE;
        if (!(entity instanceof LivingEntity) || !module.shouldShowHitBox()) {
            return;
        }

        float halfWidth = entity.getWidth() / 2.0F + module.size.get();
        VertexRendering.drawBox(
                matrices,
                vertices,
                -halfWidth,
                0.0D,
                -halfWidth,
                halfWidth,
                entity.getHeight(),
                halfWidth,
                red,
                green,
                blue,
                1.0F
        );
        ci.cancel();
    }

    @Inject(method = "renderShadow", at = @At("HEAD"), cancellable = true)
    private static void skycore$hideShadows(
            MatrixStack matrices,
            VertexConsumerProvider vertexConsumers,
            EntityRenderState renderState,
            float opacity,
            float tickDelta,
            net.minecraft.world.WorldView world,
            float radius,
            CallbackInfo ci
    ) {
        if (NoRenderUtil.shouldCancel(NoRenderUtil.Type.SHADOWS)) {
            ci.cancel();
        }
    }
}
