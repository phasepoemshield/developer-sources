package org.wild.mixin;

import net.minecraft.class_10039;
import net.minecraft.class_1542;
import net.minecraft.class_238;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_7833;
import net.minecraft.class_916;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import ru.metaculture.protection.nvnNNunvv;
import ru.metaculture.protection.nvvvUnnVvVnV;

@Mixin({class_916.class})
public abstract class ItemEntityRendererMixin {
   @Inject(
      method = {"updateRenderState(Lnet/minecraft/entity/ItemEntity;Lnet/minecraft/client/render/entity/state/ItemEntityRenderState;F)V"},
      at = {@At("TAIL")}
   )
   private void wild$updateItemPhysicState(class_1542 var1, class_10039 var2, float var3, CallbackInfo var4) {
      if (var2 instanceof nvnNNunvv var5) {
         var5.wild$setItemPhysicOnGround(var1.method_24828());
      }
   }

   @ModifyArgs(
      method = {"render(Lnet/minecraft/client/render/entity/state/ItemEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/util/math/MatrixStack;translate(FFF)V",
         ordinal = 0
      )
   )
   private void wild$removeGroundBob(Args var1, class_10039 var2, class_4587 var3, class_4597 var4, int var5) {
      if (nvvvUnnVvVnV.UuUVuuUu(var2)) {
         class_238 var6 = var2.field_55310.method_72173();
         float var7 = (float)Math.max(0.0, -var6.field_1322 + nvvvUnnVvVnV.UuuNnUvUuv());
         var1.set(1, var7);
      }
   }

   @Inject(
      method = {"render(Lnet/minecraft/client/render/entity/state/ItemEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/entity/ItemEntityRenderer;renderStack(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/render/entity/state/ItemStackEntityRenderState;Lnet/minecraft/util/math/random/Random;Lnet/minecraft/util/math/Box;)V",
         shift = Shift.BEFORE
      )}
   )
   private void wild$applyItemPhysicTransform(class_10039 var1, class_4587 var2, class_4597 var3, int var4, CallbackInfo var5) {
      if (nvvvUnnVvVnV.UuUVuuUu(var1) || nvvvUnnVvVnV.C00OOC00oO(var1)) {
         float var6 = class_1542.method_27314(var1.field_53328, var1.field_53435);
         var2.method_22907(class_7833.field_40716.rotation(-var6));
         if (nvvvUnnVvVnV.UuUVuuUu(var1)) {
            var2.method_22907(class_7833.field_40714.rotationDegrees(nvvvUnnVvVnV.nUUVuvU()));
         } else {
            var2.method_22907(class_7833.field_40714.rotationDegrees(nvvvUnnVvVnV.UuUVuuUu(var1.field_53328)));
         }
      }
   }
}
