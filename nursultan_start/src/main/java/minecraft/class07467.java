/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet
 *  minecraft.class04643
 *  minecraft.class05764
 *  minecraft.class07430
 *  minecraft.class07963
 *  minecraft.class07998
 *  minecraft.class08700
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class04643;
import minecraft.class05764;
import minecraft.class07430;
import minecraft.class07473;
import minecraft.class07963;
import minecraft.class07998;
import minecraft.class08700;

public class class07467 {
    private static final class05764 N = new class07998(Integer.MAX_VALUE, (class07473)new class07963());
    private final Map<class07430, class05764> y = new EnumMap<class07430, class05764>(class07430.class);
    private final Set<class05764> L = new ObjectLinkedOpenHashSet();
    private final EnumSet<class07430> u = EnumSet.noneOf(class07430.class);

    public void y(class07430 class074302) {
        this.u.remove(class074302);
    }

    public Set<class05764> y() {
        return this.L;
    }

    public void N(class07430 class074302, boolean bl) {
        if (bl) {
            this.y(class074302);
        } else {
            this.N(class074302);
        }
    }

    public void N(class07430 class074302) {
        this.u.add(class074302);
    }

    public void N(Predicate<class07473> predicate) {
        this.L.removeIf(class057642 -> predicate.test(class057642.U()));
    }

    public void N(class07473 class074732) {
        for (class05764 class057643 : this.L) {
            if (class057643.U() != class074732 || !class057643.M()) continue;
            class057643.u();
        }
        this.L.removeIf(class057642 -> class057642.U() == class074732);
    }

    private static boolean N(class05764 class057642, EnumSet<class07430> enumSet) {
        for (class07430 class074302 : class057642.z()) {
            if (!enumSet.contains(class074302)) continue;
            return true;
        }
        return false;
    }

    private static boolean N(class05764 class057642, Map<class07430, class05764> map) {
        for (class07430 class074302 : class057642.z()) {
            if (map.getOrDefault(class074302, N).N(class057642)) continue;
            return false;
        }
        return true;
    }

    public void N() {
        class04643 class046432 = class08700.N();
        class046432.N("goalCleanup");
        for (class05764 class057642 : this.L) {
            if (!class057642.M() || !class07467.N(class057642, this.u) && class057642.y()) continue;
            class057642.u();
        }
        this.y.entrySet().removeIf(entry -> !((class05764)entry.getValue()).M());
        class046432.L();
        class046432.N("goalUpdate");
        for (class05764 class057642 : this.L) {
            if (class057642.M() || class07467.N(class057642, this.u) || !class07467.N(class057642, this.y) || !class057642.N()) continue;
            for (class07430 class074302 : class057642.z()) {
                this.y.getOrDefault(class074302, N).u();
                this.y.put(class074302, class057642);
            }
            class057642.L();
        }
        class046432.L();
        this.N(true);
    }

    public void N(boolean bl) {
        class04643 class046432 = class08700.N();
        class046432.N("goalTick");
        for (class05764 class057642 : this.L) {
            if (!class057642.M() || !bl && !class057642.B()) continue;
            class057642.i();
        }
        class046432.L();
    }

    public void N(int n, class07473 class074732) {
        this.L.add(new class05764(n, class074732));
    }
}

