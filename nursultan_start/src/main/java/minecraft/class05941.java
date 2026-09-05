/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01296
 *  minecraft.class04995
 *  minecraft.class06092
 *  minecraft.class06153
 *  minecraft.class07003
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07321
 *  minecraft.class07322
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01296;
import minecraft.class04995;
import minecraft.class06092;
import minecraft.class06153;
import minecraft.class07003;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07321;
import minecraft.class07322;
import org.jspecify.annotations.Nullable;

public class class05941<T>
extends AbstractIterator<T> {
    private final class00734 N;
    private final class06092 y;
    private final class06153 L;
    private final class07218 u;
    private final class00494 i;
    private final class07322 R;
    private final boolean M;
    private @Nullable class07290 B;
    private long Z;
    private final BiFunction<class07218, class00494, T> z;

    public class05941(class07322 class073222, @Nullable class07049 class070492, class00734 class007342, boolean bl, BiFunction<class07218, class00494, T> biFunction) {
        this(class073222, class070492 == null ? class06092.N() : class06092.N((class07049)class070492), class007342, bl, biFunction);
    }

    public class05941(class07322 class073222, class06092 class060922, class00734 class007342, boolean bl, BiFunction<class07218, class00494, T> biFunction) {
        this.y = class060922;
        this.u = new class07218();
        this.i = class00389.N((class00734)class007342);
        this.R = class073222;
        this.N = class007342;
        this.M = bl;
        this.z = biFunction;
        int n = class04995.N((double)(class007342.N - 1.0E-7)) - 1;
        int n2 = class04995.N((double)(class007342.u + 1.0E-7)) + 1;
        int n3 = class04995.N((double)(class007342.y - 1.0E-7)) - 1;
        int n4 = class04995.N((double)(class007342.i + 1.0E-7)) + 1;
        int n5 = class04995.N((double)(class007342.L - 1.0E-7)) - 1;
        int n6 = class04995.N((double)(class007342.R + 1.0E-7)) + 1;
        this.L = new class06153(n, n3, n5, n2, n4, n6);
    }

    private @Nullable class07290 N(int n, int n2) {
        class07290 class072902;
        int n3 = class01296.N((int)n);
        int n4 = class01296.N((int)n2);
        long l = class07321.u((int)n3, (int)n4);
        if (this.B != null && this.Z == l) {
            return this.B;
        }
        this.B = class072902 = this.R.method_22338(n3, n4);
        this.Z = l;
        return class072902;
    }

    protected T computeNext() {
        while (this.L.N()) {
            class07290 class072902;
            int n = this.L.y();
            int n2 = this.L.L();
            int n3 = this.L.u();
            int n4 = this.L.i();
            if (n4 == 3 || (class072902 = this.N(n, n3)) == null) continue;
            this.u.N(n, n2, n3);
            class00500 class005002 = class072902.method_8320((class07209)this.u);
            if (this.M && !class005002.z(class072902, (class07209)this.u) || n4 == 1 && !class005002.E() || n4 == 2 && !class005002.N(class00869.LN)) continue;
            class00494 class004942 = this.y.N(class005002, this.R, (class07209)this.u);
            if (class004942 == class00389.y()) {
                if (!this.N.N((double)n, (double)n2, (double)n3, (double)n + 1.0, (double)n2 + 1.0, (double)n3 + 1.0)) continue;
                return this.z.apply(this.u, class004942.method_66507((class00753)this.u));
            }
            class00494 class004943 = class004942.method_66507((class00753)this.u);
            if (class004943.method_1110() || !class00389.L((class00494)class004943, (class00494)this.i, (class07003)class07003.Z)) continue;
            return this.z.apply(this.u, class004943);
        }
        return (T)this.endOfData();
    }
}

