package Nursultan;

import java.util.function.BiPredicate;
import java.util.function.Function;
import minecraft.class06584;

public record class10879<T>(String name, Function<class06584, T> getter, BiPredicate<T, T> equals) {

   public Function<class06584, T> L() {
      return this.getter;
   }

   public String y() {
      return this.name;
   }

   public boolean N(class06584 var1, class06584 var2) {
      Object var3 = this.getter.apply(var1);
      Object var4 = this.getter.apply(var2);
      if (var3 == null && var4 == null) {
         return true;
      } else {
         return var3 != null && var4 != null ? this.equals.test((T)var3, (T)var4) : false;
      }
   }

   public BiPredicate<T, T> N() {
      return this.equals;
   }
}
