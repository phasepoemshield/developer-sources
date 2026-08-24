package org.zenith.util;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;

class ItemCountUtils_2 extends LinkedHashMap<ItemStack, NbtCompound> {
   ItemCountUtils_2(int var1, float var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   protected boolean removeEldestEntry(Entry<ItemStack, NbtCompound> var1) {
      return this.size() > 100;
   }
}
