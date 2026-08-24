package org.zenith.utility.mixin.render;

import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.util.Item;

import org.zenith.module.Interface;
import org.zenith.module.ShulkerPreview;

import org.zenith.module.Interface;
import org.zenith.module.ShulkerPreview;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;















import net.minecraft.client.gui.tooltip.TooltipComponent;
import net.minecraft.item.tooltip.TooltipData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({TooltipComponent.class})
public interface MixinShulkerLookTooltipComponent {
   @Inject(
      method = {"of(Lnet/minecraft/item/tooltip/TooltipData;)Lnet/minecraft/client/gui/tooltip/TooltipComponent;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void replaceTooltipFactory(TooltipData var0, CallbackInfoReturnable<TooltipComponent> var1) {
      TooltipComponent tooltipcomponent = ShulkerPreview.on23(var0);
      if (tooltipcomponent != null) {
         var1.setReturnValue(tooltipcomponent);
      }
   }
}
