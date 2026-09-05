/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.function.Consumer;

public class class04396 {
    private static final int N = Integer.MIN_VALUE;
    private int y = Integer.MIN_VALUE;

    public boolean y() {
        return this.y != Integer.MIN_VALUE;
    }

    public void y(int n) {
        if (!this.y()) {
            this.N(n);
        }
    }

    public void N(class04396 class043962) {
        this.y = class043962.y;
    }

    public long N(float f) {
        return (long)((f - (float)this.y) * 50.0f);
    }

    public void N(int n, float f) {
        if (!this.y()) {
            return;
        }
        this.y -= (int)((float)n * f);
    }

    public void N(int n) {
        this.y = n;
    }

    public void N(boolean bl, int n) {
        if (bl) {
            this.y(n);
        } else {
            this.N();
        }
    }

    public void N() {
        this.y = Integer.MIN_VALUE;
    }

    public void N(Consumer<class04396> consumer) {
        if (this.y()) {
            consumer.accept(this);
        }
    }
}

