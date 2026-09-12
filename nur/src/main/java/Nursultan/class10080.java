package Nursultan;

import com.mojang.datafixers.util.Function9;
import java.util.function.Function;
import minecraft.class02362;

public class class10080<B, C> implements class02362<B, C> {
   public class10080(
      class02362 var1,
      class02362 var2,
      class02362 var3,
      class02362 var4,
      class02362 var5,
      class02362 var6,
      class02362 var7,
      class02362 var8,
      class02362 var9,
      Function9 var10,
      Function var11,
      Function var12,
      Function var13,
      Function var14,
      Function var15,
      Function var16,
      Function var17,
      Function var18,
      Function var19
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
      this.z = var10;
      this.U = var11;
      this.E = var12;
      this.W = var13;
      this.m = var14;
      this.P = var15;
      this.s = var16;
      this.T = var17;
      this.b = var18;
      this.j = var19;
   }

   public C decode(B var1) {
      Object var2 = this.N.decode(var1);
      Object var3 = this.y.decode(var1);
      Object var4 = this.L.decode(var1);
      Object var5 = this.u.decode(var1);
      Object var6 = this.i.decode(var1);
      Object var7 = this.R.decode(var1);
      Object var8 = this.M.decode(var1);
      Object var9 = this.B.decode(var1);
      Object var10 = this.Z.decode(var1);
      return (C)this.z.apply(var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public void encode(B var1, C var2) {
      this.N.encode(var1, this.U.apply(var2));
      this.y.encode(var1, this.E.apply(var2));
      this.L.encode(var1, this.W.apply(var2));
      this.u.encode(var1, this.m.apply(var2));
      this.i.encode(var1, this.P.apply(var2));
      this.R.encode(var1, this.s.apply(var2));
      this.M.encode(var1, this.T.apply(var2));
      this.B.encode(var1, this.b.apply(var2));
      this.Z.encode(var1, this.j.apply(var2));
   }
}
