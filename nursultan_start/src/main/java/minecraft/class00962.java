/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.EvictingQueue
 *  minecraft.class01383
 *  minecraft.class04406
 *  minecraft.class04410
 *  minecraft.class05363
 *  minecraft.class06166
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07878
 */
package minecraft;

import com.google.common.collect.EvictingQueue;
import java.util.Iterator;
import java.util.Queue;
import minecraft.class00972;
import minecraft.class01383;
import minecraft.class04406;
import minecraft.class04410;
import minecraft.class05363;
import minecraft.class06166;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07878;

public abstract class class00962<P extends class04406> {
    private static final int L = 16384;
    protected final class04410 N;
    protected final Queue<P> y = EvictingQueue.create((int)16384);

    public int L() {
        return this.y.size();
    }

    public class00962(class04410 class044102) {
        this.N = class044102;
    }

    public Queue<P> u() {
        return this.y;
    }

    private void y(class04406 class044062) {
        try {
            class044062.method_3070();
        }
        catch (Throwable throwable) {
            class07080 class070802 = class07080.N((Throwable)throwable, (String)"Ticking Particle");
            class07074 class070742 = class070802.N("Particle being ticked");
            class070742.N("Particle", () -> ((class04406)class044062).toString());
            class070742.N("Particle Type", () -> ((class06166)class044062.method_74274()).toString());
            throw new class07878(class070802);
        }
    }

    public void y() {
        if (!this.y.isEmpty()) {
            Iterator iterator = this.y.iterator();
            while (iterator.hasNext()) {
                class04406 class044062 = (class04406)iterator.next();
                this.y(class044062);
                if (class044062.method_3086()) continue;
                class044062.method_34019().ifPresent(class060642 -> this.N.N(class060642, -1));
                iterator.remove();
            }
        }
    }

    public abstract class00972 N(class01383 var1, class05363 var2, float var3);

    public void N(class04406 class044062) {
        this.y.add(class044062);
    }

    public boolean N() {
        return this.y.isEmpty();
    }
}

