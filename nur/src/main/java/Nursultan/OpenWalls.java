package Nursultan;

import minecraft.class00500;
import minecraft.class00748;
import minecraft.class00891;
import minecraft.class04453;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class05982;
import minecraft.class06109;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07113;
import minecraft.class07209;

@class11080(
   L = "OpenWalls",
   y = class11072.MISC,
   N = class11106.BASE
)
public class OpenWalls extends class11067 {
   private boolean N(class00500 var1, class07209 var2) {
      class00891 var3 = var1.i();
      return var3 instanceof class05982 || var3 instanceof class06109 || var3 instanceof class00748;
   }

   @class11782
   public void N(class10980 var1) {
      class06889 var2 = ((class04453)((class06202)super.y_0).T_4).method_33571();
      class11499 var3 = class11505.L();
      class06889 var4 = ((class04453)((class06202)super.y_0).T_4)
         .method_5631(var3.R(), var3.y())
         .L(((class04453)((class06202)super.y_0).T_4).method_55754())
         .i(var2);
      class06183 var5 = class11892.N(
         new class05862(var2, var4, class05849.field_17558, class05835.field_1348, (class04453)((class06202)super.y_0).T_4), this::N
      );
      if (var5.N() != class07113.field_1333) {
         if (class11907.N(var1.L(), var5)) {
            var1.N();
         }
      }
   }
}
