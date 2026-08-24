package org.zenith.utility.mixin.accessors;

import org.zenith.module.Module;
import org.zenith.rotation.Rotation;
import org.zenith.util.Item;

import org.zenith.module.Interface;

import org.zenith.module.Interface;














import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.decoration.ItemFrameEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({ItemFrameEntity.class})
public interface ItemFrameEntityAccessor {
   @Accessor("ROTATION")
   static TrackedData<Integer> getRotationData() {
      throw new AssertionError();
   }

   @Accessor("ITEM_STACK")
   static TrackedData<net.minecraft.item.ItemStack> getItemStackData() {
      throw new AssertionError();
   }
}
