/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.setting;

import java.awt.Color;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0638\u062b;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0011\u0010\u0010\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0011"}, d2={"Loxxxde/\u0637\u0628;", "", "Loxxxde/\u062e\u0630;", "useClientColorSetting", "Loxxxde/\u0631\u062a;", "colorSetting", "<init>", "(Lkotakbaz/rain/module/setting/settings/BooleanSetting;Lkotakbaz/rain/module/setting/settings/ColorSetting;)V", "", "shouldUseClientColor", "()Z", "Loxxxde/\u062e\u0630;", "Loxxxde/\u0631\u062a;", "Ljava/awt/Color;", "getValue", "()Ljava/awt/Color;", "value", "rain-visuals"})
public final class ClientColorSetting {
    @NotNull
    private final ColorSetting colorSetting;
    @NotNull
    private final BooleanSetting useClientColorSetting;

    public final boolean shouldUseClientColor() {
        return \u0638\u062b.INSTANCE.isEnabled() && ((Boolean)this.useClientColorSetting.getValue()).booleanValue();
    }

    public ClientColorSetting(@NotNull BooleanSetting useClientColorSetting, @NotNull ColorSetting colorSetting) {
        Intrinsics.checkNotNullParameter(useClientColorSetting, "useClientColorSetting");
        Intrinsics.checkNotNullParameter(colorSetting, "colorSetting");
        this.useClientColorSetting = useClientColorSetting;
        this.colorSetting = colorSetting;
    }

    @NotNull
    public final Color getValue() {
        return this.shouldUseClientColor() ? \u0638\u062b.INSTANCE.getClientColor() : (Color)this.colorSetting.getValue();
    }
}

