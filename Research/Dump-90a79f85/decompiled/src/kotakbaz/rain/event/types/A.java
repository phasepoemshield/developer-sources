/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.event.types;

import java.util.HashMap;
import java.util.Map;
import kotakbaz.rain.event.types.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\u0004\b\t\u0010\nJ'\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0004\b\u000b\u0010\fR8\u0010\u000f\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\rj\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u0001`\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0012"}, d2={"Lkotakbaz/rain/event/types/Event;", "", "<init>", "()V", "T", "Lkotakbaz/rain/event/types/Event$Key;", "key", "value", "", "put", "(Lkotakbaz/rain/event/types/Event$Key;Ljava/lang/Object;)V", "get", "(Lkotakbaz/rain/event/types/Event$Key;)Ljava/lang/Object;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "data", "Ljava/util/HashMap;", "Key", "rain-visuals"})
public abstract class A {
    @NotNull
    private final HashMap<b<?>, Object> L = new HashMap();
    private static Object[] a;

    public A() {
        super();
    }

    public final <T> void put(@NotNull b<T> b2, @NotNull T t2) {
        int n = 47;
        n += -103;
        Intrinsics.checkNotNullParameter(b2, (String)a[n += 57]);
        int n2 = -80;
        n2 -= -101;
        Intrinsics.checkNotNullParameter(t2, (String)a[n2 ^= 0x17]);
        ((Map)this.L).put(b2, t2);
    }

    @Nullable
    public final <T> T get(@NotNull b<T> b2) {
        int n = -62;
        n ^= 0x35;
        Intrinsics.checkNotNullParameter(b2, (String)a[n ^= 0xFFFFFFF7]);
        Object object = this.L.get(b2);
        if (object == null) {
            object = null;
        }
        return (T)object;
    }

    static {
        long l = 2922175874732295757L;
        long l2 = -7157951928929455496L;
        long l3 = -8454090291597973278L;
        long l4 = 5122107419193567639L;
        long l5 = -5253504533733761631L;
        long l6 = 2440811886174465109L;
        long l7 = 6934933474484140853L;
        long l8 = -1484604570533234959L;
        long l9 = 1781248317232462664L;
        long l10 = -2878610560024209188L;
        long l11 = -9042199192618441928L;
        long l12 = 2904020108212891279L;
        long l13 = 5225109967512339466L;
        long l14 = 3059661821137478809L;
        int n = -87;
        n += 113;
        a = new Object[n ^= 0x19];
        long l15 = l14;
        int n2 = 126;
        n2 ^= 0xFFFFFFDF;
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 ^= 0xFFFFFF81);
        char[] cArray = "\u0000\u0003key\u0000\u0003key\u0000\u0005value".toCharArray();
        long l16 = l5;
        int n3 = -142;
        n3 -= -102;
        l5 = l16 ^ (0x1100000000L ^ l16) & -1L << (n3 += 72);
        long l17 = l12;
        int n4 = 48;
        n4 ^= 0x6B;
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n4 ^= 0x7B);
        while (true) {
            int n5 = 130;
            n5 -= -27;
            if ((int)l12 >= (int)(l5 >>> (n5 += -125))) break;
            int n6 = (int)l12;
            long l18 = l12;
            int n7 = 106;
            n7 -= 17;
            int n8 = -18;
            n8 += -66;
            l12 = l18 ^ (l18 ^ l18 + (long)(n7 ^= 0x58)) & -1L >>> (n8 ^= 0xFFFFFF8C);
            long l19 = l8;
            int n9 = -124;
            n9 ^= 0xFFFFFFEC;
            l8 = l19 ^ ((long)cArray[n6] ^ l19) & -1L >>> (n9 -= 72);
            int n10 = (int)l12;
            long l20 = l12;
            int n11 = 98;
            n11 ^= 0x38;
            int n12 = -6;
            n12 += -56;
            l12 = l20 ^ (l20 ^ l20 + (long)(n11 += -89)) & -1L >>> (n12 += 94);
            int n13 = 111;
            n13 -= 97;
            long l21 = l9;
            int n14 = 121;
            n14 -= 41;
            l9 = l21 ^ ((long)cArray[n10] << (n13 ^= 0x2E) ^ l21) & -1L << (n14 += -48);
            int n15 = 99;
            n15 ^= 0xC;
            n15 += -95;
            int n16 = 37;
            n16 -= 80;
            long l22 = l11;
            int n17 = 38;
            n17 ^= 0xFFFFFFCF;
            l11 = l22 ^ ((long)((int)l8 << n15 | (int)(l9 >>> (n16 -= -75))) ^ l22) & -1L >>> (n17 ^= 0xFFFFFFC9);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n18 = -17;
            n18 += 65;
            l13 = l23 ^ (0L ^ l23) & -1L << (n18 += -16);
            while (true) {
                int n19 = 14;
                n19 += -103;
                if ((int)(l13 >>> (n19 -= -121)) >= (int)l11) break;
                int n20 = 58;
                n20 += 83;
                int n21 = -72;
                n21 ^= 0xFFFFFFED;
                cArray2[(int)(l13 >>> (n20 += -109))] = cArray[(int)l12 + (int)(l13 >>> (n21 += -53))];
                l13 += 0x100000000L;
            }
            int n22 = 89;
            n22 -= -21;
            int n23 = (int)(l14 >>> (n22 ^= 0x4E));
            l14 += 0x100000000L;
            A.a[n23] = new String(cArray2);
            long l24 = l12;
            int n24 = 104;
            n24 ^= 1;
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n24 -= 73);
        }
    }
}

