package Nursultan;

import java.util.function.Function;
import minecraft.class02362;

public class class10072<B, U> implements class02362<B, U> {
   public class10072(class02362 var1, Function var2, Function var3) {
      this.L = var1;
      this.N = var2;
      this.y = var3;
   }

   public U decode(B var1) {
      Object var2 = this.L.decode(var1);
      return (U)((class02362)this.N.apply(var2)).decode(var1);
   }

   public void encode(B var1, U var2) {
      Object var3 = this.y.apply(var2);
      class02362 var4 = (class02362)this.N.apply(var3);
      this.L.encode(var1, var3);
      var4.encode(var1, var2);
   }
}
