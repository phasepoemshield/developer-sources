package ru.metaculture.protection;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import net.minecraft.class_310;
import org.json.JSONArray;
import org.json.JSONObject;

public final class lllilIiI11l {
   private static final lllilIiI11l UuUVuuUu = new lllilIiI11l();
   private static final String C00OOC00oO = "active.json";
   private static final String uUnuvNvvNU = ".theme.json";
   private static final String vVvUvVVuuNvV = ".wifd";
   private static final String uNNnnnuuuN = ".json";
   private static final DateTimeFormatter nuUnNvnuUu = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
   private final File VVuuUN;
   private final Map<VnuVUNUv, String> vNUvnnVnUvu = new EnumMap<>(VnuVUNUv.class);
   private final Map<String, VUvUNNUvvNVN> uVUuuVnNVU = new HashMap<>();
   private boolean vuuuNvNuv;

   private lllilIiI11l() {
      File var1 = NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.nuUnNvnuUu != null
         ? new File(NVnVnNnN.UuUVuuUu.nuUnNvnuUu, "foundry")
         : new File(NVnVnNnN.C00OOC00oO(), "foundry");
      this.VVuuUN = var1;
      if (!var1.exists() && !var1.mkdirs()) {
         System.out.println("[FoundryStorage] cannot create directory " + var1.getAbsolutePath());
      }
   }

   public static lllilIiI11l UuUVuuUu() {
      return UuUVuuUu;
   }

   public synchronized void UuUVuuUu(nvvuUNnNvN var1) {
      if (!this.vuuuNvNuv) {
         this.vuuuNvNuv = true;
         this.uVUuuVnNVU.clear();
         if (this.VVuuUN.isDirectory()) {
            this.vNUvnnVnUvu();
            File[] var2 = this.VVuuUN.listFiles((var0, var1x) -> var1x.endsWith(".theme.json"));
            ArrayList var3 = new ArrayList();
            if (var2 != null) {
               for (File var7 : var2) {
                  if (!uUnuvNvvNU(var7.getName())) {
                     var3.add(var7);
                  } else {
                     try {
                        VUvUNNUvvNVN var8 = this.UuUVuuUu(var7, new JSONObject(UuUVuuUu(var7)));
                        this.uVUuuVnNVU.put(var8.UuUVuuUu(), var8);
                     } catch (Throwable var9) {
                        System.out.println("[FoundryStorage] skip " + var7.getName() + ": " + var9.getMessage());
                     }
                  }
               }
            }

            boolean var10 = false;

            for (File var12 : var3) {
               var10 |= this.C00OOC00oO(var12, var1);
            }

            if (var10) {
               this.uVUuuVnNVU();
            }
         }
      }
   }

   public synchronized List<VUvUNNUvvNVN> C00OOC00oO() {
      ArrayList var1 = new ArrayList<>(this.uVUuuVnNVU.values());
      var1.sort((var0, var1x) -> Long.compare(var1x.nvUVNnuu(), var0.nvUVNnuu()));
      return var1;
   }

   public synchronized List<VUvUNNUvvNVN> UuUVuuUu(VnuVUNUv var1) {
      if (var1 == null) {
         return Collections.emptyList();
      } else {
         ArrayList var2 = new ArrayList();

         for (VUvUNNUvvNVN var4 : this.uVUuuVnNVU.values()) {
            if (var1.UuUVuuUu().equals(var4.uUnuvNvvNU())) {
               var2.add(var4);
            }
         }

         var2.sort((var0, var1x) -> Long.compare(var1x.nvUVNnuu(), var0.nvUVNnuu()));
         return var2;
      }
   }

   public synchronized VUvUNNUvvNVN UuUVuuUu(String var1) {
      return var1 == null ? null : this.uVUuuVnNVU.get(var1);
   }

