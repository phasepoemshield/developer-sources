/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import minecraft.class04319;

public final class class04326<T> {
    private final class04319 N;
    private final List<Pair<T, class04319>> y;
    private final Duration L;

    public long L() {
        return this.N.y();
    }

    public class04326(Duration duration, List<Pair<T, class04319>> list) {
        this.L = duration;
        this.N = (class04319)((Object)list.stream().map(Pair::getSecond).reduce((Object)new class04319(0L, 0L), class04319::N));
        this.y = list.stream().sorted(Comparator.comparing(Pair::getSecond, class04319.L)).limit(10L).toList();
    }

    public List<Pair<T, class04319>> i() {
        return this.y;
    }

    public long u() {
        return this.N.L();
    }

    public double y() {
        return (double)this.N.L() / (double)this.L.getSeconds();
    }

    public double N() {
        return (double)this.N.y() / (double)this.L.getSeconds();
    }
}

