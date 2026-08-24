package kotakbaz.rain.mixin;

import java.util.Map;
import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

// $VF: Compiled from ItemCooldownManagerAccessor.java
@Mixin(ItemCooldownManager.class)
public interface ItemCooldownManagerAccessor {
   @Accessor("field_8025")
   int rain$getTick();

   @Accessor("field_8024")
   Map<Identifier, Object> rain$getEntries();
}
