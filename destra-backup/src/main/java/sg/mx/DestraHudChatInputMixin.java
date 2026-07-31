package sg.mx;

import java.lang.reflect.Method;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ChatScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.destra.animation.TimedAnimation;
import ru.destra.core.Module;
import ru.destra.gui.ScreenAnimationManager;
import ru.destra.hud.DraggableHudElement;
import ru.destra.hud.DraggableHudManager;
import ru.destra.module.NotificationsHudModule;
import ru.destra.render.ScaledResolution;
import ru.destra.util.Direction;

/**
 * Reliable HUD editor input in chat: pick the smallest overlapping element under
 * the cursor (stacked HUD cluster), drag with LMB, open settings with RMB.
 */
@Mixin(value = ChatScreen.class, priority = 2000)
public abstract class DestraHudChatInputMixin {

    private static final float FALLBACK_WIDTH = 90.0F;
    private static final float FALLBACK_HEIGHT = 36.0F;
    private static Method managerClickMethod;

    @Inject(method = "mouseClicked", at = @At("HEAD"), cancellable = true)
    private void destra$hudEditorClick(double mouseX, double mouseY, int button,
                                       CallbackInfoReturnable<Boolean> cir) {
        MinecraftClient mc = MinecraftClient.getInstance();
        if (mc == null || mc.player == null || mc.getWindow() == null) return;
        if (DraggableHudManager.elements == null || DraggableHudManager.elements.isEmpty()) return;

        double adjY = ScreenAnimationManager.Ч((ChatScreen) (Object) this, mouseY);
        float sx = ScaledResolution.toScaledCoord(mouseX, 2);
        float sy = ScaledResolution.toScaledCoord(adjY, 2);

        if (DraggableHudElement.handleMouseClicked(sx, sy, button)) {
            cir.setReturnValue(true);
            return;
        }

        DraggableHudElement hit = destra$pickElement(sx, sy);
        if (hit == null) {
            // Add-popup / selection handling (ChatScreenMixin.click is nop'd)
            destra$managerClick(sx, sy, button);
            if (DraggableHudManager.isInputConsumed()) {
                cir.setReturnValue(true);
            }
            return;
        }

        if (hit.getModule() instanceof NotificationsHudModule) {
            return;
        }

        if (hit.width <= 0.0F) hit.width = FALLBACK_WIDTH;
        if (hit.height <= 0.0F) hit.height = FALLBACK_HEIGHT;

        float rx = hit.getRawX();
        float ry = hit.getY();

        // Clear multi-select so individual drag isn't blocked by group-drag lock
        if (DraggableHudManager.selectedElements != null) {
            DraggableHudManager.selectedElements.clear();
        }

        if (button == 1) {
            destra$openSettings(hit, sx, sy);
            cir.setReturnValue(true);
            return;
        }
        if (button == 0) {
            hit.isDragging = true;
            hit.dragOffsetX = sx - rx;
            hit.dragOffsetY = sy - ry;
            TimedAnimation highlight = hit.dragHighlightAnim;
            if (highlight != null) {
                highlight.setDirection(Direction.FORWARDS);
            }
            cir.setReturnValue(true);
        }
    }

    @Inject(method = "mouseDragged", at = @At("HEAD"), cancellable = true)
    private void destra$hudEditorDrag(double mouseX, double mouseY, int button, double deltaX, double deltaY,
                                      CallbackInfoReturnable<Boolean> cir) {
        if (button != 0) return;
        if (DraggableHudManager.elements == null) return;

        double adjY = ScreenAnimationManager.Ч((ChatScreen) (Object) this, mouseY);
        float sx = ScaledResolution.toScaledCoord(mouseX, 2);
        float sy = ScaledResolution.toScaledCoord(adjY, 2);

        boolean any = false;
        for (Object o : DraggableHudManager.elements.values().toArray()) {
            if (!(o instanceof DraggableHudElement)) continue;
            DraggableHudElement el = (DraggableHudElement) o;
            if (!el.isDragging) continue;
            float nx = sx - el.dragOffsetX - el.renderOffsetX;
            float ny = sy - el.dragOffsetY - el.renderOffsetY;
            try {
                float[] clamped = el.clampPosition(nx, ny);
                if (clamped != null && clamped.length >= 2) {
                    el.posX = clamped[0];
                    el.posY = clamped[1];
                } else {
                    el.posX = nx;
                    el.posY = ny;
                }
            } catch (Throwable t) {
                el.posX = nx;
                el.posY = ny;
            }
            any = true;
        }
        if (any) cir.setReturnValue(true);
    }

    private static void destra$managerClick(float sx, float sy, int button) {
        try {
            if (managerClickMethod == null) {
                managerClickMethod = DraggableHudManager.class.getDeclaredMethod(
                        "_", double.class, double.class, int.class);
                managerClickMethod.setAccessible(true);
            }
            managerClickMethod.invoke(null, (double) sx, (double) sy, button);
        } catch (Throwable ignored) {
        }
    }

    /** Smallest overlapping hitbox wins — HUD elements are often stacked. */
    private static DraggableHudElement destra$pickElement(float mx, float my) {
        DraggableHudElement best = null;
        float bestArea = Float.MAX_VALUE;
        for (Object o : DraggableHudManager.elements.values().toArray()) {
            if (!(o instanceof DraggableHudElement)) continue;
            DraggableHudElement el = (DraggableHudElement) o;
            Module mod = el.getModule();
            if (mod == null || mod instanceof NotificationsHudModule) continue;

            float w = el.width > 0.0F ? el.width : FALLBACK_WIDTH;
            float h = el.height > 0.0F ? el.height : FALLBACK_HEIGHT;
            // Match module draw path (getRawX / getY), not getRenderX offsets
            float rx = el.getRawX();
            float ry = el.getY();
            if (mx < rx || my < ry || mx > rx + w || my > ry + h) continue;

            float area = w * h;
            if (area < bestArea) {
                bestArea = area;
                best = el;
            }
        }
        return best;
    }

    private static void destra$openSettings(DraggableHudElement el, float mx, float my) {
        try {
            el.rebuildSettingComponents();
        } catch (Throwable ignored) {
        }
        DraggableHudElement.needsAnchorReset = true;
        el.openSettingsPanel(mx, my);

        // Snap open so the panel is visible immediately (anim was stuck at 0)
        snapAnimForwards(el.settingsPanelOpenAnim);
        snapAnimForwards(el.settingsPanelAlphaAnim);
    }

    private static void snapAnimForwards(TimedAnimation anim) {
        if (anim == null) return;
        anim.setDirection(Direction.FORWARDS);
        try {
            if (anim.timer != null && anim.durationMs > 0) {
                anim.timer.setTime(System.currentTimeMillis() - anim.durationMs);
            }
        } catch (Throwable ignored) {
        }
    }
}
