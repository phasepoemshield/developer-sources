package org.wild.mixin;

import net.minecraft.class_1291;
import net.minecraft.class_1292;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_6880;
import net.minecraft.class_746;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.NUvnVVNvvu;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.NVnnUnnuVVvU;
import ru.metaculture.protection.UuVUNuuuU;
import ru.metaculture.protection.VunUNUNVUnv;
import ru.metaculture.protection.VuuNVNNVnUNV;
import ru.metaculture.protection.nVuVvuVnVVV;
import ru.metaculture.protection.nvVuNVunNnu;
import ru.metaculture.protection.oc0OoOOCo0oO;
import ru.metaculture.protection.uuUnvvnNUU;

@Mixin({class_1309.class})
public abstract class LivingEntityMixin {
   @Unique
   private final class_310 wild$client = class_310.method_1551();

   @Shadow
   public abstract boolean method_6059(class_6880<class_1291> var1);

   @Shadow
   @Nullable
   public abstract class_1293 method_6112(class_6880<class_1291> var1);

   @Inject(
      method = {"jump"},
      at = {@At("HEAD")}
   )
   private void wild$jump(CallbackInfo var1) {
      if (this instanceof class_746 var2) {
         NVnnUnnuVVvU.UuUVuuUu(var2, new nVuVvuVnVVV());
      }
   }

   @Inject(
      method = {"hasStatusEffect"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$onHasStatusEffect(class_6880<class_1291> var1, CallbackInfoReturnable<Boolean> var2) {
      if (this instanceof class_746 && uuUnvvnNUU.UuUVuuUu(var1)) {
         var2.setReturnValue(false);
      }
   }

   @Inject(
      method = {"getStatusEffect"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$onGetStatusEffect(class_6880<class_1291> var1, CallbackInfoReturnable<class_1293> var2) {
      if (this instanceof class_746 && uuUnvvnNUU.UuUVuuUu(var1)) {
         var2.setReturnValue(null);
      }
   }

   @Inject(
      method = {"getHandSwingDuration"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$swingProgressHook(CallbackInfoReturnable<Integer> var1) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         if (this == this.wild$client.field_1724 && NVnVnNnN.unNNVVNnvvV() && NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
            UuVUNuuuU var2 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(UuVUNuuuU.class);
            if (var2 != null && var2.nuUnNvnuUu && !UuVUNuuuU.NVNnnvnuunNv.C00OOC00oO("Off") && UuVUNuuuU.UuuNnUvUuv()) {
               float var3 = UuVUNuuuU.uVunuUNVVUUV.uUnuvNvvNU();
               if (!(var3 <= 0.0F)) {
                  int var4 = 6;
                  class_1309 var5 = (class_1309)this;
                  if (class_1292.method_5576(var5)) {
                     var4 = Math.max(1, var4 - (1 + class_1292.method_5575(var5)));
                  } else if (this.method_6059(class_1294.field_5901)) {
                     class_1293 var6 = this.method_6112(class_1294.field_5901);
                     if (var6 != null) {
                        var4 += (1 + var6.method_5578()) * 2;
                     }
                  }

                  var1.setReturnValue(Math.max(1, (int)(var4 / var3)));
               }
            }
         }
      }
   }

   @ModifyConstant(
      method = {"tickMovement"},
      constant = {@Constant(
         intValue = 10
      )}
   )
   private int wild$modifyJumpTicks(int var1) {
      if (!NVnVnNnN.vNUvnnVnUvu()) {
         return var1;
      } else {
         if (this instanceof class_746 && NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
            nvVuNVunNnu var2 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(nvVuNVunNnu.class);
            if (var2 != null && var2.nuUnNvnuUu && nvVuNVunNnu.NVNnnvnuunNv.uUnuvNvvNU()) {
               return nvVuNVunNnu.UuuNnUvUuv();
            }
         }

         return var1;
      }
   }

   @Inject(
      method = {"calcGlidingVelocity"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void wild$onCalcGlidingVelocity(class_243 var1, CallbackInfoReturnable<class_243> var2) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         if (this instanceof class_746 && NVnVnNnN.unNNVVNnvvV() && NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
            VuuNVNNVnUNV var3 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(VuuNVNNVnUNV.class);
            if (var3 != null && var3.nuUnNvnuUu) {
               oc0OoOOCo0oO var4 = new oc0OoOOCo0oO(var1.method_18805(0.99F, 0.98F, 0.99F));
               NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)var4);
               var2.setReturnValue(var4.uUnuvNvvNU());
            }
         }
      }
   }
}
