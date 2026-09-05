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

public enum Tag_Type {
    End(0),
    Byte(1),
    Short(2),
    Int(3),
    Int64(4),
    Float(5),
    Double(6),
    ByteArray(7),
    String(8),
    List(9),
    Compound(10),
    IntArray(11);

    private static final Int2ObjectMap<Tag_Type> BY_VALUE;
    private final int value;

    public static Tag_Type getByValue(int value) {
        return (Tag_Type)((Object)BY_VALUE.get(value));
    }

    public static Tag_Type getByValue(int value, Tag_Type fallback) {
        return (Tag_Type)((Object)BY_VALUE.getOrDefault(value, (Object)fallback));
    }

    public static Tag_Type getByName(String name) {
        for (Tag_Type value : Tag_Type.values()) {
            if (!value.name().equalsIgnoreCase(name)) continue;
            return value;
        }
        return null;
    }

    public static Tag_Type getByName(String name, Tag_Type fallback) {
        for (Tag_Type value : Tag_Type.values()) {
            if (!value.name().equalsIgnoreCase(name)) continue;
            return value;
        }
        return fallback;
    }

    private Tag_Type(Tag_Type value) {
        this(value.value);
    }

    private Tag_Type(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    static {
        BY_VALUE = new Int2ObjectOpenHashMap();
        for (Tag_Type value : Tag_Type.values()) {
            if (BY_VALUE.containsKey(value.value)) continue;
            BY_VALUE.put(value.value, (Object)value);
        }
    }
}

