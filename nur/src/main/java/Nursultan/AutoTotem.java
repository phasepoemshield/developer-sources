package Nursultan;

import java.util.Comparator;
import java.util.List;
import minecraft.class00509;
import minecraft.class00676;
import minecraft.class00743;
import minecraft.class02484;
import minecraft.class02575;
import minecraft.class02830;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05462;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06937;
import minecraft.class07482;
import minecraft.class07510;

@class11080(
   L = "AutoTotem",
   y = class11072.PLAYER,
   N = class11106.AUTO
)
public class AutoTotem extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public boolean L_init;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public Object u_6;
   public Object i_0;
   public Object i_1;
   public static Object R_0;

   private void P() {
      this.j();
      if (!class11938.m().u()) {
         class06584 var1 = ((class04453)((class06202)super.y_0).T_4).method_6079();
         if (((Integer)this.L_0 == -1 && (Integer)this.L_1 == -1 || (Boolean)this.L_3) && (!var1.y().N(class02484.e) || var1.L(class02484.b))) {
            class11297 var2 = class11281.L((class11328)(var0 -> var0.y().N(class02484.e))).min((Comparator<? super class11297>)this.L_4).orElse(null);
            if (var2 != null && !var2.N().L(class02484.b)) {
               this.N(var2, var1);
            } else if (!this.N(var1, false)) {
               if (var2 != null) {
                  this.N(var2, var1);
               } else {
                  this.N(var1, true);
               }
            }
         }
      }
   }

   private int T() {
      class00743<class06584> var1 = ((class04453)((class06202)super.y_0).T_4).method_31548().u();

      for (int var2 = 9; var2 < var1.size(); var2++) {
         if (((class06584)var1.get(var2)).R()) {
            return var2;
         }
      }

      for (int var3 = 0; var3 < 9; var3++) {
         if (((class06584)var1.get(var3)).R()) {
            return var3;
         }
      }

      return -1;
   }

   public AutoTotem() {
      this.j();
      this.i_0 = new class11701("health-trigger", true);
      this.i_1 = new class11713("elytra-health-trigger", false);
      this.u_0 = new class11711("crystal-trigger", false);
      this.u_1 = new class11699("tnt-trigger", false);
      this.u_2 = new class11692("falling-dripstone-trigger", false);
      this.u_3 = new class11681("falling-trigger", false);
      this.u_4 = new class11694("trident-trigger", true);
      this.u_5 = new class11678("mace-smash-trigger", false);
      this.u_6 = class11524.y(
         this,
         "triggers",
         (class11701)this.i_0,
         (class11713)this.i_1,
         (class11681)this.u_3,
         (class11711)this.u_0,
         (class11699)this.u_1,
         (class11692)this.u_2,
         (class11694)this.u_4,
         (class11678)this.u_5
      );
      this.L_0 = -1;
      this.L_1 = -1;
      this.L_4 = Comparator.comparingInt(var0 -> var0.N().L(class02484.b) ? 1 : 0);
      ((class11523)this.u_6).L().forEach(var1 -> {
         if (var1 instanceof class11801) {
            var1.N(this);
         }
      });
   }

   static {
      d();
   }

   private boolean s() {
      return ((class04453)((class06202)super.y_0).T_4).method_7357().N(class06570.la.E());
   }

   private void n() {
      this.j();
      if (!class11938.m().u()) {
         if ((Integer)this.L_1 != -1) {
            this.l();
         } else if ((Integer)this.L_0 != -1) {
            if (this.N((Integer)this.L_0, 0) != -1) {
               this.L_0 = -1;
            }
         }
      }
   }

   private void l() {
      this.j();
      if ((class07482)((class04453)((class06202)super.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3
            == ((class04453)((class06202)super.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2
         && ((class07482)((class04453)((class06202)super.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M().R()) {
         class06584 var1 = (class06584)((class04453)((class06202)super.y_0).T_4).method_31548().u().get((Integer)this.L_1);
         class02830 var2 = (class02830)var1.method_58694(class02484.D);
         if (var2 != null && !var2.M()) {
            int var3 = class11281.L((Integer)this.L_1);
            if (var2.Z() && var2.B() != 0) {
               class05462.N(var1, 0);
               ((class06202)super.y_0).NE().N(new class02575(var3, 0));
            }

            boolean var4 = !((class04453)((class06202)super.y_0).T_4).method_6079().R();
            class12029 var5 = class11938.m().N(0, var3, 1, class07510.field_7790).N(0, 45, 0, class07510.field_7790);
            if (var4) {
               var5.N(0, var3, 0, class07510.field_7790);
            }

            var5.y((class12040)(var1x -> {
               this.j();
               this.L_2 = class11938.j().y();
            })).y();
            this.L_1 = -1;
         } else {
            this.L_1 = -1;
         }
      }
   }

   private static void d() {
      R_0 = 45;
   }

   private boolean k() {
      this.j();
      return class11938.j().y() - (Integer)this.L_2 < 5 && ((Integer)this.L_0 != -1 || (Integer)this.L_1 != -1);
   }

   private boolean t() {
      this.j();
      return ((List)((class11523)this.u_6).i()).stream().anyMatch(class11697::N);
   }

   private void j() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0;
         this.L_1 = 0;
         this.L_2 = 0;
         this.L_3 = false;
      }
   }

   private int y(int var1) {
      for (class06937 var3 : ((class07482)((class04453)((class06202)super.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).T) {
         if (var3.L == ((class04453)((class06202)super.y_0).T_4).method_31548() && var3.B() == var1) {
            return var3.u;
         }
      }

      return -1;
   }

   private boolean y(class06584 var1, boolean var2) {
      class02830 var3 = (class02830)var1.method_58694(class02484.D);
      return var3 == null ? false : var3.y().anyMatch(var1x -> var1x.y().N(class02484.e) && (var2 || !var1x.L(class02484.b)));
   }

   private int N(class02830 var1) {
      int var2 = -1;

      for (int var3 = 0; var3 < var1.i(); var3++) {
         class06584 var4 = var1.N(var3);
         if (var4.y().N(class02484.e)) {
            if (!var4.L(class02484.b)) {
               return var3;
            }

            if (var2 == -1) {
               var2 = var3;
            }
         }
      }

      return var2;
   }

   @class11782
   public void N(class11371 var1) {
      if (var1.N() instanceof class00676) {
         if (!((class04453)((class06202)super.y_0).T_4).method_6047().L(class02484.e) && !this.k() && !this.s()) {
            if (this.t()) {
               this.P();
            }
         }
      }
   }

   private boolean N(class06584 var1, boolean var2) {
      this.j();
      if ((class07482)((class04453)((class06202)super.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3
            == ((class04453)((class06202)super.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2
         && ((class07482)((class04453)((class06202)super.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M().R()) {
         class11297 var3 = class11281.L((class11328)(var2x -> this.y(var2x, var2))).findFirst().orElse(null);
         if (var3 == null) {
            return false;
         } else {
            class02830 var4 = (class02830)var3.N().method_58694(class02484.D);
            int var5 = this.N(var4);
            if (this.N(var1) && var4.N(var5).L(class02484.b)) {
               return false;
            } else {
               boolean var6 = var4.i() == 1 && class02830.y(var1);
               int var7 = !var1.R() && !var6 ? this.T() : -1;
               if (!var1.R() && !var6 && class11281.y(var7)) {
                  return false;
               } else {
                  int var8 = class11281.L(var3.y());
                  if (var4.B() != var5) {
                     class05462.N(var3.N(), var5);
                     ((class06202)super.y_0).NE().N(new class02575(var8, var5));
                  }

                  class12029 var9 = class11938.m().N(0, var8, 1, class07510.field_7790).N(0, 45, 0, class07510.field_7790);
                  if (!var1.R()) {
                     if (var6) {
                        var9.N(0, var8, 0, class07510.field_7790);
                        this.L_1 = var3.y();
                     } else {
                        var9.N(0, class11281.L(var7), 0, class07510.field_7790);
                        this.L_0 = var7;
                     }
                  }

                  int var10 = this.Y();
                  var9.y((class12040)(var2x -> {
                     this.j();
                     this.L_2 = class11938.j().y() + var10;
                  })).y();
                  this.L_3 = false;
                  return true;
               }
            }
         }
      } else {
         return false;
      }
   }

   @class11782
   public void N(class10996 var1) {
      if (!((class04453)((class06202)super.y_0).T_4).method_6047().L(class02484.e) && !this.k()) {
         if (this.s()) {
            this.n();
         } else if (this.t()) {
            this.P();
         } else {
            this.n();
         }
      }
   }

   @class11782
   public void N(class10990 var1) {
      this.j();
      if ((class03448)((class06202)super.y_0).T_3 != null
         && var1.u() instanceof class00509 var2
         && var2.N((class03448)((class06202)super.y_0).T_3) == (class04453)((class06202)super.y_0).T_4
         && var2.N() == 35) {
         this.L_3 = true;
         this.L_2 = class11938.j().y() - 5;
      }
   }

   private boolean N(class06584 var1) {
      return var1.y().N(class02484.e) && var1.L(class02484.b);
   }

   private void N(class11297 var1, class06584 var2) {
      this.j();
      if (!this.N(var2) || !var1.N().L(class02484.b)) {
         int var3 = var1.y();
         int var4 = this.Y();
         if ((Integer)this.L_0 == -1 && !var2.R()) {
            this.L_0 = this.N(var3, var4);
            if ((Integer)this.L_0 != -1) {
               this.L_3 = false;
            }
         } else {
            if (this.N(var3, var4) != -1) {
               this.L_3 = false;
            }
         }
      }
   }

   private int N(int var1, int var2) {
      int var3 = this.y(var1);
      if (var3 == -1) {
         return -1;
      } else {
         class11938.m()
            .N(((class07482)((class04453)((class06202)super.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b, var3, 40, class07510.field_7791)
            .y((class12040)(var2x -> {
               this.j();
               this.L_2 = class11938.j().y() + var2;
            }))
            .y();
         return var1;
      }
   }

   private int Y() {
      this.j();
      return !((class11711)this.u_0).N() && !((class11699)this.u_1).N() ? 0 : 160;
   }
}
