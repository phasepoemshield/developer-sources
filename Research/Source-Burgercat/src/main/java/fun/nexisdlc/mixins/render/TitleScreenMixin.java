package fun.nexisdlc.mixins.render;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.utils.client.IMinecraft;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin implements IMinecraft {
    @Inject(method = "init", at = @At("HEAD"), cancellable = true)
    private void nexis$openCustomMainMenu(CallbackInfo ci) {
        if (ClientContainer.isHide()) {
            return;
        }

        Nexis nexis = Nexis.getInstance();
        if (nexis == null) {
            nexis = ClientContainer.getNexisInstance();
        }

        var target = nexis.getOrCreateMainMenuScreen();
        if (target != null && mc.currentScreen != target) {
            mc.setScreen(target);
            ci.cancel();
        }
    }
}
