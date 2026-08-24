/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.awt.Color;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0638\u0646;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2={"Loxxxde/\u0638\u062b;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Ljava/awt/Color;", "getClientColor", "()Ljava/awt/Color;", "Loxxxde/\u0631\u062a;", "clientColor", "Loxxxde/\u0631\u062a;", "rain-visuals"})
public final class \u0638\u062b
extends Module {
    @NotNull
    public static final \u0638\u062b INSTANCE = new \u0638\u062b();
    @NotNull
    private static final ColorSetting clientColor;

    private \u0638\u062b() {
        super("ClientColor", \u0638\u0646.getRENDER(), "\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430 \u0446\u0432\u0435\u0442\u043e\u0432 \u0434\u043b\u044f \u0432\u0441\u0435\u0445 \u043c\u043e\u0434\u0443\u043b\u0435\u0439");
    }

    @NotNull
    public final Color getClientColor() {
        return (Color)clientColor.getValue();
    }

    static {
        Module module = INSTANCE;
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        clientColor = Module.color$default(module, "\u0426\u0432\u0435\u0442 \u043a\u043b\u0438\u0435\u043d\u0442\u0430", color, null, 4, null);
    }
}

