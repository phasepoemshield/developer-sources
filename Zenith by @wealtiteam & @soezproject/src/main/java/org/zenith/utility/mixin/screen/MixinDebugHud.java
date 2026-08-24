package org.zenith.utility.mixin.screen;

import org.zenith.core.PotionItemBuilder;

import org.zenith.util.TextUtils;
import org.zenith.core.BotFeatureRegistry;
















import java.util.List;
import net.minecraft.client.gui.hud.DebugHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({DebugHud.class})
public abstract class MixinDebugHud {
   public MixinDebugHud() {
   }

   @Inject(
      method = {"getLeftText"},
      at = {@At("RETURN")},
      cancellable = true
   )
   public void zenith_randomizeLeftCoords(CallbackInfoReturnable<List<String>> var1) {
      if (TextUtils.isActive()) {
         var1.setReturnValue(TextUtils.PotionItemBuilder((List)var1.getReturnValue()));
      }
   }

   @Inject(
      method = {"getRightText"},
      at = {@At("RETURN")},
      cancellable = true
   )
   public void zenith_randomizeRightCoords(CallbackInfoReturnable<List<String>> var1) {
      if (TextUtils.isActive()) {
         var1.setReturnValue(TextUtils.PotionItemBuilder((List)var1.getReturnValue()));
      }
   }
}
