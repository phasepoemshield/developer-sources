/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 *  minecraft.class01424
 *  minecraft.class07001
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;
import minecraft.class01424;
import minecraft.class03152;
import minecraft.class03153;
import minecraft.class03154;
import minecraft.class03171;
import minecraft.class03173;
import minecraft.class07001;

public class class03164
extends class03171 {
    private int N;
    private final Set<class01424<?>> y;
    private final Deque<class03173> L = new ArrayDeque<class03173>();

    public int L() {
        return this.N;
    }

    public class03164(class03152 ... class03152Array) {
        this.N = class03152Array.length;
        ImmutableSet.Builder builder = ImmutableSet.builder();
        class03173 class031732 = class03173.N();
        for (class03152 class031522 : class03152Array) {
            class031732.N(class031522);
            builder.add(class031522.y());
        }
        this.L.push(class031732);
        builder.add((Object)class07001.y);
        this.y = builder.build();
    }

    @Override
    public class03154 y() {
        if (this.i() == this.L.element().y()) {
            this.L.pop();
        }
        return super.y();
    }

    @Override
    public class03154 y(class01424<?> class014242) {
        if (class014242 != class07001.y) {
            return class03154.field_36255;
        }
        return super.y(class014242);
    }

    @Override
    public class03153 N(class01424<?> class014242, String string) {
        class03173 class031732;
        class03173 class031733 = this.L.element();
        if (this.i() > class031733.y()) {
            return super.N(class014242, string);
        }
        if (class031733.L().remove(string, class014242)) {
            --this.N;
            return super.N(class014242, string);
        }
        if (class014242 == class07001.y && (class031732 = class031733.u().get(string)) != null) {
            this.L.push(class031732);
            return super.N(class014242, string);
        }
        return class03153.field_36249;
    }

    @Override
    public class03153 N(class01424<?> class014242) {
        class03173 class031732 = this.L.element();
        if (this.i() > class031732.y()) {
            return super.N(class014242);
        }
        if (this.N <= 0) {
            return class03153.field_36250;
        }
        if (!this.y.contains(class014242)) {
            return class03153.field_36249;
        }
        return super.N(class014242);
    }
}

