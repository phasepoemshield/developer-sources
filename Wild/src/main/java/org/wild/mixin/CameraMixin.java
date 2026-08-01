package org.wild.mixin;

import net.minecraft.client.render.Camera;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.Animations;
import ru.metaculture.protection.Event;
import ru.metaculture.protection.EventManager;
import ru.metaculture.protection.FreeCamera;
import ru.metaculture.protection.O0000000O0000O;
import ru.metaculture.protection.O0000000O0OOOO;
import ru.metaculture.protection.WildClient;

@Mixin({Camera.class})
public abstract class CameraMixin {
   @Unique
   private O0000000O0OOOO rotationEvent;
   @Unique
   private float originalYaw;
   @Unique
   private float originalPitch;
   @Unique
   private boolean disableClip;
   @Unique
   private float freeCameraTickProgress;

   @Shadow
   protected abstract void setRotation(float f, float g);

   @Shadow
   protected abstract void moveBy(float f, float g, float h);

   @Shadow
   protected abstract void setPos(Vec3d vec3d);

   @Inject(
      method = {"update"},
      at = {@At("HEAD")}
   )
   private void onUpdateHead(BlockView blockView, Entity entity, boolean bl, boolean bl2, float f, CallbackInfo callbackInfo) {
      this.freeCameraTickProgress = f;
      O0000000O0000O var7 = new O0000000O0000O();
      EventManager.O00000000((Event)var7);
      this.disableClip = var7.O00000000();
      if (entity != null) {
         this.originalYaw = entity.getYaw(f);
         this.originalPitch = entity.getPitch(f);
         this.rotationEvent = new O0000000O0OOOO(this.originalYaw, this.originalPitch, f);
         EventManager.O00000000((Event)(Object)this.rotationEvent);
      } else {
         this.rotationEvent = null;
      }
   }

   @Redirect(
      method = {"update"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/Camera;setRotation(FF)V"
      )
   )
   private void redirectSetRotation(Camera camera, float f, float g) {
      boolean var4 = this.rotationEvent != null
         && (this.rotationEvent.O0000000000() != this.originalYaw || this.rotationEvent.O00000000000() != this.originalPitch);
      float var5 = var4 ? this.rotationEvent.O0000000000() : this.originalYaw;
      float var6 = var4 ? this.rotationEvent.O00000000000() : this.originalPitch;
      Animations var7 = this.wild$getAnimations();
      if (var7 != null && var7.O0000000000000 && var7.O000000000O.O000000000("F5") && var7.O000000000OO0O()) {
         if (var7.O000000000OOO0()) {
            this.setRotation(var5 + var7.O000000000OOOO(), var7.O00000000(var6));
            return;
         }

         if (var7.O000000000OOO() && this.wild$isInverseRotationCall(f, g)) {
            this.setRotation(var5 + var7.O000000000OOOO(), var7.O00000000(var6));
            return;
         }
      }

      if (var4) {
         this.setRotation(var5, var6);
      } else {
         this.setRotation(f, g);
      }
   }

   @Inject(
      method = {"update"},
      at = {@At("RETURN")}
   )
   private void onUpdateReturn(CallbackInfo callbackInfo) {
      Animations var2 = this.wild$getAnimations();
      if (var2 != null && var2.O0000000000000 && var2.O000000000O.O000000000("F5") && var2.O000000000OO00()) {
         float var3 = this.originalYaw + var2.O00000000O();
         float var4 = var2.O000000000(this.originalPitch);
         float var5 = 4.0F * var2.O00000000O0();
         this.setRotation(var3, var4);
         if (var5 > 0.001F) {
            this.moveBy(-var5, 0.0F, 0.0F);
         }
      }

      FreeCamera var6 = FreeCamera.O0000000000O0();
      if (var6 != null && var6.O0000000000000) {
         Vec3d var7 = var6.O00000000(this.freeCameraTickProgress);
         if (var7 != null) {
            this.setPos(var7);
         }
      }

      this.rotationEvent = null;
      this.disableClip = false;
   }

   @ModifyVariable(
      method = {"clipToSpace"},
      at = @At("HEAD"),
      argsOnly = true
   )
   private float modifyCameraDistance(float f) {
      Animations var2 = this.wild$getAnimations();
      if (var2 != null && var2.O0000000000000 && var2.O000000000O.O000000000("F5") && var2.O000000000OO0()) {
         float var3 = var2.O000000000O0OO();
         if (var3 < 1.0F) {
            float var4 = 1.0F - (float)Math.pow(1.0F - Animations.O000000000OO0O, 3.0);
            return f * var4;
         }
      }

      return f;
   }

   @Inject(
      method = {"clipToSpace"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onClipToSpace(float f, CallbackInfoReturnable<Float> callbackInfoReturnable) {
      if (this.disableClip) {
         callbackInfoReturnable.setReturnValue(f);
      }
   }

   @Unique
   private Animations wild$getAnimations() {
      return WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null
         ? (Animations)WildClient.O00000000.O000000000.O000000000(Animations.class)
         : null;
   }

   @Unique
   private boolean wild$isInverseRotationCall(float f, float g) {
      return Math.abs(Math.abs(f - this.originalYaw) - 180.0F) < 0.5F || Math.abs(g + this.originalPitch) < 0.5F;
   }
}
