/*
 * Decompiled with CFR 0.152.
 */
package kotlin.io;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Ljava/io/File;", "file", "other", "", "reason", "constructMessage", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;", "kotlin-stdlib"})
public final class ExceptionsKt {
    public static final /* synthetic */ String access$constructMessage(File file, File other, String reason) {
        return ExceptionsKt.constructMessage(file, other, reason);
    }

    private static final String constructMessage(File file, File other, String reason) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (other != null) {
            sb.append(" -> " + other);
        }
        if (reason != null) {
            sb.append(": " + reason);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}

