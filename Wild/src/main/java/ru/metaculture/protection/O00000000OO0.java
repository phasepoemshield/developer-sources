package ru.metaculture.protection;

import java.io.DataOutputStream;
import java.io.IOException;
import org.lwjgl.opengl.GL11;

public final class O00000000OO0 {
   private O00000000OO0() {
   }

   public static int O00000000() {
      try {
         return GL11.glGetInteger(35725);
      } catch (Throwable var1) {
         return -1;
      }
   }

   public static int O000000000() {
      try {
         return GL11.glGetInteger(34016);
      } catch (Throwable var1) {
         return -1;
      }
   }

   public static int O0000000000() {
      try {
         return GL11.glGetInteger(32873);
      } catch (Throwable var1) {
         return -1;
      }
   }

   public static int O00000000000() {
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

   static void O00000000(O00000000OO o00000000OO) {
      if (o00000000OO != null) {
         o00000000OO.O00000000(O00000000());
         o00000000OO.O00000000(O000000000());
         o00000000OO.O00000000(O0000000000());
      }
   }

   static void O00000000(DataOutputStream dataOutputStream) throws IOException {
      dataOutputStream.writeInt(O00000000());
      dataOutputStream.writeInt(O000000000());
      dataOutputStream.writeInt(O0000000000());
      dataOutputStream.writeInt(O00000000000());
   }

   public static String O00000000(int i) {
      return switch (i) {
         case 0 -> "GL_NO_ERROR";
         case 1280 -> "GL_INVALID_ENUM";
         case 1281 -> "GL_INVALID_VALUE";
         case 1282 -> "GL_INVALID_OPERATION";
         case 1285 -> "GL_OUT_OF_MEMORY";
         default -> "0x" + Integer.toHexString(i);
      };
   }
}
