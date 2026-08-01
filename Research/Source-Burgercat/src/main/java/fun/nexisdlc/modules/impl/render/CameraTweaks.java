package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.client.events.impl.client.EventKey;
import fun.nexisdlc.client.events.impl.client.EventScroll;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.events.impl.render.EventAspectRatio;
import fun.nexisdlc.client.events.impl.render.EventCamera;
import fun.nexisdlc.client.events.impl.render.EventFov;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.render.animations.Easings;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BindSetting;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.glfw.GLFW;

@FunctionAdd(name = "CameraTweaks", alias = "Camera Tweaks", category = Category.Render, description = "Приближение, кастомный FOV, клип камеры и смена соотношения сторон")
public class CameraTweaks extends Function {
    public static boolean skipFovOverrideForSensitivity = false;

    private static final int DEFAULT_ZOOM_DIVISOR_STEP = 10;
    private static final int SCROLL_BASE = 2;
    private static final int SCROLL_RESOLUTION = 5;
    private static final int SCROLL_STEP_LIMIT = 30;
    private static final long ZOOM_ANIMATION_DURATION = 160;

    private boolean zooming = false;
    private double zoomDivisor = 4.0;
    private float targetZoomStep = DEFAULT_ZOOM_DIVISOR_STEP;
    private float currentZoomStep = DEFAULT_ZOOM_DIVISOR_STEP;

    private final SimpleLinearAnimation zoomAnimation = new SimpleLinearAnimation(ZOOM_ANIMATION_DURATION, Easings.EASE_OUT_CUBIC);
    private float currentZoomMultiplier = 1.0F;
    private float targetZoomMultiplier = 1.0F;

    private boolean zoomSensitivityApplied = false;
    private double cachedSensitivity = 0.5d;

    final BooleanSetting aspectRatio = new BooleanSetting("Aspect ratio", false);
    final ModeSetting aspectRatioMode = new ModeSetting("Пресет", "Custom", "Custom", "16:9", "16:10", "4:3", "21:9", "1:1");
    final SliderSetting aspectRatioValue = new SliderSetting("Множитель", 1.0f, 0.5f, 2.5f, 0.01f);
    final BooleanSetting clipSetting = new BooleanSetting("Камера клип", false);
    final SliderSetting distanceSetting = new SliderSetting("Дистанция камеры от F5", 4f, 2f, 4f, 0.1f);
    final BindSetting zoomSetting = new BindSetting("Приближение", GLFW.GLFW_KEY_C);
    final BooleanSetting customFov = new BooleanSetting("Кастомный фов", false);
    final SliderSetting customFovValue = new SliderSetting("Фов", 110f, 30f, 140f, 1f);

    public CameraTweaks() {
        addSettings(aspectRatio, aspectRatioMode, aspectRatioValue, clipSetting, distanceSetting, zoomSetting, customFov, customFovValue);
        aspectRatioValue.setVisible(() -> aspectRatioMode.is("Custom"));
        setState(true);
    }

    @Override
    public void onDisable() {
        restoreZoomSensitivity();
        super.onDisable();
    }

    @EventHandler
    public void onKey(EventKey e) {
        if (mc.currentScreen != null) return;

        int key = e.getKey();

        if (zooming) {
            if (key == GLFW.GLFW_KEY_EQUAL || key == GLFW.GLFW_KEY_KP_ADD) {
                changeZoomDivisor(true, 1.0);
            } else if (key == GLFW.GLFW_KEY_MINUS || key == GLFW.GLFW_KEY_KP_SUBTRACT) {
                changeZoomDivisor(false, 1.0);
            } else if (key == GLFW.GLFW_KEY_0 || key == GLFW.GLFW_KEY_KP_0) {
                resetZoomDivisor();
            }
        }
    }

    @EventHandler
    public void onScroll(EventScroll e) {
        if (mc.currentScreen != null || !zooming) return;

        double vertical = e.getVertical();
        if (vertical != 0) {
            changeZoomDivisor(vertical > 0, Math.abs(vertical));
        }
    }

    @EventHandler
    public void onUpdate(UpdateEvent e) {
        syncZoomStateWithActualKeyState();
        updateZoomAnimation();
        updateZoomSensitivity();
    }

    @EventHandler
    public void onFov(EventFov e) {
        if (skipFovOverrideForSensitivity) {
            return;
        }

        if (mc.currentScreen != null) {
            return;
        }

        if (!e.isChangingFov()) {
            return;
        }

        updateZoomAnimation();

        if (zoomAnimation.isAnimating() || zooming || customFov.get()) {
            float baseFov = getBaseFov();
            float modifiedFov = baseFov * currentZoomMultiplier;
            e.setFov((int) MathHelper.clamp(modifiedFov, 10, 170));
            e.cancel();
        }
    }

    @EventHandler
    public void onCamera(EventCamera e) {
        e.setCameraClip(clipSetting.get());
        e.setDistance(distanceSetting.get().floatValue());
        e.cancel();
    }

