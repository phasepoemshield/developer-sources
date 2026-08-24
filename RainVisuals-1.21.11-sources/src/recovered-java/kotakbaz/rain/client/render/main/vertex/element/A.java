/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.system.MemoryUtil
 */
package kotakbaz.rain.client.render.main.vertex.element;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.BiConsumer;
import org.lwjgl.system.MemoryUtil;

public final class A<T>
extends Record {
    private final Class<T> clazz;
    private final int glId;
    public static final A<Byte> BYTE;
    public static final A<Integer> INT;
    private final String typeName;
    public static final A<Integer> UNSIGNED_INT;
    private final BiConsumer<Long, T[]> uploadConsumer;
    public static final A<Byte> UNSIGNED_BYTE;
    private final int byteSize;
    public static final A<Short> SHORT;
    public static final A<Short> UNSIGNED_SHORT;
    public static final A<Float> FLOAT;

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{A.class, "byteSize;typeName;glId;clazz;uploadConsumer", "byteSize", "typeName", "glId", "clazz", "uploadConsumer"}, this);
    }

    public int byteSize() {
        return this.byteSize;
    }

    public String typeName() {
        return this.typeName;
    }

    public BiConsumer<Long, T[]> uploadConsumer() {
        return this.uploadConsumer;
    }

    static {
        FLOAT = new A<Float>(4, "Float", 5126, Float.class, (pointer, data) -> {
            for (int i = 0; i < ((Float[])data).length; ++i) {
                MemoryUtil.memPutFloat((long)(pointer + 4L * (long)i), (float)data[i].floatValue());
            }
        });
        UNSIGNED_BYTE = new A<Byte>(1, "Unsigned Byte", 5121, Byte.class, (pointer, data) -> {
            for (int i = 0; i < ((Byte[])data).length; ++i) {
                MemoryUtil.memPutByte((long)(pointer + (long)i), (byte)data[i]);
            }
        });
        BYTE = new A<Byte>(1, "Byte", 5120, Byte.class, (pointer, data) -> {
            for (int i = 0; i < ((Byte[])data).length; ++i) {
                MemoryUtil.memPutByte((long)(pointer + (long)i), (byte)data[i]);
            }
        });
        UNSIGNED_SHORT = new A<Short>(2, "Unsigned Short", 5122, Short.class, (pointer, data) -> {
            for (int i = 0; i < ((Short[])data).length; ++i) {
                MemoryUtil.memPutShort((long)(pointer + 2L * (long)i), (short)data[i]);
            }
        });
        SHORT = new A<Short>(2, "Short", 5123, Short.class, (pointer, data) -> {
            for (int i = 0; i < ((Short[])data).length; ++i) {
                MemoryUtil.memPutShort((long)(pointer + 2L * (long)i), (short)data[i]);
            }
        });
        UNSIGNED_INT = new A<Integer>(4, "Unsigned Int", 5125, Integer.class, (pointer, data) -> {
            for (int i = 0; i < ((Integer[])data).length; ++i) {
                MemoryUtil.memPutInt((long)(pointer + 4L * (long)i), (int)data[i]);
            }
        });
        INT = new A<Integer>(4, "Int", 5124, Integer.class, (pointer, data) -> {
            for (int i = 0; i < ((Integer[])data).length; ++i) {
                MemoryUtil.memPutInt((long)(pointer + 4L * (long)i), (int)data[i]);
            }
        });
    }

    public int glId() {
        return this.glId;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{A.class, "byteSize;typeName;glId;clazz;uploadConsumer", "byteSize", "typeName", "glId", "clazz", "uploadConsumer"}, this);
    }

    @Override
    public final boolean equals(Object o) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "byteSize;typeName;glId;clazz;uploadConsumer", "byteSize", "typeName", "glId", "clazz", "uploadConsumer"}, this, o);
    }

    public Class<T> clazz() {
        return this.clazz;
    }

    public A(int byteSize, String typeName, int glId, Class<T> clazz, BiConsumer<Long, T[]> uploadConsumer) {
        this.byteSize = byteSize;
        this.typeName = typeName;
        this.glId = glId;
        this.clazz = clazz;
        this.uploadConsumer = uploadConsumer;
    }
}

