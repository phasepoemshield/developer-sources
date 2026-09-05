/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import minecraft.class03530;
import minecraft.class03550;
import minecraft.class03556;
import org.jspecify.annotations.Nullable;

public final class class03522<T>
extends class03550<T> {
    static final class03522<?> N = new class03522(List.of());
    private final List<class03556<T>> y;
    private @Nullable Set<class03556<T>> L;

    @Override
    public boolean L() {
        return true;
    }

    @Override
    protected List<class03556<T>> M() {
        return this.y;
    }

    class03522(List<class03556<T>> list) {
        this.y = list;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class03522)) return false;
        class03522 class035222 = (class03522)object;
        if (!this.y.equals(class035222.y)) return false;
        return true;
    }

    public String toString() {
        return "DirectSet[" + String.valueOf(this.y) + "]";
    }

    public int hashCode() {
        return this.y.hashCode();
    }

    @Override
    public Optional<class03530<T>> i() {
        return Optional.empty();
    }

    @Override
    public Either<class03530<T>, List<class03556<T>>> u() {
        return Either.right(this.y);
    }

    @Override
    public boolean N(class03556<T> class035562) {
        if (this.L == null) {
            this.L = Set.copyOf(this.y);
        }
        return this.L.contains(class035562);
    }
}

