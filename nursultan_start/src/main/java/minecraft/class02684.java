/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  minecraft.class00471
 *  minecraft.class02477
 *  minecraft.class06841
 *  minecraft.class08122
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.Optional;
import minecraft.class00471;
import minecraft.class02477;
import minecraft.class02666;
import minecraft.class02683;
import minecraft.class06841;
import minecraft.class08122;

public class class02684
extends class00471<class02684> {
    private final class06841<class02666> N;
    private Optional<ImmutableList.Builder<class02477<?>>> y = Optional.empty();
    private Optional<ImmutableList.Builder<class02477<?>>> L = Optional.empty();

    class02684(class06841<class02666> class068412) {
        this.N = class068412;
    }

    public class08122 y() {
        return new class02683(this.R(), this.N, this.y.map(ImmutableList.Builder::build), this.L.map(ImmutableList.Builder::build));
    }

    public class02684 y(class02477<?> class024772) {
        if (this.L.isEmpty()) {
            this.L = Optional.of(ImmutableList.builder());
        }
        this.L.get().add(class024772);
        return this;
    }

    public class02684 N(class02477<?> class024772) {
        if (this.y.isEmpty()) {
            this.y = Optional.of(ImmutableList.builder());
        }
        this.y.get().add(class024772);
        return this;
    }

    protected class02684 L() {
        return this;
    }
}

