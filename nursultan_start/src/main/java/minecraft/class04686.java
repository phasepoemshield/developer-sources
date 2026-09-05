/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  minecraft.class00392
 *  minecraft.class00471
 *  minecraft.class02462
 *  minecraft.class02489
 *  minecraft.class05919
 *  minecraft.class08122
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class00471;
import minecraft.class02462;
import minecraft.class02489;
import minecraft.class04668;
import minecraft.class05919;
import minecraft.class08122;

public class class04686
extends class00471<class04686> {
    private Optional<class05919> N = Optional.empty();
    private final ImmutableList.Builder<class00392> y = ImmutableList.builder();
    private class02489 L = class02462.y;

    public class08122 y() {
        return new class04668(this.R(), (List<class00392>)this.y.build(), this.L, this.N);
    }

    public class04686 N(class00392 class003922) {
        this.y.add((Object)class003922);
        return this;
    }

    protected class04686 L() {
        return this;
    }

    public class04686 N(class02489 class024892) {
        this.L = class024892;
        return this;
    }

    public class04686 N(class05919 class059192) {
        this.N = Optional.of(class059192);
        return this;
    }
}

