/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Codec
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02666
 *  minecraft.class02678
 *  minecraft.class02695
 *  minecraft.class02713
 *  minecraft.class04247
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02477;
import minecraft.class02480;
import minecraft.class02504;
import minecraft.class02666;
import minecraft.class02678;
import minecraft.class02695;
import minecraft.class02713;
import minecraft.class04247;

public final class class02471
implements Predicate<class02666> {
    public static final Codec<class02471> N = class02477.u.xmap(map -> new class02471(map.entrySet().stream().map(class02480::N).collect(Collectors.toList())), class024712 -> class024712.u.stream().filter(class024802 -> !class024802.N().u()).collect(Collectors.toMap(class02480::N, class02480::y)));
    public static final class02362<class04247, class02471> y = class02480.N.N_33(class02389.N()).N_10(class02471::new, class024712 -> class024712.u);
    public static final class02471 L = new class02471(List.of());
    private final List<class02480<?>> u;

    public boolean L() {
        return this.u.isEmpty();
    }

    class02471(List<class02480<?>> list) {
        this.u = list;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (!(object instanceof class02471)) return false;
        class02471 class024712 = (class02471)object;
        if (!this.u.equals(class024712.u)) return false;
        return true;
    }

    public String toString() {
        return this.u.toString();
    }

    public int hashCode() {
        return this.u.hashCode();
    }

    public class02678 u() {
        class02713 class027132 = class02678.N();
        for (class02480<?> var3 : this.u) {
            class027132.N(var3);
        }
        return class027132.N();
    }

    public boolean y() {
        return this.u.isEmpty();
    }

    @Override
    public boolean test(class02666 class026662) {
        for (class02480<?> var3 : this.u) {
            Object object = class026662.method_58694(var3.N());
            if (Objects.equals(var3.y(), object)) continue;
            return false;
        }
        return true;
    }

    public static class02471 N(class02695 class026952) {
        return new class02471((List<class02480<?>>)ImmutableList.copyOf((Iterable)class026952));
    }

    public static class02471 N(class02695 class026952, class02477<?> ... class02477Array) {
        class02504 class025042 = new class02504();
        for (class02477<?> class024772 : class02477Array) {
            class02480 class024802 = class026952.u(class024772);
            if (class024802 == null) continue;
            class025042.N(class024802);
        }
        return class025042.N();
    }

    public static <T> class02471 N(class02477<T> class024772, T t) {
        return new class02471(List.of(new class02480<T>(class024772, t)));
    }

    public static class02504 N() {
        return new class02504();
    }
}

