package fun.nexisdlc.mixins.render;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.ui.screen.VanillaScreenReloadFade;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Screen.class)
public abstract class VanillaScreenReloadFadeMixin {
    @Inject(method = "render", at = @At("TAIL"))
    private void nexis$renderReloadFade(DrawContext context, int mouseX, int mouseY, float deltaTicks, CallbackInfo ci) {
        if (ClientContainer.isHide()) {
            return;
        }

        Screen screen = (Screen) (Object) this;
        float alpha = VanillaScreenReloadFade.getFadeOverlayAlpha(screen);
        if (alpha <= 0.0f) {
            return;
        }

        MinecraftClient client = MinecraftClient.getInstance();
        if (client == null || client.getWindow() == null) {
            return;
        }

        int width = client.getWindow().getScaledWidth();
        int height = client.getWindow().getScaledHeight();
        int color = (nexis$alphaToInt(alpha) << 24);
        context.fill(0, 0, width, height, color);
    }

    @Unique
    private int nexis$alphaToInt(float alpha) {
        return MathHelper.clamp((int) (alpha * 255.0f), 0, 255);
    }
}
