package Nursultan;

import com.mojang.datafixers.util.Function4;
import java.util.function.Function;
import minecraft.class02362;

public class class10076<B, C> implements class02362<B, C> {
   public class10076(
      class02362 var1, class02362 var2, class02362 var3, class02362 var4, Function4 var5, Function var6, Function var7, Function var8, Function var9
   ) {
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
      this.M = var7;
      this.B = var8;
      this.Z = var9;
   }

   public C decode(B var1) {
      Object var2 = this.N.decode(var1);
      Object var3 = this.y.decode(var1);
      Object var4 = this.L.decode(var1);
      Object var5 = this.u.decode(var1);
      return (C)this.i.apply(var2, var3, var4, var5);
   }

   public void encode(B var1, C var2) {
      this.N.encode(var1, this.R.apply(var2));
      this.y.encode(var1, this.M.apply(var2));
      this.L.encode(var1, this.B.apply(var2));
      this.u.encode(var1, this.Z.apply(var2));
   }
}
