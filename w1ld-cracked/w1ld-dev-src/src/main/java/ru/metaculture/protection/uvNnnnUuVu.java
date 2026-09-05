package ru.metaculture.protection;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import lombok.Generated;

public final class uvNnnnUuVu {
   private static String UuUVuuUu = "";
   private static String C00OOC00oO = "";

   public static void UuUVuuUu(String var0, String var1) {
      UuUVuuUu = var0;
      C00OOC00oO = var1;
   }

   public static boolean UuUVuuUu() {
      return UuUVuuUu != null && !UuUVuuUu.isEmpty() && C00OOC00oO != null && !C00OOC00oO.isEmpty();
   }

   public static void UuUVuuUu(String var0) {
      if (!UuUVuuUu()) {
         System.out.println("[TelegramApi] Not configured");
      } else {
         try {
            String var1 = "https://api.telegram.org/bot" + UuUVuuUu + "/sendMessage";
            String var2 = "chat_id=" + C00OOC00oO + "&text=" + URLEncoder.encode(var0, StandardCharsets.UTF_8);
            URL var3 = new URL(var1);
            HttpURLConnection var4 = (HttpURLConnection)var3.openConnection();
            var4.setRequestMethod("POST");
            var4.setDoOutput(true);
            var4.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
            var4.setConnectTimeout(6000);
            var4.setReadTimeout(8000);

            try (OutputStream var5 = var4.getOutputStream()) {
               var5.write(var2.getBytes(StandardCharsets.UTF_8));
            }

            var4.getInputStream().close();
         } catch (Exception var10) {
            var10.printStackTrace();
         }
      }
   }

   @Generated
   private uvNnnnUuVu() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
