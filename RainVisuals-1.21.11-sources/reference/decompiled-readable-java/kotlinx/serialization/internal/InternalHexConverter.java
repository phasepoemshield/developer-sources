/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2={"Lkotlinx/serialization/internal/InternalHexConverter;", "", "<init>", "()V", "", "ch", "", "hexToInt", "(C)I", "", "s", "", "parseHexBinary", "(Ljava/lang/String;)[B", "data", "", "lowerCase", "printHexBinary", "([BZ)Ljava/lang/String;", "n", "toHexString", "(I)Ljava/lang/String;", "hexCode", "Ljava/lang/String;", "kotlinx-serialization-core"})
public final class InternalHexConverter {
    @NotNull
    public static final InternalHexConverter INSTANCE = new InternalHexConverter();
    @NotNull
    private static final String hexCode = "0123456789ABCDEF";

    /*
     * Unable to fully structure code
     */
    @NotNull
    public final byte[] parseHexBinary(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        len = s.length();
        if (!(len % 2 == 0)) {
            $i$a$-require-InternalHexConverter$parseHexBinary$1 = false;
            $i$a$-require-InternalHexConverter$parseHexBinary$1 = "HexBinary string must be even length";
            throw new IllegalArgumentException($i$a$-require-InternalHexConverter$parseHexBinary$1.toString());
        }
        bytes = new byte[len / 2];
        i = 0;
        while (i < len) {
            h = this.hexToInt(s.charAt(i));
            l = this.hexToInt(s.charAt(i + 1));
            if (h == -1) ** GOTO lbl-1000
            if (l != -1) {
                v0 = true;
            } else lbl-1000:
            // 2 sources

            {
                v0 = false;
            }
            if (!v0) {
                $i$a$-require-InternalHexConverter$parseHexBinary$2 = false;
                var7_10 = "Invalid hex chars: " + s.charAt(i) + s.charAt(i + 1);
                throw new IllegalArgumentException(var7_10.toString());
            }
            bytes[i / 2] = (byte)((var5_7 << 4) + var6_8);
            var4_5 += 2;
        }
        return var3_6;
    }

    public static /* synthetic */ String printHexBinary$default(InternalHexConverter internalHexConverter, byte[] byArray, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        return internalHexConverter.printHexBinary(byArray, bl);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final String toHexString(int n) {
        byte[] arr = new byte[4];
        int i = 0;
        while (i < 4) {
            void var3_3;
            arr[i] = (byte)(n >> 24 - i * 8);
            ++var3_3;
        }
        Object object = new char[1];
        object[0] = 48;
        Object it = object = (Object)StringsKt.trimStart(this.printHexBinary(arr, true), object);
        boolean bl = false;
        Object object2 = ((CharSequence)it).length() > 0 ? object : null;
        Object object3 = object2;
        if (object2 == null) {
            object3 = "0";
        }
        return object3;
    }

    @NotNull
    public final String printHexBinary(@NotNull byte[] data, boolean lowerCase) {
        String string;
        Intrinsics.checkNotNullParameter(data, "data");
        StringBuilder r = new StringBuilder(data.length * 2);
        for (byte b2 : data) {
            r.append(hexCode.charAt(b2 >> 4 & 0xF));
            r.append(hexCode.charAt(b2 & 0xF));
        }
        if (lowerCase) {
            String string2 = r.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            String string3 = string2.toLowerCase(Locale.ROOT);
            string = string3;
            Intrinsics.checkNotNullExpressionValue(string3, "toLowerCase(...)");
        } else {
            String string4 = r.toString();
            string = string4;
            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
        }
        return string;
    }

    private InternalHexConverter() {
    }

    /*
     * WARNING - void declaration
     */
    private final int hexToInt(char ch) {
        int n;
        block1: {
            void var1_1;
            char c;
            block0: {
                c = ch;
                boolean bl = '0' <= c ? c < ':' : false;
                if (!bl) break block0;
                n = ch - 48;
                break block1;
            }
            n = ('A' <= c ? c < 'G' : false) ? ch - 65 + 10 : (('a' <= c ? c < 'g' : false) ? var1_1 - 97 + 10 : -1);
        }
        return n;
    }
}

