/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap
 *  minecraft.class04782
 *  minecraft.class05355
 *  minecraft.class07438
 */
package minecraft;

import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class04782;
import minecraft.class05355;
import minecraft.class07438;

public class class04051 {
    private static final class04051 N = new class04051();
    private final List<class07438> y;
    private final Predicate<class07438> L;

    public Stream<class07438> L(Predicate<class07438> predicate) {
        return this.y.stream().filter(class074382 -> predicate.test((class07438)class074382) && this.L.test((class07438)class074382));
    }

    private class04051() {
        this.y = List.of();
        this.L = class074382 -> false;
    }

    public class04051(class04782 class047822, class07438 class074384, List<class07438> list) {
        this.y = list;
        Object2BooleanOpenHashMap object2BooleanOpenHashMap = new Object2BooleanOpenHashMap(list.size());
        Predicate<class07438> predicate = class074383 -> class05355.N((class04782)class047822, (class07438)class074384, (class07438)class074383);
        this.L = class074382 -> object2BooleanOpenHashMap.computeIfAbsent(class074382, predicate);
    }

    public boolean u(Predicate<class07438> predicate) {
        for (class07438 class074382 : this.y) {
            if (!predicate.test(class074382) || !this.L.test(class074382)) continue;
            return true;
        }
        return false;
    }

    public Iterable<class07438> y(Predicate<class07438> predicate) {
        return Iterables.filter(this.y, class074382 -> predicate.test((class07438)class074382) && this.L.test((class07438)class074382));
    }

    public Optional<class07438> N(Predicate<class07438> predicate) {
        for (class07438 class074382 : this.y) {
            if (!predicate.test(class074382) || !this.L.test(class074382)) continue;
            return Optional.of(class074382);
        }
        return Optional.empty();
    }

    public boolean N(class07438 class074382) {
        return this.y.contains(class074382) && this.L.test(class074382);
    }

    public static class04051 N() {
        return N;
    }
}

