/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02620
 *  minecraft.class02646
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class02620;
import minecraft.class02646;

public final class class02664<T, P extends Predicate<T>>
extends Record
implements class02646<T, P> {
    private final class02620<T, P> entry;

    public class02664(class02620<T, P> class026202) {
        this.entry = class026202;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02664.class, "entry", "entry"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02664.class, "entry", "entry"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02664.class, "entry", "entry"}, this);
    }

    public class02620<T, P> y() {
        return this.entry;
    }

    public boolean test(Iterable<T> iterable) {
        return this.entry.N(iterable);
    }

    public List<class02620<T, P>> N() {
        return List.of(this.entry);
    }
}

