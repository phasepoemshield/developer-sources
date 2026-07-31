/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.setting;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000\u00a2\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010\b\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00008\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001d"}, d2={"Lkotakbaz/rain/module/setting/Setting;", "T", "", "", "name", "initialValue", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "value", "", "set", "(Ljava/lang/Object;)V", "", "isVisible", "()Z", "Lkotlin/Function0;", "condition", "setVisible", "(Lkotlin/jvm/functions/Function0;)Lkotakbaz/rain/module/setting/Setting;", "addVisibleCondition", "onChange", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "visibility", "Lkotlin/jvm/functions/Function0;", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "rain-visuals"})
public abstract class B<T> {
    @NotNull
    private final String k;
    @NotNull
    private Function0<Boolean> K;
    private T l;
    private static Object[] a;

    public B(@NotNull String string, T t2) {
        int n = 133;
        n -= 6;
        Intrinsics.checkNotNullParameter(string, (String)a[n += -125]);
        super();
        this.k = string;
        this.K = B::visibility$lambda$0;
        this.l = t2;
    }

    @NotNull
    public final String getName() {
        return this.k;
    }

    public final T getValue() {
        return this.l;
    }

    public final void set(T t2) {
        if (Intrinsics.areEqual(this.l, t2)) {
            return;
        }
        this.l = t2;
        this.onChange(t2);
    }

    public final boolean isVisible() {
        return this.K.invoke();
    }

    @NotNull
    public B<T> setVisible(@NotNull Function0<Boolean> function0) {
        int n = 12;
        n ^= 0xFFFFFFB8;
        Intrinsics.checkNotNullParameter(function0, (String)a[n ^= 0xFFFFFFB5]);
        this.K = function0;
        return this;
    }

    @NotNull
    public B<T> addVisibleCondition(@NotNull Function0<Boolean> function0) {
        int n = -27;
        n += 4;
        Intrinsics.checkNotNullParameter(function0, (String)a[n ^= 0xFFFFFFE9]);
        Function0<Boolean> function02 = this.K;
        this.K = () -> B.addVisibleCondition$lambda$0(function02, function0);
        return this;
    }

    protected void onChange(T t2) {
    }

    private static final boolean visibility$lambda$0() {
        int n = 175;
        n = n - 65;
        boolean bl2 = n + -109;
        return bl2;
    }

    private static final boolean addVisibleCondition$lambda$0(Function0 function0, Function0 function02) {
        int n;
        if (((Boolean)function0.invoke()).booleanValue() && ((Boolean)function02.invoke()).booleanValue()) {
            int n2 = 98;
            n2 -= 32;
            n = n2 ^= 0x43;
        } else {
            int n3 = -86;
            n3 += 98;
            n = n3 -= 12;
        }
        return n != 0;
    }

    static {
        long l = -2328952191635020684L;
        long l2 = 6198548349894208867L;
        long l3 = -5710670654181290850L;
        long l4 = -1005793469520824127L;
        long l5 = 2480793377993800567L;
        long l6 = -5496691419642999858L;
        long l7 = -666547716819708283L;
        long l8 = -5199052076985742538L;
        long l9 = -2977070644928237375L;
        long l10 = 6356294771126648941L;
        long l11 = 2804629552381240974L;
        long l12 = 5139443882358528190L;
        long l13 = -1556430370857597722L;
        long l14 = -1403661306444922461L;
        int n = -106;
        n += 61;
        a = new Object[n ^= 0xFFFFFFD0];
        long l15 = l14;
        int n2 = -143;
        n2 -= -55;
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= -120);
        char[] cArray = "\u0000\tcondition\u0000\tcondition\u0000\u0004name".toCharArray();
        long l16 = l5;
        int n3 = 38;
        n3 ^= 0x22;
        l5 = l16 ^ (0x1C00000000L ^ l16) & -1L << (n3 += 28);
        long l17 = l12;
        int n4 = -122;
        n4 -= -51;
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n4 += 103);
        while (true) {
            int n5 = -3;
            n5 ^= 0xFFFFFFC3;
            if ((int)l12 >= (int)(l5 >>> (n5 += -30))) break;
            int n6 = (int)l12;
            long l18 = l12;
            int n7 = 43;
            n7 ^= 0x1B;
            int n8 = 150;
            n8 += -39;
            l12 = l18 ^ (l18 ^ l18 + (long)(n7 -= 47)) & -1L >>> (n8 += -79);
            long l19 = l8;
            int n9 = 22;
            n9 ^= 0x1B;
            l8 = l19 ^ ((long)cArray[n6] ^ l19) & -1L >>> (n9 ^= 0x2D);
            int n10 = (int)l12;
            long l20 = l12;
            int n11 = 84;
            n11 ^= 0x75;
            int n12 = 125;
            n12 -= 85;
            l12 = l20 ^ (l20 ^ l20 + (long)(n11 += -32)) & -1L >>> (n12 ^= 8);
            int n13 = -12;
            n13 ^= 0x12;
            long l21 = l9;
            int n14 = 195;
            n14 -= 89;
            l9 = l21 ^ ((long)cArray[n10] << (n13 -= -58) ^ l21) & -1L << (n14 -= 74);
            int n15 = 81;
            n15 ^= 0xFFFFFFB5;
            int n16 = 7;
            long l22 = l11;
            int n17 = 148;
            n17 += -81;
            l11 = l22 ^ ((long)((int)l8 << (n15 ^= 0xFFFFFFF4) | (int)(l9 >>> (n16 ^= 0x27))) ^ l22) & -1L >>> (n17 ^= 0x63);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n18 = -153;
            n18 += 75;
            l13 = l23 ^ (0L ^ l23) & -1L << (n18 += 110);
            while (true) {
                int n19 = -202;
                n19 -= -76;
                if ((int)(l13 >>> (n19 ^= 0xFFFFFFA2)) >= (int)l11) break;
                int n20 = 62;
                n20 ^= 0x66;
                int n21 = 39;
                n21 += 32;
                cArray2[(int)(l13 >>> (n20 ^= 0x78))] = cArray[(int)l12 + (int)(l13 >>> (n21 += -39))];
                l13 += 0x100000000L;
            }
            int n22 = 43;
            n22 ^= 0xFFFFFF99;
            int n23 = (int)(l14 >>> (n22 ^= 0xFFFFFF92));
            l14 += 0x100000000L;
            B.a[n23] = new String(cArray2);
            long l24 = l12;
            int n24 = -93;
            n24 ^= 0xFFFFFF8D;
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n24 -= 14);
        }
    }
}

