package org.zenith.module;

import org.zenith.util.Item;

import org.zenith.core.VisualSettingsStore;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;

record Predictions_Var143(ItemStack itemStack10, Vec3d vec3d30, int int191) {

   public ItemStack double108() {
      return this.itemStack10;
   }

   public Vec3d VisualSettingsStore() {
      return this.vec3d30;
   }

   public int getTicks() {
      return this.int191;
   }
}
