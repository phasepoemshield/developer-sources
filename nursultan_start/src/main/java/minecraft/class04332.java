/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.Hash$Strategy
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.Hash;
import minecraft.class04306;
import org.jspecify.annotations.Nullable;

class class04332
implements Hash.Strategy<class04306<?>> {
    class04332() {
    }

    public int hashCode(class04306<?> class043062) {
        return 31 * class043062.y().hashCode() + class043062.N().hashCode();
    }

    public boolean equals(@Nullable class04306<?> class043062, @Nullable class04306<?> class043063) {
        if (class043062 == class043063) {
            return true;
        }
        if (class043062 == null || class043063 == null) {
            return false;
        }
        return class043062.N() == class043063.N() && class043062.y().equals((Object)class043063.y());
    }
}

