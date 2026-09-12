package Nursultan;

import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import minecraft.class03448;
import minecraft.class05096;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06584;

@class11080(
   L = "AutoBuy",
   y = class11072.MISC,
   N = class11106.BASE
)
public class AutoBuy extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public Object L_7;

   private void T() {
   }

   public AutoBuy() {
      this.T();
      this.L_0 = new class11275();
      this.L_1 = new class11331();
      this.L_2 = new class11109();
      this.L_3 = new class11116((class11275)this.L_0, this, "buyer", true, this::y);
      this.L_4 = new class11150((class11331)this.L_1, this, "checker", false, this::N);
      this.L_5 = class11524.N(this, "mode", (class11116)this.L_3, (class11150)this.L_4);
      this.L_6 = class11524.N(this, "decrease-prices", 40.0F, 0.0F, 90.0F, 1.0F).N((Supplier<String>)class11502.N_0);
      this.L_7 = class11524.N(this, "auto-parser", this::n);
   }

   @Override
   public boolean Z() {
      this.T();
      if ((class03448)((class06202)super.y_0).T_3 != null) {
         if (((class11150)this.L_4).U()) {
            ((class11331)this.L_1).L();
         } else if (((class11116)this.L_3).U() && !((class11275)this.L_0).N()) {
            ((class11275)this.L_0).y();
         }

         return super.Z();
      } else {
         return false;
      }
   }

   @Override
   public boolean i() {
      this.T();
      ((class11109)this.L_2).N();
      if (((class11150)this.L_4).U() && !((class11331)this.L_1).y()) {
         ((class11331)this.L_1).u();
      } else if (((class11116)this.L_3).U() && ((class11275)this.L_0).N()) {
         ((class11275)this.L_0).i();
      }

      ((class11150)this.L_4).N();
      return super.i();
   }

   private double s() {
      this.T();
      return (double)((class11504)this.L_6).i().floatValue() / 100.0;
   }

   private void n() {
      this.T();
      if ((!((class11116)this.L_3).U() || !((class11275)this.L_0).N() || !((class11275)this.L_0).L())
         && (!((class11150)this.L_4).U() || !((class11331)this.L_1).N().get())) {
         List<class11882> var1 = class11938.n().y().values().stream().filter(var0 -> var0.M() && var0.u().i()).toList();
         ((class11109)this.L_2).N(var1, var1x -> class11140.N(var1x, this.s())).thenAccept(var0 -> {
            class11303.y(class11921.N("auto-parser.complete").N(class06541.field_1080));
            class11519.y(class11516.class);
         });
      }
   }

   @Override
   public void m() {
      int var1 = class11910.M();
      if (var1 != -1) {
         int[] var2 = class11924.N().filter(var0 -> var0.y() == class11909.staticFields_0d98e95695d6732fd9192964e161ca232_1).mapToInt(class11906::u).toArray();

         for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var2[var3];
            if (var1 == var4) {
               class11910.N("/an" + var2[(var3 + 1) % var2.length]);
               break;
            }
         }
      }
   }

   private void y(class11535 var1) {
      this.T();
      ((class11116)var1).N();
      if (!var1.U()) {
         ((class11275)this.L_0).i();
      } else {
         if (this.U()) {
            ((class11275)this.L_0).y();
         }
      }
   }

   @class11782
   public void N(class10992 var1) {
      this.T();
      ((class11109)this.L_2).y(var1);
      ((class11807)((class11517)this.L_5).i()).y(var1);
   }

   @class11782
   public void N(class10990 var1) {
      this.T();
      ((class11109)this.L_2).y(var1.u());
   }

   @class11782
   public void N(class10963 var1) {
      this.T();
      ((class11807)((class11517)this.L_5).i()).y(var1);
   }

   private void N(class11535 var1) {
      this.T();
      ((class11150)var1).N();
      if (!var1.U()) {
         ((class11331)this.L_1).u();
      } else {
         if (this.U()) {
            ((class11331)this.L_1).L();
         }
      }
   }

   @class11782
   public void N(class11385 var1) {
      this.T();
      if ((class05096)((class06202)super.y_0).v_3 != null) {
         if ((!((class11150)this.L_4).U() || !((class11331)this.L_1).y()) && (!((class11116)this.L_3).U() || ((class11275)this.L_0).N())) {
            var1.M(false);
            var1.i(false);
            var1.L(false);
            var1.R(false);
            var1.B(false);
            var1.u(false);
         }
      }
   }

   @class11782
   public void N(class10961 var1) {
      this.T();
      ((class11807)((class11517)this.L_5).i()).y(var1);
   }

   @class11782
   public void N(class09343 var1) {
      this.T();
      ((class11109)this.L_2).y(var1);
   }

   @class11782
   public void N(class10965 var1) {
      this.T();
      ((class11807)((class11517)this.L_5).i()).y(var1);
   }

   @class11782
   public void N(class11402 var1) {
      this.T();
      ((class11807)((class11517)this.L_5).i()).y(var1);
   }

   @class11782
   public void N(class11363 var1) {
      this.T();
      ((class11807)((class11517)this.L_5).i()).y(var1);
   }

   public static int N(class06584 var0, long var1) {
      return Objects.hash(var0.Y().getString(), var0.B().z(), var1);
   }
}
