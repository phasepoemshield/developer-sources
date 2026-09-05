/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10331
 *  Nursultan.class10333
 *  Nursultan.class10338
 *  it.unimi.dsi.fastutil.doubles.DoubleArrays
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00500
 *  minecraft.class00549
 *  minecraft.class00758
 *  minecraft.class00780
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01146
 *  minecraft.class01210
 *  minecraft.class01296
 *  minecraft.class01607
 *  minecraft.class03556
 *  minecraft.class04333
 *  minecraft.class04995
 *  minecraft.class05474
 *  minecraft.class05974
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07536
 *  minecraft.class07830
 *  minecraft.class08050
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10331;
import Nursultan.class10333;
import Nursultan.class10338;
import it.unimi.dsi.fastutil.doubles.DoubleArrays;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import minecraft.class00500;
import minecraft.class00549;
import minecraft.class00758;
import minecraft.class00780;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01146;
import minecraft.class01210;
import minecraft.class01296;
import minecraft.class01607;
import minecraft.class03556;
import minecraft.class04333;
import minecraft.class04995;
import minecraft.class05474;
import minecraft.class05974;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07536;
import minecraft.class07830;
import minecraft.class08050;
import org.jspecify.annotations.Nullable;

public class class03032 {
    private static final double R = 0.1;
    protected static final int N = 4;
    protected static final int y = 8;
    protected static final int L = 2;
    private static final double M = 1.0;
    private static final double B = -1.0;
    private static final int Z = 2;
    private static final int z = class01146.N((int)16);
    private static final int U = z - 1;
    private static final int E = z;
    private static final int W = 2 * U + 1;
    private static final int m = 2 * E + 1;
    static final int u = W + m;
    private final class05474 P;
    private static final List<class00891> s = List.of(class00869.E, class00869.X, class00869.Z, class00869.y, class00869.U, class00869.e, class00869.c, class00869.RC, class00869.ib, class00869.zj, class00869.z);
    protected static final double i = Double.MAX_VALUE;
    private boolean T;
    private final double[] b;
    private final List<@Nullable List<@Nullable class03556<class00780>>> j;
    private final transient double[][] v;

    private static int L(int n) {
        if (n < W) {
            return class03032.u(n - U);
        }
        int n2 = n - W;
        return E - class03032.u(n2 - E);
    }

    private int L() {
        return this.P.method_32890() * 2;
    }

    private class03032(int n, int n2, Optional<double[]> optional) {
        this.b = optional.orElseGet(() -> (double[])class07536.N((Object)new double[u], (T dArray) -> Arrays.fill(dArray, Double.MAX_VALUE)));
        this.v = new double[u][];
        ObjectArrayList objectArrayList = new ObjectArrayList(u);
        objectArrayList.size(u);
        this.j = objectArrayList;
        int n3 = class01296.L((int)n);
        int n4 = class01296.L((int)n2) - n3;
        this.P = class05474.L((int)n3, (int)n4);
    }

    private int i() {
        return this.R() + 1;
    }

    private static int u(int n) {
        return n & ~(n >> 31);
    }

    private int u() {
        return class01146.u((int)this.P.method_32890());
    }

    private List<class03556<class00780>> y(class08050 class080502, int n, int n2) {
        ObjectArrayList objectArrayList = new ObjectArrayList(this.u());
        objectArrayList.size(this.u());
        for (int i = 0; i < objectArrayList.size(); ++i) {
            int n3 = i + class01146.N((int)this.P.method_31607());
            objectArrayList.set(i, (Object)class080502.method_16359(class01146.N((int)n), n3, class01146.N((int)n2)));
        }
        return objectArrayList;
    }

    private static int y(int n) {
        if (n < W) {
            return class03032.u(U - n);
        }
        int n2 = n - W;
        return E - class03032.u(E - n2);
    }

    private static int y(int n, int n2) {
        return W + n + E - n2;
    }

    protected double y(int n, int n2, int n3) {
        if (n2 == this.R()) {
            return 0.1;
        }
        if (n == E || n3 == E) {
            return this.N(this.v[class03032.y(n, n3)], n2);
        }
        if (n == 0 || n3 == 0) {
            return this.N(this.v[class03032.N(n, n3)], n2);
        }
        return Double.MAX_VALUE;
    }

