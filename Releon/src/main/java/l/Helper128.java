package l;

import java.util.Map;
import net.minecraft.client.gui.hud.ClientBossBar;
import net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreboardDisplaySlot;
import net.minecraft.scoreboard.ScoreboardEntry;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.math.MathHelper;
import org.apache.commons.lang3.StringUtils;

public final class Helper128 implements Helper160 {
   private static final Helper339 pvpWatch = new Helper339();
   public static String server = "Vanilla";
   public static float TPS = 20.0F;
   public static long timestamp;
   public static int anarchy;
   public static boolean pvpEnd;

   public static void method1043() {
      anarchy = method1046();
      server = method1045();
      pvpEnd = method1049();
      if (method1048()) {
         pvpWatch.method3358();
      }
   }

   public static void method1044(Helper386 var0) {
      switch (var0.method3895()) {
         case WorldTimeUpdateS2CPacket var3:
            long var4 = System.nanoTime();
            float var6 = 20.0F;
            float var7 = var6 * (1.0E9F / (float)(var4 - timestamp));
            TPS = MathHelper.clamp(var7, 0.0F, var6);
            timestamp = var4;
         default:
      }
   }

   public static String method1045() {
      if (!Helper38.method549()
         && mc.getNetworkHandler() != null
         && mc.getNetworkHandler().getServerInfo() != null
         && mc.getNetworkHandler().getBrand() != null) {
         String var0 = mc.getNetworkHandler().getServerInfo().address.toLowerCase();
         String var1 = mc.getNetworkHandler().getBrand().toLowerCase();
         if (var1.contains("botfilter")) {
            return "FunTime";
         } else if (var1.contains("§6spooky§ccore")) {
            return "SpookyTime";
         } else if (var0.contains("funtime") || var0.contains("skytime") || var0.contains("space-times") || var0.contains("funsky")) {
            return "CopyTime";
         } else if (var1.contains("holyworld") || var1.contains("vk.com/idwok")) {
            return "HolyWorld";
         } else if (var0.contains("reallyworld")) {
            return "ReallyWorld";
         } else {
            return var0.contains("gulpvp") ? "GulPvP" : "Vanilla";
         }
      } else {
         return "Vanilla";
      }
   }

   private static int method1046() {
      if (mc.world == null) {
         return -1;
      } else {
         Scoreboard var0 = mc.world.getScoreboard();
         ScoreboardObjective var1 = var0.getObjectiveForSlot(ScoreboardDisplaySlot.SIDEBAR);
         String var2 = server;
         switch (var2) {
            case "FunTime":
               if (var1 != null) {
                  String[] var8 = var1.getDisplayName().getString().split("-");
                  if (var8.length > 1) {
                     return Integer.parseInt(var8[1]);
                  }
               }
               break;
            case "HolyWorld":
               for (ScoreboardEntry var5 : var0.getScoreboardEntries(var1)) {
                  String var6 = Team.decorateName(var0.getScoreHolderTeam(var5.owner()), var5.name()).getString();
                  if (!var6.isEmpty()) {
                     String var7 = StringUtils.substringBetween(var6, "#", " -◆-");
                     if (var7 != null && !var7.isEmpty()) {
                        return Integer.parseInt(var7.replace(" (1.20)", ""));
                     }
                  }
               }
         }

         return -1;
      }
   }

   public static boolean method1047() {
      return !pvpWatch.method3356(500.0);
   }

   private static boolean method1048() {
      Map<java.util.UUID, net.minecraft.client.gui.hud.ClientBossBar> var0 = mc.inGameHud.getBossBarHud().bossBars;

      for (ClientBossBar var2 : var0.values()) {
         String var3 = var2.getName().getString().toLowerCase();
         if (var3.contains("pvp") || var3.contains("пвп")) {
            return true;
         }
      }

      return false;
   }

   private static boolean method1049() {
      Map<java.util.UUID, net.minecraft.client.gui.hud.ClientBossBar> var0 = mc.inGameHud.getBossBarHud().bossBars;

      for (ClientBossBar var2 : var0.values()) {
         String var3 = var2.getName().getString().toLowerCase();
         if ((var3.contains("pvp") || var3.contains("пвп")) && (var3.contains("0") || var3.contains("1"))) {
            return true;
         }
      }

      return false;
   }

   public static String method1050() {
      return mc.world.getRegistryKey().getValue().getPath();
   }

   public static boolean method1051() {
      return server.equals("CopyTime") || server.equals("SpookyTime") || server.equals("FunTime");
   }

   public static boolean method1052() {
      return server.equals("FunTime");
   }

   public static boolean method1053() {
      return server.equals("ReallyWorld");
   }

   public static boolean method1054() {
      return server.equals("GulPvP");
   }

   public static boolean method1055() {
      return server.equals("HolyWorld");
   }

   public static boolean method1056() {
      return server.equals("SpookyTime");
   }

   public static boolean method1057() {
      return server.equals("aresmine");
   }

   public static boolean method1058() {
      return server.equals("Vanilla");
   }

   private Helper128() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   public static int method1059() {
      return anarchy;
   }

   public static boolean method1060() {
      return pvpEnd;
   }
}
