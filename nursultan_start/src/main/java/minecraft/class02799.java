/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02779
 */
package minecraft;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import minecraft.class02779;

public final class class02799 {
    private final AtomicLong N = new AtomicLong();
    private final AtomicInteger y = new AtomicInteger();
    private final AtomicLong L = new AtomicLong();
    private final AtomicInteger u = new AtomicInteger();
    private final class02779 i;

    public class02799(String string) {
        this.i = new class02779(string);
        this.i.begin();
    }

    public void y(int n) {
        this.u.incrementAndGet();
        this.L.addAndGet(n);
    }

    public void N(int n) {
        this.y.incrementAndGet();
        this.N.addAndGet(n);
    }

    public void N() {
        this.i.u = this.N.get();
        this.i.i = this.y.get();
        this.i.R = this.L.get();
        this.i.M = this.u.get();
        this.i.commit();
    }
}

