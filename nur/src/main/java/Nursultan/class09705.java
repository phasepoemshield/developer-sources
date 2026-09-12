package Nursultan;

import java.util.function.Function;
import minecraft.class02362;

public class class09705<O, V> implements class02362<O, V> {
   public class09705(class02362 var1, Function var2) {
      this.y = var1;
      this.N = var2;
   }

   public V decode(O var1) {
      Object var2 = this.N.apply(var1);
      return (V)this.y.decode(var2);
   }

   public void encode(O var1, V var2) {
      Object var3 = this.N.apply(var1);
      this.y.encode(var3, var2);
   }
}
