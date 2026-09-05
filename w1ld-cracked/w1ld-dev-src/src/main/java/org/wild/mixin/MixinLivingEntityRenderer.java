package org.wild.mixin;

import net.minecraft.class_10017;
import net.minecraft.class_10042;
import net.minecraft.class_10055;
import net.minecraft.class_1921;
import net.minecraft.class_3887;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_583;
import net.minecraft.class_591;
import net.minecraft.class_922;
import net.minecraft.class_9848;
import net.minecraft.class_4597.class_4598;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.CCcoCC0O;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.NVvvnuvVV;
import ru.metaculture.protection.VNNnvnNuVNv;
import ru.metaculture.protection.nUNuvunv;
import ru.metaculture.protection.nuVUnVnVvV;
import ru.metaculture.protection.uvvnVuvvvvUn;
import ru.metaculture.protection.vVnUVUUuUUu;
import ru.metaculture.protection.vVnvuVuVvnun;

@Mixin({class_922.class})
public abstract class MixinLivingEntityRenderer {
   @Shadow
   protected class_583<? super class_10042> field_4737;
   @Unique
   private class_10055 wild$lastPlayerState;

   @Inject(
      method = {"getRenderLayer"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$usePrismaticChams(class_10042 var1, boolean var2, boolean var3, boolean var4, CallbackInfoReturnable<class_1921> var5) {
      if (!nuVUnVnVvV.UuUVuuUu().uVUuuVnNVU()) {
         CCcoCC0O var6 = CCcoCC0O.NVNnnvnuunNv();
         if (var6 != null && var6.UuUVuuUu(var1)) {
            var5.setReturnValue(nUNuvunv.UuUVuuUu(var6));
         }
      }
   }

   @Inject(
      method = {"shouldRenderFeatures"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$skipFeaturesForPrismaticChams(class_10042 var1, CallbackInfoReturnable<Boolean> var2) {
      if (nuVUnVnVvV.UuUVuuUu().vuuuNvNuv()) {
         var2.setReturnValue(false);
      } else if (!nuVUnVnVvV.UuUVuuUu().uVUuuVnNVU()) {
         CCcoCC0O var3 = CCcoCC0O.NVNnnvnuunNv();
         if (var3 != null && var3.C00OOC00oO(var1)) {
            var2.setReturnValue(false);
         }
      }
   }

   @Inject(
      method = {"getShadowRadius(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;)F"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$hidePrismaticChamsShadow(class_10042 var1, CallbackInfoReturnable<Float> var2) {
      if (!nuVUnVnVvV.UuUVuuUu().uVUuuVnNVU()) {
         CCcoCC0O var3 = CCcoCC0O.NVNnnvnuunNv();
         if (var3 != null && var3.uUnuvNvvNU(var1)) {
            var2.setReturnValue(0.0F);
         }
      }
   }

   @Redirect(
      method = {"render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/VertexConsumerProvider;getBuffer(Lnet/minecraft/client/render/RenderLayer;)Lnet/minecraft/client/render/VertexConsumer;"
      )
   )
   private class_4588 wild$captureBaseLayer(class_4597 var1, class_1921 var2, class_10042 var3, class_4587 var4, class_4597 var5, int var6) {
      class_4588 var7 = var1.getBuffer(var2);
      CCcoCC0O var8 = CCcoCC0O.NVNnnvnuunNv();
      return var8 != null && var8.UuUVuuUu(var3) ? var7 : nuVUnVnVvV.UuUVuuUu().UuUVuuUu(var7, var2, var3);
   }

   @Redirect(
      method = {"render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/entity/model/EntityModel;render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;III)V"
      )
   )
   private void redirectModelRender(
      class_583<class_10042> var1,
      class_4587 var2,
      class_4588 var3,
      int var4,
      int var5,
      int var6,
      class_10042 var7,
      class_4587 var8,
      class_4597 var9,
      int var10
   ) {
      if (nuVUnVnVvV.UuUVuuUu().uVUuuVnNVU()) {
         var1.method_62100(var2, var3, var4, var5, var6);
         this.wild$lastPlayerState = null;
      } else {
         CCcoCC0O var12 = CCcoCC0O.NVNnnvnuunNv();
         if (var12 != null && var12.UuUVuuUu(var7)) {
            float var17 = var12.vVvUvVVuuNvV(var7);
            nUNuvunv.vVvUvVVuuNvV();
            if (var12.UnUNVVVNuv()) {
               this.wild$renderChamsPass(var1, var2, var9, var7, var4, var5, var6, nUNuvunv.uUnuvNvvNU(), 1.0F, var17);
               this.wild$renderChamsPass(var1, var2, var9, var7, var4, var5, var6, nUNuvunv.C00OOC00oO(), 0.0F, var17);
            } else {
               class_1921 var18 = var12.vNVuvnUUnuUn() ? nUNuvunv.C00OOC00oO() : nUNuvunv.uUnuvNvvNU();
               float var15 = var12.vNVuvnUUnuUn() ? 0.0F : 1.0F;
               this.wild$renderChamsPass(var1, var2, var9, var7, var4, var5, var6, var18, var15, var17);
            }

            if (var7 instanceof class_10055 var19 && var1 instanceof class_591 var21) {
               VNNnvnNuVNv.UuUVuuUu(var19, var21, var2, var9, var4, var5);
            }

            this.wild$lastPlayerState = var7 instanceof class_10055 var20 ? var20 : null;
         } else {
            var1.method_62100(var2, var3, var4, var5, this.wild$applySeeInvisiblesAlpha(var7, var6));
            if (var7 instanceof class_10055 var13 && var1 instanceof class_591 var14) {
               VNNnvnNuVNv.UuUVuuUu(var13, var14, var2, var9, var4, var5);
            }

            this.wild$lastPlayerState = var7 instanceof class_10055 var16 ? var16 : null;
         }
      }
   }

   @Unique
   private int wild$applySeeInvisiblesAlpha(class_10042 var1, int var2) {
      if (!NVnVnNnN.vNUvnnVnUvu()) {
         return var2;
      } else if (var1 instanceof class_10055 && var1.field_53333) {
         vVnUVUUuUUu var3 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(vVnUVUUuUUu.class);
         return var3 != null && var3.nuUnNvnuUu ? class_9848.method_61330(Math.round(var3.NVNnnvnuunNv.uUnuvNvvNU() * 255.0F), var2) : var2;
      } else {
         return var2;
      }
   }

   @Redirect(
      method = {"render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/entity/feature/FeatureRenderer;render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/render/entity/state/EntityRenderState;FF)V"
      )
   )
   private void wild$captureFeatureRender(class_3887<?, ?> var1, class_4587 var2, class_4597 var3, int var4, class_10017 var5, float var6, float var7) {
      if (var5 instanceof class_10042 var8) {
         nuVUnVnVvV.UuUVuuUu().UuUVuuUu(var1, var2, var3, var4, var8, var6, var7);
      } else {
         var1.method_4199(var2, var3, var4, var5, var6, var7);
      }
   }

   @Inject(
      method = {"render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/util/math/MatrixStack;pop()V"
      )}
   )
   private void wild$capturePlayerModelOverlays(class_10042 var1, class_4587 var2, class_4597 var3, int var4, CallbackInfo var5) {
      try {
         if (nuVUnVnVvV.UuUVuuUu().uVUuuVnNVU()) {
            this.wild$lastPlayerState = null;
            return;
         }

         class_10055 var6 = this.wild$lastPlayerState;
         this.wild$lastPlayerState = null;
         if (var6 == null || !(var1 instanceof class_10055 var7) || var7 != var6) {
            return;
         }

         if (!(this.field_4737 instanceof class_591 var9)) {
            return;
         }

         try {
            NVvvnuvVV.UuUVuuUu(var6, var9, var2);
         } catch (RuntimeException var18) {
         }

         boolean var10 = false;

         try {
            CCcoCC0O var11 = CCcoCC0O.NVNnnvnuunNv();
            var10 = var11 != null && var11.C00OOC00oO(var1);
         } catch (RuntimeException var19) {
         }

         if (var10) {
            return;
         }

         try {
            uvvnVuvvvvUn.UuUVuuUu(var6, var9, var2, var3, var4);
         } catch (RuntimeException var17) {
            vVnvuVuVvnun.UuUVuuUu().UuUVuuUu("ChinaHat pose capture", var17);
         }
      } finally {
         nuVUnVnVvV.UuUVuuUu().UuUVuuUu(var1);
      }
   }

   @Unique
   private void wild$renderChamsPass(
      class_583<class_10042> var1, class_4587 var2, class_4597 var3, class_10042 var4, int var5, int var6, int var7, class_1921 var8, float var9, float var10
   ) {
      CCcoCC0O var11 = CCcoCC0O.NVNnnvnuunNv();
      if (var11 != null) {
         nUNuvunv.UuUVuuUu(var11, var4, var9, var10);
         class_4588 var12 = nuVUnVnVvV.UuUVuuUu().UuUVuuUu(var3.getBuffer(var8), var8, var4);
         var1.method_62100(var2, var12, var5, var6, class_9848.method_61330(255, var7));
         if (var3 instanceof class_4598 var13) {
            var13.method_22994(var8);
         }
      }
   }
}
