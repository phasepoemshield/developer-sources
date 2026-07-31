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
public abstract class Event {
    @NotNull
    private final HashMap<b<?>, Object> L = new HashMap();
    private static Object[] a;

    public final <T> void put(@NotNull b<T> key, @NotNull T value2) {
        int n2 = 47;
        n2 += -103;
        Intrinsics.checkNotNullParameter(key, (String)a[n2 += 57]);
        int n3 = -80;
        n3 -= -101;
        Intrinsics.checkNotNullParameter(value2, (String)a[n3 ^= 0x17]);
        ((Map)this.L).put(key, value2);
    }

    @Nullable
    public final <T> T get(@NotNull b<T> key) {
        int n2 = -62;
        n2 ^= 0x35;
        Intrinsics.checkNotNullParameter(key, (String)a[n2 ^= 0xFFFFFFF7]);
        Object object = this.L.get(key);
        if (object == null) {
            object = null;
        }
        return (T)object;
    }

    static {
        long l2 = 2922175874732295757L;
        long l3 = -7157951928929455496L;
        long l4 = -8454090291597973278L;
        long l5 = 5122107419193567639L;
        long l6 = -5253504533733761631L;
        long l7 = 2440811886174465109L;
        long l8 = 6934933474484140853L;
        long l9 = -1484604570533234959L;
        long l10 = 1781248317232462664L;
        long l11 = -2878610560024209188L;
        long l12 = -9042199192618441928L;
        long l13 = 2904020108212891279L;
        long l14 = 5225109967512339466L;
        long l15 = 3059661821137478809L;
        int n2 = -87;
        n2 += 113;
        a = new Object[n2 ^= 0x19];
        long l16 = l15;
        int n3 = 126;
        n3 ^= 0xFFFFFFDF;
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 ^= 0xFFFFFF81);
        char[] cArray = "\u0000\u0003key\u0000\u0003key\u0000\u0005value".toCharArray();
        long l17 = l6;
        int n4 = -142;
        n4 -= -102;
        l6 = l17 ^ (0x1100000000L ^ l17) & -1L << (n4 += 72);
        long l18 = l13;
        int n5 = 48;
        n5 ^= 0x6B;
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n5 ^= 0x7B);
        while (true) {
            int n6 = 130;
            n6 -= -27;
            if ((int)l13 >= (int)(l6 >>> (n6 += -125))) break;
            int n7 = (int)l13;
            long l19 = l13;
            int n8 = 106;
            n8 -= 17;
            int n9 = -18;
            n9 += -66;
            l13 = l19 ^ (l19 ^ l19 + (long)(n8 ^= 0x58)) & -1L >>> (n9 ^= 0xFFFFFF8C);
            long l20 = l9;
            int n10 = -124;
            n10 ^= 0xFFFFFFEC;
            l9 = l20 ^ ((long)cArray[n7] ^ l20) & -1L >>> (n10 -= 72);
            int n11 = (int)l13;
            long l21 = l13;
            int n12 = 98;
            n12 ^= 0x38;
            int n13 = -6;
            n13 += -56;
            l13 = l21 ^ (l21 ^ l21 + (long)(n12 += -89)) & -1L >>> (n13 += 94);
            int n14 = 111;
            n14 -= 97;
            long l22 = l10;
            int n15 = 121;
            n15 -= 41;
            l10 = l22 ^ ((long)cArray[n11] << (n14 ^= 0x2E) ^ l22) & -1L << (n15 += -48);
            int n16 = 99;
            n16 ^= 0xC;
            n16 += -95;
            int n17 = 37;
            n17 -= 80;
            long l23 = l12;
            int n18 = 38;
            n18 ^= 0xFFFFFFCF;
            l12 = l23 ^ ((long)((int)l9 << n16 | (int)(l10 >>> (n17 -= -75))) ^ l23) & -1L >>> (n18 ^= 0xFFFFFFC9);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n19 = -17;
            n19 += 65;
            l14 = l24 ^ (0L ^ l24) & -1L << (n19 += -16);
            while (true) {
                int n20 = 14;
                n20 += -103;
                if ((int)(l14 >>> (n20 -= -121)) >= (int)l12) break;
                int n21 = 58;
                n21 += 83;
                int n22 = -72;
                n22 ^= 0xFFFFFFED;
                cArray2[(int)(l14 >>> (n21 += -109))] = cArray[(int)l13 + (int)(l14 >>> (n22 += -53))];
                l14 += 0x100000000L;
            }
            int n23 = 89;
            n23 -= -21;
            int n24 = (int)(l15 >>> (n23 ^= 0x4E));
            l15 += 0x100000000L;
            Event.a[n24] = new String(cArray2);
            long l25 = l13;
            int n25 = 104;
            n25 ^= 1;
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n25 -= 73);
        }
    }
}

