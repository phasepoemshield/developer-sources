package sg.mx;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameOverlayRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.core.DestraClient;
import ru.destra.module.RenderTweaksModule;

@Mixin(InGameOverlayRenderer.class)
public abstract class InGameOverlayRendererMixin {
   @Shadow
   private static void renderUnderwaterOverlay(MinecraftClient var0, MatrixStack var1, VertexConsumerProvider var2) {
   }

   @Shadow
   private static void renderFireOverlay(MatrixStack var0, VertexConsumerProvider var1) {
   }

   @Inject(method = "renderUnderwaterOverlay", at = @At("HEAD"), cancellable = true)
   private static void destra$cancelUnderwaterOverlay(MinecraftClient var0, MatrixStack var1, VertexConsumerProvider var2, CallbackInfo var3) {
      RenderTweaksModule var4 = DestraClient.getInstance() != null && DestraClient.getInstance().getModuleManager() != null
         ? DestraClient.getInstance().getModuleManager().renderTweaks
         : null;
      if (var4 != null && var4.shouldHideNauseaOverlay()) {
         var3.cancel();
      }
   }

   @Redirect(
      method = "renderOverlays",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/hud/InGameOverlayRenderer;renderUnderwaterOverlay(Lnet/minecraft/client/MinecraftClient;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;)V"
      )
   )
   private static void destra$renderUnderwaterOverlay(MinecraftClient var0, MatrixStack var1, VertexConsumerProvider var2) {
      RenderTweaksModule var3 = DestraClient.getInstance() != null && DestraClient.getInstance().getModuleManager() != null
         ? DestraClient.getInstance().getModuleManager().renderTweaks
         : null;
      if (var3 == null || !var3.shouldHideNauseaOverlay()) {
         renderUnderwaterOverlay(var0, var1, var2);
      }
   }

   @Redirect(
      method = "renderOverlays",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/hud/InGameOverlayRenderer;renderFireOverlay(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;)V")
   )
   private static void destra$renderFireOverlay(MatrixStack var0, VertexConsumerProvider var1) {
      RenderTweaksModule var2 = DestraClient.getInstance() != null && DestraClient.getInstance().getModuleManager() != null
         ? DestraClient.getInstance().getModuleManager().renderTweaks
         : null;
      if (var2 == null || !var2.shouldHideFireOverlay()) {
         renderFireOverlay(var0, var1);
      }
   }
}
