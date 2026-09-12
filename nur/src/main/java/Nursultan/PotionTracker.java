package Nursultan;

import com.mojang.serialization.Lifecycle;
import java.util.ArrayList;
import java.util.List;
import minecraft.class00380;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00516;
import minecraft.class00734;
import minecraft.class02484;
import minecraft.class03448;
import minecraft.class04227;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05018;
import minecraft.class05216;
import minecraft.class06145;
import minecraft.class06202;
import minecraft.class06517;
import minecraft.class06541;
import minecraft.class06584;
import minecraft.class06658;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07084;
import minecraft.class07089;
import minecraft.class07113;
import minecraft.class07486;
import minecraft.class08036;
import minecraft.class08392;

@class11080(
   L = "PotionTracker",
   y = class11072.MISC,
   N = class11106.TRACKERS
)
public class PotionTracker extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;

   private void L(class11367 var1) {
      class11938.Z().N(() -> {
         this.v();
         this.y(var1);
         ((List)this.L_4).clear();
      });
   }

   public PotionTracker() {
      this.v();
      this.L_0 = class11524.N(this, "ignore-self", true);
      this.L_1 = class11524.N(this, "ignore-common-splash-potions", true);
      this.L_2 = class11524.N(this, "ft-bypass", true);
      this.L_3 = new ArrayList();
      this.L_4 = new ArrayList();
      class11805 var1 = class11938.L();
      var1.N(class11367.class, this::L);
      var1.N(class10990.class, this::N);
      class11938.Z()
         .N(
            var0 -> (class03448)var0.T_3 != null
                  && ((class03448)var0.T_3).method_30349().method_46759(class04227.yR).map(var0x -> var0x.R().equals(Lifecycle.experimental())).orElse(false),
            this::m
         );
   }

   private void m() {
      this.v();
      class11107.N(class11165.POTIONS).stream().map(class11664::N).forEach(((List)this.L_3)::add);
   }

   private void v() {
   }

   private void y(class11367 var1) {
      this.v();
      class07089 var2 = var1.N();
      class07049 var3 = var2.N() == class07113.field_1331 ? ((class06145)var2).L() : null;
      class07486 var4 = var1.y();
      List<class08036> var5 = this.N(var4.method_5829().L(4.0, 2.0, 4.0));
      if (!var5.isEmpty()) {
         if (((class11507)this.L_2).i() && class11910.i()) {
            for (class11149 var7 : (List)this.L_4) {
               for (class06584 var9 : (List)this.L_3) {
                  class06517 var10 = (class06517)var9.a_(class02484.h, class06517.N);
                  int var11 = class11300.y(class11300.u(var7.y()), class11300.N(var7.y()), class11300.i(var7.y()), 255);
                  if (!var10.R().isEmpty() && class11300.N((Integer)var10.R().get(), var11, 10)) {
                     this.N(var5, var2.y(), var3, true, var9);
                     break;
                  }
               }
            }
         } else {
            this.N(var5, var4.method_73189(), var3, false, var4.L());
         }
      }
   }

   private void N(List<class08036> var1, class06889 var2, class07049 var3, boolean var4, class06584 var5) {
      this.v();
      Iterable<class07055> var7 = ((class06517)var5.a_(class02484.h, class06517.N)).N();

      for (class08036 var9 : var1) {
         if (this.N(var9)) {
            double var10 = this.N(var2.M(var9.method_73189()), var9, var3);
            ArrayList var12 = new ArrayList();

            for (class07055 var14 : var7) {
               if (!((class07084)var14.L().N()).N()) {
                  int var15 = var14.N(var2x -> (int)(var10 * (double)var2x + 0.5));
                  if (var15 > 20) {
                     var12.add(this.N(var14, var15));
                  }
               }
            }

            if (!var12.isEmpty() && this.U() && (!((class11507)this.L_1).i() || var4)) {
               int var16 = Math.clamp(Math.round(var10 * 100.0), 1, 100);
               this.N(var9, var5, var12, var16);
            }
         }
      }
   }

   private void N(class08036 var1, class06584 var2, List<class00392> var3, int var4) {
      int var5 = class04995.M((float)var4 / 100.0F * 0.33333334F, 1.0F, 1.0F);
      class05216 var6 = class00392.y(" " + var4 + "%").L(class00405.N.N(var5));
      class05216 var7 = var1.yZ().L().i(" ").y(var2.Y()).y(var6).L(class00405.N.N(new class00380(var2)));

      for (class00392 var9 : var3) {
         var7.i("\n● ").y(var9);
      }

      class11303.y(var7.N(class06541.field_1080));
   }

   private double N(double var1, class08036 var3, class07049 var4) {
      if (var1 >= 16.0) {
         return 0.0;
      } else {
         return var3 == var4 ? 1.0 : 1.0 - Math.sqrt(var1) / 4.0;
      }
   }

   private List<class08036> N(class00734 var1) {
      return ((class03448)((class06202)super.y_0).T_3).N(class08036.class, var1);
   }

   private boolean N(class08036 var1) {
      this.v();
      if (!var1.method_6086()) {
         return false;
      } else {
         boolean var2 = this.U();
         return !var2 && var1 == (class04453)((class06202)super.y_0).T_4
            ? false
            : !var2 || !((class11507)this.L_0).i() || var1 != (class04453)((class06202)super.y_0).T_4;
      }
   }

   private class00392 N(class07055 var1, int var2) {
      String var3 = class08392.N(var1.z(), new Object[0]);
      if (var1.i() >= 1 && var1.i() <= 9) {
         var3 = var3 + " " + class08392.N("enchantment.level." + (var1.i() + 1), new Object[0]);
      }

      String var4 = class05018.N(var2, ((class03448)((class06202)super.y_0).T_3).method_54719().R());
      class05216 var5 = class00392.y(var3).N(class06541.field_1061);
      return class00392.i().y(var5).i(" " + var4);
   }

   private void N(class10990 var1) {
      this.v();
      class00381<?> var2 = var1.u();
      switch (var2) {
         case null:
         default:
            break;
         case class06658 var4:
            ((class06202)super.y_0).execute(() -> var4.N().forEach(var1xx -> {
                  class07049 var3 = ((class03448)((class06202)super.y_0).T_3).method_8469(var1xx);
                  if (var3 instanceof class07486) {
                     ((class07486)var3).method_5773();
                  }
               }));
            break;
         case class00516 var5:
            if (!((class11507)this.L_2).i() || !class11910.i()) {
               return;
            }

            ((class06202)super.y_0).execute(() -> {
               this.v();
               if (var5.y() == 2002) {
                  ((List)this.L_4).add(new class11149(var5.u(), var5.L()));
               }
            });
      }
   }
}
