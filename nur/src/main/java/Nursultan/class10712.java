package Nursultan;

import org.jspecify.annotations.Nullable;

public class class10712 {
   private final String N;
   private final String y;

   public class10712(String var1, @Nullable Object var2) {
      this.N = var1;
      if (var2 == null) {
         this.y = "~~NULL~~";
      } else if (var2 instanceof Throwable var3) {
         this.y = "~~ERROR~~ " + var3.getClass().getSimpleName() + ": " + var3.getMessage();
      } else {
         this.y = var2.toString();
      }
   }

   public String y() {
      return this.y;
   }

   public String N() {
      return this.N;
   }
}
