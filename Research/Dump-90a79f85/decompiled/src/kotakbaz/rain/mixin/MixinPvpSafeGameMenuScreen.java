/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4185
 *  net.minecraft.class_433
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.mixin.GameMenuScreenAccessor;
import kotakbaz.rain.module.modules.player.I;
import net.minecraft.class_4185;
import net.minecraft.class_433;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_433.class})
public class MixinPvpSafeGameMenuScreen {
    @Unique
    private boolean rain$disabledByPvpSafe;

    public MixinPvpSafeGameMenuScreen() {
        super();
    }

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
        class_4185 exitButton = ((GameMenuScreenAccessor)((Object)this)).rain$getExitButton();
        if (exitButton == null) {
            return;
        }
        boolean shouldBlock = I.INSTANCE.shouldBlockDisconnectButton();
        if (shouldBlock) {
            exitButton.field_22763 = false;
            this.rain$disabledByPvpSafe = true;
            return;
        }
        if (this.rain$disabledByPvpSafe) {
            exitButton.field_22763 = true;
            this.rain$disabledByPvpSafe = false;
        }
    }
}

