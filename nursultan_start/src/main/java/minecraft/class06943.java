/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  minecraft.class07491
 */
package minecraft;

import com.google.common.collect.Sets;
import java.util.Set;
import minecraft.class06929;
import minecraft.class07491;

public class class06943 {
    private final Set<class07491<?>> N = Sets.newIdentityHashSet();
    private final Set<class07491<?>> y = Sets.newIdentityHashSet();

    public class06943 y(class07491<?> class074912) {
        if (this.N.contains(class074912)) {
            throw new IllegalArgumentException("Parameter " + String.valueOf(class074912.N()) + " is already required");
        }
        this.y.add(class074912);
        return this;
    }

    public class06943 N(class07491<?> class074912) {
        if (this.y.contains(class074912)) {
            throw new IllegalArgumentException("Parameter " + String.valueOf(class074912.N()) + " is already optional");
        }
        this.N.add(class074912);
        return this;
    }

    public class06929 N() {
        return new class06929(this.N, this.y);
    }
}

