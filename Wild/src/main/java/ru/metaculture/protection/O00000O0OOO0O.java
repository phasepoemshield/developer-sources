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

public final class O00000O0OOO0O {
   private static final String O00000000 = "assets/wild/studio/presets/";
   private static O00000O0OOO0O O000000000;
   private final File O0000000000;
   private final List<O00000O0OOO00O> O00000000000 = new ArrayList<>();
   private final Map<String, O00000O0OOOO> O000000000000 = new HashMap<>();
   private final Map<String, String> O0000000000000 = new HashMap<>();
   private final Map<String, String> O000000000000O = new HashMap<>();
   private final Map<String, O00000O0OOOO> O00000000000O = new LinkedHashMap<>();
   private String O00000000000O0 = "";
   private boolean O00000000000OO;
   private boolean O0000000000O;

   private O00000O0OOO0O() {
      this.O0000000000 = new File(WildClient.O000000000(), "avatars");
   }

   public static O00000O0OOO0O O00000000() {
      if (O000000000 == null) {
         O000000000 = new O00000O0OOO0O();
      }

      return O000000000;
   }

   public File O000000000() {
      return this.O0000000000;
   }

   public synchronized void O0000000000() {
      if (!this.O0000000000O) {
         this.O0000000000O = true;

         try {
            if (!this.O0000000000.exists()) {
               this.O0000000000.mkdirs();
            }

            this.O0000000000O();
            this.O00000000000OO();
            this.O00000000000O();
         } catch (Throwable var2) {
            System.out.println("[Studio] library init failed: " + var2.getClass().getSimpleName() + ": " + var2.getMessage());
         }
      }
   }

   public synchronized void O00000000000() {
      this.O0000000000O();
      this.O00000000000O();
   }

   public synchronized List<O00000O0OOO00O> O000000000000() {
      return new ArrayList<>(this.O00000000000);
   }

   public synchronized List<O00000O0OOO00O> O00000000(O00000O0OOOO o00000O0OOOO) {
      ArrayList var2 = new ArrayList();

      for (O00000O0OOO00O var4 : this.O00000000000) {
         if (var4.O00000000000O() == o00000O0OOOO) {
            var2.add(var4);
         }
      }

      return var2;
   }

   public synchronized O00000O0OOO00O O0000000000000() {
      for (O00000O0OOO00O var2 : this.O00000000000) {
         if (var2.O00000000().equals(this.O00000000000O0)) {
            return var2;
         }
      }

      return null;
   }

   public synchronized void O00000000(O00000O0OOO00O o00000O0OOO00O) {
      this.O00000000000O0 = o00000O0OOO00O == null ? "" : o00000O0OOO00O.O00000000();
      this.O00000000000OO = o00000O0OOO00O != null;
      this.O0000000000O0();
   }

   public synchronized boolean O000000000000O() {
      return this.O00000000000OO && !this.O00000000000O0.isEmpty();
   }

   public synchronized void O00000000(boolean bl) {
      this.O00000000000OO = bl && !this.O00000000000O0.isEmpty();
      this.O0000000000O0();
   }

   public synchronized void O00000000(O00000O0OOO00O o00000O0OOO00O, O00000O0OOOO o00000O0OOOO) {
      if (o00000O0OOO00O != null && o00000O0OOOO != null) {
         o00000O0OOO00O.O00000000(o00000O0OOOO);
         this.O000000000000.put(o00000O0OOO00O.O00000000(), o00000O0OOOO);
         this.O0000000000O0();
      }
   }

   public synchronized void O00000000(O00000O0OOO00O o00000O0OOO00O, String string) {
      if (o00000O0OOO00O != null) {
         String var3 = string == null ? "" : string.trim();
         if (var3.isEmpty()) {
            this.O0000000000000.remove(o00000O0OOO00O.O00000000());
            o00000O0OOO00O.O00000000((String)null);
         } else {
            this.O0000000000000.put(o00000O0OOO00O.O00000000(), var3);
            o00000O0OOO00O.O00000000(var3);
         }

         this.O00000000000.sort((o00000O0OOO00Ox, o00000O0OOO00O2) -> o00000O0OOO00Ox.O00000000000().compareToIgnoreCase(o00000O0OOO00O2.O00000000000()));
         this.O0000000000O0();
      }
   }

