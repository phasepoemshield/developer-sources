package kotakbaz.rain.mixin;

import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

// $VF: Compiled from MinecraftClientAccessor.java
@Mixin(MinecraftClient.class)
public interface MinecraftClientAccessor {
   @Accessor("field_1752")
   void rain$setItemUseCooldown(int var1);

   @Accessor("field_1752")
   int rain$getItemUseCooldown();
}
