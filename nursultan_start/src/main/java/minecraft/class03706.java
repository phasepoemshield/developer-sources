/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02270
 */
package minecraft;

import java.util.concurrent.atomic.AtomicInteger;
import minecraft.class02270;

public class class03706 {
    private final AtomicInteger N = new AtomicInteger();
    private final class02270 y;

    public class03706(class02270 class022702) {
        this.y = class022702;
    }

    public void N(int n) {
        this.N.getAndAdd(n);
    }

    public void N() {
        this.y.N((long)this.N.getAndSet(0));
    }
}

