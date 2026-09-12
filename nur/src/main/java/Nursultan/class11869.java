package Nursultan;

import minecraft.class06584;

public record class11869(class06584 stack) implements class11849 {
   public static Object y_0;
   public static Object y_1 = class09991.N().u(16.0F, 16.0F);

   private static void L() {
      y_0 = 16;
   }

   static {
      L();
   }

   public class06584 N() {
      return this.stack;
   }

   @Override
   public class09798 N(class09809 var1, class11834 var2) {
      String var3 = "notify-item-" + var2.N();
      class11867 var4 = class11938.k().N(this.stack);
      if (!var4.L()) {
         return class09778.N(var1x -> var1x.N(var3).N((class09991)y_1));
      } else {
         class09991 var5 = class09991.N((class09991)y_1, class09991.N().N(var4.y(), var4.N(), var4.R(), var4.i()));
         return class09778.y(class11938.k().y()).N(var3).N(var5).i();
      }
   }
}
