/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class09966
extends Record {
    private final boolean auto;
    private final int value;

    public class09966(boolean bl, int n) {
        this.auto = bl;
        this.value = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09966.class, "auto;value", "auto", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09966.class, "auto;value", "auto", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09966.class, "auto;value", "auto", "value"}, this);
    }

    public int y() {
        return this.value;
    }

    public boolean N() {
        return this.auto;
    }
}

