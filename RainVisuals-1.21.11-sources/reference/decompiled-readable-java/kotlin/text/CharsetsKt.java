/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0005"}, d2={"", "charsetName", "Ljava/nio/charset/Charset;", "charset", "(Ljava/lang/String;)Ljava/nio/charset/Charset;", "kotlin-stdlib"})
@JvmName(name="CharsetsKt")
public final class CharsetsKt {
    @InlineOnly
    private static final Charset charset(String charsetName) {
        Intrinsics.checkNotNullParameter(charsetName, "charsetName");
        Charset charset = Charset.forName(charsetName);
        Intrinsics.checkNotNullExpressionValue(charset, "forName(...)");
        return charset;
    }
}

