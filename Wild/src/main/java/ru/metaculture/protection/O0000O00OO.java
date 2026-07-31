package ru.metaculture.protection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import org.lwjgl.BufferUtils;

public final class O0000O00OO {
   private O0000O00OO() {
   }

   public static String O00000000(String string) {
      ClassLoader var1 = O0000O00OO.class.getClassLoader();
      String var2 = O0000000000(string);

      try {
         String var7;
         try (InputStream var3 = var1.getResourceAsStream(var2)) {
            if (var3 == null) {
               throw new IllegalStateException("Resource not found: " + string);
            }

            try (BufferedReader var4 = new BufferedReader(new InputStreamReader(var3, StandardCharsets.UTF_8))) {
               StringBuilder var5 = new StringBuilder();

               String var6;
               while ((var6 = var4.readLine()) != null) {
                  var5.append(var6).append('\n');
               }

               var7 = var5.toString();
            }
         }

         return var7;
      } catch (IOException var12) {
         throw new RuntimeException("Failed to read resource: " + string, var12);
      }
   }

   public static ByteBuffer O000000000(String string) {
      ClassLoader var1 = O0000O00OO.class.getClassLoader();
      String var2 = O0000000000(string);

      try {
         ByteBuffer var6;
         try (InputStream var3 = var1.getResourceAsStream(var2)) {
            if (var3 == null) {
               throw new IllegalStateException("Resource not found: " + string);
            }

            byte[] var4 = var3.readAllBytes();
            ByteBuffer var5 = BufferUtils.createByteBuffer(var4.length);
            var5.put(var4).flip();
            var6 = var5;
         }

         return var6;
      } catch (IOException var9) {
         throw new RuntimeException("Failed to read resource: " + string, var9);
      }
   }

   private static String O0000000000(String string) {
      if (string == null) {
         throw new IllegalArgumentException("path");
      } else {
         return string.startsWith("/") ? string.substring(1) : string;
      }
   }
}
