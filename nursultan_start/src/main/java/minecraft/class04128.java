/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10309
 *  Nursultan.class10310
 *  Nursultan.class10311
 *  Nursultan.class10314
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.kinds.Const$Mu
 *  com.mojang.datafixers.kinds.IdF
 *  com.mojang.datafixers.kinds.IdF$Mu
 *  com.mojang.datafixers.kinds.OptionalBox
 *  com.mojang.datafixers.kinds.OptionalBox$Mu
 *  com.mojang.datafixers.util.Function3
 *  com.mojang.datafixers.util.Function4
 *  com.mojang.datafixers.util.Unit
 *  minecraft.class05378
 *  minecraft.class07438
 */
package minecraft;

import Nursultan.class10309;
import Nursultan.class10310;
import Nursultan.class10311;
import Nursultan.class10314;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Function4;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class04104;
import minecraft.class04106;
import minecraft.class04110;
import minecraft.class04115;
import minecraft.class04117;
import minecraft.class04118;
import minecraft.class04124;
import minecraft.class04130;
import minecraft.class04134;
import minecraft.class04137;
import minecraft.class04139;
import minecraft.class04140;
import minecraft.class04146;
import minecraft.class05378;
import minecraft.class07438;

public final class class04128<E extends class07438>
implements Applicative<class10309<E>, class10314<E>> {
    public <Value> class04137<E, class04139<Const.Mu<Unit>, Value>> L(class05378<Value> class053782) {
        return new class10310(new class04104<Value>(class053782));
    }

    public <Value> class04137<E, class04139<IdF.Mu, Value>> y(class05378<Value> class053782) {
        return new class10310(new class04130<Value>(class053782));
    }

    public <Value> Value y(class04139<IdF.Mu, Value> class041392) {
        return (Value)IdF.get(class041392.N());
    }

    public <T1, T2, T3, R> class04137<E, R> ap3(App<class10309<E>, Function3<T1, T2, T3, R>> app, App<class10309<E>, T1> app2, App<class10309<E>, T2> app3, App<class10309<E>, T3> app4) {
        class04140<E, T1> class041402 = class04137.y(app2);
        class04140<E, T2> class041403 = class04137.y(app3);
        class04140<E, T3> class041404 = class04137.y(app4);
        class04140<E, Function3<T1, T2, T3, R>> class041405 = class04137.y(app);
        return class04137.N(new class04117(this, class041402, class041403, class041404, class041405));
    }

    public <A, B, R> class04137<E, R> ap2(App<class10309<E>, BiFunction<A, B, R>> app, App<class10309<E>, A> app2, App<class10309<E>, B> app3) {
        class04140<E, A> class041402 = class04137.y(app2);
        class04140<E, B> class041403 = class04137.y(app3);
        class04140<E, BiFunction<A, B, R>> class041404 = class04137.y(app);
        return class04137.N(new class04124(this, class041402, class041403, class041404));
    }

    public <T, R> class04137<E, R> map(Function<? super T, ? extends R> function, App<class10309<E>, T> app) {
        class04140<E, T> class041402 = class04137.y(app);
        return class04137.N(new class04134(this, class041402, function));
    }

    public <T1, T2, T3, T4, R> class04137<E, R> ap4(App<class10309<E>, Function4<T1, T2, T3, T4, R>> app, App<class10309<E>, T1> app2, App<class10309<E>, T2> app3, App<class10309<E>, T3> app4, App<class10309<E>, T4> app5) {
        class04140<E, T1> class041402 = class04137.y(app2);
        class04140<E, T2> class041403 = class04137.y(app3);
        class04140<E, T3> class041404 = class04137.y(app4);
        class04140<E, T4> class041405 = class04137.y(app5);
        class04140<E, Function4<T1, T2, T3, T4, R>> class041406 = class04137.y(app);
        return class04137.N(new class04115(this, class041402, class041403, class041404, class041405, class041406));
    }

    public <Value> class04137<E, class04139<OptionalBox.Mu, Value>> N(class05378<Value> class053782) {
        return new class10310(new class04106<Value>(class053782));
    }

    public class04137<E, Unit> N(class04118<? super E> class041182) {
        return new class10311(class041182);
    }

    public <A> class04137<E, A> point(A a) {
        return new class04110(a);
    }

    public <A> class04137<E, A> N(Supplier<String> supplier, A a) {
        return new class04110(a, supplier);
    }

    public <Value> Optional<Value> N(class04139<OptionalBox.Mu, Value> class041392) {
        return OptionalBox.unbox(class041392.N());
    }

    public <A, R> Function<App<class10309<E>, A>, App<class10309<E>, R>> lift1(App<class10309<E>, Function<A, R>> app) {
        return app2 -> {
            class04140 class041402 = class04137.y(app2);
            class04140 class041403 = class04137.y(app);
            return class04137.N(new class04146(this, class041402, class041403));
        };
    }
}

