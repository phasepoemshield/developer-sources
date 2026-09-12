package Nursultan;

import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00623;
import minecraft.class06202;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06937;
import minecraft.class07510;

public class class09344 implements class11826<class11368> {
   private void L(class11368 var1) {
      if ((Boolean)class11938.L_3 && class06202.Nq().U() && class06202.Nq().s() && class06202.Nq().L()) {
         var1.N();
         class06584 var2 = var1.L().i();
         if (!var2.R()) {
            class00405 var3 = class00405.N.N(new class00623(class11894.L(var2).toAbsolutePath().toString()));
            class11303.N(class00392.y("Parsed item: ").y(var2.Y()).L(var3));
         }
      }
   }

   private void y(class11368 var1) {
      if (var1.L() != null) {
         class06584 var2 = var1.L().i();
         if (!var2.R()) {
            class06581 var3 = var2.B();
            if (var1.M() == class07510.field_7795 && class06202.Nq().s() && class06202.Nq().L()) {
               for (class06937 var5 : var1.i().T) {
                  if (var5.i().N(var3)) {
                     class11938.m().N(var1.u(), var5.u, 1, class07510.field_7795).y();
                  }
               }
            }
         }
      }
   }

   public void listen(class11368 var1) {
      this.L(var1);
      this.y(var1);
   }
}