    public class05474 y() {
        return this.P;
    }

    private static double y(class08050 class080502, class07218 class072182) {
        double d = 0.0;
        for (int i = 0; i < 7; ++i) {
            d += class03032.N(class080502, class072182);
        }
        return d;
    }

    protected void N(int n, int n2, int n3, class10331 class103312) {
        if (n2 < class01146.N((int)this.P.method_31607()) || n2 > class01146.N((int)this.P.method_31600())) {
            return;
        }
        int n4 = n2 - class01146.N((int)this.P.method_31607());
        for (int i = 0; i < this.j.size(); ++i) {
            class03556<class00780> var8;
            List<class03556<class00780>> var7 = this.j.get(i);
            if (var7 == null || (var8 = var7.get(n4)) == null) continue;
            class103312.consume(n + class03032.y(i), n3 + class03032.L(i), var8);
        }
    }

    private static int N(int n, int n2) {
        return U - n + n2;
    }

    private int N(int n) {
        return n - this.i();
    }

    public class04333 N() {
        boolean bl = false;
        double[] dArray = this.b;
        int n = dArray.length;
        for (int i = 0; i < n; ++i) {
            if (dArray[i] == Double.MAX_VALUE) continue;
            bl = true;
            break;
        }
        return new class04333(this.P.method_32891(), this.P.method_31597() + 1, bl ? Optional.of(DoubleArrays.copy((double[])this.b)) : Optional.empty());
    }

    public static @Nullable class03032 N(@Nullable class04333 class043332) {
        if (class043332 == null) {
            return null;
        }
        return new class03032(class043332.N(), class043332.y(), class043332.L());
    }

    private static double N(class08050 class080502, class07218 class072182) {
        return class03032.N(class080502, (class07209)class072182.N(class07211.field_11033)) ? 1.0 : -1.0;
    }

    private double[] N(class08050 class080502, int n, int n2, int n3) {
        double d;
        double d2;
        int n4;
        double[] dArray = new double[this.L()];
        Arrays.fill(dArray, -1.0);
        class07218 class072182 = new class07218(n, this.P.method_31600() + 1, n2);
        double d3 = class03032.y(class080502, class072182);
        for (n4 = dArray.length - 2; n4 >= 0; --n4) {
            d2 = class03032.N(class080502, class072182);
            d = class03032.y(class080502, class072182);
            dArray[n4] = (d3 + d2 + d) / 15.0;
            d3 = d;
        }
        n4 = this.N(class04995.y((int)n3, (int)8));
        if (n4 >= 0 && n4 < dArray.length - 1) {
            d2 = ((double)n3 + 0.5) % 8.0 / 8.0;
            d = (1.0 - d2) / d2;
            double d4 = Math.max(d, 1.0) * 0.25;
            dArray[n4 + 1] = -d / d4;
            dArray[n4] = 1.0 / d4;
        }
        return dArray;
    }

    private static boolean N(class08050 class080502, class07209 class072092) {
        class00500 class005002 = class080502.method_8320(class072092);
        if (class005002.P()) {
            return false;
        }
        if (class005002.N(class01210.H)) {
            return false;
        }
        if (class005002.N(class01210.g)) {
            return false;
        }
        if (class005002.N(class00869.Rw) || class005002.N(class00869.Rk)) {
            return false;
        }
        return !class005002.M((class07290)class080502, class072092).method_1110();
    }

    protected double N(int n, int n2, int n3) {
        if (n == E || n3 == E) {
            return this.b[class03032.y(n, n3)];
        }
        if (n == 0 || n3 == 0) {
            return this.b[class03032.N(n, n3)];
        }
        return Double.MAX_VALUE;
    }

    private int N(class08050 class080502, int n, int n2) {
        int n3 = class080502.y(class07830.field_13194) ? Math.min(class080502.N(class07830.field_13194, n, n2), this.P.method_31600()) : this.P.method_31600();
        int n4 = this.P.method_31607();
        class07218 class072182 = new class07218(n, n3, n2);
        while (class072182.method_10264() > n4) {
            if (s.contains(class080502.method_8320((class07209)class072182).i())) {
                return class072182.method_10264();
            }
            class072182.N(class07211.field_11033);
        }
        return n4;
    }

