package sg.mx;

import net.minecraft.client.gui.DrawContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.render.ItemStackRenderer;

@Mixin(DrawContext.class)
public class OptimizedItemDrawContextMixin {
   @Inject(method = "draw", at = @At("HEAD"))
   private void destra$flushOptimizedItemRender(CallbackInfo var1) {
      ItemStackRenderer.flushAll();
   }
}
