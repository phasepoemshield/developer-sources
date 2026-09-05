package org.wild.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_238;
import net.minecraft.class_241;
import net.minecraft.class_310;
import net.minecraft.class_744;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.NNvvnnunn;
import ru.metaculture.protection.NUNnuuNUvuVU;
import ru.metaculture.protection.NUvnVVNvvu;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.NVnnUnnuVVvU;
import ru.metaculture.protection.UNNVUnNV;
import ru.metaculture.protection.VNNVunUvvnn;
import ru.metaculture.protection.VunUNUNVUnv;
import ru.metaculture.protection.WvvwWVWvvVWw;
import ru.metaculture.protection.nNUnvnV;
import ru.metaculture.protection.nUnVNUN;
import ru.metaculture.protection.nVUunVNnNN;
import ru.metaculture.protection.nnVNNuuVUVn;
import ru.metaculture.protection.oCoOO0coOCo;

@Environment(EnvType.CLIENT)
@Mixin({class_746.class})
public abstract class ClientPlayerEntityMixin {
   @Shadow
   public class_744 field_3913;

   @Inject(
      method = {"tick"},
      at = {@At("HEAD")}
   )
   private void onTickHead(CallbackInfo var1) {
      NVnnUnnuVVvU.UuUVuuUu((class_746)this);
   }

   @Redirect(
      method = {"tickMovementInput"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;getPitch()F"
      )
   )
   private float redirectRenderPitchUpdate(class_746 var1) {
      return NNvvnnunn.UuUVuuUu ? class_310.method_1551().field_1773.method_19418().method_19329() : var1.method_36455();
   }

   @Inject(
      method = {"dropSelectedItem"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$lockSlotsDropSelected(boolean var1, CallbackInfoReturnable<Boolean> var2) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
            nVUunVNnNN var3 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(nVUunVNnNN.class);
            if (var3 != null && var3.nuUnNvnuUu) {
               class_746 var4 = (class_746)this;
               if (var3.UuUVuuUu(var4.method_31548().method_67532())) {
                  var2.setReturnValue(false);
               }
            }
         }
      }
   }

   @Inject(
      method = {"sendMovementPackets"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void preMotion(CallbackInfo var1) {
      class_746 var2 = (class_746)this;
      if (!(var2 instanceof VNNVunUvvnn var3 && nnVNNuuVUVn.UuUVuuUu() != var3.UuUVuuUu())) {
         NUNnuuNUvuVU var4 = new NUNnuuNUvuVU(
            var2.method_23317(), var2.method_23318(), var2.method_23321(), var2.method_36454(), var2.method_36455(), var2.method_24828()
         );
         NVnnUnnuVVvU.UuUVuuUu((class_746)this, var4);
         if (var4.UuUVuuUu()) {
            var1.cancel();
         }
      }
   }

   @Inject(
      method = {"sendMovementPackets"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;isCamera()Z"
      )},
      cancellable = true
   )
   private void cancelBackgroundBotVanillaMovement(CallbackInfo var1) {
      class_746 var2 = (class_746)this;
      if (var2 instanceof VNNVunUvvnn var3 && nnVNNuuVUVn.UuUVuuUu() != var3.UuUVuuUu()) {
         var1.cancel();
      }
   }

   @ModifyExpressionValue(
      method = {"tickMovement"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;isUsingItem()Z"
      )}
   )
   private boolean usingItemHook(boolean var1) {
      if (var1) {
         nNUnvnV var2 = new nNUnvnV((byte)1);
         NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)var2);
         if (var2.UuUVuuUu()) {
            return false;
         }
      }

      return var1;
   }

   @Redirect(
      method = {"tickMovementInput"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;getYaw()F"
      )
   )
   private float redirectRenderYawUpdate(class_746 var1) {
      return NNvvnnunn.UuUVuuUu ? class_310.method_1551().field_1773.method_19418().method_19330() : var1.method_36454();
   }

   @Redirect(
      method = {"tickMovement"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;pushOutOfBlocks(DD)V"
      )
   )
   private void redirectPushOutOfBlocks(class_746 var1, double var2, double var4) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
            nUnVNUN var6 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(nUnVNUN.class);
            if (var6 != null && var6.nuUnNvnuUu) {
               return;
            }

            WvvwWVWvvVWw var7 = (WvvwWVWvvVWw)NVnVnNnN.UuUVuuUu.C00OOC00oO.C00OOC00oO(WvvwWVWvvVWw.class);
            if (var7 != null && var7.nuUnNvnuUu && var7.UNnVVNvvnVvU.uUnuvNvvNU()) {
            }
         }
      }
   }

   @Inject(
      method = {"tickMovement"},
      at = {@At("HEAD")}
   )
   private void onUpdateWalkingPlayer(CallbackInfo var1) {
      class_746 var2 = (class_746)this;
      if (var2 != null) {
         class_238 var3 = var2.method_5829();
         UNNVUnNV var4 = new UNNVUnNV(
            var2.method_36454(), var2.method_36455(), var2.method_23317(), var2.method_23318(), var2.method_23321(), var2.method_24828(), var3, null
         );
         NVnnUnnuVVvU.UuUVuuUu((class_746)this, var4);
         if (!var4.UuUVuuUu()) {
            if (var4.uNNnnnuuuN() != var2.method_36454() || var4.nuUnNvnuUu() != var2.method_36455()) {
               var2.method_36456(var4.uNNnnnuuuN());
               var2.method_36457(var4.nuUnNvnuUu());
            }

            if (var4.VVuuUN() != var2.method_23317() || var4.vNUvnnVnUvu() != var2.method_23318() || var4.uVUuuVnNVU() != var2.method_23321()) {
               var2.method_5808(var4.VVuuUN(), var4.vNUvnnVnUvu(), var4.uVUuuVnNVU(), var4.uNNnnnuuuN(), var4.nuUnNvnuUu());
            }

            if (var4.vuuuNvNuv() != var2.method_24828()) {
               var2.method_24830(var4.vuuuNvNuv());
            }
         }
      }
   }

   @Redirect(
      method = {"applyMovementSpeedFactors"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/util/math/Vec2f;multiply(F)Lnet/minecraft/util/math/Vec2f;",
         ordinal = 1
      )
   )
   private class_241 preventSlowdownMultiply(class_241 var1, float var2) {
      class_746 var3 = (class_746)this;
      if (var2 == 0.2F && var3.method_6115() && !var3.method_5765()) {
         float var4 = var1.field_1342;
         float var5 = var1.field_1343;
         oCoOO0coOCo var6 = new oCoOO0coOCo(var4, var5);
         NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)var6);
         var6.uUnuvNvvNU();
         if (var6.UuUVuuUu()) {
            return var1;
         }
      }

      return var1.method_35582(var2);
   }

   @Unique
   private static float getMovementMultiplier(boolean var0, boolean var1) {
      if (var0 == var1) {
         return 0.0F;
      } else {
         return var0 ? 1.0F : -1.0F;
      }
   }
}
