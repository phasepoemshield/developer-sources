package Nursultan;

import java.util.List;
import minecraft.class04523;
import minecraft.class04537;

public class class10422<E> implements class04537<E> {
   private final class04523<?>[] N;

   public class10422(List<class04523<E>> var1) {
      this.N = var1.toArray(var0 -> new class04523[var0]);
   }

   public E N(int var1) {
      for (class04523<?> var5 : this.N) {
         var1 -= var5.y();
         if (var1 < 0) {
            return (E)var5.N();
         }
      }

      throw new IllegalStateException(var1 + " exceeded total weight");
   }
}
