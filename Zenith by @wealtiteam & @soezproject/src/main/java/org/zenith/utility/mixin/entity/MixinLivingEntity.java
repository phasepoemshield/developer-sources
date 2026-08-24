package org.zenith.utility.mixin.entity;

import org.zenith.core.CloudRouter;
import org.zenith.module.GrimGlide;
import org.zenith.module.GuiWalk;
import org.zenith.module.Module;

import org.zenith.module.Aura_Var159;

import org.zenith.module.SwingAnimation;

import org.zenith.event.EventDead;
import org.zenith.event.EventPushOutOfBlocks;
import org.zenith.event.EventReplaceMovePacketPitche3;

import org.zenith.module.Aura_Var159;
import org.zenith.event.Event36_Var159;
import org.zenith.event.EventDead;
import org.zenith.event.EventPushOutOfBlocks;
import org.zenith.event.EventReplaceMovePacketPitche3;
import org.zenith.ZenithClient;
import org.zenith.rotation.Rotation;
import org.zenith.module.SwingAnimation;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.ClickFxController;
import org.zenith.core.ClientProvider;
import org.zenith.core.CloudResult;















import com.darkmagician6.eventapi.EventManager;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({LivingEntity.class})
public class MixinLivingEntity implements ClientProvider, CloudResult {
   @Unique
   float safeYaw = 0.0F;
   @Unique
   float safePitch = 0.0F;
   @Unique
   boolean zenith$rotationSpoofed = false;
   @Shadow
   protected double field_6224;
   @Shadow
   protected double field_6245;
   @Shadow
   protected double field_6263;
   @Unique
   public List<Aura_Var159> positonHistory = new ArrayList<>();
   @Unique
   double prevServerX;
   @Unique
   double prevServerY;
   @Unique
   double prevServerZ;

   public MixinLivingEntity() {
   }

   @Inject(
      method = {"jump"},
      at = {@At("RETURN")}
   )
   public void replaceMovePacketPitche3(CallbackInfo var1) {
      MinecraftClient client = MinecraftClient.getInstance();
      if (client != null && client.player != null && (Object)this == client.player) {
         EventManager.call(new EventReplaceMovePacketPitche3());
      }
   }

   @ModifyVariable(
      method = {"jump"},
      at = @At("STORE"),
      ordinal = 1
   )
   public float hookJumpSprintRadians(float var1) {
      MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
      if (minecraftClient3 == null || minecraftClient3.player == null || (Object)this != minecraftClient3.player) {
         return var1;
      } else {
         Rotation ililiiili1ll1li11 = ZenithClient.on23().CloudRouter().ZClass092();
         return ililiiili1ll1li11 == null ? var1 : ililiiili1ll1li11.GrimGlide() * (float) (Math.PI / 180.0);
      }
   }

