package Nursultan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import minecraft.class00494;
import minecraft.class00734;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
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
import minecraft.class07218;

public abstract class class11053 extends class11535 {
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public boolean y_init;

   public boolean L(class06183 var1) {
      return var1.N() == class07113.field_1333;
   }

   public void L() {
      this.P();
      if ((Integer)this.y_2 >= 0) {
         this.y_2 = (Integer)this.y_2 - 1;
      }

      if (!this.u()) {
         this.B();
         class11019 var1 = this.N();
         if (var1 != null) {
            for (class07050 var5 : class07050.values()) {
               if (this.N(((class04453)((class06202)this.y_0).T_4).method_5998(var5))) {
                  class06889 var6 = this.N(var1.N(), ((class04453)((class06202)this.y_0).T_4).method_73189().y(0.0, -0.5, 0.0));
                  class11499 var7 = class11505.N();
                  class11499 var8 = class11505.N(var7, var6);
                  class11499 var9 = this.N(var1, var6, var8);
                  class06183 var10 = this.N(var9.y(), var9.R(), var1);
                  class06183 var11 = this.N(var7.y(), var7.R(), var1);
                  if (this.N(var10, var11)) {
                     var10 = var11;
                     var9 = var7;
                  }

                  if (this.y(var10, var5)) {
                     this.N(var10, var5);
                     this.N(var9, true);
                  }

                  this.N(var9, false);
                  break;
               }
            }
         }
      }
   }

   public boolean M() {
      class11322.i();
      return true;
   }

