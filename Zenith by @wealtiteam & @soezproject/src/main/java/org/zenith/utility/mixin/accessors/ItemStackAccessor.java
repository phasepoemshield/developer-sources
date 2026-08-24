package org.zenith.utility.mixin.accessors;

import org.zenith.module.Module;
import org.zenith.util.Item;

import org.zenith.module.Interface;

import org.zenith.module.Interface;














import net.minecraft.component.MergedComponentMap;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({ItemStack.class})
public interface ItemStackAccessor {
   @Accessor("components")
   MergedComponentMap getComponents();
}
