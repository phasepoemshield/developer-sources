package ru.metaculture.protection;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "ServerJoiner",
   O0000000000 = Category.Misc,
   O000000000 = "Авто-заход на сервера (FunTime/SpookyTime)"
)
public class ServerJoiner extends Module {
   public final ModeSetting O000000000O = new ModeSetting("Режим", "FunTime", "FunTime", "SpookyTime");
   private static final Pattern O000000000O000 = Pattern.compile("anarchy\\s*(\\d+)");
   public final TextSetting O000000000O0 = new TextSetting("Анархия", "101").O00000000(() -> !this.O000000000O.O000000000("FunTime"));
   public final BooleanSetting O000000000O00 = new BooleanSetting("Выключать после входа", true);
   private final O0000O00O0000 O000000000O00O = new O0000O00O0000();
   private int O000000000O0O = -1;
   private boolean O000000000O0O0;
   private boolean O000000000O0OO;

   public ServerJoiner() {
      this.O00000000(new Setting[]{this.O000000000O, this.O000000000O0, this.O000000000O00});
   }

   @Override
   public void O00000000() {
      super.O00000000();
      this.O000000000O0O0 = false;
      this.O000000000O0OO = false;
      this.O000000000O00O.O00000000();
      if (this.O000000000O.O000000000("FunTime")) {
         this.O000000000O0O = this.O0000000000OO0();
         if (this.O000000000O0O <= 0) {
            ChatUtil.O00000000("[ServerJoiner] Укажи корректную анархию в настройке.");
            this.a_();
            return;
         }

         this.O0000000000OO();
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null && !this.O000000000O0O0) {
         if (this.O000000000O.O000000000("FunTime")) {
            if (this.O000000000O00O.O000000000000(50L)) {
               this.O0000000000OO();
               this.O000000000O00O.O00000000();
            }
         } else if (this.O000000000O.O000000000("SpookyTime")) {
            if (this.O000000000O0OO && !this.O0000000000O0O()) {
               this.O00000000("[ServerJoiner] Успешный вход на дуэли SpookyTime.");
               return;
            }

            this.O0000000000O0();
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (this.O000000000O.O000000000("FunTime") && o0000000O000OO.O000000000000().equals(O0000000O000OO.W24.RECEIVE)) {
         if (o0000000O000OO.O00000000000() instanceof GameMessageS2CPacket var2) {
            String var7 = this.O000000000(var2.content().getString());
            if (!var7.isEmpty() && !var7.contains("сервер заполнен") && !var7.contains("были кикнуты при подключении")) {
               if (this.O0000000000(var7)) {
                  this.O00000000("[ServerJoiner] Уже подключен к этой анархии.");
               } else {
                  Matcher var4 = O000000000O000.matcher(var7);
                  if (var4.find()) {
                     try {
                        if (Integer.parseInt(var4.group(1)) == this.O000000000O0O) {
                           this.O00000000("[ServerJoiner] Зашёл на /an" + this.O000000000O0O + ".");
                        }
                     } catch (NumberFormatException var6) {
                     }
                  }
               }
            }
         }
      }
   }

   private void O0000000000O0() {
      if (O0000000000.currentScreen instanceof HandledScreen var1) {
         if (!this.O00000000(var1)) {
            ChatUtil.O00000000("[ServerJoiner] Открыт неверный экран для SpookyTime, модуль выключен.");
            this.O00000000(false);
            return;
         }

         ScreenHandler var5 = var1.getScreenHandler();

         for (int var3 = 0; var3 < var5.slots.size(); var3++) {
            Slot var4 = (Slot)var5.slots.get(var3);
            if (var4.getStack().isOf(Items.RESPAWN_ANCHOR)) {
               O0000000000.interactionManager.clickSlot(var5.syncId, var3, 0, SlotActionType.PICKUP, O0000000000.player);
               O0000000000.setScreen(null);
               this.O000000000O0OO = true;
               this.O000000000O00O.O00000000();
               return;
            }
         }
      } else if (this.O000000000O00O.O000000000000(500L)) {
         this.O0000000000O00();
         this.O000000000O00O.O00000000();
      }
   }

   private boolean O00000000(HandledScreen<?> handledScreen) {
      return this.O000000000(handledScreen.getTitle().getString()).equals("выберите режим: ");
   }

   private void O0000000000O00() {
      PlayerInventory var1 = O0000000000.player.getInventory();

      for (int var2 = 0; var2 < 9; var2++) {
         if (var1.getStack(var2).isOf(Items.COMPASS)) {
            if (var1.getSelectedSlot() != var2) {
               var1.setSelectedSlot(var2);
               O0000000000.getNetworkHandler().sendPacket(new UpdateSelectedSlotC2SPacket(var2));
            }

            O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
            return;
         }
      }
   }

   private boolean O0000000000O0O() {
      if (O0000000000.player == null) {
         return false;
      } else {
         PlayerInventory var1 = O0000000000.player.getInventory();

         for (int var2 = 0; var2 < 9; var2++) {
            if (var1.getStack(var2).isOf(Items.COMPASS)) {
               return true;
            }
         }

         return false;
      }
   }

   private void O0000000000OO() {
      if (O0000000000.player != null && O0000000000.player.networkHandler != null) {
         O0000000000.player.networkHandler.sendChatMessage("/an" + this.O000000000O0O);
      }
   }

   private void O00000000(String string) {
      this.O000000000O0O0 = true;
      ChatUtil.O00000000(string);
      if (this.O000000000O00.O0000000000()) {
         this.a_();
      }
   }

   private int O0000000000OO0() {
      String var1 = this.O000000000O0.O0000000000();
      if (var1 == null) {
         return -1;
      } else {
         String var2 = var1.replaceAll("\\D+", "");
         return var2.isEmpty() ? -1 : Integer.parseInt(var2);
      }
   }

   private String O000000000(String string) {
      return string == null ? "" : string.replaceAll("§.", "").toLowerCase(Locale.ROOT).trim();
   }

   private boolean O0000000000(String string) {
      return string.contains("вы уже подключены к этому серверу") || string.contains("already connected to this server");
   }
}
