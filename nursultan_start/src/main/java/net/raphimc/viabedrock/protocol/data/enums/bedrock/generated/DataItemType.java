/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap
 */
package net.raphimc.viabedrock.protocol.data.enums.bedrock.generated;

import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap;

public enum DataItemType {
    Byte(0),
    Short(1),
    Int(2),
    Float(3),
    String(4),
    CompoundTag(5),
    Pos(6),
    Int64(7),
    Vec3(8),
    Unknown(9);

    private static final Int2ObjectMap<DataItemType> BY_VALUE;
    private final int value;

    public static DataItemType getByValue(int value) {
        return (DataItemType)((Object)BY_VALUE.get(value));
    }

    public static DataItemType getByValue(int value, DataItemType fallback) {
        return (DataItemType)((Object)BY_VALUE.getOrDefault(value, (Object)fallback));
    }

    public static DataItemType getByName(String name) {
        for (DataItemType value : DataItemType.values()) {
            if (!value.name().equalsIgnoreCase(name)) continue;
            return value;
        }
        return null;
    }

    public static DataItemType getByName(String name, DataItemType fallback) {
        for (DataItemType value : DataItemType.values()) {
            if (!value.name().equalsIgnoreCase(name)) continue;
            return value;
        }
        return fallback;
    }

    private DataItemType(DataItemType value) {
        this(value.value);
    }

    private DataItemType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    static {
        BY_VALUE = new Int2ObjectOpenHashMap();
        for (DataItemType value : DataItemType.values()) {
            if (BY_VALUE.containsKey(value.value)) continue;
            BY_VALUE.put(value.value, (Object)value);
        }
    }
}

