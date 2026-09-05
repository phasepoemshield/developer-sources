package ru.metaculture.protection;

import net.minecraft.class_1309;
import net.minecraft.class_3532;

public final class NnuUuVVVvUu {
   private int UuUVuuUu = -1;

   void UuUVuuUu(uuUuvNuNVNVU var1, class_1309 var2, float var3, float var4) {
      if (var2.method_5628() != this.UuUVuuUu) {
         this.UuUVuuUu(var2.method_5628());
      }

      float var5 = var1.UuUVuuUu + var3;
      float var6 = class_3532.method_15363(var1.C00OOC00oO + var4, -90.0F, 90.0F);
      COC0OCc.UuUVuuUu(new uuUuvNuNVNVU(var5, var6), Math.abs(var3), Math.abs(var4), 20.0F, 20.0F, 1, 15, false);
   }

   public void UuUVuuUu(uuUuvNuNVNVU var1, float var2, float var3, int var4, int var5) {
      this.UuUVuuUu(var1, var2, var3, 20.0F, 20.0F, var4, var5);
   }

   public void UuUVuuUu(uuUuvNuNVNVU var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      this.UuUVuuUu(-1);
      COC0OCc.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, false);
   }

   public void UuUVuuUu() {
      this.UuUVuuUu(-1);
   }

   private void UuUVuuUu(int var1) {
      this.UuUVuuUu = var1;
   }
}
