package Nursultan;

import java.util.ArrayDeque;
import java.util.Deque;
import minecraft.class00743;
import minecraft.class02484;
import minecraft.class02575;
import minecraft.class02830;
import minecraft.class04453;
import minecraft.class05462;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07482;
import minecraft.class07510;

public class class11900 implements class11819 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;

   private void L() {
      class11328 var1 = (class11328)((Deque)this.N_1).poll();
      if (var1 != null) {
         int var2 = class11281.R(var1);
         if (class11281.y(var2)) {
            if ((Integer)this.N_4 == -1 && (Integer)this.y_4 == -1 && this.L(var1) != null) {
               this.y_3 = var1;
               this.y_0 = true;
            }
         } else if (!((class04453)((class06202)this.N_0).T_4)
            .method_7357()
            .N((class06584)((class04453)((class06202)this.N_0).T_4).method_31548().u().get(var2))) {
            if ((Integer)this.N_4 == -1) {
               this.N_4 = var2;
            }

            this.N_5 = var2;
            this.y_0 = true;
         }
      }
   }

   private class11297 L(class11328 var1) {
      return class11281.L((class11328)(var2 -> this.N(var2, var1))).findFirst().orElse(null);
   }

   private boolean M() {
      return (Integer)this.N_2 <= 0 && (Integer)this.N_3 <= 0;
   }

   public class11900(int var1) {
      this(var1, 0);
   }

   public class11900(int var1, int var2) {
      this.N();
      this.N_0 = class06202.Nq();
      this.N_1 = new ArrayDeque();
      this.N_4 = -1;
      this.N_5 = -1;
      this.y_4 = -1;
      this.y_5 = -1;
      this.N_2 = var1;
      this.N_3 = var2;
   }

   private void B() {
      if (!class11938.m().u()
         && (class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3
            == ((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2
         && ((class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M().R()) {
         class06584 var1 = (class06584)((class04453)((class06202)this.N_0).T_4).method_31548().u().get((Integer)this.y_4);
         class02830 var2 = (class02830)var1.method_58694(class02484.D);
         if (var2 != null && !var2.M()) {
            int var3 = class11281.L((Integer)this.y_4);
            if (var2.Z() && var2.B() != 0) {
               class05462.N(var1, 0);
               ((class06202)this.N_0).NE().N(new class02575(var3, 0));
            }

            int var4 = class11281.L((Integer)this.y_5);
            boolean var5 = !((class06584)((class04453)((class06202)this.N_0).T_4).method_31548().u().get((Integer)this.y_5)).R();
            class12029 var6 = class11938.m().N(0, var3, 1, class07510.field_7790).N(0, var4, 0, class07510.field_7790);
            if (var5) {
               var6.N(0, var3, 0, class07510.field_7790);
            }

            var6.y();
            this.y_4 = -1;
            this.y_5 = -1;
         } else {
            this.y_4 = -1;
            this.y_5 = -1;
         }
      }
   }

   private void Z() {
      if ((Integer)this.N_3 <= 0) {
         this.z();
      } else {
         this.N_7 = (Integer)this.N_3;
         this.y_2 = true;
      }
   }

   private void i() {
      int var1 = ((class04453)((class06202)this.N_0).T_4).method_31548().N();
      if (class11281.u((Integer)this.N_5)) {
         class11322.N((Integer)this.N_5);
         this.Z();
         if (this.M()) {
            class11322.i();
            if ((Integer)this.N_4 == (Integer)this.N_5) {
               this.N_4 = -1;
            }
         }
      } else if (this.M()) {
         class11938.m()
            .N(
               ((class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b,
               (Integer)this.N_5,
               var1,
               class07510.field_7791
            )
            .i()
            .N(new class12008(this::Z))
            .N(
               ((class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b,
               (Integer)this.N_5,
               var1,
               class07510.field_7791
            )
            .L();
         if ((Integer)this.N_4 == (Integer)this.N_5) {
            this.N_4 = -1;
         }
      } else {
         class11938.m()
            .N(
               ((class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b,
               (Integer)this.N_5,
               var1,
               class07510.field_7791
            )
            .y((class12040)(var1x -> this.Z()))
            .y();
      }
   }

   private void U() {
      this.N_6 = (Integer)this.N_6 - 1;
      if ((Boolean)this.y_2) {
         if ((Integer)this.N_7 > 0) {
            this.N_7 = (Integer)this.N_7 - 1;
         } else {
            this.y_2 = false;
            this.z();
         }
      } else {
         if (!(Boolean)this.y_0) {
            this.L();
         }

         if ((Boolean)this.y_0) {
            if ((class11328)this.y_3 != null) {
               class11328 var2 = (class11328)this.y_3;
               this.y_3 = null;
               this.y(var2);
            } else if ((Boolean)this.y_1) {
               this.Z();
            } else if ((Integer)this.N_5 != -1) {
               this.i();
            }

            this.N_5 = -1;
            this.y_0 = false;
            this.y_1 = false;
         } else {
            if ((Integer)this.N_6 == 0 && (Integer)this.N_4 != -1) {
               int var1 = ((class04453)((class06202)this.N_0).T_4).method_31548().N();
               if (class11281.u((Integer)this.N_4)) {
                  class11322.i();
               } else {
                  class11938.m()
                     .N(
                        ((class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b,
                        (Integer)this.N_4,
                        var1,
                        class07510.field_7791
                     )
                     .y();
               }

               this.N_4 = -1;
            }

            if ((Integer)this.N_6 <= 0 && (Integer)this.y_4 != -1) {
               this.B();
            }
         }
      }
   }

   private void z() {
      if (!((class04453)((class06202)this.N_0).T_4).method_6047().R()) {
         class11907.N(class07050.field_5808);
         this.N_6 = (Integer)this.N_2;
      }
   }

   private int y() {
      class00743<class06584> var1 = ((class04453)((class06202)this.N_0).T_4).method_31548().u();

      for (int var2 = 9; var2 < var1.size(); var2++) {
         if (((class06584)var1.get(var2)).R()) {
            return var2;
         }
      }

      return -1;
   }

   private void y(class11328 var1) {
      if (!class11938.m().u()
         && (class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3
            == ((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2
         && ((class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M().R()) {
         class11297 var2 = this.L(var1);
         if (var2 != null) {
            class02830 var3 = (class02830)var2.N().method_58694(class02484.D);
            int var4 = this.N(var3, var1);
            if (var4 != -1 && !((class04453)((class06202)this.N_0).T_4).method_7357().N(var3.N(var4))) {
               class06584 var5 = ((class04453)((class06202)this.N_0).T_4).method_6047();
               boolean var6 = !var5.R() && var3.i() == 1 && class02830.y(var5);
               int var7 = !var5.R() && !var6 ? this.y() : -1;
               if (var5.R() || var6 || !class11281.y(var7)) {
                  int var8 = class11281.L(var2.y());
                  int var9 = ((class04453)((class06202)this.N_0).T_4).method_31548().N();
                  int var10 = class11281.L(var9);
                  if (var3.B() != var4) {
                     class05462.N(var2.N(), var4);
                     ((class06202)this.N_0).NE().N(new class02575(var8, var4));
                  }

                  class12029 var11 = class11938.m().N(0, var8, 1, class07510.field_7790).N(0, var10, 0, class07510.field_7790);
                  if (!var5.R()) {
                     if (var6) {
                        var11.N(0, var8, 0, class07510.field_7790);
                        this.y_4 = var2.y();
                        this.y_5 = var9;
                     } else {
                        var11.N(0, class11281.L(var7), 0, class07510.field_7790);
                        this.N_4 = var7;
                     }
                  }

                  var11.y((class12040)(var1x -> this.Z())).y();
                  this.N_6 = (Integer)this.N_2;
               }
            }
         }
      }
   }

   @Override
   public void y(Object var1) {
      if (var1 instanceof class10992) {
         this.U();
      }
   }

   public void N(int var1) {
      this.N_2 = var1;
   }

   public void N(class11328 var1) {
      ((Deque)this.N_1).add(var1);
   }

   private int N(class02830 var1, class11328 var2) {
      for (int var3 = 0; var3 < var1.i(); var3++) {
         if (var2.test(var1.N(var3))) {
            return var3;
         }
      }

      return -1;
   }

   private void N() {
      this.N_2 = 0;
      this.y_0 = false;
      this.N_3 = 0;
      this.y_1 = false;
      this.N_4 = 0;
      this.y_2 = false;
      this.N_5 = 0;
      this.y_4 = 0;
      this.N_6 = 0;
      this.y_5 = 0;
      this.N_7 = 0;
   }

   private boolean N(class06584 var1, class11328 var2) {
      class02830 var3 = (class02830)var1.method_58694(class02484.D);
      return var3 == null ? false : var3.y().anyMatch(var2::test);
   }
}
