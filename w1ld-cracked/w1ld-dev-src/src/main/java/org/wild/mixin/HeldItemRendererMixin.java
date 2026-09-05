package org.wild.mixin;

import com.google.common.base.MoreObjects;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_1309;
import net.minecraft.class_1764;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1937;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_742;
import net.minecraft.class_746;
import net.minecraft.class_759;
import net.minecraft.class_7833;
import net.minecraft.class_811;
import net.minecraft.class_918;
import net.minecraft.class_4597.class_4598;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.NNvunVVuvV;
import ru.metaculture.protection.NNvvnnunn;
import ru.metaculture.protection.NUvnVVNvvu;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.UuVUNuuuU;
import ru.metaculture.protection.VunUNUNVUnv;
import ru.metaculture.protection.nUnVNUN;
import ru.metaculture.protection.nVvuuNnuv;
import ru.metaculture.protection.nuunuvU;
import ru.metaculture.protection.vNUuUNVun;
import ru.metaculture.protection.vnNNnvUvUUv;

@Environment(EnvType.CLIENT)
@Mixin({class_759.class})
public abstract class HeldItemRendererMixin {
   @Unique
   private class_1268 wild$currentHand;
   @Shadow
   private class_1799 field_4047;
   @Shadow
   private class_1799 field_4048;
   @Shadow
   private float field_4043;
   @Shadow
   private float field_4053;
   @Shadow
   private float field_4052;
   @Shadow
   private float field_4051;

   @Shadow
   protected abstract void method_3228(
      class_742 var1, float var2, float var3, class_1268 var4, float var5, class_1799 var6, float var7, class_4587 var8, class_4597 var9, int var10
   );

   @Inject(
      method = {"renderItem(FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;Lnet/minecraft/client/network/ClientPlayerEntity;I)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void fullRenderItemOverride(float var1, class_4587 var2, class_4598 var3, class_746 var4, int var5, CallbackInfo var6) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         var6.cancel();
         if (nUnVNUN.nUUVuvU()) {
            vnNNnvUvUUv.UuUVuuUu()
               .UuUVuuUu(false, false, class_310.method_1551().method_22683().method_4489(), class_310.method_1551().method_22683().method_4506());
         } else {
            nuunuvU var7 = NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null ? NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(nuunuvU.class) : null;
            vnNNnvUvUUv var8 = vnNNnvUvUUv.UuUVuuUu();
            var8.UuUVuuUu(
               var7 != null && var7.UuUVuuUu(class_1268.field_5808),
               var7 != null && var7.UuUVuuUu(class_1268.field_5810),
               class_310.method_1551().method_22683().method_4489(),
               class_310.method_1551().method_22683().method_4506()
            );
            float var9 = var4.method_6055(var1);
            class_1268 var10 = (class_1268)MoreObjects.firstNonNull(var4.field_6266, class_1268.field_5808);
            float var11 = var4.method_61414(var1);
            float var12 = class_3532.method_16439(var1, var4.field_3914, var4.field_3916);
            float var13 = class_3532.method_16439(var1, var4.field_3931, var4.field_3932);
            class_310 var14 = class_310.method_1551();
            if (NNvvnnunn.UuUVuuUu) {
               var2.method_22907(class_7833.field_40714.rotationDegrees(0.0F));
               var2.method_22907(class_7833.field_40716.rotationDegrees(0.0F));
            } else {
               var2.method_22907(class_7833.field_40714.rotationDegrees((var4.method_5695(var1) - var12) * 0.1F));
               var2.method_22907(class_7833.field_40716.rotationDegrees((var4.method_5705(var1) - var13) * 0.1F));
            }

            boolean var15 = true;
            boolean var16 = true;
            class_1799 var17 = var4.method_6047();
            class_1799 var18 = nVvuuNnuv.UuUVuuUu(var4.method_6079());
            boolean var19 = var17.method_31574(class_1802.field_8102) || var18.method_31574(class_1802.field_8102);
            boolean var20 = var17.method_31574(class_1802.field_8399) || var18.method_31574(class_1802.field_8399);
            if (var19 || var20) {
               if (var4.method_6115()) {
                  class_1799 var21 = var4.method_6030();
                  class_1268 var22 = var4.method_6058();
                  if (var21.method_31574(class_1802.field_8102) || var21.method_31574(class_1802.field_8399)) {
                     var15 = var22 == class_1268.field_5808;
                     var16 = var22 == class_1268.field_5810;
                  }
               } else if (this.isChargedCrossbow(var17)) {
                  var16 = false;
               }
            }

            if (var15) {
               float var34 = var10 == class_1268.field_5808 ? var9 : 0.0F;
               float var36 = 1.0F - class_3532.method_16439(var1, this.field_4053, this.field_4043);
               var2.method_22903();
               vNUuUNVun var23 = new vNUuUNVun(var2, class_1268.field_5808);
               NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)var23);
               boolean var24 = var7 != null && var7.UuUVuuUu(class_1268.field_5808);
               Object var25 = var24 ? var8.UuUVuuUu(class_1268.field_5808, var3) : var3;
               this.wild$currentHand = class_1268.field_5808;

               try {
                  this.method_3228(var4, var1, var11, class_1268.field_5808, var34, this.field_4047, var36, var2, (class_4597)var25, var5);
               } finally {
                  this.wild$currentHand = null;
                  if (var24) {
                     var8.UuUVuuUu(class_1268.field_5808);
                  }

                  var2.method_22909();
               }
            }

            if (var16) {
               float var35 = var10 == class_1268.field_5810 ? var9 : 0.0F;
               float var37 = 1.0F - class_3532.method_16439(var1, this.field_4051, this.field_4052);
               var2.method_22903();
               vNUuUNVun var38 = new vNUuUNVun(var2, class_1268.field_5810);
               NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)var38);
               boolean var39 = var7 != null && var7.UuUVuuUu(class_1268.field_5810);
               Object var40 = var39 ? var8.UuUVuuUu(class_1268.field_5810, var3) : var3;
               this.wild$currentHand = class_1268.field_5810;