   public synchronized VUvUNNUvvNVN UuUVuuUu(VnuVUNUv var1, nuVVnvn var2, String var3, String var4) {
      if (var1 != null && var2 != null) {
         long var5 = System.currentTimeMillis();
         String var7 = var3 != null && !var3.isBlank() ? var3.trim() : var2.UuUVuuUu().C00OOC00oO();
         if (var7 == null || var7.isBlank()) {
            var7 = nVNvNVnvnVvn.UuUVuuUu();
         }

         UVVNvnVNvN var8 = var2.UuUVuuUu();
         var8.UuUVuuUu(var7, VVuuUN());
         var8.UuUVuuUu(var7);
         var8.C00OOC00oO(var5);
         var8.uNNnnnuuuN("local");
         String var9 = VnnVNVNVUnnn.UuUVuuUu(var2);
         VUvUNNUvvNVN var10 = var4 == null ? null : this.uVUuuVnNVU.get(var4);
         if (var10 == null) {
            var10 = new VUvUNNUvvNVN(
               this.vuuuNvNuv(),
               var7,
               var1.UuUVuuUu(),
               var9,
               var8.uUnuvNvvNU(),
               var8.vVvUvVVuuNvV(),
               var8.uNNnnnuuuN(),
               "user",
               "saved",
               var8.uVUuuVnNVU(),
               var5,
               var8.nvUVNnuu()
            );
            this.uVUuuVnNVU.put(var10.UuUVuuUu(), var10);
         } else {
            var10.UuUVuuUu(var7);
            var10.C00OOC00oO(var1.UuUVuuUu());
            var10.uUnuvNvvNU(var9);
            var10.vVvUvVVuuNvV(var8.uUnuvNvvNU());
            var10.uNNnnnuuuN(var8.vVvUvVVuuNvV());
            var10.nuUnNvnuUu(var8.uNNnnnuuuN());
            var10.VVuuUN("user");
            var10.vNUvnnVnUvu("saved");
            var10.UuUVuuUu(var8.uVUuuVnNVU());
            var10.C00OOC00oO(var5);
            var10.UuUVuuUu(var8.nvUVNnuu());
         }

         try {
            this.UuUVuuUu(var10, var8);
         } catch (IOException var12) {
            System.out.println("[FoundryStorage] save failed: " + var12.getMessage());
         }

         return var10;
      } else {
         return null;
      }
   }

   public synchronized VUvUNNUvvNVN UuUVuuUu(VnuVUNUv var1, nuVVnvn var2, String var3) {
      if (var1 != null && var2 != null) {
         VUvUNNUvvNVN var4 = var3 == null ? null : this.uVUuuVnNVU.get(var3);
         String var5 = var4 == null ? var2.UuUVuuUu().C00OOC00oO() : var4.C00OOC00oO();
         return this.UuUVuuUu(var1, var2, var5, var3);
      } else {
         return null;
      }
   }

   public synchronized File uUnuvNvvNU() {
      File var1 = new File(this.VVuuUN, "shaders");
      if (!var1.exists()) {
         var1.mkdirs();
      }

      return var1;
   }

   public synchronized File vVvUvVVuuNvV() {
      if (!this.VVuuUN.exists()) {
         this.VVuuUN.mkdirs();
      }

      return this.VVuuUN;
   }

   public synchronized File C00OOC00oO(VnuVUNUv var1, nuVVnvn var2, String var3) {
      if (var2 == null) {
         return null;
      } else {
         VnuVUNUv var4 = var1 == null ? VnuVUNUv.UuUVuuUu(var2.C00OOC00oO()) : var1;
         String var5 = var3 != null && !var3.isBlank() ? var3.trim() : var2.UuUVuuUu().C00OOC00oO();
         if (var5 == null || var5.isBlank()) {
            var5 = nVNvNVnvnVvn.UuUVuuUu();
         }

         UVVNvnVNvN var6 = var2.UuUVuuUu();
         var6.UuUVuuUu(var5, VVuuUN());
         var6.UuUVuuUu(var5);
         var6.C00OOC00oO(System.currentTimeMillis());
         var6.uNNnnnuuuN("shared");
         String var7 = vVvUvVVuuNvV(var5);
         String var8 = LocalDateTime.now().format(nuUnNvnuUu);
         File var9 = new File(this.uUnuvNvvNU(), var7 + "_" + var8 + ".wifd");

         try {
            var2.UuUVuuUu(var4.UuUVuuUu());
            JSONObject var10 = new JSONObject();
            var10.put("version", 4);
            var10.put("type", "wild_foundry");
            var10.put("target", var4.UuUVuuUu());
            var10.put("metadata", VnnVNVNVUnnn.UuUVuuUu(var6));
            var10.put("graph", VnnVNVNVUnnn.C00OOC00oO(var2));
            Files.write(var9.toPath(), var10.toString(2).getBytes(StandardCharsets.UTF_8));
            return var9;
         } catch (Throwable var11) {
            System.out.println("[FoundryStorage] shared export failed: " + var11.getMessage());
            return null;
         }
      }
   }

