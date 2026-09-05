/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  minecraft.class04051
 *  minecraft.class04782
 *  minecraft.class05355
 *  minecraft.class05378
 *  minecraft.class07078
 *  minecraft.class07438
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;
import minecraft.class04051;
import minecraft.class04782;
import minecraft.class05355;
import minecraft.class05378;
import minecraft.class07078;
import minecraft.class07438;

public class class06306
extends class05355<class07438> {
    private class04051 L(class07438 class074382) {
        return class074382.method_18868().L(class05378.B).orElse(class04051.N());
    }

    private boolean y(class07438 class074382) {
        return class074382.method_5864() == class07078.ye && class074382.method_6109();
    }

    private List<class07438> N(class07438 class074382) {
        return ImmutableList.copyOf((Iterable)this.L(class074382).y(this::y));
    }

    protected void N(class04782 class047822, class07438 class074382) {
        class074382.method_18868().N(class05378.Z, this.N(class074382));
    }

    public Set<class05378<?>> N() {
        return ImmutableSet.of((Object)class05378.Z);
    }
}

