package ru.metaculture.protection;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONArray;
import org.json.JSONObject;

public final class vnvnVnV {
   private static final String UuUVuuUu = "assets/wild/studio/presets/";
   private static vnvnVnV C00OOC00oO;
   private final File uUnuvNvvNU;
   private final List<VuNVnnuuUun> vVvUvVVuuNvV = new ArrayList<>();
   private final Map<String, UvnnvunNNuVV> uNNnnnuuuN = new HashMap<>();
   private final Map<String, String> nuUnNvnuUu = new HashMap<>();
   private final Map<String, String> VVuuUN = new HashMap<>();
   private final Map<String, UvnnvunNNuVV> vNUvnnVnUvu = new LinkedHashMap<>();
   private String uVUuuVnNVU = "";
   private boolean vuuuNvNuv;
   private boolean nvUVNnuu;

   private vnvnVnV() {
      this.uUnuvNvvNU = new File(NVnVnNnN.C00OOC00oO(), "avatars");
   }

   public static vnvnVnV UuUVuuUu() {
      if (C00OOC00oO == null) {
         C00OOC00oO = new vnvnVnV();
      }

      return C00OOC00oO;
   }

   public File C00OOC00oO() {
      return this.uUnuvNvvNU;
   }

   public synchronized void uUnuvNvvNU() {
      if (!this.nvUVNnuu) {
         this.nvUVNnuu = true;

         try {
            if (!this.uUnuvNvvNU.exists()) {
               this.uUnuvNvvNU.mkdirs();
            }

            this.nvUVNnuu();
            this.vuuuNvNuv();
            this.vNUvnnVnUvu();
         } catch (Throwable var2) {
            System.out.println("[Studio] library init failed: " + var2.getClass().getSimpleName() + ": " + var2.getMessage());
         }
      }
   }

   public synchronized void vVvUvVVuuNvV() {
      this.nvUVNnuu();
      this.vNUvnnVnUvu();
   }

   public synchronized List<VuNVnnuuUun> uNNnnnuuuN() {
      return new ArrayList<>(this.vVvUvVVuuNvV);
   }

   public synchronized List<VuNVnnuuUun> UuUVuuUu(UvnnvunNNuVV var1) {
      ArrayList var2 = new ArrayList();

      for (VuNVnnuuUun var4 : this.vVvUvVVuuNvV) {
         if (var4.vNUvnnVnUvu() == var1) {
            var2.add(var4);
         }
      }

      return var2;
   }

   public synchronized VuNVnnuuUun nuUnNvnuUu() {
      for (VuNVnnuuUun var2 : this.vVvUvVVuuNvV) {
         if (var2.UuUVuuUu().equals(this.uVUuuVnNVU)) {
            return var2;
         }
      }

      return null;
   }

   public synchronized void UuUVuuUu(VuNVnnuuUun var1) {
      this.uVUuuVnNVU = var1 == null ? "" : var1.UuUVuuUu();
      this.vuuuNvNuv = var1 != null;
      this.UuuNnUvUuv();
   }

   public synchronized boolean VVuuUN() {
      return this.vuuuNvNuv && !this.uVUuuVnNVU.isEmpty();
   }

   public synchronized void UuUVuuUu(boolean var1) {
      this.vuuuNvNuv = var1 && !this.uVUuuVnNVU.isEmpty();
      this.UuuNnUvUuv();
   }

   public synchronized void UuUVuuUu(VuNVnnuuUun var1, UvnnvunNNuVV var2) {
      if (var1 != null && var2 != null) {
         var1.UuUVuuUu(var2);
         this.uNNnnnuuuN.put(var1.UuUVuuUu(), var2);
         this.UuuNnUvUuv();
      }
   }

