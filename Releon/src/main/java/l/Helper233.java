package l;

import net.minecraft.item.ItemStack;

class Helper233 {
   final String nameKey;
   final String displayName;
   final String nameNorm;
   final ItemStack icon;
   final int count;
   final int price;
   final long timeMs;

   Helper233(String var1, String var2, String var3, ItemStack var4, int var5, int var6, long var7) {
      this.nameKey = var1 == null ? "" : var1;
      this.displayName = var2 == null ? "" : var2;
      this.nameNorm = var3 == null ? "" : var3;
      this.icon = var4;
      this.count = var5;
      this.price = var6;
      this.timeMs = var7;
   }
}
