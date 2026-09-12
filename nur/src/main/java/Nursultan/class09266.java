package Nursultan;

public class class09266 implements class11951<class09263> {
   public Object N_0;

   public class09266() {
      this.u();
   }

   public class09266(class09295[] var1) {
      this.u();
      this.N_0 = var1;
   }

   private void u() {
   }

   @Override
   public void y(class11940 var1) {
      int var2 = var1.R();
      this.N_0 = new class09295[var2];

      for (int var3 = 0; var3 < var2; var3++) {
         String var4 = var1.P();
         String var5 = var1.P();
         boolean var6 = var1.B();
         ((class09295[])this.N_0)[var3] = new class09295(var4, var5, var6);
      }
   }

   public void N(class09263 var1) {
      var1.N(this);
   }

   public class09295[] N() {
      return (class09295[])this.N_0;
   }

   @Override
   public void N(class11940 var1) {
      var1.y(((class09295[])this.N_0).length);

      for (class09295 var5 : (class09295[])this.N_0) {
         var1.N(var5.y());
         var1.N(var5.N());
         var1.N(var5.L());
      }
   }
}