   public synchronized void UuUVuuUu(VuNVnnuuUun var1, String var2) {
      if (var1 != null) {
         String var3 = var2 == null ? "" : var2.trim();
         if (var3.isEmpty()) {
            this.nuUnNvnuUu.remove(var1.UuUVuuUu());
            var1.UuUVuuUu(null);
         } else {
            this.nuUnNvnuUu.put(var1.UuUVuuUu(), var3);
            var1.UuUVuuUu(var3);
         }

         this.vVvUvVVuuNvV.sort((var0, var1x) -> var0.vVvUvVVuuNvV().compareToIgnoreCase(var1x.vVvUvVVuuNvV()));
         this.UuuNnUvUuv();
      }
   }

   public synchronized void C00OOC00oO(VuNVnnuuUun var1, String var2) {
      if (var1 != null) {
         String var3 = var2 == null ? "" : var2.trim();
         var1.C00OOC00oO(var3);
         if (var3.isEmpty()) {
            this.VVuuUN.remove(var1.UuUVuuUu());
         } else {
            this.VVuuUN.put(var1.UuUVuuUu(), var3);
         }

         this.UuuNnUvUuv();
      }
   }

   public synchronized boolean C00OOC00oO(VuNVnnuuUun var1) {
      if (var1 == null) {
         return false;
      } else {
         boolean var2 = UuUVuuUu(var1.C00OOC00oO());
         this.vVvUvVVuuNvV.remove(var1);
         this.nuUnNvnuUu.remove(var1.UuUVuuUu());
         this.VVuuUN.remove(var1.UuUVuuUu());
         this.uNNnnnuuuN.remove(var1.UuUVuuUu());
         if (var1.UuUVuuUu().equals(this.uVUuuVnNVU)) {
            this.uVUuuVnNVU = "";
            this.vuuuNvNuv = false;
         }

         this.UuuNnUvUuv();
         return var2;
      }
   }

   private static boolean UuUVuuUu(File var0) {
      if (var0 == null) {
         return false;
      } else {
         File[] var1 = var0.listFiles();
         if (var1 != null) {
            for (File var5 : var1) {
               UuUVuuUu(var5);
            }
         }

         return var0.delete();
      }
   }

   public synchronized String UuUVuuUu(File var1, UvnnvunNNuVV var2) {
      if (var1 != null && var1.exists()) {
         try {
            String var3 = vVvUvVVuuNvV(uUnuvNvvNU(var1.getName()));
            if (var3.isEmpty()) {
               var3 = "import";
            }

            File var4 = this.C00OOC00oO(var3);
            if (var1.isDirectory()) {
               this.UuUVuuUu(var1.toPath(), var4.toPath());
            } else {
               String var5 = vVvUvVVuuNvV(var1);
               if ("rar".equals(var5) || "7z".equals(var5)) {
                  return "Это " + var5.toUpperCase(Locale.ROOT) + ", не .zip — распакуйте вручную";
               }

               if (!"zip".equals(var5)) {
                  return "Нужен .zip или папка";
               }

               try (InputStream var6 = Files.newInputStream(var1.toPath())) {
                  this.UuUVuuUu(var6, var4);
               }
            }

            String var13 = this.uUnuvNvvNU(var4) + "/";
            int var14 = this.vVvUvVVuuNvV.size();
            this.vNUvnnVnUvu();
            int var7 = 0;

            for (VuNVnnuuUun var9 : this.vVvUvVVuuNvV) {
               if (var9.UuUVuuUu().startsWith(var13)) {
                  if (this.uNNnnnuuuN.get(var9.UuUVuuUu()) == null) {
                     var9.UuUVuuUu(var2);
                     this.uNNnnnuuuN.put(var9.UuUVuuUu(), var2);
                  }

                  var7++;
               }
            }

            this.UuuNnUvUuv();
            return var7 == 0 ? "Аватары не найдены (нет avatar.json)" : "Импортировано: " + var7 + (this.vVvUvVVuuNvV.size() > var14 ? "" : "");
         } catch (Throwable var12) {
            return "Ошибка: " + var12.getClass().getSimpleName();
         }
      } else {
         return "Файл не найден";
      }
   }

