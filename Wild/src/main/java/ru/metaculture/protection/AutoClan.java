package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AutoClan",
   O0000000000 = Category.Misc,
   O000000000 = "Автоматически создает клан а так же приглашает в него ваших друзей (если такие есть)"
)
public class AutoClan extends Module {
   public final KeybindSetting O000000000O = new KeybindSetting("Бинд", -1);
   private AutoClan.W64 O000000000O0 = AutoClan.W64.IDLE;
   private int O000000000O00 = 0;
   private int O000000000O000 = 0;
   private int O000000000O00O = 0;
   private List<String> O000000000O0O = new ArrayList<>();
   private static final String O000000000O0O0 = "abcdefghijklmnopqrstuvwxyz0123456789";

   public AutoClan() {
      this.O00000000(new Setting[]{this.O000000000O});
   }

   @EventHandler
   public void O00000000(O0000000O0O0 o0000000O0O0) {
      if (!O0000O00O0000O.O00000000()) {
         if (o0000000O0O0.O00000000000() == this.O000000000O.O0000000000()) {
         }
      }
   }

   private void O0000000000O0() {
      if (O0000000000.player != null) {
         this.O0000000000O00();
      }
   }

   private void O0000000000O00() {
      String var1 = this.O0000000000O0O();
      ChatUtil.O00000000("§7Создание клана с названием: §f" + var1);
      O0000000000.player.networkHandler.sendChatMessage("/clan create " + var1);
      this.O000000000O0 = AutoClan.W64.WAITING_CREATE_RESPONSE;
      this.O000000000O00 = 0;
   }

   private String O0000000000O0O() {
      ThreadLocalRandom var1 = ThreadLocalRandom.current();
      int var2 = var1.nextInt(3, 6);
      StringBuilder var3 = new StringBuilder(var2);

      for (int var4 = 0; var4 < var2; var4++) {
         var3.append("abcdefghijklmnopqrstuvwxyz0123456789".charAt(var1.nextInt("abcdefghijklmnopqrstuvwxyz0123456789".length())));
      }

      return var3.toString();
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (O0000000000.player != null && this.O000000000O0 != AutoClan.W64.IDLE) {
         if (o0000000O000OO.O00000000000() instanceof GameMessageS2CPacket var2) {
            String var4 = var2.content().getString();
            this.O00000000(var4);
         }
      }
   }

   private void O00000000(String string) {
      if (this.O000000000O0 == AutoClan.W64.WAITING_CREATE_RESPONSE) {
         if (string.contains("Ошибка, клан с таким названием уже существует")) {
            ChatUtil.O00000000("§cНазвание занято, пробую другое...");
            this.O000000000O00 = 0;
            this.O000000000O0 = AutoClan.W64.CREATING_CLAN;
            return;
         }

         if (string.contains("Супер! Вы успешно создали клан")) {
            ChatUtil.O00000000("§aКлан успешно создан!");
            this.O0000000000OO();
            return;
         }

         if (string.contains("Ошибка: Ты уже состоишь в клане")) {
            ChatUtil.O00000000("§eТы уже в клане, начинаю инвайтить друзей...");
            this.O0000000000OO();
            return;
         }
      }

      if (this.O000000000O0 == AutoClan.W64.INVITING_FRIENDS) {
      }
   }

   private void O0000000000OO() {
      this.O000000000O0O = this.O0000000000OO0();
      if (this.O000000000O0O.isEmpty()) {
         ChatUtil.O00000000("§cНет друзей онлайн на этом сервере!");
         this.O0000000000OOO();
      } else {
         ChatUtil.O00000000("§aНайдено §l" + this.O000000000O0O.size() + "§a друзей онлайн. Начинаю инвайт...");
         this.O000000000O000 = 0;
         this.O000000000O00O = 0;
         this.O000000000O0 = AutoClan.W64.INVITING_FRIENDS;
      }
   }

   private List<String> O0000000000OO0() {
      ArrayList var1 = new ArrayList();
      if (O0000000000.player != null && O0000000000.getNetworkHandler() != null) {
         List var2 = FriendCommand.O00000000000();
         Collection var3 = O0000000000.getNetworkHandler().getPlayerList();
         HashSet var4 = new HashSet();

         for (PlayerListEntry var6 : (Collection<PlayerListEntry>)var3) {
            if (var6.getProfile() != null && var6.getProfile().getName() != null) {
               var4.add(var6.getProfile().getName());
            }
         }

         String var8 = O0000000000.player.getName().getString();

         for (String var7 : (List<String>)var2) {
            if (var4.contains(var7) && !var7.equalsIgnoreCase(var8)) {
               var1.add(var7);
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && this.O000000000O0 != AutoClan.W64.IDLE) {
         this.O000000000O00++;
         switch (this.O000000000O0) {
            case CREATING_CLAN:
               if (this.O000000000O00 > 20) {
                  this.O0000000000O00();
               }
               break;
            case WAITING_CREATE_RESPONSE:
               if (this.O000000000O00 > 100) {
                  ChatUtil.O00000000("§cТаймаут ожидания ответа сервера.");
                  this.O0000000000OOO();
               }
               break;
            case INVITING_FRIENDS:
               this.O000000000O00O++;
               if (this.O000000000O00O >= 25) {
                  this.O000000000O00O = 0;
                  if (this.O000000000O000 < this.O000000000O0O.size()) {
                     String var2 = this.O000000000O0O.get(this.O000000000O000);
                     O0000000000.player.networkHandler.sendChatCommand("clan invite " + var2);
                     ChatUtil.O00000000("§7Инвайт: §f" + var2 + " §7(" + (this.O000000000O000 + 1) + "/" + this.O000000000O0O.size() + ")");
                     this.O000000000O000++;
                  } else {
                     ChatUtil.O00000000("§aВсе друзья приглашены! (" + this.O000000000O0O.size() + " шт.)");
                     this.O0000000000OOO();
                  }
               }
         }
      }
   }

   private void O0000000000OOO() {
      this.O000000000O0 = AutoClan.W64.IDLE;
      this.O000000000O00 = 0;
      this.O000000000O000 = 0;
      this.O000000000O00O = 0;
      this.O000000000O0O.clear();
   }

   @Override
   public void O000000000() {
      this.O0000000000OOO();
      super.O000000000();
   }

   static enum W64 {
      IDLE,
      CREATING_CLAN,
      WAITING_CREATE_RESPONSE,
      INVITING_FRIENDS;
   }
}
