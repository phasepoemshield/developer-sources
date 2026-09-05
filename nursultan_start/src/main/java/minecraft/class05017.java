/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  minecraft.class00536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import minecraft.class00536;
import org.jspecify.annotations.Nullable;

public abstract class class05017<M extends class05017<M>> {
    private static final int y = 2;
    private final long[] L = new long[2];
    private final @Nullable class00536[] u = new class00536[2];
    private boolean i;
    protected final Long2ObjectOpenHashMap<class00536> N;

    public @Nullable class00536 L(long l) {
        class00536 class005362;
        if (this.i) {
            for (int i = 0; i < 2; ++i) {
                if (l != this.L[i]) continue;
                return this.u[i];
            }
        }
        if ((class005362 = (class00536)this.N.get(l)) != null) {
            if (this.i) {
                for (int i = 1; i > 0; --i) {
                    this.L[i] = this.L[i - 1];
                    this.u[i] = this.u[i - 1];
                }
                this.L[0] = l;
                this.u[0] = class005362;
            }
            return class005362;
        }
        return null;
    }

    public void L() {
        for (int i = 0; i < 2; ++i) {
            this.L[i] = Long.MAX_VALUE;
            this.u[i] = null;
        }
    }

    protected class05017(Long2ObjectOpenHashMap<class00536> long2ObjectOpenHashMap) {
        this.N = long2ObjectOpenHashMap;
        this.L();
        this.i = true;
    }

    public @Nullable class00536 u(long l) {
        return (class00536)this.N.remove(l);
    }

    public void u() {
        this.i = false;
    }

    public abstract M y();

    public boolean y(long l) {
        return this.N.containsKey(l);
    }

    public class00536 N(long l) {
        class00536 class005362 = ((class00536)this.N.get(l)).y();
        this.N.put(l, (Object)class005362);
        this.L();
        return class005362;
    }

    public void N(long l, class00536 class005362) {
        this.N.put(l, (Object)class005362);
    }
}

