/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 *  com.google.common.collect.Sets$SetView
 *  minecraft.class01381
 *  minecraft.class02063
 *  minecraft.class04480
 *  minecraft.class04489
 *  minecraft.class04490
 *  minecraft.class05542
 *  minecraft.class05946
 *  minecraft.class06929
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import minecraft.class01381;
import minecraft.class02063;
import minecraft.class04480;
import minecraft.class04489;
import minecraft.class04490;
import minecraft.class05542;
import minecraft.class05946;
import minecraft.class06929;

public class class05561 {
    private final class04490 N;
    private final class06929 y;
    private final Optional<class02063> L;
    private final Set<class05946<?>> u;

    public class04490 L() {
        return this.N;
    }

    private class05561(class04490 class044902, class06929 class069292, Optional<class02063> optional, Set<class05946<?>> set) {
        this.N = class044902;
        this.y = class069292;
        this.L = optional;
        this.u = set;
    }

    public class05561(class04490 class044902, class06929 class069292) {
        this(class044902, class069292, Optional.empty(), Set.of());
    }

    public class05561(class04490 class044902, class06929 class069292, class02063 class020632) {
        this(class044902, class069292, Optional.of(class020632), Set.of());
    }

    public boolean y() {
        return this.L.isPresent();
    }

    public boolean N(class05946<?> class059462) {
        return this.u.contains(class059462);
    }

    public class05561 N(class06929 class069292) {
        return new class05561(this.N, class069292, this.L, this.u);
    }

    public class05561 N(class04489 class044892) {
        return new class05561(this.N.N_46(class044892), this.y, this.L, this.u);
    }

    public void N(class04480 class044802) {
        this.N.N_47(class044802);
    }

    public class02063 N() {
        return this.L.orElseThrow(() -> new UnsupportedOperationException("References not allowed"));
    }

    public void N(class01381 class013812) {
        Sets.SetView var3 = Sets.difference((Set)class013812.y(), (Set)this.y.y());
        if (!var3.isEmpty()) {
            this.N.N_47((class04480)new class05542((Set)var3));
        }
    }

    public class05561 N(class04489 class044892, class05946<?> class059462) {
        ImmutableSet immutableSet = ImmutableSet.builder().addAll(this.u).add(class059462).build();
        return new class05561(this.N.N_46(class044892), this.y, this.L, (Set<class05946<?>>)immutableSet);
    }
}

