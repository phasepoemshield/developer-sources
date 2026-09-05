/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00145
 *  minecraft.class00160
 *  minecraft.class00165
 *  minecraft.class00381
 *  minecraft.class00423
 *  minecraft.class00638
 *  minecraft.class00648
 *  minecraft.class01636
 *  minecraft.class01673
 *  minecraft.class02362
 *  minecraft.class03242
 *  minecraft.class03260
 *  minecraft.class03276
 *  minecraft.class04262
 *  minecraft.class06244
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import minecraft.class00145;
import minecraft.class00160;
import minecraft.class00165;
import minecraft.class00381;
import minecraft.class00423;
import minecraft.class00638;
import minecraft.class00648;
import minecraft.class01636;
import minecraft.class01673;
import minecraft.class02362;
import minecraft.class02865;
import minecraft.class02882;
import minecraft.class02888;
import minecraft.class02890;
import minecraft.class02897;
import minecraft.class02898;
import minecraft.class03242;
import minecraft.class03260;
import minecraft.class03276;
import minecraft.class04262;
import minecraft.class06244;
import org.jspecify.annotations.Nullable;

public class class02896<T extends class00638, B extends ByteBuf, C> {
    final class00648 N;
    final class00423 y;
    private final List<class02898<T, ?, B, C>> L = new ArrayList();
    private @Nullable class03276 u;

    public static <T extends class01636, B extends ByteBuf, C> class00160<T, B, C> L(class00648 class006482, Consumer<class02896<T, B, C>> consumer) {
        return class02896.y(class006482, class00423.field_11941, consumer);
    }

    public class02896(class00648 class006482, class00423 class004232) {
        this.N = class006482;
        this.y = class004232;
    }

    public static <T extends class01673, B extends ByteBuf, C> class00160<T, B, C> u(class00648 class006482, Consumer<class02896<T, B, C>> consumer) {
        return class02896.y(class006482, class00423.field_11942, consumer);
    }

    private static <L extends class00638, B extends ByteBuf, C> class00160<L, B, C> y(class00648 class006482, class00423 class004232, Consumer<class02896<L, B, C>> consumer) {
        class02896 class028962 = new class02896(class006482, class004232);
        consumer.accept(class028962);
        return class028962.N();
    }

    public static <T extends class01673, B extends ByteBuf> class00165<T, B> y(class00648 class006482, Consumer<class02896<T, B, class06244>> consumer) {
        return class02896.N(class006482, class00423.field_11942, consumer);
    }

    private static <L extends class00638, B extends ByteBuf> class00165<L, B> N(class00648 class006482, class00423 class004232, Consumer<class02896<L, B, class06244>> consumer) {
        class02896 class028962 = new class02896(class006482, class004232);
        consumer.accept(class028962);
        return class028962.N(class06244.field_17274);
    }

    public static <T extends class01636, B extends ByteBuf> class00165<T, B> N(class00648 class006482, Consumer<class02896<T, B, class06244>> consumer) {
        return class02896.N(class006482, class00423.field_11941, consumer);
    }

    public class00160<T, B, C> N() {
        List<class02898<T, ?, B, C>> list = List.copyOf(this.L);
        class03276 class032762 = this.u;
        class04262 class042622 = class02896.N(this.N, this.y, list);
        return new class02882(this, list, class032762, class042622);
    }

    public <P extends class00381<? super T>> class02896<T, B, C> N(class02897<P> class028972, class02362<? super B, P> class023622) {
        this.L.add(new class02898(class028972, class023622, null));
        return this;
    }

    public <P extends class03260<? super T>, D extends class03242<? super T>> class02896<T, B, C> N(class02897<P> class028972, Function<Iterable<class00381<? super T>>, P> function, D d) {
        class02362 class023622 = class02362.N(d);
        class02897 class028973 = d.method_65080();
        this.L.add(new class02898(class028973, class023622, null));
        this.u = class03276.N(class028972, function, d);
        return this;
    }

    class02362<ByteBuf, class00381<? super T>> N(Function<ByteBuf, B> function, List<class02898<T, ?, B, C>> list, C c) {
        class02890 class028902 = new class02890(this.y);
        Iterator<class02898<T, ?, B, C>> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().N(class028902, function, c);
        }
        return class028902.N();
    }

    private static class04262 N(class00648 class006482, class00423 class004232, List<? extends class02898<?, ?, ?, ?>> list) {
        return new class02865(class006482, class004232, list);
    }

    public class00165<T, B> N(C c) {
        List<class02898<T, ?, B, C>> list = List.copyOf(this.L);
        class03276 class032762 = this.u;
        class04262 class042622 = class02896.N(this.N, this.y, list);
        return new class02888(this, list, c, class032762, class042622);
    }

    public <P extends class00381<? super T>> class02896<T, B, C> N(class02897<P> class028972, class02362<? super B, P> class023622, class00145<B, P, C> class001452) {
        this.L.add(new class02898(class028972, class023622, class001452));
        return this;
    }
}

