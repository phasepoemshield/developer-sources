/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package oxxxde;

import java.awt.Color;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0638\u062b;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\u00020\u00168\u0006\u00a2\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a\u00a8\u0006\u001d"}, d2={"Loxxxde/\u0628\u0624;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "useCustomFog", "()Z", "Ljava/awt/Color;", "resolvedFogColor", "()Ljava/awt/Color;", "", "original", "fogSkyArgb", "(I)I", "Loxxxde/\u062e\u0630;", "useClientColor", "Loxxxde/\u062e\u0630;", "Loxxxde/\u0631\u062a;", "fogColor", "Loxxxde/\u0631\u062a;", "getFogColor", "()Lkotakbaz/rain/module/setting/settings/ColorSetting;", "Loxxxde/\u0637\u064f;", "fogDistance", "Loxxxde/\u0637\u064f;", "getFogDistance", "()Lkotakbaz/rain/module/setting/settings/SliderSetting;", "fogDensity", "getFogDensity", "rain-visuals"})
@RecompileFormat
public final class \u0628\u0624
extends Module {
    @NotNull
    private static final SliderSetting fogDistance;
    @NotNull
    private static final ColorSetting fogColor;
    @NotNull
    private static final SliderSetting fogDensity;
    @NotNull
    private static final BooleanSetting useClientColor;
    @NotNull
    public static final \u0628\u0624 INSTANCE;

    @NotNull
    public final SliderSetting getFogDensity() {
        return fogDensity;
    }

    @NotNull
    public final Color resolvedFogColor() {
        return (Boolean)useClientColor.getValue() != false && \u0638\u062b.INSTANCE.isEnabled() ? \u0638\u062b.INSTANCE.getClientColor() : (Color)fogColor.getValue();
    }

    @NotNull
    public final SliderSetting getFogDistance() {
        return fogDistance;
    }

    private static final boolean useClientColor$lambda$0() {
        return \u0638\u062b.INSTANCE.isEnabled();
    }

    @NotNull
    public final ColorSetting getFogColor() {
        return fogColor;
    }

    static {
        INSTANCE = new \u0628\u0624();
        useClientColor = Module.boolean$default(INSTANCE, "\u0426\u0432\u0435\u0442 \u043a\u043b\u0438\u0435\u043d\u0442\u0430", false, null, 4, null).setVisible(\u0628\u0624::useClientColor$lambda$0);
        Module module = INSTANCE;
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        fogColor = Module.color$default(module, "\u0426\u0432\u0435\u0442", color, null, 4, null).setVisible(\u0628\u0624::fogColor$lambda$0);
        fogDistance = Module.slider$default(INSTANCE, "\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f", -8.0f, -8.0f, 25.0f, 1.0f, null, 32, null);
        fogDensity = Module.slider$default(INSTANCE, "\u041f\u043b\u043e\u0442\u043d\u043e\u0441\u0442\u044c", 100.0f, 0.0f, 100.0f, 1.0f, null, 32, null);
    }

    public final boolean useCustomFog() {
        return this.isEnabled();
    }

    private \u0628\u0624() {
        super("CustomFog", \u0638\u0646.getRENDER(), "\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430 \u0446\u0432\u0435\u0442\u0430 \u0438 \u0434\u0430\u043b\u044c\u043d\u043e\u0441\u0442\u0438 \u0442\u0443\u043c\u0430\u043d\u0430");
    }

    private static final boolean fogColor$lambda$0() {
        return !((Boolean)useClientColor.getValue()).booleanValue() || !\u0638\u062b.INSTANCE.isEnabled();
    }

    public final int fogSkyArgb(int original) {
        if (!this.useCustomFog()) {
            return original;
        }
        return this.resolvedFogColor().getRGB();
    }
}

