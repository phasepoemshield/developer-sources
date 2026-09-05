/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class05163
 *  minecraft.class06183
 *  minecraft.class06889
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  org.joml.Vector3f
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import minecraft.class04995;
import minecraft.class05163;
import minecraft.class06183;
import minecraft.class06889;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;

public class class00734 {
    private static final double B = 1.0E-7;
    public final double N;
    public final double y;
    public final double L;
    public final double u;
    public final double i;
    public final double R;
    static final /* synthetic */ boolean M;

    public class00734 L(class06889 class068892) {
        return this.u(class068892.M, class068892.B, class068892.Z);
    }

    public double L() {
        return this.i - this.y;
    }

    public boolean L(class00734 class007342) {
        return this.N(class007342.N, class007342.y, class007342.L, class007342.u, class007342.i, class007342.R);
    }

    public class00734 L(double d, double d2, double d3) {
        double d4 = this.N - d;
        double d5 = this.y - d2;
        double d6 = this.L - d3;
        double d7 = this.u + d;
        double d8 = this.i + d2;
        double d9 = this.R + d3;
        return new class00734(d4, d5, d6, d7, d8, d9);
    }

    public class00734 L(double d) {
        return new class00734(this.N, this.y, d, this.u, this.i, this.R);
    }

    public class00734 M(double d) {
        return this.L(d, d, d);
    }

    public class06889 M() {
        return new class06889(class04995.u((double)0.5, (double)this.N, (double)this.u), this.y, class04995.u((double)0.5, (double)this.L, (double)this.R));
    }

    public class00734(class07209 class072092) {
        this(class072092.method_10263(), class072092.method_10264(), class072092.method_10260(), class072092.method_10263() + 1, class072092.method_10264() + 1, class072092.method_10260() + 1);
    }

    public class00734(class06889 class068892, class06889 class068893) {
        this(class068892.M, class068892.B, class068892.Z, class068893.M, class068893.B, class068893.Z);
    }

    public class00734(double d, double d2, double d3, double d4, double d5, double d6) {
        this.N = Math.min(d, d4);
        this.y = Math.min(d2, d5);
        this.L = Math.min(d3, d6);
        this.u = Math.max(d, d4);
        this.i = Math.max(d2, d5);
        this.R = Math.max(d3, d6);
    }

