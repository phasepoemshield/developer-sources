/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.setting;

import java.util.List;
import kotakbaz.rain.module.setting.ModeSetting;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2={"Loxxxde/\u0638\u064d;", "Loxxxde/\u0638\u064a;", "", "name", "", "modes", "", "initialIndex", "configKey", "<init>", "(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;)V", "Lkotlin/Function0;", "", "condition", "setVisible", "(Lkotlin/jvm/functions/Function0;)Lkotakbaz/rain/module/setting/ModSetting;", "rain-visuals"})
public final class ModSetting
extends ModeSetting {
    public ModSetting(@NotNull String name, @NotNull List<String> modes, int initialIndex, @NotNull String configKey) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(modes, "modes");
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        super(name, modes, initialIndex, configKey);
    }

    public /* synthetic */ ModSetting(String string, List list, int n, String string2, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 4) != 0) {
            n = 0;
        }
        if ((n2 & 8) != 0) {
            string2 = string;
        }
        this(string, list, n, string2);
    }

    @Override
    @NotNull
    public ModSetting setVisible(@NotNull Function0<Boolean> condition) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        super.setVisible((Function0)condition);
        return this;
    }
}

