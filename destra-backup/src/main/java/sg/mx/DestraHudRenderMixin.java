package sg.mx;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.util.HudTickCache;

@Mixin(targets = "net/minecraft/client/gui/hud/InGameHud")
public abstract class DestraHudRenderMixin {

    @Inject(method = "render", at = @At("HEAD"))
    private void destra$cacheRenderTickCounter(DrawContext drawContext, RenderTickCounter tickCounter, CallbackInfo ci) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client == null || client.player == null || client.world == null) return;
        HudTickCache.lastTickCounter = tickCounter;
    }
}
