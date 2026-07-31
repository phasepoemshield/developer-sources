package zenith.zov.utility.mixin.render;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.text.Text;
import net.minecraft.scoreboard.Team;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.PlayerListHud;
import net.minecraft.text.MutableText;
import net.minecraft.client.network.PlayerListEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import zenith.Nameprotect;
import zenith.ZenithClient;

@Mixin({PlayerListHud.class})
public abstract class MixinPlayerListHud {
   @Shadow
   protected abstract Text applyGameModeFormatting(PlayerListEntry PlayerListEntry, MutableText MutableText);

   @Inject(
      method = {"getPlayerName"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void getPlayerName(PlayerListEntry PlayerListEntry, CallbackInfoReturnable<Text> callbackinforeturnable) {
      if (Nameprotect.l1I1I1l1lI11l111I1lI111llll1l.Spider()
         && (
            PlayerListEntry.getProfile().equals(MinecraftClient.getInstance().getGameProfile())
               || Nameprotect.l1I1I1l1lI11l111I1lI111llll1l.Illll1Il11Illl1Il1Ill1IlIIII()
                  && ZenithClient.getInstance()
                     .StringHolder_26()
                     .StringHolder_15(PlayerListEntry.getProfile().getName())
         )) {
         callbackinforeturnable.setReturnValue(
            Nameprotect.l1I1I1l1lI11l111I1lI111llll1l
               .ZenithInternal095(
                  PlayerListEntry.getDisplayName() != null
                     ? this.applyGameModeFormatting(PlayerListEntry, PlayerListEntry.getDisplayName().copy())
                     : this.applyGameModeFormatting(PlayerListEntry, Team.decorateName(PlayerListEntry.getScoreboardTeam(), Text.literal(PlayerListEntry.getProfile().getName())))
               )
         );
      }
   }

   @Inject(
      method = {"collectPlayerEntries"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void collectPlayerEntries(CallbackInfoReturnable<List<PlayerListEntry>> callbackinforeturnable) {
      MinecraftClient MinecraftClient = MinecraftClient.getInstance();
      if (MinecraftClient.player != null && Nameprotect.l1I1I1l1lI11l111I1lI111llll1l.Spider()) {
         int i = Nameprotect.l1I1I1l1lI11l111I1lI111llll1l.IIIIIlllIIlI1llIIIl11();
         if (i != Integer.MIN_VALUE) {
            List list = (List)callbackinforeturnable.getReturnValue();
            if (list != null && list.size() >= 2) {
               ArrayList arraylist = new ArrayList(list);
               int j = -1;

               for (int k = 0; k < arraylist.size(); k++) {
                  if (((PlayerListEntry)arraylist.get(k)).getProfile().getId().equals(MinecraftClient.player.getUuid())) {
                     j = k;
                     break;
                  }
               }

               if (j != -1) {
                  int l = Math.max(0, Math.min(arraylist.size() - 1, i));
                  if (l != j) {
                     PlayerListEntry PlayerListEntry = (PlayerListEntry)arraylist.remove(j);
                     if (l > j) {
                        l--;
                     }

                     arraylist.add(Math.min(arraylist.size(), l), PlayerListEntry);
                     callbackinforeturnable.setReturnValue(arraylist);
                  }
               }
            }
         }
      }
   }
}
