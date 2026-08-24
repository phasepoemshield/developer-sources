/*
 * Decompiled with CFR 0.152.
 */
package kotlin.io.encoding;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.io.encoding.Base64;
import kotlin.io.encoding.ExperimentalEncodingApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a,\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0081\b\u00a2\u0006\u0004\b\u0007\u0010\b\u001a<\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0081\b\u00a2\u0006\u0004\b\u000b\u0010\f\u001a,\u0010\r\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0081\b\u00a2\u0006\u0004\b\r\u0010\u000e\u001a,\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0081\b\u00a2\u0006\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2={"Lkotlin/io/encoding/Base64;", "", "source", "", "startIndex", "endIndex", "", "platformCharsToBytes", "(Lkotlin/io/encoding/Base64;Ljava/lang/CharSequence;II)[B", "destination", "destinationOffset", "platformEncodeIntoByteArray", "(Lkotlin/io/encoding/Base64;[B[BIII)I", "platformEncodeToByteArray", "(Lkotlin/io/encoding/Base64;[BII)[B", "", "platformEncodeToString", "(Lkotlin/io/encoding/Base64;[BII)Ljava/lang/String;", "kotlin-stdlib"})
public final class Base64JVMKt {
    @ExperimentalEncodingApi
    @SinceKotlin(version="1.8")
    @InlineOnly
    private static final String platformEncodeToString(Base64 $this$platformEncodeToString, byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$platformEncodeToString, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        byte[] byteResult = $this$platformEncodeToString.encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex);
        return new String(byteResult, Charsets.ISO_8859_1);
    }

    @InlineOnly
    @SinceKotlin(version="1.8")
    @ExperimentalEncodingApi
    private static final byte[] platformEncodeToByteArray(Base64 $this$platformEncodeToByteArray, byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$platformEncodeToByteArray, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return $this$platformEncodeToByteArray.encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex);
    }

    @SinceKotlin(version="1.8")
    @ExperimentalEncodingApi
    @InlineOnly
    private static final int platformEncodeIntoByteArray(Base64 $this$platformEncodeIntoByteArray, byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$platformEncodeIntoByteArray, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return $this$platformEncodeIntoByteArray.encodeIntoByteArrayImpl$kotlin_stdlib(source, destination, destinationOffset, startIndex, endIndex);
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.8")
    @InlineOnly
    @ExperimentalEncodingApi
    private static final byte[] platformCharsToBytes(Base64 $this$platformCharsToBytes, CharSequence source, int startIndex, int endIndex) {
        byte[] byArray;
        Intrinsics.checkNotNullParameter($this$platformCharsToBytes, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof String) {
            $this$platformCharsToBytes.checkSourceBounds$kotlin_stdlib(source.length(), startIndex, endIndex);
            String string = ((String)source).substring(startIndex, endIndex);
            Intrinsics.checkNotNullExpressionValue(string, "substring(...)");
            String string2 = string;
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.checkNotNull(string2, "null cannot be cast to non-null type java.lang.String");
            byte[] byArray2 = string2.getBytes(charset);
            byArray = byArray2;
            Intrinsics.checkNotNullExpressionValue(byArray2, "getBytes(...)");
        } else {
            void var3_3;
            byArray = $this$platformCharsToBytes.charsToBytesImpl$kotlin_stdlib(source, startIndex, (int)var3_3);
        }
        return byArray;
    }
}

