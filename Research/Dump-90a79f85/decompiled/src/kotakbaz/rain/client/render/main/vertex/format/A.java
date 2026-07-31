/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.vertex.format;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.concurrent.atomic.AtomicReference;
import kotakbaz.rain.client.render.main.buffer.b;
import kotakbaz.rain.client.render.main.vertex.format.a_0;

public final class A
extends Record {
    private final int a;
    private final a_0 A;
    private final AtomicReference<b> b;

    public A(int n, a_0 a_02, AtomicReference<b> atomicReference) {
        super();
        this.a = n;
        this.A = a_02;
        this.b = atomicReference;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{A.class, "glId;vertexFormat;buffer", "a", "A", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{A.class, "glId;vertexFormat;buffer", "a", "A", "b"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "glId;vertexFormat;buffer", "a", "A", "b"}, this, object);
    }

    public int glId() {
        return this.a;
    }

    public a_0 vertexFormat() {
        return this.A;
    }

    public AtomicReference<b> buffer() {
        return this.b;
    }
}

