/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.render.command.OrderedRenderCommandQueue
 *  net.minecraft.client.render.entity.LivingEntityRenderer
 *  net.minecraft.client.render.entity.state.LivingEntityRenderState
 *  net.minecraft.client.render.state.CameraRenderState
 *  net.minecraft.client.util.math.MatrixStack
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.\u0623;
import oxxxde.\u0636\u0630;

@Mixin(value={LivingEntityRenderer.class})
public class MixinLivingEntityRendererBodyGlow {
    @Inject(method={"method_4054"}, at={@At(value="HEAD")})
    private void rain$submitBodyGlow(LivingEntityRenderState state, MatrixStack matrices, OrderedRenderCommandQueue collector, CameraRenderState cameraState, CallbackInfo ci) {
        int entityId = ((\u0636\u0630)state).rain$getEntityId();
        \u0623.INSTANCE.submitAura(entityId, state, matrices, collector, cameraState);
    }
}

