package sg.mx;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import ru.destra.core.DestraClient;
import ru.destra.gui.Theme2DManager;
import ru.destra.misc.ThemeManager;
import ru.destra.util.NamedColor;

// Forces hit particles to use the visible interface theme color (Theme2DManager / uiColorMode)
// instead of ThemeManager.getThemeColor(), which reflects the separate `themeMode` preset
// (defaults to the first gradient theme "Theme Name Red", RGB 255/58/58) and not the color the
// user actually selected for the UI.
//
// ParticlesModule.onWorldRender computes `color = useThemeColor ? getThemeManager().getThemeColor(90)
// : customColor`. With `useThemeColor` ON (the default) this returned Red, so particles were red
// even though the user's UI theme is purple. We wrap the getThemeColor call and substitute the
// Theme2DManager current color (the purple the user sees); if it is unavailable we fall back to
// the original behaviour so the module never breaks.
@Mixin(targets = "ru/destra/module/ParticlesModule", remap = false)
public abstract class ParticlesModuleThemeColorMixin {

    @WrapOperation(
        method = "onWorldRender",
        at = @At(value = "INVOKE", target = "Lru/destra/misc/ThemeManager;getThemeColor(I)I"),
        remap = false
    )
    private int destra$wrapParticleThemeColor(ThemeManager themeManager, int index, Operation<Integer> original) {
        int ui = destra$uiThemeColor();
        return ui != -1 ? ui : original.call(themeManager, index);
    }

    @Unique
    private static int destra$uiThemeColor() {
        try {
            DestraClient dc = DestraClient.getInstance();
            if (dc != null && dc.theme2DManager != null) {
                Theme2DManager tm = dc.theme2DManager;
                NamedColor nc = tm.getCurrentColor();
                if (nc != null && nc.getColor() != null) {
                    return nc.getColor().getRGB();
                }
            }
        } catch (Throwable ignored) {
        }
        return -1;
    }
}
