package org.wild.mixin;

import net.minecraft.client.gui.hud.PlayerListHud;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.ProtectInfo;

@Mixin({PlayerListHud.class})
public class PlayerListHudMixin {
   @Inject(
      method = {"getPlayerName"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void litka$maskTabName(PlayerListEntry playerListEntry, CallbackInfoReturnable<Text> callbackInfoReturnable) {
      Text var3 = (Text)callbackInfoReturnable.getReturnValue();
      if (var3 != null) {
         callbackInfoReturnable.setReturnValue(ProtectInfo.O00000000(var3));
      }
   }
}