   public synchronized void O000000000(O00000O0OOO00O o00000O0OOO00O, String string) {
      if (o00000O0OOO00O != null) {
         String var3 = string == null ? "" : string.trim();
         o00000O0OOO00O.O000000000(var3);
         if (var3.isEmpty()) {
            this.O000000000000O.remove(o00000O0OOO00O.O00000000());
         } else {
            this.O000000000000O.put(o00000O0OOO00O.O00000000(), var3);
         }

         this.O0000000000O0();
      }
   }

   public synchronized boolean O000000000(O00000O0OOO00O o00000O0OOO00O) {
      if (o00000O0OOO00O == null) {
         return false;
      } else {
         boolean var2 = O00000000(o00000O0OOO00O.O000000000());
         this.O00000000000.remove(o00000O0OOO00O);
         this.O0000000000000.remove(o00000O0OOO00O.O00000000());
         this.O000000000000O.remove(o00000O0OOO00O.O00000000());
         this.O000000000000.remove(o00000O0OOO00O.O00000000());
         if (o00000O0OOO00O.O00000000().equals(this.O00000000000O0)) {
            this.O00000000000O0 = "";
            this.O00000000000OO = false;
         }

         this.O0000000000O0();
         return var2;
      }
   }

   private static boolean O00000000(File file) {
      if (file == null) {
         return false;
      } else {
         File[] var1 = file.listFiles();
         if (var1 != null) {
            for (File var5 : var1) {
               O00000000(var5);
            }
         }

         return file.delete();
      }
   }

   public synchronized String O00000000(File file, O00000O0OOOO o00000O0OOOO) {
      if (file != null && file.exists()) {
         try {
            String var3 = O00000000000(O0000000000(file.getName()));
            if (var3.isEmpty()) {
               var3 = "import";
            }

            File var4 = this.O000000000(var3);
            if (file.isDirectory()) {
               this.O00000000(file.toPath(), var4.toPath());
            } else {
               String var5 = O00000000000(file);
               if ("rar".equals(var5) || "7z".equals(var5)) {
                  return "Это " + var5.toUpperCase(Locale.ROOT) + ", не .zip — распакуйте вручную";
               }

               if (!"zip".equals(var5)) {
                  return "Нужен .zip или папка";
               }

               try (InputStream var6 = Files.newInputStream(file.toPath())) {
                  this.O00000000(var6, var4);
               }
            }

            String var13 = this.O0000000000(var4) + "/";
            int var14 = this.O00000000000.size();
            this.O00000000000O();
            int var7 = 0;

            for (O00000O0OOO00O var9 : this.O00000000000) {
               if (var9.O00000000().startsWith(var13)) {
                  if (this.O000000000000.get(var9.O00000000()) == null) {
                     var9.O00000000(o00000O0OOOO);
                     this.O000000000000.put(var9.O00000000(), o00000O0OOOO);
                  }

                  var7++;
               }
            }

            this.O0000000000O0();
            return var7 == 0 ? "Аватары не найдены (нет avatar.json)" : "Импортировано: " + var7 + (this.O00000000000.size() > var14 ? "" : "");
         } catch (Throwable var12) {
            return "Ошибка: " + var12.getClass().getSimpleName();
         }
      } else {
         return "Файл не найден";
      }
   }

