/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00753
 *  minecraft.class00891
 *  minecraft.class02135
 *  minecraft.class02146
 *  minecraft.class02152
 *  minecraft.class03530
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import minecraft.class00753;
import minecraft.class00891;
import minecraft.class02135;
import minecraft.class02146;
import minecraft.class02152;
import minecraft.class03530;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;

public class class04437<E extends class07079>
extends class02152<E> {
    private final class03530<class00891> W;
    private final float m;
    private final List<class02146> P = new ArrayList<class02146>();
    private boolean s;

    public class04437(class02135 class021352, int n, int n2, float f, Function<E, class04891> function, class03530<class00891> class035302, float f2, BiPredicate<E, class07209> biPredicate) {
        super(class021352, n, n2, f, function, biPredicate);
        this.W = class035302;
        this.m = f2;
    }

    protected void y(class04782 class047822, E e, long l) {
        super.y(class047822, e, l);
        this.P.clear();
        this.s = e.method_59922().z() < this.m;
    }

    protected Optional<class02146> N(class04782 class047822) {
        if (!this.s) {
            return super.N(class047822);
        }
        class07218 class072182 = new class07218();
        while (!this.R.isEmpty()) {
            Optional var3 = super.N(class047822);
            if (!var3.isPresent()) continue;
            class02146 class021462 = (class02146)var3.get();
            if (class047822.method_8320((class07209)class072182.N((class00753)class021462.N(), class07211.field_11033)).N(this.W)) {
                return var3;
            }
            this.P.add(class021462);
        }
        if (!this.P.isEmpty()) {
            return Optional.of(this.P.remove(0));
        }
        return Optional.empty();
    }
}

