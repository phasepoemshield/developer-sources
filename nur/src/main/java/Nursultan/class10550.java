package Nursultan;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import minecraft.class00405;
import minecraft.class05935;
import minecraft.class05936;
import minecraft.class05977;

public class class10550 implements class05936 {
   public class10550(List var1) {
      this.N = var1;
   }

   public <T> Optional<T> N_8(class05977<T> var1) {
      Iterator var2 = this.N.iterator();

      while (var2.hasNext()) {
         Optional var4 = ((class05936)var2.next()).N_8(var1);
         if (var4.isPresent()) {
            return var4;
         }
      }

      return Optional.empty();
   }

   public <T> Optional<T> N(class05935<T> var1, class00405 var2) {
      Iterator var3 = this.N.iterator();

      while (var3.hasNext()) {
         Optional var5 = ((class05936)var3.next()).N(var1, var2);
         if (var5.isPresent()) {
            return var5;
         }
      }

      return Optional.empty();
   }
}