   private void O00000000000O() {
      this.O00000000000.clear();
      if (this.O0000000000.isDirectory()) {
         this.O00000000000O0();
         ArrayList var1 = new ArrayList();
         this.O00000000(this.O0000000000, var1, 0);

         for (File var3 : (Iterable<File>)var1) {
            String var4 = this.O0000000000(var3);
            O00000O0OOOO var5 = this.O000000000000.get(var4);
            O00000O0OOO00O var6 = O00000O0OOO00O.O00000000(var4, var3, var5 != null ? var5 : this.O00000000(var4));
            if (var6 != null) {
               if (var5 == null) {
                  try {
                     var6.O00000000(var6.O0000000000O());
                  } catch (Throwable var9) {
                  }
               }

               String var7 = this.O0000000000000.get(var4);
               if (var7 != null && !var7.isEmpty()) {
                  var6.O00000000(var7);
               }

               String var8 = this.O000000000000O.get(var4);
               if (var8 != null && !var8.isEmpty()) {
                  var6.O000000000(var8);
               }

               this.O00000000000.add(var6);
            }
         }

         this.O00000000000.sort((o00000O0OOO00O, o00000O0OOO00O2) -> o00000O0OOO00O.O00000000000().compareToIgnoreCase(o00000O0OOO00O2.O00000000000()));
      }
   }

   private void O00000000(File file, List<File> list, int i) {
      if (file != null && file.isDirectory() && i <= 8) {
         if (this.O000000000(file)) {
            list.add(file);
         } else {
            File[] var4 = file.listFiles();
            if (var4 != null) {
               for (File var8 : var4) {
                  if (var8.isDirectory()) {
                     this.O00000000(var8, list, i + 1);
                  }
               }
            }
         }
      }
   }

