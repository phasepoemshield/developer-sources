/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class00522
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.base.MoreObjects;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00522;
import minecraft.class08084;
import org.jspecify.annotations.Nullable;

public abstract class class08092<T extends Comparable<T>> {
    private final Class<T> N;
    private final String y;
    private @Nullable Integer L;
    private final Codec<T> u = Codec.STRING.comapFlatMap(string -> this.y((String)string).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unable to read property: " + String.valueOf(this) + " with value: " + string)), this::y);
    private final Codec<class08084<T>> i = this.u.xmap(this::L, class08084::y);

    public class08084<T> L(T t) {
        return new class08084<T>(this, t);
    }

    public Stream<class08084<T>> L() {
        return this.N().stream().map(this::L);
    }

    public Class<T> M() {
        return this.N;
    }

    public class08092(String string2, Class<T> clazz) {
        this.N = clazz;
        this.y = string2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof class08092) {
            class08092 class080922 = (class08092)object;
            return this.N.equals(class080922.N) && this.y.equals(class080922.y);
        }
        return false;
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("name", (Object)this.y).add("clazz", this.N).add("values", this.N()).toString();
    }

    public final int hashCode() {
        if (this.L == null) {
            this.L = this.y();
        }
        return this.L;
    }

    public Codec<class08084<T>> i() {
        return this.i;
    }

    public Codec<T> u() {
        return this.u;
    }

    public int y() {
        return 31 * this.N.hashCode() + this.y.hashCode();
    }

    public abstract Optional<T> y(String var1);

    public abstract String y(T var1);

    public class08084<T> N(class00522<?, ?> class005222) {
        return new class08084<Comparable>(this, class005222.L(this));
    }

    public abstract List<T> N();

    public abstract int N(T var1);

    public <U, S extends class00522<?, S>> DataResult<S> N(DynamicOps<U> dynamicOps, S s, U u) {
        return this.u.parse(dynamicOps, u).map(comparable -> (class00522)s.y(this, comparable)).setPartial(s);
    }

    public String R() {
        return this.y;
    }
}