   private void vNUvnnVnUvu() {
      this.vVvUvVVuuNvV.clear();
      if (this.uUnuvNvvNU.isDirectory()) {
         this.uVUuuVnNVU();
         ArrayList var1 = new ArrayList();
         this.UuUVuuUu(this.uUnuvNvvNU, var1, 0);

         for (File var3 : var1) {
            String var4 = this.uUnuvNvvNU(var3);
            UvnnvunNNuVV var5 = this.uNNnnnuuuN.get(var4);
            VuNVnnuuUun var6 = VuNVnnuuUun.UuUVuuUu(var4, var3, var5 != null ? var5 : this.UuUVuuUu(var4));
            if (var6 != null) {
               if (var5 == null) {
                  try {
                     var6.UuUVuuUu(var6.nvUVNnuu());
                  } catch (Throwable var9) {
                  }
               }

               String var7 = this.nuUnNvnuUu.get(var4);
               if (var7 != null && !var7.isEmpty()) {
                  var6.UuUVuuUu(var7);
               }

               String var8 = this.VVuuUN.get(var4);
               if (var8 != null && !var8.isEmpty()) {
                  var6.C00OOC00oO(var8);
               }

               this.vVvUvVVuuNvV.add(var6);
            }
         }

         this.vVvUvVVuuNvV.sort((var0, var1x) -> var0.vVvUvVVuuNvV().compareToIgnoreCase(var1x.vVvUvVVuuNvV()));
      }
   }

   private void UuUVuuUu(File var1, List<File> var2, int var3) {
      if (var1 != null && var1.isDirectory() && var3 <= 8) {
         if (this.C00OOC00oO(var1)) {
            var2.add(var1);
         } else {
            File[] var4 = var1.listFiles();
            if (var4 != null) {
               for (File var8 : var4) {
                  if (var8.isDirectory()) {
                     this.UuUVuuUu(var8, var2, var3 + 1);
                  }
               }
            }
         }
      }
   }

   private void uVUuuVnNVU() {
      File[] var1 = this.uUnuvNvvNU.listFiles();
      if (var1 != null) {
         for (File var5 : var1) {
            if (var5.isFile() && var5.getName().toLowerCase(Locale.ROOT).endsWith(".zip")) {
               if (!"zip".equals(vVvUvVVuuNvV(var5))) {
                  System.out.println("[Studio] skipping non-zip archive (RAR/7z?): " + var5.getName());
               } else {
                  try {
                     String var6 = vVvUvVVuuNvV(uUnuvNvvNU(var5.getName()));
                     if (var6.isEmpty()) {
                        var6 = "import";
                     }

                     File var7 = this.C00OOC00oO(var6);

                     try (InputStream var8 = Files.newInputStream(var5.toPath())) {
                        this.UuUVuuUu(var8, var7);
                     }

                     var5.delete();
                  } catch (Throwable var13) {
                     System.out.println("[Studio] loose import failed " + var5.getName() + ": " + var13.getMessage());
                  }
               }
            }
         }
      }
   }

   private boolean C00OOC00oO(File var1) {
      File[] var2 = var1.listFiles();
      if (var2 == null) {
         return false;
      } else {
         for (File var6 : var2) {
            if (var6.isFile() && var6.getName().toLowerCase(Locale.ROOT).endsWith(".bbmodel")) {
               return true;
            }
         }

         return false;
      }
   }

   private UvnnvunNNuVV UuUVuuUu(String var1) {
      for (Entry var3 : this.vNUvnnVnUvu.entrySet()) {
         if (var1.startsWith((String)var3.getKey() + "/") || var1.equals(var3.getKey())) {
            return (UvnnvunNNuVV)var3.getValue();
         }
      }

      return UvnnvunNNuVV.MODELS;
   }

