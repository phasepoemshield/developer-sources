/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class06086
 *  minecraft.class06095
 *  minecraft.class06132
 *  minecraft.class06202
 */
package minecraft;

import java.util.List;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicLong;
import minecraft.class00392;
import minecraft.class03547;
import minecraft.class06086;
import minecraft.class06095;
import minecraft.class06132;
import minecraft.class06202;

class class03540
extends TimerTask {
    private final class06202 N = class06202.Nq();
    private final List<class03547> y;
    private final long L;
    private final AtomicLong u;

    public class03540(List<class03547> list, long l, long l2) {
        this.y = list;
        this.L = l2;
        this.u = new AtomicLong(l);
    }

    @Override
    public void run() {
        long l = this.u.getAndAdd(this.L);
        long l2 = this.u.get();
        for (class03547 class035472 : this.y) {
            long l3;
            long l4;
            if (l < class035472.N() || (l4 = l / class035472.y()) == (l3 = l2 / class035472.y())) continue;
            this.N.execute(() -> class06132.N((class06086)class06202.Nq().m(), (class06095)class06095.M, (class00392)class00392.N((String)class035472.L(), (Object[])new Object[]{l4}), (class00392)class00392.N((String)class035472.u(), (Object[])new Object[]{l4})));
            return;
        }
    }

    public class03540 N(List<class03547> list, long l) {
        this.cancel();
        return new class03540(list, this.u.get(), l);
    }
}

