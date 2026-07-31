package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AutoDuel",
   O0000000000 = Category.Player,
   O000000000 = "Кидает за вас дуэли на ReallyWorld"
)
public class AutoDuel extends Module {
   public final GroupSetting O000000000O = new GroupSetting(
      "Режим: ",
      new BooleanSetting("Щиты", false),
      new BooleanSetting("Шипы 3", false),
      new BooleanSetting("Лук", false),
      new BooleanSetting("Тотемы", false),
      new BooleanSetting("НоДебафф", false),
      new BooleanSetting("Шары", true),
      new BooleanSetting("Классик", false),
      new BooleanSetting("Читерский рай", false),
      new BooleanSetting("Без эндер-жемчуга", false)
   );
   private final List<String> O000000000O0 = new ArrayList<>();
   private long O000000000O00 = 0L;
   private long O000000000O000 = 0L;
   private long O000000000O00O = 0L;
   private static final Pattern O000000000O0O = Pattern.compile("^\\w{3,16}$");
   private static final String[] O000000000O0O0 = new String[]{
      "Щиты", "Шипы 3", "Лук", "Тотемы", "НоДебафф", "Шары", "Классик", "Читерский рай", "Без эндер-жемчуга"
   };

   public AutoDuel() {
      this.O00000000(new Setting[]{this.O000000000O});
   }

   @Override
   public void O00000000() {
      super.O00000000();
      this.O000000000O0.clear();
      this.O000000000O00 = 0L;
      this.O000000000O000 = System.currentTimeMillis();
      this.O000000000O00O = 0L;
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.getNetworkHandler() != null) {
         this.O0000000000O00();
         List var2 = this.O0000000000O0();
         long var3 = System.currentTimeMillis();
         if (var3 - this.O000000000O000 > 800L * Math.max(var2.size(), 1)) {
            this.O000000000O0.clear();
            this.O000000000O000 = var3;
         }

         if (var3 - this.O000000000O00 > 1000L) {
            for (String var6 : (List<String>)var2) {
               if (!this.O000000000O0.contains(var6) && !var6.equals(O0000000000.player.getGameProfile().getName())) {
                  O0000000000.getNetworkHandler().sendChatCommand("duel " + var6);
                  this.O000000000O0.add(var6);
                  this.O000000000O00 = var3;
                  break;
               }
            }
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (o0000000O000OO.O00000000000() instanceof GameMessageS2CPacket var2) {
         String var4 = var2.content().getString().toLowerCase();
         if (var4.contains("начало") && var4.contains("через") && var4.contains("секунд")
            || var4.contains("дуэли » во время поединка запрещено использовать команды")
            || var4.contains("duel") && var4.contains("during") && var4.contains("forbidden")) {
            this.a_();
         }
      }
   }

   private List<String> O0000000000O0() {
      return O0000000000.getNetworkHandler()
         .getPlayerList()
         .stream()
         .map(playerListEntry -> playerListEntry.getProfile().getName())
         .filter(string -> O000000000O0O.matcher(string).matches())
         .collect(Collectors.toList());
   }

   private void O0000000000O00() {
      if (O0000000000.currentScreen instanceof GenericContainerScreen var1) {
         String var7 = var1.getTitle().getString();
         long var3 = System.currentTimeMillis();
         if (var7.contains("Выбор набора") || var7.contains("Kit selection")) {
            if (var3 - this.O000000000O00O > 90L) {
               ArrayList var5 = new ArrayList();

               for (int var6 = 0; var6 < O000000000O0O0.length; var6++) {
                  if (this.O000000000O.O000000000(O000000000O0O0[var6])) {
                     var5.add(var6);
                  }
               }

               if (!var5.isEmpty()) {
                  Collections.shuffle(var5);
                  int var8 = (Integer)var5.get(0);
                  O0000000000.interactionManager
                     .clickSlot(((GenericContainerScreenHandler)var1.getScreenHandler()).syncId, var8, 0, SlotActionType.QUICK_MOVE, O0000000000.player);
                  this.O000000000O00O = var3;
               }
            }
         } else if ((var7.contains("Настройка поединка") || var7.contains("Duel setup")) && var3 - this.O000000000O00O > 90L) {
            O0000000000.interactionManager
               .clickSlot(((GenericContainerScreenHandler)var1.getScreenHandler()).syncId, 0, 0, SlotActionType.QUICK_MOVE, O0000000000.player);
            this.O000000000O00O = var3;
         }
      }
   }
}