   private void P() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_2 = 0;
      }
   }

   public class11053(Scaffold var1, String var2, boolean var3) {
      super(var2, var3);
      this.P();
      this.y_0 = class06202.Nq();
      this.y_1 = var1;
   }

   public void B() {
      this.P();
      class06584 var1 = ((class04453)((class06202)this.y_0).T_4).method_6047();
      if (!this.N(var1)) {
         Optional<class11297> var2 = class11281.i(this::N).max(Comparator.comparingInt(var0 -> var0.N().c()));
         if (!var2.isEmpty()) {
            class11322.u(var2.get().y());
         }
      }
   }

   public boolean i() {
      return true;
   }

   public boolean u() {
      return false;
   }

   public boolean y(class06183 var1) {
      this.P();
      return !((Scaffold)this.y_1).P() ? false : var1.i() == class07211.field_11036 && !this.R() && !((class04453)((class06202)this.y_0).T_4).method_24828();
   }

   public boolean y(class06183 var1, class07050 var2) {
      this.P();
      if (this.L(var1)) {
         return false;
      } else if (this.y(var1)) {
         return false;
      } else {
         return !this.N(var1) ? false : this.N(((class04453)((class06202)this.y_0).T_4).method_5998(var2), var1, var2);
      }
   }

   private boolean N(class06584 var1) {
      this.P();
      class06581 var3 = var1.B();
      if (!(var3 instanceof class06918)) {
         return false;
      } else {
         class00734 var4 = ((class06918)var3).L().W().R((class03448)((class06202)this.y_0).T_3, class07209.field_10980).method_1107();
         return var4.y() == 1.0 && var4.u() == 1.0;
      }
   }

   public void N(class11499 var1, boolean var2) {
      class11534.y(var1);
   }

   public boolean N(class06183 var1, class06183 var2) {
      if (var1.N() == class07113.field_1333 || var2.N() == class07113.field_1333) {
         return false;
      } else {
         return !var1.u().equals(var2.u()) ? false : var1.i() == class07211.field_11036 || var1.i() == var2.i();
      }
   }

   public boolean N(class06183 var1) {
      this.P();
      return (Integer)this.y_2 <= 0;
   }

   public class06183 N(float var1, float var2, class11019 var3) {
      this.P();
      class06889 var4 = ((class04453)((class06202)this.y_0).T_4).method_5631(var2, var1);
      class06889 var5 = ((class04453)((class06202)this.y_0).T_4).method_33571();
      class06889 var6 = var5.i(var4.L(((class04453)((class06202)this.y_0).T_4).method_55754()));
      class06183 var8 = ((class03448)((class06202)this.y_0).T_3)
         .method_8320(var3.y())
         .R((class03448)((class06202)this.y_0).T_3, var3.y())
         .method_1092(var5, var6, var3.y());
      return var8 == null ? class06183.N(var5, class07211.field_11036, var3.y()) : var8;
   }

   public void N(class06183 var1, class07050 var2) {
      this.P();
      class11907.N(var2, var1);
      class11494 var3 = ((Scaffold)this.y_1).m();
      this.y_2 = class11908.N((int)var3.N(), (int)var3.L());
   }

   public class11019 N() {
      this.P();
      class06889 var1 = ((class04453)((class06202)this.y_0).T_4).method_73189();
      class06889 var2 = new class06889(
         ((class04453)((class06202)this.y_0).T_4).method_23317(),
         Math.floor(((class04453)((class06202)this.y_0).T_4).method_23318()) - 0.5,
         ((class04453)((class06202)this.y_0).T_4).method_23321()
      );
      double var3 = ((class04453)((class06202)this.y_0).T_4).method_55754();
      return this.N(var1, var3).stream().min(Comparator.comparingDouble(var3x -> this.N(var3x.N(), var1).M(var2))).orElse(null);
   }

   public boolean N(class06584 var1, class06183 var2, class07050 var3) {
      this.P();
      if (var1.B() instanceof class06918 var4) {
         class06942 var6 = new class06942((class03448)((class06202)this.y_0).T_3, (class04453)((class06202)this.y_0).T_4, var3, var1, var2);
         if (!var6.N()) {
            return false;
         } else {
            return ((class03448)((class06202)this.y_0).T_3).method_31606(var6.method_8037()) ? false : ((class12010)var4).N(var6) != null;
         }
      } else {
         return false;
      }
   }

   public List<class11019> N(class06889 var1, double var2) {
      this.P();
      class07218 var4 = new class07218();
      ArrayList var5 = new ArrayList();

      for (int var6 = (int)(-var2); var6 <= (int)var2; var6++) {
         for (int var7 = (int)(-var2); var7 <= (int)var2; var7++) {
            for (int var8 = 0;
               (float)var8
                  <= (float)((int)var2) - ((class04453)((class06202)this.y_0).T_4).method_18381(((class04453)((class06202)this.y_0).T_4).method_18376());
               var8++
            ) {
               var4.N(var1.M + (double)var6, var1.B - (double)var8, var1.Z + (double)var7);
               class00494 var10 = ((class03448)((class06202)this.y_0).T_3).method_8320(var4).R((class03448)((class06202)this.y_0).T_3, var4);
               if (!var10.method_1110()) {
                  var10 = var10.method_1096((double)var4.method_10263(), (double)var4.method_10264(), (double)var4.method_10260());
                  var5.add(new class11019(var4.method_10062(), var10));
               }
            }
         }
      }

      return var5;
   }

   public abstract class11499 N(class11019 var1, class06889 var2, class11499 var3);

   public class06889 N(class00494 var1, class06889 var2) {
      class06889 var3 = null;
      Iterator<class00734> var4 = var1.method_1090().iterator();

      while (var4.hasNext()) {
         class00734 var6 = var4.next().L(0.0, -0.15F, 0.0);
         double var7 = class04995.N(var2.N(), var6.N, var6.u);
         double var9 = class04995.N(var2.y(), var6.y, var6.i);
         double var11 = class04995.N(var2.L(), var6.L, var6.R);
         if (var3 == null || var2.L(var7, var9, var11) < var2.M(var3)) {
            var3 = new class06889(var7, var9, var11);
         }
      }

      return var3 == null ? var2 : var3;
   }

   public boolean R() {
      this.P();
      return !((class04453)((class06202)this.y_0).T_4).k() || ((class04453)((class06202)this.y_0).T_4).field_5976;
   }
}