   public synchronized List<File> uNNnnnuuuN() {
      File var1 = this.uUnuvNvvNU();
      File[] var2 = var1.listFiles((var0, var1x) -> {
         if (var1x == null) {
            return false;
         } else {
            String var2x = var1x.toLowerCase(Locale.ROOT);
            return var2x.endsWith(".wifd") || var2x.endsWith(".json");
         }
      });
      if (var2 != null && var2.length != 0) {
         ArrayList var3 = new ArrayList<>(List.of(var2));
         var3.sort((var0, var1x) -> Long.compare(var1x.lastModified(), var0.lastModified()));
         return var3;
      } else {
         return List.of();
      }
   }

   public synchronized nuVVnvn UuUVuuUu(File var1, nvvuUNnNvN var2) {
      if (var1 != null && var2 != null && var1.isFile()) {
         try {
            String var3 = UuUVuuUu(var1);
            JSONObject var4 = new JSONObject(var3);
            JSONObject var5 = var4.optJSONObject("graph");
            if (var5 != null) {
               nuVVnvn var10 = VnnVNVNVUnnn.UuUVuuUu(var5, var2);
               String var12 = var4.optString("target", "");
               if (!var12.isBlank()) {
                  var10.UuUVuuUu(var12);
               }

               UVVNvnVNvN var13 = VnnVNVNVUnnn.UuUVuuUu(var4.optJSONObject("metadata"), var4);
               var13.uNNnnnuuuN("imported");
               var13.UuUVuuUu(var4.optString("displayName", nVNvNVnvnVvn.UuUVuuUu()), var4.optString("author", VVuuUN()));
               var10.UuUVuuUu(var13);
               return var10;
            }

            String var6 = var4.optString("wildTheme", "");
            if (!var6.isBlank()) {
               nuVVnvn var11 = VnnVNVNVUnnn.UuUVuuUu(var6, var2);
               UVVNvnVNvN var8 = VnnVNVNVUnnn.UuUVuuUu(var4.optJSONObject("metadata"), var4);
               var8.uNNnnnuuuN("imported");
               var8.UuUVuuUu(var4.optString("displayName", nVNvNVnvnVvn.UuUVuuUu()), var4.optString("author", VVuuUN()));
               var11.UuUVuuUu(var8);
               return var11;
            }

            if (var4.has("nodes") && var4.has("connections")) {
               nuVVnvn var7 = VnnVNVNVUnnn.UuUVuuUu(var4, var2);
               var7.UuUVuuUu().uNNnnnuuuN("imported");
               var7.UuUVuuUu().UuUVuuUu(var4.optString("displayName", nVNvNVnvnVvn.UuUVuuUu()), var4.optString("author", VVuuUN()));
               return var7;
            }
         } catch (Throwable var9) {
            System.out.println("[FoundryStorage] shared import failed: " + var9.getMessage());
         }

         return null;
      } else {
         return null;
      }
   }

   public synchronized boolean C00OOC00oO(String var1) {
      if (var1 == null) {
         return false;
      } else {
         VUvUNNUvvNVN var2 = this.uVUuuVnNVU.remove(var1);
         if (var2 == null) {
            return false;
         } else {
            for (Entry var4 : new ArrayList<>(this.vNUvnnVnUvu.entrySet())) {
               if (var1.equals(var4.getValue())) {
                  this.vNUvnnVnUvu.remove(var4.getKey());
               }
            }

            try {
               Files.deleteIfExists(new File(this.VVuuUN, var1).toPath());
            } catch (IOException var5) {
            }

            this.uVUuuVnNVU();
            return true;
         }
      }
   }

