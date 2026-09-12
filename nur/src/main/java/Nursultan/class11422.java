package Nursultan;

public class class11422 extends class11417 {
   public Object y_0;

   @SafeVarargs
   public class11422(String var1, boolean var2, Class<? extends class11784>... var3) {
      super(var1, var2);
      this.u();
      this.y_0 = var3;
   }

   private void u() {
   }

   @Override
   public void y(Object var1) {
      this.u();
      Class[] var2 = (Class[])this.y_0;
      int var3 = var2.length;

      for (int var4 = 0; var4 < var3; var4++) {
         if (var2[var4].isInstance(var1)) {
            ((class11784)var1).N();
            return;
         }
      }
   }
}
