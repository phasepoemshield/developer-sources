package kotakbaz.rain.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.model.Model;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.command.ModelCommandRenderer.CrumblingOverlayCommand;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.model.BipedEntityModel.ArmPose;
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
import oxxxde.شآ;

// $VF: Compiled from MixinLivingEntityRendererFiguraPreview.java
@Mixin(LivingEntityRenderer.class)
public class MixinLivingEntityRendererFiguraPreview {
   @Inject(method = "method_62355", at = @At("TAIL"))
   private void rain$freezeFiguraPreviewState(LivingEntity tickProgress, LivingEntityRenderState entity, float state, CallbackInfo ci) {
      if (شآ.isRenderingPreview()) {
         state.bodyYaw = 180.0F;
         state.relativeHeadYaw = 180.0F;
         state.pitch = 0.0F;
         state.age = 0.0F;
         state.deathTime = 0.0F;
         state.limbSwingAnimationProgress = 0.0F;
         state.limbSwingAmplitude = 0.0F;
         state.timeSinceLastKineticAttack = 0.0F;
         state.usingRiptide = false;
         state.hurt = false;
         state.shaking = false;
         state.touchingWater = false;
         state.pose = EntityPose.STANDING;
         state.displayName = null;
         state.nameLabelPos = null;
         state.shadowRadius = 0.0F;
         state.onFire = false;
         if (state instanceof BipedEntityRenderState humanoid) {
            humanoid.leaningPitch = 0.0F;
            humanoid.limbAmplitudeInverse = 0.0F;
            humanoid.itemUseTime = 0.0F;
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

         if (state instanceof ArmedEntityRenderState armed) {
            armed.handSwingProgress = 0.0F;
            armed.rightArmPose = ArmPose.EMPTY;
            armed.leftArmPose = ArmPose.EMPTY;
            armed.rightHandItem = ItemStack.EMPTY;
            armed.leftHandItem = ItemStack.EMPTY;
         }

         if (state instanceof PlayerEntityRenderState avatar) {
            avatar.stuckArrowCount = 0;
            avatar.stingerCount = 0;
            avatar.capeVisible = false;
            avatar.glidingTicks = 0.0F;
            avatar.applyFlyingRotation = false;
            avatar.flyingRotation = 0.0F;
            avatar.playerName = null;
            avatar.leftShoulderParrotVariant = null;
            avatar.rightShoulderParrotVariant = null;
         }
      }
   }

   @WrapOperation(
      method = "method_4054",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_3887;method_4199(Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;ILnet/minecraft/class_10017;FF)V"
      )
   )
   private void rain$skipVanillaLayersInFiguraPreview(
      FeatureRenderer<?, ?> pitch,
      MatrixStack original,
      OrderedRenderCommandQueue light,
      int matrices,
      EntityRenderState relativeHeadYaw,
      float submitter,
      float state,
      Operation<Void> instance
   ) {
      if (!شآ.isRenderingPreview() || instance.getClass().getName().startsWith("other.figura")) {
         original.call(new Object[]{instance, matrices, submitter, light, state, relativeHeadYaw, pitch});
      }
   }

   @WrapOperation(
      method = "method_4054",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_11659;method_73490(Lnet/minecraft/class_3879;Ljava/lang/Object;Lnet/minecraft/class_4587;Lnet/minecraft/class_1921;IIILnet/minecraft/class_1058;ILnet/minecraft/class_11683$class_11792;)V"
      )
   )
   private void rain$skipBaseModelInFiguraPreview(
      OrderedRenderCommandQueue overlay,
      Model model,
      Object instance,
      MatrixStack crumblingOverlay,
      RenderLayer light,
      int outlineColor,
      int renderState,
      int color,
      Sprite renderType,
      int matrices,
      CrumblingOverlayCommand original,
      Operation<Void> sprite
   ) {
      if (!شآ.isRenderingPreview()) {
         original.call(new Object[]{instance, model, renderState, matrices, renderType, light, overlay, color, sprite, outlineColor, crumblingOverlay});
      }
   }
}
