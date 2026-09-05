/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06271
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06271;

public final class class08637<T extends class06271>
extends Record {
    private final T adultModel;
    private final T babyModel;

    public class08637(T t, T t2) {
        this.adultModel = t;
        this.babyModel = t2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08637.class, "adultModel;babyModel", "adultModel", "babyModel"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08637.class, "adultModel;babyModel", "adultModel", "babyModel"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08637.class, "adultModel;babyModel", "adultModel", "babyModel"}, this);
    }

    public T y() {
        return this.babyModel;
    }

    public T N() {
        return this.adultModel;
    }

    public T N(boolean bl) {
        return bl ? this.babyModel : this.adultModel;
    }
}

