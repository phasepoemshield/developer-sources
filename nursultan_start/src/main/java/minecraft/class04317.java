/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.Hash$Strategy
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.Hash;
import minecraft.class04309;
import org.jspecify.annotations.Nullable;

class class04317
implements Hash.Strategy<class04309<?>> {
    class04317() {
    }

    public int hashCode(class04309<?> class043092) {
        return 31 * class043092.y().hashCode() + class043092.N().hashCode();
    }

    public boolean equals(@Nullable class04309<?> class043092, @Nullable class04309<?> class043093) {
        if (class043092 == class043093) {
            return true;
        }
        if (class043092 == null || class043093 == null) {
            return false;
        }
        return class043092.N() == class043093.N() && class043092.y().equals((Object)class043093.y());
    }
}

