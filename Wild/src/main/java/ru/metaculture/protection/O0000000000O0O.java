package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HexFormat;
import java.util.List;
import java.util.UUID;

public final class O0000000000O0O {
   private static final Gson O00000000 = new Gson();
   private static volatile boolean O000000000;

   private O0000000000O0O() {
   }

   public static O0000000000O00 O00000000() {
      O000000000 = false;
      O0000000000O00 var0 = null;
      boolean var1 = false;
      boolean var2 = false;

      for (Path var4 : O0000000000()) {
         if (Files.exists(var4)) {
            var1 = true;

            try {
               String var5 = Files.readString(var4, StandardCharsets.UTF_8);
               O0000000000O0O.W5 var6 = O00000000(var5);
               if (var6 != null && var6.state != null) {
                  O0000000000O00 var7 = O00000000(var6.state, var6.legacy);
                  if (var0 == null || O000000000(var7) > O000000000(var0)) {
                     var0 = var7;
                  }
               } else {
                  var2 = true;
               }
            } catch (Throwable var8) {
               var2 = true;
            }
         }
      }

      if (var0 == null) {
         O000000000 = var1 && var2;
         var0 = O0000000000O00.O00000000();
         O00000000(var0);
      } else {
         O00000000(var0);
      }

      return O00000000(var0, false);
   }

