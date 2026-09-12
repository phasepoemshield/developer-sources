package Nursultan;

public class class11802 {
   public Object N_0;
   public Object N_1;
   public boolean N_init;

   public class11802(String var1) {
      this.i();
      this.N_0 = var1;
      class11828 var2 = class11828.N(var1);
      this.N_1 = var2 == null ? 0 : var2.N();
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0;
      }
   }

   public String y() {
      return (String)this.N_0;
   }

   public int N() {
      return (Integer)this.N_1;
   }
}
