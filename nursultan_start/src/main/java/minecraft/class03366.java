/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  minecraft.class04111
 *  minecraft.class08122
 *  minecraft.class08137
 *  minecraft.class08967
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import minecraft.class04111;
import minecraft.class08122;
import minecraft.class08137;
import minecraft.class08967;

public abstract class class03366<T extends class03366<T>>
extends class04111<T>
implements class08967<T> {
    protected int N = 1;
    protected int y = 0;
    private final ImmutableList.Builder<class08122> L = ImmutableList.builder();

    public T y(int n) {
        this.y = n;
        return (T)((Object)((class03366)this.L()));
    }

    public T N(class08137 class081372) {
        this.L.add((Object)class081372.y());
        return (T)((Object)((class03366)this.L()));
    }

    public T N(int n) {
        this.N = n;
        return (T)((Object)((class03366)this.L()));
    }

    protected List<class08122> R() {
        return this.L.build();
    }
}

