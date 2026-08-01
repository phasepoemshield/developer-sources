package fun.nexisdlc.mixins.render;

import fun.nexisdlc.ClientContainer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import net.minecraft.client.gui.widget.EntryListWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntryListWidget.class)
public abstract class EntryListWidgetBackgroundMixin {
    @Inject(method = "drawMenuListBackground", at = @At("HEAD"), cancellable = true)
    private void nexis$skipDirtListBackground(DrawContext context, CallbackInfo ci) {
        if (ClientContainer.isHide()) {
            return;
        }

        var screen = MinecraftClient.getInstance().currentScreen;
        if (screen instanceof SelectWorldScreen || screen instanceof MultiplayerScreen) {
            ci.cancel();
        }
    }
}