    private void N(int n, class08050 class080502, int n2, int n3) {
        if (this.b[n] == Double.MAX_VALUE) {
            this.b[n] = this.N(class080502, n2, n3);
        }
        this.v[n] = this.N(class080502, n2, n3, class04995.N((double)this.b[n]));
        this.j.set(n, this.y(class080502, n2, n3));
    }

    private void N(class08050 class080502, Set<class00758> set) {
        int n;
        if (this.T) {
            return;
        }
        if (set.contains(class00758.field_11069) || set.contains(class00758.field_11072) || set.contains(class00758.field_11076)) {
            this.N(class03032.N(0, 0), class080502, 0, 0);
        }
        if (set.contains(class00758.field_11069)) {
            for (n = 1; n < z; ++n) {
                this.N(class03032.N(n, 0), class080502, 4 * n, 0);
            }
        }
        if (set.contains(class00758.field_11072)) {
            for (n = 1; n < z; ++n) {
                this.N(class03032.N(0, n), class080502, 0, 4 * n);
            }
        }
        if (set.contains(class00758.field_11075)) {
            for (n = 1; n < z; ++n) {
                this.N(class03032.y(E, n), class080502, 15, 4 * n);
            }
        }
        if (set.contains(class00758.field_11073)) {
            for (n = 0; n < z; ++n) {
                this.N(class03032.y(n, E), class080502, 4 * n, 15);
            }
        }
        if (set.contains(class00758.field_11075) && set.contains(class00758.field_11074)) {
            this.N(class03032.y(E, 0), class080502, 15, 0);
        }
        if (set.contains(class00758.field_11075) && set.contains(class00758.field_11073) && set.contains(class00758.field_11070)) {
            this.N(class03032.y(E, E), class080502, 15, 15);
        }
        this.T = true;
    }

    protected void N(int n, int n2, int n3, int n4, class10333 class103332) {
        int n5 = this.i();
        int n6 = Math.max(0, n3 - n5);
        int n7 = Math.min(this.L(), n4 - n5);
        for (int i = 0; i < this.v.length; ++i) {
            double[] dArray = this.v[i];
            if (dArray == null) continue;
            int n8 = n + class03032.y(i);
            int n9 = n2 + class03032.L(i);
            for (int j = n6; j < n7; ++j) {
                class103332.consume(n8, j + n5, n9, dArray[j] * 0.1);
            }
        }
    }

    public static @Nullable class03032 N(class01607 class016072, int n, int n2) {
        class08050 class080502 = class016072.method_8392(n, n2);
        class03032 class030322 = class080502.v();
        if (class030322 == null || class080502.W().u(class00549.R)) {
            return null;
        }
        class030322.N(class080502, class03032.N((class05974)class016072, n, n2, false));
        return class030322;
    }

    protected void N(int n, int n2, class10338 class103382) {
        for (int i = 0; i < this.b.length; ++i) {
            double d = this.b[i];
            if (d == Double.MAX_VALUE) continue;
            class103382.consume(n + class03032.y(i), n2 + class03032.L(i), d);
        }
    }

    public static Set<class00758> N(class05974 class059742, int n, int n2, boolean bl) {
        EnumSet<class00758> var4 = EnumSet.noneOf(class00758.class);
        for (class00758 class007582 : class00758.values()) {
            int n3;
            int n4 = n + class007582.y();
            if (class059742.method_8392(n4, n3 = n2 + class007582.L()).j() != bl) continue;
            var4.add(class007582);
        }
        return var4;
    }

    private double N(double @Nullable [] dArray, int n) {
        if (dArray == null) {
            return Double.MAX_VALUE;
        }
        int n2 = this.N(n);
        if (n2 < 0 || n2 >= dArray.length) {
            return Double.MAX_VALUE;
        }
        return dArray[n2] * 0.1;
    }

    private int R() {
        return this.P.method_32891() * 2;
    }
}

