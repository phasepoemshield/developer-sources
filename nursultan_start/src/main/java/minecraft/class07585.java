/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  minecraft.class07581
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import minecraft.class07581;
import minecraft.class07586;
import minecraft.class07606;

public class class07585<T> {
    private final ImmutableList.Builder<class07581<T>> N = ImmutableList.builder();
    private class07586 y = class07586.u;

    public class07606<T> N() {
        List list = (List)class07606.N(this.N.build()).getOrThrow();
        return new class07606(list, this.y);
    }

    public class07585<T> N(class07586 class075862) {
        this.y = class075862;
        return this;
    }

    public class07585<T> N(int n, T t) {
        this.N.add((Object)new class07581(n, t));
        return this;
    }
}

