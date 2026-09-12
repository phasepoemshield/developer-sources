package Nursultan;

import java.util.List;
import java.util.function.Predicate;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07438;

public class class11094 implements Predicate<class07049> {
   public Object N_0;

   class11094(AttackAura var1) {
      this.y();
      this.N_0 = var1;
   }

   static {
      N();
   }

   private void y() {
   }

   public boolean test(class07049 var1) {
      if (var1 == null
         || var1.method_73183() != (class03448)AttackAura.y((AttackAura)this.N_0).T_3
         || !var1.method_5805()
         || var1 == ((class04453)AttackAura.L((AttackAura)this.N_0).T_4).method_5854()) {
         return false;
      } else if (var1 instanceof class07438 var2) {
         if (((List)((class11523)((AttackAura)this.N_0).L_1).i()).stream().noneMatch(var1x -> var1x.test((class07049)var2))) {
            return false;
         } else if (!((AttackAura)this.N_0).N(var2)) {
            return false;
         } else {
            double var3 = ((AttackAura)this.N_0).d();
            class06889 var5 = ((class11079)((class11517)((AttackAura)this.N_0).L_3).i()).N(var2, var3);
            class06889 var6 = ((class04453)AttackAura.N((AttackAura)this.N_0).T_4).method_33571();
            class06889 var7 = class11505.N(var5).U().L(var3).i(var6);
            return class11892.N(var6, var7, var1) ? false : ((AttackAura)this.N_0).l() || !((AttackAura)this.N_0).N(var5, var1);
         }
      } else {
         return false;
      }
   }

   private static void N() {
   }
}
