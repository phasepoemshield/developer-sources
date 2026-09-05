package org.wild.mixin.acceser;

import net.minecraft.class_898;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_898.class})
public interface EntityRenderDispatcherAccessor {
   @Accessor("renderShadows")
   boolean night$getRenderShadows();

   @Accessor("renderShadows")
   void night$setRenderShadows(boolean var1);
}
