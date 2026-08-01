package l;

import antidaunleak.api.UserProfile;
import fat.releon.Releon;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Comparator;
import java.util.stream.Stream;

public class SelfDestruct extends Helper242 {
   public static boolean unhooked;
   Helper339 timer = new Helper339();

   public SelfDestruct() {
      super("SelfDestruct", "Self Destruct", Helper269.MISC);
   }

   @Override
   public void activate() {
      unhooked = true;
      Releon.method71().method27().stopRPC();

      for (Helper242 var2 : Releon.method71().method25().method2753()) {
         if (var2 != this && var2.isState()) {
            var2.setState(false);
         }
      }

      Helper238.method2186("Для возвращения чита впишите в чат ваш username в чите");
      Helper238.method2186("Сообщение удалится через пол секунды");
      if (this.timer.method3357(500.0)) {
         mc.inGameHud.getChatHud().clear(true);
      }

      for (Helper242 var4 : Releon.method71().method25().method2753()) {
         var4.setKey(-1);
      }

      this.method3749();
      Releon.method71().method20();
      Helper363.prefix = Helper147.method1227(0, 9999999) + "";
      super.activate();
   }

   @Helper104
   public void method3748(Helper380 var1) {
      String var2 = var1.getMessage().trim();
      if (var2.equalsIgnoreCase(UserProfile.getInstance().profile("username"))) {
         unhooked = false;
         Releon.method71().method27().setRunning(true);
         this.state = false;
         Releon.method71().method20();
         Helper363.prefix = ".";
         Helper238.method2186("Unhook reset to FALSE");
         var1.method1613(true);
      }
   }

   @Override
   public void deactivate() {
      unhooked = false;
      super.deactivate();
   }

   private void method3749() {
      Path var1 = Releon.method71().method31().method3925().toPath();
      Path var2 = mc.runDirectory.toPath();
      int var3 = this.method3750(var1.resolve("temp"));
      int var4 = this.method3750(var1.resolve("cache"));
      boolean var5 = this.method3751(var2.resolve("logs"));
      boolean var6 = this.method3751(var1.resolve("logs"));
      Helper238.method2186("Safe reset: temp=" + var3 + ", cache=" + var4);
      if (var5 || var6) {
         Helper238.method2186("Safe reset: latest.log rotated");
      }
   }

   private int method3750(Path var1) {
      if (Files.exists(var1) && Files.isDirectory(var1)) {
         try {
            int var12;
            try (Stream<java.nio.file.Path> var2 = Files.walk(var1)) {
               Path[] var3 = var2.filter(var1x -> !var1x.equals(var1)).sorted(Comparator.reverseOrder()).toArray(Path[]::new);
               int var4 = 0;

               for (Path var8 : var3) {
                  Files.deleteIfExists(var8);
                  var4++;
               }

               var12 = var4;
            }

            return var12;
         } catch (IOException var11) {
            return 0;
         }
      } else {
         return 0;
      }
   }

   private boolean method3751(Path var1) {
      Path var2 = var1.resolve("latest.log");
      if (!Files.exists(var2)) {
         return false;
      } else {
         Path var3 = var1.resolve("latest.log.1");

         try {
            Files.createDirectories(var1);
            Files.move(var2, var3, StandardCopyOption.REPLACE_EXISTING);
            return true;
         } catch (IOException var5) {
            return false;
         }
      }
   }
}
