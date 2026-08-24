/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.menu;

import kotakbaz.rain.ui.menu.ConfigSettingsPopupBounds;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u00020\u0012H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\u0002H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b\u00a8\u0006\u001a"}, d2={"Loxxxde/\u062f\u0631;", "", "", "configName", "Loxxxde/\u0628\u0644;", "bounds", "<init>", "(Ljava/lang/String;Lkotakbaz/rain/ui/menu/ConfigSettingsPopupBounds;)V", "component1", "()Ljava/lang/String;", "component2", "()Lkotakbaz/rain/ui/menu/ConfigSettingsPopupBounds;", "copy", "(Ljava/lang/String;Lkotakbaz/rain/ui/menu/ConfigSettingsPopupBounds;)Lkotakbaz/rain/ui/menu/ConfigSettingsPopup;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getConfigName", "Loxxxde/\u0628\u0644;", "getBounds", "rain-visuals"})
final class ConfigSettingsPopup {
    @NotNull
    private final ConfigSettingsPopupBounds bounds;
    @NotNull
    private final String configName;

    @NotNull
    public final ConfigSettingsPopupBounds getBounds() {
        return this.bounds;
    }

    @NotNull
    public final String getConfigName() {
        return this.configName;
    }

    @NotNull
    public String toString() {
        return "ConfigSettingsPopup(configName=" + this.configName + ", bounds=" + this.bounds + ")";
    }

    @NotNull
    public final ConfigSettingsPopup copy(@NotNull String configName, @NotNull ConfigSettingsPopupBounds bounds) {
        Intrinsics.checkNotNullParameter(configName, "configName");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        return new ConfigSettingsPopup(configName, bounds);
    }

    public int hashCode() {
        int result = this.configName.hashCode();
        result = result * 31 + this.bounds.hashCode();
        return result;
    }

    @NotNull
    public final ConfigSettingsPopupBounds component2() {
        return this.bounds;
    }

    public static /* synthetic */ ConfigSettingsPopup copy$default(ConfigSettingsPopup configSettingsPopup, String string, ConfigSettingsPopupBounds configSettingsPopupBounds, int n, Object object) {
        if ((n & 1) != 0) {
            string = configSettingsPopup.configName;
        }
        if ((n & 2) != 0) {
            configSettingsPopupBounds = configSettingsPopup.bounds;
        }
        return configSettingsPopup.copy(string, configSettingsPopupBounds);
    }

    @NotNull
    public final String component1() {
        return this.configName;
    }

    public ConfigSettingsPopup(@NotNull String configName, @NotNull ConfigSettingsPopupBounds bounds) {
        Intrinsics.checkNotNullParameter(configName, "configName");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.configName = configName;
        this.bounds = bounds;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigSettingsPopup)) {
            return false;
        }
        ConfigSettingsPopup configSettingsPopup = (ConfigSettingsPopup)other;
        if (!Intrinsics.areEqual(this.configName, configSettingsPopup.configName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.bounds, configSettingsPopup.bounds)) {
            return false;
        }
        return true;
    }
}

