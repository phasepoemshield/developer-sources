package fat.releon.mixins.client.screen.ingame;

import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import l.BetterMinecraft;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.PlayerListHud;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.Team;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({PlayerListHud.class})
public class PlayerListHudMixin {
   private static final Pattern NAME_PATTERN = Pattern.compile("^\\w{3,16}$");

   public PlayerListHudMixin() {
   }

   @Inject(
      method = {"collectPlayerEntries"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void addVanishedEntries(CallbackInfoReturnable<List<PlayerListEntry>> var1) {
      if (BetterMinecraft.method2760().isState() && BetterMinecraft.method2760().method2762().method2200()) {
         MinecraftClient var2 = MinecraftClient.getInstance();
         List var3 = (List)var1.getReturnValue();
         ArrayList var4 = new ArrayList();
         Scoreboard var5 = var2.world.getScoreboard();
         ArrayList<net.minecraft.scoreboard.Team> var6 = new ArrayList<>(var5.getTeams());
         var6.sort(Comparator.comparing(Team::getName));
         Collection<net.minecraft.client.network.PlayerListEntry> var7 = var2.player.networkHandler.getPlayerList();

         for (Team var9 : var6) {
            Collection<String> var10 = var9.getPlayerList();
            if (var10.size() == 1) {
               String var11 = (String)var10.iterator().next();
               if (NAME_PATTERN.matcher(var11).matches()) {
                  boolean var12 = var7.stream().anyMatch(var1x -> var1x.getProfile() != null && var11.equals(var1x.getProfile().getName()));
                  if (!var12) {
                     MutableText var13 = Text.empty()
                        .append(Text.literal("[").formatted(Formatting.GRAY))
                        .append(Text.literal("V").formatted(Formatting.RED))
                        .append(Text.literal("] ").formatted(Formatting.GRAY))
                        .append(var9.getPrefix())
                        .append(Text.literal(var11).formatted(Formatting.GRAY));
                     GameProfile var14 = new GameProfile(UUID.randomUUID(), var11);
                     PlayerListEntry var15 = new PlayerListEntry(var14, var2.isInSingleplayer());
                     var15.setDisplayName(var13);
                     var15.setListOrder(Integer.MIN_VALUE);
                     var4.add(var15);
                  }
               }
            }
         }

         ArrayList var16 = new ArrayList();
         var16.addAll(var4);
         var16.addAll(var3);
         var1.setReturnValue(var16);
      }
   }
}
