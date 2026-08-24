/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import com.kenai.jffi.ObjectParameterType;
import java.nio.Buffer;
import java.util.EnumSet;
import jnr.ffi.provider.jffi.ParameterStrategy;

final class HeapBufferParameterStrategy
extends ParameterStrategy {
    private static final HeapBufferParameterStrategy[] heapBufferStrategies;

    static HeapBufferParameterStrategy get(ObjectParameterType.ComponentType componentType) {
        return heapBufferStrategies[componentType.ordinal()];
    }

    public int length(Object o) {
        return ((Buffer)o).remaining();
    }

    static {
        EnumSet<ObjectParameterType.ComponentType> componentTypes = EnumSet.allOf(ObjectParameterType.ComponentType.class);
        heapBufferStrategies = new HeapBufferParameterStrategy[componentTypes.size()];
        for (ObjectParameterType.ComponentType componentType : componentTypes) {
            HeapBufferParameterStrategy.heapBufferStrategies[componentType.ordinal()] = new HeapBufferParameterStrategy(componentType);
        }
    }

    public int offset(Object o) {
        Buffer buffer = (Buffer)o;
        return buffer.arrayOffset() + buffer.position();
    }

    public long address(Object o) {
        return 0L;
    }

    public Object object(Object o) {
        return ((Buffer)o).array();
    }

    public HeapBufferParameterStrategy(ObjectParameterType.ComponentType componentType) {
        super(HEAP, ObjectParameterType.create(ObjectParameterType.ARRAY, componentType));
    }
}

