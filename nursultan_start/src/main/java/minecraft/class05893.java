/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import org.jspecify.annotations.Nullable;

class class05893 {
    public final @Nullable Long N;
    public final Runnable y;

    private class05893(@Nullable Long l, Runnable runnable) {
        this.N = l;
        this.y = runnable;
    }

    static class05893 N(Runnable runnable) {
        return new class05893(null, runnable);
    }

    static class05893 N(long l, Runnable runnable) {
        return new class05893(l, runnable);
    }
}

