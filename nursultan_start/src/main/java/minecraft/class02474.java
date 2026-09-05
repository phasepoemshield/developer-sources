/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00800
 *  minecraft.class02710
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import minecraft.class00800;
import minecraft.class02465;
import minecraft.class02468;
import minecraft.class02490;
import minecraft.class02710;

public abstract class class02474
implements class02465<class02710> {
    private final List<class00800> N;

    protected class02474(List<class00800> list) {
        this.N = list;
    }

    public static class02468 y(List<class00800> list) {
        return new class02468(list);
    }

    public static class02490 N(List<class00800> list) {
        return new class02490(list);
    }

    @Override
    public boolean N(class02710 class027102) {
        Iterator<class00800> var2 = this.N.iterator();
        while (var2.hasNext()) {
            if (var2.next().N(class027102)) continue;
            return false;
        }
        return true;
    }

    protected List<class00800> N() {
        return this.N;
    }

    public static <T extends class02474> Codec<T> N(Function<List<class00800>, T> function) {
        return class00800.N.listOf().xmap(function, class02474::N);
    }
}

