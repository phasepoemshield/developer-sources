package org.zenith.utility.mixin.render;

import org.zenith.module.GrimGlide;
import org.zenith.module.GuiWalk;
import org.zenith.module.Module;
import org.zenith.module.Strafe;
import org.zenith.module.Timer;
import org.zenith.module.Velocity;
import org.zenith.module.WallBypass;

import org.zenith.module.Speed;

import org.zenith.event.EventPosHook;
import org.zenith.event.SprintEvent;

import org.zenith.event.EventPosHook;
import org.zenith.rotation.Rotation;
import org.zenith.module.Speed;
import org.zenith.event.SprintEvent;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;














import com.darkmagician6.eventapi.EventManager;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.Camera;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityPose;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos.Mutable;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Camera.class})
public abstract class MixinCamera {
   @Shadow
   public Vec3d field_18712;
   @Shadow
   public Entity field_18711;
   @Shadow
   @Final
   public Mutable field_18713;
   @Shadow
   public float field_18718;
   @Shadow
   public float field_18717;
   @Shadow
   public float field_18721;
   @Shadow
   public float field_18722;

   public MixinCamera() {
   }

   @Shadow
   protected abstract void method_19325(float var1, float var2);

   @Shadow
   protected abstract void method_19324(float var1, float var2, float var3);

   @Shadow
   protected abstract float method_19318(float var1);

   @Inject(
      method = {"updateEyeHeight"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void zenith_keepStandingCameraHeight(CallbackInfo var1) {
      if (this.field_18711 instanceof ClientPlayerEntity clientplayerentity
         && clientplayerentity == MinecraftClient.getInstance().player
         && Speed.speed11.isEnabled()
         && Speed.speed11.call016()) {
         float f = clientplayerentity.getEyeHeight(EntityPose.STANDING);
         this.field_18721 = f;
         this.field_18722 = f;
         var1.cancel();
      }
   }

   @Inject(
      method = {"update"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/Camera;setPos(DDD)V",
         shift = Shift.AFTER
      )},
      cancellable = true
   )
   public void updateHook(BlockView var1, Entity var2, boolean var3, boolean var4, float var5, CallbackInfo var6) {
      SprintEvent ll1l1ii1ll1li1il = new SprintEvent(false, 4.0F, new Rotation(this.field_18718, this.field_18717));
      EventManager.call(ll1l1ii1ll1li1il);
      Rotation ililiiili1ll1li11 = ll1l1ii1ll1li1il.Velocity();
      if (ll1l1ii1ll1li1il.isCancelled() && var2 instanceof ClientPlayerEntity clientplayerentity && !clientplayerentity.isSleeping() && var3) {
         float f = var4 ? -ililiiili1ll1li11.GuiWalk() : ililiiili1ll1li11.GuiWalk();
         float f1 = ililiiili1ll1li11.GrimGlide() - (float)(var4 ? 180 : 0);
         float f2 = ll1l1ii1ll1li1il.Timer();
         this.method_19325(f1, f);
         this.method_19324(ll1l1ii1ll1li1il.Strafe() ? -f2 : -this.method_19318(f2), 0.0F, 0.0F);
         var6.cancel();
      }
   }

   @Inject(
      method = {"setPos(Lnet/minecraft/util/math/Vec3d;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void posHook(Vec3d var1, CallbackInfo var2) {
      EventPosHook ii1iiiii1ll1iiil1li1l1iili1i = new EventPosHook(var1);
      EventManager.call(ii1iiiii1ll1iiil1li1l1iili1i);
      this.field_18712 = var1 = ii1iiiii1ll1iiil1li1l1iili1i.WallBypass();
      this.field_18713.set(var1.x, var1.y, var1.z);
      var2.cancel();
   }
}
