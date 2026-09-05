package org.wild.mixin.acceser;

import java.util.Map;
import net.minecraft.class_1796;
import net.minecraft.class_2960;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_1796.class})
public interface ItemCooldownManagerAccessor {
   @Accessor("entries")
   Map<class_2960, ?> wild$getEntries();

   @Accessor("tick")
   int wild$getTick();
}
