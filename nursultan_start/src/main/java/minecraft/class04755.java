/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07209
 */
package minecraft;

import minecraft.class07209;

public class class04755
implements Comparable<class04755> {
    private final int N;
    private final class07209 y;
    private int L;
    private int u;

    public int L() {
        return this.L;
    }

    public class04755(int n, class07209 class072092) {
        this.N = n;
        this.y = class072092;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        class04755 class047552 = (class04755)object;
        return this.N == class047552.N;
    }

    public int hashCode() {
        return Integer.hashCode(this.N);
    }

    public int u() {
        return this.u;
    }

    public class07209 y() {
        return this.y;
    }

    public void y(int n) {
        this.u = n;
    }

    public void N(int n) {
        if (n > 10) {
            n = 10;
        }
        this.L = n;
    }

    @Override
    public int compareTo(class04755 class047552) {
        if (this.L != class047552.L) {
            return Integer.compare(this.L, class047552.L);
        }
        return Integer.compare(this.N, class047552.N);
    }

    public int N() {
        return this.N;
    }
}

