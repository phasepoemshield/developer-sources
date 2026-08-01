package zenith.zov.utility.mixin.render;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.util.Hand;
import net.minecraft.util.Arm;
import net.minecraft.item.ItemStack;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.component.DataComponentTypes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zenith.Swinganimation;
import zenith.Viewmodel;
import zenith.EventBus;
import zenith.EventImpl_23;
import zenith.Event;
import zenith.Aura;

@Mixin({HeldItemRenderer.class})
public abstract class MixinHeldItemRenderer {
   @Shadow
   protected abstract void swingArm(float f, float f1, MatrixStack MatrixStack, int i, Arm Arm);

   @Inject(
      method = {"renderFirstPersonItem"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/item/HeldItemRenderer;renderItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ModelTransformationMode;ZLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V",
         ordinal = 0
      )}
   )
   public void injectBeforeRenderCrossBowItem(
      AbstractClientPlayerEntity AbstractClientPlayerEntity,
      float f,
      float f1,
      Hand Hand,
      float f2,
      ItemStack ItemStack,
      float f3,
      MatrixStack MatrixStack,
      VertexConsumerProvider VertexConsumerProvider,
      int i,
      CallbackInfo callbackinfo
   ) {
      Viewmodel i111i11illl1llli11i1i11li11111 = Viewmodel.lIll1lll1lI1I;
      if (i111i11illl1llli11i1i11li11111.Spider()) {
         boolean flag = Hand == Hand.MAIN_HAND;
         Arm Arm = flag ? AbstractClientPlayerEntity.getMainArm() : AbstractClientPlayerEntity.getMainArm().getOpposite();
         i111i11illl1llli11i1i11li11111.StringHolder_8(MatrixStack, Arm);
      }
   }

   @Inject(
      method = {"renderFirstPersonItem"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/item/HeldItemRenderer;renderItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ModelTransformationMode;ZLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V",
         ordinal = 1
      )}
   )
   public void injectBeforeRenderItem(
      AbstractClientPlayerEntity AbstractClientPlayerEntity,
      float f,
      float f1,
      Hand Hand,
      float f2,
      ItemStack ItemStack,
      float f3,
      MatrixStack MatrixStack,
      VertexConsumerProvider VertexConsumerProvider,
      int i,
      CallbackInfo callbackinfo
   ) {
      Viewmodel i111i11illl1llli11i1i11li11111 = Viewmodel.lIll1lll1lI1I;
      if (i111i11illl1llli11i1i11li11111.Spider()) {
         boolean flag = Hand == Hand.MAIN_HAND;
         Arm Arm = flag ? AbstractClientPlayerEntity.getMainArm() : AbstractClientPlayerEntity.getMainArm().getOpposite();
         i111i11illl1llli11i1i11li11111.StringHolder_8(MatrixStack, Arm);
      }
   }

   @Inject(
      method = {"renderFirstPersonItem"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/util/math/MatrixStack;push()V",
         shift = Shift.AFTER,
         ordinal = 0
      )}
   )
   public void injectAfterMatrixPushHandPosition(
      AbstractClientPlayerEntity AbstractClientPlayerEntity,
      float f,
      float f1,
      Hand Hand,
      float f2,
      ItemStack ItemStack,
      float f3,
      MatrixStack MatrixStack,
      VertexConsumerProvider VertexConsumerProvider,
      int i,
      CallbackInfo callbackinfo
   ) {
      Viewmodel i111i11illl1llli11i1i11li11111 = Viewmodel.lIll1lll1lI1I;
      if (i111i11illl1llli11i1i11li11111.Spider() && !ItemStack.isEmpty() && !ItemStack.contains(DataComponentTypes.MAP_ID)) {
         boolean flag = Hand == Hand.MAIN_HAND;
         Arm Arm = flag ? AbstractClientPlayerEntity.getMainArm() : AbstractClientPlayerEntity.getMainArm().getOpposite();
         i111i11illl1llli11i1i11li11111.EventBus(MatrixStack, Arm);
      }
   }

   @Redirect(
      method = {"renderFirstPersonItem"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/item/HeldItemRenderer;swingArm(FFLnet/minecraft/client/util/math/MatrixStack;ILnet/minecraft/util/Arm;)V",
         ordinal = 2
      )
   )
   public void redirectSwingArmForCustomAnim(HeldItemRenderer HeldItemRenderer, float f, float f1, MatrixStack MatrixStack, int i, Arm Arm) {
      Swinganimation i1111lilll1li11iil = Swinganimation.I111l11lIl1llIIl1IlI1I1lII1;
      if (i1111lilll1li11iil.Spider()) {
         if (Arm == Arm.RIGHT) {
            if (i1111lilll1li11iil.IIll11lI1IlII11l1l1I1lI1.Spider()
               && Aura.ll1II1l1lII11IlII1.Spider()
               && Aura.ll1II1l1lII11IlII1.lI1IIllII11I() != null) {
               i1111lilll1li11iil.StringHolder_8(MatrixStack, f, f1, Arm);
            } else if (!i1111lilll1li11iil.IIll11lI1IlII11l1l1I1lI1.Spider()) {
               i1111lilll1li11iil.StringHolder_8(MatrixStack, f, f1, Arm);
            } else if (i1111lilll1li11iil.IIll11lI1IlII11l1l1I1lI1.Spider() && !Aura.ll1II1l1lII11IlII1.Spider()
               || Aura.ll1II1l1lII11IlII1.lI1IIllII11I() == null) {
               this.swingArm(f, f1, MatrixStack, i, Arm);
            }
         } else {
            this.swingArm(f, f1, MatrixStack, i, Arm);
         }
      } else {
         this.swingArm(f, f1, MatrixStack, i, Arm);
      }
   }

   @WrapOperation(
      method = {"renderItem(FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;Lnet/minecraft/client/network/ClientPlayerEntity;I)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/item/HeldItemRenderer;renderFirstPersonItem(Lnet/minecraft/client/network/AbstractClientPlayerEntity;FFLnet/minecraft/util/Hand;FLnet/minecraft/item/ItemStack;FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"
      )}
   )
   private void itemRenderHook(
      HeldItemRenderer HeldItemRenderer,
      AbstractClientPlayerEntity AbstractClientPlayerEntity,
      float f,
      float f1,
      Hand Hand,
      float f2,
      ItemStack ItemStack,
      float f3,
      MatrixStack MatrixStack,
      VertexConsumerProvider VertexConsumerProvider,
      int i,
      Operation<Void> operation
   ) {
      EventImpl_23 l1i1lii1lli1il1i11lii1lll = new EventImpl_23(AbstractClientPlayerEntity, ItemStack, Hand);
      EventBus.StringHolder_8((Event)l1i1lii1lli1il1i11lii1lll);
      operation.call(
         new Object[]{
            HeldItemRenderer,
            l1i1lii1lli1il1i11lii1lll.Jumpcircle(),
            f,
            f1,
            l1i1lii1lli1il1i11lii1lll.Menu(),
            f2,
            l1i1lii1lli1il1i11lii1lll.Killeffect(),
            f3,
            MatrixStack,
            VertexConsumerProvider,
            i
         }
      );
   }
}
