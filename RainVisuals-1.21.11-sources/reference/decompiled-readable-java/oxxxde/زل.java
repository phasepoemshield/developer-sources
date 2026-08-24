/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0635\u0635;

@Metadata(mv={2, 3, 0}, k=2, xi=48, d1={"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0005"}, d2={"", "path", "Ljava/io/InputStream;", "fromAssets", "(Ljava/lang/String;)Ljava/io/InputStream;", "rain-visuals"})
public final class \u0632\u0644 {
    @Nullable
    public static final InputStream fromAssets(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return \u0635\u0635.class.getClassLoader().getResourceAsStream(path);
    }
}

