package ru.metaculture.protection;

import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.minecraft.class_310;
import net.minecraft.class_345;
import net.minecraft.class_642;
import org.wild.mixin.acceser.BossBarHudAccessor;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "PvPSafe",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Защищает вас от лива в КД"
)
public class PvPSafe extends Module {
   private static final Set<String> NVNnnvnuunNv = Set.of(
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
   private final VUVnvvnNN uVunuUNVVUUV = new VUVnvvnNN(
      "Сервер",
      new vvNnnUNnVvn("FunTime", true),
      new vvNnnUNnVvn("HolyWorld", true),
      new vvNnnUNnVvn("SpookyTime", true),
      new vvNnnUNnVvn("Любой другой", true)
   );
   private final vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Notifications", true);
   private long uNnUnnuNUnNu;

   public PvPSafe() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.uVunuUNVVUUV, this.UNnVVNvvnVvU});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (this.UnUNVVVNuv()) {
         this.UuUVuuUu(AutoLeave.class);
         this.UuUVuuUu(ServerJoiner.class);
      }
   }

   public static boolean UuuNnUvUuv() {
      PvPSafe var0 = uVUVnuvnuVuv();
      return var0 != null && var0.UnUNVVVNuv();
   }

   public static boolean nUUVuvU() {
      return UuUVuuUu(class_310.method_1551());
   }

   public static boolean UuUVuuUu(String var0) {
      if (var0 == null) {
         return false;
      } else {
         String var1 = var0.trim();
         return !var1.startsWith("/") ? false : C00OOC00oO(var1.substring(1));
      }
   }

   public static boolean C00OOC00oO(String var0) {
      if (var0 == null) {
         return false;
      } else {
         String var1 = nuUnNvnuUu(var0);
         if (var1.isEmpty()) {
            return false;
         } else {
            String var2 = var1.split("\\s+", 2)[0];
            boolean var3 = NVNnnvnuunNv.contains(var2) || var2.matches("an\\d{1,5}");
            return !var3 ? false : vVvUvVVuuNvV("command /" + var1);
         }
      }
   }

   public static boolean uUnuvNvvNU(boolean var0) {
      return vVvUvVVuuNvV(var0 ? "server transfer" : "disconnect");
   }

   private boolean UnUNVVVNuv() {
      return this.nuUnNvnuUu && uUnuvNvvNU != null && uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null
         ? this.vNVuvnUUnuUn() && UuUVuuUu(uUnuvNvvNU)
         : false;
   }

   private boolean vNVuvnUUnuUn() {
      String var1 = this.UvnvNVnnnnNU();
      if (var1.contains("funtime") || var1.contains("fun-time")) {
         return this.uVunuUNVVUUV.C00OOC00oO("FunTime");
      } else if (var1.contains("holyworld") || var1.contains("holy-world") || var1.contains("holy")) {
         return this.uVunuUNVVUUV.C00OOC00oO("HolyWorld");
      } else {
         return !var1.contains("spookytime") && !var1.contains("spooky-time") && !var1.contains("spooky")
            ? this.uVunuUNVVUUV.C00OOC00oO("Любой другой")
            : this.uVunuUNVVUUV.C00OOC00oO("SpookyTime");
      }
   }

   private String UvnvNVnnnnNU() {
      class_310 var1 = class_310.method_1551();
      if (var1 == null) {
         return "";
      } else {
         class_642 var2 = var1.method_1558();
         return var2 != null && var2.field_3761 != null ? var2.field_3761.toLowerCase(Locale.ROOT) : "";
      }
   }

   private static boolean UuUVuuUu(class_310 var0) {
      if (var0 != null && var0.field_1705 != null && var0.field_1705.method_1740() != null) {
         Map var1 = ((BossBarHudAccessor)var0.field_1705.method_1740()).getBossBars();

         for (class_345 var3 : var1.values()) {
            String var4 = VVuuUN(var3.method_5414().getString());
            if (uUnuvNvvNU(var4)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private static boolean uUnuvNvvNU(String var0) {
      return var0.contains("pvp")
         || var0.contains("пвп")
         || var0.contains("combat")
         || var0.contains("fight")
         || var0.contains("battle")
         || var0.contains("режим боя")
         || var0.contains("в бою")
         || var0.contains("до выхода")
         || var0.contains("нельзя выйти")
         || var0.contains("не выходите");
   }

   private static boolean vVvUvVVuuNvV(String var0) {
      PvPSafe var1 = uVUVnuvnuVuv();
      if (var1 != null && var1.UnUNVVVNuv()) {
         var1.uNNnnnuuuN(var0);
         return true;
      } else {
         return false;
      }
   }

   private void uNNnnnuuuN(String var1) {
      if (this.UNnVVNvvnVvU.uUnuvNvvNU()) {
         long var2 = System.currentTimeMillis();
         if (var2 - this.uNnUnnuNUnNu >= 1200L) {
            this.uNnUnnuNUnNu = var2;
            vVnvuVVUunuv.UuUVuuUu("[PvPSafe] заблокировал " + var1);
         }
      }
   }

   private static String nuUnNvnuUu(String var0) {
      String var1 = var0.trim().toLowerCase(Locale.ROOT);

      while (var1.startsWith("/")) {
         var1 = var1.substring(1).trim();
      }

      return var1.replaceAll("\\s+", " ");
   }

   private static String VVuuUN(String var0) {
      return var0 == null ? "" : var0.replaceAll("(?i)§[0-9a-fk-or]", "").toLowerCase(Locale.ROOT).trim();
   }

   private static PvPSafe uVUVnuvnuVuv() {
      return NVnVnNnN.unNNVVNnvvV() && NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null
         ? NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(PvPSafe.class)
         : null;
   }

   private <T extends Module> void UuUVuuUu(Class<T> var1) {
      Module var2 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(var1);
      if (var2 != null && var2.nuUnNvnuUu) {
         var2.UuUVuuUu(false);
      }
   }
}
