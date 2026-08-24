/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.setting.settings;

import java.awt.Color;
import kotakbaz.rain.module.setting.Setting;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2={"Loxxxde/\u0631\u062a;", "Loxxxde/\u0631\u0641;", "Ljava/awt/Color;", "", "name", "initialValue", "configKey", "<init>", "(Ljava/lang/String;Ljava/awt/Color;Ljava/lang/String;)V", "color", "", "setColor", "(Ljava/awt/Color;)V", "Lkotlin/Function0;", "", "condition", "setVisible", "(Lkotlin/jvm/functions/Function0;)Lkotakbaz/rain/module/setting/settings/ColorSetting;", "rain-visuals"})
public final class ColorSetting
extends Setting<Color> {
    public ColorSetting(@NotNull String name, @NotNull Color initialValue, @NotNull String configKey) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        super(name, initialValue, configKey);
    }

    @NotNull
    public ColorSetting setVisible(@NotNull Function0<Boolean> condition) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        super.setVisible(condition);
        return this;
    }

    public final void setColor(@NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.set(color);
    }

    public /* synthetic */ ColorSetting(String string, Color color, String string2, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 2) != 0) {
            Color color2 = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue(color2, "WHITE");
            color = color2;
        }
        if ((n & 4) != 0) {
            string2 = string;
        }
        this(string, color, string2);
    }
}

