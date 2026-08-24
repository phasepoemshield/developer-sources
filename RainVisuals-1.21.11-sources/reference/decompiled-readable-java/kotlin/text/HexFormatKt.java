/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.HexFormat;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\b\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\b"}, d2={"Lkotlin/Function1;", "Lkotlin/text/HexFormat$Builder;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "Lkotlin/text/HexFormat;", "HexFormat", "(Lkotlin/jvm/functions/Function1;)Lkotlin/text/HexFormat;", "kotlin-stdlib"})
public final class HexFormatKt {
    @ExperimentalStdlibApi
    @InlineOnly
    @SinceKotlin(version="1.9")
    private static final HexFormat HexFormat(Function1<? super HexFormat.Builder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        HexFormat.Builder builder = new HexFormat.Builder();
        builderAction.invoke(builder);
        return builder.build();
    }
}

