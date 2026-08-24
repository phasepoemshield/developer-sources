package kotakbaz.rain.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

// $VF: Compiled from ItemCooldownEntryAccessor.java
@Mixin(targets = "net/minecraft/class_1796$class_1797")
public interface ItemCooldownEntryAccessor {
   @Accessor("comp_3083")
   int rain$getStartTick();

   @Accessor("comp_3084")
   int rain$getEndTick();
}
