/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  minecraft.class00381
 *  minecraft.class00428
 *  minecraft.class00429
 *  minecraft.class00442
 *  minecraft.class00455
 *  minecraft.class00457
 *  minecraft.class01683
 *  minecraft.class02303
 *  minecraft.class02884
 *  minecraft.class06463
 *  minecraft.class06986
 *  minecraft.class06988
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07529
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.BiConsumer;
import minecraft.class00381;
import minecraft.class00428;
import minecraft.class00429;
import minecraft.class00442;
import minecraft.class00455;
import minecraft.class00457;
import minecraft.class01683;
import minecraft.class02303;
import minecraft.class02884;
import minecraft.class06463;
import minecraft.class06970;
import minecraft.class06976;
import minecraft.class06980;
import minecraft.class06986;
import minecraft.class06988;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07529;
import org.jspecify.annotations.Nullable;

public class class06963 {
    private final class01683 N;
    private final class06463 y;
    private Set<class00455<?>> L = Set.of();
    private final Map<class00455<?>, class06980<?>> u = new HashMap();

    static <T> class06988<UUID, T> L() {
        return class069802 -> class069802.L;
    }

    public class06963(class01683 class016832, class06463 class064632) {
        this.y = class064632;
        this.N = class016832;
    }

    static <T> class06988<class07321, T> i() {
        return class069802 -> class069802.N;
    }

    static <T> class06988<class07209, T> u() {
        return class069802 -> class069802.y;
    }

    public void y() {
        this.u.clear();
        this.y(this.L);
    }

    private void y(Set<class00455<?>> set) {
        for (class00455<?> class004553 : set) {
            this.u.computeIfAbsent(class004553, class004552 -> new class06980());
        }
    }

    public void N(class07321 class073212) {
        if (this.u.isEmpty()) {
            return;
        }
        Iterator<class06980<?>> var2 = this.u.values().iterator();
        while (var2.hasNext()) {
            var2.next().N(class073212);
        }
    }

    private <K, V> void N(long l, K k, class00442<V> class004422, class06988<K, V> class069882) {
        class06976<K, V> class069762 = this.N(class004422.N(), class069882);
        if (class069762 != null) {
            class069762.N(l, k, class004422);
        }
    }

    <K, V> void N(class00455<V> class004552, class06988<K, V> class069882, BiConsumer<K, V> biConsumer) {
        class06976<BiConsumer<K, V>, V> class069762 = this.N(class004552, class069882);
        if (class069762 != null) {
            class069762.N(biConsumer);
        }
    }

    public void N(class07049 class070492) {
        if (this.u.isEmpty()) {
            return;
        }
        Iterator<class06980<?>> var2 = this.u.values().iterator();
        while (var2.hasNext()) {
            var2.next().L.N(class070492.method_5667());
        }
    }

    private <K, V> @Nullable class06976<K, V> N(class00455<V> class004552, class06988<K, V> class069882) {
        class06980<V> class069802 = this.N(class004552);
        return class069802 != null ? class069882.get(class069802) : null;
    }

    <V> @Nullable class06980<V> N(class00455<V> class004552) {
        return this.u.get(class004552);
    }

    private void N(Set<class00455<?>> set) {
        this.u.keySet().retainAll(set);
        this.y(set);
        this.N.N((class00381)new class02884(set));
    }

    public void N(long l) {
        Set<class00455<?>> var3 = this.R();
        if (!var3.equals(this.L)) {
            this.L = var3;
            this.N(var3);
        }
        this.u.forEach((class004552, class069802) -> {
            if (class004552.L() != 0) {
                class069802.N(l);
            }
        });
    }

    public void N() {
        this.L = Set.of();
        this.y();
    }

    private static void N(Set<class00455<?>> set, class00455<?> class004552, boolean bl) {
        if (bl) {
            set.add(class004552);
        }
    }

    public <T> void N(long l, class00428<T> class004282) {
        class06980 class069802 = this.N(class004282.N());
        if (class069802 != null) {
            class069802.u.add(new class06986(class004282.y(), l + (long)class004282.N().L()));
        }
    }

    public <T> void N(long l, class07049 class070492, class00442<T> class004422) {
        this.N(l, class070492.method_5667(), class004422, class06963.L());
    }

    public <T> void N(long l, class07209 class072092, class00442<T> class004422) {
        this.N(l, class072092, class004422, class06963.u());
    }

    <K, V> @Nullable V N(class00455<V> class004552, K k, class06988<K, V> class069882) {
        class06976<K, V> class069762 = this.N(class004552, class069882);
        return class069762 != null ? (V)class069762.y(k) : null;
    }

    public class00457 N(class07299 class072992) {
        return new class06970(this, class072992);
    }

    public <T> void N(long l, class07321 class073212, class00442<T> class004422) {
        this.N(l, class073212, class004422, class06963.i());
    }

    private Set<class00455<?>> R() {
        ReferenceOpenHashSet referenceOpenHashSet = new ReferenceOpenHashSet();
        class06963.N(referenceOpenHashSet, class02303.field_48817.N(), this.y.i());
        if (class07529.T) {
            class06963.N(referenceOpenHashSet, class00429.y, class07529.A);
            class06963.N(referenceOpenHashSet, class00429.B, class07529.A);
            class06963.N(referenceOpenHashSet, class00429.L, class07529.p);
            class06963.N(referenceOpenHashSet, class00429.u, class07529.NM);
            class06963.N(referenceOpenHashSet, class00429.M, class07529.Nt);
            class06963.N(referenceOpenHashSet, class00429.R, class07529.k);
            class06963.N(referenceOpenHashSet, class00429.s, class07529.J);
            class06963.N(referenceOpenHashSet, class00429.m, class07529.J);
            class06963.N(referenceOpenHashSet, class00429.i, class07529.X || class07529.A);
            class06963.N(referenceOpenHashSet, class00429.P, class07529.O);
            class06963.N(referenceOpenHashSet, class00429.Z, class07529.F);
            class06963.N(referenceOpenHashSet, class00429.E, class07529.f);
            class06963.N(referenceOpenHashSet, class00429.z, class07529.g);
            class06963.N(referenceOpenHashSet, class00429.W, class07529.I);
            class06963.N(referenceOpenHashSet, class00429.U, class07529.a);
        }
        return referenceOpenHashSet;
    }
}

