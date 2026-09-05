/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00392
 *  minecraft.class04355
 *  minecraft.class05216
 *  minecraft.class05220
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class04355;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class06343;
import minecraft.class06355;
import minecraft.class06363;
import minecraft.class06366;
import minecraft.class06372;

public class class06347<T> {
    private final Supplier<T> N;
    private final Function<T, class00392> y;
    private class04355<T> L = object -> null;
    private class06372<T> u = (class063662, object) -> null;
    private Function<class06366<T>, class05216> i = class06366::L;
    private class06363<T> R = class06363.N(ImmutableList.of());
    private class06343 M = class06343.field_64539;

    public class06347(Function<T, class00392> function, Supplier<T> supplier) {
        this.y = function;
        this.N = supplier;
    }

    public class06366<T> N(int n, int n2, int n3, int n4, class00392 class003922) {
        return this.N(n, n2, n3, n4, class003922, (class063662, object) -> {});
    }

    public class06366<T> N(class00392 class003922, class06355<T> class063552) {
        return this.N(0, 0, 150, 20, class003922, class063552);
    }

    public class06347<T> N() {
        return this.N(class06343.field_64540);
    }

    public class06347<T> N(class06343 class063432) {
        this.M = class063432;
        return this;
    }

    public class06366<T> N(int n, int n2, int n3, int n4, class00392 class003922, class06355<T> class063552) {
        List<T> list = this.R.y();
        if (list.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
        }
        T t = this.N.get();
        int n5 = list.indexOf(t);
        class00392 class003923 = this.y.apply(t);
        class00392 class003924 = this.M == class06343.field_64540 ? class003923 : class05220.N((class00392)class003922, (class00392)class003923);
        return new class06366<T>(n, n2, n3, n4, class003924, class003922, n5, t, this.N, this.R, this.y, this.i, class063552, this.L, this.M, this.u);
    }

    public class06347<T> N(BooleanSupplier booleanSupplier, List<T> list, List<T> list2) {
        return this.N(class06363.N(booleanSupplier, list, list2));
    }

    public class06347<T> N(List<T> list, List<T> list2) {
        return this.N(class06363.N(class06366.N, list, list2));
    }

    @SafeVarargs
    public final class06347<T> N(T ... TArray) {
        return this.N((Collection<T>)ImmutableList.copyOf((Object[])TArray));
    }

    public class06347<T> N(Collection<T> collection) {
        return this.N(class06363.N(collection));
    }

    public class06347<T> N(class06372<T> class063722) {
        this.u = class063722;
        return this;
    }

    public class06347<T> N_57(Function<class06366<T>, class05216> function) {
        this.i = function;
        return this;
    }

    public class06347<T> N(class04355<T> class043552) {
        this.L = class043552;
        return this;
    }

    public class06347<T> N(class06363<T> class063632) {
        this.R = class063632;
        return this;
    }
}

