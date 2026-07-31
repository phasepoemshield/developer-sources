package fat.releon.mixins.player.entity;

import l.Esp;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({EntityRenderer.class})
public abstract class EntityRendererMixin<S extends EntityRenderState> {
   public EntityRendererMixin() {
   }

   @Inject(
      method = {"renderLabelIfPresent"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderLabelIfPresent(S var1, Text var2, MatrixStack var3, VertexConsumerProvider var4, int var5, CallbackInfo var6) {
      if (Esp.method2022().isState() && this.canRemove((int)(var1.width * 100.0F), Esp.method2022())) {
         var6.cancel();
      }
   }

   @Unique
   private boolean canRemove(int var1, Esp var2) {
      return switch (var1) {
         case 60 -> var2.entityType.method2588("Player");
         case 98 -> var2.entityType.method2588("TNT");
         default -> false;
      };
   }
}
