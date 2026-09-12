package Nursultan;

import minecraft.class04995;
import org.joml.Vector2f;

public class class11623<P extends class11632> implements class11598<P> {
   public static Object L_0 = new class11623();

   @Override
   public void L(class09860 var1, P var2) {
      class09864 var3 = (class09864)var1;
      if (var3.L() == 0) {
         class09904 var4 = var1.z();
         if (var2.N().equals(var4.N())) {
            var2.u().N(true);
            var2.L().N(var2.L().L().set(var3.N() - var4.c().y(), var3.y() - var4.c().L()));
         }
      }
   }

   static {
      i();
   }

   private static void i() {
      L_0 = null;
   }

   @Override
   public void y(class09860 var1, P var2) {
      if (var2.u().L()) {
         class09864 var3 = (class09864)var1;
         Vector2f var4 = var2.y().L();
         if (var4 == null) {
            var4 = new Vector2f();
         }

         Vector2f var5 = var2.L().L();
         class09904 var6 = var1.z();
         class09898 var7 = var6.X().c();
         class09898 var8 = var6.c();
         class11616 var9 = this.N();
         var2.y().N(var4.set(var9.y() ? N(var3.N() - var5.x, var7.u(), var8.u()) : var4.x, var9.N() ? N(var3.y() - var5.y, var7.i(), var8.i()) : var4.y));
      }
   }

   @Override
   public void N(class09860 var1, P var2) {
      if (((class09864)var1).L() == 0) {
         var2.u().N(false);
      }
   }

   public class11616 N() {
      return class11616.FULL;
   }

   public static float N(float var0, float var1, float var2) {
      return var2 > var1 ? class04995.N(var0, -var2 / 2.0F, var1 - var2 / 2.0F) : class04995.N(var0, 0.0F, var1 - var2);
   }
}
