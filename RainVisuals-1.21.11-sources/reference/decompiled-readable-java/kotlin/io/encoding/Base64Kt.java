/*
 * Decompiled with CFR 0.152.
 */
package kotlin.io.encoding;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.ArraysKt;
import kotlin.io.encoding.ExperimentalEncodingApi;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0006\u001a\u00020\u00058\u0002X\u0083\u0004\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\t\"\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u001a\u0010\r\u001a\u00020\u00058\u0002X\u0083\u0004\u00a2\u0006\f\n\u0004\b\r\u0010\u0007\u0012\u0004\b\u000e\u0010\t\"\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\f\u00a8\u0006\u0010"}, d2={"", "symbol", "", "isInMimeAlphabet", "(I)Z", "", "base64DecodeMap", "[I", "getBase64DecodeMap$annotations", "()V", "", "base64EncodeMap", "[B", "base64UrlDecodeMap", "getBase64UrlDecodeMap$annotations", "base64UrlEncodeMap", "kotlin-stdlib"})
public final class Base64Kt {
    @NotNull
    private static final byte[] base64EncodeMap;
    @NotNull
    private static final int[] base64UrlDecodeMap;
    @NotNull
    private static final int[] base64DecodeMap;
    @NotNull
    private static final byte[] base64UrlEncodeMap;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @SinceKotlin(version="1.8")
    @ExperimentalEncodingApi
    public static final boolean isInMimeAlphabet(int symbol) {
        if (0 > symbol) return false;
        if (symbol >= base64DecodeMap.length) return false;
        boolean bl = true;
        if (!bl) return false;
        if (base64DecodeMap[symbol] == -1) return false;
        return true;
    }

    public static final /* synthetic */ byte[] access$getBase64EncodeMap$p() {
        return base64EncodeMap;
    }

