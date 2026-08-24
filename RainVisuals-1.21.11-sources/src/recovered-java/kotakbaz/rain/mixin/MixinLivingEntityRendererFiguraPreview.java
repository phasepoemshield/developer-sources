/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.minecraft.client.model.Model
 *  net.minecraft.client.render.RenderLayer
 *  net.minecraft.client.render.command.ModelCommandRenderer$CrumblingOverlayCommand
 *  net.minecraft.client.render.command.OrderedRenderCommandQueue
 *  net.minecraft.client.render.entity.LivingEntityRenderer
 *  net.minecraft.client.render.entity.feature.FeatureRenderer
 *  net.minecraft.client.render.entity.model.BipedEntityModel$ArmPose
 *  net.minecraft.client.render.entity.state.ArmedEntityRenderState
 *  net.minecraft.client.render.entity.state.BipedEntityRenderState
 *  net.minecraft.client.render.entity.state.EntityRenderState
 *  net.minecraft.client.render.entity.state.LivingEntityRenderState
 *  net.minecraft.client.render.entity.state.PlayerEntityRenderState
 *  net.minecraft.client.texture.Sprite
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.entity.EntityPose
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.item.ItemStack
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.model.Model;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.command.ModelCommandRenderer;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.state.ArmedEntityRenderState;
import net.minecraft.client.render.entity.state.BipedEntityRenderState;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.\u0634\u0622;

@Mixin(value={LivingEntityRenderer.class})
public class MixinLivingEntityRendererFiguraPreview {
    @Inject(method={"method_62355"}, at={@At(value="TAIL")})
    private void rain$freezeFiguraPreviewState(LivingEntity entity, LivingEntityRenderState state, float tickProgress, CallbackInfo ci) {
        if (!\u0634\u0622.isRenderingPreview()) {
            return;
        }
        state.bodyYaw = 180.0f;
        state.relativeHeadYaw = 180.0f;
        state.pitch = 0.0f;
        state.age = 0.0f;
        state.deathTime = 0.0f;
        state.limbSwingAnimationProgress = 0.0f;
        state.limbSwingAmplitude = 0.0f;
        state.timeSinceLastKineticAttack = 0.0f;
        state.usingRiptide = false;
        state.hurt = false;
        state.shaking = false;
        state.touchingWater = false;
        state.pose = EntityPose.STANDING;
        state.displayName = null;
        state.nameLabelPos = null;
        state.shadowRadius = 0.0f;
        state.onFire = false;
        if (state instanceof BipedEntityRenderState) {
            BipedEntityRenderState humanoid = (BipedEntityRenderState)state;
            humanoid.leaningPitch = 0.0f;
            humanoid.limbAmplitudeInverse = 0.0f;
            humanoid.itemUseTime = 0.0f;
            humanoid.isInSneakingPose = false;
            humanoid.isGliding = false;
            humanoid.isSwimming = false;
            humanoid.hasVehicle = false;
            humanoid.isUsingItem = false;
            humanoid.equippedHeadStack = ItemStack.EMPTY;
            humanoid.equippedChestStack = ItemStack.EMPTY;
            humanoid.equippedLegsStack = ItemStack.EMPTY;
            humanoid.equippedFeetStack = ItemStack.EMPTY;
        }
        if (state instanceof ArmedEntityRenderState) {
            ArmedEntityRenderState armed = (ArmedEntityRenderState)state;
            armed.handSwingProgress = 0.0f;
            armed.rightArmPose = BipedEntityModel.ArmPose.EMPTY;
            armed.leftArmPose = BipedEntityModel.ArmPose.EMPTY;
            armed.rightHandItem = ItemStack.EMPTY;
            armed.leftHandItem = ItemStack.EMPTY;
        }
        if (state instanceof PlayerEntityRenderState) {
            PlayerEntityRenderState avatar = (PlayerEntityRenderState)state;
            avatar.stuckArrowCount = 0;
            avatar.stingerCount = 0;
            avatar.capeVisible = false;
            avatar.glidingTicks = 0.0f;
            avatar.applyFlyingRotation = false;
            avatar.flyingRotation = 0.0f;
            avatar.playerName = null;
            avatar.leftShoulderParrotVariant = null;
            avatar.rightShoulderParrotVariant = null;
        }
    }

    @WrapOperation(method={"method_4054"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_3887;method_4199(Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;ILnet/minecraft/class_10017;FF)V")})
    private void rain$skipVanillaLayersInFiguraPreview(FeatureRenderer<?, ?> instance, MatrixStack matrices, OrderedRenderCommandQueue submitter, int light, EntityRenderState state, float relativeHeadYaw, float pitch, Operation<Void> original) {
        if (\u0634\u0622.isRenderingPreview() && !instance.getClass().getName().startsWith("other.figura")) {
            return;
        }
        original.call(new Object[]{instance, matrices, submitter, light, state, Float.valueOf(relativeHeadYaw), Float.valueOf(pitch)});
    }

    @WrapOperation(method={"method_4054"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_11659;method_73490(Lnet/minecraft/class_3879;Ljava/lang/Object;Lnet/minecraft/class_4587;Lnet/minecraft/class_1921;IIILnet/minecraft/class_1058;ILnet/minecraft/class_11683$class_11792;)V")})
    private void rain$skipBaseModelInFiguraPreview(OrderedRenderCommandQueue instance, Model model, Object renderState, MatrixStack matrices, RenderLayer renderType, int light, int overlay, int color, Sprite sprite, int outlineColor, ModelCommandRenderer.CrumblingOverlayCommand crumblingOverlay, Operation<Void> original) {
        if (\u0634\u0622.isRenderingPreview()) {
            return;
        }
        original.call(new Object[]{instance, model, renderState, matrices, renderType, light, overlay, color, sprite, outlineColor, crumblingOverlay});
    }
}

