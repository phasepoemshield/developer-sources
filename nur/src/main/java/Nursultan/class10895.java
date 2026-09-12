package Nursultan;

import java.util.Comparator;
import java.util.Optional;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06918;
import minecraft.class06942;
import minecraft.class07050;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07211;

public class class10895 extends class11807<WallClimb> {
   public Object y_0;
   public Object y_1;
   public boolean y_init;

   public class10895(WallClimb var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.N();
   }

   @Override
   public void y(Object var1) {
      this.N();
      if (!(var1 instanceof class10992)) {
         if (var1 instanceof WallClimb) {
            this.y_1 = null;
            this.y_0 = 0;
            if ((class04453)((class06202)super.N_0).T_4 != null) {
               class11322.i();
            }
         }
      } else {
         this.y_0 = (Integer)this.y_0 - 1;
         if ((class11499)this.y_1 != null && (Integer)this.y_0 > 0) {
            class11534.y((class11499)this.y_1);
         } else if ((Integer)this.y_0 == 0) {
            this.y_1 = null;
            class11322.i();
         }

         if (((class04453)((class06202)super.N_0).T_4).method_18798().B > 0.0 || ((class04453)((class06202)super.N_0).T_4).method_24828()) {
            return;
         }

         class07050 var2 = null;
         if (this.N(((class04453)((class06202)super.N_0).T_4).method_6079())) {
            var2 = class07050.field_5810;
         } else {
            Optional<class11297> var3 = class11281.i(this::N).min(Comparator.comparingInt(var1x -> {
               int var2x = ((class04453)((class06202)super.N_0).T_4).method_31548().N();
               int var3x = Math.abs(var1x.y() - var2x);
               return var3x == 8 ? 1 : var3x;
            }));
            if (var3.isPresent()) {
               class11297 var4 = var3.get();
               var2 = class07050.field_5808;
               class11322.u(var4.y());
            }
         }

         if (var2 == null) {
            return;
         }

         class06584 var11 = ((class04453)((class06202)super.N_0).T_4).method_5998(var2);
         if (var11.B() instanceof class06918 var12) {
            class11915 var13 = class11899.N(1);
            class06889 var6 = ((class04453)((class06202)super.N_0).T_4).method_33571();
            class06889 var7 = ((class04453)((class06202)super.N_0).T_4).method_73189();

            for (int var8 = -1; var8 <= 0; var8++) {
               class07209[] var9 = this.N(class07209.method_49638(new class06889(var7.M, var7.B - (double)var8 - 0.5, var7.Z)));

               for (int var10 = 0; var10 < 2; var10++) {
                  if (this.N(
                     (class12010)var12, var9, new class06889(var7.M, Math.floor(var7.B) + 0.9 - (double)var8 - (double)var10, var7.Z), var6, var2, var11, var13
                  )) {
                     return;
                  }

                  if (this.N(
                     (class12010)var12, var9, new class06889(var7.M, Math.floor(var7.B) + 0.1 - (double)var8 - (double)var10, var7.Z), var6, var2, var11, var13
                  )) {
                     return;
                  }
               }
            }
         }
      }
   }

   private class06183 N(class11499 var1, class06889 var2, class00494 var3, class07209 var4) {
      class06889 var5 = var2.i(var1.U().L(((class04453)((class06202)super.N_0).T_4).method_55754()));
      return var3.method_1092(var2, var5, var4);
   }

   private boolean N(class12010 var1, class07050 var2, class06584 var3, class06183 var4, class11915 var5) {
      class06942 var6 = new class06942((class03448)((class06202)super.N_0).T_3, (class04453)((class06202)super.N_0).T_4, var2, var3, var4);
      if (!var6.N()) {
         return false;
      } else {
         class00500 var7 = var1.N(var6);
         if (var7 == null) {
            return false;
         } else {
            class00494 var8 = var7.M((class03448)((class06202)super.N_0).T_3, var6.method_8037());
            if (var8.method_1110()) {
               return false;
            } else if (var8.method_1107().N(var6.method_8037()).L(var5.u().i().method_5829())) {
               class11907.N(var2, var4);
               return true;
            } else {
               return false;
            }
         }
      }
   }

   private void N() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0;
      }
   }

   private boolean N(class12010 var1, class07209[] var2, class06889 var3, class06889 var4, class07050 var5, class06584 var6, class11915 var7) {
      this.N();

      for (class07209 var11 : var2) {
         class00494 var13 = ((class03448)((class06202)super.N_0).T_3).method_8320(var11).R((class03448)((class06202)super.N_0).T_3, var11);
         Optional<class06889> var14 = var13.method_66507(var11).method_33661(var3);
         if (!var14.isEmpty()) {
            class11499 var15 = class11505.N();
            class11499 var16 = class11505.N(var15, var14.get());
            class11499 var17 = var15.N(var16).N(true).u(true);
            class06183 var18 = this.N(var17, var4, var13, var11);
            if (var18 != null && var18.N() != class07113.field_1333) {
               if ((class11499)this.y_1 != null) {
                  class06183 var19 = this.N((class11499)this.y_1, var4, var13, var11);
                  if (var19 != null && var19.N() != class07113.field_1333 && var19.u().equals(var18.u()) && var19.i().equals(var18.i())) {
                     var17 = (class11499)this.y_1;
                     var18 = var19;
                  }
               }

               if (this.N(var1, var5, var6, var18, var7)) {
                  class11534.y(var17);
                  this.y_1 = var17;
                  this.y_0 = 10;
                  return true;
               }
            }
         }
      }

      return false;
   }

   private boolean N(class06584 var1) {
      class06581 var3 = var1.B();
      return var3 instanceof class06918 && !((class06918)var3).L().W().M((class03448)((class06202)super.N_0).T_3, class07209.field_10980).method_1110();
   }

   private class07209[] N(class07209 var1) {
      class07209[] var2 = new class07209[5];

      for (int var3 = 0; var3 < 4; var3++) {
         var2[var3] = var1.method_10093(class07211.N((double)(((class04453)((class06202)super.N_0).T_4).method_36454() % 360.0F + (float)(var3 * 90))));
      }

      var2[4] = var1;
      return var2;
   }
}
