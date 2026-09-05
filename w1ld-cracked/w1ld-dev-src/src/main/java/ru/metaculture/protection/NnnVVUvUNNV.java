package ru.metaculture.protection;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.time.Duration;
import java.util.HexFormat;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_155;
import net.minecraft.class_156;
import org.json.JSONArray;
import org.json.JSONObject;

public final class NnnVVUvUNNV {
   private static final String UuUVuuUu = "WildClient/1.21.8 (main-menu protocol selector)";
   private static final String C00OOC00oO = "https://api.modrinth.com/v2/project/viafabricplus/version?loaders=%5B%22fabric%22%5D&game_versions=%5B%22";
   private static final Duration uUnuvNvvNU = Duration.ofSeconds(25L);
   private static final long vVvUvVVuuNvV = 67108864L;
   private static volatile NnnVVUvUNNV.NVnVnNnN uNNnnnuuuN = NnnVVUvUNNV.NVnVnNnN.IDLE;
   private static volatile String nuUnNvnuUu = "GPL-3.0 · загружается с Modrinth";
   private static volatile String VVuuUN;

   private NnnVVUvUNNV() {
   }

   public static NnnVVUvUNNV.NVnVnNnN UuUVuuUu() {
      return uNNnnnuuuN;
   }

   public static String C00OOC00oO() {
      return switch (uNNnnnuuuN) {
         case IDLE -> "Установить ViaFabricPlus";
         case WORKING -> "Загрузка…";
         case DONE -> "Готово · перезапустите клиент";
         case FAILED -> "Не удалось · открыть страницу";
      };
   }

   public static String uUnuvNvvNU() {
      return nuUnNvnuUu;
   }

   public static String vVvUvVVuuNvV() {
      return uNNnnnuuuN != NnnVVUvUNNV.NVnVnNnN.WORKING && uNNnnnuuuN != NnnVVUvUNNV.NVnVnNnN.FAILED ? null : nuUnNvnuUu;
   }

   public static void uNNnnnuuuN() {
      switch (uNNnnnuuuN) {
         case IDLE:
            vNUvnnVnUvu();
         case WORKING:
         case DONE:
         default:
            break;
         case FAILED:
            nuUnNvnuUu();
      }
   }

   public static void nuUnNvnuUu() {
      try {
         class_156.method_668().method_673(URI.create("https://modrinth.com/mod/viafabricplus"));
      } catch (Throwable var1) {
      }
   }

   private static synchronized void vNUvnnVnUvu() {
      if (uNNnnnuuuN != NnnVVUvUNNV.NVnVnNnN.WORKING) {
         uNNnnnuuuN = NnnVVUvUNNV.NVnVnNnN.WORKING;
         nuUnNvnuUu = "запрос к Modrinth";
         Thread var0 = new Thread(NnnVVUvUNNV::uVUuuVnNVU, "wild-viafabricplus-install");
         var0.setDaemon(true);
         var0.start();
      }
   }

   private static void uVUuuVnNVU() {
      try {
         Path var0 = FabricLoader.getInstance().getGameDir().resolve("mods");
         Files.createDirectories(var0);
         HttpClient var1 = HttpClient.newBuilder().connectTimeout(uUnuvNvvNU).followRedirects(Redirect.NORMAL).build();
         String var2 = class_155.method_16673().comp_4025();
         HttpRequest var3 = HttpRequest.newBuilder(
               URI.create("https://api.modrinth.com/v2/project/viafabricplus/version?loaders=%5B%22fabric%22%5D&game_versions=%5B%22" + var2 + "%22%5D")
            )
            .header("User-Agent", "WildClient/1.21.8 (main-menu protocol selector)")
            .timeout(uUnuvNvvNU)
            .GET()
            .build();
         HttpResponse var4 = var1.send(var3, BodyHandlers.ofString());
         if (var4.statusCode() != 200) {
            UuUVuuUu("Modrinth ответил " + var4.statusCode());
            return;
         }

         JSONArray var5 = new JSONArray((String)var4.body());
         if (var5.isEmpty()) {
            UuUVuuUu("нет сборки под " + var2);
            return;
         }

         JSONObject var6 = UuUVuuUu(var5.getJSONObject(0));
         if (var6 == null) {
            UuUVuuUu("в релизе нет основного файла");
            return;
         }

         long var7 = var6.optLong("size", 0L);
         if (var7 > 67108864L) {
            UuUVuuUu("файл слишком большой");
            return;
         }

         String var9 = var6.getJSONObject("hashes").optString("sha512", "");
         String var10 = var6.optString("filename", "viafabricplus.jar");
         nuUnNvnuUu = "загрузка " + Math.max(1L, var7 / 1024L / 1024L) + " МБ";
         HttpRequest var11 = HttpRequest.newBuilder(URI.create(var6.getString("url")))
            .header("User-Agent", "WildClient/1.21.8 (main-menu protocol selector)")
            .timeout(uUnuvNvvNU)
            .GET()
            .build();
         HttpResponse var12 = var1.send(var11, BodyHandlers.ofByteArray());
         if (var12.statusCode() != 200) {
            UuUVuuUu("загрузка вернула " + var12.statusCode());
            return;
         }

         byte[] var13 = (byte[])var12.body();
         if (var13.length == 0 || var13.length > 67108864L) {
            UuUVuuUu("пустой или слишком большой ответ");
            return;
         }

         if (!var9.isEmpty() && !var9.equalsIgnoreCase(UuUVuuUu(var13))) {
            UuUVuuUu("хэш не совпал");
            return;
         }

         Path var14 = Files.createTempFile("wild-vfp", ".part");
         Files.write(var14, var13);
         Files.move(var14, var0.resolve(var10), StandardCopyOption.REPLACE_EXISTING);
         VVuuUN = var10;
         nuUnNvnuUu = var10;
         uNNnnnuuuN = NnnVVUvUNNV.NVnVnNnN.DONE;
      } catch (Throwable var15) {
         UuUVuuUu(String.valueOf(var15.getClass().getSimpleName()));
      }
   }

   private static JSONObject UuUVuuUu(JSONObject var0) {
      JSONArray var1 = var0.optJSONArray("files");
      if (var1 != null && !var1.isEmpty()) {
         for (int var2 = 0; var2 < var1.length(); var2++) {
            JSONObject var3 = var1.getJSONObject(var2);
            if (var3.optBoolean("primary", false)) {
               return var3;
            }
         }

         return var1.getJSONObject(0);
      } else {
         return null;
      }
   }

   private static String UuUVuuUu(byte[] var0) throws Exception {
      MessageDigest var1 = MessageDigest.getInstance("SHA-512");
      return HexFormat.of().formatHex(var1.digest(var0));
   }

   private static void UuUVuuUu(String var0) {
      nuUnNvnuUu = var0;
      uNNnnnuuuN = NnnVVUvUNNV.NVnVnNnN.FAILED;
   }

   public static String VVuuUN() {
      return VVuuUN;
   }

   public static enum NVnVnNnN {
      IDLE,
      WORKING,
      DONE,
      FAILED;
   }
}
