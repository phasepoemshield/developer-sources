/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01203
 *  minecraft.class01228
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01203;
import minecraft.class01228;
import org.jspecify.annotations.Nullable;

public final class class09444 {
    private final List<class01228> N;
    private final Map<class00891, List<class01228>> y = Maps.newHashMap();
    private @Nullable List<class01203> L;

    public class09444(List<class01228> list) {
        this.N = list;
    }

    public List<class01228> y() {
        return this.N;
    }

    public List<class01228> N(class00891 class008913) {
        return this.y.computeIfAbsent(class008913, class008912 -> this.N.stream().filter(class012282 -> class012282.y().N(class008912)).collect(Collectors.toList()));
    }

    public List<class01203> N() {
        if (this.L == null) {
            this.L = this.N(class00869.sr).stream().map(class01203::N).toList();
        }
        return this.L;
    }
}

