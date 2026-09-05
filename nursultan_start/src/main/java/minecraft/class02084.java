/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntIterator
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.IntIterator;
import java.util.NoSuchElementException;

public class class02084
implements IntIterator {
    private final int N;
    private final int y;
    private final int L;
    private int u;
    private int i;

    public class02084(int n, int n2) {
        this.N = n2;
        if (n2 > 0) {
            this.y = n / n2;
            this.L = n % n2;
        } else {
            this.y = 0;
            this.L = 0;
        }
    }

    public boolean hasNext() {
        return this.u < this.N;
    }

    public int nextInt() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        int n = this.y;
        this.i += this.L;
        if (this.i >= this.N) {
            this.i -= this.N;
            ++n;
        }
        ++this.u;
        return n;
    }

    public static Iterable<Integer> N(int n, int n2) {
        return () -> new class02084(n, n2);
    }
}

