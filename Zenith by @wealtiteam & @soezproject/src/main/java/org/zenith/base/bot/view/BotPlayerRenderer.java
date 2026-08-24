package org.zenith.base.bot.view;

import org.zenith.module.Bot;
import org.zenith.util.Item;

import org.zenith.base.bot.net.BotPlayHandler;
import org.zenith.utility.mixin.accessors.EntityRenderDispatcherAccessor;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.BlockPosEntry;
import org.zenith.core.HudPreviewItem;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;














import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.BipedEntityRenderer;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.model.BipedEntityModel.ArmPose;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.util.DefaultSkinHelper;
import net.minecraft.client.util.SkinTextures;
import net.minecraft.client.util.SkinTextures.Model;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EntityAttachmentType;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerModelPart;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.consume.UseAction;
import net.minecraft.util.Arm;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;

final class BotPlayerRenderer {
   public final PlayerEntityRenderState state = new PlayerEntityRenderState();

   BotPlayerRenderer() {
   }

   static PlayerEntityRenderer rendererFor(Model var0) {
      EntityRenderDispatcherAccessor entityrenderdispatcheraccessor = (EntityRenderDispatcherAccessor)MinecraftClient.getInstance().getEntityRenderDispatcher();
      EntityRenderer entityrenderer = entityrenderdispatcheraccessor.zenith_getModelRenderers().get(var0);
      if (entityrenderer == null) {
         entityrenderer = entityrenderdispatcheraccessor.zenith_getModelRenderers().get(Model.WIDE);
      }

      return entityrenderer instanceof PlayerEntityRenderer playerentityrenderer ? playerentityrenderer : null;
   }

   void render(
      PlayerEntity var1,
      BotPlayHandler var2,
      double var3,
      double var5,
      double var7,
      float var9,
      MatrixStack var10,
      VertexConsumerProvider var11,
      int var12,
      boolean var13
   ) {
      SkinTextures skintextures = resolveSkin(var1, var2);
      PlayerEntityRenderer playerentityrenderer = rendererFor(skintextures.model());
      if (playerentityrenderer != null) {
         this.fillState(var1, skintextures, var9, var3, var5, var7, var13);
         double d0 = MathHelper.lerp((double)var9, var1.lastRenderX, var1.getX());
         double d1 = MathHelper.lerp((double)var9, var1.lastRenderY, var1.getY());
         double d2 = MathHelper.lerp((double)var9, var1.lastRenderZ, var1.getZ());
         var10.push();
         var10.translate(d0 - var3, d1 - var5, d2 - var7);
         playerentityrenderer.render(this.state, var10, var11, var12);
         var10.pop();
      }
   }

   static SkinTextures resolveSkin(PlayerEntity var0, BotPlayHandler var1) {
      if (var1 != null) {
         PlayerListEntry playerlistentry = var1.getPlayerListEntry(var0.getUuid());
         if (playerlistentry != null) {
            try {
               return playerlistentry.getSkinTextures();
            } catch (Exception exception) {
            }
         }
      }

      return DefaultSkinHelper.getSkinTextures(var0.getUuid());
   }

