package sg.mx;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(targets = "net/minecraft/entity/player/ItemCooldownManager$Entry")
public interface CooldownAccessor {
   @Accessor("startTick")
   int getStartTime();

   @Accessor("endTick")
   int getEndTime();
}
