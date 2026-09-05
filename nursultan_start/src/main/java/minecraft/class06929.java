/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.collect.Sets
 *  minecraft.class07491
 */
package minecraft;

import com.google.common.base.Joiner;
import com.google.common.collect.Sets;
import java.util.Set;
import minecraft.class07491;

public class class06929 {
    private final Set<class07491<?>> N;
    private final Set<class07491<?>> y;

    class06929(Set<class07491<?>> set, Set<class07491<?>> set2) {
        this.N = Set.copyOf(set);
        this.y = Set.copyOf(Sets.union(set, set2));
    }

    public String toString() {
        return "[" + Joiner.on((String)", ").join(this.y.stream().map(class074912 -> (this.N.contains(class074912) ? "!" : "") + String.valueOf(class074912.N())).iterator()) + "]";
    }

    public Set<class07491<?>> y() {
        return this.y;
    }

    public Set<class07491<?>> N() {
        return this.N;
    }
}

