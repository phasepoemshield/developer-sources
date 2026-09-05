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

public final class class00984
extends Record {
    final int vertexOffset;
    final int indexCount;

    public class00984(int n, int n2) {
        this.vertexOffset = n;
        this.indexCount = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00984.class, "vertexOffset;indexCount", "vertexOffset", "indexCount"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00984.class, "vertexOffset;indexCount", "vertexOffset", "indexCount"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00984.class, "vertexOffset;indexCount", "vertexOffset", "indexCount"}, this);
    }

    public int y() {
        return this.indexCount;
    }

    public int N() {
        return this.vertexOffset;
    }
}

