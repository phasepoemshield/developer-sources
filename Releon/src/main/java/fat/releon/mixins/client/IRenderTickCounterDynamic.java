package fat.releon.mixins.client;

import net.minecraft.client.render.RenderTickCounter.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({Dynamic.class})
public interface IRenderTickCounterDynamic {
   @Mutable
   @Accessor("tickTime")
   void setTickTime(float var1);
}
