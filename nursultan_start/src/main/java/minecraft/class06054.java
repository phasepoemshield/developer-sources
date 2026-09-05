/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  minecraft.class00500
 *  minecraft.class00554
 *  minecraft.class00869
 *  minecraft.class01296
 *  minecraft.class07209
 *  minecraft.class07284
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import minecraft.class00500;
import minecraft.class00554;
import minecraft.class00869;
import minecraft.class01296;
import minecraft.class07209;
import minecraft.class07284;
import org.jspecify.annotations.Nullable;

public class class06054
implements AutoCloseable {
    private final class07284 N;
    private final Long2ObjectMap<class00554> y = new Long2ObjectOpenHashMap();
    private @Nullable class00554 L;
    private long u;

    public class06054(class07284 class072842) {
        this.N = class072842;
    }

    @Override
    public void close() {
        ObjectIterator var1 = this.y.values().iterator();
        while (var1.hasNext()) {
            ((class00554)var1.next()).y();
        }
    }

    public class00500 y(class07209 class072092) {
        class00554 class005542 = this.N(class072092);
        if (class005542 == null) {
            return class00869.N.W();
        }
        int n = class01296.y((int)class072092.method_10263());
        int n2 = class01296.y((int)class072092.method_10264());
        int n3 = class01296.y((int)class072092.method_10260());
        return class005542.N(n, n2, n3);
    }

    public @Nullable class00554 N(class07209 class072092) {
        int n = this.N.method_31602(class072092.method_10264());
        if (n < 0 || n >= this.N.method_32890()) {
            return null;
        }
        long l2 = class01296.L((class07209)class072092);
        if (this.L == null || this.u != l2) {
            this.L = (class00554)this.y.computeIfAbsent(l2, l -> {
                class00554 class005542 = this.N.method_8392(class01296.N((int)class072092.method_10263()), class01296.N((int)class072092.method_10260())).y(n);
                class005542.N();
                return class005542;
            });
            this.u = l2;
        }
        return this.L;
    }
}

