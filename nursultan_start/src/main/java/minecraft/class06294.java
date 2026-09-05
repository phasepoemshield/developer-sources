/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  minecraft.class07529
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Sets;
import java.util.Set;
import minecraft.class06297;
import minecraft.class06302;
import minecraft.class06313;
import minecraft.class07529;
import org.jspecify.annotations.Nullable;

class class06294
implements class06302 {
    private final int N;
    private final Set<class06297> y = Sets.newIdentityHashSet();

    @Override
    public int L() {
        return this.N;
    }

    public class06294(int n) {
        this.N = n;
    }

    @Override
    public int u() {
        return this.y.size();
    }

    @Override
    public void y() {
        this.y.forEach(class06297::y);
        this.y.clear();
    }

    @Override
    public @Nullable class06297 N() {
        if (this.y.size() >= this.N) {
            if (class07529.ND) {
                class06313.N.warn("Maximum sound pool size {} reached", (Object)this.N);
            }
            return null;
        }
        class06297 class062972 = class06297.N();
        if (class062972 != null) {
            this.y.add(class062972);
        }
        return class062972;
    }

    @Override
    public boolean N(class06297 class062972) {
        if (!this.y.remove(class062972)) {
            return false;
        }
        class062972.y();
        return true;
    }
}

