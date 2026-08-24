/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jffi;

import java.util.EnumSet;

public final class ObjectParameterType {
    public static final ComponentType BYTE;
    final int typeInfo;
    static final ObjectParameterType NONE;
    public static final ComponentType LONG;
    static final ObjectParameterType INVALID;
    public static final ComponentType DOUBLE;
    public static final ObjectType ARRAY;
    public static final ComponentType SHORT;
    public static final ObjectType BUFFER;
    public static final ComponentType CHAR;
    public static final ComponentType INT;
    public static final ComponentType BOOLEAN;
    public static final ComponentType FLOAT;

    public int hashCode() {
        return this.typeInfo;
    }

    public boolean equals(Object o) {
        return this == o || o instanceof ObjectParameterType && this.typeInfo == ((ObjectParameterType)o).typeInfo;
    }

    ObjectParameterType(int typeInfo) {
        this.typeInfo = typeInfo;
    }

    public static ObjectParameterType create(ObjectType objectType, ComponentType componentType) {
        if (objectType == ObjectType.ARRAY) {
            return TypeCache.arrayTypeCache[componentType.ordinal()];
        }
        if (objectType == ObjectType.BUFFER) {
            return TypeCache.bufferTypeCache[componentType.ordinal()];
        }
        return new ObjectParameterType(objectType.value | componentType.value);
    }

    ObjectParameterType(ObjectType objectType, ComponentType componentType) {
        this.typeInfo = objectType.value | componentType.value;
    }

    static {
        INVALID = new ObjectParameterType(0);
        NONE = new ObjectParameterType(0);
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

    public static final class ComponentType
    extends Enum<ComponentType> {
        public static final /* enum */ ComponentType CHAR;
        public static final /* enum */ ComponentType BYTE;
        public static final /* enum */ ComponentType FLOAT;
        public static final /* enum */ ComponentType INT;
        private static final /* synthetic */ ComponentType[] $VALUES;
        public static final /* enum */ ComponentType BOOLEAN;
        public static final /* enum */ ComponentType LONG;
        public static final /* enum */ ComponentType SHORT;
        final int value;
        public static final /* enum */ ComponentType DOUBLE;

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

        public static ComponentType valueOf(String name) {
            return Enum.valueOf(ComponentType.class, name);
        }

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
    }

    private static final class TypeCache {
        static final ObjectParameterType[] bufferTypeCache;
        static final ObjectParameterType[] arrayTypeCache;

        static {
            EnumSet<ComponentType> componentTypes = EnumSet.allOf(ComponentType.class);
            arrayTypeCache = new ObjectParameterType[componentTypes.size()];
            bufferTypeCache = new ObjectParameterType[componentTypes.size()];
            for (ComponentType componentType : componentTypes) {
                TypeCache.arrayTypeCache[componentType.ordinal()] = new ObjectParameterType(ARRAY, componentType);
                TypeCache.bufferTypeCache[componentType.ordinal()] = new ObjectParameterType(BUFFER, componentType);
            }
        }

        private TypeCache() {
        }
    }

    public static final class ObjectType
    extends Enum<ObjectType> {
        public static final /* enum */ ObjectType ARRAY = new ObjectType(0x10000000);
        final int value;
        private static final /* synthetic */ ObjectType[] $VALUES;
        public static final /* enum */ ObjectType BUFFER = new ObjectType(0x20000000);

        static {
            $VALUES = ObjectType.$values();
        }

        private ObjectType(int type) {
            this.value = type;
        }

        private static /* synthetic */ ObjectType[] $values() {
            ObjectType[] objectTypeArray = new ObjectType[2];
            objectTypeArray[0] = ARRAY;
            objectTypeArray[1] = BUFFER;
            return objectTypeArray;
        }

        public static ObjectType valueOf(String name) {
            return Enum.valueOf(ObjectType.class, name);
        }

        public static ObjectType[] values() {
            return (ObjectType[])$VALUES.clone();
        }
    }
}

