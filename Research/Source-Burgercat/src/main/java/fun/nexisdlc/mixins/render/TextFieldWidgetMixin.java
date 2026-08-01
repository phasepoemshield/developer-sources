package fun.nexisdlc.mixins.render;

import fun.nexisdlc.ui.hud.CustomChatHud;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TextFieldWidget.class)
public class TextFieldWidgetMixin {
    @Inject(method = "renderWidget", at = @At("HEAD"), cancellable = true)
    private void nexis$cancelVanillaChatInput(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        if (MinecraftClient.getInstance().currentScreen instanceof ChatScreen && CustomChatHud.shouldUseCustomChat()) {
            ci.cancel();
        }
    }
}
