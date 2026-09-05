/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

class class07545
implements Runnable {
    final /* synthetic */ Runnable N;
    final /* synthetic */ String y;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class07545(Runnable runnable, String string) {
        this.N = runnable;
        this.y = string;
    }

    @Override
    public void run() {
        this.N.run();
    }

    public String toString() {
        return this.y;
    }
}

