package ru.metaculture.protection;

import java.io.DataOutputStream;
import java.io.IOException;
import org.lwjgl.opengl.GL11;

public final class UVUuvNVUuVvN {
   private UVUuvNVUuVvN() {
   }

   public static int UuUVuuUu() {
      try {
         return GL11.glGetInteger(35725);
      } catch (Throwable var1) {
         return -1;
      }
   }

   public static int C00OOC00oO() {
      try {
         return GL11.glGetInteger(34016);
      } catch (Throwable var1) {
         return -1;
      }
   }

   public static int uUnuvNvvNU() {
      try {
         return GL11.glGetInteger(32873);
      } catch (Throwable var1) {
         return -1;
      }
   }

   public static int vVvUvVVuuNvV() {
      try {
         for (int var0 = 0; var0 < 4; var0++) {
            int var1 = GL11.glGetError();
            if (var1 != 0) {
               return var1;
            }
         }

         return 0;
      } catch (Throwable var2) {
         return -1;
      }
   }

   static void UuUVuuUu(unVnUnVv var0) {
      if (var0 != null) {
         var0.UuUVuuUu(UuUVuuUu());
         var0.UuUVuuUu(C00OOC00oO());
         var0.UuUVuuUu(uUnuvNvvNU());
      }
   }

   static void UuUVuuUu(DataOutputStream var0) throws IOException {
      var0.writeInt(UuUVuuUu());
      var0.writeInt(C00OOC00oO());
      var0.writeInt(uUnuvNvvNU());
      var0.writeInt(vVvUvVVuuNvV());
   }

   public static String UuUVuuUu(int var0) {
      return switch (var0) {
         case 0 -> "GL_NO_ERROR";
         case 1280 -> "GL_INVALID_ENUM";
         case 1281 -> "GL_INVALID_VALUE";
         case 1282 -> "GL_INVALID_OPERATION";
         case 1285 -> "GL_OUT_OF_MEMORY";
         default -> "0x" + Integer.toHexString(var0);
      };
   }
}
