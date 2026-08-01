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
import net.minecraft.client.MinecraftClient;
import org.json.JSONArray;
import org.json.JSONObject;

public final class O00000OOOOO000 {
   private static final O00000OOOOO000 O00000000 = new O00000OOOOO000();
   private static final String O000000000 = "active.json";
   private static final String O0000000000 = ".theme.json";
   private static final String O00000000000 = ".wifd";
   private static final String O000000000000 = ".json";
   private static final DateTimeFormatter O0000000000000 = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
   private final File O000000000000O;
   private final Map<O00000OOOO00O, String> O00000000000O = new EnumMap<>(O00000OOOO00O.class);
   private final Map<String, O00000OOOOO00> O00000000000O0 = new HashMap<>();
   private boolean O00000000000OO;

   private O00000OOOOO000() {
      File var1 = WildClient.O00000000 != null && WildClient.O00000000.O0000000000000 != null
         ? new File(WildClient.O00000000.O0000000000000, "foundry")
         : new File(WildClient.O000000000(), "foundry");
      this.O000000000000O = var1;
      if (!var1.exists() && !var1.mkdirs()) {
         System.out.println("[FoundryStorage] cannot create directory " + var1.getAbsolutePath());
      }
   }

   public static O00000OOOOO000 O00000000() {
      return O00000000;
   }

   public synchronized void O00000000(O00000OOO0OOO o00000OOO0OOO) {
      if (!this.O00000000000OO) {
         this.O00000000000OO = true;
         this.O00000000000O0.clear();
         if (this.O000000000000O.isDirectory()) {
            this.O00000000000O();
            File[] var2 = this.O000000000000O.listFiles((file, string) -> string.endsWith(".theme.json"));
            ArrayList var3 = new ArrayList();
            if (var2 != null) {
               for (File var7 : var2) {
                  if (!O0000000000(var7.getName())) {
                     var3.add(var7);
                  } else {
                     try {
                        O00000OOOOO00 var8 = this.O00000000(var7, new JSONObject(O00000000(var7)));
                        this.O00000000000O0.put(var8.O00000000(), var8);
                     } catch (Throwable var9) {
                        System.out.println("[FoundryStorage] skip " + var7.getName() + ": " + var9.getMessage());
                     }
                  }
               }
            }

            boolean var10 = false;

            for (File var12 : (List<File>)var3) {
               var10 |= this.O000000000(var12, o00000OOO0OOO);
            }

            if (var10) {
               this.O00000000000O0();
            }
         }
      }
   }

   public synchronized List<O00000OOOOO00> O000000000() {
      ArrayList var1 = new ArrayList<>(this.O00000000000O0.values());
      var1.sort((o00000OOOOO00, o00000OOOOO002) -> Long.compare(((O00000OOOOO00)o00000OOOOO002).O0000000000O(), ((O00000OOOOO00)o00000OOOOO00).O0000000000O()));
      return var1;
   }

   public synchronized List<O00000OOOOO00> O00000000(O00000OOOO00O o00000OOOO00O) {
      if (o00000OOOO00O == null) {
         return Collections.emptyList();
      } else {
         ArrayList var2 = new ArrayList();

         for (O00000OOOOO00 var4 : this.O00000000000O0.values()) {
            if (o00000OOOO00O.O00000000().equals(var4.O0000000000())) {
               var2.add(var4);
            }
         }

         var2.sort((o00000OOOOO00, o00000OOOOO002) -> Long.compare(((O00000OOOOO00)o00000OOOOO002).O0000000000O(), ((O00000OOOOO00)o00000OOOOO00).O0000000000O()));
         return var2;
      }
   }

   public synchronized O00000OOOOO00 O00000000(String string) {
      return string == null ? null : this.O00000000000O0.get(string);
   }

