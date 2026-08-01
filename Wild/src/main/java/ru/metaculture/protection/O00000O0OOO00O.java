package ru.metaculture.protection;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class O00000O0OOO00O {
   private final String O00000000;
   private final File O000000000;
   private final File O0000000000;
   private final File O00000000000;
   private final String O000000000000;
   private String O0000000000000;
   private final String O000000000000O;
   private final String O00000000000O;
   private O00000O0OOOO O00000000000O0;
   private String O00000000000OO = "";
   private O00000O0OOOO0 O0000000000O;
   private boolean O0000000000O0;
   private String O0000000000O00;

   public O00000O0OOO00O(String string, File file, File file2, File file3, String string2, String string3, String string4, O00000O0OOOO o00000O0OOOO) {
      this.O00000000 = string;
      this.O000000000 = file;
      this.O0000000000 = file2;
      this.O00000000000 = file3;
      this.O000000000000 = string2;
      this.O0000000000000 = string2;
      this.O000000000000O = string3;
      this.O00000000000O = string4;
      this.O00000000000O0 = o00000O0OOOO == null ? O00000O0OOOO.MODELS : o00000O0OOOO;
   }

   public static O00000O0OOO00O O00000000(String string, File file, O00000O0OOOO o00000O0OOOO) {
      if (file != null && file.isDirectory()) {
         File var3 = O00000000(file);
         if (var3 == null) {
            return null;
         } else {
            File var4 = new File(file, "avatar.png");
            if (!var4.isFile()) {
               var4 = null;
            }

            String var5 = O0000000000(file.getName());
            String var6 = "";
            String var7 = "";
            File var8 = new File(file, "avatar.json");
            if (var8.isFile()) {
               try {
                  JSONObject var9 = new JSONObject(new String(Files.readAllBytes(var8.toPath()), StandardCharsets.UTF_8));
                  var5 = O0000000000(var9.optString("name", var5));
                  var7 = var9.optString("color", "");
                  JSONArray var10 = var9.optJSONArray("authors");
                  if (var10 != null && var10.length() > 0) {
                     StringBuilder var11 = new StringBuilder();

                     for (int var12 = 0; var12 < var10.length(); var12++) {
                        if (var12 > 0) {
                           var11.append(", ");
                        }

                        var11.append(O0000000000(var10.optString(var12, "")));
                     }

                     var6 = var11.toString();
                  } else {
                     var6 = O0000000000(var9.optString("author", ""));
                  }
               } catch (Exception var13) {
               }
            }

            return new O00000O0OOO00O(string, file, var3, var4, var5.isEmpty() ? file.getName() : var5, var6, var7, o00000O0OOOO);
         }
      } else {
         return null;
      }
   }

   private static File O00000000(File file) {
      File[] var1 = file.listFiles();
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
            return var3 != null ? var3 : O00000000(file, ".bbmodel");
         }
      }
   }

   private static String O0000000000(String string) {
      return string == null ? "" : string.replaceAll("§.", "").replaceAll("&[0-9A-Fa-fK-Ok-or]", "").trim();
   }

   private static File O00000000(File file, String string) {
      File[] var2 = file.listFiles();
      if (var2 == null) {
         return null;
      } else {
         for (File var6 : var2) {
            if (var6.isFile() && var6.getName().toLowerCase().endsWith(string)) {
               return var6;
            }
         }

         return null;
      }
   }

   public String O00000000() {
      return this.O00000000;
   }

   public File O000000000() {
      return this.O000000000;
   }

   public File O0000000000() {
      return this.O00000000000;
   }

   public String O00000000000() {
      return this.O0000000000000;
   }

   public String O000000000000() {
      return this.O000000000000;
   }

   void O00000000(String string) {
      this.O0000000000000 = string != null && !string.trim().isEmpty() ? string.trim() : this.O000000000000;
   }

   public String O0000000000000() {
      return this.O000000000000O;
   }

   public String O000000000000O() {
      return this.O00000000000O;
   }

   public O00000O0OOOO O00000000000O() {
      return this.O00000000000O0;
   }

   void O00000000(O00000O0OOOO o00000O0OOOO) {
      this.O00000000000O0 = o00000O0OOOO == null ? O00000O0OOOO.MODELS : o00000O0OOOO;
   }

   public String O00000000000O0() {
      return this.O00000000000OO;
   }

   void O000000000(String string) {
      this.O00000000000OO = string == null ? "" : string.trim();
   }

   public boolean O00000000000OO() {
      return this.O0000000000O00() != null;
   }

   public O00000O0OOOO O0000000000O() {
      O00000O0OOOO0 var1 = this.O0000000000O00();
      if (var1 == null) {
         return O00000O0OOOO.MODELS;
      } else {
         HashSet var2 = new HashSet();

         for (O00000O0OOOO0.W196 var4 : var1.O00000000000()) {
            O00000000(var4, var2);
         }

         boolean var7 = var2.contains("body") || var2.contains("torso");
         boolean var8 = var2.contains("leftleg") || var2.contains("rightleg") || var2.contains("left_leg") || var2.contains("right_leg");
         boolean var5 = var2.contains("leftarm") || var2.contains("rightarm") || var2.contains("left_arm") || var2.contains("right_arm");
         boolean var6 = var2.contains("head");
         if (!var7 || !var8 && !var5) {
            if (var6 && !var7 && !var8) {
               return O00000O0OOOO.ITEMS;
            } else {
               return !var7 && !var8 && !var5 && !var6 ? O00000O0OOOO.PETS : O00000O0OOOO.MODELS;
            }
         } else {
            return O00000O0OOOO.MODELS;
         }
      }
   }

   private static void O00000000(O00000O0OOOO0.W196 o00000000, Set<String> set) {
      if (o00000000.O00000000() != null) {
         set.add(o00000000.O00000000().toLowerCase());
      }

      for (O00000O0OOOO0.W196 var3 : o00000000.O00000000000O0()) {
         O00000000(var3, set);
      }
   }

   public String O0000000000O0() {
      this.O0000000000O00();
      return this.O0000000000O00;
   }

   public O00000O0OOOO0 O0000000000O00() {
      if (this.O0000000000O0) {
         return this.O0000000000O;
      } else {
         this.O0000000000O0 = true;

         try {
            String var1 = new String(Files.readAllBytes(this.O0000000000.toPath()), StandardCharsets.UTF_8);
            this.O0000000000O = O00000O0OOOO00.O00000000(var1);
            if (this.O0000000000O.O00000000000().isEmpty()) {
               this.O0000000000O00 = "Пустая модель";
            }
         } catch (Throwable var2) {
            this.O0000000000O00 = var2.getClass().getSimpleName() + ": " + var2.getMessage();
            this.O0000000000O = null;
         }

         return this.O0000000000O;
      }
   }
}
