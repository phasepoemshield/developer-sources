/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  minecraft.class04111
 *  minecraft.class04129
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import minecraft.class04111;
import minecraft.class04129;
import minecraft.class04559;

public class class04546
extends class04111<class04546> {
    private final ImmutableList.Builder<class04129> N = ImmutableList.builder();

    public class04546(class04111<?> ... class04111Array) {
        for (class04111<?> class041112 : class04111Array) {
            this.N.add((Object)class041112.y());
        }
    }

    public class04129 y() {
        return new class04559((List<class04129>)this.N.build(), this.i());
    }

    protected class04546 L() {
        return this;
    }

    public class04546 N(class04111<?> class041112) {
        this.N.add((Object)class041112.y());
        return this;
    }
}

