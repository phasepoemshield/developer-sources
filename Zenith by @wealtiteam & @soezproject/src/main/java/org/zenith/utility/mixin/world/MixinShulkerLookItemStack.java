package org.zenith.utility.mixin.world;

import org.zenith.core.InventoryUtils;
import org.zenith.module.Module;
import org.zenith.util.Item;

import org.zenith.module.ShulkerPreview;

import org.zenith.module.ShulkerPreview;
import org.zenith.core.BotFeatureRegistry;














import java.util.Optional;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({ItemStack.class})
public abstract class MixinShulkerLookItemStack {
   public MixinShulkerLookItemStack() {
   }

   @Inject(
      method = {"getTooltipData()Ljava/util/Optional;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void injectShulkerTooltipData(CallbackInfoReturnable<Optional<TooltipData>> var1) {
      var optional = ShulkerPreview.InventoryUtils((ItemStack)(Object)this);
      if (optional.isPresent()) {
         var1.setReturnValue(optional);
      }
   }
}
