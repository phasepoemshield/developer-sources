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
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class02620;
import minecraft.class02646;

public final class class02633<T, P extends Predicate<T>>
extends Record
implements class02646<T, P> {
    private final List<class02620<T, P>> entries;

    public class02633(List<class02620<T, P>> list) {
        this.entries = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02633.class, "entries", "entries"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02633.class, "entries", "entries"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02633.class, "entries", "entries"}, this);
    }

    public List<class02620<T, P>> y() {
        return this.entries;
    }

    @Override
    public boolean test(Iterable<T> iterable) {
        Iterator<class02620<T, P>> iterator = this.entries.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().N(iterable)) continue;
            return false;
        }
        return true;
    }

    @Override
    public List<class02620<T, P>> N() {
        return this.entries;
    }
}

