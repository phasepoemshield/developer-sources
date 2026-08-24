package org.zenith.util;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.minecraft.item.ItemStack;

class ItemCountUtils_1 extends LinkedHashMap<ItemStack, Integer> {
   ItemCountUtils_1(int var1, float var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   protected boolean removeEldestEntry(Entry<ItemStack, Integer> var1) {
      return this.size() > 256;
   }
}
