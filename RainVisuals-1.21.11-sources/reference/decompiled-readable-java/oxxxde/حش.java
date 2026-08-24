/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.option.GameOptions
 *  net.minecraft.client.option.Perspective
 *  net.minecraft.entity.Entity
 *  org.lwjgl.glfw.GLFW
 */
package oxxxde;

import kotakbaz.rain.event.events.KeyEvent;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.BindSetting;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.option.GameOptions;
import net.minecraft.client.option.Perspective;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;
import oxxxde.\u0635\u0635;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0638\u0646;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0014\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\"\u0010\u0010J\u000f\u0010#\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b#\u0010\u0010R\u0014\u0010%\u001a\u00020$8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b1\u00100R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0012\u0010(R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0014\u0010(\u00a8\u00062"}, d2={"Loxxxde/\u062d\u0634;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "onDisable", "Loxxxde/\u0633\u062d;", "event", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Loxxxde/\u062a\u0632;", "onKey", "(Lkotakbaz/rain/event/events/KeyEvent;)V", "", "isPerspectiveActive", "()Z", "", "cameraPitch", "()F", "cameraYaw", "", "mouseXDelta", "mouseYDelta", "rotateCamera", "(DD)V", "pitch", "yaw", "captureCamera", "(FF)V", "forceFirstPerson", "disablePerspective", "(Z)V", "resetState", "canHandlePerspectiveInput", "isBindPressedNow", "", "INPUT_MOUSE_OFFSET", "I", "MAX_CAMERA_PITCH", "F", "Loxxxde/\u0630\u064f;", "perspectiveKey", "Loxxxde/\u0630\u064f;", "Loxxxde/\u062e\u0630;", "holdMode", "Loxxxde/\u062e\u0630;", "perspectiveActive", "Z", "held", "rain-visuals"})
public final class \u062d\u0634
extends Module {
    private static float cameraYaw;
    @NotNull
    public static final \u062d\u0634 INSTANCE;
    private static final float MAX_CAMERA_PITCH = 90.0f;
    private static final int INPUT_MOUSE_OFFSET = 400;
    private static boolean held;
    @NotNull
    private static final BooleanSetting holdMode;
    private static float cameraPitch;
    @NotNull
    private static final BindSetting perspectiveKey;
    private static boolean perspectiveActive;

    static {
        INSTANCE = new \u062d\u0634();
        perspectiveKey = Module.bind$default(INSTANCE, "\u041a\u043d\u043e\u043f\u043a\u0430", 293, null, 4, null);
        holdMode = Module.boolean$default(INSTANCE, "\u0420\u0435\u0436\u0438\u043c \u0443\u0434\u0435\u0440\u0436\u0430\u043d\u0438\u044f", false, null, 4, null);
    }

    public final void rotateCamera(double mouseXDelta, double mouseYDelta) {
        if (!this.isPerspectiveActive()) {
            return;
        }
        cameraYaw += (float)(mouseXDelta / 8.0);
        cameraPitch += (float)(mouseYDelta / 8.0);
        cameraPitch = RangesKt.coerceIn(cameraPitch, -90.0f, 90.0f);
    }

    @Override
    public void onEnable() {
        super.onEnable();
        this.resetState();
    }

    private \u062d\u0634() {
        super("Perspective", \u0638\u0646.getRENDER(), "\u0423\u043b\u0443\u0447\u0448\u0435\u043d\u044b\u0439 \u0432\u0438\u0434 \u043e\u0442 \u0442\u0440\u0435\u0442\u044c\u0435\u0433\u043e \u043b\u0438\u0446\u0430");
    }

    private final void captureCamera(float pitch, float yaw) {
        cameraPitch = pitch;
        cameraYaw = yaw;
    }

    @Override
    public void onDisable() {
        this.disablePerspective(true);
        this.resetState();
        super.onDisable();
    }

    private final boolean isBindPressedNow() {
        long window;
        int key;
        block4: {
            int mouseButton;
            block6: {
                block5: {
                    key = ((Number)perspectiveKey.getValue()).intValue();
                    if (key <= 0) {
                        return false;
                    }
                    window = \u0636\u0643.getMc().getWindow().getHandle();
                    if (key < 400) break block4;
                    mouseButton = key - 400;
                    if (mouseButton < 0) break block5;
                    if (mouseButton <= 7) break block6;
                }
                return false;
            }
            return GLFW.glfwGetMouseButton((long)window, (int)mouseButton) == 1;
        }
        return GLFW.glfwGetKey((long)window, (int)key) == 1;
    }

    @Commando
    public final void onKey(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        if (\u0636\u0643.getMc().world == null || ((Boolean)holdMode.getValue()).booleanValue() || !this.canHandlePerspectiveInput()) {
            return;
        }
        Integer n = event.get(KeyEvent.Companion.getBUTTON());
        if (n == null) {
            return;
        }
        int button = n;
        boolean isMouse = Intrinsics.areEqual(event.get(KeyEvent.Companion.getMOUSE()), true);
        boolean isRelease = Intrinsics.areEqual(event.get(KeyEvent.Companion.getRELEASE()), true);
        if (isRelease) {
            return;
        }
        int incoming = isMouse ? button + 400 : button;
        if (incoming != ((Number)perspectiveKey.getValue()).intValue()) {
            return;
        }
        perspectiveActive = !perspectiveActive;
        this.captureCamera(\u0637\u062b.getPitch((Entity)player), \u0637\u062b.getYaw((Entity)player));
        GameOptions gameOptions = \u0636\u0643.getMc().options;
        Intrinsics.checkNotNullExpressionValue(gameOptions, "options");
        \u0637\u062b.setPerspective(gameOptions, perspectiveActive ? Perspective.THIRD_PERSON_BACK : Perspective.FIRST_PERSON);
    }

    private final void resetState() {
        perspectiveActive = false;
        held = false;
        cameraPitch = 0.0f;
        cameraYaw = 0.0f;
    }

    private final void disablePerspective(boolean forceFirstPerson) {
        if (!perspectiveActive && !held) {
            return;
        }
        perspectiveActive = false;
        held = false;
        if (forceFirstPerson) {
            GameOptions gameOptions = \u0636\u0643.getMc().options;
            Intrinsics.checkNotNullExpressionValue(gameOptions, "options");
            \u0637\u062b.setPerspective(gameOptions, Perspective.FIRST_PERSON);
        }
    }

    public final boolean isPerspectiveActive() {
        return this.isEnabled() && perspectiveActive && \u0636\u0643.getMc().player != null;
    }

    private final boolean canHandlePerspectiveInput() {
        return \u0636\u0643.getMc().currentScreen == null && \u0635\u0635.INSTANCE.getCustomScreen() == null;
    }

    public final float cameraPitch() {
        return cameraPitch;
    }

    public final float cameraYaw() {
        return cameraYaw;
    }

    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            \u062d\u0634 $this$onUpdate_u24lambda_u240 = this;
            boolean bl = false;
            $this$onUpdate_u24lambda_u240.disablePerspective(true);
            return;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        if (((Boolean)holdMode.getValue()).booleanValue()) {
            if (!this.canHandlePerspectiveInput()) {
                this.disablePerspective(true);
                return;
            }
            perspectiveActive = this.isBindPressedNow();
            if (perspectiveActive && !held) {
                held = true;
                this.captureCamera(\u0637\u062b.getPitch((Entity)player), \u0637\u062b.getYaw((Entity)player));
                GameOptions gameOptions = \u0636\u0643.getMc().options;
                Intrinsics.checkNotNullExpressionValue(gameOptions, "options");
                \u0637\u062b.setPerspective(gameOptions, Perspective.THIRD_PERSON_BACK);
            }
        }
        if (!perspectiveActive && held) {
            held = false;
            GameOptions gameOptions = \u0636\u0643.getMc().options;
            Intrinsics.checkNotNullExpressionValue(gameOptions, "options");
            \u0637\u062b.setPerspective(gameOptions, Perspective.FIRST_PERSON);
        }
        if (perspectiveActive) {
            GameOptions gameOptions = \u0636\u0643.getMc().options;
            Intrinsics.checkNotNullExpressionValue(gameOptions, "options");
            if (\u0637\u062b.getPerspective(gameOptions) != Perspective.THIRD_PERSON_BACK) {
                perspectiveActive = false;
            }
        }
    }
}

