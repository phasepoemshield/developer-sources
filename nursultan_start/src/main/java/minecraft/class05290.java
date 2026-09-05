/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import org.jspecify.annotations.Nullable;

public class class05290<T extends Throwable> {
    private @Nullable T N;

    public void N(T t) {
        if (this.N == null) {
            this.N = t;
        } else {
            ((Throwable)this.N).addSuppressed((Throwable)t);
        }
    }

    public void N() throws T {
        if (this.N != null) {
            throw this.N;
        }
    }
}

