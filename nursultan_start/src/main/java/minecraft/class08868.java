/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntList
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.IntList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class08855;

final class class08868
extends Record {
    private final class08855 model;
    private final IntList selectors;

    class08868(class08855 class088552, IntList intList) {
        this.model = class088552;
        this.selectors = intList;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08868.class, "model;selectors", "model", "selectors"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08868.class, "model;selectors", "model", "selectors"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08868.class, "model;selectors", "model", "selectors"}, this);
    }

    public IntList y() {
        return this.selectors;
    }

    public class08855 N() {
        return this.model;
    }
}

