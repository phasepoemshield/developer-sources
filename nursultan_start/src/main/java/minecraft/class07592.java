/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00610
 *  minecraft.class07581
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import minecraft.class00610;
import minecraft.class07581;
import minecraft.class07586;
import minecraft.class07599;
import minecraft.class07606;

public class class07592<T> {
    private final Optional<Integer> N;
    private final class00610<T> y;
    private final List<class07599<T>> L;

    private long L(long l) {
        if (this.N.isPresent()) {
            return Math.floorMod(l, (int)this.N.get());
        }
        return l;
    }

    class07592(class07606<T> class076062, Optional<Integer> optional, class00610<T> class006102) {
        this.N = optional;
        this.y = class006102;
        this.L = class07592.N(class076062, optional);
    }

    private class07599<T> y(long l) {
        for (class07599<T> class075992 : this.L) {
            if (l >= (long)class075992.i()) continue;
            return class075992;
        }
        return (class07599)((Object)this.L.getLast());
    }

    public T N(long l) {
        class07599<T> class075992;
        long l2 = this.L(l);
        if (l2 <= (long)(class075992 = this.y(l2)).L()) {
            return class075992.y();
        }
        if (l2 >= (long)class075992.i()) {
            return class075992.u();
        }
        float f = (float)(l2 - (long)class075992.L()) / (float)(class075992.i() - class075992.L());
        float f2 = class075992.N().apply(f);
        return (T)this.y.apply(f2, class075992.y(), class075992.u());
    }

    private static <T> void N(class07606<T> class076062, List<class07581<T>> list, List<class07599<T>> list2) {
        for (int i = 0; i < list.size() - 1; ++i) {
            class07581<T> class075812 = list.get(i);
            class07581<T> class075813 = list.get(i + 1);
            list2.add(new class07599<T>(class076062, class075812, class075812.N(), class075813, class075813.N()));
        }
    }

    private static <T> List<class07599<T>> N(class07606<T> class076062, Optional<Integer> optional) {
        List<class07581<T>> list = class076062.N();
        if (list.size() == 1) {
            Object object = ((class07581)list.getFirst()).y();
            return List.of(new class07599<Object>(class07586.L, object, 0, object, 0));
        }
        ArrayList<class07599<T>> arrayList = new ArrayList<class07599<T>>();
        if (optional.isPresent()) {
            class07581 class075812 = (class07581)list.getFirst();
            class07581 class075813 = (class07581)list.getLast();
            arrayList.add(new class07599<T>(class076062, class075813, class075813.N() - optional.get(), class075812, class075812.N()));
            class07592.N(class076062, list, arrayList);
            arrayList.add(new class07599<T>(class076062, class075813, class075813.N(), class075812, class075812.N() + optional.get()));
        } else {
            class07592.N(class076062, list, arrayList);
        }
        return List.copyOf(arrayList);
    }
}

