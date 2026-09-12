package Nursultan;

import org.joml.Vector3d;

public class class09309 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public boolean N_init;

   public String L() {
      return (String)this.N_1;
   }

   public class09309(String var1, String var2, Vector3d var3) {
      this.Z();
      this.N_0 = var1;
      this.N_1 = var2;
      this.N_4 = new Vector3d(var3);
      this.N_3 = new Vector3d(var3);
      this.N_2 = System.currentTimeMillis();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof class09309 var2)) {
         return false;
      } else {
         String var3 = this.u();
         String var4 = var2.u();
         return var3 == null ? var4 == null : var3.equals(var4);
      }
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      byte var2 = 1;
      String var3 = this.u();
      return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
   }

   private void Z() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_2 = 0L;
      }
   }

   public Vector3d i() {
      return (Vector3d)this.N_4;
   }

   public String u() {
      return (String)this.N_0;
   }

   public long y() {
      return (Long)this.N_2;
   }

   public class09309 N(long var1) {
      this.N_2 = var1;
      return this;
   }

   public Vector3d N() {
      return (Vector3d)this.N_3;
   }
}
