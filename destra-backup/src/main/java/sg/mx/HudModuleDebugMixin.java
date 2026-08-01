package sg.mx;

import java.util.HashSet;
import java.util.Set;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets = "ru/destra/module/HudModule", remap = false)
public abstract class HudModuleDebugMixin {

    private static final Set<String> loggedModules = new HashSet<>();

    @Inject(method = "onHudOverlay", at = @At("HEAD"), remap = false)
    private void destra$debugHudOverlay(ru.destra.hud.HudOverlayRenderer var1, CallbackInfo ci) {
        try {
            Class<?> hudModuleClass = Class.forName("ru.destra.module.HudModule");
            java.lang.reflect.Field scaleField = hudModuleClass.getDeclaredField("currentScale");
            scaleField.setAccessible(true);
            float scale = scaleField.getFloat(this);

            java.lang.reflect.Field alphaField = hudModuleClass.getDeclaredField("currentAlpha");
            alphaField.setAccessible(true);
            float alpha = alphaField.getFloat(this);

            Class<?> moduleClass = Class.forName("ru.destra.core.Module");
            java.lang.reflect.Field enabledField = moduleClass.getDeclaredField("enabled");
            enabledField.setAccessible(true);
            boolean enabled = enabledField.getBoolean(this);

            java.lang.reflect.Field nameField = moduleClass.getDeclaredField("name");
            nameField.setAccessible(true);
            String name = (String) nameField.get(this);

            if (loggedModules.add(name)) {
                // Removed console spam
            }
        } catch (Throwable t) {
            // Removed console spam
        }
    }
}
