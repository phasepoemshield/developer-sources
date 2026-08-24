/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.TextSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u0646;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Loxxxde/\u062f;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "value", "protectString", "(Ljava/lang/String;)Ljava/lang/String;", "Loxxxde/\u0639\u062a;", "protectedText", "Loxxxde/\u0639\u062a;", "rain-visuals"})
public final class \u062f
extends Module {
    @NotNull
    public static final \u062f INSTANCE = new \u062f();
    @NotNull
    private static final TextSetting protectedText = Module.text$default(INSTANCE, "\u0422\u0435\u043a\u0441\u0442", "rainvisuals.pro", 16, null, 8, null);

    private \u062f() {
        super("NameProtect", \u0638\u0646.getPLAYER(), "\u0412\u0438\u0437\u0443\u0430\u043b\u044c\u043d\u0430\u044f \u0441\u043c\u0435\u043d\u0430 \u043d\u0438\u043a\u043d\u0435\u0439\u043c\u0430");
    }

    @NotNull
    public final String protectString(@NotNull String value) {
        String userName;
        block9: {
            block8: {
                block7: {
                    block6: {
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!this.isEnabled()) break block6;
                        boolean bl = ((CharSequence)value).length() == 0;
                        if (!bl) break block7;
                    }
                    return value;
                }
                String string = \u0636\u0643.getMc().getSession().getUsername();
                Intrinsics.checkNotNullExpressionValue(string, "getName(...)");
                userName = string;
                if (((CharSequence)userName).length() == 0) break block8;
                if (StringsKt.indexOf$default((CharSequence)value, userName, 0, true, 2, null) >= 0) break block9;
            }
            return value;
        }
        return StringsKt.replace(value, userName, (String)protectedText.getValue(), true);
    }
}

