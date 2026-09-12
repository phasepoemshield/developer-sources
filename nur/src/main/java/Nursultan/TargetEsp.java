package Nursultan;

import minecraft.class07438;

@class11080(
   L = "TargetEsp",
   y = class11072.VISUAL,
   N = class11106.WORLD
)
public class TargetEsp extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public boolean L_init;

   public static void L(class07438 var0) {
      N(var0, 1);
   }

   public class07438 P() {
      this.b();
      return (class07438)this.L_1;
   }

   public class07438 T() {
      this.b();
      return (class07438)this.L_0;
   }

   public TargetEsp() {
      this.b();
      this.L_4 = class11524.N(this, "mode", new class11441(this, "square", false), new class11434(this, "jello", false), new class11453(this, "scan", true));
      this.L_5 = class11524.N(this, "color", -11104513);
      class11938.L().N(class10992.class, var1 -> {
         this.b();
         if ((Integer)this.L_2 < class11938.j().y() - (Integer)this.L_3) {
            class07438 var2 = (class07438)this.L_1;
            this.y(null);
            if (var2 != null) {
               class11938.L().L(class11374.N(var2, null));
            }
         }
      });
   }

   private void b() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_2 = 0;
         this.L_3 = 0;
      }
   }

   public boolean s() {
      this.b();
      return (class07438)this.L_0 != null;
   }

   public boolean m() {
      this.b();
      return (class07438)this.L_1 != null;
   }

   public void y(class07438 var1) {
      this.b();
      this.L_1 = var1;
   }

   public void y(int var1) {
      this.b();
      this.L_2 = var1;
   }

   public void N(class07438 var1) {
      this.b();
      this.L_0 = var1;
   }

   public void N(int var1) {
      this.b();
      this.L_3 = var1;
   }

   public static void N(class07438 var0, int var1) {
      TargetEsp var2 = class11938.u().r();
      class07438 var3 = (class07438)var2.L_1;
      var2.y(var0);
      if (var0 != null) {
         var2.N(var0);
      }

      var2.y(class11938.j().y());
      var2.N(var1);
      if (var3 != var0) {
         class11938.L().L(class11374.N(var3, var0));
      }
   }

   @class11782
   public void N(class10996 var1) {
      this.b();
      if (this.s()) {
         ((class11807)((class11517)this.L_4).i()).y(var1);
      }
   }

   @class11782
   public void N(class09321 var1) {
      this.b();
      if (this.s()) {
         ((class11807)((class11517)this.L_4).i()).y(var1);
      }
   }
}
