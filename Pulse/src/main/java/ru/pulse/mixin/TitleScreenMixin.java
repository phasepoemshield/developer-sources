package ru.pulse.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.pulse.Pulse;

@Mixin({TitleScreen.class})
public class TitleScreenMixin {
    @Inject(method = {"init"}, at = {@At("TAIL")})
    private void onInit(CallbackInfo callbackInfo) {
        Pulse.checkAndShowUpdate((TitleScreen)(Object)this);
    }
}
