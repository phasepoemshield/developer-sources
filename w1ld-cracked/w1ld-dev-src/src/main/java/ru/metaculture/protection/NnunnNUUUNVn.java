package ru.metaculture.protection;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FilenameUtils;
import org.wild.module.api.Module;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public final class NnunnNUUUNVn extends UnvUUvuVNunV<UNVVUvUnNuNU> {
   public static final File UuUVuuUu = VVuuUN();
   private static final ArrayList<UNVVUvUnNuNU> C00OOC00oO = new ArrayList<>();
   private static final long uUnuvNvvNU = 350L;
   private final ScheduledExecutorService vVvUvVVuuNvV = Executors.newSingleThreadScheduledExecutor(var0 -> {
      Thread var1 = new Thread(var0, "Wild-Config-Autosave");
      var1.setDaemon(true);
      return var1;
   });
   private final Object uNNnnnuuuN = new Object();
   private ScheduledFuture<?> nuUnNvnuUu;
   private boolean VVuuUN;
   private boolean vNUvnnVnUvu;

   @Compile
   private static File VVuuUN() {
      File var0 = NVnVnNnN.UuUVuuUu != null ? NVnVnNnN.UuUVuuUu.nuUnNvnuUu : NVnVnNnN.C00OOC00oO();
      return new File(var0, "configs" + File.separator + "cfg");
   }

   public NnunnNUUUNVn() {
      if (UuUVuuUu != null && !UuUVuuUu.exists() && !UuUVuuUu.mkdirs()) {
         System.out.println("[ConfigManager] Warning: cannot create config directory at " + UuUVuuUu.getAbsolutePath());
      }

      this.UuUVuuUu(vNUvnnVnUvu());
   }

   @Compile
   private static ArrayList<UNVVUvUnNuNU> vNUvnnVnUvu() {
      synchronized (C00OOC00oO) {
         File[] var1 = UuUVuuUu == null ? null : UuUVuuUu.listFiles();
         if (var1 != null) {
            for (File var5 : var1) {
               if (FilenameUtils.getExtension(var5.getName()).equals("json")) {
                  C00OOC00oO.add(new UNVVUvUnNuNU(FilenameUtils.removeExtension(var5.getName())));
               }
            }
         }

         return C00OOC00oO;
      }
   }

   @Compile
   public static ArrayList<UNVVUvUnNuNU> UuUVuuUu() {
      return C00OOC00oO;
   }

   @Compile
   public void C00OOC00oO() {
      if (UuUVuuUu != null) {
         if (!UuUVuuUu.exists() && !UuUVuuUu.mkdirs()) {
            System.out.println("[ConfigManager] Warning: cannot create config dir on load");
         } else {
            synchronized (C00OOC00oO) {
               C00OOC00oO.clear();
               File[] var2 = UuUVuuUu.listFiles(File::isFile);
               if (var2 != null) {
                  for (File var6 : var2) {
                     String var7 = FilenameUtils.removeExtension(var6.getName()).replace(" ", "");
                     C00OOC00oO.add(new UNVVUvUnNuNU(var7));
                  }
               }
            }
         }
      }
   }

   @Compile
   public synchronized boolean UuUVuuUu(String var1) {
      if (var1 == null) {
         return false;
      } else {
         UNVVUvUnNuNU var2 = this.uUnuvNvvNU(var1);
         if (var2 == null) {
            return false;
         } else {
            try {
               boolean var5;
               try (BufferedReader var3 = Files.newBufferedReader(var2.UuUVuuUu().toPath(), StandardCharsets.UTF_8)) {
                  JsonObject var4 = JsonParser.parseReader(var3).getAsJsonObject();
                  var5 = this.UuUVuuUu(var1, var4);
               }

               return var5;
            } catch (Exception var8) {
               var8.printStackTrace();
               return false;
            }
         }
      }
   }

   @Compile
   public synchronized boolean UuUVuuUu(String var1, JsonObject var2) {
      if (var1 != null && var2 != null) {
         UNVVUvUnNuNU var3 = this.uUnuvNvvNU(var1);
         if (var3 == null) {
            var3 = new UNVVUvUnNuNU(var1);
            this.nuUnNvnuUu().add(var3);
         }

         var3.UuUVuuUu(var2);
         return true;
      } else {
         return false;
      }
   }

   public synchronized boolean C00OOC00oO(String var1) {
      if (var1 == null) {
         return false;
      } else {
         UNVVUvUnNuNU var2;
         if ((var2 = this.uUnuvNvvNU(var1)) == null) {
            try {
               UNVVUvUnNuNU var3 = var2 = new UNVVUvUnNuNU(var1);
               this.nuUnNvnuUu().add(var3);
            } catch (Throwable var11) {
               System.out.println("[ConfigManager] Cannot create config '" + var1 + "': " + var11.getMessage());
               return false;
            }
         }

         File var14 = var2.UuUVuuUu();
         if (var14 == null) {
            return false;
         } else {
            File var4 = var14.getParentFile();
            if (var4 != null && !var4.exists() && !var4.mkdirs()) {
               System.out.println("[ConfigManager] Cannot create directory for '" + var1 + "'");
               return false;
            } else {
               String var5;
               try {
                  var5 = new GsonBuilder().setPrettyPrinting().create().toJson(var2.uUnuvNvvNU());
               } catch (Throwable var10) {
                  System.out.println("[ConfigManager] Failed to serialize config '" + var1 + "': " + var10.getMessage());
                  return false;
               }

               try {
                  boolean var7;
                  try (BufferedWriter var6 = Files.newBufferedWriter(var14.toPath(), StandardCharsets.UTF_8)) {
                     var6.write(var5);
                     var7 = true;
                  }

                  return var7;
               } catch (IOException var13) {
                  System.out.println("[ConfigManager] I/O error saving '" + var1 + "': " + var13.getMessage());
                  return false;
               }
            }
         }
      }
   }

   public UNVVUvUnNuNU uUnuvNvvNU(String var1) {
      if (var1 == null) {
         return null;
      } else {
         for (UNVVUvUnNuNU var3 : this.nuUnNvnuUu()) {
            if (var3.C00OOC00oO().equalsIgnoreCase(var1)) {
               return var3;
            }
         }

         return new File(UuUVuuUu, var1 + ".json").exists() ? new UNVVUvUnNuNU(var1) : null;
      }
   }

   @Compile
   public boolean vVvUvVVuuNvV(String var1) {
      if (var1 == null) {
         return false;
      } else {
         UNVVUvUnNuNU var2 = this.uUnuvNvvNU(var1);
         if (var2 == null) {
            return false;
         } else {
            File var3 = var2.UuUVuuUu();
            this.nuUnNvnuUu().remove(var2);
            return var3.exists() && var3.delete();
         }
      }
   }

   public void uUnuvNvvNU() {
      if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
         synchronized (this.uNNnnnuuuN) {
            if (!this.vNUvnnVnUvu) {
               this.VVuuUN = true;
               if (this.nuUnNvnuUu != null) {
                  this.nuUnNvnuUu.cancel(false);
               }

               this.nuUnNvnuUu = this.vVvUvVVuuNvV.schedule(this::uVUuuVnNVU, 350L, TimeUnit.MILLISECONDS);
            }
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void vVvUvVVuuNvV() {
      Object var2 = this.uNNnnnuuuN;
      synchronized (this.uNNnnnuuuN){} // $VF: monitorenter 
      boolean var6 = false /* VF: Semaphore variable */;

      boolean var1;
      try {
         var6 = true;
         if (this.vNUvnnVnUvu) {
            // $VF: monitorexit
            return;
         }

         this.vNUvnnVnUvu = true;
         var1 = this.VVuuUN;
         this.VVuuUN = false;
         if (this.nuUnNvnuUu != null) {
            this.nuUnNvnuUu.cancel(false);
            this.nuUnNvnuUu = null;
         }

         // $VF: monitorexit
         var6 = false;
      } finally {
         if (var6) {
            // $VF: monitorexit
         }
      }

      if (var1) {
         this.C00OOC00oO("default");
      }

      this.vVvUvVVuuNvV.shutdown();

      try {
         this.vVvUvVVuuNvV.awaitTermination(1L, TimeUnit.SECONDS);
      } catch (InterruptedException var7) {
         Thread.currentThread().interrupt();
      }
   }

   private void uVUuuVnNVU() {
      synchronized (this.uNNnnnuuuN) {
         if (!this.VVuuUN) {
            this.nuUnNvnuUu = null;
            return;
         }

         this.VVuuUN = false;
         this.nuUnNvnuUu = null;
      }

      if (!this.C00OOC00oO("default")) {
         synchronized (this.uNNnnnuuuN) {
            if (!this.vNUvnnVnUvu) {
               this.VVuuUN = true;
               this.nuUnNvnuUu = this.vVvUvVVuuNvV.schedule(this::uVUuuVnNVU, 350L, TimeUnit.MILLISECONDS);
            }
         }
      }
   }

   @Compile
   public boolean uNNnnnuuuN() {
      if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
         for (Module var2 : NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu) {
            var2.c_();
         }

         nNuUNVu.UuUVuuUu().UuUVuuUu(Map.of());
         uNvNvUNUnuu.uUnuvNvvNU();
         return this.UuUVuuUu("default");
      } else {
         return false;
      }
   }

   static {
      Loader.initialize();
   }
}
