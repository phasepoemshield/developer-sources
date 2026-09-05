/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class00392
 *  minecraft.class05511
 *  minecraft.class05513
 *  minecraft.class05906
 *  minecraft.class08405
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class05511;
import minecraft.class05513;
import minecraft.class05893;
import minecraft.class05906;
import minecraft.class08405;

public class class05882 {
    final class05513 N;
    private final List<class05893> y = Lists.newArrayList();
    private int L;

    public void L(int n) {
        try {
            this.u(n);
        }
        catch (class05511 class055112) {
            this.N.N((class08405)class055112);
        }
    }

    private void L(Runnable runnable) {
        try {
            runnable.run();
        }
        catch (class05511 class055112) {
            this.N.N((class08405)class055112);
        }
    }

    class05882(class05513 class055132) {
        this.N = class055132;
        this.L = class055132.s();
    }

    private void u(int n) {
        Iterator<class05893> var2 = this.y.iterator();
        while (var2.hasNext()) {
            class05893 class058932 = var2.next();
            class058932.y.run();
            var2.remove();
            int n2 = n - this.L;
            int n3 = this.L;
            this.L = n;
            if (class058932.N == null || class058932.N == (long)n2) continue;
            this.N.N((class08405)new class05511((class00392)class00392.N((String)"test.error.sequence.invalid_tick", (Object[])new Object[]{(long)n3 + class058932.N}), n));
            break;
        }
    }

    public class05882 y(Runnable runnable) {
        this.y.add(class05893.N(() -> this.L(runnable)));
        return this;
    }

    public class05882 y(int n, Runnable runnable) {
        this.y.add(class05893.N(() -> {
            if (this.N.s() < this.L + n) {
                this.L(runnable);
                throw new class05511((class00392)class00392.L((String)"test.error.sequence.not_completed"), this.N.s());
            }
        }));
        return this;
    }

    public void y(int n) {
        try {
            this.u(n);
        }
        catch (class05511 class055112) {
            // empty catch block
        }
    }

    public class05906 y() {
        class05906 class059062 = new class05906(this);
        this.y.add(class05893.N(() -> class059062.N(this.N.s())));
        return class059062;
    }

    public class05882 N(int n, Runnable runnable) {
        this.y.add(class05893.N(() -> {
            if (this.N.s() < this.L + n) {
                throw new class05511((class00392)class00392.L((String)"test.error.sequence.not_completed"), this.N.s());
            }
            this.L(runnable);
        }));
        return this;
    }

    public class05882 N(Runnable runnable) {
        this.y.add(class05893.N(runnable));
        return this;
    }

    public void N() {
        this.y.add(class05893.N(() -> ((class05513)this.N).W()));
    }

    public void N(Supplier<class08405> supplier) {
        this.y.add(class05893.N(() -> this.N.N((class08405)supplier.get())));
    }

    public class05882 N(int n) {
        return this.N(n, () -> {});
    }

    public class05882 N(long l, Runnable runnable) {
        this.y.add(class05893.N(l, runnable));
        return this;
    }
}

