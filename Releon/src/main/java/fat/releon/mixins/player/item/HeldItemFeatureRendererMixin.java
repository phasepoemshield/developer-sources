package fat.releon.mixins.player.item;

import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.feature.HeldItemFeatureRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.ModelWithArms;
import net.minecraft.client.render.entity.state.ArmedEntityRenderState;
import net.minecraft.client.render.item.ItemRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Arm;
import net.minecraft.util.math.RotationAxis;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({HeldItemFeatureRenderer.class})
public abstract class HeldItemFeatureRendererMixin<S extends ArmedEntityRenderState, M extends EntityModel<S> & ModelWithArms> extends FeatureRenderer<S, M> {
   protected HeldItemFeatureRendererMixin(FeatureRendererContext<S, M> var1) {
      super(var1);
   }

   @Inject(
      method = {"renderItem"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void releon$renderWithoutBrokenFiguraState(
      S var1, ItemRenderState var2, Arm var3, MatrixStack var4, VertexConsumerProvider var5, int var6, CallbackInfo var7
   ) {
      if (!var2.isEmpty()) {
         if (!this.hasFiguraAvatar(var1)) {
            this.releon$renderVanillaHeldItem(var2, var3, var4, var5, var6);
            var7.cancel();
         }
      }
   }

   private boolean hasFiguraAvatar(S var1) {
      try {
         Class var2 = Class.forName("org.figuramc.figura.avatar.AvatarManager");
         Object var3 = var2.getMethod("getAvatar", Object.class).invoke(null, var1);
         if (var3 != null) {
            Object var4 = var3.getClass().getField("renderer").get(var3);
            return var4 != null;
         }
      } catch (Throwable var5) {
      }

      return false;
   }

   private void releon$renderVanillaHeldItem(ItemRenderState var1, Arm var2, MatrixStack var3, VertexConsumerProvider var4, int var5) {
      var3.push();
      this.getContextModel().setArmAngle(var2, var3);
      var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-90.0F));
      var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180.0F));
      boolean var6 = var2 == Arm.LEFT;
      var3.translate((var6 ? -1.0F : 1.0F) / 16.0F, 0.125F, -0.625F);
      var1.render(var3, var4, var5, OverlayTexture.DEFAULT_UV);
      var3.pop();
   }
}
