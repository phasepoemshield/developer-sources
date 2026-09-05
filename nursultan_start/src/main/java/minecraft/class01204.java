/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00742
 *  minecraft.class00869
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Iterator;
import minecraft.class00500;
import minecraft.class00742;
import minecraft.class00869;
import org.jspecify.annotations.Nullable;

class class01204
implements Iterable<class00500> {
    public static final class00500 N = class00869.N.W();
    private final class00742<class00500> y = new class00742(16);
    private int L;

    class01204() {
    }

    @Override
    public Iterator<class00500> iterator() {
        return this.y.iterator();
    }

    public @Nullable class00500 N(int n) {
        class00500 class005002 = (class00500)this.y.N(n);
        return class005002 == null ? N : class005002;
    }

    public void N(class00500 class005002, int n) {
        this.y.N((Object)class005002, n);
    }

    public int N(class00500 class005002) {
        int n = this.y.N((Object)class005002);
        if (n == -1) {
            n = this.L++;
            this.y.N((Object)class005002, n);
        }
        return n;
    }
}

