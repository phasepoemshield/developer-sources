package Nursultan;

import java.util.Arrays;
import java.util.List;
import minecraft.class04523;
import minecraft.class04537;

public class class10440<E> implements class04537<E> {
   private final Object[] N;

   public class10440(List<class04523<E>> var1, int var2) {
      this.N = new Object[var2];
      int var3 = 0;

      for (class04523 var5 : var1) {
         int var6 = var5.y();
         Arrays.fill(this.N, var3, var3 + var6, var5.N());
         var3 += var6;
      }
   }

   public E N(int var1) {
      return (E)this.N[var1];
   }
}
