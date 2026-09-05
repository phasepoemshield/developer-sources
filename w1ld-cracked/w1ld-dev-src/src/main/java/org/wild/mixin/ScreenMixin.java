package org.wild.mixin;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import net.minecraft.class_2583;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_434;
import net.minecraft.class_435;
import net.minecraft.class_437;
import net.minecraft.class_525;
import net.minecraft.class_526;
import net.minecraft.class_2558.class_10609;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.NvVNvUvunNNu;
import ru.metaculture.protection.OO0OCoOC;
import ru.metaculture.protection.VNNUVUuN;
import ru.metaculture.protection.VUUuNVNNU;
import ru.metaculture.protection.nuuvUNvn;
import ru.metaculture.protection.oocOO0CCC0O;
import ru.metaculture.protection.uNVUuVuNNUvn;
import ru.metaculture.protection.vVnvuVuVvnun;

@Mixin({class_437.class})
public class ScreenMixin {
   @Unique
   private static final OO0OCoOC wild$palette = OO0OCoOC.UuUVuuUu();
   @Unique
   private boolean wild$guiRippleCapture;
   @Unique
   private static boolean wild$panoramaNoticeLogged;

   @Inject(
      method = {"handleTextClick"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void litka$interceptClientCommands(class_2583 var1, CallbackInfoReturnable<Boolean> var2) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         if (var1 != null && var1.method_10970() instanceof class_10609 var3) {
            String var5 = var3.comp_3506();
            if (var5 != null && var5.startsWith(NVnVnNnN.UuUVuuUu.VVnVNnunVvu())) {
               NVnVnNnN.UuUVuuUu.UvUvUNuvNU().UuUVuuUu(var5);
               var2.setReturnValue(true);
            }
         }
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("HEAD")}
   )
   private void wild$diagRenderHead(class_332 var1, int var2, int var3, float var4, CallbackInfo var5) {
      vVnvuVuVvnun.UuUVuuUu().nuUnNvnuUu();
      class_437 var6 = (class_437)this;
      if (!(var6 instanceof uNVUuVuNNUvn)) {
         nuuvUNvn.UuUVuuUu(class_310.method_1551());
      }

      VNNUVUuN.UuUVuuUu(var6, "render.head");
   }

   @Inject(
      method = {"render"},
      at = {@At("TAIL")}
   )
   private void wild$diagRenderTail(class_332 var1, int var2, int var3, float var4, CallbackInfo var5) {
      vVnvuVuVvnun.UuUVuuUu().VVuuUN();
      VNNUVUuN.UuUVuuUu((class_437)this, "render.tail");
   }

