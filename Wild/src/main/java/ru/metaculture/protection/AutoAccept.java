package ru.metaculture.protection;

import java.util.Arrays;
import java.util.List;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.text.ClickEvent;
import net.minecraft.text.Text;
import net.minecraft.text.ClickEvent.RunCommand;
import net.minecraft.text.ClickEvent.SuggestCommand;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AutoAccept",
   O0000000000 = Category.Misc,
   O000000000 = "Автоматически принимает запросы на телепортацию и в клан"
)
public class AutoAccept extends Module {
   public final GroupSetting O000000000O = new GroupSetting("Принимать", new BooleanSetting("Запрос на ТП", true), new BooleanSetting("Запрос в клан", true));
   public final ModeSetting O000000000O0 = new ModeSetting("Принимать ТП от", "Друзей", "Друзей", "Всех")
      .O00000000(() -> !this.O000000000O.O000000000("Запрос на ТП"));
   public final BooleanSetting O000000000O00 = new BooleanSetting("Принимать запрос в клан только от друзей", true)
      .O00000000(() -> !this.O000000000O.O000000000("Запрос в клан"));
   private boolean O000000000O000;
   private boolean O000000000O00O = false;
   private long O000000000O0O = 0L;
   private final String[] O000000000O0O0 = new String[]{
      "has requested teleport", "просит телепортироваться", "хочет телепортироваться к вам", "просит к вам телепортироваться"
   };
   private final String[] O000000000O0OO = new String[]{"приглашает вас в клан", "приглашает Вас в клан", "invited you to clan"};

   public AutoAccept() {
      this.O00000000(new Setting[]{this.O000000000O, this.O000000000O0, this.O000000000O00});
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      O0000O00O0000O.O00000000();
      if (o0000000O000OO.O00000000000() instanceof GameMessageS2CPacket var2) {
         Text var8 = var2.content();
         String var4 = var8.getString();
         if (this.O000000000O00O) {
            if (System.currentTimeMillis() - this.O000000000O0O > 5000L) {
               this.O000000000O00O = false;
            } else {
               String var5 = this.O00000000(var8, "Вступить");
               if (var5 != null) {
                  this.O00000000(var5);
                  this.O000000000O00O = false;
                  return;
               }
            }
         }

         if (this.O000000000O.O000000000("Запрос на ТП") && this.O0000000000(var4)) {
            if (this.O000000000O0.O000000000("Всех")) {
               this.O000000000O000 = true;
            } else {
               String var9 = var4.toLowerCase();

               for (String var7 : FriendCommand.O00000000000()) {
                  if (var9.contains(var7.toLowerCase())) {
                     this.O000000000O000 = true;
                     break;
                  }
               }
            }
         }

         if (this.O000000000O.O000000000("Запрос в клан") && this.O00000000000(var4)) {
            String var10 = this.O00000000(var4, "приглашает");
            if (var10 != null && !this.O000000000(var10)) {
               return;
            }

            String var11 = this.O00000000(var8, "Вступить");
            if (var11 != null) {
               this.O00000000(var11);
            } else {
               this.O000000000O00O = true;
               this.O000000000O0O = System.currentTimeMillis();
            }
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (this.O000000000O000 && O0000000000.player != null) {
         O0000000000.player.networkHandler.sendChatCommand("tpaccept");
         this.O000000000O000 = false;
      }
   }

   private String O00000000(Text text, String string) {
      if (text == null) {
         return null;
      } else {
         if (text.getStyle() != null && text.getStyle().getClickEvent() != null) {
            ClickEvent var3 = text.getStyle().getClickEvent();
            if (text.getString().contains(string)) {
               if (var3 instanceof RunCommand var8) {
                  return var8.command();
               }

               if (var3 instanceof SuggestCommand var9) {
                  return var9.command();
               }
            }
         }

         List var7 = text.getSiblings();
         if (var7 != null) {
            for (Text var5 : (List<Text>)var7) {
               String var6 = this.O00000000(var5, string);
               if (var6 != null) {
                  return var6;
               }
            }
         }

         return null;
      }
   }

   private void O00000000(String string) {
      if (O0000000000.player != null && O0000000000.player.networkHandler != null) {
         if (string.startsWith("/")) {
            O0000000000.player.networkHandler.sendChatCommand(string.substring(1));
         } else {
            O0000000000.player.networkHandler.sendChatCommand(string);
         }
      }
   }

   private boolean O000000000(String string) {
      return !this.O000000000O00.O0000000000() ? true : FriendCommand.O00000000(string);
   }

   private String O00000000(String string, String string2) {
      String var3 = string.replaceAll("§.", "");
      int var4 = var3.indexOf(string2);
      if (var4 <= 0) {
         return null;
      } else {
         String var5 = var3.substring(0, var4).trim();
         int var6 = var5.lastIndexOf(32);
         return var6 >= 0 ? var5.substring(var6 + 1).trim() : var5.trim();
      }
   }

   private boolean O0000000000(String string) {
      String var2 = string.toLowerCase();
      return Arrays.stream(this.O000000000O0O0).anyMatch(string2 -> var2.contains(string2.toLowerCase()));
   }

   private boolean O00000000000(String string) {
      String var2 = string.toLowerCase();
      return Arrays.stream(this.O000000000O0OO).anyMatch(string2 -> var2.contains(string2.toLowerCase()));
   }
}
