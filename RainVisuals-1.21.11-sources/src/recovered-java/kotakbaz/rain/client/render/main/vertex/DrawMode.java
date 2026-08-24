/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.vertex;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.IntUnaryOperator;
import oxxxde.\u062d\u064b;

public final class DrawMode
extends Record {
    public static final DrawMode QUADS;
    public static final DrawMode LINE_STRIP;
    public static final DrawMode TRIANGLES;
    private final \u062d\u064b indexBufferGenerator;
    public static final DrawMode TRIANGLE_FAN;
    public static final DrawMode LINES;
    public static final DrawMode TRIANGLE_STRIP;
    private final IntUnaryOperator indexCountFunction;
    private final int glId;
    private final boolean useIndexBuffer;

    public int glId() {
        return this.glId;
    }

    static {
        LINES = new DrawMode(1, false, null, vertices -> 0);
        LINE_STRIP = new DrawMode(3, false, null, vertices -> 0);
        TRIANGLES = new DrawMode(4, false, null, vertices -> 0);
        TRIANGLE_STRIP = new DrawMode(5, false, null, vertices -> 0);
        TRIANGLE_FAN = new DrawMode(6, false, null, vertices -> 0);
        QUADS = new DrawMode(4, true, new \u062d\u064b(4, 6, (indexConsumer, firstVertexIndex) -> {
            indexConsumer.accept(firstVertexIndex);
            indexConsumer.accept(firstVertexIndex + 1);
            indexConsumer.accept(firstVertexIndex + 2);
            indexConsumer.accept(firstVertexIndex + 2);
            indexConsumer.accept(firstVertexIndex + 3);
            indexConsumer.accept(firstVertexIndex);
        }), vertices -> vertices / 4 * 6);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{DrawMode.class, "glId;useIndexBuffer;indexBufferGenerator;indexCountFunction", "glId", "useIndexBuffer", "indexBufferGenerator", "indexCountFunction"}, this);
    }

    public DrawMode(int glId, boolean useIndexBuffer, \u062d\u064b indexBufferGenerator, IntUnaryOperator indexCountFunction) {
        this.glId = glId;
        this.useIndexBuffer = useIndexBuffer;
        this.indexBufferGenerator = indexBufferGenerator;
        this.indexCountFunction = indexCountFunction;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{DrawMode.class, "glId;useIndexBuffer;indexBufferGenerator;indexCountFunction", "glId", "useIndexBuffer", "indexBufferGenerator", "indexCountFunction"}, this);
    }

    public \u062d\u064b indexBufferGenerator() {
        return this.indexBufferGenerator;
    }

    public boolean useIndexBuffer() {
        return this.useIndexBuffer;
    }

    @Override
    public final boolean equals(Object o) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{DrawMode.class, "glId;useIndexBuffer;indexBufferGenerator;indexCountFunction", "glId", "useIndexBuffer", "indexBufferGenerator", "indexCountFunction"}, this, o);
    }

    public IntUnaryOperator indexCountFunction() {
        return this.indexCountFunction;
    }
}

