package zenith.zov.utility.mixin.world;

import java.util.Optional;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import zenith.ShulkerLook;

@Mixin({ItemStack.class})
public abstract class MixinShulkerLookItemStack {
   @Inject(
      method = {"getTooltipData()Ljava/util/Optional;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void injectShulkerTooltipData(CallbackInfoReturnable<Optional<TooltipData>> callbackinforeturnable) {
      Optional optional = ShulkerLook.byteHolder((ItemStack)this);
      if (optional.isPresent()) {
         callbackinforeturnable.setReturnValue(optional);
      }
   }
}
