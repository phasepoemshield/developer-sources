/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.mixin.GameMenuScreenAccessor;
import kotakbaz.rain.module.modules.player.PvpSafeModule;
import net.minecraft.client.gui.screen.GameMenuScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GameMenuScreen.class})
public class MixinPvpSafeGameMenuScreen {
    @Unique
    private boolean rain$disabledByPvpSafe;

    @Inject(method={"method_25426"}, at={@At(value="RETURN")})
    private void rain$updateButtonOnInit(CallbackInfo ci) {
        this.rain$updateExitButton();
    }

    @Inject(method={"method_25393"}, at={@At(value="TAIL")})
    private void rain$updateButtonOnTick(CallbackInfo ci) {
        this.rain$updateExitButton();
    }

    @Unique
    private void rain$updateExitButton() {
        ButtonWidget exitButton = ((GameMenuScreenAccessor)((Object)this)).rain$getExitButton();
        if (exitButton == null) {
            return;
        }
        boolean shouldBlock = PvpSafeModule.INSTANCE.shouldBlockDisconnectButton();
        if (shouldBlock) {
            exitButton.active = false;
            this.rain$disabledByPvpSafe = true;
            return;
        }
        if (this.rain$disabledByPvpSafe) {
            exitButton.active = true;
            this.rain$disabledByPvpSafe = false;
        }
    }
}

