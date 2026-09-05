/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class03449
 *  minecraft.class03534
 *  minecraft.class03942
 *  minecraft.class04111
 *  minecraft.class04129
 *  minecraft.class04586
 *  minecraft.class05561
 *  minecraft.class05950
 *  minecraft.class05957
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import minecraft.class03449;
import minecraft.class03534;
import minecraft.class03942;
import minecraft.class04111;
import minecraft.class04129;
import minecraft.class04480;
import minecraft.class04546;
import minecraft.class04586;
import minecraft.class05561;
import minecraft.class05950;
import minecraft.class05957;

public class class04559
extends class03534 {
    public static final MapCodec<class04559> N = class04559.N(class04559::new);
    public static final class04480 u = new class04586();

    class04559(List<class04129> list, List<class05957> list2) {
        super(list, list2);
    }

    public static <E> class04546 N(Collection<E> collection, Function<E, class04111<?>> function) {
        return new class04546((class04111[])collection.stream().map(function::apply).toArray(class04111[]::new));
    }

    public static class04546 N(class04111<?> ... class04111Array) {
        return new class04546(class04111Array);
    }

    public class05950 N() {
        return class03942.B;
    }

    public void N(class05561 class055612) {
        super.N(class055612);
        for (int i = 0; i < this.R.size() - 1; ++i) {
            if (!((class04129)this.R.get((int)i)).M.isEmpty()) continue;
            class055612.N(u);
        }
    }

    protected class03449 N(List<? extends class03449> list) {
        return switch (list.size()) {
            case 0 -> y;
            case 1 -> list.get(0);
            case 2 -> list.get(0).y(list.get(1));
            default -> (class059082, consumer) -> {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    if (!((class03449)iterator.next()).expand(class059082, consumer)) continue;
                    return true;
                }
                return false;
            };
        };
    }
}

