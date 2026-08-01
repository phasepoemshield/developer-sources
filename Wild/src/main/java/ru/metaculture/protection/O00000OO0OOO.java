package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.FileReader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

final class O00000OO0OOO {
   private static final Gson O00000000 = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
   private static final String O000000000 = "wild-alt-vault";
   private static final int O0000000000 = 3;
   private static final int O00000000000 = 180000;
   private static final int O000000000000 = 128;
   private static final SecureRandom O0000000000000 = new SecureRandom();

   private O00000OO0OOO() {
   }

   static List<O00000OO0OOO.W246> O00000000(File file) {
      List var1 = O00000000000(file);
      if (var1 != null) {
         return O00000000(var1);
      } else {
         List var2 = O00000000000(O000000000000O(file));
         return var2 != null ? O00000000(var2) : List.of();
      }
   }

   static void O00000000(File file, List<O00000OO0OOO.W246> list) {
      O00000000(file, list, O000000000(file));
   }

   static void O00000000(File file, List<O00000OO0OOO.W246> list, String string) {
      try {
         File var3 = file.getParentFile();
         if (var3 != null) {
            var3.mkdirs();
         }

         List var4 = O00000000(list);
         String var5 = O00000000(var4, string);
         byte[] var6 = O00000000(16);
         byte[] var7 = O00000000(12);
         JsonObject var8 = new JsonObject();
         var8.addProperty("version", 3);
         var8.addProperty("savedAt", System.currentTimeMillis());
         if (!var5.isEmpty()) {
            var8.addProperty("lastSelectedId", var5);
         }

         JsonArray var9 = new JsonArray();

         for (O00000OO0OOO.W246 var11 : (List<O00000OO0OOO.W246>)var4) {
            JsonObject var12 = new JsonObject();
            var12.addProperty("id", var11.id());
            var12.addProperty("name", var11.name());
            var12.addProperty("type", var11.type());
            var12.addProperty("password", var11.password());
            var12.addProperty("createdAt", var11.createdAt());
            var12.addProperty("lastUsedAt", var11.lastUsedAt());
            var9.add(var12);
         }

         var8.add("accounts", var9);
         byte[] var14 = O00000000(file, O00000000.toJson(var8).getBytes(StandardCharsets.UTF_8), var6, var7);
         JsonObject var15 = new JsonObject();
         var15.addProperty("format", "wild-alt-vault");
         var15.addProperty("version", 3);
         var15.addProperty("cipher", "AES/GCM/NoPadding");
         var15.addProperty("kdf", "PBKDF2WithHmacSHA256");
         var15.addProperty("iterations", 180000);
         var15.addProperty("salt", Base64.getEncoder().encodeToString(var6));
         var15.addProperty("iv", Base64.getEncoder().encodeToString(var7));
         var15.addProperty("payload", Base64.getEncoder().encodeToString(var14));
         if (!var5.isEmpty()) {
            var15.addProperty("lastSelectedId", var5);
         }

         O00000000(file, O00000000.toJson(var15).getBytes(StandardCharsets.UTF_8));
      } catch (Throwable var13) {
      }
   }

   static String O000000000(File file) {
      if (file == null) {
         return "";
      } else {
         String var1 = O000000000000(file);
         return !var1.isEmpty() ? var1 : O000000000000(O000000000000O(file));
      }
   }

   static boolean O0000000000(File file) {
      if (file != null && file.exists() && file.isFile()) {
         try {
            boolean var4;
            try (FileReader var1 = new FileReader(file, StandardCharsets.UTF_8)) {
               JsonElement var2 = JsonParser.parseReader(var1);
               if (var2 == null || !var2.isJsonObject()) {
                  return false;
               }

               JsonObject var3 = var2.getAsJsonObject();
               var4 = "wild-alt-vault".equals(O00000000(var3, "format", "")) && O00000000(var3, "version", 0) >= 3;
            }

            return var4;
         } catch (Throwable var7) {
            return false;
         }
      } else {
         return false;
      }
   }

   private static List<O00000OO0OOO.W246> O00000000000(File file) {
      if (file != null && file.exists() && file.isFile()) {
         try {
            List var4;
            try (FileReader var1 = new FileReader(file, StandardCharsets.UTF_8)) {
               JsonElement var2 = JsonParser.parseReader(var1);
               if (var2 == null || var2.isJsonNull()) {
                  return null;
               }

               if (var2.isJsonArray()) {
                  return O00000000(var2.getAsJsonArray());
               }

               if (!var2.isJsonObject()) {
                  return null;
               }

               JsonObject var3 = var2.getAsJsonObject();
               if ("wild-alt-vault".equals(O00000000(var3, "format", ""))) {
                  return O00000000(file, var3);
               }

               if (!var3.has("accounts") || !var3.get("accounts").isJsonArray()) {
                  return null;
               }

               var4 = O00000000(var3.getAsJsonArray("accounts"));
            }

            return var4;
         } catch (Throwable var7) {
            return null;
         }
      } else {
         return null;
      }
   }