   public synchronized O00000OOOOO00 O00000000(O00000OOOO00O o00000OOOO00O, O00000OOO0OO00 o00000OOO0OO00, String string, String string2) {
      if (o00000OOOO00O != null && o00000OOO0OO00 != null) {
         long var5 = System.currentTimeMillis();
         String var7 = string != null && !string.isBlank() ? string.trim() : o00000OOO0OO00.O00000000().O000000000();
         if (var7 == null || var7.isBlank()) {
            var7 = O00000OOOOO0.O00000000();
         }

         O00000OOO0O000 var8 = o00000OOO0OO00.O00000000();
         var8.O00000000(var7, O000000000000O());
         var8.O00000000(var7);
         var8.O000000000(var5);
         var8.O000000000000("local");
         String var9 = O00000OOOO0OO0.O00000000(o00000OOO0OO00);
         O00000OOOOO00 var10 = string2 == null ? null : this.O00000000000O0.get(string2);
         if (var10 == null) {
            var10 = new O00000OOOOO00(
               this.O00000000000OO(),
               var7,
               o00000OOOO00O.O00000000(),
               var9,
               var8.O0000000000(),
               var8.O00000000000(),
               var8.O000000000000(),
               "user",
               "saved",
               var8.O00000000000O0(),
               var5,
               var8.O0000000000O()
            );
            this.O00000000000O0.put(var10.O00000000(), var10);
         } else {
            var10.O00000000(var7);
            var10.O000000000(o00000OOOO00O.O00000000());
            var10.O0000000000(var9);
            var10.O00000000000(var8.O0000000000());
            var10.O000000000000(var8.O00000000000());
            var10.O0000000000000(var8.O000000000000());
            var10.O000000000000O("user");
            var10.O00000000000O("saved");
            var10.O00000000(var8.O00000000000O0());
            var10.O000000000(var5);
            var10.O00000000(var8.O0000000000O());
         }

         try {
            this.O00000000(var10, var8);
         } catch (IOException var12) {
            System.out.println("[FoundryStorage] save failed: " + var12.getMessage());
         }

         return var10;
      } else {
         return null;
      }
   }

   public synchronized O00000OOOOO00 O00000000(O00000OOOO00O o00000OOOO00O, O00000OOO0OO00 o00000OOO0OO00, String string) {
      if (o00000OOOO00O != null && o00000OOO0OO00 != null) {
         O00000OOOOO00 var4 = string == null ? null : this.O00000000000O0.get(string);
         String var5 = var4 == null ? o00000OOO0OO00.O00000000().O000000000() : var4.O000000000();
         return this.O00000000(o00000OOOO00O, o00000OOO0OO00, var5, string);
      } else {
         return null;
      }
   }

   public synchronized File O0000000000() {
      File var1 = new File(this.O000000000000O, "shaders");
      if (!var1.exists()) {
         var1.mkdirs();
      }

      return var1;
   }

   public synchronized File O00000000000() {
      if (!this.O000000000000O.exists()) {
         this.O000000000000O.mkdirs();
      }

      return this.O000000000000O;
   }

   public synchronized File O000000000(O00000OOOO00O o00000OOOO00O, O00000OOO0OO00 o00000OOO0OO00, String string) {
      if (o00000OOO0OO00 == null) {
         return null;
      } else {
         O00000OOOO00O var4 = o00000OOOO00O == null ? O00000OOOO00O.O00000000(o00000OOO0OO00.O000000000()) : o00000OOOO00O;
         String var5 = string != null && !string.isBlank() ? string.trim() : o00000OOO0OO00.O00000000().O000000000();
         if (var5 == null || var5.isBlank()) {
            var5 = O00000OOOOO0.O00000000();
         }

         O00000OOO0O000 var6 = o00000OOO0OO00.O00000000();
         var6.O00000000(var5, O000000000000O());
         var6.O00000000(var5);
         var6.O000000000(System.currentTimeMillis());
         var6.O000000000000("shared");
         String var7 = O00000000000(var5);
         String var8 = LocalDateTime.now().format(O0000000000000);
         File var9 = new File(this.O0000000000(), var7 + "_" + var8 + ".wifd");

         try {
            o00000OOO0OO00.O00000000(var4.O00000000());
            JSONObject var10 = new JSONObject();
            var10.put("version", 4);
            var10.put("type", "wild_foundry");
            var10.put("target", var4.O00000000());
            var10.put("metadata", O00000OOOO0OO0.O00000000(var6));
            var10.put("graph", O00000OOOO0OO0.O000000000(o00000OOO0OO00));
            Files.write(var9.toPath(), var10.toString(2).getBytes(StandardCharsets.UTF_8));
            return var9;
         } catch (Throwable var11) {
            System.out.println("[FoundryStorage] shared export failed: " + var11.getMessage());
            return null;
         }
      }
   }

   public synchronized List<File> O000000000000() {
      File var1 = this.O0000000000();
      File[] var2 = var1.listFiles((file, string) -> {
         if (string == null) {
            return false;
         } else {
            String var2x = string.toLowerCase(Locale.ROOT);
            return var2x.endsWith(".wifd") || var2x.endsWith(".json");
         }
      });
      if (var2 != null && var2.length != 0) {
         ArrayList var3 = new ArrayList<>(List.of(var2));
         var3.sort((file, file2) -> Long.compare(((File)file2).lastModified(), ((File)file).lastModified()));
         return var3;
      } else {
         return List.of();
      }
   }

