/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10309
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class04782
 *  minecraft.class07438
 */
package minecraft;

import Nursultan.class10309;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import minecraft.class04118;
import minecraft.class04119;
import minecraft.class04128;
import minecraft.class04140;
import minecraft.class04143;
import minecraft.class04782;
import minecraft.class07438;

public class class04137<E extends class07438, M>
implements App<class10309<E>, M> {
    private final class04140<E, M> N;

    public class04137(class04140<E, M> class041402) {
        this.N = class041402;
    }

    public static <E extends class07438, M> class04140<E, M> y(App<class10309<E>, M> app) {
        return class04137.N(app).N;
    }

    public static <E extends class07438, M> class04137<E, M> N(class04140<E, M> class041402) {
        return new class04137<E, M>(class041402);
    }

    public static <E extends class07438> class04119<E> N_44(Predicate<E> predicate, class04119<? super E> class041192) {
        return class04137.N(class04137.N_43(predicate), class041192);
    }

    public static <E extends class07438> class04119<E> N(class04118<? super E> class041182, class04118<? super E> class041183) {
        return class04137.N_42(class041282 -> class041282.group(class041282.N(class041182)).apply((Applicative)class041282, unit -> class041183::trigger));
    }

    public static <E extends class07438> class04119<E> N_42(Function<class04128<E>, ? extends App<class10309<E>, class04118<E>>> function) {
        class04140<E, class04118<E>> class041402 = class04137.y(function.apply(class04137.N()));
        return new class04143(class041402);
    }

    public static <E extends class07438> class04128<E> N() {
        return new class04128();
    }

    public static <E extends class07438> class04119<E> N_43(Predicate<E> predicate) {
        return class04137.N_42(class041282 -> class041282.point((class047822, class074382, l) -> predicate.test(class074382)));
    }

    public static <E extends class07438> class04119<E> N(BiPredicate<class04782, E> biPredicate) {
        return class04137.N_42(class041282 -> class041282.point((class047822, class074382, l) -> biPredicate.test(class047822, class074382)));
    }

    public static <E extends class07438, M> class04137<E, M> N(App<class10309<E>, M> app) {
        return (class04137)app;
    }
}

