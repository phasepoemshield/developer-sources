package sg.mx;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.destra.util.ThreadLocalFloatSupplier;

@Mixin(LivingEntityRenderer.class)
public abstract class LivingEntityRendererGhostMixin<S extends LivingEntityRenderState, M extends EntityModel<? super S>> {
   @Shadow
   public abstract Identifier getTexture(S var1);

   @Inject(method = "getRenderLayer", at = @At("HEAD"), cancellable = true)
   private void destra$useGhostLayer(S var1, boolean var2, boolean var3, boolean var4, CallbackInfoReturnable<RenderLayer> var5) {
      if (ThreadLocalFloatSupplier.isActive() && var1 != null) {
         Identifier var6 = this.getTexture((S)var1);
         if (var6 != null) {
            var5.setReturnValue(RenderLayer.getEntityTranslucent(var6));
         }
      }
   }
}
