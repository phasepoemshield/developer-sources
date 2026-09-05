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

public final class vvnuuvnUNvN {
   private static final Gson UuUVuuUu = new Gson();
   private static volatile boolean C00OOC00oO;

   private vvnuuvnUNvN() {
   }

   public static uuVnUuun UuUVuuUu() {
      C00OOC00oO = false;
      uuVnUuun var0 = null;
      boolean var1 = false;
      boolean var2 = false;

      for (Path var4 : uUnuvNvvNU()) {
         if (Files.exists(var4)) {
            var1 = true;

            try {
               String var5 = Files.readString(var4, StandardCharsets.UTF_8);
               vvnuuvnUNvN.NVnVnNnN var6 = UuUVuuUu(var5);
               if (var6 != null && var6.state != null) {
                  uuVnUuun var7 = UuUVuuUu(var6.state, var6.legacy);
                  if (var0 == null || C00OOC00oO(var7) > C00OOC00oO(var0)) {
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
         C00OOC00oO = var1 && var2;
         var0 = uuVnUuun.UuUVuuUu();
         UuUVuuUu(var0);
      } else {
         UuUVuuUu(var0);
      }

      return UuUVuuUu(var0, false);
   }

   public static void UuUVuuUu(uuVnUuun var0) {
      UuUVuuUu(var0, false);
      String var1 = uUnuvNvvNU(var0);

      for (Path var3 : vVvUvVVuuNvV()) {
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

   public static boolean C00OOC00oO() {
      return C00OOC00oO;
   }

   private static long C00OOC00oO(uuVnUuun var0) {
      long var1 = var0.vVvUvVVuuNvV ? Math.max(var0.uNNnnnuuuN, 1L) : 0L;
      return Math.max(var0.uUnuvNvvNU, var1);
   }

   private static String uUnuvNvvNU(uuVnUuun var0) {
      String var1 = UuUVuuUu.toJson(var0);
      String var2 = Base64.getUrlEncoder().withoutPadding().encodeToString(var1.getBytes(StandardCharsets.UTF_8));
      String var3 = C00OOC00oO(var2 + "|" + uNNnnnuuuN() + "|" + UuUVuuUu(2));
      JsonObject var4 = new JsonObject();
      var4.addProperty("v", 2);
      var4.addProperty("data", var2);
      var4.addProperty("sum", var3);
      return UuUVuuUu.toJson(var4);
   }

   private static vvnuuvnUNvN.NVnVnNnN UuUVuuUu(String var0) {
      JsonObject var1 = JsonParser.parseString(var0).getAsJsonObject();
      String var2 = var1.get("data").getAsString();
      String var3 = var1.get("sum").getAsString();
      byte[] var4 = Base64.getUrlDecoder().decode(var2);
      uuVnUuun var5 = (uuVnUuun)UuUVuuUu.fromJson(new String(var4, StandardCharsets.UTF_8), uuVnUuun.class);
      String var6 = C00OOC00oO(var2 + "|" + uNNnnnuuuN() + "|" + UuUVuuUu(2));
      if (UuUVuuUu(var3, var6)) {
         return new vvnuuvnUNvN.NVnVnNnN(var5, false);
      } else {
         String var7 = C00OOC00oO(var2 + "|" + nuUnNvnuUu() + "|" + UuUVuuUu(2));
         if (UuUVuuUu(var3, var7)) {
            return new vvnuuvnUNvN.NVnVnNnN(var5, false);
         } else {
            String var8 = C00OOC00oO(var2 + "|" + VVuuUN() + "|" + UuUVuuUu(2));
            if (UuUVuuUu(var3, var8)) {
               return new vvnuuvnUNvN.NVnVnNnN(var5, false);
            } else {
               String var9 = var5 == null ? "" : String.valueOf(var5.C00OOC00oO);
               if (!var9.isBlank()) {
                  String var10 = C00OOC00oO(var2 + "|" + var9 + "|" + UuUVuuUu(1));
                  if (UuUVuuUu(var3, var10)) {
                     return new vvnuuvnUNvN.NVnVnNnN(var5, true);
                  }
               }

               return null;
            }
         }
      }
   }

   private static List<Path> uUnuvNvvNU() {
      ArrayList var0 = new ArrayList();
      var0.addAll(vVvUvVVuuNvV());
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

   private static List<Path> vVvUvVVuuNvV() {
      return List.of(ru.metaculture.protection.NVnVnNnN.C00OOC00oO().toPath().resolve("auth").resolve("state.dat"));
   }

   private static String C00OOC00oO(String var0) {
      try {
         MessageDigest var1 = MessageDigest.getInstance("SHA-256");
         return HexFormat.of().formatHex(var1.digest(var0.getBytes(StandardCharsets.UTF_8)));
      } catch (Throwable var2) {
         throw new IllegalStateException(var2);
      }
   }

   private static boolean UuUVuuUu(String var0, String var1) {
      if (var0 != null && var1 != null) {
         byte[] var2 = var0.getBytes(StandardCharsets.UTF_8);
         byte[] var3 = var1.getBytes(StandardCharsets.UTF_8);
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

   private static uuVnUuun UuUVuuUu(uuVnUuun var0, boolean var1) {
      if (var0 == null) {
         var0 = uuVnUuun.UuUVuuUu();
      }

      if (var0.UuUVuuUu == null || var0.UuUVuuUu.isBlank()) {
         var0.UuUVuuUu = UUID.randomUUID().toString();
      }

      String var2 = var0.C00OOC00oO == null ? "" : var0.C00OOC00oO;
      if (!var2.isBlank() && !var2.equals("wild-1.21.8-1787661348375")) {
         var0.vVvUvVVuuNvV = false;
         var0.uNNnnnuuuN = 0L;
         var0.nuUnNvnuUu = 0;
         var0.VVuuUN = 0;
         var0.vNUvnnVnUvu = "";
      }

      if (var1 && !var2.isBlank() && !var2.equals("wild-1.21.8-1787661348375") && UuUVuuUu(var0, "E4", var2)) {
         var0.vVvUvVVuuNvV = false;
         var0.uNNnnnuuuN = 0L;
         var0.nuUnNvnuUu = 0;
         var0.VVuuUN = 0;
         var0.vNUvnnVnUvu = "";
      }

      var0.C00OOC00oO = "wild-1.21.8-1787661348375";
      var0.uUnuvNvvNU = Math.max(0L, var0.uUnuvNvvNU);
      var0.uNNnnnuuuN = Math.max(0L, var0.uNNnnnuuuN);
      var0.nuUnNvnuUu = Math.max(0, var0.nuUnNvnuUu);
      var0.VVuuUN = Math.max(0, var0.VVuuUN);
      if (var0.vNUvnnVnUvu == null) {
         var0.vNUvnnVnUvu = "";
      }

      return var0;
   }

   private static boolean UuUVuuUu(uuVnUuun var0, String var1, String var2) {
      String var3 = C00OOC00oO(var2 + "|" + var1 + "|wild-fuse-v1");
      return UuUVuuUu(String.valueOf(var0.vNUvnnVnUvu), var3);
   }

   private static String uNNnnnuuuN() {
      return C00OOC00oO("wild|state|seal|2");
   }

   private static String nuUnNvnuUu() {
      String var0 = "-----BEGIN PUBLIC KEY-----\nMCowBQYDK2VwAyEAgqu9hOrz4JQKl2izQlnpj+d8jkT988LVfYfXPvKyt2Y=\n-----END PUBLIC KEY-----\n"
         .replace("-----BEGIN PUBLIC KEY-----", "")
         .replace("-----END PUBLIC KEY-----", "")
         .replaceAll("\\s+", "");
      return C00OOC00oO(var0 + "|state|2");
   }

   private static String VVuuUN() {
      String var0 = "-----BEGIN PUBLIC KEY-----\nMCowBQYDK2VwAyEAgqu9hOrz4JQKl2izQlnpj+d8jkT988LVfYfXPvKyt2Y=\n-----END PUBLIC KEY-----\n"
         .replace("-----BEGIN PUBLIC KEY-----", "")
         .replace("-----END PUBLIC KEY-----", "")
         .replaceAll("\\s+", "");
      return C00OOC00oO(var0 + "|state|1.21.8");
   }

   private static String UuUVuuUu(int var0) {
      return "wild-state-v" + var0;
   }

   record NVnVnNnN(uuVnUuun state, boolean legacy) {
   }
}
