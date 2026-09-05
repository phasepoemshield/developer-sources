/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09824
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

import Nursultan.class09824;
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

public class class02709
extends class03534 {
    public static final MapCodec<class02709> N = class02709.N(class02709::new);

    public class02709(List<class04129> list, List<class05957> list2) {
        super(list, list2);
    }

    public static class09824 N(class04111<?> ... class04111Array) {
        return new class09824(class04111Array);
    }

    public class05950 N() {
        return class03942.z;
    }

    protected class03449 N(List<? extends class03449> list) {
        return switch (list.size()) {
            case 0 -> L;
            case 1 -> list.get(0);
            case 2 -> {
                class03449 var2_2 = list.get(0);
                class03449 var3_3 = list.get(1);
                yield (class059082, consumer) -> {
                    var2_2.expand(class059082, consumer);
                    var3_3.expand(class059082, consumer);
                    return true;
                };
            }
            default -> (class059082, consumer) -> {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    ((class03449)iterator.next()).expand(class059082, consumer);
                }
                return true;
            };
        };
    }
}

