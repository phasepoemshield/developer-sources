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

public final class NUNNNUuUNnVv implements O000c0oocoo {
   private static final Gson UuUVuuUu = new GsonBuilder().setPrettyPrinting().create();
   private final List<NUNNNUuUNnVv.NVnVnNnN> C00OOC00oO = new ArrayList<>();
   private long uUnuvNvvNU;
   private int vVvUvVVuuNvV = -1;
   private long uNNnnnuuuN = -1L;

   public NUnUuVuNv.NVnVnNnN UuUVuuUu(float var1, float var2, boolean var3) {
      this.UuUVuuUu(false);
      if (this.C00OOC00oO.isEmpty()) {
         return null;
      } else {
         float var4 = (float)Math.hypot(Math.abs(var1), Math.abs(var2));
         float var5 = var4 <= 0.001F ? 1.0F : Math.abs(var1) / var4;
         String var6 = C00OOC00oO(var4, var5, var3);
         return this.C00OOC00oO
            .stream()
            .min(Comparator.comparingDouble(var4x -> this.UuUVuuUu(var4x.pattern, var4, var5, var6)))
            .map(var0 -> var0.pattern)
            .orElse(null);
      }
   }

   public int UuUVuuUu() {
      this.UuUVuuUu(false);
      return this.C00OOC00oO.size();
   }

   public String C00OOC00oO() {
      this.UuUVuuUu(false);
      return this.C00OOC00oO.isEmpty() ? "Neuro: no assets" : "Neuro: " + this.C00OOC00oO.size() + " patterns";
   }

   public void uUnuvNvvNU() {
      this.UuUVuuUu(true);
   }

   public static Path vVvUvVVuuNvV() {
      return ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nuUnNvnuUu != null
         ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nuUnNvnuUu.toPath().resolve("rotation_assets")
         : a_.field_1697.toPath().resolve("Wild").resolve("rotation_assets");
   }

   public static Path UuUVuuUu(String var0) {
      String var1 = C00OOC00oO(var0);
      return vVvUvVVuuNvV().resolve(var1 + ".json");
   }

   public static NUnUuVuNv UuUVuuUu(Path var0) {
      if (!Files.isRegularFile(var0)) {
         return null;
      } else {
         try {
            NUnUuVuNv var3;
            try (BufferedReader var1 = Files.newBufferedReader(var0, StandardCharsets.UTF_8)) {
               NUnUuVuNv var2 = (NUnUuVuNv)UuUVuuUu.fromJson(var1, NUnUuVuNv.class);
               UuUVuuUu(var2, uUnuvNvvNU(var0.getFileName().toString()));
               var3 = var2;
            }

            return var3;
         } catch (Throwable var6) {
            return null;
         }
      }
   }

   public static void UuUVuuUu(Path var0, NUnUuVuNv var1) {
      try {
         Files.createDirectories(var0.getParent());
         UuUVuuUu(var1, uUnuvNvvNU(var0.getFileName().toString()));

         try (BufferedWriter var2 = Files.newBufferedWriter(var0, StandardCharsets.UTF_8)) {
            UuUVuuUu.toJson(var1, var2);
         }
      } catch (Throwable var7) {
      }
   }

