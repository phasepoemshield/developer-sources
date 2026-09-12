package Nursultan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00624;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06918;
import minecraft.class06942;
import minecraft.class07050;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class08052;

@class11080(
   L = "AutoDripstone",
   y = class11072.PLAYER,
   N = class11106.AUTO
)
public class AutoDripstone extends class11067 {
   public Object L_0;
   public Object L_1;
   public boolean L_init;

   private void P() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_1 = 0;
      }
   }

   public AutoDripstone() {
      this.P();
   }

   @Override
   public boolean i() {
      if ((class04453)((class06202)super.y_0).T_4 != null) {
         class11322.i();
      }

      return super.i();
   }

   private class10916 s() {
      ArrayList var1 = new ArrayList();

      for (class07209 var4 : class07209.method_62671(
         ((class04453)((class06202)super.y_0).T_4).method_5829().M(((class04453)((class06202)super.y_0).T_4).method_55754())
      )) {
         class00500 var5 = ((class03448)((class06202)super.y_0).T_3).method_8320(var4);
         class00891 var7 = var5.i();
         if (var7 instanceof class00624) {
            class00624 var6 = (class00624)var7;
            if (this.N(var4, var5, var6)) {
               var1.add(
                  new class10916(
                     var5,
                     var5.R((class03448)((class06202)super.y_0).T_3, var4)
                        .method_1096((double)var4.method_10263(), (double)var4.method_10264(), (double)var4.method_10260()),
                     var4.method_10062(),
                     (Boolean)var5.L(class00624.y)
                  )
               );
            }
         }
      }

      class06889 var8 = ((class04453)((class06202)super.y_0).T_4).method_33571();
      return var1.stream().min(Comparator.comparingDouble(var1x -> var8.M(var1x.L().method_46558()))).orElse(null);
   }

   private void j() {
      if (!this.N(((class04453)((class06202)super.y_0).T_4).method_6047())) {
         class11281.N(class11281.R(class06570.wC)).ifPresent(class11322::u);
      }
   }

   private boolean N(class07209 var1, class00500 var2, class00624 var3) {
      if (!((class11066)var3).am_().L()) {
         return false;
      } else if (var2.L(class00624.L) != class08052.field_12617) {
         return false;
      } else {
         for (int var4 = 1; var4 <= 2; var4++) {
            class00500 var5 = ((class03448)((class06202)super.y_0).T_3).method_8320(var1.method_10087(var4));
            if (!var5.P() && var5.i() != class00869.vp) {
               return false;
            }
         }

         return true;
      }
   }

   private void N(class10916 var1) {
      this.P();
      class06889 var2 = ((class04453)((class06202)super.y_0).T_4).method_33571();
      class06889 var3 = var1.N().method_33661(((class04453)((class06202)super.y_0).T_4).method_33571()).orElse(var2);
      class11499 var4 = class11505.N().N(class11505.N(class11505.N(), var3)).u(true).N(true);
      class06889 var5 = var4.U().L(((class04453)((class06202)super.y_0).T_4).method_55754()).i(var2);
      class06183 var6 = var1.y().R((class03448)((class06202)super.y_0).T_3, var1.L()).method_1092(var2, var5, var1.L());
      if (var6 != null && var6.N() != class07113.field_1333) {
         class11534.y(var4);
         class11907.N(class07050.field_5808, var6);
         this.L_0 = false;
      }
   }

   private boolean N(class06584 var1) {
      return var1.N(class06570.wC);
   }

   public boolean N(class06584 var1, class06183 var2, class07050 var3) {
      if (var1.B() instanceof class06918 var4) {
         class06942 var6 = new class06942((class03448)((class06202)super.y_0).T_3, (class04453)((class06202)super.y_0).T_4, var3, var1, var2);
         if (!var6.N()) {
            return false;
         } else {
            return ((class03448)((class06202)super.y_0).T_3).method_31606(var6.method_8037()) ? false : ((class12010)var4).N(var6) != null;
         }
      } else {
         return false;
      }
   }

   @class11782
   public void N(class10992 var1) {
      this.P();
      class10916 var2 = this.s();
      if (var2 != null) {
         this.j();
         if (var2.u()) {
            this.N(var2);
         } else if (((class03448)((class06202)super.y_0).T_3).method_8320(var2.L().method_10074()).i() == class00869.vp) {
            this.N(var2);
         } else if ((Integer)this.L_1 + 5 <= class11938.j().y()) {
            for (class07050 var7 : class07050.values()) {
               if (this.N(((class04453)((class06202)super.y_0).T_4).method_5998(var7))) {
                  this.N(var2, var7);
                  break;
               }
            }
         }
      }
   }

   private void N(class10916 var1, class07050 var2) {
      this.P();
      class06889 var3 = ((class04453)((class06202)super.y_0).T_4).method_33571();

      for (class07211 var5 : List.of(class07211.field_11043, class07211.field_11034, class07211.field_11039, class07211.field_11035, class07211.field_11036)) {
         class07209 var6 = var1.L().method_10074();
         class07209 var7 = var6.method_10093(var5);
         class00494 var9 = ((class03448)((class06202)super.y_0).T_3).method_8320(var7).R((class03448)((class06202)super.y_0).T_3, var7);
         if (!var9.method_1110()) {
            class06889 var10 = var6.method_46558();
            class06889 var11 = var9.method_1096((double)var7.method_10263(), (double)var7.method_10264(), (double)var7.method_10260())
               .method_33661(var10)
               .orElse(var10);
            class11499 var12 = class11505.N().N(class11505.N(class11505.N(), var11)).u(true).N(true);
            class06889 var13 = var12.U().L(((class04453)((class06202)super.y_0).T_4).method_55754()).i(var3);
            class06183 var14 = var9.method_1092(var3, var13, var7);
            if (var14 != null
               && var14.N() != class07113.field_1333
               && var14.i() == var5.b()
               && this.N(((class04453)((class06202)super.y_0).T_4).method_5998(var2), var14, var2)) {
               if (!((class04453)((class06202)super.y_0).T_4).method_5715()) {
                  this.L_0 = true;
               } else {
                  class11534.y(var12);
                  class11907.N(var2, var14);
                  this.L_1 = class11938.j().y();
               }
               break;
            }
         }
      }
   }

   @class11782
   public void N(class11385 var1) {
      this.P();
      if ((Boolean)this.L_0 != null) {
         var1.y((Boolean)this.L_0);
         if ((Boolean)this.L_0 && ((class04453)((class06202)super.y_0).T_4).method_31549().y) {
            var1.i(true);
         }

         this.L_0 = null;
      }
   }
}
