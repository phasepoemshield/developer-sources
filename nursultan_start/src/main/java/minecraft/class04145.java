/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class02150
 *  minecraft.class05753
 *  minecraft.class05769
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import java.util.Iterator;
import java.util.List;
import minecraft.class02150;
import minecraft.class04118;
import minecraft.class04119;
import minecraft.class04137;
import minecraft.class05753;
import minecraft.class05769;
import minecraft.class07438;

public class class04145 {
    public static <E extends class07438> class04119<E> N(List<Pair<? extends class04118<? super E>, Integer>> list, class05753 class057532, class05769 class057692) {
        class02150 class021502 = new class02150();
        list.forEach(pair -> class021502.N((Object)((class04118)pair.getFirst()), ((Integer)pair.getSecond()).intValue()));
        return class04137.N_42(class041282 -> class041282.point((class047822, class074382, l) -> {
            if (class057532 == class05753.field_18349) {
                class021502.N();
            }
            Iterator iterator = class021502.iterator();
            while (iterator.hasNext() && (!((class04118)iterator.next()).trigger(class047822, class074382, l) || class057692 != class05769.field_18855)) {
            }
            return true;
        }));
    }

    public static <E extends class07438> class04119<E> N(List<Pair<? extends class04118<? super E>, Integer>> list) {
        return class04145.N(list, class05753.field_18349, class05769.field_18855);
    }
}

