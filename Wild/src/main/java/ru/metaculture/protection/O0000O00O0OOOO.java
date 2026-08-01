package ru.metaculture.protection;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;

public final class O0000O00O0OOOO {
   private O0000O00O0OOOO() {
   }

   public static void O00000000(int i, int j, int k, int l, int m) {
      int var5 = GL11.glGetInteger(35055);
      if (var5 != 0) {
         GL15.glBindBuffer(35052, 0);
      }

      try {
         GL11.glTexImage2D(3553, 0, i, j, k, 0, l, m, (ByteBuffer)null);
      } finally {
         if (var5 != 0) {
            GL15.glBindBuffer(35052, var5);
         }
      }
   }
}
