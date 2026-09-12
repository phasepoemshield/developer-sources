package Nursultan;

import java.util.AbstractList;
import java.util.NoSuchElementException;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public class class11762 extends AbstractList<Vector4f> {
   public Object N_0;
   public Object N_1;
   public boolean N_init;

   public class11762(int var1) {
      this.i();
      this.N_0 = new Vector4f[var1];

      for (int var2 = 0; var2 < var1; var2++) {
         ((Vector4f[])this.N_0)[var2] = new Vector4f();
      }
   }

   @Override
   public int size() {
      return (Integer)this.N_1;
   }

   @Override
   public void clear() {
      this.N_1 = 0;
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0;
      }
   }

   public Vector4f removeLast() {
      if ((Integer)this.N_1 == 0) {
         throw new NoSuchElementException();
      } else {
         this.N_1 = (Integer)this.N_1 - 1;
         return ((Vector4f[])this.N_0)[(Integer)this.N_1];
      }
   }

   public Vector4f get(int var1) {
      return ((Vector4f[])this.N_0)[var1];
   }

   public void N(Vector4fc var1) {
      if ((Integer)this.N_1 == ((Vector4f[])this.N_0).length) {
         Vector4f[] var2 = new Vector4f[((Vector4f[])this.N_0).length * 2];
         System.arraycopy((Vector4f[])this.N_0, 0, var2, 0, ((Vector4f[])this.N_0).length);

         for (int var3 = ((Vector4f[])this.N_0).length; var3 < var2.length; var3++) {
            var2[var3] = new Vector4f();
         }

         this.N_0 = var2;
      }

      ((Vector4f[])this.N_0)[(Integer)this.N_1].set(var1);
      this.N_1 = (Integer)this.N_1 + 1;
   }
}
