/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.setting.settings;

import kotakbaz.rain.module.setting.Setting;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u0013\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019H\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b\u0017\u0010 R\"\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0014\u0010!\u00a8\u0006\""}, d2={"Loxxxde/\u0639\u062a;", "Loxxxde/\u0631\u0641;", "", "name", "initialValue", "", "maxLength", "configKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "text", "", "setText", "(Ljava/lang/String;)V", "normalize", "(Ljava/lang/String;)Ljava/lang/String;", "", "accepts", "(Ljava/lang/String;)Z", "Lkotlin/Function1;", "validator", "setValidator", "(Lkotlin/jvm/functions/Function1;)Lkotakbaz/rain/module/setting/settings/TextSetting;", "setMaxLength", "(I)Lkotakbaz/rain/module/setting/settings/TextSetting;", "Lkotlin/Function0;", "condition", "setVisible", "(Lkotlin/jvm/functions/Function0;)Lkotakbaz/rain/module/setting/settings/TextSetting;", "I", "getMaxLength", "()I", "(I)V", "Lkotlin/jvm/functions/Function1;", "rain-visuals"})
public final class TextSetting
extends Setting<String> {
    @NotNull
    private Function1<? super String, Boolean> validator;
    private int maxLength;

    @NotNull
    public final TextSetting setMaxLength(int maxLength) {
        this.maxLength = RangesKt.coerceAtLeast(maxLength, 0);
        return this;
    }

    @NotNull
    public final String normalize(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return StringsKt.take(text, RangesKt.coerceAtLeast(this.maxLength, 0));
    }

    public final int getMaxLength() {
        return this.maxLength;
    }

    private static final boolean validator$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    public final void setText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        String normalized = this.normalize(text);
        if (this.accepts(normalized)) {
            this.set(normalized);
        }
    }

    @NotNull
    public TextSetting setVisible(@NotNull Function0<Boolean> condition) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        super.setVisible(condition);
        return this;
    }

    public TextSetting(@NotNull String name, @NotNull String initialValue, int maxLength, @NotNull String configKey) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        super(name, initialValue, configKey);
        this.maxLength = maxLength;
        this.validator = TextSetting::validator$lambda$0;
    }

    public /* synthetic */ TextSetting(String string, String string2, int n, String string3, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 2) != 0) {
            string2 = "";
        }
        if ((n2 & 4) != 0) {
            n = 20;
        }
        if ((n2 & 8) != 0) {
            string3 = string;
        }
        this(string, string2, n, string3);
    }

    @NotNull
    public final TextSetting setValidator(@NotNull Function1<? super String, Boolean> validator) {
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.validator = validator;
        return this;
    }

    public final boolean accepts(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return this.validator.invoke(text);
    }

    public final void setMaxLength(int n) {
        this.maxLength = n;
    }
}

