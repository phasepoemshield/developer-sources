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

public enum ClientboundMapItemDataPacket_Type {
    Invalid(0),
    TextureUpdate(2),
    DecorationUpdate(4),
    Creation(8);

    private static final Int2ObjectMap<ClientboundMapItemDataPacket_Type> BY_VALUE;
    private final int value;

    public static ClientboundMapItemDataPacket_Type getByValue(int value) {
        return (ClientboundMapItemDataPacket_Type)((Object)BY_VALUE.get(value));
    }

    public static ClientboundMapItemDataPacket_Type getByValue(int value, ClientboundMapItemDataPacket_Type fallback) {
        return (ClientboundMapItemDataPacket_Type)((Object)BY_VALUE.getOrDefault(value, (Object)fallback));
    }

    public static ClientboundMapItemDataPacket_Type getByName(String name) {
        for (ClientboundMapItemDataPacket_Type value : ClientboundMapItemDataPacket_Type.values()) {
            if (!value.name().equalsIgnoreCase(name)) continue;
            return value;
        }
        return null;
    }

    public static ClientboundMapItemDataPacket_Type getByName(String name, ClientboundMapItemDataPacket_Type fallback) {
        for (ClientboundMapItemDataPacket_Type value : ClientboundMapItemDataPacket_Type.values()) {
            if (!value.name().equalsIgnoreCase(name)) continue;
            return value;
        }
        return fallback;
    }

    private ClientboundMapItemDataPacket_Type(ClientboundMapItemDataPacket_Type value) {
        this(value.value);
    }

    private ClientboundMapItemDataPacket_Type(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    static {
        BY_VALUE = new Int2ObjectOpenHashMap();
        for (ClientboundMapItemDataPacket_Type value : ClientboundMapItemDataPacket_Type.values()) {
            if (BY_VALUE.containsKey(value.value)) continue;
            BY_VALUE.put(value.value, (Object)value);
        }
    }
}

