package ru.metaculture.protection;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public final class O0000000000O0 {
   private static final long O00000000 = Long.getLong("wild.license.cacheTtlMs", 30000L) * 1000000L;
   private static volatile O0000000000O0.W4 O000000000;

   private O0000000000O0() {
   }

   public static boolean O00000000() {
      return true;
   }

   public static boolean O000000000() {
      return true;
   }

   private static O0000000000O0.W4 O00000000(long l, long m) {
      long var4 = 0L;

      Path var6;
      try {
         var6 = O0000000000();
      } catch (Throwable var15) {
         return new O0000000000O0.W4(false, var4, l, true);
      }

      if (var6 != null && Files.exists(var6)) {
         try {
            JsonObject var7 = O00000000(var6);
            String var8 = var7.get("payload").getAsString();
            String var9 = var7.get("signature").getAsString();
            byte[] var10 = Base64.getUrlDecoder().decode(var8);
            byte[] var11 = Base64.getUrlDecoder().decode(var9);
            if (!O00000000(var10, var11, O00000000000())) {
               return new O0000000000O0.W4(false, var4, l, false);
            } else {
               JsonObject var12 = JsonParser.parseString(new String(var10, StandardCharsets.UTF_8)).getAsJsonObject();
               var4 = var12.has("validUntil") ? var12.get("validUntil").getAsLong() : 0L;
               if (var4 <= m) {
                  return new O0000000000O0.W4(false, var4, l, false);
               } else {
                  String var13 = var12.has("hwidHash") ? var12.get("hwidHash").getAsString() : "";
                  if (var13.isBlank()) {
                     return new O0000000000O0.W4(false, var4, l, false);
                  } else {
                     return !O00000000000O0.O00000000(var13) ? new O0000000000O0.W4(false, var4, l, false) : new O0000000000O0.W4(true, var4, l, false);
                  }
               }
            }
         } catch (Throwable var14) {
            return new O0000000000O0.W4(false, var4, l, false);
         }
      } else {
         return new O0000000000O0.W4(false, var4, l, true);
      }
   }

   private static JsonObject O00000000(Path path) throws Exception {
      String var1 = Files.readString(path, StandardCharsets.UTF_8);
      return JsonParser.parseString(var1).getAsJsonObject();
   }

   private static Path O0000000000() {
      String var0 = System.getProperty("wild.license.path");
      if (var0 != null && !var0.isBlank()) {
         return Path.of(var0);
      } else {
         String var1 = System.getenv("WILD_LICENSE_PATH");
         if (var1 != null && !var1.isBlank()) {
            return Path.of(var1);
         } else {
            String var2 = System.getenv("APPDATA");
            if (var2 != null && !var2.isBlank()) {
               Path var3 = Path.of(var2, "WildClient", "license.json");
               if (Files.exists(var3)) {
                  return var3;
               }
            }

            return Path.of(System.getProperty("user.home", "."), ".wildclient", "license.json");
         }
      }
   }

   private static PublicKey O00000000000() throws Exception {
      String var0 = "-----BEGIN PUBLIC KEY-----\nMCowBQYDK2VwAyEAgqu9hOrz4JQKl2izQlnpj+d8jkT988LVfYfXPvKyt2Y=\n-----END PUBLIC KEY-----\n"
         .replace("-----BEGIN PUBLIC KEY-----", "")
         .replace("-----END PUBLIC KEY-----", "")
         .replaceAll("\\s+", "");
      byte[] var1 = Base64.getDecoder().decode(var0);
      return KeyFactory.getInstance("Ed25519").generatePublic(new X509EncodedKeySpec(var1));
   }

   private static boolean O00000000(byte[] bs, byte[] cs, PublicKey publicKey) throws Exception {
      Signature var3 = Signature.getInstance("Ed25519");
      var3.initVerify(publicKey);
      var3.update(bs);
      return var3.verify(cs);
   }

   record W4(boolean valid, long validUntil, long checkedAtNano, boolean fileMissing) {
   }
}