   @Inject(
      method = {"tickMovement"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/LivingEntity;travel(Lnet/minecraft/util/math/Vec3d;)V",
         shift = Shift.AFTER
      )}
   )
   public void gownso(CallbackInfo var1) {
      MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
      if (this.zenith$rotationSpoofed
         && minecraftClient3 != null
         && minecraftClient3.player != null
         && (Object)this == minecraftClient3.player) {
         this.zenith$rotationSpoofed = false;
         minecraftClient3.player.setYaw(this.safeYaw);
         minecraftClient3.player.setPitch(this.safePitch);
      }
   }

   @Inject(
      method = {"tickMovement"},
      at = {@At("RETURN")}
   )
   public void zenith_restoreRotationAfterTickMovement(CallbackInfo var1) {
      MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
      if (this.zenith$rotationSpoofed
         && minecraftClient3 != null
         && minecraftClient3.player != null
         && (Object)this == minecraftClient3.player) {
         this.zenith$rotationSpoofed = false;
         minecraftClient3.player.setYaw(this.safeYaw);
         minecraftClient3.player.setPitch(this.safePitch);
      }
   }

   @Inject(
      method = {"tickMovement"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/LivingEntity;travel(Lnet/minecraft/util/math/Vec3d;)V"
      )}
   )
   public void replaceMo(CallbackInfo var1) {
      MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
      if (minecraftClient3 != null
         && minecraftClient3.player != null
         && (Object)this == minecraftClient3.player
         && ZenithClient.on23().CloudRouter().ZClass092() != null
         && ZenithClient.on23().CloudRouter().list49() != null) {
         Rotation ililiiili1ll1li11 = ZenithClient.on23().CloudRouter().ZClass092();
         this.safeYaw = minecraftClient3.player.getYaw();
         this.safePitch = minecraftClient3.player.getPitch();
         this.zenith$rotationSpoofed = true;
         minecraftClient3.player.setYaw(ililiiili1ll1li11.GrimGlide());
         minecraftClient3.player.setPitch(ililiiili1ll1li11.GuiWalk());
      }
   }

   @ModifyExpressionValue(
      method = {"calcGlidingVelocity"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/LivingEntity;getPitch()F"
      )}
   )
   public float hookModifyFallFlyingPitch(float var1) {
      if ((Object)this != MinecraftClient.getInstance().player) {
         return var1;
      } else {
         Rotation ililiiili1ll1li11 = ZenithClient.on23().CloudRouter().ZClass092();
         return ililiiili1ll1li11 == null ? var1 : ililiiili1ll1li11.GuiWalk();
      }
   }

   @ModifyExpressionValue(
      method = {"calcGlidingVelocity"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/LivingEntity;getRotationVector()Lnet/minecraft/util/math/Vec3d;"
      )}
   )
   public Vec3d hookModifyFallFlyingRotationVector(Vec3d var1) {
      if ((Object)this != MinecraftClient.getInstance().player) {
         return var1;
      } else {
         Rotation ililiiili1ll1li11 = ZenithClient.on23().CloudRouter().ZClass092();
         return ililiiili1ll1li11 == null ? var1 : ililiiili1ll1li11.int202();
      }
   }

   @ModifyConstant(
      method = {"getHandSwingDuration()I"},
      constant = {@Constant(
         intValue = 6
      )}
   )
   public int modifySwingDuration(int var1) {
      SwingAnimation ill11li1lilllil = SwingAnimation.swingAnimation;
      return (Object)this == MinecraftClient.getInstance().player && ill11li1lilllil.isEnabled()
         ? (int)ill11li1lilllil.swingPower.getCurrent()
         : var1;
   }

   @Inject(
      method = {"onDeath(Lnet/minecraft/entity/damage/DamageSource;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void onDead(DamageSource var1, CallbackInfo var2) {
      EventManager.call(new EventDead((LivingEntity)(Object)this));
   }

   @Inject(
      method = {"isPushable"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void isPushable(CallbackInfoReturnable<Boolean> var1) {
      EventPushOutOfBlocks li1liiliill1 = new EventPushOutOfBlocks(Event36_Var159.call132);
      EventManager.call(li1liiliill1);
      if (li1liiliill1.isCancelled()) {
         var1.setReturnValue(false);
      }
   }

   @Override
   public List<Aura_Var159> zenithDLC_getPositionHistory() {
      return this.positonHistory;
   }

   @Override
   public double zenithDLC_getPrevServerX() {
      return this.prevServerX;
   }

   @Override
   public double zenithDLC_getPrevServerY() {
      return this.prevServerY;
   }

   @Override
   public double zenithDLC_getPrevServerZ() {
      return this.prevServerZ;
   }

   @Inject(
      method = {"updateTrackedPositionAndAngles"},
      at = {@At("HEAD")}
   )
   public void updateTrackedPositionAndAnglesHook(double var1, double var3, double var5, float var7, float var8, int var9, CallbackInfo var10) {
      this.prevServerX = this.field_6224;
      this.prevServerY = this.field_6245;
      this.prevServerZ = this.field_6263;
      this.positonHistory.addFirst(new Aura_Var159(this.field_6224, this.field_6245, this.field_6263));
      this.positonHistory.removeIf(Aura_Var159::var11810);
   }
}
