package zenith;

import net.minecraft.item.ItemStack;

@FunctionalInterface
interface AutoBrewing$EventTarget {
   boolean matches(ItemStack ItemStack);
}
