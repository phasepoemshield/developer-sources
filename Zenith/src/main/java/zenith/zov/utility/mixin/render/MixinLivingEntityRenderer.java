package zenith.zov.utility.mixin.render;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import zenith.ListHolder_2;
import zenith.ZenithClient;
import zenith.ZenithInternal076;
import zenith.EventBus;
import zenith.Event;
import zenith.ZenithInternal139;

@Mixin({LivingEntityRenderer.class})
public abstract class MixinLivingEntityRenderer<T extends LivingEntity, S extends LivingEntityRenderState, M extends EntityModel<? super S>>
   implements ZenithInternal076 {
   @ModifyExpressionValue(
      method = {"updateRenderState(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;F)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/entity/LivingEntityRenderer;clampBodyYaw(Lnet/minecraft/entity/LivingEntity;FF)F"
      )}
   )
   public float changeYaw(float f, LivingEntity LivingEntity) {
      return LivingEntity.equals(l11I1I1ll1Illll1I1l1111l1II.player)
            && !ZenithClient.getInstance().ZenithInternal057().IllIlII1l1IIII11lllll1III1()
         ? MathHelper.lerpAngleDegrees(
            ListHolder_2.Interface(),
            ZenithClient.getInstance().ZenithInternal057().l1lII1IllIII().AutoBrewing(),
            ZenithClient.getInstance().ZenithInternal057().I111Ill1lIllIIIl().AutoBrewing()
         )
         : f;
   }

   @ModifyExpressionValue(
      method = {"updateRenderState(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;F)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/util/math/MathHelper;lerpAngleDegrees(FFF)F"
      )}
   )
   public float changeHeadYaw(float f, LivingEntity LivingEntity) {
      return LivingEntity.equals(l11I1I1ll1Illll1I1l1111l1II.player)
            && !ZenithClient.getInstance().ZenithInternal057().IllIlII1l1IIII11lllll1III1()
         ? MathHelper.lerpAngleDegrees(
            ListHolder_2.Interface(),
            ZenithClient.getInstance().ZenithInternal057().l1lII1IllIII().AutoBrewing(),
            ZenithClient.getInstance().ZenithInternal057().I111Ill1lIllIIIl().AutoBrewing()
         )
         : f;
   }

   @ModifyExpressionValue(
      method = {"updateRenderState(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;F)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/LivingEntity;getLerpedPitch(F)F"
      )}
   )
   public float changePitch(float f, LivingEntity LivingEntity) {
      return LivingEntity.equals(l11I1I1ll1Illll1I1l1111l1II.player)
            && !ZenithClient.getInstance().ZenithInternal057().IllIlII1l1IIII11lllll1III1()
         ? MathHelper.lerpAngleDegrees(
            ListHolder_2.Interface(),
            ZenithClient.getInstance().ZenithInternal057().l1lII1IllIII().Basefinder(),
            ZenithClient.getInstance().ZenithInternal057().I111Ill1lIllIIIl().Basefinder()
         )
         : f;
   }

   @Shadow
   @Nullable
   protected abstract RenderLayer getRenderLayer(LivingEntityRenderState LivingEntityRenderState, boolean flag, boolean flag1, boolean flag2);

   @Redirect(
      method = {"render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/entity/LivingEntityRenderer;getRenderLayer(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;ZZZ)Lnet/minecraft/client/render/RenderLayer;"
      )
   )
   private RenderLayer renderHook(LivingEntityRenderer LivingEntityRenderer, LivingEntityRenderState LivingEntityRenderState, boolean flag, boolean flag1, boolean flag2) {
      if (!flag1 && LivingEntityRenderState.width == 0.6F) {
         ZenithInternal139 ll1l1ii1ll1li1il = new ZenithInternal139(-1);
         EventBus.StringHolder_8((Event)ll1l1ii1ll1li1il);
         if (ll1l1ii1ll1li1il.Event()) {
            flag1 = true;
         }
      }

      return this.getRenderLayer(LivingEntityRenderState, flag, flag1, flag2);
   }

   @Redirect(
      method = {"render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/entity/model/EntityModel;render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;III)V"
      )
   )
   private void renderModelHook(
      EntityModel<?> EntityModel, MatrixStack MatrixStack, VertexConsumer VertexConsumer, int i, int j, int k, @Local(ordinal = 0,argsOnly = true) LivingEntityRenderState LivingEntityRenderState
   ) {
      ZenithInternal139 ll1l1ii1ll1li1il = new ZenithInternal139(k);
      if (LivingEntityRenderState.invisibleToPlayer) {
         EventBus.StringHolder_8((Event)ll1l1ii1ll1li1il);
      }

      EntityModel.render(MatrixStack, VertexConsumer, i, j, ll1l1ii1ll1li1il.AutocraftHolder());
   }
}
