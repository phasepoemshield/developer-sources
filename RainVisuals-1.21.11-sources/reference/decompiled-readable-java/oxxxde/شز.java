/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix3x2f
 *  org.joml.Matrix3x2fc
 *  org.lwjgl.glfw.GLFW
 */
package oxxxde;

import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.BindSetting;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;
import org.lwjgl.glfw.GLFW;
import oxxxde.\u0635\u0635;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u0646;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0010\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\"\u0010\u001fJ\u000f\u0010#\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b$\u0010\u0003J\u001f\u0010'\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00198\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00108\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00198\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b-\u0010*R\u0014\u0010.\u001a\u00020\u00198\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b.\u0010*R\u0014\u0010/\u001a\u00020\u00108\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b/\u0010,R\u0014\u00100\u001a\u00020\u00108\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b0\u0010,R\u0014\u00101\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00108\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b3\u0010,R\u0014\u00104\u001a\u00020\u00108\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b4\u0010,R\u0014\u00105\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b5\u00102R\u0014\u00106\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b6\u00102R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b@\u0010?R\u0016\u0010A\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bA\u0010,R\u0016\u0010B\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bB\u0010,R\u0016\u0010C\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bC\u0010,R\u0016\u0010D\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bD\u0010,R\u0016\u0010E\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bE\u00102R\u0016\u0010F\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bF\u00102R\u0016\u0010G\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bG\u00102R\u0016\u0010H\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bH\u00102R\u0016\u0010I\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bK\u0010JR\u0016\u0010L\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bL\u0010JR\u0016\u0010M\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bM\u0010JR\u0016\u0010N\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bN\u0010JR$\u0010P\u001a\u00020O2\u0006\u0010%\u001a\u00020O8\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR$\u0010T\u001a\u00020O2\u0006\u0010%\u001a\u00020O8\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\bT\u0010Q\u001a\u0004\bU\u0010S\u00a8\u0006V"}, d2={"Loxxxde/\u0634\u0632;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "onDisable", "", "dynamicDeltaTicks", "onRenderFrame", "(F)V", "fov", "modifyFov", "(F)F", "", "vertical", "", "handleMouseScroll", "(D)Z", "delta", "adjustMouseSensitivity", "(D)D", "shouldTransformScreenMouse", "()Z", "updateState", "", "key", "isBindPressedNow", "(I)Z", "isKeyPressed", "minZoom", "()D", "maxZoomValue", "maxScreenZoomValue", "interpolator", "restoreSmoothCameraIfNeeded", "resetTransforms", "value", "target", "nudge", "(FF)F", "INPUT_MOUSE_OFFSET", "I", "ENABLE_SCREEN_ZOOM", "Z", "SCREEN_ZOOM_KEY", "ROTATE_KEY", "ZOOM_TRANSITION", "RESUME_ZOOM", "TRANSITION_SPEED", "D", "ENABLE_LIMITS", "ALLOW_ZOOM_OUT", "MAX_ZOOM", "MAX_SCREEN_ZOOM", "Loxxxde/\u0630\u064f;", "zoomKey", "Loxxxde/\u0630\u064f;", "Loxxxde/\u062e\u0630;", "useCinematicCamera", "Loxxxde/\u062e\u0630;", "Loxxxde/\u0637\u064f;", "defaultZoom", "Loxxxde/\u0637\u064f;", "scrollSensitivity", "smoothCameraRestoreValue", "booming", "screenZooming", "rotating", "prevBoomDivisor", "boomDivisor", "lastBoomDivisor", "screenBoom", "screenRotation", "F", "lastScreenBoom", "lastMouseX", "lastMouseY", "lastDynamicDeltaTicks", "Lorg/joml/Matrix3x2fc;", "renderTransform", "Lorg/joml/Matrix3x2fc;", "getRenderTransform", "()Lorg/joml/Matrix3x2fc;", "mouseTransform", "getMouseTransform", "rain-visuals"})
public final class \u0634\u0632
extends Module {
    private static boolean smoothCameraRestoreValue;
    private static float lastMouseY;
    @NotNull
    private static final SliderSetting scrollSensitivity;
    private static double screenBoom;
    private static final boolean RESUME_ZOOM = false;
    @NotNull
    private static final BooleanSetting useCinematicCamera;
    private static boolean booming;
    private static final int ROTATE_KEY = -1;
    private static final int SCREEN_ZOOM_KEY = -1;
    private static double boomDivisor;
    @NotNull
    private static Matrix3x2fc mouseTransform;
    private static final double TRANSITION_SPEED = 1.0;
    private static float lastMouseX;
    @NotNull
    private static Matrix3x2fc renderTransform;
    private static final boolean ALLOW_ZOOM_OUT = false;
    private static float screenRotation;
    @NotNull
    private static final SliderSetting defaultZoom;
    private static double lastBoomDivisor;
    private static final boolean ENABLE_SCREEN_ZOOM = true;
    private static boolean screenZooming;
    @NotNull
    public static final \u0634\u0632 INSTANCE;
    private static final int INPUT_MOUSE_OFFSET = 400;
    @NotNull
    private static final BindSetting zoomKey;
    private static float lastScreenBoom;
    private static final double MAX_SCREEN_ZOOM = 5.0;
    private static float lastDynamicDeltaTicks;
    private static final double MAX_ZOOM = 100.0;
    private static boolean rotating;
    private static double prevBoomDivisor;
    private static final boolean ENABLE_LIMITS = true;
    private static final boolean ZOOM_TRANSITION = true;

    public final boolean shouldTransformScreenMouse() {
        return this.isEnabled() && \u0635\u0635.INSTANCE.getCustomScreen() == null && \u0636\u0643.getMc().currentScreen != null;
    }

    private final double interpolator() {
        return (double)lastDynamicDeltaTicks * 1.0;
    }

    private final double maxScreenZoomValue() {
        return 5.0;
    }

    private final float nudge(float value, float target) {
        return Math.abs(target - value) < 0.005f ? target : value;
    }

    static {
        INSTANCE = new \u0634\u0632();
        zoomKey = Module.bind$default(INSTANCE, "\u041a\u043d\u043e\u043f\u043a\u0430", 67, null, 4, null);
        useCinematicCamera = Module.boolean$default(INSTANCE, "\u041a\u0438\u043d\u0435\u043c\u0430\u0442\u043e\u0433\u0440\u0430\u0444\u0438\u0447\u0435\u0441\u043a\u0430\u044f \u043a\u0430\u043c\u0435\u0440\u0430", false, null, 4, null);
        defaultZoom = Module.slider$default(INSTANCE, "\u0414\u0435\u0444\u043e\u043b\u0442 \u0437\u0443\u043c", 5.0f, 2.0f, 15.0f, 0.1f, null, 32, null);
        scrollSensitivity = Module.slider$default(INSTANCE, "\u0421\u0438\u043b\u0430 \u0441\u043a\u0440\u043e\u043b\u043b\u0430", 1.0f, 0.1f, 5.0f, 0.1f, null, 32, null);
        prevBoomDivisor = ((Number)defaultZoom.getValue()).floatValue();
        boomDivisor = 1.0;
        lastBoomDivisor = 1.0;
        screenBoom = 1.0;
        lastScreenBoom = 1.0f;
        lastDynamicDeltaTicks = 1.0f;
        renderTransform = (Matrix3x2fc)new Matrix3x2f();
        mouseTransform = (Matrix3x2fc)new Matrix3x2f();
    }

    /*
     * Unable to fully structure code
     */
    private final void updateState() {
        block8: {
            if (!this.isEnabled()) {
                return;
            }
            control = this.isKeyPressed(341) || this.isKeyPressed(345);
            shift = this.isKeyPressed(340) || this.isKeyPressed(344);
            if (!this.isBindPressedNow(((Number)\u0634\u0632.zoomKey.getValue()).intValue())) ** GOTO lbl-1000
            if (!control) break block8;
            if (shift) ** GOTO lbl-1000
        }
        if (\u0634\u0632.screenZooming) lbl-1000:
        // 2 sources

        {
            v0 = true;
        } else lbl-1000:
        // 2 sources

        {
            v0 = false;
        }
        nowScreenZooming = v0;
        nowRotating = false;
        if (\u0634\u0632.screenZooming != nowScreenZooming) {
            \u0634\u0632.screenBoom = \u0634\u0632.screenZooming ? 1.0 : 2.0;
            \u0634\u0632.screenZooming = nowScreenZooming;
        }
        \u0634\u0632.rotating = nowRotating;
        nowBooming = this.isBindPressedNow(((Number)\u0634\u0632.zoomKey.getValue()).intValue()) && \u0636\u0643.getMc().currentScreen == null && \u0636\u0643.getMc().player != null && \u0636\u0643.getMc().world != null;
        if (\u0634\u0632.booming == nowBooming) {
            return;
        }
        if (\u0634\u0632.booming) {
            \u0634\u0632.prevBoomDivisor = \u0634\u0632.boomDivisor;
            \u0634\u0632.boomDivisor = 1.0;
            this.restoreSmoothCameraIfNeeded();
        } else {
            \u0634\u0632.boomDivisor = ((Number)\u0634\u0632.defaultZoom.getValue()).floatValue();
            \u0634\u0632.smoothCameraRestoreValue = \u0636\u0643.getMc().options.smoothCameraEnabled;
            if (((Boolean)\u0634\u0632.useCinematicCamera.getValue()).booleanValue()) {
                \u0636\u0643.getMc().options.smoothCameraEnabled = true;
            }
        }
        \u0634\u0632.booming = var5_5;
    }

    public final void onRenderFrame(float dynamicDeltaTicks) {
        lastDynamicDeltaTicks = dynamicDeltaTicks;
        this.updateState();
        if (!this.isEnabled()) {
            this.resetTransforms();
            return;
        }
        float mouseX = (float)(\u0636\u0643.getMc().mouse.getX() / (double)\u0636\u0643.getMc().getWindow().getScaleFactor());
        float mouseY = (float)(\u0636\u0643.getMc().mouse.getY() / (double)\u0636\u0643.getMc().getWindow().getScaleFactor());
        Matrix3x2f render = new Matrix3x2f().identity();
        render.translate(lastMouseX, lastMouseY);
        render.scale(lastScreenBoom, lastScreenBoom);
        render.translate(-lastMouseX, -lastMouseY);
        Matrix3x2f rotation = new Matrix3x2f().identity();
        rotation.translate((float)\u0636\u0643.getMc().getWindow().getScaledWidth() / 2.0f, (float)\u0636\u0643.getMc().getWindow().getScaledHeight() / 2.0f);
        rotation.rotate((float)Math.toRadians(screenRotation));
        rotation.translate((float)\u0636\u0643.getMc().getWindow().getScaledWidth() / -2.0f, (float)\u0636\u0643.getMc().getWindow().getScaledHeight() / -2.0f);
        render.mul((Matrix3x2fc)rotation);
        renderTransform = (Matrix3x2fc)new Matrix3x2f((Matrix3x2fc)render);
        Matrix3x2f matrix3x2f = new Matrix3x2f((Matrix3x2fc)rotation).invert();
        Intrinsics.checkNotNullExpressionValue(matrix3x2f, "invert(...)");
        mouseTransform = (Matrix3x2fc)matrix3x2f;
        float interpolation = (float)this.interpolator();
        lastScreenBoom += 0.45f * (((float)screenBoom - lastScreenBoom) * interpolation);
        lastMouseX += 0.65f * ((mouseX - lastMouseX) * dynamicDeltaTicks);
        lastMouseY += 0.65f * ((mouseY - lastMouseY) * dynamicDeltaTicks);
        lastScreenBoom = this.nudge(lastScreenBoom, 1.0f);
        lastMouseX = this.nudge(lastMouseX, mouseX);
        lastMouseY = this.nudge(lastMouseY, mouseY);
    }

    private final double maxZoomValue() {
        return 100.0;
    }

    private final void resetTransforms() {
        renderTransform = (Matrix3x2fc)new Matrix3x2f();
        mouseTransform = (Matrix3x2fc)new Matrix3x2f();
    }

    @Override
    public void onEnable() {
        prevBoomDivisor = ((Number)defaultZoom.getValue()).floatValue();
        lastBoomDivisor = 1.0;
        this.resetTransforms();
    }

    private final void restoreSmoothCameraIfNeeded() {
        \u0636\u0643.getMc().options.smoothCameraEnabled = smoothCameraRestoreValue;
    }

    private \u0634\u0632() {
        super("Zoom", \u0638\u0646.getRENDER(), "\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430 \u043f\u0440\u0438\u0431\u043b\u0438\u0436\u0435\u043d\u0438\u044f \u043a\u0430\u043c\u0435\u0440\u044b");
    }

    @NotNull
    public final Matrix3x2fc getMouseTransform() {
        return mouseTransform;
    }

    public final boolean handleMouseScroll(double vertical) {
        boolean bl;
        block12: {
            block11: {
                if (!this.isEnabled()) break block11;
                if (\u0635\u0635.INSTANCE.getCustomScreen() == null) break block12;
            }
            return false;
        }
        this.updateState();
        if (\u0636\u0643.getMc().currentScreen != null) {
            if (rotating) {
                screenRotation += (float)vertical;
                bl = true;
            } else if (screenZooming) {
                screenBoom = Math.min(Math.max(this.minZoom(), screenBoom + vertical * 0.2 * screenBoom), this.maxScreenZoomValue());
                bl = true;
            } else {
                bl = false;
            }
        } else if (booming) {
            boomDivisor = Math.min(Math.max(this.minZoom(), boomDivisor + vertical * (boomDivisor / 10.0) * (double)((Number)scrollSensitivity.getValue()).floatValue()), this.maxZoomValue());
            bl = true;
        } else {
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isBindPressedNow(int key) {
        if (key <= 0) {
            return false;
        }
        if (key >= 400) {
            int mouseButton = key - 400;
            if (0 > mouseButton) return false;
            if (mouseButton >= 8) return false;
            boolean bl = true;
            if (!bl) return false;
            if (GLFW.glfwGetMouseButton((long)\u0636\u0643.getMc().getWindow().getHandle(), (int)mouseButton) != 1) return false;
            return true;
        }
        if (GLFW.glfwGetKey((long)\u0636\u0643.getMc().getWindow().getHandle(), (int)key) != 1) return false;
        return true;
    }

    @Override
    public void onDisable() {
        this.restoreSmoothCameraIfNeeded();
        booming = false;
        screenZooming = false;
        rotating = false;
        boomDivisor = 1.0;
        prevBoomDivisor = ((Number)defaultZoom.getValue()).floatValue();
        lastBoomDivisor = 1.0;
        screenBoom = 1.0;
        screenRotation = 0.0f;
        lastScreenBoom = 1.0f;
        lastMouseX = 0.0f;
        lastMouseY = 0.0f;
        lastDynamicDeltaTicks = 1.0f;
        this.resetTransforms();
    }

    public final float modifyFov(float fov) {
        if (!this.isEnabled()) {
            return fov;
        }
        this.updateState();
        lastBoomDivisor += 0.45 * (boomDivisor - lastBoomDivisor) * this.interpolator();
        return (float)((double)fov / Math.max(lastBoomDivisor, 0.01));
    }

    private final double minZoom() {
        return 1.0;
    }

    private final boolean isKeyPressed(int key) {
        return GLFW.glfwGetKey((long)\u0636\u0643.getMc().getWindow().getHandle(), (int)key) == 1;
    }

    @NotNull
    public final Matrix3x2fc getRenderTransform() {
        return renderTransform;
    }

    public final double adjustMouseSensitivity(double delta) {
        if (!this.isEnabled()) {
            return delta;
        }
        this.updateState();
        return booming ? delta / Math.max(boomDivisor, 0.01) : delta;
    }
}