   private void O00000000000O0() {
      File[] var1 = this.O0000000000.listFiles();
      if (var1 != null) {
         for (File var5 : var1) {
            if (var5.isFile() && var5.getName().toLowerCase(Locale.ROOT).endsWith(".zip")) {
               if (!"zip".equals(O00000000000(var5))) {
                  System.out.println("[Studio] skipping non-zip archive (RAR/7z?): " + var5.getName());
               } else {
                  try {
                     String var6 = O00000000000(O0000000000(var5.getName()));
                     if (var6.isEmpty()) {
                        var6 = "import";
                     }

                     File var7 = this.O000000000(var6);

                     try (InputStream var8 = Files.newInputStream(var5.toPath())) {
                        this.O00000000(var8, var7);
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

   private boolean O000000000(File file) {
      File[] var2 = file.listFiles();
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

   private O00000O0OOOO O00000000(String string) {
      for (Entry var3 : this.O00000000000O.entrySet()) {
         if (string.startsWith((String)var3.getKey() + "/") || string.equals(var3.getKey())) {
            return (O00000O0OOOO)var3.getValue();
         }
      }

      return O00000O0OOOO.MODELS;
   }

   private String O0000000000(File file) {
      String var2 = this.O0000000000.getAbsolutePath();
      String var3 = file.getAbsolutePath();
      String var4 = var3.length() > var2.length() ? var3.substring(var2.length()) : var3;
      var4 = var4.replace('\\', '/');

      while (var4.startsWith("/")) {
         var4 = var4.substring(1);
      }

      return var4;
   }

   private void O00000000000OO() {
      String var1 = this.O000000000000("assets/wild/studio/presets/index.json");
      if (var1 != null) {
         JSONObject var2 = new JSONObject(var1);
         JSONArray var3 = var2.optJSONArray("presets");
         if (var3 != null) {
            for (int var4 = 0; var4 < var3.length(); var4++) {
               JSONObject var5 = var3.optJSONObject(var4);
               if (var5 != null) {
                  String var6 = var5.optString("file", "");
                  O00000O0OOOO var7 = O00000O0OOOO.O00000000(var5.optString("category", "models"));
                  if (!var6.isEmpty()) {
                     String var8 = O00000000000(O0000000000(var6));
                     this.O00000000000O.put(var8, var7);
                     File var9 = new File(this.O0000000000, var8);
                     if (!var9.isDirectory()) {
                        byte[] var10 = this.O0000000000000("assets/wild/studio/presets/" + var6);
                        if (var10 != null) {
                           try {
                              this.O00000000(new ByteArrayInputStream(var10), var9);
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

   private static String O00000000000(File file) {
      try {
         String var8;
         try (InputStream var1 = Files.newInputStream(file.toPath())) {
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

   private void O00000000(InputStream inputStream, File file) throws IOException {
      if (!file.exists()) {
         file.mkdirs();
      }

      Path var3 = file.toPath().normalize();

      ZipEntry var5;
      try (ZipInputStream var4 = new ZipInputStream(inputStream)) {
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

   private void O00000000(Path path, Path path2) throws IOException {
      Files.walk(path).forEach(path3 -> {
         try {
            Path var3 = path2.resolve(path.relativize(path3).toString());
            if (Files.isDirectory(path3)) {
               Files.createDirectories(var3);
            } else {
               Files.createDirectories(var3.getParent());
               Files.copy(path3, var3, StandardCopyOption.REPLACE_EXISTING);
            }
         } catch (IOException var4) {
            throw new RuntimeException(var4);
         }
      });
   }

   private File O000000000(String string) {
      File var2 = new File(this.O0000000000, string);

      for (int var3 = 2; var2.exists(); var3++) {
         var2 = new File(this.O0000000000, string + "-" + var3);
      }

      return var2;
   }

   private static String O0000000000(String string) {
      int var1 = string.lastIndexOf(46);
      return var1 > 0 ? string.substring(0, var1) : string;
   }

   private static String O00000000000(String string) {
      return string.trim().replaceAll("[^a-zA-Z0-9._ -]", "_");
   }

   private void O0000000000O() {
      this.O000000000000.clear();
      this.O0000000000000.clear();
      this.O000000000000O.clear();
      this.O00000000000O0 = "";
      this.O00000000000OO = false;
      File var1 = new File(this.O0000000000, "index.json");
      if (var1.isFile()) {
         try {
            JSONObject var2 = new JSONObject(new String(Files.readAllBytes(var1.toPath()), StandardCharsets.UTF_8));
            this.O00000000000O0 = var2.optString("selected", "");
            this.O00000000000OO = var2.optBoolean("equipped", !this.O00000000000O0.isEmpty()) && !this.O00000000000O0.isEmpty();
            JSONObject var3 = var2.optJSONObject("tabs");
            if (var3 != null) {
               for (String var5 : var3.keySet()) {
                  this.O000000000000.put(var5, O00000O0OOOO.O00000000(var3.optString(var5, "models")));
               }
            }

            JSONObject var9 = var2.optJSONObject("names");
            if (var9 != null) {
               for (String var6 : var9.keySet()) {
                  this.O0000000000000.put(var6, var9.optString(var6, ""));
               }
            }

            JSONObject var11 = var2.optJSONObject("prefixes");
            if (var11 != null) {
               for (String var7 : var11.keySet()) {
                  this.O000000000000O.put(var7, var11.optString(var7, ""));
               }
            }
         } catch (Exception var8) {
         }
      }
   }

   private void O0000000000O0() {
      try {
         JSONObject var1 = new JSONObject();
         var1.put("selected", this.O00000000000O0);
         var1.put("equipped", this.O00000000000OO);
         JSONObject var2 = new JSONObject();

         for (Entry var4 : this.O000000000000.entrySet()) {
            var2.put((String)var4.getKey(), ((O00000O0OOOO)var4.getValue()).O00000000());
         }

         var1.put("tabs", var2);
         JSONObject var8 = new JSONObject();

         for (Entry var5 : this.O0000000000000.entrySet()) {
            var8.put((String)var5.getKey(), var5.getValue());
         }

         var1.put("names", var8);
         JSONObject var10 = new JSONObject();

         for (Entry var6 : this.O000000000000O.entrySet()) {
            var10.put((String)var6.getKey(), var6.getValue());
         }

         var1.put("prefixes", var10);
         File var12 = new File(this.O0000000000, "index.json");
         Files.write(var12.toPath(), var1.toString(2).getBytes(StandardCharsets.UTF_8));
      } catch (Exception var7) {
      }
   }

   private String O000000000000(String string) {
      byte[] var2 = this.O0000000000000(string);
      return var2 == null ? null : new String(var2, StandardCharsets.UTF_8);
   }

   private byte[] O0000000000000(String string) {
      ClassLoader var2 = O00000O0OOO0O.class.getClassLoader();

      try {
         byte[] var4;
         try (InputStream var3 = var2.getResourceAsStream(string)) {
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
