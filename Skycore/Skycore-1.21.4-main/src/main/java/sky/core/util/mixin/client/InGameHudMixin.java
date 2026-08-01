package sky.core.util.mixin.client;

import com.darkmagician6.eventapi.EventManager;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.render.RenderTickCounter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import sky.core.events.EventRender2D;
import sky.core.ui.hud.HudElementManager;

@Mixin(InGameHud.class)
public class InGameHudMixin {
    @Inject(method = "render", at = @At("HEAD"))
    private void skycore$render2DPre(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
        float partialTicks = tickCounter.getTickDelta(false);
        EventManager.call(new EventRender2D(context.getMatrices(), partialTicks));
        EventManager.call(new EventRender2D.Pre(context.getMatrices(), partialTicks));
    }

    @Inject(method = "render", at = @At("TAIL"))
    private void skycore$render2DPost(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
        float partialTicks = tickCounter.getTickDelta(false);
        EventManager.call(new EventRender2D.Post(context.getMatrices(), partialTicks));
        EventManager.call(new EventRender2D.Send(context.getMatrices(), partialTicks));
        HudElementManager.getInstance().render(context, partialTicks);
    }
}