   public static String C00OOC00oO(String var0) {
      String var1 = var0 != null && !var0.isBlank() ? var0.trim() : "rotation_lab";
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

   private void UuUVuuUu(boolean var1) {
      long var2 = System.currentTimeMillis();
      if (var1 || var2 - this.uUnuvNvvNU >= 1500L) {
         this.uUnuvNvvNU = var2;
         Path var4 = vVvUvVVuuNvV();
         int var5 = 0;
         long var6 = 0L;

         try {
            if (Files.isDirectory(var4)) {
               try (Stream var8 = Files.list(var4)) {
                  List var9 = var8.filter(var0 -> Files.isRegularFile(var0) && var0.getFileName().toString().endsWith(".json")).toList();
                  var5 = var9.size();

                  for (Path var11 : var9) {
                     var6 += Files.getLastModifiedTime(var11).toMillis();
                  }
               }
            }
         } catch (Throwable var17) {
         }

         if (var1 || var5 != this.vVvUvVVuuNvV || var6 != this.uNNnnnuuuN) {
            this.vVvUvVVuuNvV = var5;
            this.uNNnnnuuuN = var6;
            this.C00OOC00oO.clear();
            if (var5 != 0) {
               try (Stream var18 = Files.list(var4)) {
                  var18.filter(var0 -> Files.isRegularFile(var0) && var0.getFileName().toString().endsWith(".json")).forEach(this::C00OOC00oO);
               } catch (Throwable var15) {
               }
            }
         }
      }
   }

   private void C00OOC00oO(Path var1) {
      NUnUuVuNv var2 = UuUVuuUu(var1);
      if (var2 != null && var2.nuUnNvnuUu != null) {
         for (NUnUuVuNv.NVnVnNnN var4 : var2.nuUnNvnuUu) {
            if (UuUVuuUu(var4)) {
               this.C00OOC00oO.add(new NUNNNUuUNnVv.NVnVnNnN(var1.getFileName().toString(), var4));
            }
         }
      }
   }

   private static void UuUVuuUu(NUnUuVuNv var0, String var1) {
      if (var0 != null) {
         var0.UuUVuuUu = 1;
         if (var0.vVvUvVVuuNvV == null || var0.vVvUvVVuuNvV.isBlank()) {
            var0.vVvUvVVuuNvV = var1;
         }

         if (var0.nuUnNvnuUu == null) {
            var0.nuUnNvnuUu = new ArrayList<>();
         }

         var0.nuUnNvnuUu.removeIf(var0x -> !UuUVuuUu(var0x));

         for (NUnUuVuNv.NVnVnNnN var3 : var0.nuUnNvnuUu) {
            if (var3.UuUVuuUu == null || var3.UuUVuuUu.isBlank()) {
               var3.UuUVuuUu = "Mixed";
            }

            var3.UuuNnUvUuv.sort(Comparator.comparingInt(var0x -> var0x.UuUVuuUu));
            var3.uVUuuVnNVU = Math.max(var3.uVUuuVnNVU, var3.UuuNnUvUuv.get(var3.UuuNnUvUuv.size() - 1).UuUVuuUu + 1);
            NUnUuVuNv.nvnNNunvv var4 = var3.UuuNnUvUuv.get(var3.UuuNnUvUuv.size() - 1);
            var3.uNNnnnuuuN = Math.abs(var3.uNNnnnuuuN) > 0.001F ? var3.uNNnnnuuuN : var4.C00OOC00oO;
            var3.nuUnNvnuUu = Math.abs(var3.nuUnNvnuUu) > 0.001F ? var3.nuUnNvnuUu : var4.uUnuvNvvNU;
            var3.nvUVNnuu = Math.max(0.0F, Math.min(1.0F, var3.nvUVNnuu));
         }
      }
   }

   private static boolean UuUVuuUu(NUnUuVuNv.NVnVnNnN var0) {
      return var0 != null && var0.UuuNnUvUuv != null && var0.UuuNnUvUuv.size() >= 2;
   }

   private double UuUVuuUu(NUnUuVuNv.NVnVnNnN var1, float var2, float var3, String var4) {
      float var5 = Math.max(0.001F, var1.UuUVuuUu());
      float var6 = Math.abs(var1.uNNnnnuuuN) / var5;
      double var7 = Math.abs(var5 - var2) * 0.85;
      double var9 = Math.abs(var6 - var3) * 12.0;
      double var11 = UuUVuuUu(var1.UuUVuuUu, var4);
      double var13 = (1.0 - var1.nvUVNnuu) * 5.0;
      double var15 = ThreadLocalRandom.current().nextDouble(0.0, 1.35);
      return var7 + var9 + var11 + var13 + var15;
   }

   private static double UuUVuuUu(String var0, String var1) {
      String var2 = var0 == null ? "" : var0.toLowerCase(Locale.ROOT);
      String var3 = var1 == null ? "" : var1.toLowerCase(Locale.ROOT);
      if (var2.equals(var3) || var2.equals("mixed")) {
         return 0.0;
      } else if (var3.equals("mixed")) {
         return 1.0;
      } else {
         return !var2.contains(var3) && !var3.contains(var2) ? 3.0 : 0.75;
      }
   }

   private static String C00OOC00oO(float var0, float var1, boolean var2) {
      if (var2) {
         return "Attack";
      } else if (var0 < 6.0F) {
         return "Micro";
      } else if (var1 < 0.35F) {
         return "Vertical";
      } else {
         return var0 > 28.0F ? "Flick" : "Tracking";
      }
   }

   private static String uUnuvNvvNU(String var0) {
      return var0 != null && var0.endsWith(".json") ? var0.substring(0, var0.length() - 5) : var0;
   }

   record NVnVnNnN(String file, NUnUuVuNv.NVnVnNnN pattern) {
   }
}