   public synchronized nuVVnvn UuUVuuUu(String var1, nvvuUNnNvN var2) {
      VUvUNNUvvNVN var3 = this.uVUuuVnNVU.get(var1);
      if (var3 == null) {
         return null;
      } else {
         try {
            nuVVnvn var4 = VnnVNVNVUnnn.UuUVuuUu(var3.vVvUvVVuuNvV(), var2);
            var4.UuUVuuUu().UuUVuuUu(var3.C00OOC00oO(), var3.uNNnnnuuuN().isBlank() ? VVuuUN() : var3.uNNnnnuuuN());
            var4.UuUVuuUu().UuUVuuUu(var3.C00OOC00oO());
            if (!var3.uNNnnnuuuN().isBlank()) {
               var4.UuUVuuUu().C00OOC00oO(var3.uNNnnnuuuN());
            }

            var4.UuUVuuUu().uUnuvNvvNU(var3.nuUnNvnuUu());
            var4.UuUVuuUu().vVvUvVVuuNvV(var3.VVuuUN());
            var4.UuUVuuUu().UuUVuuUu(var3.vuuuNvNuv());
            var4.UuUVuuUu().C00OOC00oO(var3.nvUVNnuu());
            var4.UuUVuuUu().UuUVuuUu(var3.UuuNnUvUuv());
            return var4;
         } catch (Throwable var5) {
            return null;
         }
      }
   }

   public synchronized void UuUVuuUu(VnuVUNUv var1, String var2) {
      if (var1 != null) {
         if (var2 == null || var2.isBlank()) {
            this.vNUvnnVnUvu.remove(var1);
         } else if (this.uVUuuVnNVU.containsKey(var2)) {
            this.vNUvnnVnUvu.put(var1, var2);
         }

         this.uVUuuVnNVU();
      }
   }

   public synchronized String C00OOC00oO(VnuVUNUv var1) {
      return this.vNUvnnVnUvu.get(var1);
   }

   public synchronized VUvUNNUvvNVN uUnuvNvvNU(VnuVUNUv var1) {
      String var2 = this.vNUvnnVnUvu.get(var1);
      return var2 == null ? null : this.uVUuuVnNVU.get(var2);
   }

   public synchronized JSONArray nuUnNvnuUu() {
      JSONArray var1 = new JSONArray();

      for (VUvUNNUvvNVN var3 : this.C00OOC00oO()) {
         JSONObject var4 = new JSONObject();
         var4.put("fileName", var3.UuUVuuUu());
         var4.put("displayName", var3.C00OOC00oO());
         var4.put("target", var3.uUnuvNvvNU());
         var4.put("author", var3.uNNnnnuuuN());
         var4.put("description", var3.nuUnNvnuUu());
         var4.put("complexity", var3.VVuuUN());
         var4.put("source", var3.vNUvnnVnUvu());
         var4.put("compileStatus", var3.uVUuuVnNVU());
         var4.put("createdAt", var3.vuuuNvNuv());
         var4.put("updatedAt", var3.nvUVNnuu());
         var4.put("favorite", var3.UuuNnUvUuv());
         var1.put(var4);
      }

      return var1;
   }

   private void vNUvnnVnUvu() {
      File var1 = new File(this.VVuuUN, "active.json");
      if (var1.exists()) {
         try {
            JSONObject var2 = new JSONObject(UuUVuuUu(var1));

            for (VnuVUNUv var6 : VnuVUNUv.values()) {
               String var7 = var2.optString(var6.UuUVuuUu(), null);
               if (var7 != null && !var7.isBlank()) {
                  this.vNUvnnVnUvu.put(var6, var7);
               }
            }
         } catch (Throwable var8) {
            System.out.println("[FoundryStorage] cannot read active bindings: " + var8.getMessage());
         }
      }
   }

