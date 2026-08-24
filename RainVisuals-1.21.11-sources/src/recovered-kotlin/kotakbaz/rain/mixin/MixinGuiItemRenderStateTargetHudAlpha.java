package kotakbaz.rain.mixin;

import net.minecraft.client.gui.render.state.ItemGuiElementRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import oxxxde.تث;

// $VF: Compiled from MixinGuiItemRenderStateTargetHudAlpha.java
@Mixin(ItemGuiElementRenderState.class)
public class MixinGuiItemRenderStateTargetHudAlpha implements تث {
   @Unique
   private float rain$targetHudAlpha = 1.0F;

   @Override
   public void rain$setTargetHudAlpha(float alpha) {
      this.rain$targetHudAlpha = alpha;
   }

   @Override
   public float rain$getTargetHudAlpha() {
      return this.rain$targetHudAlpha;
   }
}
