package Nursultan;

import java.util.Objects;
import minecraft.class00442;
import minecraft.class00455;
import org.jspecify.annotations.Nullable;

class class10692<T> {
   private final class10696<T> y;
   @Nullable
   T N;

   class10692(class10696<T> var1) {
      this.y = var1;
   }

   @Nullable
   public class00442<T> N(class00455<T> var1) {
      Object var2 = this.y.get();
      if (!Objects.equals(var2, this.N)) {
         this.N = (T)var2;
         return var1.N(var2);
      } else {
         return null;
      }
   }
}