   private String uUnuvNvvNU(File var1) {
      String var2 = this.uUnuvNvvNU.getAbsolutePath();
      String var3 = var1.getAbsolutePath();
      String var4 = var3.length() > var2.length() ? var3.substring(var2.length()) : var3;
      var4 = var4.replace('\\', '/');

      while (var4.startsWith("/")) {
         var4 = var4.substring(1);
      }

      return var4;
   }

   private void vuuuNvNuv() {
      String var1 = this.uNNnnnuuuN("assets/wild/studio/presets/index.json");
      if (var1 != null) {
         JSONObject var2 = new JSONObject(var1);
         JSONArray var3 = var2.optJSONArray("presets");
         if (var3 != null) {
            for (int var4 = 0; var4 < var3.length(); var4++) {
               JSONObject var5 = var3.optJSONObject(var4);
               if (var5 != null) {
                  String var6 = var5.optString("file", "");
                  UvnnvunNNuVV var7 = UvnnvunNNuVV.UuUVuuUu(var5.optString("category", "models"));
                  if (!var6.isEmpty()) {
                     String var8 = vVvUvVVuuNvV(uUnuvNvvNU(var6));
                     this.vNUvnnVnUvu.put(var8, var7);
                     File var9 = new File(this.uUnuvNvvNU, var8);
                     if (!var9.isDirectory()) {
                        byte[] var10 = this.nuUnNvnuUu("assets/wild/studio/presets/" + var6);
                        if (var10 != null) {
                           try {
                              this.UuUVuuUu(new ByteArrayInputStream(var10), var9);
                           } catch (IOException var12) {
                              System.out.println("[Studio] preset seed failed " + var6 + ": " + var12.getMessage());
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private static String vVvUvVVuuNvV(File var0) {
      try {
         String var8;
         try (InputStream var1 = Files.newInputStream(var0.toPath())) {
            byte[] var2 = var1.readNBytes(4);
            if (var2.length < 2 || var2[0] != 80 || var2[1] != 75) {
               if (var2.length >= 4 && (var2[0] & 255) == 82 && (var2[1] & 255) == 97 && (var2[2] & 255) == 114 && (var2[3] & 255) == 33) {
                  return "rar";
               }

               if (var2.length >= 4 && (var2[0] & 255) == 55 && (var2[1] & 255) == 122 && (var2[2] & 255) == 188 && (var2[3] & 255) == 175) {
                  return "7z";
               }

               return "unknown";
            }

            var8 = "zip";
         }

         return var8;
      } catch (IOException var6) {
         return "unknown";
      }
   }

   private void UuUVuuUu(InputStream var1, File var2) throws IOException {
      if (!var2.exists()) {
         var2.mkdirs();
      }

      Path var3 = var2.toPath().normalize();

      ZipEntry var5;
      try (ZipInputStream var4 = new ZipInputStream(var1)) {
         while ((var5 = var4.getNextEntry()) != null) {
            Path var6 = var3.resolve(var5.getName()).normalize();
            if (var6.startsWith(var3)) {
               if (var5.isDirectory()) {
                  Files.createDirectories(var6);
               } else {
                  Files.createDirectories(var6.getParent());
                  Files.copy(var4, var6, StandardCopyOption.REPLACE_EXISTING);
               }

               var4.closeEntry();
            }
         }
      }
   }

   private void UuUVuuUu(Path var1, Path var2) throws IOException {
      Files.walk(var1).forEach(var2x -> {
         try {
            Path var3 = var2.resolve(var1.relativize(var2x).toString());
            if (Files.isDirectory(var2x)) {
               Files.createDirectories(var3);
            } else {
               Files.createDirectories(var3.getParent());
               Files.copy(var2x, var3, StandardCopyOption.REPLACE_EXISTING);
            }
         } catch (IOException var4) {
            throw new RuntimeException(var4);
         }
      });
   }

   private File C00OOC00oO(String var1) {
      File var2 = new File(this.uUnuvNvvNU, var1);

      for (int var3 = 2; var2.exists(); var3++) {
         var2 = new File(this.uUnuvNvvNU, var1 + "-" + var3);
      }

      return var2;
   }

   private static String uUnuvNvvNU(String var0) {
      int var1 = var0.lastIndexOf(46);
      return var1 > 0 ? var0.substring(0, var1) : var0;
   }

   private static String vVvUvVVuuNvV(String var0) {
      return var0.trim().replaceAll("[^a-zA-Z0-9._ -]", "_");
   }

   private void nvUVNnuu() {
      this.uNNnnnuuuN.clear();
      this.nuUnNvnuUu.clear();
      this.VVuuUN.clear();
      this.uVUuuVnNVU = "";
      this.vuuuNvNuv = false;
      File var1 = new File(this.uUnuvNvvNU, "index.json");
      if (var1.isFile()) {
         try {
            JSONObject var2 = new JSONObject(new String(Files.readAllBytes(var1.toPath()), StandardCharsets.UTF_8));
            this.uVUuuVnNVU = var2.optString("selected", "");
            this.vuuuNvNuv = var2.optBoolean("equipped", !this.uVUuuVnNVU.isEmpty()) && !this.uVUuuVnNVU.isEmpty();
            JSONObject var3 = var2.optJSONObject("tabs");
            if (var3 != null) {
               for (String var5 : var3.keySet()) {
                  this.uNNnnnuuuN.put(var5, UvnnvunNNuVV.UuUVuuUu(var3.optString(var5, "models")));
               }
            }

            JSONObject var9 = var2.optJSONObject("names");
            if (var9 != null) {
               for (String var6 : var9.keySet()) {
                  this.nuUnNvnuUu.put(var6, var9.optString(var6, ""));
               }
            }

            JSONObject var11 = var2.optJSONObject("prefixes");
            if (var11 != null) {
               for (String var7 : var11.keySet()) {
                  this.VVuuUN.put(var7, var11.optString(var7, ""));
               }
            }
         } catch (Exception var8) {
         }
      }
   }

   private void UuuNnUvUuv() {
      try {
         JSONObject var1 = new JSONObject();
         var1.put("selected", this.uVUuuVnNVU);
         var1.put("equipped", this.vuuuNvNuv);
         JSONObject var2 = new JSONObject();

         for (Entry var4 : this.uNNnnnuuuN.entrySet()) {
            var2.put((String)var4.getKey(), ((UvnnvunNNuVV)var4.getValue()).UuUVuuUu());
         }

         var1.put("tabs", var2);
         JSONObject var8 = new JSONObject();

         for (Entry var5 : this.nuUnNvnuUu.entrySet()) {
            var8.put((String)var5.getKey(), var5.getValue());
         }

         var1.put("names", var8);
         JSONObject var10 = new JSONObject();

         for (Entry var6 : this.VVuuUN.entrySet()) {
            var10.put((String)var6.getKey(), var6.getValue());
         }

         var1.put("prefixes", var10);
         File var12 = new File(this.uUnuvNvvNU, "index.json");
         Files.write(var12.toPath(), var1.toString(2).getBytes(StandardCharsets.UTF_8));
      } catch (Exception var7) {
      }
   }

   private String uNNnnnuuuN(String var1) {
      byte[] var2 = this.nuUnNvnuUu(var1);
      return var2 == null ? null : new String(var2, StandardCharsets.UTF_8);
   }

   private byte[] nuUnNvnuUu(String var1) {
      ClassLoader var2 = vnvnVnV.class.getClassLoader();

      try {
         byte[] var4;
         try (InputStream var3 = var2.getResourceAsStream(var1)) {
            if (var3 == null) {
               return null;
            }

            var4 = var3.readAllBytes();
         }

         return var4;
      } catch (IOException var8) {
         return null;
      }
   }
}
