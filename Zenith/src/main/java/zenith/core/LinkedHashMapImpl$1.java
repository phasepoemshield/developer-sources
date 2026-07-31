package zenith;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;

class LinkedHashMapImpl$1 extends LinkedHashMap<ItemStack, NbtCompound> {
   LinkedHashMapImpl$1(int i, float f, boolean flag) {
      super(i, f, flag);
   }

   @Override
   protected boolean removeEldestEntry(Entry<ItemStack, NbtCompound> entry) {
      return this.size() > 100;
   }
}
