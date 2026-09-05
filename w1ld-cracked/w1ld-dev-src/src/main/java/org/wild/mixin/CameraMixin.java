package org.wild.mixin;

import net.minecraft.class_1297;
import net.minecraft.class_1922;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.NUvnVVNvvu;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.UUvNUNvUVnu;
import ru.metaculture.protection.VunUNUNVUnv;
import ru.metaculture.protection.nUnVNUN;
import ru.metaculture.protection.nVvVVUun;
import ru.metaculture.protection.uUNNUnNvV;

@Mixin({class_4184.class})
public abstract class CameraMixin {
   @Unique
   private UUvNUNvUVnu rotationEvent;
   @Unique
   private float originalYaw;
   @Unique
   private float originalPitch;
   @Unique
   private boolean disableClip;
   @Unique
   private float freeCameraTickProgress;

   @Shadow
   protected abstract void method_19325(float var1, float var2);

   @Shadow
   protected abstract void method_19324(float var1, float var2, float var3);

   @Shadow
   protected abstract void method_19322(class_243 var1);

   @Inject(
      method = {"update"},
      at = {@At("HEAD")}
   )
   private void onUpdateHead(class_1922 var1, class_1297 var2, boolean var3, boolean var4, float var5, CallbackInfo var6) {
      this.freeCameraTickProgress = var5;
      uUNNUnNvV var7 = new uUNNUnNvV();
      NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)var7);
      this.disableClip = var7.UuUVuuUu();
      if (var2 != null) {
         this.originalYaw = var2.method_5705(var5);
         this.originalPitch = var2.method_5695(var5);
         this.rotationEvent = new UUvNUNvUVnu(this.originalYaw, this.originalPitch, var5);
         NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)this.rotationEvent);
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
   private void redirectSetRotation(class_4184 var1, float var2, float var3) {
      boolean var4 = this.rotationEvent != null
         && (this.rotationEvent.uUnuvNvvNU() != this.originalYaw || this.rotationEvent.vVvUvVVuuNvV() != this.originalPitch);
      float var5 = var4 ? this.rotationEvent.uUnuvNvvNU() : this.originalYaw;
      float var6 = var4 ? this.rotationEvent.vVvUvVVuuNvV() : this.originalPitch;
      nVvVVUun var7 = this.wild$getAnimations();
      if (var7 != null && var7.nuUnNvnuUu && var7.NVNnnvnuunNv.C00OOC00oO("F5") && var7.unNNVVNnvvV()) {
         if (var7.NVUunUNUN()) {
            this.method_19325(var5 + var7.UUVNuUNUvUnV(), var7.UuUVuuUu(var6));
            return;
         }

         if (var7.NuunnvnN() && this.wild$isInverseRotationCall(var2)) {
            this.method_19325(var5 + var7.UUVNuUNUvUnV(), var7.UuUVuuUu(var6));
            return;
         }
      }

      if (var4) {
         if (this.wild$isInverseRotationCall(var2)) {
            this.method_19325(var5 + 180.0F, -var6);
         } else {
            this.method_19325(var5, var6);
         }
      } else {
         this.method_19325(var2, var3);
      }
   }

   @Inject(
      method = {"update"},
      at = {@At("RETURN")}
   )
   private void onUpdateReturn(CallbackInfo var1) {
      nVvVVUun var2 = this.wild$getAnimations();
      if (var2 != null && var2.nuUnNvnuUu && var2.NVNnnvnuunNv.C00OOC00oO("F5") && var2.VVnVNnunVvu()) {
         float var3 = this.originalYaw + var2.vuvnUnVnUNnV();
         float var4 = var2.C00OOC00oO(this.originalPitch);
         float var5 = 4.0F * var2.nnuUVNUuvvVU();
         this.method_19325(var3, var4);
         if (var5 > 0.001F) {
            this.method_19324(-var5, 0.0F, 0.0F);
         }
      }

      nUnVNUN var6 = nUnVNUN.UuuNnUvUuv();
      if (var6 != null && var6.nuUnNvnuUu) {
         class_243 var7 = var6.UuUVuuUu(this.freeCameraTickProgress);
         if (var7 != null) {
            this.method_19322(var7);
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
   private float modifyCameraDistance(float var1) {
      nVvVVUun var2 = this.wild$getAnimations();
      if (var2 != null && var2.nuUnNvnuUu && var2.NVNnnvnuunNv.C00OOC00oO("F5") && var2.c0oOOCcCoC0()) {
         float var3 = var2.uUVuVvuNUvnu();
         if (var3 < 1.0F) {
            float var4 = 1.0F - (float)Math.pow(1.0F - nVvVVUun.unNNVVNnvvV, 3.0);
            return var1 * var4;
         }
      }

      return var1;
   }

   @Inject(
      method = {"clipToSpace"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onClipToSpace(float var1, CallbackInfoReturnable<Float> var2) {
      if (this.disableClip) {
         var2.setReturnValue(var1);
      }
   }

   @Unique
   private nVvVVUun wild$getAnimations() {
      if (!NVnVnNnN.vNUvnnVnUvu()) {
         return null;
      } else {
         return NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null ? (nVvVVUun)NVnVnNnN.UuUVuuUu.C00OOC00oO.C00OOC00oO(nVvVVUun.class) : null;
      }
   }

   @Unique
   private boolean wild$isInverseRotationCall(float var1) {
      return Math.abs(class_3532.method_15393(var1 - this.originalYaw - 180.0F)) < 0.5F;
   }
}
