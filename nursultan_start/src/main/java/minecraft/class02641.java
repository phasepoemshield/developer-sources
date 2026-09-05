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
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class02638;

public final class class02641<T, P extends Predicate<T>>
extends Record
implements class02638<T, P> {
    private final List<P> tests;

    public class02641(List<P> list) {
        this.tests = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02641.class, "tests", "tests"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02641.class, "tests", "tests"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02641.class, "tests", "tests"}, this);
    }

    public List<P> y() {
        return this.tests;
    }

    @Override
    public List<P> N() {
        return this.tests;
    }

    @Override
    public boolean test(Iterable<T> iterable) {
        ArrayList<P> arrayList = new ArrayList<P>(this.tests);
        for (Object t : iterable) {
            arrayList.removeIf(predicate -> predicate.test(t));
            if (!arrayList.isEmpty()) continue;
            return true;
        }
        return false;
    }
}

