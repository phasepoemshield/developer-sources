package Nursultan;

import minecraft.class05143;
import minecraft.class05179;
import minecraft.class06069;
import minecraft.class06433;
import minecraft.class06476;
import minecraft.class07211;

public class class10494 implements class05143 {
   public boolean N(class06433 var1) {
      if (var1.L[class07211.field_11043.L()]
         && !var1.y[class07211.field_11043.L()].u
         && var1.L[class07211.field_11036.L()]
         && !var1.y[class07211.field_11036.L()].u) {
         class06433 var2 = var1.y[class07211.field_11043.L()];
         return var2.L[class07211.field_11036.L()] && !var2.y[class07211.field_11036.L()].u;
      } else {
         return false;
      }
   }

   public class06476 N(class07211 var1, class06433 var2, class06069 var3) {
      var2.u = true;
      var2.y[class07211.field_11043.L()].u = true;
      var2.y[class07211.field_11036.L()].u = true;
      var2.y[class07211.field_11043.L()].y[class07211.field_11036.L()].u = true;
      return new class05179(var1, var2);
   }
}
