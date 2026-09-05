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
import java.util.function.Predicate;
import minecraft.class08164;
import minecraft.class08168;

public final class class08166<T extends class08168>
extends Record
implements Predicate<T> {
    private final class08164 test;

    public class08166(class08164 class081642) {
        this.test = class081642;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08166.class, "test", "test"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08166.class, "test", "test"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08166.class, "test", "test"}, this);
    }

    public class08164 N() {
        return this.test;
    }

    @Override
    public boolean test(T t) {
        return this.test.N(t.N());
    }
}

