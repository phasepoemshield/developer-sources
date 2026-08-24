/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Pseudo
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.\u0644;

@Mixin(targets={"other/figura/config/ConfigManager"}, remap=false)
@Pseudo
public abstract class MixinFiguraConfigManager {
    @Inject(method={"init"}, at={@At(value="TAIL")}, remap=false)
    private static void rain$applyHiddenFiguraRuntimeConfig(CallbackInfo ci) {
        \u0644.applyRuntimeConfig();
    }
}

