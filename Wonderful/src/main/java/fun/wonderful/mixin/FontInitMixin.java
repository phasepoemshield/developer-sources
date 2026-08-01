package fun.wonderful.mixin;

import fun.wonderful.api.utils.render.fonts.msdf.Fonts;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={MinecraftClient.class})
public class FontInitMixin {
    @Unique
    private boolean wonderful$fontsInitialized;

    @Inject(method={"tick"}, at={@At(value="HEAD")})
    private void wonderful$initFontsWhenReady(CallbackInfo ci) {
        if (this.wonderful$fontsInitialized) {
            return;
        }
        MinecraftClient client = (MinecraftClient)(Object)this;
        if (!client.isFinishedLoading()) {
            return;
        }
        this.wonderful$fontsInitialized = true;
        fun.wonderful.api.utils.render.fonts.ttf.Fonts.init();
        Fonts.init();
    }
}
