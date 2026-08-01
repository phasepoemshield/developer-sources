package l;

import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.entity.player.ItemCooldownManager.Entry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public final class Helper189 implements Helper160 {
   public static int method1623(Item var0) {
      return method1624(var0.getDefaultStack());
   }

   public static int method1624(ItemStack var0) {
      return switch (var0.getUseAction()) {
         case EAT, DRINK -> 32;
         case CROSSBOW, SPEAR -> 10;
         case BOW -> 20;
         case BLOCK -> 0;
         default -> var0.getMaxUseTime(mc.player);
      };
   }

   public static float method1625(Item var0) {
      ItemCooldownManager var1 = mc.player.getItemCooldownManager();
      Entry var2 = var1.entries.get(var0);
      return var2 == null ? 0.0F : Math.max(0.0F, (var2.endTick - var1.tick) / 20.0F);
   }

   private Helper189() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
