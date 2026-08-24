/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.setting;

import kotakbaz.rain.Rain;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000\u00a2\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00038\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\t\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00008\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006\u001f"}, d2={"Loxxxde/\u0631\u0641;", "T", "", "", "name", "initialValue", "configKey", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "value", "", "set", "(Ljava/lang/Object;)V", "", "isVisible", "()Z", "Lkotlin/Function0;", "condition", "setVisible", "(Lkotlin/jvm/functions/Function0;)Lkotakbaz/rain/module/setting/Setting;", "addVisibleCondition", "onChange", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getConfigKey", "visibility", "Lkotlin/jvm/functions/Function0;", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "rain-visuals"})
public abstract class Setting<T> {
    private T value;
    @NotNull
    private Function0<Boolean> visibility;
    @NotNull
    private final String name;
    @NotNull
    private final String configKey;

    private static final boolean addVisibleCondition$lambda$0(Function0 $previous, Function0 $condition) {
        return ((Boolean)$previous.invoke()).booleanValue() && ((Boolean)$condition.invoke()).booleanValue();
    }

    public final boolean isVisible() {
        return this.visibility.invoke();
    }

    @NotNull
    public final String getConfigKey() {
        return this.configKey;
    }

    public /* synthetic */ Setting(String string, Object object, String string2, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 4) != 0) {
            string2 = string;
        }
        this(string, object, string2);
    }

    /*
     * WARNING - void declaration
     */
    public Setting(@NotNull String name, T initialValue, @NotNull String configKey) {
        void var2_2;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        this.name = name;
        this.configKey = configKey;
        if (!(!StringsKt.isBlank(this.configKey))) {
            boolean bl = false;
            String string = "configKey cannot be blank";
            throw new IllegalArgumentException(string.toString());
        }
        this.visibility = Setting::visibility$lambda$0;
        this.value = var2_2;
    }

    @NotNull
    public Setting<T> setVisible(@NotNull Function0<Boolean> condition) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        this.visibility = condition;
        return this;
    }

    @NotNull
    public Setting<T> addVisibleCondition(@NotNull Function0<Boolean> condition) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        Function0<Boolean> previous = this.visibility;
        this.visibility = () -> Setting.addVisibleCondition$lambda$0(previous, condition);
        return this;
    }

    protected void onChange(T value) {
    }

    private static final boolean visibility$lambda$0() {
        return true;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final T getValue() {
        return this.value;
    }

    public final void set(T value) {
        if (Intrinsics.areEqual(this.value, value)) {
            return;
        }
        this.value = value;
        this.onChange(value);
        Rain.INSTANCE.requestSave();
    }
}

