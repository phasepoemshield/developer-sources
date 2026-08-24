/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=2, xi=48, d1={"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0007\"\u001a\u0010\u0001\u001a\u00020\u00008\u0006X\u0086D\u00a2\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\u00a8\u0006\u0007"}, d2={"", "CLIENT_NAME", "Ljava/lang/String;", "getCLIENT_NAME", "()Ljava/lang/String;", "CLIENT_ID", "getCLIENT_ID", "rain-visuals"})
public final class \u0632\u062b {
    @NotNull
    private static final String CLIENT_ID;
    @NotNull
    private static final String CLIENT_NAME;

    static {
        CLIENT_NAME = "Rain";
        String string = CLIENT_NAME.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(string, "toLowerCase(...)");
        CLIENT_ID = string;
    }

    @NotNull
    public static final String getCLIENT_NAME() {
        return CLIENT_NAME;
    }

    @NotNull
    public static final String getCLIENT_ID() {
        return CLIENT_ID;
    }
}

