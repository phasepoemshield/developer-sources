/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.vertex.format;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.concurrent.atomic.AtomicReference;
import kotakbaz.rain.client.render.main.vertex.format.VertexFormat;
import oxxxde.\u062a\u0638;

public final class A
extends Record {
    private final VertexFormat vertexFormat;
    private final int glId;
    private final AtomicReference<\u062a\u0638> buffer;

    @Override
    public final boolean equals(Object o) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "glId;vertexFormat;buffer", "glId", "vertexFormat", "buffer"}, this, o);
    }

    public A(int glId, VertexFormat vertexFormat, AtomicReference<\u062a\u0638> buffer) {
        this.glId = glId;
        this.vertexFormat = vertexFormat;
        this.buffer = buffer;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{A.class, "glId;vertexFormat;buffer", "glId", "vertexFormat", "buffer"}, this);
    }

    public VertexFormat vertexFormat() {
        return this.vertexFormat;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{A.class, "glId;vertexFormat;buffer", "glId", "vertexFormat", "buffer"}, this);
    }

    public int glId() {
        return this.glId;
    }

    public AtomicReference<\u062a\u0638> buffer() {
        return this.buffer;
    }
}

