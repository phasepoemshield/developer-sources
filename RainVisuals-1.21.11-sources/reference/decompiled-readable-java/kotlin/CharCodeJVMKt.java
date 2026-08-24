/*
 * Decompiled with CFR 0.152.
 */
package kotlin;

import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0006"}, d2={"Lkotlin/UShort;", "code", "", "Char-xj2QHRw", "(S)C", "Char", "kotlin-stdlib"})
public final class CharCodeJVMKt {
    @InlineOnly
    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    private static final char Char-xj2QHRw(short code) {
        return (char)(code & 0xFFFF);
    }
}

