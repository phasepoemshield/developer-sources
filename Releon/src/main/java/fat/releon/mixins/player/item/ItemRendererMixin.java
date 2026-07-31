package fat.releon.mixins.player.item;

import l.Helper283;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack.Entry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({ItemRenderer.class})
public class ItemRendererMixin {
   public ItemRendererMixin() {
   }

   @Inject(
      method = {"getItemGlintConsumer"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private static void releon$wrapItemGlintConsumer(
      VertexConsumerProvider var0, RenderLayer var1, boolean var2, boolean var3, CallbackInfoReturnable<VertexConsumer> var4
   ) {
      if (Helper283.method2778()) {
         var4.setReturnValue(Helper283.method2779((VertexConsumer)var4.getReturnValue()));
      }
   }

   @Inject(
      method = {"getDynamicDisplayGlintConsumer"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private static void releon$wrapDynamicGlintConsumer(VertexConsumerProvider var0, RenderLayer var1, Entry var2, CallbackInfoReturnable<VertexConsumer> var3) {
      if (Helper283.method2778()) {
         var3.setReturnValue(Helper283.method2779((VertexConsumer)var3.getReturnValue()));
      }
   }
}
