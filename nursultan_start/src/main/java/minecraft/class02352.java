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
import minecraft.class02315;
import minecraft.class02325;
import minecraft.class02328;
import minecraft.class02332;
import minecraft.class02353;

public final class class02352<S, T>
extends Record
implements class02315<S> {
    private final class02353<T> name;
    private final T value;

    public class02352(class02353<T> class023532, T t) {
        this.name = class023532;
        this.value = t;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02352.class, "name;value", "name", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02352.class, "name;value", "name", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02352.class, "name;value", "name", "value"}, this);
    }

    public T y() {
        return this.value;
    }

    public class02353<T> N() {
        return this.name;
    }

    @Override
    public boolean N(class02325<S> class023252, class02332 class023322, class02328 class023282) {
        class023322.N(this.name, this.value);
        return true;
    }
}

