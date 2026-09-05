/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import java.util.Optional;
import minecraft.class00455;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;

public final class class00442<T>
extends Record {
    private final class00455<T> subscription;
    private final Optional<T> value;
    public static final class02362<class04247, class00442<?>> N = class02389.N((class05946)class04227.v).y(class00442::N, class00442::N);

    public class00442(class00455<T> class004552, Optional<T> optional) {
        this.subscription = class004552;
        this.value = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00442.class, "subscription;value", "subscription", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00442.class, "subscription;value", "subscription", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00442.class, "subscription;value", "subscription", "value"}, this);
    }

    public Optional<T> y() {
        return this.value;
    }

    public class00455<T> N() {
        return this.subscription;
    }

    private static <T> class02362<? super class04247, class00442<T>> N(class00455<T> class004552) {
        return class02389.N(Objects.requireNonNull(class004552.y)).N_10(optional -> new class00442(class004552, optional), class00442::y);
    }
}

