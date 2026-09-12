package Nursultan;

import java.util.Optional;

public class class11698 implements class11686 {
   public Object N_0;
   public static Object y_0;

   public class11698(class11693 var1) {
      this.R();
      this.N_0 = var1;
   }

   static {
      i();
   }

   private static void i() {
      y_0 = null;
   }

   @Override
   public String[] N() {
      return (String[])y_0;
   }

   @Override
   public void N(String var1) {
      String var2 = class11715.N();
      String var3 = class11715.y();
      Optional<class11675> var4 = ((class11693)this.N_0).N(var2, var3);
      if (!var4.isEmpty()) {
         String var5 = var4.get().y();
         class11910.N("/login " + var5);

         try {
            ((class11693)this.N_0).N(var2, var3, var5);
         } catch (Exception var7) {
            class11303.N(new class11288(class11938.u().Q()), "Login update error: " + var7.getMessage());
         }
      }
   }

   private void R() {
   }
}
