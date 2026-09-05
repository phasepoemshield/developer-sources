/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.Table
 *  com.google.common.primitives.UnsignedLong
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class00724
 *  minecraft.class07001
 *  minecraft.class07220
 *  minecraft.class07229
 *  minecraft.class07709
 *  minecraft.class07713
 *  minecraft.class07741
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.primitives.UnsignedLong;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Stream;
import minecraft.class00724;
import minecraft.class07001;
import minecraft.class07220;
import minecraft.class07229;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class07741;
import org.slf4j.Logger;

public class class00754<T> {
    private static final Logger N = LogUtils.getLogger();
    private static final String y = "Callback";
    private static final String L = "Name";
    private static final String u = "TriggerTime";
    private final class07229<T> i;
    private final Queue<class00724<T>> R = new PriorityQueue<class00724<T>>(class00754.L());
    private UnsignedLong M = UnsignedLong.ZERO;
    private final Table<String, Long, class00724<T>> B = HashBasedTable.create();

    private static <T> Comparator<class00724<T>> L() {
        return Comparator.comparingLong(class007242 -> class007242.N).thenComparing(class007242 -> class007242.y);
    }

    public class00754(class07229<T> class072292) {
        this.i = class072292;
    }

    public class00754(class07229<T> class072292, Stream<? extends Dynamic<?>> stream) {
        this(class072292);
        this.R.clear();
        this.B.clear();
        this.M = UnsignedLong.ZERO;
        stream.forEach(dynamic -> {
            class07709 class077092 = (class07709)dynamic.convert((DynamicOps)class07713.N).getValue();
            if (class077092 instanceof class07001) {
                class07001 class070012 = (class07001)class077092;
                this.N(class070012);
            } else {
                N.warn("Invalid format of events: {}", (Object)class077092);
            }
        });
    }

    public class07741 y() {
        class07741 class077412 = new class07741();
        this.R.stream().sorted(class00754.L()).map(this::N).forEach(arg_0 -> class077412.add(arg_0));
        return class077412;
    }

    public void N(T t, long l) {
        class00724<T> class007242;
        while ((class007242 = this.R.peek()) != null && class007242.N <= l) {
            this.R.remove();
            this.B.remove((Object)class007242.L, (Object)l);
            class007242.u.N(t, this, l);
        }
    }

    private void N(class07001 class070012) {
        class07220 class072202 = class070012.N_15(y, this.i.N()).orElse(null);
        if (class072202 != null) {
            String string = class070012.y(L, "");
            long l = class070012.y(u, 0L);
            this.N(string, l, class072202);
        }
    }

    public Set<String> N() {
        return Collections.unmodifiableSet(this.B.rowKeySet());
    }

    public void N(String string, long l, class07220<T> class072202) {
        if (this.B.contains((Object)string, (Object)l)) {
            return;
        }
        this.M = this.M.plus(UnsignedLong.ONE);
        class00724 class007242 = new class00724(l, this.M, string, class072202);
        this.B.put((Object)string, (Object)l, (Object)class007242);
        this.R.add(class007242);
    }

    private class07001 N(class00724<T> class007242) {
        class07001 class070012 = new class07001();
        class070012.N_67(L, class007242.L);
        class070012.N(u, class007242.N);
        class070012.N(y, this.i.N(), (Object)class007242.u);
        return class070012;
    }

    public int N(String string) {
        Collection collection = this.B.row((Object)string).values();
        collection.forEach(this.R::remove);
        int n = collection.size();
        collection.clear();
        return n;
    }
}

