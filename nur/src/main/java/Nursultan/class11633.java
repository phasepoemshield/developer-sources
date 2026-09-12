package Nursultan;

import minecraft.class06202;
import org.joml.Vector2f;

public class class11633 extends class11623<class11632> {
   public Object N_0;
   public static Object y_0 = new class11633(class11616.FULL);
   public static Object y_1 = new class11633(class11616.HORIZONTAL);
   public static Object y_2 = new class11633(class11616.VERTICAL);

   @Override
   public void L(class09860 var1, class11632 var2) {
      class11769 var3 = class11730.N(var2.N());
      if (var3 != null && var1 instanceof class09864) {
         switch (((class09864)var1).L()) {
            case 0:
               var3.P();
               break;
            case 2:
               var3.M();
         }
      }

      super.L(var1, var2);
   }

   private static void M() {
   }

   private class11633(class11616 var1) {
      this.y();
      this.N_0 = var1;
   }

   static {
      M();
   }

   private static boolean u() {
      return class06202.Nq().s();
   }

   private void y() {
   }

   @Override
   public void y(class09860 var1, class11632 var2) {
      this.y();
      super.y(var1, var2);
      if (var2.u().L()) {
         ((class11738)class11738.y_0).N();
         Vector2f var3 = var2.y().L();
         if (var3 != null) {
            class09904 var4 = var1.z();
            class09898 var5 = var4.X().c();
            Vector2f var6 = new Vector2f(var3);
            if (u()) {
               ((class11738)class11738.y_0)
                  .N(var2.N(), var6, var4.c().u(), var4.c().i(), var5.u(), var5.i(), ((class11616)this.N_0).y(), ((class11616)this.N_0).N());
            }

            if (((class11616)this.N_0).y()) {
               var6.x = var6.x + N(var2.N(), var4.c().u());
            }

            if (!var6.equals(var3)) {
               var2.y().N(var6);
            }
         }
      }
   }

   @Override
   public class11616 N() {
      this.y();
      return (class11616)this.N_0;
   }

   public static class11598<class11632> N(class11616 var0) {
      return (class11598<class11632>)(switch (((int[])class11639.N_0)[var0.ordinal()]) {
         case 1 -> (class11633)y_0;
         case 2 -> (class11633)y_1;
         case 3 -> (class11633)y_2;
         case 4 -> (class11626)class11626.N_0;
         default -> throw new MatchException(null, null);
      });
   }

   private static float N(String var0, float var1) {
      class11769 var2 = class11730.N(var0);
      return var2 != null ? var2.L().N() * var1 : 0.0F;
   }

   @Override
   public void N(class09860 var1, class11632 var2) {
      super.N(var1, var2);
      if (!var2.u().L()) {
         ((class11738)class11738.y_0).N();
      }
   }
}
