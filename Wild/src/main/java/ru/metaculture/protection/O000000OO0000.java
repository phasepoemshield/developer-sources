package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public final class O000000OO0000 implements MinecraftAccessor {
   private static final Gson O00000000 = new GsonBuilder().setPrettyPrinting().create();
   private final List<O000000OO0000.W47> O000000000 = new ArrayList<>();
   private long O0000000000;
   private int O00000000000 = -1;
   private long O000000000000 = -1L;

   public O000000OO000.W45 O00000000(float f, float g, boolean bl) {
      this.O00000000(false);
      if (this.O000000000.isEmpty()) {
         return null;
      } else {
         float var4 = (float)Math.hypot(Math.abs(f), Math.abs(g));
         float var5 = var4 <= 0.001F ? 1.0F : Math.abs(f) / var4;
         String var6 = O000000000(var4, var5, bl);
         return this.O000000000
            .stream()
            .min(Comparator.comparingDouble(o00000000 -> this.O00000000(o00000000.pattern, var4, var5, var6)))
            .map(o00000000 -> o00000000.pattern)
            .orElse(null);
      }
   }

   public int O00000000() {
      this.O00000000(false);
      return this.O000000000.size();
   }

   public String O000000000() {
      this.O00000000(false);
      return this.O000000000.isEmpty() ? "Neuro: no assets" : "Neuro: " + this.O000000000.size() + " patterns";
   }

   public void O0000000000() {
      this.O00000000(true);
   }

   public static Path O00000000000() {
      return WildClient.O00000000 != null && WildClient.O00000000.O0000000000000 != null
         ? WildClient.O00000000.O0000000000000.toPath().resolve("rotation_assets")
         : a_.runDirectory.toPath().resolve("Wild").resolve("rotation_assets");
   }

   public static Path O00000000(String string) {
      String var1 = O000000000(string);
      return O00000000000().resolve(var1 + ".json");
   }

   public static O000000OO000 O00000000(Path path) {
      if (!Files.isRegularFile(path)) {
         return null;
      } else {
         try {
            O000000OO000 var3;
            try (BufferedReader var1 = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
               O000000OO000 var2 = (O000000OO000)O00000000.fromJson(var1, O000000OO000.class);
               O00000000(var2, O0000000000(path.getFileName().toString()));
               var3 = var2;
            }

            return var3;
         } catch (Throwable var6) {
            return null;
         }
      }
   }

   public static void O00000000(Path path, O000000OO000 o000000OO000) {
      try {
         Files.createDirectories(path.getParent());
         O00000000(o000000OO000, O0000000000(path.getFileName().toString()));

         try (BufferedWriter var2 = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            O00000000.toJson(o000000OO000, var2);
         }
      } catch (Throwable var7) {
      }
   }

   public static String O000000000(String string) {
      String var1 = string != null && !string.isBlank() ? string.trim() : "rotation_lab";
      var1 = var1.replace('\\', '/');
      int var2 = var1.lastIndexOf(47);
      if (var2 >= 0) {
         var1 = var1.substring(var2 + 1);
      }

      if (var1.endsWith(".json")) {
         var1 = var1.substring(0, var1.length() - 5);
      }

      var1 = var1.replaceAll("[^a-zA-Z0-9._-]", "_");
      if (var1.isBlank() || var1.equals(".") || var1.equals("..")) {
         var1 = "rotation_lab";
      }

      return var1;
   }

   private void O00000000(boolean bl) {
      long var2 = System.currentTimeMillis();
      if (bl || var2 - this.O0000000000 >= 1500L) {
         this.O0000000000 = var2;
         Path var4 = O00000000000();
         int var5 = 0;
         long var6 = 0L;

         try {
            if (Files.isDirectory(var4)) {
               try (Stream var8 = Files.list(var4)) {
                  List var9 = ((Stream<Path>)var8).filter(path -> Files.isRegularFile(path) && path.getFileName().toString().endsWith(".json")).toList();
                  var5 = var9.size();

                  for (Path var11 : (List<Path>)var9) {
                     var6 += Files.getLastModifiedTime(var11).toMillis();
                  }
               }
            }
         } catch (Throwable var17) {
         }

         if (bl || var5 != this.O00000000000 || var6 != this.O000000000000) {
            this.O00000000000 = var5;
            this.O000000000000 = var6;
            this.O000000000.clear();
            if (var5 != 0) {
               try (Stream var18 = Files.list(var4)) {
                  ((Stream<Path>)var18).filter(path -> Files.isRegularFile(path) && path.getFileName().toString().endsWith(".json")).forEach(this::O000000000);
               } catch (Throwable var15) {
               }
            }
         }
      }
   }

   private void O000000000(Path path) {
      O000000OO000 var2 = O00000000(path);
      if (var2 != null && var2.O0000000000000 != null) {
         for (O000000OO000.W45 var4 : var2.O0000000000000) {
            if (O00000000(var4)) {
               this.O000000000.add(new O000000OO0000.W47(path.getFileName().toString(), var4));
            }
         }
      }
   }

   private static void O00000000(O000000OO000 o000000OO000, String string) {
      if (o000000OO000 != null) {
         o000000OO000.O00000000 = 1;
         if (o000000OO000.O00000000000 == null || o000000OO000.O00000000000.isBlank()) {
            o000000OO000.O00000000000 = string;
         }

         if (o000000OO000.O0000000000000 == null) {
            o000000OO000.O0000000000000 = new ArrayList<>();
         }

         o000000OO000.O0000000000000.removeIf(o00000000 -> !O00000000(o00000000));

         for (O000000OO000.W45 var3 : o000000OO000.O0000000000000) {
            if (var3.O00000000 == null || var3.O00000000.isBlank()) {
               var3.O00000000 = "Mixed";
            }

            var3.O0000000000O0.sort(Comparator.comparingInt(o000000000 -> o000000000.O00000000));
            var3.O00000000000O0 = Math.max(var3.O00000000000O0, var3.O0000000000O0.get(var3.O0000000000O0.size() - 1).O00000000 + 1);
            O000000OO000.W46 var4 = var3.O0000000000O0.get(var3.O0000000000O0.size() - 1);
            var3.O000000000000 = Math.abs(var3.O000000000000) > 0.001F ? var3.O000000000000 : var4.O000000000;
            var3.O0000000000000 = Math.abs(var3.O0000000000000) > 0.001F ? var3.O0000000000000 : var4.O0000000000;
            var3.O0000000000O = Math.max(0.0F, Math.min(1.0F, var3.O0000000000O));
         }
      }
   }

   private static boolean O00000000(O000000OO000.W45 o00000000) {
      return o00000000 != null && o00000000.O0000000000O0 != null && o00000000.O0000000000O0.size() >= 2;
   }

   private double O00000000(O000000OO000.W45 o00000000, float f, float g, String string) {
      float var5 = Math.max(0.001F, o00000000.O00000000());
      float var6 = Math.abs(o00000000.O000000000000) / var5;
      double var7 = Math.abs(var5 - f) * 0.85;
      double var9 = Math.abs(var6 - g) * 12.0;
      double var11 = O00000000(o00000000.O00000000, string);
      double var13 = (1.0 - o00000000.O0000000000O) * 5.0;
      double var15 = ThreadLocalRandom.current().nextDouble(0.0, 1.35);
      return var7 + var9 + var11 + var13 + var15;
   }

   private static double O00000000(String string, String string2) {
      String var2 = string == null ? "" : string.toLowerCase(Locale.ROOT);
      String var3 = string2 == null ? "" : string2.toLowerCase(Locale.ROOT);
      if (var2.equals(var3) || var2.equals("mixed")) {
         return 0.0;
      } else if (var3.equals("mixed")) {
         return 1.0;
      } else {
         return !var2.contains(var3) && !var3.contains(var2) ? 3.0 : 0.75;
      }
   }

   private static String O000000000(float f, float g, boolean bl) {
      if (bl) {
         return "Attack";
      } else if (f < 6.0F) {
         return "Micro";
      } else if (g < 0.35F) {
         return "Vertical";
      } else {
         return f > 28.0F ? "Flick" : "Tracking";
      }
   }

   private static String O0000000000(String string) {
      return string != null && string.endsWith(".json") ? string.substring(0, string.length() - 5) : string;
   }

   record W47(String file, O000000OO000.W45 pattern) {
   }
}
