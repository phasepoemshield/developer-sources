/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jffi;

import com.kenai.jffi.ObjectBuffer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class ObjectParameterInfo {
    public static final ObjectType ARRAY;
    public static final int NULTERMINATE = 4;
    public static final ComponentType BOOLEAN;
    private final int objectInfo;
    public static final int CLEAR = 16;
    public static final ComponentType CHAR;
    public static final ComponentType FLOAT;
    private final int ioflags;
    public static final ComponentType BYTE;
    private final int parameterIndex;
    public static final ComponentType DOUBLE;
    public static final ComponentType LONG;
    public static final int IN = 1;
    public static final ComponentType INT;
    public static final int PINNED = 8;
    public static final int OUT = 2;
    private static final ConcurrentMap<Integer, ObjectParameterInfo> CACHE;
    public static final ComponentType SHORT;
    public static final ObjectType BUFFER;

    public final int getParameterIndex() {
        return this.parameterIndex;
    }

    public boolean equals(Object o) {
        block5: {
            block4: {
                if (this == o) {
                    return true;
                }
                if (o == null) break block4;
                if (this.getClass() == o.getClass()) break block5;
            }
            return false;
        }
        ObjectParameterInfo info = (ObjectParameterInfo)o;
        return this.objectInfo == info.objectInfo;
    }

    final int ioflags() {
        return this.ioflags;
    }

    final int asObjectInfo() {
        return this.objectInfo;
    }

    private ObjectParameterInfo(int objectInfo) {
        this.objectInfo = objectInfo;
        this.ioflags = objectInfo & 0xFF;
        this.parameterIndex = (objectInfo & 0xFF0000) >> 16;
    }

    public static ObjectParameterInfo create(int parameterIndex, int ioflags) {
        return ObjectParameterInfo.getCachedInfo(ObjectBuffer.makeObjectFlags(ioflags, 0, parameterIndex));
    }

    static {
        CACHE = new ConcurrentHashMap<Integer, ObjectParameterInfo>();
        ARRAY = ObjectType.ARRAY;
        BUFFER = ObjectType.BUFFER;
        BYTE = ComponentType.BYTE;
        SHORT = ComponentType.SHORT;
        INT = ComponentType.INT;
        LONG = ComponentType.LONG;
        FLOAT = ComponentType.FLOAT;
        DOUBLE = ComponentType.DOUBLE;
        BOOLEAN = ComponentType.BOOLEAN;
        CHAR = ComponentType.CHAR;
    }

    public int hashCode() {
        return 31 * this.objectInfo;
    }

    /*
     * WARNING - void declaration
     */
    private static ObjectParameterInfo getCachedInfo(int objectInfo) {
        void var1_1;
        ObjectParameterInfo info = (ObjectParameterInfo)CACHE.get(objectInfo);
        if (info != null) {
            return info;
        }
        info = new ObjectParameterInfo(objectInfo);
        ObjectParameterInfo cachedInfo = CACHE.putIfAbsent(objectInfo, info);
        return cachedInfo != null ? cachedInfo : var1_1;
    }

    public static ObjectParameterInfo create(int parameterIndex, ObjectType objectType, ComponentType componentType, int ioflags) {
        return ObjectParameterInfo.getCachedInfo(ObjectBuffer.makeObjectFlags(ioflags, objectType.value | componentType.value, parameterIndex));
    }

    public static final class ObjectType
    extends Enum<ObjectType> {
        public static final /* enum */ ObjectType ARRAY = new ObjectType(0x10000000);
        private static final /* synthetic */ ObjectType[] $VALUES;
        public static final /* enum */ ObjectType BUFFER = new ObjectType(0x20000000);
        final int value;

        static {
            $VALUES = ObjectType.$values();
        }

        public static ObjectType valueOf(String name) {
            return Enum.valueOf(ObjectType.class, name);
        }

        public static ObjectType[] values() {
            return (ObjectType[])$VALUES.clone();
        }

        private static /* synthetic */ ObjectType[] $values() {
            ObjectType[] objectTypeArray = new ObjectType[2];
            objectTypeArray[0] = ARRAY;
            objectTypeArray[1] = BUFFER;
            return objectTypeArray;
        }

        private ObjectType(int type) {
            this.value = type;
        }
    }

    public static final class ComponentType
    extends Enum<ComponentType> {
        public static final /* enum */ ComponentType SHORT;
        final int value;
        public static final /* enum */ ComponentType DOUBLE;
        public static final /* enum */ ComponentType LONG;
        public static final /* enum */ ComponentType FLOAT;
        public static final /* enum */ ComponentType BOOLEAN;
        public static final /* enum */ ComponentType INT;
        public static final /* enum */ ComponentType BYTE;
        private static final /* synthetic */ ComponentType[] $VALUES;
        public static final /* enum */ ComponentType CHAR;

        private static /* synthetic */ ComponentType[] $values() {
            ComponentType[] componentTypeArray = new ComponentType[8];
            componentTypeArray[0] = BYTE;
            componentTypeArray[1] = SHORT;
            componentTypeArray[2] = INT;
            componentTypeArray[3] = LONG;
            componentTypeArray[4] = FLOAT;
            componentTypeArray[5] = DOUBLE;
            componentTypeArray[6] = BOOLEAN;
            componentTypeArray[7] = CHAR;
            return componentTypeArray;
        }

        public static ComponentType valueOf(String name) {
            return Enum.valueOf(ComponentType.class, name);
        }

        private ComponentType(int type) {
            this.value = type;
        }

        static {
            BYTE = new ComponentType(0x1000000);
            SHORT = new ComponentType(0x2000000);
            INT = new ComponentType(0x3000000);
            LONG = new ComponentType(0x4000000);
            FLOAT = new ComponentType(0x5000000);
            DOUBLE = new ComponentType(0x6000000);
            BOOLEAN = new ComponentType(0x7000000);
            CHAR = new ComponentType(0x8000000);
            $VALUES = ComponentType.$values();
        }

        public static ComponentType[] values() {
            return (ComponentType[])$VALUES.clone();
        }
    }
}

