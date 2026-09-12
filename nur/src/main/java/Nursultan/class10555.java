package Nursultan;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import minecraft.class06069;
import minecraft.class06091;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07430;
import minecraft.class07473;
import minecraft.class07623;
import minecraft.class07830;

public class class10555<T extends class06091> extends class07473 {
   private static final int N = 200;
   private final T y;
   private final double L;
   private final double u;
   private long i;

   public void L() {
   }

   private List<class06091> M() {
      return this.y.method_73183().N(class06091.class, this.y.method_5829().M(16.0), var1 -> var1.O() && !var1.method_5779(this.y));
   }

   public class10555(T var1, double var2, double var4) {
      this.y = (T)var1;
      this.L = var2;
      this.u = var4;
      this.i = -1L;
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   private boolean Z() {
      class06069 var1 = this.y.method_59922();
      class07209 var2 = this.y.method_73183().N(class07830.field_13203, this.y.method_24515().method_10069(-8 + var1.y(16), 0, -8 + var1.y(16)));
      return this.y.f().N((double)var2.method_10263(), (double)var2.method_10264(), (double)var2.method_10260(), this.L);
   }

   public void i() {
      boolean var1 = this.y.Q();
      class07623 var2 = this.y.f();
      if (var2.U()) {
         List<class06091> var3 = this.M();
         if (this.y.o() && var3.isEmpty()) {
            this.y.B(false);
         } else if (var1 && this.y.l().method_19769(this.y.method_73189(), 10.0)) {
            this.y.I();
         } else {
            class06889 var4 = class06889.L(this.y.l());
            class06889 var5 = this.y.method_73189();
            var4 = var5.u(var4).y(90.0F).L(0.4).i(var4);
            class07209 var8 = class07209.method_49638(var4.u(var5).u().L(10.0).i(var5));
            var8 = this.y.method_73183().N(class07830.field_13203, var8);
            if (!var2.N((double)var8.method_10263(), (double)var8.method_10264(), (double)var8.method_10260(), var1 ? this.u : this.L)) {
               this.Z();
               this.i = this.y.method_73183().N() + 200L;
            } else if (var1) {
               Iterator<class06091> var9 = var3.iterator();

               while (var9.hasNext()) {
                  var9.next().N(var8);
               }
            }
         }
      }
   }

   public void u() {
   }

   public boolean N() {
      boolean var1 = this.y.method_73183().N() < this.i;
      return this.y.o() && this.y.T() == null && !this.y.method_42148() && this.y.d() && !var1;
   }
}
