/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.RenderTweaksModule;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.MobEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={WorldRenderer.class})
public class MixinWorldRendererHideMobs {
    @Inject(method={"method_22977"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$hideMobs(Entity entity, double cameraX, double cameraY, double cameraZ, float tickProgress, MatrixStack matrices, VertexConsumerProvider vertexConsumers, CallbackInfo ci) {
        if (!RenderTweaksModule.INSTANCE.isEnabled()) {
            return;
        }
        if (((Boolean)RenderTweaksModule.INSTANCE.getHideMobs().getValue()).booleanValue() && entity instanceof MobEntity) {
            ci.cancel();
        }
    }
}

