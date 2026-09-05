/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  minecraft.class00142
 *  minecraft.class02471
 *  minecraft.class02477
 *  minecraft.class02481
 *  minecraft.class02487
 *  minecraft.class02500
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import minecraft.class00142;
import minecraft.class02471;
import minecraft.class02477;
import minecraft.class02481;
import minecraft.class02487;
import minecraft.class02500;

public class class00159 {
    private class02471 N = class02471.L;
    private final ImmutableMap.Builder<class02487<?>, class02500> y = ImmutableMap.builder();

    private class00159() {
    }

    public class00142 y() {
        return new class00142(this.N, (Map)this.y.buildOrThrow());
    }

    public <T extends class02500> class00159 N(class02487<T> class024872, T t) {
        this.y.put(class024872, t);
        return this;
    }

    public class00159 N(class02471 class024712) {
        this.N = class024712;
        return this;
    }

    public static class00159 N() {
        return new class00159();
    }

    public <T extends class02477<?>> class00159 N(class02477<?> class024772) {
        class02481 class024812 = class02481.N(class024772);
        this.y.put((Object)class024812, (Object)class024812.N());
        return this;
    }
}

