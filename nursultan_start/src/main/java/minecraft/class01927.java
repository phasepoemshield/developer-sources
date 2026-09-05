/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09544
 *  com.mojang.serialization.MapCodec
 *  minecraft.class03449
 *  minecraft.class03534
 *  minecraft.class03942
 *  minecraft.class04111
 *  minecraft.class04129
 *  minecraft.class05950
 *  minecraft.class05957
 */
package minecraft;

import Nursultan.class09544;
import com.mojang.serialization.MapCodec;
import java.util.Iterator;
import java.util.List;
import minecraft.class03449;
import minecraft.class03534;
import minecraft.class03942;
import minecraft.class04111;
import minecraft.class04129;
import minecraft.class05950;
import minecraft.class05957;

public class class01927
extends class03534 {
    public static final MapCodec<class01927> N = class01927.N(class01927::new);

    public class01927(List<class04129> list, List<class05957> list2) {
        super(list, list2);
    }

    public static class09544 N(class04111<?> ... class04111Array) {
        return new class09544(class04111Array);
    }

    public class05950 N() {
        return class03942.Z;
    }

    protected class03449 N(List<? extends class03449> list) {
        return switch (list.size()) {
            case 0 -> L;
            case 1 -> list.get(0);
            case 2 -> list.get(0).N(list.get(1));
            default -> (class059082, consumer) -> {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    if (((class03449)iterator.next()).expand(class059082, consumer)) continue;
                    return false;
                }
                return true;
            };
        };
    }
}

