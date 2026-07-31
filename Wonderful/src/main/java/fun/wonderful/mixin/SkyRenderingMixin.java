package fun.wonderful.mixin;

import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.api.utils.render.sky.SkyShaderRenderer;
import fun.wonderful.client.modules.impl.render.WorldTweaks;
import net.minecraft.client.render.SkyRendering;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={SkyRendering.class})
public class SkyRenderingMixin {
    @Inject(method={"renderSky"}, at={@At(value="HEAD")}, cancellable=true)
    private void wonderful$renderSky(float red, float green, float blue, CallbackInfo ci) {
        if (ModuleClass.INSTANCE == null) {
            return;
        }
        WorldTweaks tweaks = ModuleClass.worldTweaks;
        if (tweaks != null && tweaks.isShaderSkyEnabled()) {
            SkyShaderRenderer.Mode mode = tweaks.getShaderSkyMode();
            if (mode == SkyShaderRenderer.Mode.POLAR) {
                SkyShaderRenderer.render(mode, tweaks.getPolarColor1(), tweaks.getPolarColor2(), tweaks.getPolarSpeed(), tweaks.getPolarScale());
            } else {
                SkyShaderRenderer.render(mode);
            }
            ci.cancel();
        }
    }
}