   private static String O000000000000(File file) {
      if (file != null && file.exists() && file.isFile()) {
         try {
            String var5;
            try (FileReader var1 = new FileReader(file, StandardCharsets.UTF_8)) {
               JsonElement var2 = JsonParser.parseReader(var1);
               if (var2 == null || !var2.isJsonObject()) {
                  return "";
               }

               JsonObject var3 = var2.getAsJsonObject();
               String var4 = O00000000(var3, "lastSelectedId", "");
               if (!var4.isBlank()) {
                  return var4.trim();
               }

               if ("wild-alt-vault".equals(O00000000(var3, "format", ""))) {
                  JsonObject var11 = O000000000(file, var3);
                  return var11 == null ? "" : O00000000(var11, "lastSelectedId", "").trim();
               }

               var5 = O00000000(var3, "lastSelectedId", "").trim();
            }

            return var5;
         } catch (Throwable var9) {
            return "";
         }
      } else {
         return "";
      }
   }

   private static List<O00000OO0OOO.W246> O00000000(File file, JsonObject jsonObject) throws Exception {
      JsonObject var2 = O000000000(file, jsonObject);
      if (var2 == null) {
         return null;
      } else {
         return var2.has("accounts") && var2.get("accounts").isJsonArray() ? O00000000(var2.getAsJsonArray("accounts")) : List.of();
      }
   }

   private static JsonObject O000000000(File file, JsonObject jsonObject) throws Exception {
      int var2 = Math.max(60000, O00000000(jsonObject, "iterations", 180000));
      byte[] var3 = Base64.getDecoder().decode(O00000000(jsonObject, "salt", ""));
      byte[] var4 = Base64.getDecoder().decode(O00000000(jsonObject, "iv", ""));
      byte[] var5 = Base64.getDecoder().decode(O00000000(jsonObject, "payload", ""));
      if (var3.length >= 12 && var4.length == 12 && var5.length >= 24) {
         byte[] var6 = O00000000(file, var5, var3, var4, var2);
         JsonElement var7 = JsonParser.parseString(new String(var6, StandardCharsets.UTF_8));
         return !var7.isJsonObject() ? null : var7.getAsJsonObject();
      } else {
         return null;
      }
   }

   private static List<O00000OO0OOO.W246> O00000000(JsonArray jsonArray) {
      ArrayList var1 = new ArrayList();

      for (JsonElement var3 : jsonArray) {
         if (var3.isJsonObject()) {
            JsonObject var4 = var3.getAsJsonObject();
            String var5 = O00000000(var4, "name", "");
            String var6 = O00000000(var4, "type", "CRACKED");
            String var7 = O00000000(var4, "password", "");
            String var8 = O00000000(var4, "id", "");
            long var9 = O00000000(var4, "createdAt", 0L);
            long var11 = O00000000(var4, "lastUsedAt", 0L);
            var1.add(new O00000OO0OOO.W246(var8, var5, var6, var7, var9, var11));
         }
      }

      return var1;
   }

   private static List<O00000OO0OOO.W246> O00000000(List<O00000OO0OOO.W246> list) {
      long var1 = System.currentTimeMillis();
      LinkedHashMap var3 = new LinkedHashMap();

      for (O00000OO0OOO.W246 var5 : list) {
         if (var3.size() >= 128) {
            break;
         }

         String var6 = O00000000(var5.name());
         if (!var6.isBlank()) {
            String var7 = var6.toLowerCase(Locale.ROOT);
            if (!var3.containsKey(var7)) {
               String var8 = O000000000(var5.type());
               String var9 = O0000000000(var5.password());
               String var10 = O00000000(var5.id(), var6, var8);
               long var11 = var5.createdAt() > 0L ? var5.createdAt() : var1;
               long var13 = Math.max(0L, Math.min(var5.lastUsedAt(), var1 + 86400000L));
               var3.put(var7, new O00000OO0OOO.W246(var10, var6, var8, var9, var11, var13));
            }
         }
      }

      return new ArrayList<>(var3.values());
   }

   private static String O00000000(List<O00000OO0OOO.W246> list, String string) {
      String var2 = string == null ? "" : string.trim();
      if (var2.isEmpty()) {
         return "";
      } else {
         for (O00000OO0OOO.W246 var4 : list) {
            if (var2.equals(var4.id())) {
               return var2;
            }
         }

         return "";
      }
   }

   private static byte[] O00000000(File file, byte[] bs, byte[] cs, byte[] ds) throws Exception {
      Cipher var4 = Cipher.getInstance("AES/GCM/NoPadding");
      var4.init(1, O00000000(file, cs, 180000), new GCMParameterSpec(128, ds));
      var4.updateAAD("wild-alt-vault".getBytes(StandardCharsets.UTF_8));
      return var4.doFinal(bs);
   }