               try {
                  this.method_3228(var4, var1, var11, class_1268.field_5810, var35, nVvuuNnuv.UuUVuuUu(this.field_4048), var37, var2, (class_4597)var40, var5);
               } finally {
                  this.wild$currentHand = null;
                  if (var39) {
                     var8.UuUVuuUu(class_1268.field_5810);
                  }

                  var2.method_22909();
               }
            }

            var3.method_22993();
         }
      }
   }

   @WrapOperation(
      method = {"renderItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemDisplayContext;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/item/ItemRenderer;renderItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemDisplayContext;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/world/World;III)V"
      )}
   )
   private void wild$renderScaledItem(
      class_918 var1,
      class_1309 var2,
      class_1799 var3,
      class_811 var4,
      class_4587 var5,
      class_4597 var6,
      class_1937 var7,
      int var8,
      int var9,
      int var10,
      Operation<Void> var11
   ) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         class_4597 var12 = var6;
         nuunuvU var13 = NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null ? NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(nuunuvU.class) : null;
         if (this.wild$currentHand != null && var13 != null && var13.UuUVuuUu(this.wild$currentHand)) {
            var12 = vnNNnvUvUUv.UuUVuuUu().C00OOC00oO(this.wild$currentHand, var6);
         }

         float var14 = UuVUNuuuU.UuUVuuUu(this.wild$currentHand);
         if (Math.abs(var14 - 1.0F) <= 1.0E-4F) {
            var11.call(new Object[]{var1, var2, var3, var4, var5, var12, var7, var8, var9, var10});
         } else {
            var5.method_22903();
            var5.method_22905(var14, var14, var14);

            try {
               var11.call(new Object[]{var1, var2, var3, var4, var5, var12, var7, var8, var9, var10});
            } finally {
               var5.method_22909();
            }
         }
      }
   }

   @WrapOperation(
      method = {"renderFirstPersonItem"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/item/HeldItemRenderer;swingArm(FFLnet/minecraft/client/util/math/MatrixStack;ILnet/minecraft/util/Arm;)V",
         ordinal = 2
      )}
   )
   private void handAnimationHook(
      class_759 var1,
      float var2,
      float var3,
      class_4587 var4,
      int var5,
      class_1306 var6,
      Operation<Void> var7,
      @Local(ordinal = 0,argsOnly = true) class_742 var8,
      @Local(ordinal = 0,argsOnly = true) class_1268 var9
   ) {
      NNvunVVuvV var10 = new NNvunVVuvV(var4, var9, var2);
      NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)var10);
      if (!var10.UuUVuuUu()) {
         var7.call(new Object[]{var1, var2, var3, var4, var5, var6});
      }
   }

   @Unique
   private boolean isChargedCrossbow(class_1799 var1) {
      return var1.method_31574(class_1802.field_8399) && class_1764.method_7781(var1);
   }
}
