package Nursultan;

import minecraft.class04453;
import minecraft.class06202;

public class class11582 extends class11546 {
   private void L(class10963 var1) {
      String var2 = var1.N();
      String[] var3 = new String[]{" full", " max", " all"};
      String[] var4 = new String[]{"pay ", "clan invest "};
      long var5 = class11910.y().orElse(10L) - 10L;

      for (String var10 : var3) {
         if (var2.endsWith(var10)) {
            for (String var14 : var4) {
               if (var2.startsWith(var14)) {
                  var1.N(var2.replace(var10, " " + var5));
                  return;
               }
            }
         }
      }
   }

   public class11582(ChatHelper var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   public void y(Object var1) {
      if (var1 instanceof class10963 var2) {
         if (!this.y(var2)) {
            if (!this.N(var2)) {
               this.L(var2);
            }
         }
      }
   }

   private boolean y(class10963 var1) {
      if (var1.N().equals("ah me")) {
         var1.N("ah " + ((class04453)((class06202)super.y_0).T_4).method_5820());
         return true;
      } else {
         return false;
      }
   }

   private boolean N(class10963 var1) {
      String var2 = var1.N();
      class09345 var3 = class11938.N();

      for (String var7 : new String[]{"tpa ", "call "}) {
         if (var2.startsWith(var7)) {
            for (class09295 var9 : var3.i()) {
               if (var2.equals(var7 + var9.y())) {
                  var1.N(var7 + var9.N());
                  return true;
               }
            }

            return false;
         }
      }

      return false;
   }
}
