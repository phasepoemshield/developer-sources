/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01231
 *  minecraft.class03530
 *  minecraft.class03689
 *  minecraft.class03696
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05352
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05444
 *  minecraft.class05456
 *  minecraft.class05765
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07475
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import minecraft.class01231;
import minecraft.class03530;
import minecraft.class03689;
import minecraft.class03696;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05352;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05444;
import minecraft.class05456;
import minecraft.class05765;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07475;
import org.jspecify.annotations.Nullable;

public class class02140<E extends class07475>
extends class05765<E> {
    private static final int N = 100;
    private static final int y = 120;
    private static final int L = 5;
    private static final int u = 4;
    private final float i;
    private final Function<class07475, class03530<class03689>> R;
    private final Function<E, class06889> Z;

    protected void L(class04782 class047822, E e, long l) {
        e.method_18868().y(class05378.NN);
    }

    public class02140(float f) {
        this(f, class074752 -> class03696.I, class074752 -> class05456.N((class07475)class074752, (int)5, (int)4));
    }

    public class02140(float f, int n) {
        this(f, class074752 -> class03696.I, class074752 -> class05444.N((class07475)class074752, (int)5, (int)4, (int)n, (double)class074752.method_5828((float)0.0f).M, (double)class074752.method_5828((float)0.0f).Z, (double)1.5707963705062866));
    }

    public class02140(float f, Function<class07475, class03530<class03689>> function) {
        this(f, function, class074752 -> class05456.N((class07475)class074752, (int)5, (int)4));
    }

    public class02140(float f, Function<class07475, class03530<class03689>> function, Function<E, class06889> function2) {
        super(Map.of(class05378.NN, class05367.field_18458, class05378.d, class05367.field_18458), 100, 120);
        this.i = f;
        this.R = function;
        this.Z = function2;
    }

    protected void u(class04782 class047822, E e, long l) {
        class06889 class068892;
        if (e.f().U() && (class068892 = this.N(e, class047822)) != null) {
            e.method_18868().N(class05378.m, (Object)new class05352(class068892, this.i, 0));
        }
    }

    protected void y(class04782 class047822, E e, long l) {
        e.method_18868().N(class05378.NN, (Object)true);
        e.method_18868().y(class05378.m);
        e.f().W();
    }

    protected boolean N(class04782 class047822, E e) {
        return e.method_18868().L(class05378.d).map(class070722 -> class070722.N(this.R.apply((class07475)e))).orElse(false) != false || e.method_18868().N(class05378.NN);
    }

    private @Nullable class06889 N(E e, class04782 class047822) {
        Optional<class06889> optional;
        if (e.method_5809() && (optional = this.N((class07290)class047822, (class07049)e).map(class06889::L)).isPresent()) {
            return optional.get();
        }
        return this.Z.apply(e);
    }

    private Optional<class07209> N(class07290 class072902, class07049 class070492) {
        class07209 class072094 = class070492.method_24515();
        if (!class072902.method_8320(class072094).M(class072902, class072094).method_1110()) {
            return Optional.empty();
        }
        Predicate<class07209> predicate = class04995.u((float)class070492.method_17681()) == 2 ? class072093 -> class07209.method_51686((class07209)class072093).allMatch(class072092 -> class072902.method_8316(class072092).N(class01231.N)) : class072092 -> class072902.method_8316(class072092).N(class01231.N);
        return class07209.method_25997((class07209)class072094, (int)5, (int)1, predicate);
    }

    protected boolean N(class04782 class047822, E e, long l) {
        return true;
    }
}

