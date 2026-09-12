package Nursultan;

import java.util.Optional;
import minecraft.class00819;
import minecraft.class02362;

public class class09405<B, T> implements class02362<B, class00819<T>> {
   private static final int y = 1;
   private static final int L = 2;

   public class09405(class02362 var1) {
      this.N = var1;
   }

   public void encode(B var1, class00819<T> var2) {
      Optional var3 = var2.R();
      Optional var4 = var2.M();
      var1.writeByte((var3.isPresent() ? 1 : 0) | (var4.isPresent() ? 2 : 0));
      var3.ifPresent(var2x -> var0.encode(var1, var2x));
      var4.ifPresent(var2x -> var0.encode(var1, var2x));
   }

   public class00819<T> decode(B var1) {
      byte var2 = var1.readByte();
      Optional var3 = (var2 & 1) != 0 ? Optional.of((Number)this.N.decode(var1)) : Optional.empty();
      Optional var4 = (var2 & 2) != 0 ? Optional.of((Number)this.N.decode(var1)) : Optional.empty();
      return new class00819(var3, var4);
   }
}
