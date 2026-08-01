package sg.mx;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.util.Window;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.core.Module;
import ru.destra.event.Render2DEvent;
import ru.destra.gui.ScreenAnimationManager;
import ru.destra.hud.DraggableHudElement;
import ru.destra.hud.DraggableHudManager;
import ru.destra.render.ScaledResolution;

/**
 * While chat is open, force HUD editor chrome for every draggable element:
 * preview render (so size is set), fallback hitbox, and drag chrome.
 */
@Mixin(ChatScreen.class)
public abstract class DestraHudEditorDispatchMixin {

    private static final String RENDER2D_EVENT_TYPE = "ru.destra.event.Render2DEvent";
    private static final float FALLBACK_WIDTH = 90.0F;
    private static final float FALLBACK_HEIGHT = 36.0F;

    private static final Map<Class<?>, Method> renderMethodCache = new HashMap<>();

    @Inject(method = "render", at = @At("TAIL"))
    private void destra$dispatchHudEditor(DrawContext dc, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        MinecraftClient mc = MinecraftClient.getInstance();
        if (mc == null || mc.player == null) return;
        Window window = mc.getWindow();
        if (window == null) return;
        if (DraggableHudManager.elements == null || DraggableHudManager.elements.isEmpty()) return;

        // Ensure every element has content + non-zero hitbox while editing
        for (Object o : DraggableHudManager.elements.values().toArray()) {
            if (!(o instanceof DraggableHudElement)) continue;
            DraggableHudElement el = (DraggableHudElement) o;
            Module mod = el.getModule();
            if (mod == null) continue;

            // Preview-draw when disabled OR when size was never measured
            if (!mod.enabled || el.width <= 0.0F || el.height <= 0.0F) {
                destra$renderHudPreview(mod, dc);
            }
            if (el.width <= 0.0F) el.width = FALLBACK_WIDTH;
            if (el.height <= 0.0F) el.height = FALLBACK_HEIGHT;
        }

        // Match DestraHudChatInputMixin: animation adjust Y, then toScaledCoord (float)
        double adjY = ScreenAnimationManager.Ч((ChatScreen) (Object) this, (double) mouseY);
        int scaledX = (int) ScaledResolution.toScaledCoord((double) mouseX, 2);
        int scaledY = (int) ScaledResolution.toScaledCoord(adjY, 2);

        ScaledResolution.beginScaled(2);
        try {
            for (Object o : DraggableHudManager.elements.values().toArray()) {
                if (!(o instanceof DraggableHudElement)) continue;
                DraggableHudElement el = (DraggableHudElement) o;
                el.render(dc, scaledX, scaledY, window);
                // Ensure settings panel paints even if module toggle anim gated it
                if (DraggableHudElement.activeSettingsPanel == el) {
                    try {
                        el.renderSettingsPanel(dc);
                    } catch (Throwable ignored) {
                    }
                }
            }
        } finally {
            ScaledResolution.endScaled();
        }
    }

    private static void destra$renderHudPreview(Module mod, DrawContext dc) {
        try {
            Method m = destra$findOnRender2D(mod.getClass());
            if (m == null) return;
            RenderTickCounter tick = ru.destra.util.HudTickCache.lastTickCounter;
            Render2DEvent event = new Render2DEvent(dc, tick);
            m.setAccessible(true);
            m.invoke(mod, event);
        } catch (Throwable ignored) {
        }
    }

    private static Method destra$findOnRender2D(Class<?> cls) {
        Method cached = renderMethodCache.get(cls);
        if (cached != null) return cached;
        Class<?> c = cls;
        Method found = null;
        while (c != null && c != Object.class) {
            for (Method m : c.getDeclaredMethods()) {
                if (m.getReturnType() == void.class && m.getParameterCount() == 1
                        && m.getParameterTypes()[0].getName().equals(RENDER2D_EVENT_TYPE)) {
                    found = m;
                    break;
                }
            }
            if (found != null) break;
            c = c.getSuperclass();
        }
        if (found != null) renderMethodCache.put(cls, found);
        return found;
    }
}
