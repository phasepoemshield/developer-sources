package sg.mx;

import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import ru.destra.core.DestraClient;
import ru.destra.module.HitColorModule;
import ru.destra.module.RenderTweaksModule;

@Mixin(LivingEntityRenderer.class)
public abstract class LivingEntityRendererHitColorMixin<S extends LivingEntityRenderState, M extends EntityModel<? super S>> {
   @Redirect(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/entity/LivingEntityRenderer;getOverlay(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;F)I"))
   private int destra$resolveHitOverlay(S var1, float var2) {
      int var3 = LivingEntityRenderer.getOverlay(var1, var2);
      if (var1 != null && var1.hurt && !var1.invisible) {
         DestraClient var4 = DestraClient.getInstance();
         if (var4 != null && var4.getModuleManager() != null) {
            RenderTweaksModule var5 = var4.getModuleManager().renderTweaks;
            if (var5 != null && var5.shouldHideHurtFlash()) {
               return OverlayTexture.DEFAULT_UV;
            } else {
               HitColorModule var6 = var4.getModuleManager().hitColor;
               if (var6 != null && var6.Д()) {
                  return var6.shouldColorPlayer() ? var3 : OverlayTexture.DEFAULT_UV;
               } else {
                  return var3;
               }
            }
         } else {
            return var3;
         }
      } else {
         return var3;
      }
   }
}