    @EventHandler
    public void onAspectRatio(EventAspectRatio e) {
        if (!aspectRatio.get()) return;

        float nativeAspect = 1.0f;
        if (mc != null && mc.getWindow() != null) {
            nativeAspect = (float) ((double) mc.getWindow().getFramebufferWidth() / (double) mc.getWindow().getFramebufferHeight());
        }

        float targetAspect;
        switch (aspectRatioMode.get().toLowerCase()) {
            case "16:9" -> targetAspect = 16f / 9f;
            case "16:10" -> targetAspect = 16f / 10f;
            case "4:3" -> targetAspect = 4f / 3f;
            case "21:9" -> targetAspect = 21f / 9f;
            case "1:1" -> targetAspect = 1f;
            default -> targetAspect = nativeAspect / aspectRatioValue.get();
        }

        float value = nativeAspect > 0f ? nativeAspect / targetAspect : 1.0f;
        e.setValue(value);
        e.cancel();
    }

    private void updateZoomAnimation() {
        updateSmoothZoomStep();

        float newTarget = (float) (1.0 / zoomDivisor);

        if (zooming) {
            zoomAnimation.show();
        } else {
            zoomAnimation.hide();
        }

        float progress = zoomAnimation.getProgress();
        boolean fullProgress = progress >= 1.0f;

        if (zooming && fullProgress && Math.abs(currentZoomMultiplier - newTarget) > 0.001f) {
            targetZoomMultiplier = newTarget;
            currentZoomMultiplier += (targetZoomMultiplier - currentZoomMultiplier) * 0.25f;
            if (Math.abs(currentZoomMultiplier - targetZoomMultiplier) < 0.001f) {
                currentZoomMultiplier = targetZoomMultiplier;
            }
        } else {
            targetZoomMultiplier = newTarget;
            currentZoomMultiplier = MathHelper.lerp(progress, 1.0F, targetZoomMultiplier);
        }
    }

    private void updateSmoothZoomStep() {
        currentZoomStep += (targetZoomStep - currentZoomStep) * 0.5f;
        if (Math.abs(currentZoomStep - targetZoomStep) < 0.01f) {
            currentZoomStep = targetZoomStep;
        }
        zoomDivisor = currentZoomStep != 0 ? Math.pow(SCROLL_BASE, currentZoomStep / SCROLL_RESOLUTION) : 1.0;
    }

    private void changeZoomDivisor(boolean increase, double amount) {
        if (increase) {
            targetZoomStep = Math.min(targetZoomStep + (float) amount, SCROLL_STEP_LIMIT);
        } else {
            targetZoomStep = Math.max(targetZoomStep - (float) amount, 0);
        }

        if (zooming) {
            zoomAnimation.show();
        }
    }

    private void resetZoomDivisor() {
        targetZoomStep = DEFAULT_ZOOM_DIVISOR_STEP;
        currentZoomStep = targetZoomStep;
        zoomDivisor = Math.pow(SCROLL_BASE, currentZoomStep / SCROLL_RESOLUTION);
    }

    public boolean isZoomActive() {
        return zooming;
    }

    private void updateZoomSensitivity() {
        if (mc == null || mc.options == null || mc.options.getMouseSensitivity() == null) {
            return;
        }

        if (!zooming) {
            restoreZoomSensitivity();
            return;
        }

        if (!zoomSensitivityApplied) {
            cachedSensitivity = mc.options.getMouseSensitivity().getValue();
            zoomSensitivityApplied = true;
        }

        double zoomSensitivity = cachedSensitivity * currentZoomMultiplier;
        mc.options.getMouseSensitivity().setValue(Math.max(0.01, zoomSensitivity));
    }

    private void restoreZoomSensitivity() {
        if (!zoomSensitivityApplied || mc == null || mc.options == null || mc.options.getMouseSensitivity() == null) {
            return;
        }
        mc.options.getMouseSensitivity().setValue(cachedSensitivity);
        zoomSensitivityApplied = false;
    }

    private void syncZoomStateWithActualKeyState() {
        boolean wantZoom = mc.currentScreen == null && isZoomBindPressed();
        if (wantZoom != zooming) {
            zooming = wantZoom;
        }
    }

    private boolean isZoomBindPressed() {
        if (mc == null || mc.getWindow() == null) {
            return false;
        }
        if (mc.currentScreen != null) return false;

        int bind = zoomSetting.get();
        if (bind == -1) {
            return false;
        }

        long windowHandle = mc.getWindow().getHandle();
        if (windowHandle == 0L) {
            return false;
        }

        if (bind >= 1000) {
            return org.lwjgl.glfw.GLFW.glfwGetMouseButton(windowHandle, bind - 1000) == org.lwjgl.glfw.GLFW.GLFW_PRESS;
        }

        return org.lwjgl.glfw.GLFW.glfwGetKey(windowHandle, bind) == org.lwjgl.glfw.GLFW.GLFW_PRESS;
    }

    private float getBaseFov() {
        if (mc == null || mc.options == null || mc.options.getFov() == null) {
            return 70f;
        }
        return customFov.get() ? customFovValue.get() : mc.options.getFov().getValue();
    }
}

