package Nursultan;

import minecraft.class00014;
import minecraft.class00028;
import minecraft.class00038;
import minecraft.class00042;
import minecraft.class04770;
import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07438;

public class class11336 implements class00038 {
   private final class07438 N;
   private final class00028 y;
   private final class04770 L;
   private float u;

   public void L() {
      this.L.field_13987.method_14364(class00014.N(this.N.method_5667(), this.y, this.u));
   }

   public class11336(class07438 var1, class00028 var2, class04770 var3) {
      this.N = var1;
      this.y = var2;
      this.L = var3;
      class06889 var4 = var3.method_73189().u(var1.method_73189()).U();
      this.u = (float)class04995.u(var4.L(), var4.N());
   }

   public void i() {
      class06889 var1 = this.L.method_73189().u(this.N.method_73189()).U();
      float var2 = (float)class04995.u(var1.L(), var1.N());
      if (class04995.L(var2 - this.u) > 0.008726646F) {
         this.L.field_13987.method_14364(class00014.y(this.N.method_5667(), this.y, var2));
         this.u = var2;
      }
   }

   public void u() {
      this.L.field_13987.method_14364(class00014.N(this.N.method_5667()));
   }

   public boolean y() {
      return class00042.N(this.N, this.L) || class00042.N(this.N.method_31476(), this.L) || !class00042.y(this.N, this.L);
   }
}
