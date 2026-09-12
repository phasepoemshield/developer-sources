package Nursultan;

import minecraft.class04039;
import minecraft.class07830;
import minecraft.class08050;

public class class10295 extends class10097 {
   public class10295(class04039 var1) {
      super(var1);
   }

   protected boolean N() {
      int var1 = this.L.z & 15;
      int var2 = this.L.U & 15;
      int var3 = Math.max(var2 - 1, 0);
      int var4 = Math.min(var2 + 1, 15);
      class08050 var5 = this.L.M;
      int var6 = var5.N(class07830.field_13194, var1, var3);
      if (var5.N(class07830.field_13194, var1, var4) >= var6 + 4) {
         return true;
      } else {
         int var8 = Math.max(var1 - 1, 0);
         int var9 = Math.min(var1 + 1, 15);
         int var10 = var5.N(class07830.field_13194, var8, var2);
         int var11 = var5.N(class07830.field_13194, var9, var2);
         return var10 >= var11 + 4;
      }
   }
}