   private static byte[] O00000000(File file, byte[] bs, byte[] cs, byte[] ds, int i) throws Exception {
      Cipher var5 = Cipher.getInstance("AES/GCM/NoPadding");
      var5.init(2, O00000000(file, cs, i), new GCMParameterSpec(128, ds));
      var5.updateAAD("wild-alt-vault".getBytes(StandardCharsets.UTF_8));
      return var5.doFinal(bs);
   }

   private static SecretKeySpec O00000000(File file, byte[] bs, int i) throws Exception {
      char[] var3 = O0000000000000(file).toCharArray();

      SecretKeySpec var6;
      try {
         SecretKeyFactory var4 = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
         PBEKeySpec var5 = new PBEKeySpec(var3, bs, i, 256);
         var6 = new SecretKeySpec(var4.generateSecret(var5).getEncoded(), "AES");
      } finally {
         Arrays.fill(var3, '\u0000');
      }

      return var6;
   }

   private static String O0000000000000(File file) {
      String var1 = file != null && file.getParentFile() != null ? file.getParentFile().getAbsolutePath() : "";
      return "wild-alt-vault\n"
         + O0000000000(System.getProperty("user.name"))
         + "\n"
         + O0000000000(System.getProperty("user.home"))
         + "\n"
         + O0000000000(System.getProperty("os.name"))
         + "\n"
         + O0000000000(System.getenv("COMPUTERNAME"))
         + "\n"
         + var1;
   }

   private static void O00000000(File file, byte[] bs) throws Exception {
      Path var2 = file.toPath();
      Path var3 = var2.getParent();
      if (var3 != null) {
         Files.createDirectories(var3);
      }

      Path var4 = var2.resolveSibling(var2.getFileName() + ".tmp");

      try (FileChannel var5 = FileChannel.open(var4, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE)) {
         ByteBuffer var6 = ByteBuffer.wrap(bs);

         while (var6.hasRemaining()) {
            var5.write(var6);
         }

         var5.force(true);
      }

      if (Files.exists(var2)) {
         Files.copy(var2, O000000000000O(file).toPath(), StandardCopyOption.REPLACE_EXISTING);
      }

      try {
         Files.move(var4, var2, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
      } catch (AtomicMoveNotSupportedException var9) {
         Files.move(var4, var2, StandardCopyOption.REPLACE_EXISTING);
      }

      O00000000(var3);
   }

   private static void O00000000(Path path) {
      if (path != null) {
         try (FileChannel var1 = FileChannel.open(path, StandardOpenOption.READ)) {
            var1.force(true);
         } catch (Throwable var6) {
         }
      }
   }

   private static byte[] O00000000(int i) {
      byte[] var1 = new byte[i];
      O0000000000000.nextBytes(var1);
      return var1;
   }

   private static File O000000000000O(File file) {
      return new File(file.getParentFile(), file.getName() + ".bak");
   }

   private static String O00000000(String string) {
      if (string == null) {
         return "";
      } else {
         String var1 = string.trim();
         int var2 = var1.indexOf(64);
         if (var2 > 0) {
            var1 = var1.substring(0, var2);
         }

         var1 = var1.replaceAll("[^A-Za-z0-9_]", "");
         if (var1.length() > 16) {
            var1 = var1.substring(0, 16);
         }

         return var1;
      }
   }

   private static String O000000000(String string) {
      String var1 = string == null ? "" : string.trim().toUpperCase(Locale.ROOT);
      return "PREMIUM".equals(var1) ? "PREMIUM" : "CRACKED";
   }

   private static String O00000000(String string, String string2, String string3) {
      String var3 = string == null ? "" : string.trim();
      return var3.length() >= 16 && var3.length() <= 64 && var3.matches("[A-Za-z0-9_\\-]+")
         ? var3
         : UUID.nameUUIDFromBytes(("wild-alt-vault:" + string3 + ":" + string2.toLowerCase(Locale.ROOT)).getBytes(StandardCharsets.UTF_8)).toString();
   }

   private static String O00000000(JsonObject jsonObject, String string, String string2) {
      try {
         JsonElement var3 = jsonObject.get(string);
         return var3 != null && !var3.isJsonNull() ? var3.getAsString() : string2;
      } catch (Throwable var4) {
         return string2;
      }
   }

   private static long O00000000(JsonObject jsonObject, String string, long l) {
      try {
         JsonElement var4 = jsonObject.get(string);
         return var4 != null && !var4.isJsonNull() ? var4.getAsLong() : l;
      } catch (Throwable var5) {
         return l;
      }
   }

   private static int O00000000(JsonObject jsonObject, String string, int i) {
      try {
         JsonElement var3 = jsonObject.get(string);
         return var3 != null && !var3.isJsonNull() ? var3.getAsInt() : i;
      } catch (Throwable var4) {
         return i;
      }
   }

   private static String O0000000000(String string) {
      return string == null ? "" : string;
   }

   record W246(String id, String name, String type, String password, long createdAt, long lastUsedAt) {
   }
}
