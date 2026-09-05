/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  minecraft.class03659
 *  minecraft.class03689
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import minecraft.class00759;
import minecraft.class00810;
import minecraft.class00821;
import minecraft.class03659;
import minecraft.class03689;

public class class00789 {
    private final ImmutableList.Builder<class03659<class03689>> N = ImmutableList.builder();
    private Optional<class00821> y = Optional.empty();
    private Optional<class00821> L = Optional.empty();
    private Optional<Boolean> u = Optional.empty();

    public class00789 y(class00810 class008102) {
        this.L = Optional.of(class008102.y());
        return this;
    }

    public class00759 y() {
        return new class00759((List<class03659<class03689>>)this.N.build(), this.y, this.L, this.u);
    }

    public class00789 N(class00810 class008102) {
        this.y = Optional.of(class008102.y());
        return this;
    }

    public class00789 N(boolean bl) {
        this.u = Optional.of(bl);
        return this;
    }

    public static class00789 N() {
        return new class00789();
    }

    public class00789 N(class03659<class03689> class036592) {
        this.N.add(class036592);
        return this;
    }
}

