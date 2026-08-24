package kotakbaz.rain.mixin;

import net.minecraft.client.gui.tooltip.TooltipComponent;
import net.minecraft.item.tooltip.TooltipData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.دؤ;
import oxxxde.ضٍ;

// $VF: Compiled from MixinClientTooltipComponent.java
@Mixin(TooltipComponent.class)
public interface MixinClientTooltipComponent {
   @Inject(method = "method_32663", at = @At("HEAD"), cancellable = true)
   private static void rain$createShulkerPreview(TooltipData component, CallbackInfoReturnable<TooltipComponent> cir) {
      if (component instanceof دؤ shulkerPreview) {
         cir.setReturnValue(new ضٍ(shulkerPreview));
      }
   }
}
