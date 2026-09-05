package org.wild.mixin.acceser;

import net.minecraft.class_8113.class_8122;
import net.minecraft.class_8113.class_8122.class_8226;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_8122.class})
public interface IItemDisplayEntity {
   @Accessor("data")
   class_8226 client$data();
}
