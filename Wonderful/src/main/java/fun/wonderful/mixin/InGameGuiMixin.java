package fun.wonderful.mixin;

import fun.wonderful.api.QClient;
import fun.wonderful.api.events.EventInvoker;
import fun.wonderful.api.events.implement.EventRender;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.api.utils.render.blur.BlurProgram;
import net.minecraft.entity.Entity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={InGameHud.class})
public class InGameGuiMixin
implements QClient {
    @Shadow
    @Final
    private MinecraftClient client;

    @Inject(method={"renderVignetteOverlay"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderVignetteOverlay(DrawContext context, Entity entity, CallbackInfo ci) {
        if (ModuleClass.noVignette != null && ModuleClass.noVignette.isEnable()) {
            ci.cancel();
        }
    }

    @Inject(method={"render"}, at={@At(value="HEAD")})
    private void render(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
        BlurProgram.getInstance().beginFrame();
        if (EventInvoker.hasListeners(EventRender.Default.class)) {
            new EventRender.Default(context, tickCounter.getTickDelta(true)).call();
        }
    }
}
