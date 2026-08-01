package sg.mx;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.ElytraFeatureRenderer;
import net.minecraft.client.render.entity.state.BipedEntityRenderState;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.model.CustomModelInstance;
import ru.destra.model.CustomModelManager;

@Mixin(ElytraFeatureRenderer.class)
public abstract class ElytraFeatureRendererMixin {
   @Inject(method = "render", at = @At("HEAD"), cancellable = true)
   private void destra$hideElytraForCustomModel(
      MatrixStack var1, VertexConsumerProvider var2, int var3, BipedEntityRenderState var4, float var5, float var6, CallbackInfo var7
   ) {
      if (var4 instanceof PlayerEntityRenderState var8) {
         MinecraftClient var9 = MinecraftClient.getInstance();
         if (var9.player != null && var8.id == var9.player.getId()) {
            CustomModelInstance var10 = CustomModelManager.Р().Ъ();
            if (var10 != null && var10.shouldHideElytra()) {
               var7.cancel();
            }
         }
      }
   }
}
