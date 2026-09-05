package org.wild.mixin;

import java.util.Optional;
import java.util.function.Consumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_156;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4011;
import net.minecraft.class_4071;
import net.minecraft.class_425;
import net.minecraft.class_437;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.NvNNnUUuNn;
import ru.metaculture.protection.uVuVNVuuN;

@Environment(EnvType.CLIENT)
@Mixin({class_425.class})
public abstract class SplashOverlayMixin extends class_4071 {
   @Shadow
   @Final
   private class_310 field_18217;
   @Shadow
   @Final
   private class_4011 field_17767;
   @Shadow
   @Final
   private Consumer<Optional<Throwable>> field_18218;
   @Shadow
   @Final
   private boolean field_18219;
   @Shadow
   private float field_17770;
   @Shadow
   private long field_17771;
   @Shadow
   private long field_18220;

   @Inject(
      method = {"render"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$renderCustomLoadingOverlay(class_332 var1, int var2, int var3, float var4, CallbackInfo var5) {
      NVnVnNnN.UuUVuuUu(this.field_18217);
      if (uVuVNVuuN.uVunuUNVVUUV) {
         NvNNnUUuNn.UuUVuuUu().uUnuvNvvNU();
      } else {
         long var6 = class_156.method_658();
         if (this.field_18219 && this.field_18220 == -1L) {
            this.field_18220 = var6;
         }

         float var8 = this.field_17771 > -1L ? (float)(var6 - this.field_17771) / 1000.0F : -1.0F;
         float var9 = this.field_18220 > -1L ? (float)(var6 - this.field_18220) / 500.0F : -1.0F;
         float var10 = this.field_17767.method_18229();
         this.field_17770 = class_3532.method_15363(this.field_17770 * 0.95F + var10 * 0.050000012F, 0.0F, 1.0F);
         float var11 = this.wild$overlayAlpha(var8, var9);
         if (var8 >= 0.0F && this.field_18217.field_1755 != null) {
            this.field_18217.field_1755.method_47413(var1, var2, var3, var4);
         } else if (this.field_18219 && this.field_18217.field_1755 != null && var9 < 1.0F) {
            this.field_18217.field_1755.method_47413(var1, var2, var3, var4);
         }

         NvNNnUUuNn var12 = NvNNnUUuNn.UuUVuuUu();
         if (!var12.C00OOC00oO()) {
            var12.UuUVuuUu(this.field_17770, var11);
            var5.cancel();
            if (var8 >= 1.5F) {
               this.field_18217.method_18502(null);
               var12.uUnuvNvvNU();
            } else {
               if (this.field_17771 == -1L && this.field_17767.method_18787() && (!this.field_18219 || var9 >= 2.0F)) {
                  this.wild$finishReload(var1);
               }
            }
         }
      }
   }

   @Unique
   private float wild$overlayAlpha(float var1, float var2) {
      if (var1 >= 0.0F) {
         return 1.0F - wild$smoother(class_3532.method_15363(var1 / 1.35F, 0.0F, 1.0F));
      } else {
         return this.field_18219 ? wild$smoother(class_3532.method_15363(var2, 0.15F, 1.0F)) : 1.0F;
      }
   }

   @Unique
   private static float wild$smoother(float var0) {
      float var1 = class_3532.method_15363(var0, 0.0F, 1.0F);
      return var1 * var1 * var1 * (var1 * (var1 * 6.0F - 15.0F) + 10.0F);
   }

   @Unique
   private void wild$finishReload(class_332 var1) {
      try {
         this.field_17767.method_18849();
         this.field_18218.accept(Optional.empty());
      } catch (Throwable var3) {
         this.field_18218.accept(Optional.of(var3));
      }

      this.field_17771 = class_156.method_658();
      class_437 var2 = this.field_18217.field_1755;
      if (var2 != null) {
         var2.method_25423(this.field_18217, var1.method_51421(), var1.method_51443());
      }
   }
}
