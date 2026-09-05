/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class04018;
import minecraft.class04039;
import org.jspecify.annotations.Nullable;

public abstract class class04049
implements class04018 {
    protected final class04039 L;
    private long N;
    public @Nullable Boolean u;

    protected abstract long L();

    protected class04049(class04039 class040392) {
        this.L = class040392;
        this.N = this.L() - 1L;
    }

    @Override
    public boolean y() {
        long l = this.L();
        if (l == this.N) {
            if (this.u == null) {
                throw new IllegalStateException("Update triggered but the result is null");
            }
            return this.u;
        }
        this.N = l;
        this.u = this.N();
        return this.u;
    }

    protected abstract boolean N();
}

