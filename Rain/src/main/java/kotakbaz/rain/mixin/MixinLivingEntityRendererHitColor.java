/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import kotakbaz.rain.client.render.hitcolor.A;
import kotakbaz.rain.client.render.hitcolor.a_0;
import kotakbaz.rain.module.modules.render.HitColorModule;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={LivingEntityRenderer.class})
public abstract class MixinLivingEntityRendererHitColor {
    @Unique
    private int rain$currentEntityId = Integer.MIN_VALUE;

    @Shadow
    protected abstract float method_23185(LivingEntityRenderState var1);

    @Shadow
    public static int method_23622(LivingEntityRenderState state2, float whiteOverlayProgress) {
        throw new AssertionError();
    }

    @Inject(method={"method_62355"}, at={@At(value="TAIL")})
    private void rain$captureEntityId(LivingEntity entity, LivingEntityRenderState state2, float tickProgress, CallbackInfo ci) {
        ((a_0)state2).rain$setEntityId(entity.getId());
    }

    @Inject(method={"method_4054"}, at={@At(value="HEAD")})
    private void rain$beginRender(LivingEntityRenderState state2, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, CallbackInfo ci) {
        this.rain$currentEntityId = ((a_0)state2).rain$getEntityId();
    }

    @Inject(method={"method_4054"}, at={@At(value="RETURN")})
    private void rain$endRender(LivingEntityRenderState state2, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, CallbackInfo ci) {
        this.rain$currentEntityId = Integer.MIN_VALUE;
    }

    @ModifyArg(method={"method_4054"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_583;method_62100(Lnet/minecraft/class_4587;Lnet/minecraft/class_4588;III)V"), index=3)
    private int rain$replaceEntityOverlay(int overlay) {
        return HitColorModule.INSTANCE.resolveOverlay(this.rain$currentEntityId, overlay);
    }

    @WrapOperation(method={"method_4054"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_3887;method_4199(Lnet/minecraft/class_4587;Lnet/minecraft/class_4597;ILnet/minecraft/class_10017;FF)V")})
    private void rain$passOverlayToEveryFeature(FeatureRenderer<?, ?> instance, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, EntityRenderState state2, float relativeHeadYaw, float pitch, Operation<Void> original, LivingEntityRenderState livingState) {
        if (instance instanceof A) {
            A overlayAware = (A)instance;
            int overlay = MixinLivingEntityRendererHitColor.method_23622(livingState, this.method_23185(livingState));
            overlayAware.rain$setOverlayCoords(HitColorModule.INSTANCE.resolveOverlay(this.rain$currentEntityId, overlay));
        }
        original.call(new Object[]{instance, matrices, vertexConsumers, light, state2, Float.valueOf(relativeHeadYaw), Float.valueOf(pitch)});
    }
}

