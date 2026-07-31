package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreboardDisplaySlot;
import net.minecraft.scoreboard.ScoreboardEntry;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.scoreboard.Team;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public final class ReconnectCommand extends Command {
   private static final int O00000000 = 1;
   private static final int O000000000 = 66;
   private static final long O0000000000 = 180L;
   private static final long O00000000000 = 650L;
   private static final long O000000000000 = 20000L;
   private static final long O0000000000000 = 300000L;
   private static final long O000000000000O = 600000L;
   private static ReconnectCommand O00000000000O;
   private static final Pattern O00000000000O0 = Pattern.compile(
      "(?iu)(?:клан\\s*лайт|кланлайт|clan\\s*lite|clanlite|лайт|lite|анарх(?:ия|ии)?|anarchy)[^\\d#№]{0,24}[#№]?\\s*(\\d{1,2})(?!\\d)"
   );
   private static final Pattern O00000000000OO = Pattern.compile("(?u)[#№]\\s*(\\d{1,2})(?!\\d)");
   private int O0000000000O00 = -1;
   private boolean O0000000000O0O;
   private boolean O0000000000OO;
   private boolean O0000000000OO0;
   private long O0000000000OOO;
   private long O000000000O;
   private long O000000000O0;
   private long O000000000O00;
   private boolean O000000000O000;
   private long O000000000O00O;

   public ReconnectCommand() {
      super("rct", "Перезаход на выбранную Лайт анархию", ".rct [1-66]");
      O00000000000O = this;
   }

   public static ReconnectCommand O00000000000() {
      return O00000000000O;
   }

   public void O00000000(boolean bl) {
      if (this.O000000000O000 != bl) {
         this.O000000000O000 = bl;
         this.O000000000O00O = bl ? this.O000000000000() : 0L;
      }
   }

   private long O000000000000() {
      return System.currentTimeMillis() + ThreadLocalRandom.current().nextLong(300000L, 600001L);
   }

   private void O0000000000000() {
      if (this.O000000000O000) {
         if (this.O000000000O00O == 0L) {
            this.O000000000O00O = this.O000000000000();
         } else if (System.currentTimeMillis() >= this.O000000000O00O) {
            int var1 = this.O00000000(this.O00000000000O());
            this.O000000000O00O = this.O000000000000();
            this.O000000000(new String[]{String.valueOf(var1)});
         }
      }
   }

   private int O00000000(int i) {
      byte var2 = 66;
      if (var2 <= 1) {
         return 1;
      } else {
         int var3;
         do {
            var3 = 1 + ThreadLocalRandom.current().nextInt(var2);
         } while (var3 == i);

         return var3;
      }
   }

   @Compile
   @Override
   public void O000000000(String[] strings) {
      int var2;
      if (strings.length == 0) {
         var2 = this.O00000000000O();
      } else if (strings.length == 1) {
         var2 = this.O00000000(strings[0]);
      } else {
         this.O0000000000O0();
         return;
      }

      if (!this.O000000000(var2)) {
         this.O0000000000O0();
         return;
      }

      if (a_.player == null || a_.world == null) {
         ChatUtil.O00000000("§c[RCT] Игрок не подключён к миру.");
         return;
      }

      this.O0000000000O();
      this.O0000000000O00 = var2;
      this.O0000000000O0O = true;
      this.O0000000000OOO = System.currentTimeMillis();
      this.O000000000O = 0L;
      ChatUtil.O00000000("§a[RCT] Подключаю к Лайт анархии #" + var2 + "...");
      this.O000000000000O();
   }

   @EventHandler
   public void O00000000(O0000000O0O0O0 o0000000O0O0O0) {
      if (a_.player != null && a_.world != null && a_.interactionManager != null) {
         if (!this.O0000000000O0O) {
            this.O0000000000000();
         } else {
            long var2 = System.currentTimeMillis();
            if (var2 - this.O0000000000OOO > 20000L) {
               this.O00000000000("Истекло время ожидания меню или подключения.");
            } else if (this.O0000000000OO0 && this.O00000000000O() == this.O0000000000O00) {
               this.O00000000000OO();
            } else if (this.O0000000000OO0 && var2 - this.O000000000O0 > 8000L) {
               this.O00000000000("Сервер не подтвердил подключение к анархии #" + this.O0000000000O00 + ".");
            } else if (a_.currentScreen instanceof GenericContainerScreen var4) {
               this.O00000000(var4, var2);
            } else {
               if (var2 - this.O000000000O >= 650L) {
                  this.O000000000000O();
                  this.O000000000O = var2;
               }
            }
         }
      }
   }

   private void O00000000(GenericContainerScreen genericContainerScreen, long l) {
      if (l - this.O000000000O >= 180L) {
         String var4 = this.O0000000000(genericContainerScreen.getTitle().getString());
         if (!var4.contains("выберите режим") && !var4.contains("select mode")) {
            if (var4.contains("выбор лайт анархии") || var4.contains("lite anarchy")) {
               Slot var8 = this.O000000000(genericContainerScreen);
               if (var8 == null) {
                  if (this.O0000000000OO && l - this.O000000000O >= 1200L) {
                     this.O0000000000OO = false;
                  }

                  if (!this.O0000000000OO) {
                     List var6 = this.O0000000000(genericContainerScreen)
                        .stream()
                        .filter(slot -> slot.getStack().isOf(Items.ARMOR_STAND))
                        .sorted(Comparator.comparingInt(slot -> slot.id))
                        .toList();
                     int var7 = this.O0000000000(this.O0000000000O00);
                     if (var7 >= 0 && var7 < var6.size()) {
                        this.O00000000(genericContainerScreen, (Slot)var6.get(var7));
                        this.O0000000000OO = true;
                        this.O000000000O = l;
                     }
                  }
               } else {
                  if (!this.O0000000000OO0 || l - this.O000000000O >= 1200L) {
                     this.O00000000(genericContainerScreen, var8);
                     this.O0000000000OO0 = true;
                     this.O000000000O0 = l;
                     this.O000000000O = l;
                  }
               }
            }
         } else {
            if (this.O000000000O00 == 0L) {
               this.O000000000O00 = l;
            }

            Slot var5 = this.O00000000(genericContainerScreen);
            if (var5 != null) {
               this.O00000000(genericContainerScreen, var5, SlotActionType.PICKUP);
               this.O0000000000OO = false;
               this.O000000000O00 = 0L;
               this.O000000000O = l;
            } else if (l - this.O000000000O00 >= 3000L) {
               this.O00000000000("Режим Лайт отсутствует в меню выбора.");
            }
         }
      }
   }

   private Slot O00000000(GenericContainerScreen genericContainerScreen) {
      Slot var2 = null;

      for (Slot var4 : this.O0000000000(genericContainerScreen)) {
         ItemStack var5 = var4.getStack();
         if (var5.isOf(Items.PLAYER_HEAD)) {
            String var6 = this.O0000000000(var5.getName().getString());
            if (var6.equals("лайт") || var6.equals("lite")) {
               return var4;
            }

            String var7 = this.O00000000(var5);
            if ((var7.contains("анархия лайт") || var7.contains("lite anarchy"))
               && (var7.matches("(?s).*анархия\\s*1\\D+16.*") || var7.matches("(?s).*anarchy\\s*1\\D+16.*"))) {
               var2 = var4;
            }
         }
      }

      return var2;
   }

   private Slot O000000000(GenericContainerScreen genericContainerScreen) {
      Pattern var2 = Pattern.compile("(?iu)#\\s*0*" + this.O0000000000O00 + "(?!\\d)");

      for (Slot var4 : this.O0000000000(genericContainerScreen)) {
         ItemStack var5 = var4.getStack();
         if (!var5.isEmpty() && !var5.isOf(Items.ARMOR_STAND) && var2.matcher(this.O00000000(var5)).find()) {
            return var4;
         }
      }

      return null;
   }

   private List<Slot> O0000000000(GenericContainerScreen genericContainerScreen) {
      ArrayList var2 = new ArrayList();
      ScreenHandler var3 = genericContainerScreen.getScreenHandler();

      for (Slot var5 : var3.slots) {
         if (a_.player == null || var5.inventory != a_.player.getInventory()) {
            var2.add(var5);
         }
      }

      return var2;
   }

   private String O00000000(ItemStack itemStack) {
      StringBuilder var2 = new StringBuilder(itemStack.getName().getString());
      LoreComponent var3 = (LoreComponent)itemStack.get(DataComponentTypes.LORE);
      if (var3 != null) {
         for (Text var5 : var3.lines()) {
            var2.append(' ').append(var5.getString());
         }
      }

      return this.O0000000000(var2.toString());
   }

   private void O00000000(GenericContainerScreen genericContainerScreen, Slot slot) {
      this.O00000000(genericContainerScreen, slot, SlotActionType.QUICK_MOVE);
   }

   private void O00000000(GenericContainerScreen genericContainerScreen, Slot slot, SlotActionType slotActionType) {
      a_.interactionManager.clickSlot(((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).syncId, slot.id, 0, slotActionType, a_.player);
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (this.O0000000000O0O && o0000000O000OO.O000000000000() == O0000000O000OO.W24.RECEIVE) {
         if (o0000000O000OO.O00000000000() instanceof GameMessageS2CPacket var2) {
            String var4 = this.O0000000000(var2.content().getString());
            if (!var4.isEmpty()) {
               if (!this.O0000000000OO0 || !var4.contains("вы уже подключены к этому серверу") && !var4.contains("already connected to this server")) {
                  if (this.O000000000(var4)) {
                     this.O00000000000("Подключение не выполнено: " + var2.content().getString());
                  }
               } else {
                  this.O00000000000OO();
               }
            }
         }
      }
   }

   private void O000000000000O() {
      PlayerInventory var1 = a_.player.getInventory();

      for (int var2 = 0; var2 < 9; var2++) {
         if (var1.getStack(var2).isOf(Items.COMPASS)) {
            if (var1.getSelectedSlot() != var2) {
               var1.setSelectedSlot(var2);
               a_.player.networkHandler.sendPacket(new UpdateSelectedSlotC2SPacket(var2));
            }

            a_.interactionManager.interactItem(a_.player, Hand.MAIN_HAND);
            return;
         }
      }
   }

   private int O00000000000O() {
      int var1 = this.O00000000000O0();
      if (this.O000000000(var1)) {
         return var1;
      } else {
         O0000O000OOOO.O00000000.O00000000();
         return this.O00000000(O0000O000OOOO.O00000000.O0000000000());
      }
   }

   private int O00000000000O0() {
      if (a_.world == null) {
         return -1;
      } else {
         Scoreboard var1 = a_.world.getScoreboard();
         ScoreboardObjective var2 = var1.getObjectiveForSlot(ScoreboardDisplaySlot.SIDEBAR);
         if (var2 == null) {
            return -1;
         } else {
            ArrayList var3 = new ArrayList();
            var3.add(var2.getDisplayName().getString());

            for (ScoreboardEntry var6 : var1.getScoreboardEntries(var2)) {
               Team var7 = var1.getScoreHolderTeam(var6.owner());
               var3.add(Team.decorateName(var7, Text.literal(var6.owner())).getString());
            }

            for (String var10 : (List<String>)var3) {
               int var12 = this.O00000000(O00000000000O0, var10);
               if (this.O000000000(var12)) {
                  return var12;
               }
            }

            for (String var11 : (List<String>)var3) {
               int var13 = this.O00000000(O00000000000OO, var11);
               if (this.O000000000(var13)) {
                  return var13;
               }
            }

            return -1;
         }
      }
   }

   private int O00000000(Pattern pattern, String string) {
      Matcher var3 = pattern.matcher(this.O0000000000(string));
      return !var3.find() ? -1 : this.O00000000(var3.group(1));
   }

   private boolean O000000000(int i) {
      return i >= 1 && i <= 66;
   }

   private int O00000000(String string) {
      if (string == null) {
         return -1;
      } else {
         String var2 = string.replaceAll("\\D+", "");
         if (var2.isEmpty()) {
            return -1;
         } else {
            try {
               return Integer.parseInt(var2);
            } catch (NumberFormatException var4) {
               return -1;
            }
         }
      }
   }

   private int O0000000000(int i) {
      if (i <= 15) {
         return 0;
      } else if (i <= 31) {
         return 1;
      } else {
         return i <= 47 ? 2 : 3;
      }
   }

   private boolean O000000000(String string) {
      return string.contains("сервер заполнен")
         || string.contains("были кикнуты при подключении")
         || string.contains("не удалось подключ")
         || string.contains("ошибка подключения")
         || string.contains("сервер недоступен")
         || string.contains("нет свободных слотов")
         || string.contains("failed to connect")
         || string.contains("could not connect")
         || string.contains("server is full")
         || string.contains("server unavailable");
   }

   private String O0000000000(String string) {
      return string == null ? "" : string.replaceAll("(?i)§.", "").replace(' ', ' ').replaceAll("\\s+", " ").trim().toLowerCase(Locale.ROOT);
   }

   private void O00000000000OO() {
      this.O0000000000O();
   }

   private void O00000000000(String string) {
      ChatUtil.O00000000("§c[RCT] " + string);
      this.O0000000000O();
   }

   private void O0000000000O() {
      this.O0000000000O0O = false;
      this.O0000000000OO = false;
      this.O0000000000OO0 = false;
      this.O0000000000O00 = -1;
      this.O0000000000OOO = 0L;
      this.O000000000O = 0L;
      this.O000000000O0 = 0L;
      this.O000000000O00 = 0L;
   }

   private void O0000000000O0() {
      ChatUtil.O00000000("§cИспользование: " + this.O0000000000());
      ChatUtil.O00000000("§7Без номера команда использует текущую анархию из scoreboard.");
   }

   static {
      Loader.initialize();
   }
}
