/*
 * Decompiled with CFR 0.152.
 */
package kotlin.io.encoding;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.AbstractList;
import kotlin.io.encoding.Base64Kt;
import kotlin.io.encoding.ExperimentalEncodingApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0017\u0018\u0000 >2\u00020\u0001:\u0001>B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\b\u001b\u0010\u0019J)\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u00a2\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u00a2\u0006\u0004\b\u001d\u0010\u0012J7\u0010 \u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b \u0010!J;\u0010\"\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u00a2\u0006\u0004\b\"\u0010!J;\u0010\"\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u00a2\u0006\u0004\b\"\u0010#J'\u0010$\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b$\u0010%J)\u0010&\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u00a2\u0006\u0004\b&\u0010'J;\u0010(\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u00a2\u0006\u0004\b(\u0010!J7\u0010*\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\b)\u0010!J\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b+\u0010,J?\u00100\u001a\u00028\u0000\"\f\b\u0000\u0010/*\u00060-j\u0002`.2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00028\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u00a2\u0006\u0004\b0\u00101J)\u00102\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u00a2\u0006\u0004\b2\u0010\u001eJ'\u00104\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\b3\u0010\u001eJ/\u00107\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b7\u00108J'\u00109\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b9\u0010%R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b=\u0010<\u00a8\u0006?"}, d2={"Lkotlin/io/encoding/Base64;", "", "", "isUrlSafe", "isMimeScheme", "<init>", "(ZZ)V", "", "source", "", "bytesToStringImpl$kotlin_stdlib", "([B)Ljava/lang/String;", "bytesToStringImpl", "", "", "startIndex", "endIndex", "charsToBytesImpl$kotlin_stdlib", "(Ljava/lang/CharSequence;II)[B", "charsToBytesImpl", "destinationSize", "destinationOffset", "capacityNeeded", "", "checkDestinationBounds", "(III)V", "sourceSize", "checkSourceBounds$kotlin_stdlib", "checkSourceBounds", "decode", "([BII)[B", "destination", "decodeImpl", "([B[BIII)I", "decodeIntoByteArray", "(Ljava/lang/CharSequence;[BIII)I", "decodeSize", "([BII)I", "encode", "([BII)Ljava/lang/String;", "encodeIntoByteArray", "encodeIntoByteArrayImpl$kotlin_stdlib", "encodeIntoByteArrayImpl", "encodeSize", "(I)I", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "encodeToAppendable", "([BLjava/lang/Appendable;II)Ljava/lang/Appendable;", "encodeToByteArray", "encodeToByteArrayImpl$kotlin_stdlib", "encodeToByteArrayImpl", "padIndex", "byteStart", "handlePaddingSymbol", "([BIII)I", "skipIllegalSymbolsIfMime", "Z", "isMimeScheme$kotlin_stdlib", "()Z", "isUrlSafe$kotlin_stdlib", "Default", "kotlin-stdlib"})
@SinceKotlin(version="1.8")
@ExperimentalEncodingApi
public class Base64 {
    @NotNull
    private static final byte[] mimeLineSeparatorSymbols;
    private static final int bitsPerSymbol = 6;
    private static final int bitsPerByte = 8;
    private final boolean isMimeScheme;
    @NotNull
    private static final Base64 Mime;
    public static final int bytesPerGroup = 3;
    @NotNull
    private static final Base64 UrlSafe;
    public static final byte padSymbol = 61;
    public static final int mimeLineLength = 76;
    private static final int mimeGroupsPerLine = 19;
    @NotNull
    public static final Default Default;
    public static final int symbolsPerGroup = 4;
    private final boolean isUrlSafe;

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final <A extends Appendable> A encodeToAppendable(@NotNull byte[] source, @NotNull A destination, int startIndex, int endIndex) {
        void var2_2;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        byte[] byArray = this.encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex);
        String stringResult = new String(byArray, Charsets.ISO_8859_1);
        destination.append(stringResult);
        return var2_2;
    }

    static {
        Default = new Default(null);
        byte[] byArray = new byte[2];
        byArray[0] = 13;
        byArray[1] = 10;
        mimeLineSeparatorSymbols = byArray;
        UrlSafe = new Base64(true, false);
        Mime = new Base64(false, true);
    }

    public final boolean isMimeScheme$kotlin_stdlib() {
        return this.isMimeScheme;
    }

    public final int decodeIntoByteArray(@NotNull CharSequence source, @NotNull byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        byte[] byArray;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Base64 base64 = this;
        if (source instanceof String) {
            base64.checkSourceBounds$kotlin_stdlib(source.length(), startIndex, endIndex);
            String string = ((String)source).substring(startIndex, endIndex);
            Intrinsics.checkNotNullExpressionValue(string, "substring(...)");
            String string2 = string;
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.checkNotNull(string2, "null cannot be cast to non-null type java.lang.String");
            byte[] byArray2 = string2.getBytes(charset);
            byArray = byArray2;
            Intrinsics.checkNotNullExpressionValue(byArray2, "getBytes(...)");
        } else {
            byArray = base64.charsToBytesImpl$kotlin_stdlib(source, startIndex, endIndex);
        }
        byte[] byteSource = byArray;
        return Base64.decodeIntoByteArray$default(this, byteSource, destination, destinationOffset, 0, 0, 24, null);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final byte[] charsToBytesImpl$kotlin_stdlib(@NotNull CharSequence source, int startIndex, int endIndex) {
        void var4_4;
        Intrinsics.checkNotNullParameter(source, "source");
        this.checkSourceBounds$kotlin_stdlib(source.length(), startIndex, endIndex);
        byte[] byteArray = new byte[endIndex - startIndex];
        int length = 0;
        int index = startIndex;
        while (index < endIndex) {
            void var6_6;
            char symbol = source.charAt(index);
            byteArray[length++] = symbol <= '\u00ff' ? (int)symbol : 63;
            ++var6_6;
        }
        return var4_4;
    }

    public static /* synthetic */ String encode$default(Base64 base64, byte[] byArray, int n, int n2, int n3, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((n3 & 2) != 0) {
            n = 0;
        }
        if ((n3 & 4) != 0) {
            n2 = byArray.length;
        }
        return base64.encode(byArray, n, n2);
    }

    public final int encodeIntoByteArray(@NotNull byte[] source, @NotNull byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return this.encodeIntoByteArrayImpl$kotlin_stdlib(source, destination, destinationOffset, startIndex, endIndex);
    }

    /*
     * WARNING - void declaration
     */
    private final int encodeSize(int sourceSize) {
        void var4_4;
        int groups2 = (sourceSize + 3 - 1) / 3;
        int lineSeparators = this.isMimeScheme ? (groups2 + -1) / 19 : 0;
        int size = groups2 * 4 + lineSeparators * 2;
        if (size < 0) {
            throw new IllegalArgumentException("Input is too big");
        }
        return (int)var4_4;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final byte[] decode(@NotNull byte[] source, int startIndex, int endIndex) {
        void var5_5;
        Intrinsics.checkNotNullParameter(source, "source");
        this.checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        int decodeSize = this.decodeSize(source, startIndex, endIndex);
        byte[] destination = new byte[decodeSize];
        int bytesWritten = this.decodeImpl(source, destination, 0, startIndex, endIndex);
        boolean bl = bytesWritten == destination.length;
        if (!bl) {
            String string = "Check failed.";
            throw new IllegalStateException(string.toString());
        }
        return var5_5;
    }

    private Base64(boolean isUrlSafe, boolean isMimeScheme) {
        this.isUrlSafe = isUrlSafe;
        this.isMimeScheme = isMimeScheme;
        boolean bl = !this.isUrlSafe || !this.isMimeScheme;
        if (!bl) {
            String string = "Failed requirement.";
            throw new IllegalArgumentException(string.toString());
        }
    }

    public final int encodeIntoByteArrayImpl$kotlin_stdlib(@NotNull byte[] source, @NotNull byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        boolean bl;
        int groupsPerLine;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        this.checkDestinationBounds(destination.length, destinationOffset, this.encodeSize(endIndex - startIndex));
        byte[] encodeMap = this.isUrlSafe ? Base64Kt.access$getBase64UrlEncodeMap$p() : Base64Kt.access$getBase64EncodeMap$p();
        int sourceIndex = startIndex;
        int destinationIndex = destinationOffset;
        int n = groupsPerLine = this.isMimeScheme ? 19 : Integer.MAX_VALUE;
        while (sourceIndex + 2 < endIndex) {
            int groups2 = Math.min((endIndex - sourceIndex) / 3, groupsPerLine);
            for (int i = 0; i < groups2; ++i) {
                int byte1 = source[sourceIndex++] & 0xFF;
                int byte2 = source[sourceIndex++] & 0xFF;
                int byte3 = source[sourceIndex++] & 0xFF;
                int bits = byte1 << 16 | byte2 << 8 | byte3;
                destination[destinationIndex++] = encodeMap[bits >>> 18];
                destination[destinationIndex++] = encodeMap[bits >>> 12 & 0x3F];
                destination[destinationIndex++] = encodeMap[bits >>> 6 & 0x3F];
                destination[destinationIndex++] = encodeMap[bits & 0x3F];
            }
            if (groups2 != groupsPerLine || sourceIndex == endIndex) continue;
            destination[destinationIndex++] = mimeLineSeparatorSymbols[0];
            destination[destinationIndex++] = mimeLineSeparatorSymbols[1];
        }
        switch (endIndex - sourceIndex) {
            case 1: {
                int byte1 = source[sourceIndex++] & 0xFF;
                int bits = byte1 << 4;
                destination[destinationIndex++] = encodeMap[bits >>> 6];
                destination[destinationIndex++] = encodeMap[bits & 0x3F];
                destination[destinationIndex++] = 61;
                destination[destinationIndex++] = 61;
                break;
            }
            case 2: {
                int byte1 = source[sourceIndex++] & 0xFF;
                int byte2 = source[sourceIndex++] & 0xFF;
                int bits = byte1 << 10 | byte2 << 2;
                destination[destinationIndex++] = encodeMap[bits >>> 12];
                destination[destinationIndex++] = encodeMap[bits >>> 6 & 0x3F];
                destination[destinationIndex++] = encodeMap[bits & 0x3F];
                destination[destinationIndex++] = 61;
            }
        }
        boolean bl2 = bl = sourceIndex == endIndex;
        if (!bl) {
            String string = "Check failed.";
            throw new IllegalStateException(string.toString());
        }
        return destinationIndex - destinationOffset;
    }

    public static /* synthetic */ byte[] decode$default(Base64 base64, CharSequence charSequence, int n, int n2, int n3, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((n3 & 2) != 0) {
            n = 0;
        }
        if ((n3 & 4) != 0) {
            n2 = charSequence.length();
        }
        return base64.decode(charSequence, n, n2);
    }

    @NotNull
    public final byte[] encodeToByteArray(@NotNull byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        return this.encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex);
    }

    public final void checkSourceBounds$kotlin_stdlib(int sourceSize, int startIndex, int endIndex) {
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, sourceSize);
    }

    /*
     * WARNING - void declaration
     */
    private final int skipIllegalSymbolsIfMime(byte[] source, int startIndex, int endIndex) {
        void var4_4;
        if (!this.isMimeScheme) {
            return startIndex;
        }
        for (int sourceIndex = startIndex; sourceIndex < endIndex; ++sourceIndex) {
            int symbol = source[sourceIndex] & 0xFF;
            if (Base64Kt.access$getBase64DecodeMap$p()[symbol] == -1) continue;
            return sourceIndex;
        }
        return (int)var4_4;
    }

    public static /* synthetic */ int encodeIntoByteArray$default(Base64 base64, byte[] byArray, byte[] byArray2, int n, int n2, int n3, int n4, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
        }
        if ((n4 & 4) != 0) {
            n = 0;
        }
        if ((n4 & 8) != 0) {
            n2 = 0;
        }
        if ((n4 & 0x10) != 0) {
            n3 = byArray.length;
        }
        return base64.encodeIntoByteArray(byArray, byArray2, n, n2, n3);
    }

    private final void checkDestinationBounds(int destinationSize, int destinationOffset, int capacityNeeded) {
        block5: {
            block4: {
                if (destinationOffset < 0) break block4;
                if (destinationOffset <= destinationSize) break block5;
            }
            throw new IndexOutOfBoundsException("destination offset: " + destinationOffset + ", destination size: " + destinationSize);
        }
        int destinationEndIndex = destinationOffset + capacityNeeded;
        if (destinationEndIndex < 0 || destinationEndIndex > destinationSize) {
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + destinationOffset + ", destination size: " + destinationSize + ", capacity needed: " + capacityNeeded);
        }
    }

    public /* synthetic */ Base64(boolean isUrlSafe, boolean isMimeScheme, DefaultConstructorMarker $constructor_marker) {
        this(isUrlSafe, isMimeScheme);
    }

    public static /* synthetic */ byte[] decode$default(Base64 base64, byte[] byArray, int n, int n2, int n3, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((n3 & 2) != 0) {
            n = 0;
        }
        if ((n3 & 4) != 0) {
            n2 = byArray.length;
        }
        return base64.decode(byArray, n, n2);
    }

    @NotNull
    public final String bytesToStringImpl$kotlin_stdlib(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        StringBuilder stringBuilder = new StringBuilder(source.length);
        int n = source.length;
        for (int i = 0; i < n; ++i) {
            byte by = source[i];
            stringBuilder.append((char)by);
        }
        String string = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String encode(@NotNull byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        byte[] byArray = this.encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex);
        return new String(byArray, Charsets.ISO_8859_1);
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(Base64 base64, byte[] byArray, int n, int n2, int n3, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
        }
        if ((n3 & 2) != 0) {
            n = 0;
        }
        if ((n3 & 4) != 0) {
            n2 = byArray.length;
        }
        return base64.encodeToByteArray(byArray, n, n2);
    }

    public static /* synthetic */ int decodeIntoByteArray$default(Base64 base64, CharSequence charSequence, byte[] byArray, int n, int n2, int n3, int n4, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        if ((n4 & 4) != 0) {
            n = 0;
        }
        if ((n4 & 8) != 0) {
            n2 = 0;
        }
        if ((n4 & 0x10) != 0) {
            n3 = charSequence.length();
        }
        return base64.decodeIntoByteArray(charSequence, byArray, n, n2, n3);
    }

    /*
     * WARNING - void declaration
     */
    private final int decodeImpl(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        void var3_3;
        void var10_10;
        int symbol;
        int[] decodeMap = this.isUrlSafe ? Base64Kt.access$getBase64UrlDecodeMap$p() : Base64Kt.access$getBase64DecodeMap$p();
        int payload = 0;
        int byteStart = -8;
        int sourceIndex = startIndex;
        int destinationIndex = destinationOffset;
        while (sourceIndex < endIndex) {
            int symbolBits;
            if (byteStart == -8) {
                if (sourceIndex + 3 < endIndex) {
                    int symbol4;
                    int symbol3;
                    int bits;
                    int symbol1 = decodeMap[source[sourceIndex++] & 0xFF];
                    int symbol2 = decodeMap[source[sourceIndex++] & 0xFF];
                    if ((bits = symbol1 << 18 | symbol2 << 12 | (symbol3 = decodeMap[source[sourceIndex++] & 0xFF]) << 6 | (symbol4 = decodeMap[source[sourceIndex++] & 0xFF])) >= 0) {
                        destination[destinationIndex++] = (byte)(bits >> 16);
                        destination[destinationIndex++] = (byte)(bits >> 8);
                        destination[destinationIndex++] = (byte)bits;
                        continue;
                    }
                    sourceIndex -= 4;
                }
            }
            if ((symbolBits = decodeMap[symbol = source[sourceIndex] & 0xFF]) < 0) {
                if (symbolBits == -2) {
                    sourceIndex = this.handlePaddingSymbol(source, sourceIndex, endIndex, byteStart);
                    break;
                }
                if (this.isMimeScheme) {
                    ++sourceIndex;
                    continue;
                }
                StringBuilder stringBuilder = new StringBuilder().append("Invalid symbol '").append((char)symbol).append("'(");
                String string = Integer.toString(symbol, CharsKt.checkRadix(8));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                throw new IllegalArgumentException(stringBuilder.append(string).append(") at index ").append(sourceIndex).toString());
            }
            ++sourceIndex;
            payload = payload << 6 | symbolBits;
            if ((byteStart += 6) < 0) continue;
            destination[destinationIndex++] = (byte)(payload >>> byteStart);
            payload &= (1 << byteStart) - 1;
            byteStart -= 8;
        }
        if (byteStart == -2) {
            throw new IllegalArgumentException("The last unit of input does not have enough bits");
        }
        if ((sourceIndex = this.skipIllegalSymbolsIfMime(source, sourceIndex, endIndex)) < endIndex) {
            symbol = source[sourceIndex] & 0xFF;
            StringBuilder stringBuilder = new StringBuilder().append("Symbol '").append((char)symbol).append("'(");
            String string = Integer.toString(symbol, CharsKt.checkRadix(8));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            throw new IllegalArgumentException(stringBuilder.append(string).append(") at index ").append(sourceIndex - 1).append(" is prohibited after the pad character").toString());
        }
        return (int)(var10_10 - var3_3);
    }

    /*
     * WARNING - void declaration
     */
    private final int decodeSize(byte[] source, int startIndex, int endIndex) {
        int symbols = endIndex - startIndex;
        if (symbols == 0) {
            return 0;
        }
        if (symbols == 1) {
            throw new IllegalArgumentException("Input should have at list 2 symbols for Base64 decoding, startIndex: " + startIndex + ", endIndex: " + endIndex);
        }
        if (this.isMimeScheme) {
            int index = startIndex;
            while (index < endIndex) {
                void var5_5;
                int symbol = source[index] & 0xFF;
                int symbolBits = Base64Kt.access$getBase64DecodeMap$p()[symbol];
                if (symbolBits < 0) {
                    if (symbolBits == -2) {
                        symbols -= endIndex - index;
                        break;
                    }
                    --symbols;
                }
                ++var5_5;
            }
        } else if (source[endIndex + -1] == 61) {
            --symbols;
            if (source[endIndex + -2] == 61) {
                --symbols;
            }
        }
        return (int)((long)symbols * (long)6 / (long)8);
    }

    @NotNull
    public final byte[] decode(@NotNull CharSequence source, int startIndex, int endIndex) {
        byte[] byArray;
        Intrinsics.checkNotNullParameter(source, "source");
        Base64 base64 = this;
        if (source instanceof String) {
            base64.checkSourceBounds$kotlin_stdlib(source.length(), startIndex, endIndex);
            String string = ((String)source).substring(startIndex, endIndex);
            Intrinsics.checkNotNullExpressionValue(string, "substring(...)");
            String string2 = string;
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.checkNotNull(string2, "null cannot be cast to non-null type java.lang.String");
            byte[] byArray2 = string2.getBytes(charset);
            byArray = byArray2;
            Intrinsics.checkNotNullExpressionValue(byArray2, "getBytes(...)");
        } else {
            byArray = base64.charsToBytesImpl$kotlin_stdlib(source, startIndex, endIndex);
        }
        byte[] byteSource = byArray;
        return Base64.decode$default(this, byteSource, 0, 0, 6, null);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final byte[] encodeToByteArrayImpl$kotlin_stdlib(@NotNull byte[] source, int startIndex, int endIndex) {
        void var5_5;
        Intrinsics.checkNotNullParameter(source, "source");
        this.checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        int encodeSize = this.encodeSize(endIndex - startIndex);
        byte[] destination = new byte[encodeSize];
        this.encodeIntoByteArrayImpl$kotlin_stdlib(source, destination, 0, startIndex, endIndex);
        return var5_5;
    }

    public final int decodeIntoByteArray(@NotNull byte[] source, @NotNull byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        this.checkDestinationBounds(destination.length, destinationOffset, this.decodeSize(source, startIndex, endIndex));
        return this.decodeImpl(source, destination, destinationOffset, startIndex, endIndex);
    }

    public static /* synthetic */ int decodeIntoByteArray$default(Base64 base64, byte[] byArray, byte[] byArray2, int n, int n2, int n3, int n4, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        if ((n4 & 4) != 0) {
            n = 0;
        }
        if ((n4 & 8) != 0) {
            n2 = 0;
        }
        if ((n4 & 0x10) != 0) {
            n3 = byArray.length;
        }
        return base64.decodeIntoByteArray(byArray, byArray2, n, n2, n3);
    }

    public final boolean isUrlSafe$kotlin_stdlib() {
        return this.isUrlSafe;
    }

    public static /* synthetic */ Appendable encodeToAppendable$default(Base64 base64, byte[] byArray, Appendable appendable, int n, int n2, int n3, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
        }
        if ((n3 & 4) != 0) {
            n = 0;
        }
        if ((n3 & 8) != 0) {
            n2 = byArray.length;
        }
        return base64.encodeToAppendable(byArray, appendable, n, n2);
    }

    private final int handlePaddingSymbol(byte[] source, int padIndex, int endIndex, int byteStart) {
        int n;
        switch (byteStart) {
            case -8: {
                throw new IllegalArgumentException("Redundant pad character at index " + padIndex);
            }
            case -2: {
                n = padIndex + 1;
                break;
            }
            case -4: {
                int secondPadIndex = this.skipIllegalSymbolsIfMime(source, padIndex + 1, endIndex);
                if (secondPadIndex == endIndex || source[secondPadIndex] != 61) {
                    throw new IllegalArgumentException("Missing one pad character at index " + secondPadIndex);
                }
                n = secondPadIndex + 1;
                break;
            }
            case -6: {
                n = padIndex + 1;
                break;
            }
            default: {
                throw new IllegalStateException("Unreachable".toString());
            }
        }
        return n;
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\u00020\u00018\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00018\u0006\u00a2\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\u00020\u00118\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\n8\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\f\u00a8\u0006\u001a"}, d2={"Lkotlin/io/encoding/Base64$Default;", "Lkotlin/io/encoding/Base64;", "<init>", "()V", "Mime", "Lkotlin/io/encoding/Base64;", "getMime", "()Lkotlin/io/encoding/Base64;", "UrlSafe", "getUrlSafe", "", "bitsPerByte", "I", "bitsPerSymbol", "bytesPerGroup", "mimeGroupsPerLine", "mimeLineLength", "", "mimeLineSeparatorSymbols", "[B", "getMimeLineSeparatorSymbols$kotlin_stdlib", "()[B", "", "padSymbol", "B", "symbolsPerGroup", "kotlin-stdlib"})
    public static final class Default
    extends Base64 {
        public /* synthetic */ Default(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        @NotNull
        public final byte[] getMimeLineSeparatorSymbols$kotlin_stdlib() {
            return mimeLineSeparatorSymbols;
        }

        @NotNull
        public final Base64 getUrlSafe() {
            return UrlSafe;
        }

        private Default() {
            super(false, false, null);
        }

        @NotNull
        public final Base64 getMime() {
            return Mime;
        }
    }
}

