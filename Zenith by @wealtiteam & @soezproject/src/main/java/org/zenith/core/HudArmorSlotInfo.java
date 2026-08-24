package org.zenith.core;

import org.zenith.module.Module;
import org.zenith.util.Item;

import org.zenith.module.AutoLeave;


import net.minecraft.item.ItemStack;

record HudArmorSlotInfo(String string38, String string39, int int141, ItemStack itemStack7) {

   public String AutoLeave() {
      return this.string38;
   }

   public String double107() {
      return this.string39;
   }

   public int keyCode() {
      return this.int141;
   }

   public ItemStack double108() {
      return this.itemStack7;
   }
}