    /*
     * WARNING - void declaration
     */
    static {
        int n;
        Object[] objectArray = new byte[64];
        objectArray[0] = 65;
        objectArray[1] = 66;
        objectArray[2] = 67;
        objectArray[3] = 68;
        objectArray[4] = 69;
        objectArray[5] = 70;
        objectArray[6] = 71;
        objectArray[7] = 72;
        objectArray[8] = 73;
        objectArray[9] = 74;
        objectArray[10] = 75;
        objectArray[11] = 76;
        objectArray[12] = 77;
        objectArray[13] = 78;
        objectArray[14] = 79;
        objectArray[15] = 80;
        objectArray[16] = 81;
        objectArray[17] = 82;
        objectArray[18] = 83;
        objectArray[19] = 84;
        objectArray[20] = 85;
        objectArray[21] = 86;
        objectArray[22] = 87;
        objectArray[23] = 88;
        objectArray[24] = 89;
        objectArray[25] = 90;
        objectArray[26] = 97;
        objectArray[27] = 98;
        objectArray[28] = 99;
        objectArray[29] = 100;
        objectArray[30] = 101;
        objectArray[31] = 102;
        objectArray[32] = 103;
        objectArray[33] = 104;
        objectArray[34] = 105;
        objectArray[35] = 106;
        objectArray[36] = 107;
        objectArray[37] = 108;
        objectArray[38] = 109;
        objectArray[39] = 110;
        objectArray[40] = 111;
        objectArray[41] = 112;
        objectArray[42] = 113;
        objectArray[43] = 114;
        objectArray[44] = 115;
        objectArray[45] = 116;
        objectArray[46] = 117;
        objectArray[47] = 118;
        objectArray[48] = 119;
        objectArray[49] = 120;
        objectArray[50] = 121;
        objectArray[51] = 122;
        objectArray[52] = 48;
        objectArray[53] = 49;
        objectArray[54] = 50;
        objectArray[55] = 51;
        objectArray[56] = 52;
        objectArray[57] = 53;
        objectArray[58] = 54;
        objectArray[59] = 55;
        objectArray[60] = 56;
        objectArray[61] = 57;
        objectArray[62] = 43;
        objectArray[63] = 47;
        base64EncodeMap = objectArray;
        Object[] $this$base64DecodeMap_u24lambda_u241 = objectArray = (Object[])new int[256];
        boolean bl = false;
        ArraysKt.fill$default((int[])$this$base64DecodeMap_u24lambda_u241, -1, 0, 0, 6, null);
        $this$base64DecodeMap_u24lambda_u241[61] = -2;
        byte[] $this$forEachIndexed$iv = base64EncodeMap;
        boolean $i$f$forEachIndexed = false;
        int index$iv = 0;
        int n2 = $this$forEachIndexed$iv.length;
        for (n = 0; n < n2; ++n) {
            byte item$iv = $this$forEachIndexed$iv[n];
            int n3 = index$iv++;
            byte symbol = item$iv;
            int index = n3;
            boolean bl2 = false;
            $this$base64DecodeMap_u24lambda_u241[symbol] = index;
        }
        base64DecodeMap = objectArray;
        objectArray = new byte[64];
        objectArray[0] = 65;
        objectArray[1] = 66;
        objectArray[2] = 67;
        objectArray[3] = 68;
        objectArray[4] = 69;
        objectArray[5] = 70;
        objectArray[6] = 71;
        objectArray[7] = 72;
        objectArray[8] = 73;
        objectArray[9] = 74;
        objectArray[10] = 75;
        objectArray[11] = 76;
        objectArray[12] = 77;
        objectArray[13] = 78;
        objectArray[14] = 79;
        objectArray[15] = 80;
        objectArray[16] = 81;
        objectArray[17] = 82;
        objectArray[18] = 83;
        objectArray[19] = 84;
        objectArray[20] = 85;
        objectArray[21] = 86;
        objectArray[22] = 87;
        objectArray[23] = 88;
        objectArray[24] = 89;
        objectArray[25] = 90;
        objectArray[26] = 97;
        objectArray[27] = 98;
        objectArray[28] = 99;
        objectArray[29] = 100;
        objectArray[30] = 101;
        objectArray[31] = 102;
        objectArray[32] = 103;
        objectArray[33] = 104;
        objectArray[34] = 105;
        objectArray[35] = 106;
        objectArray[36] = 107;
        objectArray[37] = 108;
        objectArray[38] = 109;
        objectArray[39] = 110;
        objectArray[40] = 111;
        objectArray[41] = 112;
        objectArray[42] = 113;
        objectArray[43] = 114;
        objectArray[44] = 115;
        objectArray[45] = 116;
        objectArray[46] = 117;
        objectArray[47] = 118;
        objectArray[48] = 119;
        objectArray[49] = 120;
        objectArray[50] = 121;
        objectArray[51] = 122;
        objectArray[52] = 48;
        objectArray[53] = 49;
        objectArray[54] = 50;
        objectArray[55] = 51;
        objectArray[56] = 52;
        objectArray[57] = 53;
        objectArray[58] = 54;
        objectArray[59] = 55;
        objectArray[60] = 56;
        objectArray[61] = 57;
        objectArray[62] = 45;
        objectArray[63] = 95;
        base64UrlEncodeMap = objectArray;
        Object[] $this$base64UrlDecodeMap_u24lambda_u243 = objectArray = (Object[])new int[256];
        boolean bl3 = false;
        ArraysKt.fill$default((int[])$this$base64UrlDecodeMap_u24lambda_u243, -1, 0, 0, 6, null);
        $this$base64UrlDecodeMap_u24lambda_u243[61] = -2;
        $this$forEachIndexed$iv = base64UrlEncodeMap;
        $i$f$forEachIndexed = false;
        index$iv = 0;
        n2 = $this$forEachIndexed$iv.length;
        for (n = 0; n < n2; ++n) {
            void var5_5;
            byte by;
            byte by2 = by = $this$forEachIndexed$iv[n];
            void var10_10 = ++var5_5;
            boolean bl4 = false;
            var1_1[by2] = var10_10;
        }
        base64UrlDecodeMap = objectArray;
    }

    @ExperimentalEncodingApi
    private static /* synthetic */ void getBase64DecodeMap$annotations() {
    }

    public static final /* synthetic */ int[] access$getBase64UrlDecodeMap$p() {
        return base64UrlDecodeMap;
    }

    @ExperimentalEncodingApi
    private static /* synthetic */ void getBase64UrlDecodeMap$annotations() {
    }

    public static final /* synthetic */ int[] access$getBase64DecodeMap$p() {
        return base64DecodeMap;
    }

    public static final /* synthetic */ byte[] access$getBase64UrlEncodeMap$p() {
        return base64UrlEncodeMap;
    }
}