   public synchronized O00000OOO0OO00 O00000000(File file, O00000OOO0OOO o00000OOO0OOO) {
      if (file != null && o00000OOO0OOO != null && file.isFile()) {
         try {
            String var3 = O00000000(file);
            JSONObject var4 = new JSONObject(var3);
            JSONObject var5 = var4.optJSONObject("graph");
            if (var5 != null) {
               O00000OOO0OO00 var10 = O00000OOOO0OO0.O00000000(var5, o00000OOO0OOO);
               String var12 = var4.optString("target", "");
               if (!var12.isBlank()) {
                  var10.O00000000(var12);
               }

               O00000OOO0O000 var13 = O00000OOOO0OO0.O00000000(var4.optJSONObject("metadata"), var4);
               var13.O000000000000("imported");
               var13.O00000000(var4.optString("displayName", O00000OOOOO0.O00000000()), var4.optString("author", O000000000000O()));
               var10.O00000000(var13);
               return var10;
            }

            String var6 = var4.optString("wildTheme", "");
            if (!var6.isBlank()) {
               O00000OOO0OO00 var11 = O00000OOOO0OO0.O00000000(var6, o00000OOO0OOO);
               O00000OOO0O000 var8 = O00000OOOO0OO0.O00000000(var4.optJSONObject("metadata"), var4);
               var8.O000000000000("imported");
               var8.O00000000(var4.optString("displayName", O00000OOOOO0.O00000000()), var4.optString("author", O000000000000O()));
               var11.O00000000(var8);
               return var11;
            }

            if (var4.has("nodes") && var4.has("connections")) {
               O00000OOO0OO00 var7 = O00000OOOO0OO0.O00000000(var4, o00000OOO0OOO);
               var7.O00000000().O000000000000("imported");
               var7.O00000000().O00000000(var4.optString("displayName", O00000OOOOO0.O00000000()), var4.optString("author", O000000000000O()));
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

   public synchronized boolean O000000000(String string) {
      if (string == null) {
         return false;
      } else {
         O00000OOOOO00 var2 = this.O00000000000O0.remove(string);
         if (var2 == null) {
            return false;
         } else {
            for (Entry var4 : new ArrayList<>(this.O00000000000O.entrySet())) {
               if (string.equals(var4.getValue())) {
                  this.O00000000000O.remove(var4.getKey());
               }
            }

            try {
               Files.deleteIfExists(new File(this.O000000000000O, string).toPath());
            } catch (IOException var5) {
            }

            this.O00000000000O0();
            return true;
         }
      }
   }

   public synchronized O00000OOO0OO00 O00000000(String string, O00000OOO0OOO o00000OOO0OOO) {
      O00000OOOOO00 var3 = this.O00000000000O0.get(string);
      if (var3 == null) {
         return null;
      } else {
         try {
            O00000OOO0OO00 var4 = O00000OOOO0OO0.O00000000(var3.O00000000000(), o00000OOO0OOO);
            var4.O00000000().O00000000(var3.O000000000(), var3.O000000000000().isBlank() ? O000000000000O() : var3.O000000000000());
            var4.O00000000().O00000000(var3.O000000000());
            if (!var3.O000000000000().isBlank()) {
               var4.O00000000().O000000000(var3.O000000000000());
            }

            var4.O00000000().O0000000000(var3.O0000000000000());
            var4.O00000000().O00000000000(var3.O000000000000O());
            var4.O00000000().O00000000(var3.O00000000000OO());
            var4.O00000000().O000000000(var3.O0000000000O());
            var4.O00000000().O00000000(var3.O0000000000O0());
            return var4;
         } catch (Throwable var5) {
            return null;
         }
      }
   }

   public synchronized void O00000000(O00000OOOO00O o00000OOOO00O, String string) {
      if (o00000OOOO00O != null) {
         if (string == null || string.isBlank()) {
            this.O00000000000O.remove(o00000OOOO00O);
         } else if (this.O00000000000O0.containsKey(string)) {
            this.O00000000000O.put(o00000OOOO00O, string);
         }

         this.O00000000000O0();
      }
   }

   public synchronized String O000000000(O00000OOOO00O o00000OOOO00O) {
      return this.O00000000000O.get(o00000OOOO00O);
   }

   public synchronized O00000OOOOO00 O0000000000(O00000OOOO00O o00000OOOO00O) {
      String var2 = this.O00000000000O.get(o00000OOOO00O);
      return var2 == null ? null : this.O00000000000O0.get(var2);
   }

   public synchronized JSONArray O0000000000000() {
      JSONArray var1 = new JSONArray();

      for (O00000OOOOO00 var3 : this.O000000000()) {
         JSONObject var4 = new JSONObject();
         var4.put("fileName", var3.O00000000());
         var4.put("displayName", var3.O000000000());
         var4.put("target", var3.O0000000000());
         var4.put("author", var3.O000000000000());
         var4.put("description", var3.O0000000000000());
         var4.put("complexity", var3.O000000000000O());
         var4.put("source", var3.O00000000000O());
         var4.put("compileStatus", var3.O00000000000O0());
         var4.put("createdAt", var3.O00000000000OO());
         var4.put("updatedAt", var3.O0000000000O());
         var4.put("favorite", var3.O0000000000O0());
         var1.put(var4);
      }

      return var1;
   }

   private void O00000000000O() {
      File var1 = new File(this.O000000000000O, "active.json");
      if (var1.exists()) {
         try {
            JSONObject var2 = new JSONObject(O00000000(var1));

            for (O00000OOOO00O var6 : O00000OOOO00O.values()) {
               String var7 = var2.optString(var6.O00000000(), null);
               if (var7 != null && !var7.isBlank()) {
                  this.O00000000000O.put(var6, var7);
               }
            }
         } catch (Throwable var8) {
            System.out.println("[FoundryStorage] cannot read active bindings: " + var8.getMessage());
         }
      }
   }

   private void O00000000000O0() {
      try {
         JSONObject var1 = new JSONObject();

         for (Entry var3 : this.O00000000000O.entrySet()) {
            var1.put(((O00000OOOO00O)var3.getKey()).O00000000(), var3.getValue());
         }

         Files.write(new File(this.O000000000000O, "active.json").toPath(), var1.toString(2).getBytes(StandardCharsets.UTF_8));
      } catch (IOException var4) {
         System.out.println("[FoundryStorage] cannot persist active bindings: " + var4.getMessage());
      }
   }

   private O00000OOOOO00 O00000000(File file, JSONObject jSONObject) {
      String var3 = jSONObject.optString("wildTheme", "");
      O00000OOO0O000 var4 = O00000OOOO0OO0.O00000000(jSONObject.optJSONObject("metadata"), jSONObject);
      if (var4.O000000000().isBlank()) {
         var4.O00000000(O0000000000(file.getName()) ? O00000OOOOO0.O00000000() : file.getName().replace(".theme.json", ""));
      }

      var4.O00000000(var4.O000000000(), O000000000000O());
      long var5 = var4.O00000000000OO() > 0L ? var4.O00000000000OO() : jSONObject.optLong("updatedAt", file.lastModified());
      String var7 = jSONObject.optString("target", "preview");
      String var8 = jSONObject.optString("source", var4.O0000000000000().isBlank() ? "user" : var4.O0000000000000());
      String var9 = jSONObject.optString("compileStatus", "saved");
      return new O00000OOOOO00(
         file.getName(),
         var4.O000000000(),
         var7,
         var3,
         var4.O0000000000(),
         var4.O00000000000(),
         var4.O000000000000(),
         var8,
         var9,
         var4.O00000000000O0(),
         var5,
         var4.O0000000000O()
      );
   }

   private boolean O000000000(File file, O00000OOO0OOO o00000OOO0OOO) {
      String var3 = file.getName();
      boolean var5 = false;

      try {
         JSONObject var6 = new JSONObject(O00000000(file));
         O00000OOOOO00 var7 = this.O00000000(file, var6);
         if (!this.O000000000(var7.O00000000000(), o00000OOO0OOO)) {
            JSONObject var8 = var6.optJSONObject("graph");
            if (var8 != null) {
               O00000OOO0OO00 var9 = O00000OOOO0OO0.O00000000(var8, o00000OOO0OOO);
               if (var9 != null) {
                  var7.O0000000000(O00000OOOO0OO0.O00000000(var9));
               }
            }
         }

         if (!this.O000000000(var7.O00000000000(), o00000OOO0OOO)) {
            System.out.println("[FoundryStorage] keeping legacy file without loadable payload: " + var3);
            return false;
         } else {
            O00000OOOOO00 var12 = this.O00000000(var7);
            String var4;
            if (var12 != null) {
               var4 = var12.O00000000();
            } else {
               var4 = this.O00000000000OO();
               O00000OOO0O000 var13 = O00000OOOO0OO0.O00000000(var6.optJSONObject("metadata"), var6);
               var13.O00000000(var7.O000000000(), O000000000000O());
               var13.O00000000(var7.O000000000());
               var13.O00000000(var7.O00000000000OO());
               var13.O000000000(var7.O0000000000O());
               var13.O00000000(var7.O0000000000O0());
               O00000OOOOO00 var10 = new O00000OOOOO00(
                  var4,
                  var7.O000000000(),
                  var7.O0000000000(),
                  var7.O00000000000(),
                  var7.O000000000000(),
                  var7.O0000000000000(),
                  var7.O000000000000O(),
                  var7.O00000000000O(),
                  var7.O00000000000O0(),
                  var7.O00000000000OO(),
                  var7.O0000000000O(),
                  var7.O0000000000O0()
               );
               this.O00000000(var10, var13);
               this.O00000000000O0.put(var4, var10);
            }

            for (Entry var15 : new ArrayList<>(this.O00000000000O.entrySet())) {
               if (var3.equals(var15.getValue())) {
                  this.O00000000000O.put((O00000OOOO00O)var15.getKey(), var4);
                  var5 = true;
               }
            }

            if (var5) {
               this.O00000000000O0();
            }

            Files.deleteIfExists(file.toPath());
            return var5;
         }
      } catch (Throwable var11) {
         System.out.println("[FoundryStorage] legacy migration failed for " + var3 + ": " + var11.getMessage());
         return var5;
      }
   }

   private boolean O000000000(String string, O00000OOO0OOO o00000OOO0OOO) {
      if (string != null && !string.isBlank()) {
         try {
            return O00000OOOO0OO0.O00000000(string, o00000OOO0OOO) != null;
         } catch (Throwable var4) {
            return false;
         }
      } else {
         return false;
      }
   }

   private O00000OOOOO00 O00000000(O00000OOOOO00 o00000OOOOO00) {
      for (O00000OOOOO00 var3 : this.O00000000000O0.values()) {
         if (var3.O000000000().equals(o00000OOOOO00.O000000000())
            && var3.O0000000000().equals(o00000OOOOO00.O0000000000())
            && var3.O00000000000().equals(o00000OOOOO00.O00000000000())) {
            return var3;
         }
      }

      return null;
   }

   private void O00000000(O00000OOOOO00 o00000OOOOO00, O00000OOO0O000 o00000OOO0O000) throws IOException {
      JSONObject var3 = new JSONObject();
      var3.put("version", 4);
      var3.put("target", o00000OOOOO00.O0000000000());
      var3.put("source", o00000OOOOO00.O00000000000O());
      var3.put("compileStatus", o00000OOOOO00.O00000000000O0());
      var3.put("wildTheme", o00000OOOOO00.O00000000000());
      var3.put("metadata", O00000OOOO0OO0.O00000000(o00000OOO0O000));
      Files.write(new File(this.O000000000000O, o00000OOOOO00.O00000000()).toPath(), var3.toString(2).getBytes(StandardCharsets.UTF_8));
   }

   private String O00000000000OO() {
      String var1;
      do {
         var1 = UUID.randomUUID() + ".theme.json";
      } while (this.O00000000000O0.containsKey(var1) || new File(this.O000000000000O, var1).exists());

      return var1;
   }

   private static boolean O0000000000(String string) {
      if (string != null && string.endsWith(".theme.json")) {
         String var1 = string.substring(0, string.length() - ".theme.json".length());
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

   private static String O00000000(File file) throws IOException {
      return new String(Files.readAllBytes(file.toPath()), StandardCharsets.UTF_8);
   }

   public static String O000000000000O() {
      if (WildClient.O00000000000OO != null && !WildClient.O00000000000OO.isBlank()) {
         return WildClient.O00000000000OO.trim();
      } else {
         MinecraftClient var0 = MinecraftClient.getInstance();
         return var0 != null && var0.getSession() != null && var0.getSession().getUsername() != null && !var0.getSession().getUsername().isBlank()
            ? var0.getSession().getUsername().trim()
            : "Unknown";
      }
   }

   public synchronized int O00000000(Set<String> set) {
      if (set != null && !set.isEmpty()) {
         int var2 = 0;

         for (O00000OOOOO00 var4 : new ArrayList<>(this.O00000000000O0.values())) {
            if (set.contains(O00000OOOO0O00.O00000000000OO(var4.O000000000())) && this.O000000000(var4.O00000000())) {
               var2++;
            }
         }

         return var2;
      } else {
         return 0;
      }
   }

   private static String O00000000000(String string) {
      String var1 = string == null ? "theme" : string.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]+", "_").replaceAll("^_+|_+$", "");
      return var1.isBlank() ? "theme" : var1;
   }
}
