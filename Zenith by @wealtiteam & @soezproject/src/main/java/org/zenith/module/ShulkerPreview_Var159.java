package org.zenith.module;

import org.zenith.util.Item;

import org.zenith.core.BotFeatureRegistry;

import net.minecraft.item.tooltip.TooltipData;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;

public final class ShulkerPreview_Var159 implements TooltipData {
   public final DefaultedList<ItemStack> value;

   public ShulkerPreview_Var159(DefaultedList<ItemStack> var1) {
      this.value = var1;
   }

   public DefaultedList<ItemStack> getValue() {
      return this.value;
   }
}
