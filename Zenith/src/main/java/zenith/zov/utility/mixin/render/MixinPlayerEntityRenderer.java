package zenith.zov.utility.mixin.render;

import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.text.Text;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumerProvider;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zenith.floatHolder_3;
import zenith.Entityesp;

@Mixin({PlayerEntityRenderer.class})
public class MixinPlayerEntityRenderer {
   @Inject(
      method = {"renderLabelIfPresent(Lnet/minecraft/client/render/entity/state/PlayerEntityRenderState;Lnet/minecraft/text/Text;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void render(PlayerEntityRenderState PlayerEntityRenderState, Text Text, MatrixStack MatrixStack, VertexConsumerProvider VertexConsumerProvider, int i, CallbackInfo callbackinfo) {
      if (Entityesp.lIIlIlIII1ll11.Ill111lI1lIII1l1()) {
         callbackinfo.cancel();
      }

      if (floatHolder_3.SecureRandomHolder_2(PlayerEntityRenderState.id)) {
         callbackinfo.cancel();
      }
   }
}
