package fun.nexisdlc.mixins.render;

import fun.nexisdlc.modules.impl.render.Beautifully;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.client.gui.widget.PressableWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PressableWidget.class)
public abstract class PressableWidgetMixin extends ClickableWidget {
    public PressableWidgetMixin(int x, int y, int width, int height, Text message) {
        super(x, y, width, height, message);
    }

    @Inject(method = "renderWidget", at = @At("HEAD"), cancellable = true)
    private void nexis$renderBeautifulButton(DrawContext context, int mouseX, int mouseY, float deltaTicks, CallbackInfo ci) {
        if (!Beautifully.shouldRenderCustomButtonWidgets()) {
            return;
        }

        Beautifully.queueButton(this);
        ci.cancel();
    }
}
