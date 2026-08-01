package sg.mx;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.module.ThemesModule;

// Removes every "blur" toggle from the Themes module so the user no longer sees or interacts with
// them, and turns the corresponding features off.
//
// ThemesModule.<init> registers:
//   * hudBlurEnabled          ("Блюр HUD-элементов", BooleanSetting, default true) — drives
//     HudBlurRenderer.isBlurEnabled(); has a companion hudBlurStrength NumberSetting whose
//     visibility is gated on hudBlurEnabled.isEnabled().
//   * hudBlurStrength         ("Сила блюра HUD", NumberSetting) — orphaned once the toggle is gone.
//   * vanillaBackgroundBlurEnabled ("Ванильный блюр фона", BooleanSetting, default true) — drives
//     the vanilla screen background blur.
//
// The user does not want the "Enable Blur" setting(s). ThemesModule is a precompiled .class, so
// this mixin runs at the end of the constructor and, for each blur setting:
//   1. flips Setting.value to Boolean.FALSE so the feature is off (BooleanSetting.isEnabled()
//      returns false), and
//   2. removes the setting from Module.settings so it no longer appears in the GUI.
//
// The fields stay non-null so existing consumers (HudBlurRenderer, ClickGuiScreen) keep working;
// they simply read isEnabled() == false. If you only want one of the two blur toggles removed,
// delete the corresponding block below.
@Mixin(targets = "ru/destra/module/ThemesModule", remap = false)
public abstract class ThemesModuleBlurMixin {

    @Inject(method = "<init>", at = @At("RETURN"), remap = false)
    private void destra$removeBlurSetting(CallbackInfo ci) {
        try {
            ThemesModule self = (ThemesModule) (Object) this;

            if (self.hudBlurEnabled != null) {
                self.hudBlurEnabled.value = Boolean.FALSE;
                self.removeSetting(self.hudBlurEnabled);
            }
            if (self.hudBlurStrength != null) {
                self.removeSetting(self.hudBlurStrength);
            }
            if (self.vanillaBackgroundBlurEnabled != null) {
                self.vanillaBackgroundBlurEnabled.value = Boolean.FALSE;
                self.removeSetting(self.vanillaBackgroundBlurEnabled);
            }
        } catch (Throwable ignored) {
        }
    }
}
