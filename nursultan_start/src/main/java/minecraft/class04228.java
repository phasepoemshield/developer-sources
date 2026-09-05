/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04220
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.io.IOException;
import minecraft.class04220;
import minecraft.class04239;
import org.jspecify.annotations.Nullable;

class class04228<T>
implements class04239<T> {
    private volatile long L;
    final /* synthetic */ class04239 N;
    final /* synthetic */ class04220 y;

    class04228(class04220 class042202, class04239 class042392) {
        this.y = class042202;
        this.N = class042392;
    }

    @Override
    public void close() throws IOException {
        this.y.y();
    }

    @Override
    public @Nullable T N() throws IOException {
        try {
            this.y.N.position(this.L);
            Object t = this.N.N();
            return t;
        }
        finally {
            this.L = this.y.N.position();
        }
    }
}

