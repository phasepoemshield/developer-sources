/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.minecraft.client.render.command.OrderedRenderCommandQueue
 *  net.minecraft.client.render.entity.LivingEntityRenderer
 *  net.minecraft.client.render.entity.feature.FeatureRenderer
 *  net.minecraft.client.render.entity.state.EntityRenderState
 *  net.minecraft.client.render.entity.state.LivingEntityRenderState
 *  net.minecraft.client.render.state.CameraRenderState
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.entity.LivingEntity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.\u0628\u0627;
import oxxxde.\u0631\u0625;
import oxxxde.\u0635\u064b;
import oxxxde.\u0636\u0630;

@Mixin(value={LivingEntityRenderer.class})
public abstract class MixinLivingEntityRendererHitColor {
    @Unique
    private int rain$currentEntityId = Integer.MIN_VALUE;

    @Inject(method={"method_4054"}, at={@At(value="HEAD")})
    private void rain$beginRender(LivingEntityRenderState state, MatrixStack matrices, OrderedRenderCommandQueue submitter, CameraRenderState cameraState, CallbackInfo ci) {
        this.rain$currentEntityId = ((\u0636\u0630)state).rain$getEntityId();
    }

    @Shadow
    public static int getOverlay(LivingEntityRenderState state, float whiteOverlayProgress) {
        throw new AssertionError();
    }

    @ModifyArg(method={"method_4054"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_11659;method_73490(Lnet/minecraft/class_3879;Ljava/lang/Object;Lnet/minecraft/class_4587;Lnet/minecraft/class_1921;IIILnet/minecraft/class_1058;ILnet/minecraft/class_11683$class_11792;)V"), index=5)
    private int rain$replaceEntityOverlay(int overlay) {
        return \u0631\u0625.INSTANCE.resolveOverlay(this.rain$currentEntityId, overlay);
    }

    @Inject(method={"method_62355"}, at={@At(value="TAIL")})
    private void rain$captureEntityId(LivingEntity entity, LivingEntityRenderState state, float tickProgress, CallbackInfo ci) {
        ((\u0636\u0630)state).rain$setEntityId(entity.getId());
    }

    @Shadow
    protected abstract float getAnimationCounter(LivingEntityRenderState var1);

    @Inject(method={"method_4054"}, at={@At(value="RETURN")})
    private void rain$endRender(LivingEntityRenderState state, MatrixStack matrices, OrderedRenderCommandQueue submitter, CameraRenderState cameraState, CallbackInfo ci) {
        this.rain$currentEntityId = Integer.MIN_VALUE;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @WrapOperation(method={"method_4054"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_3887;method_4199(Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;ILnet/minecraft/class_10017;FF)V")})
    private void rain$passOverlayToEveryFeature(FeatureRenderer<?, ?> instance, MatrixStack matrices, OrderedRenderCommandQueue submitter, int light, EntityRenderState state, float relativeHeadYaw, float pitch, Operation<Void> original, LivingEntityRenderState livingState) {
        boolean previousArmorOverlayActive = \u0628\u0627.isArmorOverlayActive();
        int previousArmorOverlay = \u0628\u0627.getArmorOverlay();
        int overlay = MixinLivingEntityRendererHitColor.getOverlay(livingState, this.getAnimationCounter(livingState));
        int resolvedOverlay = \u0631\u0625.INSTANCE.resolveOverlay(this.rain$currentEntityId, overlay);
        if (instance instanceof \u0635\u064b) {
            \u0635\u064b overlayAware = (\u0635\u064b)instance;
            overlayAware.rain$setOverlayCoords(resolvedOverlay);
        }
        \u0628\u0627.setArmorOverlay(resolvedOverlay);
        try {
            original.call(new Object[]{instance, matrices, submitter, light, state, Float.valueOf(relativeHeadYaw), Float.valueOf(pitch)});
        }
        finally {
            \u0628\u0627.restoreArmorOverlay(previousArmorOverlayActive, previousArmorOverlay);
        }
    }
}

