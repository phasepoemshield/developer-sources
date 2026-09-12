package Nursultan;

import java.util.function.Consumer;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class02733;
import minecraft.class02752;
import minecraft.class03794;
import minecraft.class04376;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public final class class10343 implements class10340 {
   private final class07209 N;
   private final class00891 y;
   @Nullable
   private class02733 L;
   @Nullable
   private final class07211 u;
   private int i = 0;

   public class10343(class07209 var1, class00891 var2, @Nullable class02733 var3, @Nullable class07211 var4) {
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      if (class04376.N[this.i] == var4) {
         this.i++;
      }
   }

   @Override
   public boolean N(class07299 var1) {
      class07211 var2 = class04376.N[this.i++];
      class07209 var3 = this.N.method_10093(var2);
      class00500 var4 = var1.method_8320(var3);
      class02733 var5 = null;
      if (var1.method_45162().y(class03794.L)) {
         if (this.L == null) {
            this.L = class02752.N(var1, this.u == null ? null : this.u.b(), null);
         }

         var5 = this.L.y(var2);
      }

      class04376.N(var1, var4, var3, this.y, var5, false);
      if (this.i < class04376.N.length && class04376.N[this.i] == this.u) {
         this.i++;
      }

      return this.i < class04376.N.length;
   }

   @Override
   public void N(Consumer<class07209> var1) {
      for (class07211 var5 : class04376.N) {
         if (var5 != this.u) {
            class07209 var6 = this.N.method_10093(var5);
            var1.accept(var6);
         }
      }
   }
}
