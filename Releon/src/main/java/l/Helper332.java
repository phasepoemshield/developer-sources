package l;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreboardDisplaySlot;
import net.minecraft.scoreboard.ScoreboardObjective;

public class Helper332 {
   private List<String> anarchyServers165 = new ArrayList<>();
   private List<String> anarchyServers214 = new ArrayList<>();
   private int currentServerIndex = 0;
   private String currentServer = "";
   private boolean inHub = false;
   private boolean waitingForServerLoad = false;
   private Helper333 hubCheckTimer = Helper333.method3308();
   private Helper333 serverSwitchCooldown = Helper333.method3308();
   private Setting3 bypassDelay;
   private Setting3 bypassDelay1214;

   public Helper332(Setting3 var1, Setting3 var2) {
      this.bypassDelay = var1;
      this.bypassDelay1214 = var2;
      this.method3293();
   }

   private void method3293() {
      this.method3294(this.anarchyServers165, 102, 107);
      this.method3294(this.anarchyServers165, 203, 221);
      this.method3294(this.anarchyServers165, 302, 313);
      this.method3294(this.anarchyServers165, 502, 507);
      this.method3294(this.anarchyServers165, 602, 602);
      this.method3294(this.anarchyServers165, 1005, 1009);
      this.method3294(this.anarchyServers165, 2004, 2022);
      this.method3294(this.anarchyServers165, 3003, 3013);
      this.method3294(this.anarchyServers165, 5003, 5008);
      this.method3294(this.anarchyServers165, 6001, 6003);
      this.method3294(this.anarchyServers214, 11, 14);
      this.method3294(this.anarchyServers214, 21, 27);
      this.method3294(this.anarchyServers214, 31, 34);
      this.method3294(this.anarchyServers214, 51, 53);
      this.method3294(this.anarchyServers214, 91, 91);
      this.method3294(this.anarchyServers214, 105, 114);
      this.method3294(this.anarchyServers214, 205, 230);
      this.method3294(this.anarchyServers214, 304, 318);
      this.method3294(this.anarchyServers214, 503, 513);
      this.method3294(this.anarchyServers214, 901, 904);
   }

   private void method3294(List<String> var1, int var2, int var3) {
      for (int var4 = var2; var4 <= var3; var4++) {
         String var5 = "/an" + var4;
         if (!var1.contains(var5)) {
            var1.add(var5);
         }
      }
   }

   public void method3295() {
      this.hubCheckTimer.method3309();
      this.serverSwitchCooldown.method3309();
   }

   public void method3296() {
      this.currentServerIndex = 0;
      this.currentServer = "";
      this.inHub = false;
      this.waitingForServerLoad = false;
   }

   public void method3297(ClientWorld var1) {
      this.inHub = this.method3298(var1);
   }

   private boolean method3298(ClientWorld var1) {
      if (var1 == null) {
         return true;
      } else {
         Scoreboard var2 = var1.getScoreboard();
         ScoreboardObjective var3 = var2.getObjectiveForSlot(ScoreboardDisplaySlot.SIDEBAR);
         if (var3 == null) {
            return true;
         } else {
            String var4 = var3.getDisplayName().getString();
            return !var4.contains("Анархия-");
         }
      }
   }

   private int method3299(ClientWorld var1) {
      if (var1 == null) {
         return -1;
      } else {
         Scoreboard var2 = var1.getScoreboard();
         ScoreboardObjective var3 = var2.getObjectiveForSlot(ScoreboardDisplaySlot.SIDEBAR);
         if (var3 != null) {
            String var4 = var3.getDisplayName().getString();
            if (var4.contains("Анархия-")) {
               String[] var5 = var4.split("-");
               if (var5.length > 1) {
                  try {
                     return Integer.parseInt(var5[1].trim());
                  } catch (NumberFormatException var7) {
                     return -1;
                  }
               }
            }
         }

         return -1;
      }
   }

   private String method3300(List<String> var1, ClientWorld var2) {
      if (var1.isEmpty()) {
         return null;
      } else {
         int var3 = this.method3299(var2);
         if (var3 != -1) {
            String var4 = "/an" + var3;
            int var5 = var1.indexOf(var4);
            if (var5 != -1) {
               this.currentServerIndex = var5;
            }
         }

         this.currentServerIndex = (this.currentServerIndex + 1) % var1.size();
         return (String)var1.get(this.currentServerIndex);
      }
   }

   public void method3301(ClientPlayerEntity var1, Helper321 var2, boolean var3) {
      if (this.serverSwitchCooldown.method3315(3000L)) {
         if (var3) {
            List var4 = this.method3303();
            if (var4 != null) {
               ClientWorld var5 = (ClientWorld)var1.getWorld();
               String var6 = this.method3300(var4, var5);
               if (var6 != null) {
                  this.currentServer = var6;
                  Helper357.method3572(var1, var6);
                  var2.method3184("switch_server:" + var6);
                  this.waitingForServerLoad = true;
                  this.serverSwitchCooldown.method3309();
               }
            }
         }
      }
   }

   public void method3302(ClientPlayerEntity var1) {
      List var2 = this.method3303();
      if (var2 != null && !var2.isEmpty()) {
         String var3 = (String)var2.get(0);
         Helper357.method3572(var1, var3);
         this.waitingForServerLoad = true;
         this.hubCheckTimer.method3309();
      }
   }

   private List<String> method3303() {
      if (this.bypassDelay1214.method2200()) {
         return new ArrayList<>(this.anarchyServers214);
      } else {
         return this.bypassDelay.method2200() ? new ArrayList<>(this.anarchyServers165) : null;
      }
   }

   public boolean method3304(boolean var1, boolean var2) {
      return this.inHub && this.hubCheckTimer.method3315(3000L) && (var1 || var2);
   }

   public boolean method3305() {
      return this.inHub;
   }

   public boolean method3306() {
      return this.waitingForServerLoad;
   }

   public void method3307(boolean var1) {
      this.waitingForServerLoad = var1;
   }
}
