package kotakbaz.rain.mixin;

import net.minecraft.client.gui.hud.InGameOverlayRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.random.Random;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.صِ;

// $VF: Compiled from MixinRenderTweaksInGameOverlayRenderer.java
@Mixin(InGameOverlayRenderer.class)
public class MixinRenderTweaksInGameOverlayRenderer {
   @Inject(method = "method_70938", at = @At("HEAD"), cancellable = true)
   private void rain$cancelTotemAnimation(ItemStack random, Random ci, CallbackInfo stack) {
      if (صِ.INSTANCE.isEnabled()) {
         if (صِ.INSTANCE.getNoTotemAnimation().getValue() && stack.isOf(Items.TOTEM_OF_UNDYING)) {
            ci.cancel();
         }
      }
   }
}
