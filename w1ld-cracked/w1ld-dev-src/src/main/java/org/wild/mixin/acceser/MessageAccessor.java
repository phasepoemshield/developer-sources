package org.wild.mixin.acceser;

import net.minecraft.class_2561;
import net.minecraft.class_4185.class_7840;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_7840.class})
public interface MessageAccessor {
   @Accessor("message")
   class_2561 getMessage();
}
