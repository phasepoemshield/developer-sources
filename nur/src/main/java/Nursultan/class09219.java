package Nursultan;

import java.util.Objects;

public class class09219 {
   public static Object N_0 = new class09219()::N;

   private class09219() {
   }

   static {
      N();
   }

   private class09798 N(class11844 var1, class09809 var2) {
      String var3 = var1.y().P().N();
      Object var10000;
      Objects.requireNonNull(var10000);
      class11536<?> var4 = (class11536<?>)var10000;

      var1.y();
      return switch (var4) {
         case class11507 var6 -> var2.N("$checkbox" + var3, (class09788<class11844>)class09188.N_0, var1);
         case class11533 var7 -> var2.N("$input" + var3, (class09788<class11844>)class09206.N_0, var1);
         case class11527 var8 -> var2.N("$hotkey" + var3, (class09788<class11844>)class09185.N_0, var1);
         case class11532 var9 -> var2.N("$button" + var3, (class09788<class11844>)class09220.N_0, var1);
         case class11504 var10 -> var2.N("$slider" + var3, (class09788<class11844>)class09178.N_0, var1);
         case class11525 var11 -> var2.N("$rangeSlider" + var3, (class09788<class11844>)class09201.N_0, var1);
         case class11515 var12 -> var2.N("$colorPicker" + var3, (class09788<class11844>)class09199.N_0, var1);
         case class11523 var13 -> var2.N("$combo" + var3, (class09788<class11844>)class09208.N_0, var1);
         case class11517 var14 -> var2.N("$selectable" + var3, (class09788<class11844>)class09204.N_0, var1);
         default -> class09778.N(class12020.N(var1.y().P()), (class09991)class09183.N_4);
      };
   }

   private static void N() {
   }
}
