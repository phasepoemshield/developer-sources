package fun.wonderful.mixin;

import fun.wonderful.api.utils.render.fonts.msdf.Fonts;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={MinecraftClient.class})
public class FontInitMixin {
    @Inject(method={"onFinishedLoading"}, at={@At(value="TAIL")})
    private void onFinishedLoading(CallbackInfo ci) {
        fun.wonderful.api.utils.render.fonts.ttf.Fonts.init();
        Fonts.init();
    }
}