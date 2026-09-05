/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03950
 *  minecraft.class07209
 */
package minecraft;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import minecraft.class03335;
import minecraft.class03345;
import minecraft.class03950;
import minecraft.class07209;

public abstract class class03354 {
    protected final AtomicBoolean N = new AtomicBoolean(false);
    protected final AtomicBoolean y = new AtomicBoolean(false);
    protected final boolean L;
    final /* synthetic */ class03345 u;

    public boolean L() {
        return this.L;
    }

    public class03354(class03345 class033452, boolean bl) {
        this.u = class033452;
        this.L = bl;
    }

    public class07209 u() {
        return this.u.i;
    }

    protected abstract String y();

    public abstract CompletableFuture<class03335> N(class03950 var1);

    public abstract void N();
}

