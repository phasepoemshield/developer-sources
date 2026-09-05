package org.wild.mixin.acceser;

import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_312.class})
public interface MouseAccessor {
   @Accessor("cursorLocked")
   boolean getCursorLocked();
}
