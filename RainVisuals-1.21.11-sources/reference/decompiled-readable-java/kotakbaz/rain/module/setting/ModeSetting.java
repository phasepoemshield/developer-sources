/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.setting;

import java.util.Collection;
import java.util.List;
import kotakbaz.rain.module.setting.Setting;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u064a;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\f\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001dH\u0016\u00a2\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\"\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010+\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b)\u0010*\u00a8\u0006-"}, d2={"Loxxxde/\u0638\u064a;", "Loxxxde/\u0631\u0641;", "", "name", "", "modes", "", "initialIndex", "configKey", "<init>", "(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;)V", "mode", "", "setMode", "(Ljava/lang/String;)V", "Lkotlin/Function1;", "provider", "withDisplayNameProvider", "(Lkotlin/jvm/functions/Function1;)Lkotakbaz/rain/module/setting/ModeSetting;", "displayNameFor", "(Ljava/lang/String;)Ljava/lang/String;", "index", "setIndex", "(I)V", "", "isSelected", "(I)Z", "cycleNext", "()V", "Lkotlin/Function0;", "condition", "setVisible", "(Lkotlin/jvm/functions/Function0;)Lkotakbaz/rain/module/setting/ModeSetting;", "Ljava/util/List;", "getModes", "()Ljava/util/List;", "displayNameProvider", "Lkotlin/jvm/functions/Function1;", "getSelectedIndex", "()I", "selectedIndex", "getDisplayValue", "()Ljava/lang/String;", "displayValue", "Companion", "rain-visuals"})
public class ModeSetting
extends Setting<String> {
    @NotNull
    private final List<String> modes;
    @NotNull
    public static final \u064a Companion = new \u064a(null);
    @NotNull
    private Function1<? super String, String> displayNameProvider;

    @NotNull
    public final List<String> getModes() {
        return this.modes;
    }

    @NotNull
    public final String getDisplayValue() {
        return this.displayNameFor((String)this.getValue());
    }

    public final int getSelectedIndex() {
        Integer n = this.modes.indexOf(this.getValue());
        int it = ((Number)n).intValue();
        boolean bl = false;
        Integer n2 = it >= 0 ? n : null;
        return n2 != null ? n2 : 0;
    }

    public final void setIndex(int index) {
        this.set(this.modes.get(RangesKt.coerceIn(index, 0, CollectionsKt.getLastIndex(this.modes))));
    }

    public final void setMode(@NotNull String mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (this.modes.contains(mode)) {
            this.set(mode);
        }
    }

    public /* synthetic */ ModeSetting(String string, List list, int n, String string2, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 4) != 0) {
            n = 0;
        }
        if ((n2 & 8) != 0) {
            string2 = string;
        }
        this(string, list, n, string2);
    }

    @NotNull
    public ModeSetting setVisible(@NotNull Function0<Boolean> condition) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        super.setVisible(condition);
        return this;
    }

    public ModeSetting(@NotNull String name, @NotNull List<String> modes, int initialIndex, @NotNull String configKey) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(modes, "modes");
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        super(name, \u064a.access$initialMode(Companion, modes, initialIndex), configKey);
        this.modes = modes;
        this.displayNameProvider = ModeSetting::displayNameProvider$lambda$0;
        if (!(!((Collection)this.modes).isEmpty())) {
            boolean bl = false;
            String string = "modes cannot be empty";
            throw new IllegalArgumentException(string.toString());
        }
    }

    @NotNull
    public final ModeSetting withDisplayNameProvider(@NotNull Function1<? super String, String> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.displayNameProvider = provider;
        return this;
    }

    @NotNull
    public final String displayNameFor(@NotNull String mode) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(mode, "mode");
        CharSequence charSequence2 = this.displayNameProvider.invoke(mode);
        if (StringsKt.isBlank(charSequence2)) {
            boolean bl = false;
            charSequence = mode;
        } else {
            charSequence = charSequence2;
        }
        return (String)charSequence;
    }

    public final boolean isSelected(int index) {
        return this.getSelectedIndex() == index;
    }

    private static final String displayNameProvider$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    public final void cycleNext() {
        int nextIndex = (this.getSelectedIndex() + 1) % this.modes.size();
        this.set(this.modes.get(nextIndex));
    }
}