   public void fillState(PlayerEntity var1, SkinTextures var2, float var3, double var4, double var6, double var8, boolean var10) {
      this.state.x = MathHelper.lerp((double)var3, var1.lastRenderX, var1.getX());
      this.state.y = MathHelper.lerp((double)var3, var1.lastRenderY, var1.getY());
      this.state.z = MathHelper.lerp((double)var3, var1.lastRenderZ, var1.getZ());
      this.state.invisible = var1.isInvisible();
      this.state.age = (float)var1.age + var3;
      this.state.width = var1.getWidth();
      this.state.height = var1.getHeight();
      this.state.standingEyeHeight = var1.getStandingEyeHeight();
      this.state.positionOffset = null;
      this.state.squaredDistanceToCamera = MathHelper.squaredMagnitude(this.state.x - var4, this.state.y - var6, this.state.z - var8);
      this.state.sneaking = var1.isSneaky();
      this.state.onFire = var1.doesRenderOnFire();
      this.state.leashData = null;
      if (var10 && this.state.squaredDistanceToCamera < 4096.0) {
         this.state.displayName = var1.getDisplayName();
         this.state.nameLabelPos = var1.getAttachments().getPointNullable(EntityAttachmentType.NAME_TAG, 0, var1.getLerpedYaw(var3));
      } else {
         this.state.displayName = null;
         this.state.nameLabelPos = null;
      }

      float f = MathHelper.lerpAngleDegrees(var3, var1.prevHeadYaw, var1.headYaw);
      this.state.bodyYaw = MathHelper.lerpAngleDegrees(var3, var1.prevBodyYaw, var1.bodyYaw);
      this.state.yawDegrees = MathHelper.wrapDegrees(f - this.state.bodyYaw);
      this.state.pitch = var1.getLerpedPitch(var3);
      this.state.customName = var1.getCustomName();
      this.state.flipUpsideDown = false;
      if (!var1.hasVehicle() && var1.isAlive()) {
         this.state.limbFrequency = var1.limbAnimator.getPos(var3);
         this.state.limbAmplitudeMultiplier = var1.limbAnimator.getSpeed(var3);
      } else {
         this.state.limbFrequency = 0.0F;
         this.state.limbAmplitudeMultiplier = 0.0F;
      }

      this.state.headItemAnimationProgress = this.state.limbFrequency;
      this.state.baseScale = var1.getScale();
      this.state.ageScale = var1.getScaleFactor();
      this.state.pose = var1.getPose();
      this.state.sleepingDirection = var1.getSleepingDirection();
      if (this.state.sleepingDirection != null) {
         this.state.standingEyeHeight = var1.getEyeHeight(EntityPose.STANDING);
      }

      this.state.shaking = var1.isFrozen();
      this.state.baby = var1.isBaby();
      this.state.touchingWater = var1.isTouchingWater();
      this.state.usingRiptide = var1.isUsingRiptide();
      this.state.hurt = var1.hurtTime > 0 || var1.deathTime > 0;
      this.state.wearingSkullType = null;
      this.state.wearingSkullProfile = null;
      this.state.headItemRenderState.clear();
      this.state.deathTime = var1.deathTime > 0 ? (float)var1.deathTime + var3 : 0.0F;
      this.state.invisibleToPlayer = false;
      this.state.hasOutline = false;
      BipedEntityRenderer.updateBipedRenderState(var1, this.state, var3, MinecraftClient.getInstance().getItemModelManager());
      this.state.leftArmPose = getArmPose(var1, Arm.LEFT);
      this.state.rightArmPose = getArmPose(var1, Arm.RIGHT);
      this.state.skinTextures = var2;
      this.state.stuckArrowCount = var1.getStuckArrowCount();
      this.state.stingerCount = var1.getStingerCount();
      this.state.itemUseTimeLeft = var1.getItemUseTimeLeft();
      this.state.handSwinging = var1.handSwinging;
      this.state.spectator = var1.isSpectator();
      this.state.hatVisible = var1.isPartVisible(PlayerModelPart.HAT);
      this.state.jacketVisible = var1.isPartVisible(PlayerModelPart.JACKET);
      this.state.leftPantsLegVisible = var1.isPartVisible(PlayerModelPart.LEFT_PANTS_LEG);
      this.state.rightPantsLegVisible = var1.isPartVisible(PlayerModelPart.RIGHT_PANTS_LEG);
      this.state.leftSleeveVisible = var1.isPartVisible(PlayerModelPart.LEFT_SLEEVE);
      this.state.rightSleeveVisible = var1.isPartVisible(PlayerModelPart.RIGHT_SLEEVE);
      this.state.capeVisible = false;
      this.state.glidingTicks = 0.0F;
      this.state.applyFlyingRotation = false;
      this.state.flyingRotation = 0.0F;
      this.state.playerName = null;
      this.state.leftShoulderParrotVariant = null;
      this.state.rightShoulderParrotVariant = null;
      this.state.id = var1.getId();
      this.state.name = var1.getGameProfile().getName();
      this.state.spyglassState.clear();
   }

   public static ArmPose getArmPose(PlayerEntity var0, Arm var1) {
      ArmPose armpose = getArmPose(var0, var0.getStackInHand(Hand.MAIN_HAND), Hand.MAIN_HAND);
      ArmPose armpose1 = getArmPose(var0, var0.getStackInHand(Hand.OFF_HAND), Hand.OFF_HAND);
      if (armpose.isTwoHanded()) {
         armpose1 = var0.getStackInHand(Hand.OFF_HAND).isEmpty() ? ArmPose.EMPTY : ArmPose.ITEM;
      }

      return var0.getMainArm() == var1 ? armpose : armpose1;
   }

   public static ArmPose getArmPose(PlayerEntity var0, ItemStack var1, Hand var2) {
      if (var1.isEmpty()) {
         return ArmPose.EMPTY;
      } else {
         if (var0.getActiveHand() == var2 && var0.getItemUseTimeLeft() > 0) {
            UseAction useaction = var1.getUseAction();
            switch (useaction) {
               case BLOCK:
                  return ArmPose.BLOCK;
               case BOW:
                  return ArmPose.BOW_AND_ARROW;
               case SPEAR:
                  return ArmPose.THROW_SPEAR;
               case CROSSBOW:
                  return ArmPose.CROSSBOW_CHARGE;
               case SPYGLASS:
                  return ArmPose.SPYGLASS;
               case TOOT_HORN:
                  return ArmPose.TOOT_HORN;
               case BRUSH:
                  return ArmPose.BRUSH;
            }
         } else if (!var0.handSwinging && var1.isOf(Items.CROSSBOW) && CrossbowItem.isCharged(var1)) {
            return ArmPose.CROSSBOW_HOLD;
         }

         return ArmPose.ITEM;
      }
   }
}
