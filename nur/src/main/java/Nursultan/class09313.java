package Nursultan;

import java.util.UUID;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00482;
import minecraft.class03132;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06685;
import minecraft.class06702;
import minecraft.class07254;
import minecraft.class07262;
import minecraft.class08068;

public class class09313 implements class07262, class11826<class10990> {
   public Object N_0;
   public Object N_1;

   private void L() {
   }

   public class09313() {
      this.L();
      this.N_0 = class11938.U();
      this.N_1 = class06202.Nq();
   }

   static {
      y();
      N();
   }

   private static void y() {
   }

   public void N(UUID var1, class00392 var2, float var3, class06685 var4, class06702 var5, boolean var6, boolean var7, boolean var8) {
      if (var2.getString().toLowerCase().contains("pvp") && (class04453)((class06202)this.N_1).T_4 != null) {
         class11815 var9 = ((class11822)((class04453)((class06202)this.N_1).T_4)).dataManager().y().N();
         var9.N(var1);
         var9.N(true);
      }
   }

   public void listen(class10990 var1) {
      class00381<?> var2 = var1.u();
      class11920.N(var2, var1x -> ((class06202)this.N_1).execute(() -> {
            if ((class04453)((class06202)this.N_1).T_4 != null) {
               ((class11796)((class11825)((class04453)((class06202)this.N_1).T_4)).dataManager()).N().N(var1x);
            }
         }));
      switch (var2) {
         case null:
         default:
            break;
         case class07254 var5:
            ((class06202)this.N_1).execute(() -> this.N(var5));
            break;
         case class03132 var6:
            ((class06202)this.N_1).execute(() -> {
               ((class11459)this.N_0).N(var6.N());
               ((class11459)this.N_0).N();
            });
            break;
         case class08068 var7:
            ((class06202)this.N_1).execute(((class11459)this.N_0)::L);
            break;
         case class00482 var8:
            ((class06202)this.N_1).execute(((class11459)this.N_0)::N);
      }
   }

   private static void N() {
   }

   public void N(UUID var1) {
      if ((class04453)((class06202)this.N_1).T_4 != null) {
         class11815 var2 = ((class11796)((class11825)((class04453)((class06202)this.N_1).T_4)).dataManager()).y().N();
         if (var2.N() && var2.y() != null && var2.y().equals(var1)) {
            var2.N(null);
            var2.N(false);
         }
      }
   }

   private void N(class07254 var1) {
      var1.N(this);
   }
}
