package fun.wonderful.mixin;

import fun.wonderful.client.ui.mainmenu.MainMenu;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={TitleScreen.class})
public class TitleScreenMixin {
    @Inject(method={"init"}, at={@At(value="HEAD")}, cancellable=true)
    private void wonderful$replaceWithMainMenu(CallbackInfo ci) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client != null && !(client.currentScreen instanceof MainMenu)) {
            client.setScreen((Screen)new MainMenu());
            ci.cancel();
        }
    }
}