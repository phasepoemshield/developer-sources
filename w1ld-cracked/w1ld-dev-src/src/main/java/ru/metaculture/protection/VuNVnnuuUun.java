package ru.metaculture.protection;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class VuNVnnuuUun {
   private final String UuUVuuUu;
   private final File C00OOC00oO;
   private final File uUnuvNvvNU;
   private final File vVvUvVVuuNvV;
   private final String uNNnnnuuuN;
   private String nuUnNvnuUu;
   private final String VVuuUN;
   private final String vNUvnnVnUvu;
   private UvnnvunNNuVV uVUuuVnNVU;
   private String vuuuNvNuv = "";
   private vvNvVvVUVv nvUVNnuu;
   private boolean UuuNnUvUuv;
   private String nUUVuvU;

   public VuNVnnuuUun(String var1, File var2, File var3, File var4, String var5, String var6, String var7, UvnnvunNNuVV var8) {
      this.UuUVuuUu = var1;
      this.C00OOC00oO = var2;
      this.uUnuvNvvNU = var3;
      this.vVvUvVVuuNvV = var4;
      this.uNNnnnuuuN = var5;
      this.nuUnNvnuUu = var5;
      this.VVuuUN = var6;
      this.vNUvnnVnUvu = var7;
      this.uVUuuVnNVU = var8 == null ? UvnnvunNNuVV.MODELS : var8;
   }

   public static VuNVnnuuUun UuUVuuUu(String var0, File var1, UvnnvunNNuVV var2) {
      if (var1 != null && var1.isDirectory()) {
         File var3 = UuUVuuUu(var1);
         if (var3 == null) {
            return null;
         } else {
            File var4 = new File(var1, "avatar.png");
            if (!var4.isFile()) {
               var4 = null;
            }

            String var5 = uUnuvNvvNU(var1.getName());
            String var6 = "";
            String var7 = "";
            File var8 = new File(var1, "avatar.json");
            if (var8.isFile()) {
               try {
                  JSONObject var9 = new JSONObject(new String(Files.readAllBytes(var8.toPath()), StandardCharsets.UTF_8));
                  var5 = uUnuvNvvNU(var9.optString("name", var5));
                  var7 = var9.optString("color", "");
                  JSONArray var10 = var9.optJSONArray("authors");
                  if (var10 != null && var10.length() > 0) {
                     StringBuilder var11 = new StringBuilder();

                     for (int var12 = 0; var12 < var10.length(); var12++) {
                        if (var12 > 0) {
                           var11.append(", ");
                        }

                        var11.append(uUnuvNvvNU(var10.optString(var12, "")));
                     }

                     var6 = var11.toString();
                  } else {
                     var6 = uUnuvNvvNU(var9.optString("author", ""));
                  }
               } catch (Exception var13) {
               }
            }

            return new VuNVnnuuUun(var0, var1, var3, var4, var5.isEmpty() ? var1.getName() : var5, var6, var7, var2);
         }
      } else {
         return null;
      }
   }

   private static File UuUVuuUu(File var0) {
      File[] var1 = var0.listFiles();
      if (var1 == null) {
         return null;
      } else {
         File var2 = null;
         File var3 = null;
         long var4 = -1L;

         for (File var9 : var1) {
            if (var9.isFile()) {
               String var10 = var9.getName().toLowerCase();
               if (var10.endsWith(".bbmodel") && !var10.contains("hud")) {
                  if (var10.equals("model.bbmodel")) {
                     var2 = var9;
                  }

                  if (var9.length() > var4) {
                     var4 = var9.length();
                     var3 = var9;
                  }
               }
            }
         }

         if (var2 != null) {
            return var2;
         } else {
            return var3 != null ? var3 : UuUVuuUu(var0, ".bbmodel");
         }
      }
   }

   private static String uUnuvNvvNU(String var0) {
      return var0 == null ? "" : var0.replaceAll("§.", "").replaceAll("&[0-9A-Fa-fK-Ok-or]", "").trim();
   }

   private static File UuUVuuUu(File var0, String var1) {
      File[] var2 = var0.listFiles();
      if (var2 == null) {
         return null;
      } else {
         for (File var6 : var2) {
            if (var6.isFile() && var6.getName().toLowerCase().endsWith(var1)) {
               return var6;
            }
         }

         return null;
      }
   }

   public String UuUVuuUu() {
      return this.UuUVuuUu;
   }

   public File C00OOC00oO() {
      return this.C00OOC00oO;
   }

   public File uUnuvNvvNU() {
      return this.vVvUvVVuuNvV;
   }

   public String vVvUvVVuuNvV() {
      return this.nuUnNvnuUu;
   }

   public String uNNnnnuuuN() {
      return this.uNNnnnuuuN;
   }

   void UuUVuuUu(String var1) {
      this.nuUnNvnuUu = var1 != null && !var1.trim().isEmpty() ? var1.trim() : this.uNNnnnuuuN;
   }

   public String nuUnNvnuUu() {
      return this.VVuuUN;
   }

   public String VVuuUN() {
      return this.vNUvnnVnUvu;
   }

   public UvnnvunNNuVV vNUvnnVnUvu() {
      return this.uVUuuVnNVU;
   }

   void UuUVuuUu(UvnnvunNNuVV var1) {
      this.uVUuuVnNVU = var1 == null ? UvnnvunNNuVV.MODELS : var1;
   }

   public String uVUuuVnNVU() {
      return this.vuuuNvNuv;
   }

   void C00OOC00oO(String var1) {
      this.vuuuNvNuv = var1 == null ? "" : var1.trim();
   }

   public boolean vuuuNvNuv() {
      return this.nUUVuvU() != null;
   }

   public UvnnvunNNuVV nvUVNnuu() {
      vvNvVvVUVv var1 = this.nUUVuvU();
      if (var1 == null) {
         return UvnnvunNNuVV.MODELS;
      } else {
         HashSet var2 = new HashSet();

         for (vvNvVvVUVv.NVnVnNnN var4 : var1.vVvUvVVuuNvV()) {
            UuUVuuUu(var4, var2);
         }

         boolean var7 = var2.contains("body") || var2.contains("torso");
         boolean var8 = var2.contains("leftleg") || var2.contains("rightleg") || var2.contains("left_leg") || var2.contains("right_leg");
         boolean var5 = var2.contains("leftarm") || var2.contains("rightarm") || var2.contains("left_arm") || var2.contains("right_arm");
         boolean var6 = var2.contains("head");
         if (!var7 || !var8 && !var5) {
            if (var6 && !var7 && !var8) {
               return UvnnvunNNuVV.ITEMS;
            } else {
               return !var7 && !var8 && !var5 && !var6 ? UvnnvunNNuVV.PETS : UvnnvunNNuVV.MODELS;
            }
         } else {
            return UvnnvunNNuVV.MODELS;
         }
      }
   }

   private static void UuUVuuUu(vvNvVvVUVv.NVnVnNnN var0, Set<String> var1) {
      if (var0.UuUVuuUu() != null) {
         var1.add(var0.UuUVuuUu().toLowerCase());
      }

      for (vvNvVvVUVv.NVnVnNnN var3 : var0.uVUuuVnNVU()) {
         UuUVuuUu(var3, var1);
      }
   }

   public String UuuNnUvUuv() {
      this.nUUVuvU();
      return this.nUUVuvU;
   }

   public vvNvVvVUVv nUUVuvU() {
      if (this.UuuNnUvUuv) {
         return this.nvUVNnuu;
      } else {
         this.UuuNnUvUuv = true;

         try {
            String var1 = new String(Files.readAllBytes(this.uUnuvNvvNU.toPath()), StandardCharsets.UTF_8);
            this.nvUVNnuu = UnvUvUvVVvv.UuUVuuUu(var1);
            if (this.nvUVNnuu.vVvUvVVuuNvV().isEmpty()) {
               this.nUUVuvU = "Пустая модель";
            }
         } catch (Throwable var2) {
            this.nUUVuvU = var2.getClass().getSimpleName() + ": " + var2.getMessage();
            this.nvUVNnuu = null;
         }

         return this.nvUVNnuu;
      }
   }
}
