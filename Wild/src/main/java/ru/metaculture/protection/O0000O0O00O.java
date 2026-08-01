package ru.metaculture.protection;

import java.util.Arrays;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;

final class O0000O0O00O implements AutoCloseable {
   private final int O00000000;
   private final int O000000000;
   private final int[] O0000000000;
   private final int[] O00000000000;
   private boolean O000000000000;

   private O0000O0O00O(int i, int j, int[] is, int[] js) {
      this.O00000000 = i;
      this.O000000000 = j;
      this.O0000000000 = is;
      this.O00000000000 = js;
   }

   static O0000O0O00O O00000000(int i, int... is) {
      int var2 = Math.max(0, GL11.glGetInteger(34016) - 33984);
      int[] var3 = O00000000(is);
      int[] var4 = new int[var3.length];
      if (var3.length > 0) {
         GL13.glActiveTexture(33984 + i);

         for (int var5 = 0; var5 < var3.length; var5++) {
            var4[var5] = GL11.glGetInteger(O00000000(var3[var5]));
         }

         GL13.glActiveTexture(33984 + var2);
      }

      return new O0000O0O00O(i, var2, var3, var4);
   }

   @Override
   public void close() {
      if (!this.O000000000000) {
         this.O000000000000 = true;
         if (this.O0000000000.length > 0) {
            GL13.glActiveTexture(33984 + this.O00000000);

            for (int var1 = 0; var1 < this.O0000000000.length; var1++) {
               GL11.glBindTexture(this.O0000000000[var1], this.O00000000000[var1]);
            }
         }

         GL13.glActiveTexture(33984 + this.O000000000);
      }
   }

   private static int[] O00000000(int[] is) {
      if (is != null && is.length != 0) {
         int[] var1 = Arrays.copyOf(is, is.length);
         int var2 = 0;

         for (int var6 : var1) {
            if (var6 > 0) {
               boolean var7 = false;

               for (int var8 = 0; var8 < var2; var8++) {
                  if (var1[var8] == var6) {
                     var7 = true;
                     break;
                  }
               }

               if (!var7) {
                  var1[var2++] = var6;
               }
            }
         }

         return Arrays.copyOf(var1, var2);
      } else {
         return new int[0];
      }
   }

   private static int O00000000(int i) {
      switch (i) {
         case 3552:
            return 32872;
         case 3553:
            return 32873;
         case 32879:
            return 32874;
         case 34037:
            return 34038;
         case 34067:
            return 34068;
         case 35864:
            return 35868;
         case 35866:
            return 35869;
         case 35882:
            return 35884;
         case 36873:
            return 36874;
         default:
            return 32873;
      }
   }
}
