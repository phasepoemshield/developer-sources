package ru.metaculture.protection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AutoResell",
   O0000000000 = Category.Misc,
   O000000000 = "Автоматически перевыставляет товары"
)
public class AutoResell extends Module {
   public static AutoResell O000000000O;
   private final O0000O00O0000 O000000000O0 = new O0000O00O0000();
   private final O0000O00O0000 O000000000O00 = new O0000O00O0000();
   private final O0000O00O0000 O000000000O000 = new O0000O00O0000();
   private static final long O000000000O00O = 900L;
   private static final long O000000000O0O = 9000L;
   private static final long O000000000O0O0 = 12000L;
   private final Pattern O000000000O0OO = Pattern.compile("Подождите (\\d+) сек");
   private AutoResell.W74 O000000000OO = AutoResell.W74.WAITING;
   private long O000000000OO0 = 0L;

   public AutoResell() {
      O000000000O = this;
   }

   @Override
   public void O00000000() {
      super.O00000000();
      this.O000000000OO = AutoResell.W74.WAITING;
      this.O000000000O0.O00000000();
      this.O000000000O00.O00000000();
      this.O000000000O000.O00000000();
   }

   @Override
   public void O000000000() {
      super.O000000000();
      O000000OO000OO.O000000000(false);
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null && O0000000000.interactionManager != null) {
         switch (this.O000000000OO) {
            case WAITING:
               if (this.O000000000O0.O000000000000(60000L) && O000000OO000OO.O00000000000O0()) {
                  this.O0000000000O0();
               }
               break;
            case OPENING_MAIN_AH:
               if (this.O0000000000OO()) {
                  if (this.O000000000O00.O000000000000(200L)) {
                     this.O00000000(AutoResell.W74.CLICKING_STORAGE);
                  }
               } else {
                  if (this.O0000000000OOO() && this.O000000000O000.O000000000000(900L)) {
                     this.O0000000000O0O();
                     this.O000000000O000.O00000000();
                  }

                  if (this.O000000000O00.O000000000000(this.O0000000000OOO() ? 9000L : 5000L)) {
                     ChatUtil.O00000000("§c[AutoResell] §fМеню аукциона не открылось.");
                     this.O0000000000O00();
                  }
               }
               break;
            case CLICKING_STORAGE:
               if (this.O0000000000OO() && O0000000000.currentScreen instanceof GenericContainerScreen var6) {
                  if (this.O00000000(var6)) {
                     this.O00000000(AutoResell.W74.OPENING_STORAGE);
                  } else if (!this.O0000000000OOO() || this.O000000000O00.O000000000000(3000L)) {
                     ChatUtil.O00000000("§c[AutoResell] §fКнопка 'Хранилище' не найдена.");
                     this.O0000000000O00();
                  }
                  break;
               }

               this.O0000000000O00();
               break;
            case OPENING_STORAGE:
               if (this.O0000000000OO0()) {
                  if (this.O000000000O00.O000000000000(200L)) {
                     this.O00000000(AutoResell.W74.CLICKING_CLOCK);
                  }
               } else {
                  if (this.O0000000000OOO()
                     && this.O0000000000OO()
                     && O0000000000.currentScreen instanceof GenericContainerScreen var5
                     && this.O000000000O000.O000000000000(900L)) {
                     this.O00000000(var5);
                     this.O000000000O000.O00000000();
                  }

                  if (this.O000000000O00.O000000000000(this.O0000000000OOO() ? 9000L : 5000L)) {
                     ChatUtil.O00000000("§c[AutoResell] §fХранилище не открылось.");
                     this.O0000000000O00();
                  }
               }
               break;
            case CLICKING_CLOCK:
               if (this.O0000000000OO0() && O0000000000.currentScreen instanceof GenericContainerScreen var4) {
                  if (this.O000000000(var4)) {
                     ChatUtil.O00000000("§d[AutoResell] §fПеревыставляем предметы...");
                     this.O00000000(AutoResell.W74.WAITING_RESULT);
                  } else if (!this.O0000000000OOO() || this.O000000000O00.O000000000000(3500L)) {
                     O000000OO000OO.O0000000000O0O();
                     this.O0000000000O00();
                  }
                  break;
               }

               this.O0000000000O00();
               break;
            case WAITING_RESULT:
               if (this.O0000000000OOO()
                  && this.O0000000000OO0()
                  && O0000000000.currentScreen instanceof GenericContainerScreen var2
                  && this.O000000000O000.O000000000000(900L)) {
                  this.O000000000(var2);
                  this.O000000000O000.O00000000();
               }

               if (this.O000000000O00.O000000000000(this.O0000000000OOO() ? 12000L : 10000L)) {
                  ChatUtil.O00000000("§e[AutoResell] §fНет ответа от аукциона, возвращаю AutoBuy.");
                  this.O0000000000O00();
               }
               break;
            case COOLDOWN_WAIT:
               if (this.O000000000O0.O000000000000(this.O000000000OO0) && O000000OO000OO.O00000000000O0()) {
                  ChatUtil.O00000000("§d[AutoResell] §fПовторная попытка после ожидания...");
                  this.O0000000000O0();
               }
         }
      }
   }

   private void O0000000000O0() {
      if (this.O0000000000OO0()) {
         this.O00000000(AutoResell.W74.CLICKING_CLOCK);
      } else if (this.O0000000000OO()) {
         this.O00000000(AutoResell.W74.CLICKING_STORAGE);
      } else if (O0000000000.player != null) {
         this.O0000000000O0O();
         this.O00000000(AutoResell.W74.OPENING_MAIN_AH);
      }
   }

   private void O0000000000O00() {
      this.O000000000OO = AutoResell.W74.WAITING;
      this.O000000000O0.O00000000();
      this.O000000000O00.O00000000();
      this.O000000000O000.O00000000();
      O000000OO000OO.O000000000(true);
   }

   private void O00000000(AutoResell.W74 o00000000) {
      this.O000000000OO = o00000000;
      this.O000000000O00.O00000000();
      this.O000000000O000.O00000000();
   }

   private void O0000000000O0O() {
      if (O0000000000.player != null) {
         O0000000000.player.networkHandler.sendChatCommand("ah");
      }
   }

   private boolean O0000000000OO() {
      if (!(O0000000000.currentScreen instanceof GenericContainerScreen var1)) {
         return false;
      } else {
         String var3 = var1.getTitle().getString();
         return var3 != null && (var3.contains("Аукцион") || var3.contains("Auction"));
      }
   }

   private boolean O0000000000OO0() {
      if (!(O0000000000.currentScreen instanceof GenericContainerScreen var1)) {
         return false;
      } else {
         String var3 = var1.getTitle().getString();
         return var3 != null && var3.contains("Хранилище");
      }
   }

   private boolean O00000000(GenericContainerScreen genericContainerScreen) {
      int var2 = this.O00000000(genericContainerScreen, Items.ENDER_CHEST);
      if (var2 == -1) {
         return false;
      } else {
         O0000000000.interactionManager
            .clickSlot(((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).syncId, var2, 0, SlotActionType.PICKUP, O0000000000.player);
         return true;
      }
   }

   private boolean O000000000(GenericContainerScreen genericContainerScreen) {
      int var2 = this.O00000000(genericContainerScreen, Items.CLOCK);
      if (var2 == -1) {
         return false;
      } else {
         O0000000000.interactionManager
            .clickSlot(((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).syncId, var2, 0, SlotActionType.PICKUP, O0000000000.player);
         return true;
      }
   }

   private boolean O0000000000OOO() {
      return AutoBuy.O000000000O != null && AutoBuy.O000000000O.O000000000O00O.O000000000("FunTime");
   }

   private int O00000000(GenericContainerScreen genericContainerScreen, Item item) {
      if (genericContainerScreen != null && genericContainerScreen.getScreenHandler() != null) {
         for (Slot var4 : ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).slots) {
            if (var4.id < ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).slots.size() - 36
               && var4.hasStack()
               && var4.getStack().getItem() == item) {
               return var4.id;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (o0000000O000OO.O00000000000() instanceof GameMessageS2CPacket var2) {
         String var7 = var2.content().getString();
         if (!var7.contains("Предметы успешно перевыставлены") && (!var7.contains("[✔]") || !var7.contains("перевыставлены"))) {
            if (this.O0000000000OOO() && var7.contains("В хранилище отсутствуют предметы для перевыставления")) {
               O000000OO000OO.O0000000000O0O();
               ChatUtil.O00000000("§e[AutoResell] §fХранилище пустое, возвращаю AutoBuy.");
               this.O0000000000O00();
            }
         } else {
            O000000OO000OO.O0000000000O00();
            ChatUtil.O00000000("§a[AutoResell] §fГотово.");
            this.O0000000000O00();
         }

         if (this.O000000000OO != AutoResell.W74.WAITING && var7.contains("Подождите") && var7.contains("сек")) {
            Matcher var4 = this.O000000000O0OO.matcher(var7);
            if (var4.find()) {
               try {
                  int var5 = Integer.parseInt(var4.group(1));
                  ChatUtil.O00000000("§e[AutoResell] §fЖдем " + var5 + " сек (кулдаун)...");
                  this.O000000000OO0 = (var5 + 1) * 1000L;
                  this.O00000000(AutoResell.W74.COOLDOWN_WAIT);
                  this.O000000000O0.O00000000();
                  O000000OO000OO.O000000000(true);
               } catch (Exception var6) {
               }
            }
         }

         if (var7.contains("Не удалось выставить") && var7.contains("освободите хранилище")) {
            O000000OO000OO.O0000000000O();
         } else if (var7.contains("У Вас купили") && var7.contains("на /ah")) {
            O000000OO000OO.O0000000000O0();
         } else if (var7.contains("выставлен на продажу за")) {
            O000000OO000OO.O00000000000OO();
         }
      }
   }

   static enum W74 {
      WAITING,
      OPENING_MAIN_AH,
      CLICKING_STORAGE,
      OPENING_STORAGE,
      CLICKING_CLOCK,
      WAITING_RESULT,
      COOLDOWN_WAIT;
   }
}
