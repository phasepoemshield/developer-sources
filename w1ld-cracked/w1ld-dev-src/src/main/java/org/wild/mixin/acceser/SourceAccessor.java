package org.wild.mixin.acceser;

import net.minecraft.class_4224;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_4224.class})
public interface SourceAccessor {
   @Accessor("pointer")
   int rtx$getSourceId();
}
