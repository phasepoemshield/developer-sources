/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.Click
 *  net.minecraft.client.input.KeyInput
 *  net.minecraft.client.input.MouseInput
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.option.SimpleOption
 *  net.minecraft.util.Arm
 *  org.lwjgl.glfw.GLFW
 *  ru.ocz.protection.annotation.Compile
 */
package oxxxde;

import kotakbaz.rain.event.events.AttackEvent;
import kotakbaz.rain.event.events.KeyEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.ModeSetting;
import kotakbaz.rain.module.setting.settings.BindSetting;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.gui.Click;
import net.minecraft.client.input.KeyInput;
import net.minecraft.client.input.MouseInput;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.option.SimpleOption;
import net.minecraft.util.Arm;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.annotation.Compile;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\b\f\u0010\rJ'\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0003J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0010\u00a2\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u001e\u0010\u0003R\u0014\u0010\u001f\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b0\u0010/\u00a8\u00061"}, d2={"Loxxxde/\u0636\u0642;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "onDisable", "Loxxxde/\u062a\u0632;", "event", "onKey", "(Lkotakbaz/rain/event/events/KeyEvent;)V", "Loxxxde/\u0630\u0645;", "onAttack", "(Lkotakbaz/rain/event/events/AttackEvent;)V", "", "button", "", "isMouse", "isRelease", "handleKeyMode", "(IZZ)V", "handleAttackMode", "changeMainArm", "matchesAttackKey", "(IZ)Z", "toIncomingCode", "(IZ)I", "canProcessInput", "()Z", "shouldKeepLeftOffhandSlotInHud", "resetInputState", "INPUT_MOUSE_OFFSET", "I", "", "MODE_BY_KEY", "Ljava/lang/String;", "MODE_ON_ATTACK", "Loxxxde/\u0638\u064a;", "changeMode", "Loxxxde/\u0638\u064a;", "Loxxxde/\u0630\u064f;", "changeHandKey", "Loxxxde/\u0630\u064f;", "Loxxxde/\u062e\u0630;", "onlyOnHit", "Loxxxde/\u062e\u0630;", "keyModePressed", "Z", "attackModePressed", "rain-visuals"})
public final class \u0636\u0642
extends Module {
    private static final int INPUT_MOUSE_OFFSET = 400;
    @NotNull
    private static final String MODE_ON_ATTACK = "\u041f\u0440\u0438 \u0443\u0434\u0430\u0440\u0435";
    @NotNull
    private static final BooleanSetting onlyOnHit;
    @NotNull
    private static final ModeSetting changeMode;
    private static boolean attackModePressed;
    private static boolean keyModePressed;
    @NotNull
    private static final String MODE_BY_KEY = "\u041f\u043e \u043a\u043d\u043e\u043f\u043a\u0435";
    @NotNull
    public static final \u0636\u0642 INSTANCE;
    @NotNull
    private static final BindSetting changeHandKey;

    private final boolean matchesAttackKey(int button, boolean isMouse) {
        KeyBinding keyBinding = \u0636\u0643.getMc().options.attackKey;
        Intrinsics.checkNotNullExpressionValue(keyBinding, "keyAttack");
        KeyBinding attackKey = keyBinding;
        return isMouse ? attackKey.matchesMouse(new Click(0.0, 0.0, new MouseInput(button, 0))) : attackKey.matchesKey(new KeyInput(button, GLFW.glfwGetKeyScancode((int)button), 0));
    }

    @Commando
    @Compile
    public final void onAttack(@NotNull AttackEvent attackEvent) {
        Intrinsics.checkNotNullParameter(attackEvent, "event");
        if (!Intrinsics.areEqual(changeMode.getValue(), MODE_ON_ATTACK)) {
            return;
        }
        if (((Boolean)onlyOnHit.getValue()).booleanValue() && !this.canProcessInput()) {
            return;
        }
        this.changeMainArm();
    }

    private \u0636\u0642() {
        super("ChangeHand", \u0638\u0646.getPLAYER(), "\u0418\u0437\u043c\u0435\u043d\u0435\u043d\u0438\u0435 \u0432\u0435\u0434\u0443\u0449\u0435\u0439 \u0440\u0443\u043a\u0438");
    }

    @Override
    public void onEnable() {
        this.resetInputState();
    }

    private final void handleAttackMode(int button, boolean isMouse, boolean isRelease) {
        if (!this.matchesAttackKey(button, isMouse)) {
            return;
        }
        if (isRelease) {
            attackModePressed = false;
            return;
        }
        if (attackModePressed) {
            return;
        }
        attackModePressed = true;
        this.changeMainArm();
    }

    private final boolean canProcessInput() {
        return \u0636\u0643.getMc().player != null && \u0636\u0643.getMc().world != null && \u0636\u0643.getMc().currentScreen == null;
    }

    private static final boolean onlyOnHit$lambda$0() {
        return Intrinsics.areEqual(changeMode.getValue(), MODE_ON_ATTACK);
    }

    static {
        INSTANCE = new \u0636\u0642();
        String[] stringArray = new String[2];
        stringArray[0] = MODE_BY_KEY;
        stringArray[1] = MODE_ON_ATTACK;
        changeMode = Module.mode$default(INSTANCE, "\u0420\u0435\u0436\u0438\u043c", CollectionsKt.listOf(stringArray), 0, null, 12, null);
        changeHandKey = Module.bind$default(INSTANCE, "\u041a\u043d\u043e\u043f\u043a\u0430", 72, null, 4, null).setVisible(\u0636\u0642::changeHandKey$lambda$0);
        onlyOnHit = Module.boolean$default(INSTANCE, "\u041f\u0440\u0438 \u043f\u043e\u043f\u0430\u0434\u0430\u043d\u0438\u0438", true, null, 4, null).setVisible(\u0636\u0642::onlyOnHit$lambda$0);
    }

    private final void handleKeyMode(int button, boolean isMouse, boolean isRelease) {
        int incoming = this.toIncomingCode(button, isMouse);
        if (((Number)changeHandKey.getValue()).intValue() == -1 || incoming != ((Number)changeHandKey.getValue()).intValue()) {
            return;
        }
        if (isRelease) {
            keyModePressed = false;
            return;
        }
        if (keyModePressed) {
            return;
        }
        keyModePressed = true;
        this.changeMainArm();
    }

    private final void resetInputState() {
        keyModePressed = false;
        attackModePressed = false;
    }

    @Commando
    @Compile
    public final void onKey(@NotNull KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "event");
        int n = keyEvent.get(KeyEvent.Companion.getBUTTON());
        boolean bl = Intrinsics.areEqual(keyEvent.get(KeyEvent.Companion.getMOUSE()), true);
        boolean bl2 = Intrinsics.areEqual(keyEvent.get(KeyEvent.Companion.getRELEASE()), true);
        if (!this.canProcessInput()) {
            return;
        }
        String string = (String)changeMode.getValue();
        if (Intrinsics.areEqual(string, MODE_BY_KEY)) {
            this.handleKeyMode(n, bl, bl2);
            return;
        }
        if (!Intrinsics.areEqual(string, MODE_ON_ATTACK)) {
            return;
        }
        if (((Boolean)onlyOnHit.getValue()).booleanValue()) {
            return;
        }
        this.handleAttackMode(n, bl, bl2);
    }

    private static final boolean changeHandKey$lambda$0() {
        return Intrinsics.areEqual(changeMode.getValue(), MODE_BY_KEY);
    }

    public final boolean shouldKeepLeftOffhandSlotInHud() {
        return this.isEnabled() && Intrinsics.areEqual(changeMode.getValue(), MODE_ON_ATTACK);
    }

    private final void changeMainArm() {
        SimpleOption simpleOption = \u0636\u0643.getMc().options.getMainArm();
        Intrinsics.checkNotNullExpressionValue(simpleOption, "mainHand(...)");
        SimpleOption mainArmOption = simpleOption;
        Arm nextArm = mainArmOption.getValue() == Arm.RIGHT ? Arm.LEFT : Arm.RIGHT;
        mainArmOption.setValue((Object)nextArm);
        \u0636\u0643.getMc().options.write();
    }

    /*
     * WARNING - void declaration
     */
    private final int toIncomingCode(int button, boolean isMouse) {
        void var1_1;
        return isMouse ? button + 400 : var1_1;
    }

    @Override
    public void onDisable() {
        this.resetInputState();
    }
}

