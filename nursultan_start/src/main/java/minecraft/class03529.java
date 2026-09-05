/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  minecraft.class01894
 *  minecraft.class02042
 *  minecraft.class05946
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class01894;
import minecraft.class02042;
import minecraft.class03527;
import minecraft.class03530;
import minecraft.class03535;
import minecraft.class03556;
import minecraft.class05946;
import org.jspecify.annotations.Nullable;

public class class03529<T>
implements class03556<T> {
    private final class02042<T> N;
    private @Nullable Set<class03530<T>> y;
    private final class03527 L;
    private @Nullable class05946<T> u;
    private @Nullable T i;

    @Override
    public Stream<class03530<T>> L() {
        return this.Z().stream();
    }

    protected class03529(class03527 class035272, class02042<T> class020422, @Nullable class05946<T> class059462, @Nullable T t) {
        this.N = class020422;
        this.L = class035272;
        this.u = class059462;
        this.i = t;
    }

    public String toString() {
        return "Reference{" + String.valueOf(this.u) + "=" + String.valueOf(this.i) + "}";
    }

    public class05946<T> B() {
        if (this.u == null) {
            throw new IllegalStateException("Trying to access unbound value '" + String.valueOf(this.i) + "' from registry " + String.valueOf(this.N));
        }
        return this.u;
    }

    private Set<class03530<T>> Z() {
        if (this.y == null) {
            throw new IllegalStateException("Tags not bound");
        }
        return this.y;
    }

    @Override
    public Optional<class05946<T>> i() {
        return Optional.of(this.B());
    }

    @Override
    public Either<class05946<T>, T> u() {
        return Either.left(this.B());
    }

    @Override
    public boolean y() {
        return this.u != null && this.i != null;
    }

    public void y(T t) {
        if (this.L == class03527.field_36455 && this.i != t) {
            throw new IllegalStateException("Can't change holder " + String.valueOf(this.u) + " value: existing=" + String.valueOf(this.i) + ", new=" + String.valueOf(t));
        }
        this.i = t;
    }

    void y(class05946<T> class059462) {
        if (this.u != null && class059462 != this.u) {
            throw new IllegalStateException("Can't change holder key: existing=" + String.valueOf(this.u) + ", new=" + String.valueOf(class059462));
        }
        this.u = class059462;
    }

    @Override
    public boolean N(Predicate<class05946<T>> predicate) {
        return predicate.test(this.B());
    }

    @Override
    public T N() {
        if (this.i == null) {
            throw new IllegalStateException("Trying to access unbound value '" + String.valueOf(this.u) + "' from registry " + String.valueOf(this.N));
        }
        return this.i;
    }

    public static <T> class03529<T> N_40(class02042<T> class020422, class05946<T> class059462) {
        return new class03529<Object>(class03527.field_36454, class020422, class059462, null);
    }

    void N(Collection<class03530<T>> collection) {
        this.y = Set.copyOf(collection);
    }

    @Override
    public boolean N(class05946<T> class059462) {
        return this.B() == class059462;
    }

    @Override
    public boolean N(class03530<T> class035302) {
        return this.Z().contains(class035302);
    }

    @Override
    public boolean N(class03556<T> class035562) {
        return class035562.N(this.B());
    }

    @Override
    public boolean N(class01894 class018942) {
        return this.B().N().equals((Object)class018942);
    }

    @Override
    public boolean N(class02042<T> class020422) {
        return this.N.N(class020422);
    }

    @Deprecated
    public static <T> class03529<T> N(class02042<T> class020422, @Nullable T t) {
        return new class03529<T>(class03527.field_36455, class020422, null, t);
    }

    @Override
    public class03535 R() {
        return class03535.field_36446;
    }
}

