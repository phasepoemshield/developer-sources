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

public final class class03917
extends Record {
    final int beginIndex;
    final int endIndex;
    static final class03917 L = new class03917(0, 0);

    protected class03917(int n, int n2) {
        this.beginIndex = n;
        this.endIndex = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03917.class, "beginIndex;endIndex", "beginIndex", "endIndex"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03917.class, "beginIndex;endIndex", "beginIndex", "endIndex"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03917.class, "beginIndex;endIndex", "beginIndex", "endIndex"}, this);
    }

    public int y() {
        return this.endIndex;
    }

    public int N() {
        return this.beginIndex;
    }
}