   public static void O00000000(O0000000000O00 o0000000000O00) {
      O00000000(o0000000000O00, false);
      String var1 = O0000000000(o0000000000O00);

      for (Path var3 : O00000000000()) {
         try {
            Files.createDirectories(var3.getParent());
            Path var4 = var3.resolveSibling(
               var3.getFileName() + "." + ProcessHandle.current().pid() + "." + Thread.currentThread().getId() + "." + System.nanoTime() + ".tmp"
            );
            Files.writeString(var4, var1, StandardCharsets.UTF_8);

            try {
               Files.move(var4, var3, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
            } catch (IOException var6) {
               Files.move(var4, var3, StandardCopyOption.REPLACE_EXISTING);
            }
         } catch (IOException var7) {
         }
      }
   }

   public static boolean O000000000() {
      return O000000000;
   }

   private static long O000000000(O0000000000O00 o0000000000O00) {
      long var1 = o0000000000O00.O00000000000 ? Math.max(o0000000000O00.O000000000000, 1L) : 0L;
      return Math.max(o0000000000O00.O0000000000, var1);
   }

   private static String O0000000000(O0000000000O00 o0000000000O00) {
      String var1 = O00000000.toJson(o0000000000O00);
      String var2 = Base64.getUrlEncoder().withoutPadding().encodeToString(var1.getBytes(StandardCharsets.UTF_8));
      String var3 = O000000000(var2 + "|" + O000000000000() + "|" + O00000000(2));
      JsonObject var4 = new JsonObject();
      var4.addProperty("v", 2);
      var4.addProperty("data", var2);
      var4.addProperty("sum", var3);
      return O00000000.toJson(var4);
   }

   private static O0000000000O0O.W5 O00000000(String string) {
      JsonObject var1 = JsonParser.parseString(string).getAsJsonObject();
      String var2 = var1.get("data").getAsString();
      String var3 = var1.get("sum").getAsString();
      byte[] var4 = Base64.getUrlDecoder().decode(var2);
      O0000000000O00 var5 = (O0000000000O00)O00000000.fromJson(new String(var4, StandardCharsets.UTF_8), O0000000000O00.class);
      String var6 = O000000000(var2 + "|" + O000000000000() + "|" + O00000000(2));
      if (O00000000(var3, var6)) {
         return new O0000000000O0O.W5(var5, false);
      } else {
         String var7 = O000000000(var2 + "|" + O0000000000000() + "|" + O00000000(2));
         if (O00000000(var3, var7)) {
            return new O0000000000O0O.W5(var5, false);
         } else {
            String var8 = O000000000(var2 + "|" + O000000000000O() + "|" + O00000000(2));
            if (O00000000(var3, var8)) {
               return new O0000000000O0O.W5(var5, false);
            } else {
               String var9 = var5 == null ? "" : String.valueOf(var5.O000000000);
               if (!var9.isBlank()) {
                  String var10 = O000000000(var2 + "|" + var9 + "|" + O00000000(1));
                  if (O00000000(var3, var10)) {
                     return new O0000000000O0O.W5(var5, true);
                  }
               }

               return null;
            }
         }
      }
   }

   private static List<Path> O0000000000() {
      ArrayList var0 = new ArrayList();
      var0.addAll(O00000000000());
      String var1 = System.getenv("APPDATA");
      String var2 = System.getenv("LOCALAPPDATA");
      String var3 = System.getProperty("user.home", ".");
      if (var1 != null && !var1.isBlank()) {
         var0.add(Path.of(var1, "WildClient", "state.dat"));
      }

      if (var2 != null && !var2.isBlank()) {
         var0.add(Path.of(var2, "WildClient", "cache.dat"));
      }

      var0.add(Path.of(var3, ".wildclient", "state.dat"));
      var0.add(Path.of(var3, ".minecraft", "wildclient", "state.dat"));
      return var0;
   }

   private static List<Path> O00000000000() {
      return List.of(WildClient.O000000000().toPath().resolve("auth").resolve("state.dat"));
   }

   private static String O000000000(String string) {
      try {
         MessageDigest var1 = MessageDigest.getInstance("SHA-256");
         return HexFormat.of().formatHex(var1.digest(string.getBytes(StandardCharsets.UTF_8)));
      } catch (Throwable var2) {
         throw new IllegalStateException(var2);
      }
   }

   private static boolean O00000000(String string, String string2) {
      if (string != null && string2 != null) {
         byte[] var2 = string.getBytes(StandardCharsets.UTF_8);
         byte[] var3 = string2.getBytes(StandardCharsets.UTF_8);
         if (var2.length != var3.length) {
            return false;
         } else {
            int var4 = 0;

            for (int var5 = 0; var5 < var2.length; var5++) {
               var4 |= var2[var5] ^ var3[var5];
            }

            return var4 == 0;
         }
      } else {
         return false;
      }
   }

   private static O0000000000O00 O00000000(O0000000000O00 o0000000000O00, boolean bl) {
      if (o0000000000O00 == null) {
         o0000000000O00 = O0000000000O00.O00000000();
      }

      if (o0000000000O00.O00000000 == null || o0000000000O00.O00000000.isBlank()) {
         o0000000000O00.O00000000 = UUID.randomUUID().toString();
      }

      String var2 = o0000000000O00.O000000000 == null ? "" : o0000000000O00.O000000000;
      if (!var2.isBlank() && !var2.equals("wild-1.21.8-1783538716222")) {
         o0000000000O00.O00000000000 = false;
         o0000000000O00.O000000000000 = 0L;
         o0000000000O00.O0000000000000 = 0;
         o0000000000O00.O000000000000O = 0;
         o0000000000O00.O00000000000O = "";
      }

      if (bl && !var2.isBlank() && !var2.equals("wild-1.21.8-1783538716222") && O00000000(o0000000000O00, "E4", var2)) {
         o0000000000O00.O00000000000 = false;
         o0000000000O00.O000000000000 = 0L;
         o0000000000O00.O0000000000000 = 0;
         o0000000000O00.O000000000000O = 0;
         o0000000000O00.O00000000000O = "";
      }

      o0000000000O00.O000000000 = "wild-1.21.8-1783538716222";
      o0000000000O00.O0000000000 = Math.max(0L, o0000000000O00.O0000000000);
      o0000000000O00.O000000000000 = Math.max(0L, o0000000000O00.O000000000000);
      o0000000000O00.O0000000000000 = Math.max(0, o0000000000O00.O0000000000000);
      o0000000000O00.O000000000000O = Math.max(0, o0000000000O00.O000000000000O);
      if (o0000000000O00.O00000000000O == null) {
         o0000000000O00.O00000000000O = "";
      }

      return o0000000000O00;
   }

   private static boolean O00000000(O0000000000O00 o0000000000O00, String string, String string2) {
      String var3 = O000000000(string2 + "|" + string + "|wild-fuse-v1");
      return O00000000(String.valueOf(o0000000000O00.O00000000000O), var3);
   }

   private static String O000000000000() {
      return O000000000("wild|state|seal|2");
   }

   private static String O0000000000000() {
      String var0 = "-----BEGIN PUBLIC KEY-----\nMCowBQYDK2VwAyEAgqu9hOrz4JQKl2izQlnpj+d8jkT988LVfYfXPvKyt2Y=\n-----END PUBLIC KEY-----\n"
         .replace("-----BEGIN PUBLIC KEY-----", "")
         .replace("-----END PUBLIC KEY-----", "")
         .replaceAll("\\s+", "");
      return O000000000(var0 + "|state|2");
   }

   private static String O000000000000O() {
      String var0 = "-----BEGIN PUBLIC KEY-----\nMCowBQYDK2VwAyEAgqu9hOrz4JQKl2izQlnpj+d8jkT988LVfYfXPvKyt2Y=\n-----END PUBLIC KEY-----\n"
         .replace("-----BEGIN PUBLIC KEY-----", "")
         .replace("-----END PUBLIC KEY-----", "")
         .replaceAll("\\s+", "");
      return O000000000(var0 + "|state|1.21.8");
   }

   private static String O00000000(int i) {
      return "wild-state-v" + i;
   }

   record W5(O0000000000O00 state, boolean legacy) {
   }
}