   private void uVUuuVnNVU() {
      try {
         JSONObject var1 = new JSONObject();

         for (Entry var3 : this.vNUvnnVnUvu.entrySet()) {
            var1.put(((VnuVUNUv)var3.getKey()).UuUVuuUu(), var3.getValue());
         }

         Files.write(new File(this.VVuuUN, "active.json").toPath(), var1.toString(2).getBytes(StandardCharsets.UTF_8));
      } catch (IOException var4) {
         System.out.println("[FoundryStorage] cannot persist active bindings: " + var4.getMessage());
      }
   }

   private VUvUNNUvvNVN UuUVuuUu(File var1, JSONObject var2) {
      String var3 = var2.optString("wildTheme", "");
      UVVNvnVNvN var4 = VnnVNVNVUnnn.UuUVuuUu(var2.optJSONObject("metadata"), var2);
      if (var4.C00OOC00oO().isBlank()) {
         var4.UuUVuuUu(uUnuvNvvNU(var1.getName()) ? nVNvNVnvnVvn.UuUVuuUu() : var1.getName().replace(".theme.json", ""));
      }

      var4.UuUVuuUu(var4.C00OOC00oO(), VVuuUN());
      long var5 = var4.vuuuNvNuv() > 0L ? var4.vuuuNvNuv() : var2.optLong("updatedAt", var1.lastModified());
      String var7 = var2.optString("target", "preview");
      String var8 = var2.optString("source", var4.nuUnNvnuUu().isBlank() ? "user" : var4.nuUnNvnuUu());
      String var9 = var2.optString("compileStatus", "saved");
      return new VUvUNNUvvNVN(
         var1.getName(),
         var4.C00OOC00oO(),
         var7,
         var3,
         var4.uUnuvNvvNU(),
         var4.vVvUvVVuuNvV(),
         var4.uNNnnnuuuN(),
         var8,
         var9,
         var4.uVUuuVnNVU(),
         var5,
         var4.nvUVNnuu()
      );
   }

   private boolean C00OOC00oO(File var1, nvvuUNnNvN var2) {
      String var3 = var1.getName();
      boolean var5 = false;

      try {
         JSONObject var6 = new JSONObject(UuUVuuUu(var1));
         VUvUNNUvvNVN var7 = this.UuUVuuUu(var1, var6);
         if (!this.C00OOC00oO(var7.vVvUvVVuuNvV(), var2)) {
            JSONObject var8 = var6.optJSONObject("graph");
            if (var8 != null) {
               nuVVnvn var9 = VnnVNVNVUnnn.UuUVuuUu(var8, var2);
               if (var9 != null) {
                  var7.uUnuvNvvNU(VnnVNVNVUnnn.UuUVuuUu(var9));
               }
            }
         }

         if (!this.C00OOC00oO(var7.vVvUvVVuuNvV(), var2)) {
            System.out.println("[FoundryStorage] keeping legacy file without loadable payload: " + var3);
            return false;
         }

         VUvUNNUvvNVN var12 = this.UuUVuuUu(var7);
         String var4;
         if (var12 != null) {
            var4 = var12.UuUVuuUu();
         } else {
            var4 = this.vuuuNvNuv();
            UVVNvnVNvN var13 = VnnVNVNVUnnn.UuUVuuUu(var6.optJSONObject("metadata"), var6);
            var13.UuUVuuUu(var7.C00OOC00oO(), VVuuUN());
            var13.UuUVuuUu(var7.C00OOC00oO());
            var13.UuUVuuUu(var7.vuuuNvNuv());
            var13.C00OOC00oO(var7.nvUVNnuu());
            var13.UuUVuuUu(var7.UuuNnUvUuv());
            VUvUNNUvvNVN var10 = new VUvUNNUvvNVN(
               var4,
               var7.C00OOC00oO(),
               var7.uUnuvNvvNU(),
               var7.vVvUvVVuuNvV(),
               var7.uNNnnnuuuN(),
               var7.nuUnNvnuUu(),
               var7.VVuuUN(),
               var7.vNUvnnVnUvu(),
               var7.uVUuuVnNVU(),
               var7.vuuuNvNuv(),
               var7.nvUVNnuu(),
               var7.UuuNnUvUuv()
            );
            this.UuUVuuUu(var10, var13);
            this.uVUuuVnNVU.put(var4, var10);
         }

         for (Entry var15 : new ArrayList<>(this.vNUvnnVnUvu.entrySet())) {
            if (var3.equals(var15.getValue())) {
               this.vNUvnnVnUvu.put((VnuVUNUv)var15.getKey(), var4);
               var5 = true;
            }
         }

         if (var5) {
            this.uVUuuVnNVU();
         }

         Files.deleteIfExists(var1.toPath());
      } catch (Throwable var11) {
         System.out.println("[FoundryStorage] legacy migration failed for " + var3 + ": " + var11.getMessage());
         return var5;
      }

      return var5;
   }

