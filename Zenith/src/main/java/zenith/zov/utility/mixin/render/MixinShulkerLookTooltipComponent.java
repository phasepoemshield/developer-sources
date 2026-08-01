package zenith.zov.utility.mixin.render;

import net.minecraft.item.tooltip.TooltipData;
import net.minecraft.client.gui.tooltip.TooltipComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import zenith.ShulkerLook;

@Mixin({TooltipComponent.class})
public interface MixinShulkerLookTooltipComponent {
   @Inject(
      method = {"of(Lnet/minecraft/item/tooltip/TooltipData;)Lnet/minecraft/client/gui/tooltip/TooltipComponent;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void replaceTooltipFactory(TooltipData TooltipData, CallbackInfoReturnable<TooltipComponent> callbackinforeturnable) {
      TooltipComponent TooltipComponent = ShulkerLook.StringHolder_8(TooltipData);
      if (TooltipComponent != null) {
         callbackinforeturnable.setReturnValue(TooltipComponent);
      }
   }
}
