package org.wild.mixin;

import net.minecraft.scoreboard.Team;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.ProtectInfo;

@Mixin({Team.class})
public class TeamMixin {
   @Inject(
      method = {"decorateName"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void litka$maskScoreboardTeam(Text text, CallbackInfoReturnable<MutableText> callbackInfoReturnable) {
      MutableText var3 = (MutableText)callbackInfoReturnable.getReturnValue();
      if (var3 != null) {
         callbackInfoReturnable.setReturnValue((MutableText)ProtectInfo.O000000000(var3));
      }
   }
}
