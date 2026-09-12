package Nursultan;

import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL33;

public non-sealed class class11170 implements class12004 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;

   public class11170(int var1) {
      this.N();
      this.N_0 = var1;
   }

   private static int y(FloatBuffer var0) {
      int var1 = 1;
      int var2 = var0.limit();

      for (int var3 = 0; var3 < var2; var3++) {
         var1 = 31 * var1 + Float.floatToIntBits(var0.get(var3));
      }

      return var1;
   }

   public void N(FloatBuffer var1) {
      int var2 = y(var1);
      if (!(Boolean)this.N_2 || var2 != (Integer)this.N_1) {
         this.N_1 = var2;
         this.N_2 = true;
         var1.position(0);
         GL33.glUniform1fv((Integer)this.N_0, var1);
      }
   }

   private void N() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
         this.N_1 = 0;
         this.N_2 = false;
      }
   }
}
