/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02484
 *  minecraft.class04247
 *  minecraft.class04830
 *  minecraft.class06584
 *  minecraft.class08588
 *  net.fabricmc.fabric.mixin.transfer.BundleContentsAccessor
 *  org.apache.commons.lang3.math.Fraction
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.stream.Stream;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02484;
import minecraft.class04247;
import minecraft.class04830;
import minecraft.class06584;
import minecraft.class08588;
import net.fabricmc.fabric.mixin.transfer.BundleContentsAccessor;
import org.apache.commons.lang3.math.Fraction;

public final class class02830
implements class04830,
BundleContentsAccessor {
    public static final class02830 N = new class02830(List.of());
    public static final Codec<class02830> y = class06584.y.listOf().flatXmap(class02830::N, class028302 -> DataResult.success(class028302.i));
    public static final class02362<class04247, class02830> L = class06584.z.N_33(class02389.N()).N_10(class02830::new, class028302 -> class028302.i);
    private static final Fraction B = Fraction.getFraction((int)1, (int)16);
    private static final int Z = -1;
    public static final int u = -1;
    final List<class06584> i;
    final Fraction R;
    final int M;

    public Iterable<class06584> L() {
        return this.i;
    }

    public static /* synthetic */ Fraction L(class06584 class065842) {
        return class02830.N(class065842);
    }

    public boolean M() {
        return this.i.isEmpty();
    }

    class02830(List<class06584> list, Fraction fraction, int n) {
        this.i = list;
        this.R = fraction;
        this.M = n;
    }

    public class02830(List<class06584> list) {
        this(list, class02830.y(list), -1);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof class02830) {
            class02830 class028302 = (class02830)object;
            return this.R.equals((Object)class028302.R) && class06584.N(this.i, class028302.i);
        }
        return false;
    }

    public String toString() {
        return "BundleContents" + String.valueOf(this.i);
    }

    public int hashCode() {
        return class06584.N(this.i);
    }

    public int B() {
        return this.M;
    }

    public boolean Z() {
        return this.M != -1;
    }

    public int i() {
        return this.i.size();
    }

    public Iterable<class06584> u() {
        return Lists.transform(this.i, class06584::t);
    }

    public static boolean y(class06584 class065842) {
        return !class065842.R() && class065842.B().u();
    }

    private static Fraction y(List<class06584> list) {
        Fraction fraction = Fraction.ZERO;
        for (class06584 class065842 : list) {
            fraction = fraction.add(class02830.N(class065842).multiplyBy(Fraction.getFraction((int)class065842.c(), (int)1)));
        }
        return fraction;
    }

    public Stream<class06584> y() {
        return this.i.stream().map(class06584::t);
    }

    public int N() {
        int n = this.i();
        int n2 = n > 12 ? 11 : 12;
        int n3 = n % 4;
        int n4 = n3 == 0 ? 0 : 4 - n3;
        return Math.min(n, n2 - n4);
    }

    public class06584 N(int n) {
        return this.i.get(n);
    }

    private static DataResult<class02830> N(List<class06584> list) {
        try {
            Fraction fraction = class02830.y(list);
            return DataResult.success((Object)new class02830(list, fraction, -1));
        }
        catch (ArithmeticException arithmeticException) {
            return DataResult.error(() -> "Excessive total bundle weight");
        }
    }

    static Fraction N(class06584 class065842) {
        class02830 class028302 = (class02830)class065842.method_58694(class02484.D);
        if (class028302 != null) {
            return B.add(class028302.R());
        }
        if (!((class08588)class065842.a_(class02484.Nd, (Object)class08588.L)).N().isEmpty()) {
            return Fraction.ONE;
        }
        return Fraction.getFraction((int)1, (int)class065842.U());
    }

    public Fraction R() {
        return this.R;
    }
}

