package ru.metaculture.protection;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import lombok.Generated;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public final class O0000000OO0O00 {
   private static String O00000000 = "";
   private static String O000000000 = "";

   @Compile
   public static void O00000000(String string, String string2) {}

   public static boolean O00000000() {
      return O00000000 != null && !O00000000.isEmpty() && O000000000 != null && !O000000000.isEmpty();
   }

   public static void O00000000(String string) {
      if (!O00000000()) {
         System.out.println("[TelegramApi] Not configured");
      } else {
         try {
            String var1 = "https://api.telegram.org/bot" + O00000000 + "/sendMessage";
            String var2 = "chat_id=" + O000000000 + "&text=" + URLEncoder.encode(string, StandardCharsets.UTF_8);
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
   private O0000000OO0O00() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      Loader.initialize();
   }
}
