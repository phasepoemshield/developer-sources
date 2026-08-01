package fat.releon.mixins.client.display.scoreboard;

import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.Team;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Scoreboard.class})
public class ScoreboardMixin {
   public ScoreboardMixin() {
   }

   @Inject(
      method = {"removeScoreHolderFromTeam"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onRemoveScoreHolderFromTeam(String var1, Team var2, CallbackInfo var3) {
      Scoreboard var4 = (Scoreboard)(Object)this;
      Team var5 = var4.getScoreHolderTeam(var1);
      if (var5 != var2) {
         var3.cancel();
      }
   }
}
