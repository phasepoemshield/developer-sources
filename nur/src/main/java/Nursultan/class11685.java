package Nursultan;

import java.util.ArrayList;
import minecraft.class03448;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07001;
import minecraft.class07709;
import minecraft.class07741;

public class class11685 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;

   public class11328 L() {
      return (class11328)this.N_0;
   }

   public class11685(class11328 var1, class06584 var2) {
      this.R();
      this.N_0 = var1;
      this.N_1 = var2;
   }

   private static class07709 y(class06584 var0) {
      return !var0.R() && (class03448)class06202.Nq().T_3 != null ? (class07709)class06584.L.encodeStart(class11894.N(), var0).result().orElse(null) : null;
   }

   private static boolean y(class07709 var0, class06584 var1) {
      return var0 != null && !var1.R() ? N(var0, y(var1)) : false;
   }

   public class06584 y() {
      return (class06584)this.N_1;
   }

   public class11685 N(boolean var1) {
      this.N_2 = var1;
      return this;
   }

   private static boolean N(class07709 var0, class07709 var1) {
      if (var0 instanceof class07001 var2 && var1 instanceof class07001 var10) {
         if (!var2.i().equals(var10.i())) {
            return false;
         }

         for (String var12 : var2.i()) {
            if (!N(var2.N(var12), var10.N(var12))) {
               return false;
            }
         }

         return true;
      }

      if (!(var0 instanceof class07741 var9) || !(var1 instanceof class07741 var3)) {
         return var0 != null && var0.equals(var1);
      }

      if (var9.size() != var3.size()) {
         return false;
      } else {
         ArrayList var4 = new ArrayList(var3);

         for (class07709 var6 : var9) {
            int var7 = -1;

            for (int var8 = 0; var8 < var4.size(); var8++) {
               if (N(var6, (class07709)var4.get(var8))) {
                  var7 = var8;
                  break;
               }
            }

            if (var7 == -1) {
               return false;
            }

            var4.remove(var7);
         }

         return true;
      }
   }

   public static class11685 N(class06584 var0) {
      var0 = var0.t();
      class07709 var1 = y(var0);
      return new class11685(var1x -> y(var1, var1x), var0);
   }

   public boolean N() {
      return (Boolean)this.N_2;
   }

   private void R() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_2 = false;
      }
   }
}
