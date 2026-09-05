/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixUtils
 *  minecraft.class06069
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.datafixers.DataFixUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import minecraft.class06069;
import minecraft.class07536;
import minecraft.class08556;
import minecraft.class08560;
import minecraft.class08584;

public interface class08578<Context, Condition extends class08584<Context>> {
    public static <Context, Condition extends class08584<Context>> List<class08556<Context, Condition>> N(int n) {
        return List.of(new class08556(Optional.empty(), n));
    }

    public static <Context, Condition extends class08584<Context>> List<class08556<Context, Condition>> N(Condition Condition, int n) {
        return List.of(new class08556(Condition, n));
    }

    public static <C, T> Optional<T> N(Stream<T> stream, Function<T, class08578<C, ?>> function, class06069 class060692, C c) {
        return class07536.y_9((List)class08578.N(stream, function, c).toList(), (class06069)class060692);
    }

    public static <C, T> Stream<T> N(Stream<T> stream, Function<T, class08578<C, ?>> function, C c) {
        ArrayList arrayList = new ArrayList();
        stream.forEach(object -> {
            for (class08556 class085562 : ((class08578)function.apply(object)).N()) {
                arrayList.add(new class08560(object, class085562.y(), (class08584)DataFixUtils.orElseGet(class085562.N(), class08584::L)));
            }
        });
        arrayList.sort(class08560.L);
        Iterator iterator = arrayList.iterator();
        int n = Integer.MIN_VALUE;
        while (iterator.hasNext()) {
            class08560 class085602 = (class08560)((Object)iterator.next());
            if (class085602.y() < n) {
                iterator.remove();
                continue;
            }
            if (class085602.L().test(c)) {
                n = class085602.y();
                continue;
            }
            iterator.remove();
        }
        return arrayList.stream().map(class08560::N);
    }

    public List<class08556<Context, Condition>> N();
}

