package sg.mx;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ChatScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.destra.animation.TimedAnimation;
import ru.destra.core.Module;
import ru.destra.module.NotificationsHudModule;
import ru.destra.util.Direction;

/**
 * In chat HUD editor, allow dragging even when the module is disabled and even when
 * width/height are still 0 (use fallback hitbox).
 */
@Mixin(targets = "ru/destra/hud/DraggableHudElement", remap = false)
public abstract class DestraHudDragFixMixin {

    private static final float FALLBACK_WIDTH = 90.0F;
    private static final float FALLBACK_HEIGHT = 36.0F;

    @Shadow
    public Module module;

    @Shadow
    public float width;

    @Shadow
    public float height;

    @Shadow
    public boolean isDragging;

    @Shadow
    public float dragOffsetX;

    @Shadow
    public float dragOffsetY;

    @Shadow
    public TimedAnimation dragHighlightAnim;

    @Shadow
    public abstract float getRenderX();

    @Shadow
    public abstract float getRenderY();

    @Shadow
    public abstract void openSettingsPanel(float x, float y);

    @Inject(method = "onMouseClicked", at = @At("HEAD"), cancellable = true, remap = false)
    private void destra$dragInChatEditor(double mouseX, double mouseY, int button,
                                         CallbackInfoReturnable<Boolean> cir) {
        MinecraftClient mc = MinecraftClient.getInstance();
        if (mc == null || !(mc.currentScreen instanceof ChatScreen)) {
            return;
        }
        Module mod = this.module;
        if (mod == null || mod instanceof NotificationsHudModule) {
            return;
        }

        // Ensure a usable hitbox (zero size makes original hit-test always miss)
        if (width <= 0.0F) width = FALLBACK_WIDTH;
        if (height <= 0.0F) height = FALLBACK_HEIGHT;

        // Original rejects disabled modules; handle those here. Enabled modules fall
        // through to the original path with the hitbox already patched above.
        if (mod.enabled) {
            return;
        }

        float rx = getRenderX();
        float ry = getRenderY();
        boolean inside = mouseX >= rx && mouseX <= rx + width
                && mouseY >= ry && mouseY <= ry + height;
        if (!inside) {
            return;
        }

        if (button == 1) {
            openSettingsPanel((float) mouseX, (float) mouseY);
            cir.setReturnValue(true);
        } else if (button == 0) {
            isDragging = true;
            dragOffsetX = (float) (mouseX - rx);
            dragOffsetY = (float) (mouseY - ry);
            if (dragHighlightAnim != null) {
                dragHighlightAnim.setDirection(Direction.FORWARDS);
            }
            cir.setReturnValue(true);
        }
    }
}
