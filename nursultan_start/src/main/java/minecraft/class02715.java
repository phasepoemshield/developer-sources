/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  minecraft.class03556
 *  minecraft.class07304
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class02710;
import minecraft.class03556;
import minecraft.class07304;

public class class02715 {
    private final Object2IntOpenHashMap<class03556<class07304>> N = new Object2IntOpenHashMap();

    public class02715(class02710 class027102) {
        this.N.putAll(class027102.u);
    }

    public class02710 y() {
        return new class02710(this.N);
    }

    public void y(class03556<class07304> class035562, int n) {
        if (n > 0) {
            this.N.merge(class035562, Math.min(n, 255), Integer::max);
        }
    }

    public void N(Predicate<class03556<class07304>> predicate) {
        this.N.keySet().removeIf(predicate);
    }

    public Set<class03556<class07304>> N() {
        return this.N.keySet();
    }

    public int N(class03556<class07304> class035562) {
        return this.N.getOrDefault(class035562, 0);
    }

    public void N(class03556<class07304> class035562, int n) {
        if (n <= 0) {
            this.N.removeInt(class035562);
        } else {
            this.N.put(class035562, Math.min(n, 255));
        }
    }
}

