package org.zenith.core;

import org.zenith.event.Event18Ext3;
import org.zenith.event.EventRenderScreenHook;
import org.zenith.util.Item;

import org.zenith.ZenithClient;


import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;

public class NbtItemSpec extends ItemSpec {
   public NbtItemSpec(String var1, String var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public boolean on23(ItemStack var1) {
      NbtComponent nbtcomponent = var1.get(DataComponentTypes.CUSTOM_DATA);
      if (nbtcomponent != null
         && nbtcomponent.getNbt()
            .contains(ZenithClient.on23().CloudApiClient().soundEvent7() ? "custom-enchantments" : "Enchantments", 9)) {
         NbtList nbtlist = nbtcomponent.getNbt()
            .getList(ZenithClient.on23().CloudApiClient().soundEvent7() ? "custom-enchantments" : "Enchantments", 10);

         for (int i = 0; i < nbtlist.size(); i++) {
            NbtCompound nbtcompound = nbtlist.getCompound(i);
            String s = nbtcompound.getString(ZenithClient.on23().CloudApiClient().soundEvent7() ? "type" : "id");
            int j = nbtcompound.getInt(ZenithClient.on23().CloudApiClient().soundEvent7() ? "level" : "lvl");
            if (s.equals(this.Event18Ext3)) {
               return j >= this.EventRenderScreenHook;
            }
         }
      }

      return false;
   }
}
