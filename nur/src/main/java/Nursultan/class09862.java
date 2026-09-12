package Nursultan;

import java.util.Objects;

final class class09862 {
   static final Object N;
   private final class09862 y;
   private final class09804<?> L;
   private final Object u;

   class09862(class09862 var1, class09804<?> var2, Object var3) {
      this.y = var1;
      this.L = Objects.requireNonNull(var2, "context");
      this.u = var3;
   }

   Object N(class09804<?> var1) {
      for (class09862 var2 = this; var2 != null; var2 = var2.y) {
         if (var2.L == var1) {
            return var2.u;
         }
      }

      return N;
   }
}
