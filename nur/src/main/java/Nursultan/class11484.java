package Nursultan;

import java.util.List;
import java.util.Objects;
import minecraft.class03386;
import minecraft.class06202;
import minecraft.class06889;
import org.joml.Vector2f;

public class class11484 extends class11473<class11481> {
   public Object y_0;

   public class11484() {
      this.u();
      this.y_0 = class06202.Nq();
   }

   private void u() {
   }

   @Override
   public void N(class10996 var1) {
      class06889 var2 = class11925.y();

      for (class11481 var4 : this.N()) {
         if (!Objects.equals(var4.s(), class11910.L())) {
            var4.y(true);
         } else {
            var4.N((int)var2.R(var4.W()));
            var4.y(false);
         }
      }
   }

   @Override
   public void N(class10967 var1) {
      this.u();
      List<class11481> var2 = this.N();
      if (!var2.isEmpty()) {
         class09093 var3 = class09080.u();
         byte var4 = 18;

         for (class11481 var6 : var2) {
            if (!var6.b()) {
               class06889 var7 = var6.W().u(((class03386)((class06202)this.y_0).i_5).s().y());
               Vector2f var8 = class11925.N((float)var7.M, (float)var7.B, (float)var7.Z);
               if (var8 != null) {
                  var8 = var8.round();
                  String var9 = var6.m() + " " + var6.E() + "m";
                  class11176.N(var3, var9, 18, var8.x, var8.y);
               }
            }
         }
      }
   }

   @Override
   public void N(class09321 var1) {
   }
}
