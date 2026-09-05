/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  minecraft.class06256
 *  minecraft.class07321
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import minecraft.class06256;
import minecraft.class07321;
import minecraft.class08199;
import minecraft.class08201;
import org.jspecify.annotations.Nullable;

public class class08196
extends class08201 {
    private final LongSet L = new LongOpenHashSet();
    private final int u;
    private final String i;

    @Override
    protected @Nullable class06256 L() {
        return this.L.size() < this.u ? super.L() : null;
    }

    public class08196(class08199<Runnable> class081992, Executor executor, int n) {
        super(class081992, executor);
        this.u = n;
        this.i = class081992.as_();
    }

    public String u() {
        return this.i + "=[" + this.L.longStream().mapToObj(l -> l + ":" + String.valueOf(new class07321(l))).collect(Collectors.joining(",")) + "], s=" + this.y;
    }

    @Override
    protected void N(long l) {
        this.L.remove(l);
    }

    @Override
    protected void N(class06256 class062562) {
        this.L.add(class062562.N());
        super.N(class062562);
    }
}

