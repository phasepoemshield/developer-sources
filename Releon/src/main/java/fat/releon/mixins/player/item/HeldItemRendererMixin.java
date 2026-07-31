package fat.releon.mixins.player.item;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import l.Helper124;
import l.ClientIndication;
import l.Helper283;
import l.Event6;
import l.Helper411;
import l.Event30;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({HeldItemRenderer.class})
public abstract class HeldItemRendererMixin {
   public HeldItemRendererMixin() {
   }

   @Inject(
      method = {"renderFirstPersonItem"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/util/math/MatrixStack;push()V",
         shift = Shift.AFTER
      )}
   )
   private void renderFirstPersonItemHook(
      AbstractClientPlayerEntity var1,
      float var2,
      float var3,
      Hand var4,
      float var5,
      ItemStack var6,
      float var7,
      MatrixStack var8,
      VertexConsumerProvider var9,
      int var10,
      CallbackInfo var11
   ) {
      Event30 var12 = new Event30(var8, var6, var4);
      Helper124.method1026(var12);
   }

   @WrapOperation(
      method = {"renderItem(FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;Lnet/minecraft/client/network/ClientPlayerEntity;I)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/item/HeldItemRenderer;renderFirstPersonItem(Lnet/minecraft/client/network/AbstractClientPlayerEntity;FFLnet/minecraft/util/Hand;FLnet/minecraft/item/ItemStack;FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"
      )}
   )
   private void itemRenderHook(
      HeldItemRenderer var1,
      AbstractClientPlayerEntity var2,
      float var3,
      float var4,
      Hand var5,
      float var6,
      ItemStack var7,
      float var8,
      MatrixStack var9,
      VertexConsumerProvider var10,
      int var11,
      Operation<Void> var12
   ) {
      Event6 var13 = new Event6(var2, var7, var5);
      Helper124.method1026(var13);
      ClientIndication var14 = ClientIndication.method2427();
      if (var14 != null && var14.method2428(var13.method3670(), var13.method3669())) {
         Helper283.method2776(
            var14.method2431(var13.method3669()), var14.method2432(var13.method3669()), var14.method2433(var13.method3669()), var14.method2434()
         );

         try {
            var12.call(new Object[]{var1, var13.method3668(), var3, var4, var13.method3670(), var6, var13.method3669(), var8, var9, var10, var11});
         } finally {
            Helper283.method2777();
         }
      } else {
         var12.call(new Object[]{var1, var13.method3668(), var3, var4, var13.method3670(), var6, var13.method3669(), var8, var9, var10, var11});
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
      HeldItemRenderer var1,
      float var2,
      float var3,
      MatrixStack var4,
      int var5,
      Arm var6,
      Operation<Void> var7,
      @Local(ordinal = 0,argsOnly = true) AbstractClientPlayerEntity var8,
      @Local(ordinal = 0,argsOnly = true) Hand var9
   ) {
      Helper411 var10 = new Helper411(var4, var9, var2);
      Helper124.method1026(var10);
      if (!var10.method581()) {
         var7.call(new Object[]{var1, var2, var3, var4, var5, var6});
      }
   }
}
