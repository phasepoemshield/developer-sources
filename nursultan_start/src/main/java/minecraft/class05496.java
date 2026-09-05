/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 *  minecraft.class00471
 *  minecraft.class00891
 *  minecraft.class03556
 *  minecraft.class05957
 *  minecraft.class08092
 *  minecraft.class08122
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;
import minecraft.class00471;
import minecraft.class00891;
import minecraft.class03556;
import minecraft.class05501;
import minecraft.class05957;
import minecraft.class08092;
import minecraft.class08122;

public class class05496
extends class00471<class05496> {
    private final class03556<class00891> N;
    private final ImmutableSet.Builder<class08092<?>> y = ImmutableSet.builder();

    class05496(class00891 class008912) {
        this.N = class008912.s();
    }

    public class08122 y() {
        return new class05501((List<class05957>)this.R(), this.N, (Set<class08092<?>>)this.y.build());
    }

    public class05496 N(class08092<?> class080922) {
        if (!((class00891)this.N.N()).E().u().contains(class080922)) {
            throw new IllegalStateException("Property " + String.valueOf(class080922) + " is not present on block " + String.valueOf(this.N));
        }
        this.y.add(class080922);
        return this;
    }

    protected class05496 L() {
        return this;
    }
}