   private boolean C00OOC00oO(String var1, nvvuUNnNvN var2) {
      if (var1 != null && !var1.isBlank()) {
         try {
            return VnnVNVNVUnnn.UuUVuuUu(var1, var2) != null;
         } catch (Throwable var4) {
            return false;
         }
      } else {
         return false;
      }
   }

   private VUvUNNUvvNVN UuUVuuUu(VUvUNNUvvNVN var1) {
      for (VUvUNNUvvNVN var3 : this.uVUuuVnNVU.values()) {
         if (var3.C00OOC00oO().equals(var1.C00OOC00oO()) && var3.uUnuvNvvNU().equals(var1.uUnuvNvvNU()) && var3.vVvUvVVuuNvV().equals(var1.vVvUvVVuuNvV())) {
            return var3;
         }
      }

      return null;
   }

   private void UuUVuuUu(VUvUNNUvvNVN var1, UVVNvnVNvN var2) throws IOException {
      JSONObject var3 = new JSONObject();
      var3.put("version", 4);
      var3.put("target", var1.uUnuvNvvNU());
      var3.put("source", var1.vNUvnnVnUvu());
      var3.put("compileStatus", var1.uVUuuVnNVU());
      var3.put("wildTheme", var1.vVvUvVVuuNvV());
      var3.put("metadata", VnnVNVNVUnnn.UuUVuuUu(var2));
      Files.write(new File(this.VVuuUN, var1.UuUVuuUu()).toPath(), var3.toString(2).getBytes(StandardCharsets.UTF_8));
   }

   private String vuuuNvNuv() {
      String var1;
      do {
         var1 = UUID.randomUUID() + ".theme.json";
      } while (this.uVUuuVnNVU.containsKey(var1) || new File(this.VVuuUN, var1).exists());

      return var1;
   }

   private static boolean uUnuvNvvNU(String var0) {
      if (var0 != null && var0.endsWith(".theme.json")) {
         String var1 = var0.substring(0, var0.length() - ".theme.json".length());
         if (var1.length() != 36) {
            return false;
         } else {
            try {
               UUID.fromString(var1);
               return true;
            } catch (IllegalArgumentException var3) {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private static String UuUVuuUu(File var0) throws IOException {
      return new String(Files.readAllBytes(var0.toPath()), StandardCharsets.UTF_8);
   }

   public static String VVuuUN() {
      if (NVnVnNnN.vuuuNvNuv != null && !NVnVnNnN.vuuuNvNuv.isBlank()) {
         return NVnVnNnN.vuuuNvNuv.trim();
      } else {
         class_310 var0 = class_310.method_1551();
         return var0 != null && var0.method_1548() != null && var0.method_1548().method_1676() != null && !var0.method_1548().method_1676().isBlank()
            ? var0.method_1548().method_1676().trim()
            : "Unknown";
      }
   }

   public synchronized int UuUVuuUu(Set<String> var1) {
      if (var1 != null && !var1.isEmpty()) {
         int var2 = 0;

         for (VUvUNNUvvNVN var4 : new ArrayList<>(this.uVUuuVnNVU.values())) {
            if (var1.contains(uNNnUu.vuuuNvNuv(var4.C00OOC00oO())) && this.C00OOC00oO(var4.UuUVuuUu())) {
               var2++;
            }
         }

         return var2;
      } else {
         return 0;
      }
   }

   private static String vVvUvVVuuNvV(String var0) {
      String var1 = var0 == null ? "theme" : var0.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]+", "_").replaceAll("^_+|_+$", "");
      return var1.isBlank() ? "theme" : var1;
   }
}
