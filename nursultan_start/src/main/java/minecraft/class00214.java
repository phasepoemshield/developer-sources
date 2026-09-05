/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.concurrent.Executor;
import minecraft.class00232;

class class00214
implements Runnable {
    private boolean L;
    private boolean u;
    final /* synthetic */ Executor N;
    final /* synthetic */ class00232 y;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class00214(class00232 class002322, Executor executor) {
        this.y = class002322;
        this.N = executor;
    }

    @Override
    public void run() {
        this.u = true;
        if (!this.L) {
            this.L = true;
            this.N.execute(this::N);
        }
    }

    private void N() {
        while (this.u) {
            this.u = false;
            this.y.L.R();
        }
        this.L = false;
    }
}

