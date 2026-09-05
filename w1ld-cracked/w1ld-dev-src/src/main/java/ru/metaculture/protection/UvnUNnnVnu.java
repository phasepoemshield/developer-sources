package ru.metaculture.protection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import org.lwjgl.BufferUtils;

public final class UvnUNnnVnu {
   private UvnUNnnVnu() {
   }

   public static String UuUVuuUu(String var0) {
      ClassLoader var1 = UvnUNnnVnu.class.getClassLoader();
      String var2 = uUnuvNvvNU(var0);

      try {
         String var7;
         try (InputStream var3 = var1.getResourceAsStream(var2)) {
            if (var3 == null) {
               throw new IllegalStateException("Resource not found: " + var0);
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
         throw new RuntimeException("Failed to read resource: " + var0, var12);
      }
   }

   public static ByteBuffer C00OOC00oO(String var0) {
      ClassLoader var1 = UvnUNnnVnu.class.getClassLoader();
      String var2 = uUnuvNvvNU(var0);

      try {
         ByteBuffer var6;
         try (InputStream var3 = var1.getResourceAsStream(var2)) {
            if (var3 == null) {
               throw new IllegalStateException("Resource not found: " + var0);
            }

            byte[] var4 = var3.readAllBytes();
            ByteBuffer var5 = BufferUtils.createByteBuffer(var4.length);
            var5.put(var4).flip();
            var6 = var5;
         }

         return var6;
      } catch (IOException var9) {
         throw new RuntimeException("Failed to read resource: " + var0, var9);
      }
   }

   private static String uUnuvNvvNU(String var0) {
      if (var0 == null) {
         throw new IllegalArgumentException("path");
      } else {
         return var0.startsWith("/") ? var0.substring(1) : var0;
      }
   }
}
