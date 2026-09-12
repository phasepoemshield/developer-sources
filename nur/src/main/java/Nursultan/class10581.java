package Nursultan;

import java.util.Optional;
import minecraft.class03729;
import minecraft.class04782;
import minecraft.class05838;
import minecraft.class05946;
import minecraft.class06485;
import minecraft.class06521;
import org.jspecify.annotations.Nullable;

public class class10581<I, T> implements class06485<I, T> {
   @Nullable
   private class05946<class06521<?>> y;

   public class10581(class05838 var1) {
      this.N = var1;
   }

   public Optional<class03729<T>> N(I var1, class04782 var2) {
      Optional var4 = var2.method_64577().N(this.N, var1, var2, this.y);
      if (var4.isPresent()) {
         class03729 var5 = (class03729)var4.get();
         this.y = var5.N();
         return Optional.of(var5);
      } else {
         return Optional.empty();
      }
   }
}