   @Inject(
      method = {"renderBackground"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$renderThemedVanillaBackdrop(class_332 var1, int var2, int var3, float var4, CallbackInfo var5) {
      class_437 var6 = (class_437)this;
      if (!wild$usesThemedBackdrop(var6)) {
         VNNUVUuN.UuUVuuUu(var6, "renderBackground.vanilla");
      } else {
         class_310 var7 = class_310.method_1551();
         if (var7 != null && var7.method_22683() != null) {
            if (VUUuNVNNU.UuUVuuUu().UuUVuuUu(var7, var2, var3, 1.0F, var6)) {
               VNNUVUuN.UuUVuuUu(var6, "renderBackground.backdrop", "shader-backdrop");
               var5.cancel();
            } else {
               wild$drawThemedBackdrop(var1, var7.method_22683().method_4486(), var7.method_22683().method_4502());
               VNNUVUuN.UuUVuuUu(var6, "renderBackground.backdrop", "gradient-fallback");
               var5.cancel();
            }
         } else {
            VNNUVUuN.UuUVuuUu("renderBackground", var6, "client or window missing", null);
         }
      }
   }

   @WrapMethod(
      method = {"renderPanoramaBackground"}
   )
   private void wild$guardPanorama(class_332 var1, float var2, Operation<Void> var3) {
      try {
         var3.call(new Object[]{var1, var2});
      } catch (Throwable var6) {
         if (!wild$panoramaNoticeLogged) {
            wild$panoramaNoticeLogged = true;
            VNNUVUuN.UuUVuuUu("renderPanoramaBackground", (class_437)this, "vanilla panorama failed -> themed backdrop", var6);
         }

         class_310 var5 = class_310.method_1551();
         if (var5 != null && var5.method_22683() != null) {
            wild$drawThemedBackdrop(var1, var5.method_22683().method_4486(), var5.method_22683().method_4502());
         }
      }
   }

   @Inject(
      method = {"renderWithTooltip"},
      at = {@At("HEAD")}
   )
   private void wild$beginGuiRipplePass(class_332 var1, int var2, int var3, float var4, CallbackInfo var5) {
      class_437 var6 = (class_437)this;
      class_310 var7 = class_310.method_1551();
      if (var7 != null && var7.method_22683() != null) {
         oocOO0CCC0O var8 = oocOO0CCC0O.UuUVuuUu();
         this.wild$guiRippleCapture = var8.UuUVuuUu(var6) && var8.UuUVuuUu(var7.method_22683().method_4489(), var7.method_22683().method_4506());
         if (this.wild$guiRippleCapture) {
            VNNUVUuN.UuUVuuUu(var6, "renderWithTooltip.ripple.begin");
         }
      } else {
         this.wild$guiRippleCapture = false;
      }
   }

   @Inject(
      method = {"renderWithTooltip"},
      at = {@At("TAIL")}
   )
   private void wild$endGuiRipplePass(class_332 var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (!this.wild$guiRippleCapture) {
         VNNUVUuN.UuUVuuUu((class_437)this, "renderWithTooltip.tail");
      } else {
         this.wild$guiRippleCapture = false;

         try {
            oocOO0CCC0O.UuUVuuUu().uUnuvNvvNU();
            VNNUVUuN.UuUVuuUu((class_437)this, "renderWithTooltip.ripple.end");
         } catch (Throwable var7) {
            VNNUVUuN.UuUVuuUu("gui-ripple", (class_437)this, "endPass failed", var7);
         }

         VNNUVUuN.UuUVuuUu((class_437)this, "renderWithTooltip.tail");
      }
   }

   @Unique
   private static boolean wild$usesThemedBackdrop(class_437 var0) {
      return var0 instanceof class_526 || var0 instanceof class_525 || var0 instanceof class_434 || var0 instanceof class_435;
   }

   @Unique
   private static void wild$drawThemedBackdrop(class_332 var0, int var1, int var2) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         NvVNvUvunNNu var3 = NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.nvUVNnuu != null ? NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO() : NvVNvUvunNNu.AURORA;
         boolean var4 = wild$palette.uUnuvNvvNU(var3);
         int var5 = wild$palette.vVvUvVVuuNvV(var3);
         int var6 = wild$palette.uNNnnnuuuN(var3);
         int var7 = var4 ? wild$mix(-197121, var5, 0.055F) : wild$mix(-16447732, var5, 0.035F);
         int var8 = var4 ? wild$mix(-3853, var6, 0.09F) : wild$mix(-15658213, var6, 0.06F);
         var0.method_25296(0, 0, var1, var2, var7, var8);
         int var9 = Math.max(5, Math.min(9, var2 / 72));

         for (int var10 = 0; var10 < var9; var10++) {
            float var11 = (var10 + 1.0F) / (var9 + 1.0F);
            int var12 = Math.round(var2 * var11 - var2 * 0.045F);
            int var13 = Math.max(18, Math.round(var2 * (var4 ? 0.045F : 0.06F)));
            int var14 = wild$withAlpha(wild$mix(var5, -1, var4 ? 0.78F : 0.15F), var4 ? 18 : 24);
            int var15 = wild$withAlpha(wild$mix(var6, -1, var4 ? 0.72F : 0.12F), 0);
            var0.method_25296(0, Math.max(0, var12), var1, Math.min(var2, var12 + var13), var14, var15);
         }

         if (var4) {
            var0.method_25296(0, 0, var1, Math.max(24, var2 / 8), 570425344, 0);
            var0.method_25296(0, Math.max(0, var2 - var2 / 5), var1, var2, 0, 285212671);
         } else {
            var0.method_25296(0, 0, var1, var2, 570425344, 1711276032);
         }
      }
   }

   @Unique
   private static int wild$withAlpha(int var0, int var1) {
      return (Math.max(0, Math.min(255, var1)) & 0xFF) << 24 | var0 & 16777215;
   }

   @Unique
   private static int wild$mix(int var0, int var1, float var2) {
      float var3 = Math.max(0.0F, Math.min(1.0F, var2));
      int var4 = Math.round(wild$channel(var0, 24) + (wild$channel(var1, 24) - wild$channel(var0, 24)) * var3);
      int var5 = Math.round(wild$channel(var0, 16) + (wild$channel(var1, 16) - wild$channel(var0, 16)) * var3);
      int var6 = Math.round(wild$channel(var0, 8) + (wild$channel(var1, 8) - wild$channel(var0, 8)) * var3);
      int var7 = Math.round(wild$channel(var0, 0) + (wild$channel(var1, 0) - wild$channel(var0, 0)) * var3);
      return var4 << 24 | var5 << 16 | var6 << 8 | var7;
   }

   @Unique
   private static int wild$channel(int var0, int var1) {
      return var0 >> var1 & 0xFF;
   }
}
