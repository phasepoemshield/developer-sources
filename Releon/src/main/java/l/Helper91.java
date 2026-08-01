package l;

import java.io.File;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Helper91 {
   private final List<Helper95> clientFiles;
   private final File directory;
   private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

   public Helper91(List<Helper95> var1, File var2) {
      this.clientFiles = var1;
      this.directory = var2;
      this.method894();
   }

   public void method894() {
      Helper211.method1807("Auto-save system started!");
      this.scheduler.scheduleAtFixedRate(() -> {
         try {
            Helper211.method1807("Saving with auto-save.");
            this.method896();
         } catch (Helper111 var2) {
            Helper211.method1813("Failed to auto-save files: " + var2.getMessage());
         }
      }, 1L, 1L, TimeUnit.MINUTES);
   }

   public void method895() {
      Helper211.method1807("Auto-save shutdown!");
      this.scheduler.shutdown();

      try {
         if (!this.scheduler.awaitTermination(1L, TimeUnit.MINUTES)) {
            this.scheduler.shutdownNow();
         }
      } catch (InterruptedException var2) {
         this.scheduler.shutdownNow();
      }
   }

   public void method896() throws Helper111 {
      if (this.clientFiles.isEmpty()) {
         Helper211.method1810("No files to save from directory: " + this.directory.getPath());
      } else {
         for (Helper95 var2 : this.clientFiles) {
            try {
               var2.method584(this.directory);
               Helper211.method1807("Successfully saved file: " + var2.getName() + " to " + this.directory.getPath());
            } catch (Helper111 var4) {
               throw new Helper111("Failed to save file: " + var2.getName(), var4);
            }
         }
      }
   }

   public void method897() throws Helper122 {
      if (this.clientFiles.isEmpty()) {
         Helper211.method1810("No files to load from directory: " + this.directory.getPath());
      } else {
         for (Helper95 var2 : this.clientFiles) {
            try {
               var2.method583(this.directory);
               Helper211.method1807("Successfully loaded file: " + var2.getName() + " from " + this.directory.getPath());
            } catch (Helper122 var4) {
               throw new Helper122("Failed to load file: " + var2.getName(), var4);
            }
         }
      }
   }

   public void method898(String var1) throws Helper111 {
      for (Helper95 var3 : this.clientFiles) {
         if (var3 instanceof AutoCfg) {
            try {
               var3.method879(this.directory, var1);
               Helper211.method1807("Successfully saved file: " + var1 + " to " + this.directory.getPath());
            } catch (Helper111 var5) {
               throw new Helper111("Failed to save file: " + var1, var5);
            }
         }
      }
   }

   public void method899(String var1) throws Helper122 {
      for (Helper95 var3 : this.clientFiles) {
         if (var3 instanceof AutoCfg) {
            try {
               var3.method880(this.directory, var1);
               Helper211.method1807("Successfully loaded file: " + var1 + " from " + this.directory.getPath());
            } catch (Helper122 var5) {
               throw new Helper122("Failed to load file: " + var1, var5);
            }
         }
      }
   }

   public void method900(Class<? extends Helper95> var1) {
      this.clientFiles.stream().filter(var1::isInstance).findFirst().ifPresent(var1x -> {
         try {
            var1x.method584(this.directory);
            Helper211.method1807("Successfully saved file on-demand: " + var1x.getName());
         } catch (Helper111 var3) {
            Helper211.method1814("Failed to save file on-demand: " + var1x.getName(), var3);
         }
      });
   }
}
