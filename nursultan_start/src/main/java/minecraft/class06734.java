/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class06724;
import minecraft.class06728;
import org.jspecify.annotations.Nullable;

public class class06734
implements AutoCloseable {
    private final @Nullable class06728 N = class06724.N.get();
    private boolean y;

    class06734() {
    }

    @Override
    public void close() {
        if (!this.y) {
            this.y = true;
            class06724.N.set(this.N);
        }
    }
}

