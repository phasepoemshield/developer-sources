package l;

import net.minecraft.item.ItemStack;

class Helper237 {
   final String key;
   String name;
   ItemStack icon;
   int count;
   int totalPrice;
   long timeMs;

   Helper237(String var1, String var2, ItemStack var3, int var4, int var5, long var6) {
      this.key = var1;
      this.name = var2 == null ? "" : var2;
      this.icon = var3;
      this.count = var4;
      this.totalPrice = var5;
      this.timeMs = var6;
   }
}
