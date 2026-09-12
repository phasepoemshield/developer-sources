package Nursultan;

import org.lwjgl.opengl.GL33;

public record class09087(class09069... attrs) {

   public int L() {
      int var1 = 0;

      for (class09069 var5 : this.attrs) {
         var1 += var5.N();
      }

      return var1;
   }

   public void y() {
      int var1 = this.L();
      int var2 = 0;

      for (int var3 = 0; var3 < this.attrs.length; var3++) {
         class09069 var4 = this.attrs[var3];
         GL33.glEnableVertexAttribArray(var3);
         if (var4.i() != 5124 && var4.i() != 5125) {
            GL33.glVertexAttribPointer(var3, var4.u(), var4.i(), var4.L(), var1, (long)var2);
         } else {
            GL33.glVertexAttribIPointer(var3, var4.u(), var4.i(), var1, (long)var2);
         }

         if (var4.M() != 0) {
            GL33.glVertexAttribDivisor(var3, var4.M());
         }

         var2 += var4.N();
      }
   }

   public class09069[] N() {
      return this.attrs;
   }
}
