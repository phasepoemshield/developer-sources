package Nursultan;

import java.util.Objects;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07843;

public class class10934 extends class10915 {
   public class10934(NoSlow var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   public void y(Object var1) {
      Objects.requireNonNull(var1);
      switch (var1) {
         case class10971 var4:
            if (this.N()) {
               var4.N();
            }
            break;
         case class11354 var5:
            if (this.N()) {
               var5.N(1.0F);
            }
            break;
         case class10996 var6:
            if (!((class04453)((class06202)super.N_0).T_4).method_6115() || !((class04453)((class06202)super.N_0).T_4).k()) {
               return;
            }

            if (!this.N()) {
               return;
            }

            class11499 var7 = class11505.N();
            ((class03443)((class06202)super.N_0).T_2)
               .N(
                  (class03448)((class06202)super.N_0).T_3,
                  var2 -> new class07843(
                        ((class04453)((class06202)super.N_0).T_4).method_6058() == class07050.field_5808 ? class07050.field_5810 : class07050.field_5808,
                        var2,
                        var7.y(),
                        var7.R()
                     )
               );
            return;
      }
   }

   private class06584 N(class07050 var1) {
      return var1 == class07050.field_5810 ? ((class04453)((class06202)super.N_0).T_4).method_6047() : ((class04453)((class06202)super.N_0).T_4).method_6079();
   }

   private boolean N() {
      return !this.N(this.N(((class04453)((class06202)super.N_0).T_4).method_6058()));
   }

   private boolean N(class06584 var1) {
      return class11929.z(var1) != 0;
   }
}
