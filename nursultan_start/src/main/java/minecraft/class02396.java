/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import minecraft.class02362;
import minecraft.class02365;
import minecraft.class02381;

public class class02396<B extends ByteBuf, V, T> {
    private final List<class02365<B, V, T>> N = new ArrayList<class02365<B, V, T>>();
    private final Function<V, ? extends T> y;

    class02396(Function<V, ? extends T> function) {
        this.y = function;
    }

    public class02396<B, V, T> N(T t, class02362<? super B, ? extends V> class023622) {
        this.N.add(new class02365<B, V, T>(class023622, t));
        return this;
    }

    public class02381<B, V, T> N() {
        Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
        object2IntOpenHashMap.defaultReturnValue(-2);
        for (class02365<B, V, T> class023652 : this.N) {
            int n = object2IntOpenHashMap.size();
            if (object2IntOpenHashMap.putIfAbsent(class023652.y(), n) == -2) continue;
            throw new IllegalStateException("Duplicate registration for type " + String.valueOf(class023652.y()));
        }
        return new class02381<B, V, T>(this.y, List.copyOf(this.N), object2IntOpenHashMap);
    }
}