    static {
        boolean bl = M = !class00734.class.desiredAssertionStatus();
        if (!M && class07185.field_11048.ordinal() != 0) {
            throw new AssertionError();
        }
        if (!M && class07185.field_11052.ordinal() != 1) {
            throw new AssertionError();
        }
        if (!M && class07185.field_11051.ordinal() != 2) {
            throw new AssertionError();
        }
        if (!M && class07185.values().length != 3) {
            throw new AssertionError();
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class00734)) {
            return false;
        }
        class00734 class007342 = (class00734)object;
        if (Double.compare(class007342.N, this.N) != 0) {
            return false;
        }
        if (Double.compare(class007342.y, this.y) != 0) {
            return false;
        }
        if (Double.compare(class007342.L, this.L) != 0) {
            return false;
        }
        if (Double.compare(class007342.u, this.u) != 0) {
            return false;
        }
        if (Double.compare(class007342.i, this.i) != 0) {
            return false;
        }
        return Double.compare(class007342.R, this.R) == 0;
    }

    public String toString() {
        return "AABB[" + this.N + ", " + this.y + ", " + this.L + "] -> [" + this.u + ", " + this.i + ", " + this.R + "]";
    }

    public int hashCode() {
        long l = Double.doubleToLongBits(this.N);
        int n = (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(this.y);
        n = 31 * n + (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(this.L);
        n = 31 * n + (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(this.u);
        n = 31 * n + (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(this.i);
        n = 31 * n + (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(this.R);
        n = 31 * n + (int)(l ^ l >>> 32);
        return n;
    }

    public class06889 B() {
        return new class06889(this.N, this.y, this.L);
    }

    public class00734 B(double d) {
        return this.M(-d);
    }

    public class06889 Z() {
        return new class06889(this.u, this.i, this.R);
    }

    public double i(class06889 class068892) {
        double d = Math.max(Math.max(this.N - class068892.M, class068892.M - this.u), 0.0);
        double d2 = Math.max(Math.max(this.y - class068892.B, class068892.B - this.i), 0.0);
        double d3 = Math.max(Math.max(this.L - class068892.Z, class068892.Z - this.R), 0.0);
        return class04995.R((double)d, (double)d2, (double)d3);
    }

    public boolean i(double d, double d2, double d3) {
        return d >= this.N && d < this.u && d2 >= this.y && d2 < this.i && d3 >= this.L && d3 < this.R;
    }

    public boolean i() {
        return Double.isNaN(this.N) || Double.isNaN(this.y) || Double.isNaN(this.L) || Double.isNaN(this.u) || Double.isNaN(this.i) || Double.isNaN(this.R);
    }

    public class00734 i(double d) {
        return new class00734(this.N, this.y, this.L, this.u, d, this.R);
    }

    public boolean u(class06889 class068892) {
        return this.i(class068892.M, class068892.B, class068892.Z);
    }

    public double u(class00734 class007342) {
        double d = Math.max(Math.max(this.N - class007342.u, class007342.N - this.u), 0.0);
        double d2 = Math.max(Math.max(this.y - class007342.i, class007342.y - this.i), 0.0);
        double d3 = Math.max(Math.max(this.L - class007342.R, class007342.L - this.R), 0.0);
        return class04995.R((double)d, (double)d2, (double)d3);
    }

    public class00734 u(double d) {
        return new class00734(this.N, this.y, this.L, d, this.i, this.R);
    }

    public double u() {
        return this.R - this.L;
    }

    public class00734 u(double d, double d2, double d3) {
        return new class00734(this.N + d, this.y + d2, this.L + d3, this.u + d, this.i + d2, this.R + d3);
    }

    public boolean y(class07209 class072092) {
        return this.N(class072092.method_10263(), class072092.method_10264(), class072092.method_10260(), class072092.method_10263() + 1, class072092.method_10264() + 1, class072092.method_10260() + 1);
    }

    public Optional<class06889> y(class06889 class068892, class06889 class068893) {
        return class00734.N(this.N, this.y, this.L, this.u, this.i, this.R, class068892, class068893);
    }

    public double y() {
        return this.u - this.N;
    }

    public class00734 y(class06889 class068892) {
        return this.y(class068892.M, class068892.B, class068892.Z);
    }

    public class00734 y(double d, double d2, double d3) {
        double d4 = this.N;
        double d5 = this.y;
        double d6 = this.L;
        double d7 = this.u;
        double d8 = this.i;
        double d9 = this.R;
        if (d < 0.0) {
            d4 += d;
        } else if (d > 0.0) {
            d7 += d;
        }
        if (d2 < 0.0) {
            d5 += d2;
        } else if (d2 > 0.0) {
            d8 += d2;
        }
        if (d3 < 0.0) {
            d6 += d3;
        } else if (d3 > 0.0) {
            d9 += d3;
        }
        return new class00734(d4, d5, d6, d7, d8, d9);
    }

    public class00734 y(double d) {
        return new class00734(this.N, d, this.L, this.u, this.i, this.R);
    }

    public class00734 y(class00734 class007342) {
        double d = Math.min(this.N, class007342.N);
        double d2 = Math.min(this.y, class007342.y);
        double d3 = Math.min(this.L, class007342.L);
        double d4 = Math.max(this.u, class007342.u);
        double d5 = Math.max(this.i, class007342.i);
        double d6 = Math.max(this.R, class007342.R);
        return new class00734(d, d2, d3, d4, d5, d6);
    }

    public double y(class07185 class071852) {
        switch (class071852.ordinal()) {
            case 0: {
                return this.u;
            }
            case 1: {
                return this.i;
            }
            case 2: {
                return this.R;
            }
        }
        throw new IllegalArgumentException();
    }

    private static @Nullable class07211 N(double[] dArray, @Nullable class07211 class072112, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, class07211 class072113, double d9, double d10, double d11) {
        double d12 = (d4 - d9) / d;
        double d13 = d10 + d12 * d2;
        double d14 = d11 + d12 * d3;
        if (0.0 < d12 && d12 < dArray[0] && d5 - 1.0E-7 < d13 && d13 < d6 + 1.0E-7 && d7 - 1.0E-7 < d14 && d14 < d8 + 1.0E-7) {
            dArray[0] = d12;
            return class072113;
        }
        return class072112;
    }

    private static @Nullable class07211 N(double d, double d2, double d3, double d4, double d5, double d6, class06889 class068892, double[] dArray, @Nullable class07211 class072112, double d7, double d8, double d9) {
        if (d7 > 1.0E-7) {
            class072112 = class00734.N(dArray, class072112, d7, d8, d9, d, d2, d5, d3, d6, class07211.field_11039, class068892.M, class068892.B, class068892.Z);
        } else if (d7 < -1.0E-7) {
            class072112 = class00734.N(dArray, class072112, d7, d8, d9, d4, d2, d5, d3, d6, class07211.field_11034, class068892.M, class068892.B, class068892.Z);
        }
        if (d8 > 1.0E-7) {
            class072112 = class00734.N(dArray, class072112, d8, d9, d7, d2, d3, d6, d, d4, class07211.field_11033, class068892.B, class068892.Z, class068892.M);
        } else if (d8 < -1.0E-7) {
            class072112 = class00734.N(dArray, class072112, d8, d9, d7, d5, d3, d6, d, d4, class07211.field_11036, class068892.B, class068892.Z, class068892.M);
        }
        if (d9 > 1.0E-7) {
            class072112 = class00734.N(dArray, class072112, d9, d7, d8, d3, d, d4, d2, d5, class07211.field_11043, class068892.Z, class068892.M, class068892.B);
        } else if (d9 < -1.0E-7) {
            class072112 = class00734.N(dArray, class072112, d9, d7, d8, d6, d, d4, d2, d5, class07211.field_11035, class068892.Z, class068892.M, class068892.B);
        }
        return class072112;
    }

    private static @Nullable class07211 N(class00734 class007342, class06889 class068892, double[] dArray, @Nullable class07211 class072112, double d, double d2, double d3) {
        return class00734.N(class007342.N, class007342.y, class007342.L, class007342.u, class007342.i, class007342.R, class068892, dArray, class072112, d, d2, d3);
    }

    public double N(class07185 class071852) {
        switch (class071852.ordinal()) {
            case 0: {
                return this.N;
            }
            case 1: {
                return this.y;
            }
            case 2: {
                return this.L;
            }
        }
        throw new IllegalArgumentException();
    }

    public static class00734 N(class06889 class068892, double d, double d2, double d3) {
        return new class00734(class068892.M - d / 2.0, class068892.B - d2 / 2.0, class068892.Z - d3 / 2.0, class068892.M + d / 2.0, class068892.B + d2 / 2.0, class068892.Z + d3 / 2.0);
    }

    public static class00734 N(class05163 class051632) {
        return new class00734(class051632.B(), class051632.Z(), class051632.z(), class051632.U() + 1, class051632.E() + 1, class051632.W() + 1);
    }

    public boolean N(class06889 class068892, List<class00734> list) {
        class06889 class068893 = this.R();
        class06889 class068894 = class068893.i(class068892);
        Iterator<class00734> iterator = list.iterator();
        while (iterator.hasNext()) {
            class00734 class007342 = iterator.next().L(this.y() * 0.5 - 1.0E-7, this.L() * 0.5 - 1.0E-7, this.u() * 0.5 - 1.0E-7);
            if (class007342.u(class068894) || class007342.u(class068893)) {
                return true;
            }
            if (!class007342.y(class068893, class068894).isPresent()) continue;
            return true;
        }
        return false;
    }

    public class00734 N(double d) {
        return new class00734(d, this.y, this.L, this.u, this.i, this.R);
    }

    public boolean N(double d, double d2, double d3, double d4, double d5, double d6) {
        return this.N < d4 && this.u > d && this.y < d5 && this.i > d2 && this.L < d6 && this.R > d3;
    }

    public class00734 N(double d, double d2, double d3) {
        double d4 = this.N;
        double d5 = this.y;
        double d6 = this.L;
        double d7 = this.u;
        double d8 = this.i;
        double d9 = this.R;
        if (d < 0.0) {
            d4 -= d;
        } else if (d > 0.0) {
            d7 -= d;
        }
        if (d2 < 0.0) {
            d5 -= d2;
        } else if (d2 > 0.0) {
            d8 -= d2;
        }
        if (d3 < 0.0) {
            d6 -= d3;
        } else if (d3 > 0.0) {
            d9 -= d3;
        }
        return new class00734(d4, d5, d6, d7, d8, d9);
    }

    public boolean N(class06889 class068892, class06889 class068893) {
        return this.N(Math.min(class068892.M, class068893.M), Math.min(class068892.B, class068893.B), Math.min(class068892.Z, class068893.Z), Math.max(class068892.M, class068893.M), Math.max(class068892.B, class068893.B), Math.max(class068892.Z, class068893.Z));
    }

    public class00734 N(Vector3f vector3f) {
        return this.u(vector3f.x, vector3f.y, vector3f.z);
    }

    public class00734 N(class07209 class072092) {
        return new class00734(this.N + (double)class072092.method_10263(), this.y + (double)class072092.method_10264(), this.L + (double)class072092.method_10260(), this.u + (double)class072092.method_10263(), this.i + (double)class072092.method_10264(), this.R + (double)class072092.method_10260());
    }

    public class00734 N(class00734 class007342) {
        double d = Math.max(this.N, class007342.N);
        double d2 = Math.max(this.y, class007342.y);
        double d3 = Math.max(this.L, class007342.L);
        double d4 = Math.min(this.u, class007342.u);
        double d5 = Math.min(this.i, class007342.i);
        double d6 = Math.min(this.R, class007342.R);
        return new class00734(d, d2, d3, d4, d5, d6);
    }

    public static Optional<class06889> N(double d, double d2, double d3, double d4, double d5, double d6, class06889 class068892, class06889 class068893) {
        double[] dArray = new double[]{1.0};
        double d7 = class068893.M - class068892.M;
        double d8 = class068893.B - class068892.B;
        double d9 = class068893.Z - class068892.Z;
        if (class00734.N(d, d2, d3, d4, d5, d6, class068892, dArray, null, d7, d8, d9) == null) {
            return Optional.empty();
        }
        double d10 = dArray[0];
        return Optional.of(class068892.y(d10 * d7, d10 * d8, d10 * d9));
    }

    public static @Nullable class06183 N(Iterable<class00734> iterable, class06889 class068892, class06889 class068893, class07209 class072092) {
        double[] dArray = new double[]{1.0};
        class07211 class072112 = null;
        double d = class068893.M - class068892.M;
        double d2 = class068893.B - class068892.B;
        double d3 = class068893.Z - class068892.Z;
        Iterator<class00734> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            class072112 = class00734.N(iterator.next().N(class072092), class068892, dArray, class072112, d, d2, d3);
        }
        if (class072112 == null) {
            return null;
        }
        double d4 = dArray[0];
        return new class06183(class068892.y(d4 * d, d4 * d2, d4 * d3), class072112, class072092, false);
    }

    public static class00734 N(class06889 class068892) {
        return new class00734(class068892.M, class068892.B, class068892.Z, class068892.M + 1.0, class068892.B + 1.0, class068892.Z + 1.0);
    }

    public double N() {
        double d = this.y();
        double d2 = this.L();
        double d3 = this.u();
        return (d + d2 + d3) / 3.0;
    }

    public static class00734 N(class07209 class072092, class07209 class072093) {
        return new class00734(Math.min(class072092.method_10263(), class072093.method_10263()), Math.min(class072092.method_10264(), class072093.method_10264()), Math.min(class072092.method_10260(), class072093.method_10260()), Math.max(class072092.method_10263(), class072093.method_10263()) + 1, Math.max(class072092.method_10264(), class072093.method_10264()) + 1, Math.max(class072092.method_10260(), class072093.method_10260()) + 1);
    }

    public class00734 R(double d) {
        return new class00734(this.N, this.y, this.L, this.u, this.i, d);
    }

    public class06889 R() {
        return new class06889(class04995.u((double)0.5, (double)this.N, (double)this.u), class04995.u((double)0.5, (double)this.y, (double)this.i), class04995.u((double)0.5, (double)this.L, (double)this.R));
    }

    public class00734 R(double d, double d2, double d3) {
        return this.L(-d, -d2, -d3);
    }
}

