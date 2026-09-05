/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class00265
 *  minecraft.class00295
 *  minecraft.class00329
 *  minecraft.class02741
 *  minecraft.class05317
 */
package minecraft;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class00265;
import minecraft.class00295;
import minecraft.class00329;
import minecraft.class02741;
import minecraft.class05317;

public class class05287 {
    public static final class05287 N = new class05287(List.of());
    private final List<class00295> y;
    private final Set<class00329> L = new HashSet<class00329>();
    private final Set<class00329> u = new HashSet<class00329>();

    public List<class00295> L() {
        return this.y;
    }

    public class05287(List<class00295> list) {
        this.y = list;
    }

    public boolean y() {
        return !this.u.isEmpty();
    }

    public boolean N() {
        return !this.L.isEmpty();
    }

    public List<class00295> N(class05317 class053172) {
        Predicate<class00329> predicate = switch (class053172.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> this.u::contains;
            case 1 -> this.L::contains;
            case 2 -> class003292 -> this.u.contains(class003292) && !this.L.contains(class003292);
        };
        ArrayList<class00295> arrayList = new ArrayList<class00295>();
        for (class00295 class002952 : this.y) {
            if (!predicate.test(class002952.N())) continue;
            arrayList.add(class002952);
        }
        return arrayList;
    }

    public void N(class02741 class027412, Predicate<class00265> predicate) {
        for (class00295 class002952 : this.y) {
            boolean bl = predicate.test(class002952.y());
            if (bl) {
                this.u.add(class002952.N());
            } else {
                this.u.remove(class002952.N());
            }
            if (bl && class002952.N(class027412)) {
                this.L.add(class002952.N());
                continue;
            }
            this.L.remove(class002952.N());
        }
    }

    public boolean N(class00329 class003292) {
        return this.L.contains(class003292);
    }
}

