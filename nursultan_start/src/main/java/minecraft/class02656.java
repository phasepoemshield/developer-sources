/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class02638;

public final class class02656<T, P extends Predicate<T>>
extends Record
implements class02638<T, P> {
    private final P test;

    public class02656(P p) {
        this.test = p;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02656.class, "test", "test"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02656.class, "test", "test"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02656.class, "test", "test"}, this);
    }

    public P y() {
        return this.test;
    }

    @Override
    public boolean test(Iterable<T> iterable) {
        for (T t : iterable) {
            if (!this.test.test(t)) continue;
            return true;
        }
        return false;
    }

    @Override
    public List<P> N() {
        return List.of(this.test);
    }
}

