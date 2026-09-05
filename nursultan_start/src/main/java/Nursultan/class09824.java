/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  minecraft.class02709
 *  minecraft.class04111
 *  minecraft.class04129
 */
package Nursultan;

import com.google.common.collect.ImmutableList;
import java.util.List;
import minecraft.class02709;
import minecraft.class04111;
import minecraft.class04129;

public class class09824
extends class04111<class09824> {
    private final ImmutableList.Builder<class04129> N = ImmutableList.builder();

    public class09824 L(class04111<?> class041112) {
        this.N.add((Object)class041112.y());
        return this;
    }

    public class09824(class04111<?> ... class04111Array) {
        for (class04111<?> class041112 : class04111Array) {
            this.N.add((Object)class041112.y());
        }
    }

    public class04129 y() {
        return new class02709((List)this.N.build(), this.i());
    }

    protected class09824 L() {
        return this;
    }
}

