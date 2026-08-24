/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.setting.settings;

import java.util.ArrayList;
import java.util.Collection;
import kotakbaz.rain.module.setting.Setting;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\f\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b\u000e\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015R<\u0010\u0018\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\f0\u0016j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\f`\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001a"}, d2={"Loxxxde/\u062e\u0630;", "Loxxxde/\u0631\u0641;", "", "", "name", "initialValue", "configKey", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "", "toggle", "()V", "Lkotlin/Function1;", "listener", "onChange", "(Lkotlin/jvm/functions/Function1;)Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "value", "(Z)V", "Lkotlin/Function0;", "condition", "setVisible", "(Lkotlin/jvm/functions/Function0;)Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "listeners", "Ljava/util/ArrayList;", "rain-visuals"})
public final class BooleanSetting
extends Setting<Boolean> {
    @NotNull
    private final ArrayList<Function1<Boolean, Unit>> listeners;

    @NotNull
    public final BooleanSetting onChange(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ((Collection)this.listeners).add(listener);
        return this;
    }

    public BooleanSetting(@NotNull String name, boolean initialValue, @NotNull String configKey) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        super(name, initialValue, configKey);
        this.listeners = new ArrayList();
    }

    @Override
    protected void onChange(boolean value) {
        Iterable $this$forEach$iv = this.listeners;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            Function1 it = (Function1)element$iv;
            boolean bl = false;
            it.invoke(value);
        }
    }

    public /* synthetic */ BooleanSetting(String string, boolean bl, String string2, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 2) != 0) {
            bl = false;
        }
        if ((n & 4) != 0) {
            string2 = string;
        }
        this(string, bl, string2);
    }

    @NotNull
    public BooleanSetting setVisible(@NotNull Function0<Boolean> condition) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        super.setVisible(condition);
        return this;
    }

    public final void toggle() {
        this.set(!((Boolean)this.getValue()).booleanValue());
    }
}

