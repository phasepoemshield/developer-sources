package ru.metaculture.protection;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;

public final class o000OOoCO0OO {
   private o000OOoCO0OO() {
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void UuUVuuUu(int var0, int var1, int var2, int var3, int var4) {
      int var5 = GL11.glGetInteger(35055);
      if (var5 != 0) {
         GL15.glBindBuffer(35052, 0);
      }

      boolean var8 = false /* VF: Semaphore variable */;

      try {
         var8 = true;
         GL11.glTexImage2D(3553, 0, var0, var1, var2, 0, var3, var4, (ByteBuffer)null);
         var8 = false;
      } finally {
         if (var8) {
            if (var5 != 0) {
               GL15.glBindBuffer(35052, var5);
            }
         }
      }

      if (var5 != 0) {
         GL15.glBindBuffer(35052, var5);
      }
   }
}
