package fun.nexisdlc.mixins.client;

import net.minecraft.client.option.GameOptions;
import net.minecraft.client.option.SimpleOption;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameOptions.class)
public class GameOptionsMixin {
    @Shadow
    public SimpleOption<Double> getGamma() {
        return null;
    }

    @Unique
    private Double nexis$gammaBackup;

    @Inject(method = "write", at = @At("HEAD"))
    private void nexis$clampGammaForSave(CallbackInfo ci) {
        double value = this.getGamma().getValue();
        if (value > 1.0) {
            nexis$gammaBackup = value;
            this.getGamma().setValue(1.0);
        }
    }

    @Inject(method = "write", at = @At("RETURN"))
    private void nexis$restoreGammaAfterSave(CallbackInfo ci) {
        if (nexis$gammaBackup != null) {
            this.getGamma().setValue(nexis$gammaBackup);
            nexis$gammaBackup = null;
        }
    }

    @Redirect(
            method = "write",
            at = @At(
                    value = "INVOKE",
                    target = "Lorg/slf4j/Logger;error(Ljava/lang/String;Ljava/lang/Throwable;)V"
            ),
            remap = false
    )
    private void silenceGeneralError(Logger instance, String message, Throwable t) {
        if (message != null && message.contains("Failed to save options")) {
            return;
        }
        instance.error(message, t);
    }
}
