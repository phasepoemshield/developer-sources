package ru.metaculture.protection;

import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.ClientBossBar;
import net.minecraft.client.network.ServerInfo;
import org.wild.mixin.acceser.BossBarHudAccessor;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "PvPSafe",
   O0000000000 = Category.Misc,
   O000000000 = "Защищает вас от лива в КД"
)
public class PvPSafe extends Module {
   private static final Set<String> O000000000O = Set.of(
      "hub",
      "lobby",
      "spawn",
      "leave",
      "quit",
      "disconnect",
      "server",
      "servers",
      "an",
      "anarchy",
      "realm",
      "menu",
      "logout",
      "reconnect",
      "play",
      "warp",
      "duel",
      "l"
   );
   private final GroupSetting O000000000O0 = new GroupSetting(
      "Сервер",
      new BooleanSetting("FunTime", true),
      new BooleanSetting("HolyWorld", true),
      new BooleanSetting("SpookyTime", true),
      new BooleanSetting("Любой другой", true)
   );
   private final BooleanSetting O000000000O00 = new BooleanSetting("Notifications", true);
   private long O000000000O000;

   public PvPSafe() {
      this.O00000000(new Setting[]{this.O000000000O0, this.O000000000O00});
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (this.O0000000000O0O()) {
         this.O00000000(AutoLeave.class);
         this.O00000000(ServerJoiner.class);
      }
   }

   public static boolean O0000000000O0() {
      PvPSafe var0 = O0000000000OOO();
      return var0 != null && var0.O0000000000O0O();
   }

   public static boolean O0000000000O00() {
      return O00000000(MinecraftClient.getInstance());
   }

   public static boolean O00000000(String string) {
      if (string == null) {
         return false;
      } else {
         String var1 = string.trim();
         return !var1.startsWith("/") ? false : O000000000(var1.substring(1));
      }
   }

   public static boolean O000000000(String string) {
      if (string == null) {
         return false;
      } else {
         String var1 = O0000000000000(string);
         if (var1.isEmpty()) {
            return false;
         } else {
            String var2 = var1.split("\\s+", 2)[0];
            boolean var3 = O000000000O.contains(var2) || var2.matches("an\\d{1,5}");
            return !var3 ? false : O00000000000("command /" + var1);
         }
      }
   }

   public static boolean O0000000000(boolean bl) {
      return O00000000000(bl ? "server transfer" : "disconnect");
   }

   private boolean O0000000000O0O() {
      return this.O0000000000000 && O0000000000 != null && O0000000000.player != null && O0000000000.world != null
         ? this.O0000000000OO() && O00000000(O0000000000)
         : false;
   }

   private boolean O0000000000OO() {
      String var1 = this.O0000000000OO0();
      if (var1.contains("funtime") || var1.contains("fun-time")) {
         return this.O000000000O0.O000000000("FunTime");
      } else if (var1.contains("holyworld") || var1.contains("holy-world") || var1.contains("holy")) {
         return this.O000000000O0.O000000000("HolyWorld");
      } else {
         return !var1.contains("spookytime") && !var1.contains("spooky-time") && !var1.contains("spooky")
            ? this.O000000000O0.O000000000("Любой другой")
            : this.O000000000O0.O000000000("SpookyTime");
      }
   }

   private String O0000000000OO0() {
      MinecraftClient var1 = MinecraftClient.getInstance();
      if (var1 == null) {
         return "";
      } else {
         ServerInfo var2 = var1.getCurrentServerEntry();
         return var2 != null && var2.address != null ? var2.address.toLowerCase(Locale.ROOT) : "";
      }
   }

   private static boolean O00000000(MinecraftClient minecraftClient) {
      if (minecraftClient != null && minecraftClient.inGameHud != null && minecraftClient.inGameHud.getBossBarHud() != null) {
         Map var1 = ((BossBarHudAccessor)minecraftClient.inGameHud.getBossBarHud()).getBossBars();

         for (ClientBossBar var3 : (Iterable<ClientBossBar>)var1.values()) {
            String var4 = O000000000000O(var3.getName().getString());
            if (O0000000000(var4)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private static boolean O0000000000(String string) {
      return string.contains("pvp")
         || string.contains("пвп")
         || string.contains("combat")
         || string.contains("fight")
         || string.contains("battle")
         || string.contains("режим боя")
         || string.contains("в бою")
         || string.contains("до выхода")
         || string.contains("нельзя выйти")
         || string.contains("не выходите");
   }

   private static boolean O00000000000(String string) {
      PvPSafe var1 = O0000000000OOO();
      if (var1 != null && var1.O0000000000O0O()) {
         var1.O000000000000(string);
         return true;
      } else {
         return false;
      }
   }

   private void O000000000000(String string) {
      if (this.O000000000O00.O0000000000()) {
         long var2 = System.currentTimeMillis();
         if (var2 - this.O000000000O000 >= 1200L) {
            this.O000000000O000 = var2;
            ChatUtil.O00000000("[PvPSafe] заблокировал " + string);
         }
      }
   }

   private static String O0000000000000(String string) {
      String var1 = string.trim().toLowerCase(Locale.ROOT);

      while (var1.startsWith("/")) {
         var1 = var1.substring(1).trim();
      }

      return var1.replaceAll("\\s+", " ");
   }

   private static String O000000000000O(String string) {
      return string == null ? "" : string.replaceAll("(?i)§[0-9a-fk-or]", "").toLowerCase(Locale.ROOT).trim();
   }

   private static PvPSafe O0000000000OOO() {
      return WildClient.O000000000OO0() && WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null
         ? WildClient.O00000000.O000000000.O00000000(PvPSafe.class)
         : null;
   }

   private <T extends Module> void O00000000(Class<T> class_) {
      Module var2 = WildClient.O00000000.O000000000.O00000000(class_);
      if (var2 != null && var2.O0000000000000) {
         var2.O00000000(false);
      }
   }
}
