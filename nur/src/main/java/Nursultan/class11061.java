package Nursultan;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00743;
import minecraft.class02484;
import minecraft.class02824;
import minecraft.class02833;
import minecraft.class04453;
import minecraft.class05298;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07085;
import minecraft.class07469;
import minecraft.class07471;
import minecraft.class07510;

public class class11061 {
   public static Object N_0;
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public boolean y_init;

   public void L() {
      if (this.B()) {
         this.N((Integer)this.y_1);
      }

      this.s();
   }

   private boolean L(class06584 var1) {
      return var1.B() == class06570.la || var1.B() == class06570.Gw;
   }

   public void M() {
      if (!class11281.y((Integer)this.y_1)) {
         this.P();
      }
   }

   private void P() {
      this.N((Integer)this.y_1);
      this.s();
   }

   public class11061() {
      this.E();
      this.y_0 = class06202.Nq();
      this.y_1 = -1;
      this.y_2 = class06584.E;
   }

   static {
      W();
   }

   private boolean B() {
      return (class04453)((class06202)this.y_0).T_4 != null && !class11281.y((Integer)this.y_1) && (this.u() || class11938.m().u());
   }

   public void i() {
      if (!class11281.y((Integer)this.y_1)) {
         this.y_3 = (Integer)this.y_3 + 1;
         int var10002 = (Integer)this.y_5 - 1;
         this.y_5 = var10002;
         if (var10002 <= 0) {
            this.P();
         }
      }
   }

   private void s() {
      this.y_1 = -1;
      this.y_2 = class06584.E;
      this.y_3 = 0;
      this.y_5 = 0;
   }

   private int z() {
      class07469 var1 = ((class04453)((class06202)this.y_0).T_4).method_5996(class05298.u);
      if (var1 == null) {
         return -1;
      } else {
         List<class07471> var2 = this.N(((class04453)((class06202)this.y_0).T_4).method_6079());
         Set var3 = var2.stream().map(class07471::N).collect(Collectors.toSet());
         List<class07471> var4 = var1.L().stream().filter(var1x -> !var3.contains(var1x.N())).toList();
         double var5 = var1.y();
         double var7 = this.N(var5, var4, var2);
         int var9 = -1;
         class00743<class06584> var10 = ((class04453)((class06202)this.y_0).T_4).method_31548().u();
         int var11 = ((class04453)((class06202)this.y_0).T_4).method_31548().N();

         for (int var12 = 0; var12 < var10.size(); var12++) {
            if (var12 != var11) {
               class06584 var13 = (class06584)var10.get(var12);
               if (!var13.R() && this.L(var13)) {
                  List<class07471> var14 = this.N(var13);
                  if (!var14.isEmpty()) {
                     double var15 = this.N(var5, var4, var14);
                     if (var15 > var7) {
                        var7 = var15;
                        var9 = var12;
                     }
                  }
               }
            }
         }

         return var9;
      }
   }

   public boolean u() {
      return !class11281.y((Integer)this.y_1)
         && (class04453)((class06202)this.y_0).T_4 != null
         && !((class06584)this.y_2).R()
         && ((class04453)((class06202)this.y_0).T_4).method_6079().N(((class06584)this.y_2).B());
   }

   private boolean y(class06584 var1) {
      return var1.B() == class06570.la || var1.L(class02484.e);
   }

   public boolean y() {
      return class11281.y((Integer)this.y_1) || (Integer)this.y_3 >= (Integer)this.y_4;
   }

   private void E() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_1 = 0;
         this.y_3 = 0;
         this.y_4 = 0;
         this.y_5 = 0;
      }
   }

   private double N(double var1, List<class07471> var3, List<class07471> var4) {
      Set var5 = var4.stream().map(class07471::N).collect(Collectors.toSet());
      double var6 = 0.0;
      double var8 = 0.0;
      double var10 = 1.0;

      for (class07471 var13 : Stream.concat(var3.stream().filter(var1x -> !var5.contains(var1x.N())), var4.stream()).toList()) {
         switch (((int[])class11092.N_0)[var13.L().ordinal()]) {
            case 1:
               var6 += var13.y();
               break;
            case 2:
               var8 += var13.y();
               break;
            case 3:
               var10 *= 1.0 + var13.y();
         }
      }

      double var14 = var1 + var6;
      return (var14 + var14 * var8) * var10;
   }

   public void N() {
      if (!class11281.y((Integer)this.y_1) && !class11938.m().u()) {
         if (!this.u()) {
            this.s();
         }
      }
   }

   private List<class07471> N(class06584 var1) {
      return ((class02833)var1.a_(class02484.b, class02833.N))
         .y()
         .stream()
         .filter(var0 -> var0.N() == class05298.u && var0.L().y(class07085.field_6171))
         .<class07471>map(class02824::y)
         .toList();
   }

   private void N(int var1) {
      class11938.m().N(0, class11281.L(var1), 40, class07510.field_7791).y();
   }

   private static void W() {
      N_0 = 40;
      N_1 = 5;
      N_2 = 1;
      N_3 = 2;
   }

   public void R() {
      if (!class11281.y((Integer)this.y_1)) {
         this.y_5 = 5;
      } else if (!this.y(((class04453)((class06202)this.y_0).T_4).method_6079())) {
         int var1 = this.z();
         if (!class11281.y(var1)) {
            this.y_2 = (class06584)((class04453)((class06202)this.y_0).T_4).method_31548().u().get(var1);
            this.N(var1);
            this.y_1 = var1;
            this.y_3 = 0;
            this.y_4 = class11938.m().u() ? 2 : 1;
            this.y_5 = 5;
         }
      }
   }
}
