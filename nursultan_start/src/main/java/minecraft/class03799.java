/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.Hash$Strategy
 *  minecraft.class06584
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.Hash;
import minecraft.class06584;
import org.jspecify.annotations.Nullable;

class class03799
implements Hash.Strategy<class06584> {
    class03799() {
    }

    public int hashCode(@Nullable class06584 class065842) {
        return class06584.y((class06584)class065842);
    }

    public boolean equals(@Nullable class06584 class065842, @Nullable class06584 class065843) {
        return class065842 == class065843 || class065842 != null && class065843 != null && class065842.R() == class065843.R() && class06584.L((class06584)class065842, (class06584)class065843);
    }
}

