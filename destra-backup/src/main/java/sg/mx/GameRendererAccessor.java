package sg.mx;

import net.minecraft.client.render.GameRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(GameRenderer.class)
public interface GameRendererAccessor {
   @Accessor("fovMultiplier")
   float getFov();

   @Accessor("lastFovMultiplier")
   float getOldFov();
}
