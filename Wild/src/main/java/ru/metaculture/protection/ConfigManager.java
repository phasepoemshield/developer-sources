package ru.metaculture.protection;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public final class ConfigManager extends ConfigStore<Config> {
   public static final File O00000000 = O000000000000O();
   private static final ArrayList<Config> O000000000 = new ArrayList<>();
   private static final long O0000000000 = 350L;
   private final ScheduledExecutorService O00000000000 = Executors.newSingleThreadScheduledExecutor(runnable -> {
      Thread var1 = new Thread(runnable, "Wild-Config-Autosave");
      var1.setDaemon(true);
      return var1;
   });
   private final Object O000000000000 = new Object();
   private ScheduledFuture<?> O0000000000000;
   private boolean O000000000000O;
   private boolean O00000000000O;

   @Compile
   private static File O000000000000O() { return new java.io.File(System.getProperty("wild.root", "C:/WildClient")); }

   public ConfigManager() {
      if (O00000000 != null && !O00000000.exists() && !O00000000.mkdirs()) {
         System.out.println("[ConfigManager] Warning: cannot create config directory at " + O00000000.getAbsolutePath());
      }

      this.O00000000(O00000000000O());
   }

   @Compile
   private static ArrayList<Config> O00000000000O() {
      ArrayList<Config> var0 = new ArrayList<>();
      File[] var1 = O00000000.listFiles((file, name) -> name.toLowerCase(java.util.Locale.ROOT).endsWith(".json"));
      if (var1 == null) {
         return var0;
      }

      for (File var5 : var1) {
         try {
            JsonElement var6 = JsonParser.parseString(Files.readString(var5.toPath(), StandardCharsets.UTF_8));
            if (var6 != null && var6.isJsonObject() && var6.getAsJsonObject().has("Features")) {
               String var7 = var5.getName();
               var0.add(new Config(var7.substring(0, var7.length() - 5)));
            }
         } catch (Throwable var8) {
            System.out.println("[ConfigManager] Skipping invalid config '" + var5.getName() + "': " + var8.getMessage());
         }
      }

      var0.sort(Comparator.comparing(Config::O000000000, String.CASE_INSENSITIVE_ORDER));
      return var0;
   }

   @Compile
   public static ArrayList<Config> O00000000() { return new ArrayList<>(O000000000); }

   @Compile
   public void O000000000() {
      ArrayList<Config> var1 = O00000000000O();
      O000000000.clear();
      O000000000.addAll(var1);
      this.O00000000(var1);
   }

   @Compile
   public synchronized boolean O00000000(String string) {
      Config var2 = this.O0000000000(string);
      if (var2 == null || var2.O00000000() == null || !var2.O00000000().isFile()) {
         return false;
      }

      try {
         JsonElement var3 = JsonParser.parseString(Files.readString(var2.O00000000().toPath(), StandardCharsets.UTF_8));
         if (var3 == null || !var3.isJsonObject()) {
            return false;
         }

         var2.O00000000(var3.getAsJsonObject());
         if (!this.O0000000000000().contains(var2)) {
            this.O0000000000000().add(var2);
         }
         if (O000000000.stream().noneMatch(config -> config.O000000000().equalsIgnoreCase(var2.O000000000()))) {
            O000000000.add(var2);
         }
         return true;
      } catch (Throwable var4) {
         System.out.println("[ConfigManager] Failed to load '" + string + "': " + var4.getMessage());
         return false;
      }
   }

   @Compile
   public synchronized boolean O00000000(String string, JsonObject jsonObject) {
      if (string == null || string.isBlank() || string.contains("..") || string.contains("/") || string.contains("\\") || jsonObject == null) {
         return false;
      }

      try {
         Config var3 = this.O0000000000(string);
         if (var3 == null) {
            var3 = new Config(string);
            this.O0000000000000().add(var3);
            O000000000.add(var3);
         }
         var3.O00000000(jsonObject);
         return true;
      } catch (Throwable var4) {
         System.out.println("[ConfigManager] Failed to apply '" + string + "': " + var4.getMessage());
         return false;
      }
   }

   public synchronized boolean O000000000(String string) {
      if (string == null) {
         return false;
      } else {
         Config var2;
         if ((var2 = this.O0000000000(string)) == null) {
            try {
               Config var3 = var2 = new Config(string);
               this.O0000000000000().add(var3);
            } catch (Throwable var11) {
               System.out.println("[ConfigManager] Cannot create config '" + string + "': " + var11.getMessage());
               return false;
            }
         }

         File var14 = var2.O00000000();
         if (var14 == null) {
            return false;
         } else {
            File var4 = var14.getParentFile();
            if (var4 != null && !var4.exists() && !var4.mkdirs()) {
               System.out.println("[ConfigManager] Cannot create directory for '" + string + "'");
               return false;
            } else {
               String var5;
               try {
                  var5 = new GsonBuilder().setPrettyPrinting().create().toJson(var2.O0000000000());
               } catch (Throwable var10) {
                  System.out.println("[ConfigManager] Failed to serialize config '" + string + "': " + var10.getMessage());
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
                  System.out.println("[ConfigManager] I/O error saving '" + string + "': " + var13.getMessage());
                  return false;
               }
            }
         }
      }
   }

   public Config O0000000000(String string) {
      if (string == null) {
         return null;
      } else {
         for (Config var3 : this.O0000000000000()) {
            if (var3.O000000000().equalsIgnoreCase(string)) {
               return var3;
            }
         }

         return new File(O00000000, string + ".json").exists() ? new Config(string) : null;
      }
   }

   @Compile
   public synchronized boolean O00000000000(String string) {
      Config var2 = this.O0000000000(string);
      if (var2 == null || "default".equalsIgnoreCase(var2.O000000000())) {
         return false;
      }

      boolean var3;
      try {
         var3 = Files.deleteIfExists(var2.O00000000().toPath());
      } catch (IOException var5) {
         return false;
      }

      this.O0000000000000().removeIf(config -> config.O000000000().equalsIgnoreCase(string));
      O000000000.removeIf(config -> config.O000000000().equalsIgnoreCase(string));
      return var3;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void O0000000000() {
      if (WildClient.O00000000 != null && WildClient.O00000000.O0000000000O00 != null) {
         Object var1 = this.O000000000000;
         synchronized (this.O000000000000){} // $VF: monitorenter 

         try {
            if (this.O00000000000O) {
               // $VF: monitorexit
            } else {
               this.O000000000000O = true;
               if (this.O0000000000000 != null) {
                  this.O0000000000000.cancel(false);
               }

               this.O0000000000000 = this.O00000000000.schedule(this::O00000000000O0, 350L, TimeUnit.MILLISECONDS);
               // $VF: monitorexit
            }
         } finally {
            // $VF: monitorexit
         }
      }
   }

   public void O00000000000() {
      boolean var1;
      synchronized (this.O000000000000) {
         if (this.O00000000000O) {
            return;
         }

         this.O00000000000O = true;
         var1 = this.O000000000000O;
         this.O000000000000O = false;
         if (this.O0000000000000 != null) {
            this.O0000000000000.cancel(false);
            this.O0000000000000 = null;
         }
      }

      if (var1) {
         this.O000000000("default");
      }

      this.O00000000000.shutdown();

      try {
         this.O00000000000.awaitTermination(1L, TimeUnit.SECONDS);
      } catch (InterruptedException var4) {
         Thread.currentThread().interrupt();
      }
   }

   private void O00000000000O0() {
      synchronized (this.O000000000000) {
         if (!this.O000000000000O) {
            this.O0000000000000 = null;
            return;
         }

         this.O000000000000O = false;
         this.O0000000000000 = null;
      }

      if (!this.O000000000("default")) {
         synchronized (this.O000000000000) {
            if (!this.O00000000000O) {
               this.O000000000000O = true;
               this.O0000000000000 = this.O00000000000.schedule(this::O00000000000O0, 350L, TimeUnit.MILLISECONDS);
            }
         }
      }
   }

   @Compile
   public boolean O000000000000() { return !this.O00000000000O && O00000000.isDirectory(); }

   static {
      Loader.initialize();
   }
}
