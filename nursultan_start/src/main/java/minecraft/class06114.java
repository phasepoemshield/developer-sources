/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public class class06114
implements Runnable {
    private final int N;
    private final Runnable y;

    public class06114(int n, Runnable runnable) {
        this.N = n;
        this.y = runnable;
    }

    @Override
    public void run() {
        this.y.run();
    }

    public int N() {
        return this.N;
    }
}

