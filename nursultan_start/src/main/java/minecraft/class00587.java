/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import minecraft.class00576;
import minecraft.class00599;
import minecraft.class00607;
import minecraft.class00608;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public final class class00587 {
    public static final class00587 N = new class00587(Map.of());
    public static final Codec<class00587> y = Codec.lazyInitialized(() -> Codec.dispatchedMap(class00608.f, (Function)class07536.y_4(class00599::N)).xmap(class00587::new, class005872 -> class005872.i));
    public static final Codec<class00587> L = y.xmap(class00587::N, class00587::N);
    public static final Codec<class00587> u = y.validate(class005872 -> {
        List var1 = class005872.y().stream().filter(class006072 -> !class006072.i()).toList();
        if (!var1.isEmpty()) {
            return DataResult.error(() -> "The following attributes cannot be positional: " + String.valueOf(var1));
        }
        return DataResult.success((Object)class005872);
    });
    final Map<class00607<?>, class00599<?, ?>> i;

    class00587(Map<class00607<?>, class00599<?, ?>> map) {
        this.i = map;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof class00587)) return false;
        class00587 class005872 = (class00587)object;
        if (!this.i.equals(class005872.i)) return false;
        return true;
    }

    public String toString() {
        return this.i.toString();
    }

    public int hashCode() {
        return this.i.hashCode();
    }

    public boolean y(class00607<?> class006072) {
        return this.i.containsKey(class006072);
    }

    public Set<class00607<?>> y() {
        return this.i.keySet();
    }

    public <Value> @Nullable class00599<Value, ?> N(class00607<Value> class006072) {
        return this.i.get(class006072);
    }

    public static class00576 N() {
        return new class00576();
    }

    private static class00587 N(class00587 class005872) {
        return new class00587(Map.copyOf(Maps.filterKeys(class005872.i, class00607::u)));
    }

    public <Value> Value N(class00607<Value> class006072, Value Value) {
        class00599<Value, ?> class005992 = this.N(class006072);
        return class005992 != null ? class005992.N(Value) : Value;
    }
}

