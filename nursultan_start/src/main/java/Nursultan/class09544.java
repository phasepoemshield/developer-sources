/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  minecraft.class01927
 *  minecraft.class04111
 *  minecraft.class04129
 */
package Nursultan;

import com.google.common.collect.ImmutableList;
import java.util.List;
import minecraft.class01927;
import minecraft.class04111;
import minecraft.class04129;

public class class09544
extends class04111<class09544> {
    private final ImmutableList.Builder<class04129> N = ImmutableList.builder();

    public class09544(class04111<?> ... class04111Array) {
        for (class04111<?> class041112 : class04111Array) {
            this.N.add((Object)class041112.y());
        }
    }

    public class04129 y() {
        return new class01927((List)this.N.build(), this.i());
    }

    public class09544 y(class04111<?> class041112) {
        this.N.add((Object)class041112.y());
        return this;
    }

    protected class09544 L() {
        return this;
    }
}

