/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.setting.settings;

import kotakbaz.rain.module.setting.Setting;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0012H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2={"Loxxxde/\u0630\u064f;", "Loxxxde/\u0631\u0641;", "", "", "name", "initialValue", "configKey", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "hasBind", "()Z", "key", "", "setKey", "(I)V", "clear", "()V", "Lkotlin/Function0;", "condition", "setVisible", "(Lkotlin/jvm/functions/Function0;)Lkotakbaz/rain/module/setting/settings/BindSetting;", "rain-visuals"})
public final class BindSetting
extends Setting<Integer> {
    public final void clear() {
        this.set(-1);
    }

    public BindSetting(@NotNull String name, int initialValue, @NotNull String configKey) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        super(name, initialValue, configKey);
    }

    @NotNull
    public BindSetting setVisible(@NotNull Function0<Boolean> condition) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        super.setVisible(condition);
        return this;
    }

    public final void setKey(int key) {
        this.set(key);
    }

    public /* synthetic */ BindSetting(String string, int n, String string2, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 2) != 0) {
            n = -1;
        }
        if ((n2 & 4) != 0) {
            string2 = string;
        }
        this(string, n, string2);
    }

    public final boolean hasBind() {
        return ((Number)this.getValue()).intValue() != -1;
    }
}

