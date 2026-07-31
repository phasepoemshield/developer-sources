/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.setting;

import kotakbaz.rain.module.setting.B;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000\u00a2\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010\b\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00008\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001d"}, d2={"Lkotakbaz/rain/module/setting/Setting;", "T", "", "", "name", "initialValue", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "value", "", "set", "(Ljava/lang/Object;)V", "", "isVisible", "()Z", "Lkotlin/Function0;", "condition", "setVisible", "(Lkotlin/jvm/functions/Function0;)Lkotakbaz/rain/module/setting/Setting;", "addVisibleCondition", "onChange", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "visibility", "Lkotlin/jvm/functions/Function0;", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "rain-visuals"})
public abstract class Setting<T> {
    @NotNull
    private final String k;
    @NotNull
    private Function0<Boolean> K;
    private T l;
    private static Object[] a;

    public Setting(@NotNull String name, T initialValue) {
        int n2 = 133;
        n2 -= 6;
        Intrinsics.checkNotNullParameter(name, (String)a[n2 += -125]);
        this.k = name;
        this.K = Setting::visibility$lambda$0;
        this.l = initialValue;
    }

    @NotNull
    public final String getName() {
        return this.k;
    }

    public final T getValue() {
        return this.l;
    }

    public final void set(T value2) {
        if (Intrinsics.areEqual(this.l, value2)) {
            return;
        }
        this.l = value2;
        this.onChange(value2);
    }

    public final boolean isVisible() {
        return this.K.invoke();
    }

    @NotNull
    public B<T> setVisible(@NotNull Function0<Boolean> condition) {
        int n2 = 12;
        n2 ^= 0xFFFFFFB8;
        Intrinsics.checkNotNullParameter(condition, (String)a[n2 ^= 0xFFFFFFB5]);
        this.K = condition;
        return this;
    }

    @NotNull
    public B<T> addVisibleCondition(@NotNull Function0<Boolean> condition) {
        int n2 = -27;
        n2 += 4;
        Intrinsics.checkNotNullParameter(condition, (String)a[n2 ^= 0xFFFFFFE9]);
        Function0<Boolean> function0 = this.K;
        this.K = () -> Setting.addVisibleCondition$lambda$0(function0, condition);
        return this;
    }

    protected void onChange(T value2) {
    }

    private static final boolean visibility$lambda$0() {
        int n2 = 175;
        n2 = n2 - 65;
        boolean bl2 = n2 + -109;
        return bl2;
    }

    private static final boolean addVisibleCondition$lambda$0(Function0 $previous, Function0 $condition) {
        int n2;
        if (((Boolean)$previous.invoke()).booleanValue() && ((Boolean)$condition.invoke()).booleanValue()) {
            int n3 = 98;
            n3 -= 32;
            n2 = n3 ^= 0x43;
        } else {
            int n4 = -86;
            n4 += 98;
            n2 = n4 -= 12;
        }
        return n2 != 0;
    }

    static {
        long l2 = -2328952191635020684L;
        long l3 = 6198548349894208867L;
        long l4 = -5710670654181290850L;
        long l5 = -1005793469520824127L;
        long l6 = 2480793377993800567L;
        long l7 = -5496691419642999858L;
        long l8 = -666547716819708283L;
        long l9 = -5199052076985742538L;
        long l10 = -2977070644928237375L;
        long l11 = 6356294771126648941L;
        long l12 = 2804629552381240974L;
        long l13 = 5139443882358528190L;
        long l14 = -1556430370857597722L;
        long l15 = -1403661306444922461L;
        int n2 = -106;
        n2 += 61;
        a = new Object[n2 ^= 0xFFFFFFD0];
        long l16 = l15;
        int n3 = -143;
        n3 -= -55;
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= -120);
        char[] cArray = "\u0000\tcondition\u0000\tcondition\u0000\u0004name".toCharArray();
        long l17 = l6;
        int n4 = 38;
        n4 ^= 0x22;
        l6 = l17 ^ (0x1C00000000L ^ l17) & -1L << (n4 += 28);
        long l18 = l13;
        int n5 = -122;
        n5 -= -51;
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n5 += 103);
        while (true) {
            int n6 = -3;
            n6 ^= 0xFFFFFFC3;
            if ((int)l13 >= (int)(l6 >>> (n6 += -30))) break;
            int n7 = (int)l13;
            long l19 = l13;
            int n8 = 43;
            n8 ^= 0x1B;
            int n9 = 150;
            n9 += -39;
            l13 = l19 ^ (l19 ^ l19 + (long)(n8 -= 47)) & -1L >>> (n9 += -79);
            long l20 = l9;
            int n10 = 22;
            n10 ^= 0x1B;
            l9 = l20 ^ ((long)cArray[n7] ^ l20) & -1L >>> (n10 ^= 0x2D);
            int n11 = (int)l13;
            long l21 = l13;
            int n12 = 84;
            n12 ^= 0x75;
            int n13 = 125;
            n13 -= 85;
            l13 = l21 ^ (l21 ^ l21 + (long)(n12 += -32)) & -1L >>> (n13 ^= 8);
            int n14 = -12;
            n14 ^= 0x12;
            long l22 = l10;
            int n15 = 195;
            n15 -= 89;
            l10 = l22 ^ ((long)cArray[n11] << (n14 -= -58) ^ l22) & -1L << (n15 -= 74);
            int n16 = 81;
            n16 ^= 0xFFFFFFB5;
            int n17 = 7;
            long l23 = l12;
            int n18 = 148;
            n18 += -81;
            l12 = l23 ^ ((long)((int)l9 << (n16 ^= 0xFFFFFFF4) | (int)(l10 >>> (n17 ^= 0x27))) ^ l23) & -1L >>> (n18 ^= 0x63);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n19 = -153;
            n19 += 75;
            l14 = l24 ^ (0L ^ l24) & -1L << (n19 += 110);
            while (true) {
                int n20 = -202;
                n20 -= -76;
                if ((int)(l14 >>> (n20 ^= 0xFFFFFFA2)) >= (int)l12) break;
                int n21 = 62;
                n21 ^= 0x66;
                int n22 = 39;
                n22 += 32;
                cArray2[(int)(l14 >>> (n21 ^= 0x78))] = cArray[(int)l13 + (int)(l14 >>> (n22 += -39))];
                l14 += 0x100000000L;
            }
            int n23 = 43;
            n23 ^= 0xFFFFFF99;
            int n24 = (int)(l15 >>> (n23 ^= 0xFFFFFF92));
            l15 += 0x100000000L;
            Setting.a[n24] = new String(cArray2);
            long l25 = l13;
            int n25 = -93;
            n25 ^= 0xFFFFFF8D;
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n25 -= 14);
        }
    }
}

