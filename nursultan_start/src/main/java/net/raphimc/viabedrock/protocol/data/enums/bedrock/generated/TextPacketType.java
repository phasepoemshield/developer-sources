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

public enum TextPacketType {
    raw(0),
    chat(1),
    translate(2),
    popup(3),
    jukeboxPopup(4),
    tip(5),
    systemMessage(6),
    whisper(7),
    announcement(8),
    textObjectWhisper(9),
    textObject(10),
    textObjectAnnouncement(11);

    private static final Int2ObjectMap<TextPacketType> BY_VALUE;
    private final int value;

    private TextPacketType(TextPacketType textPacketType) {
        this(textPacketType.value);
    }

    private TextPacketType(int n2) {
        this.value = n2;
    }

    public int getValue() {
        return this.value;
    }

    public static TextPacketType getByName(String string, TextPacketType textPacketType) {
        for (TextPacketType textPacketType2 : TextPacketType.values()) {
            if (!textPacketType2.name().equalsIgnoreCase(string)) continue;
            return textPacketType2;
        }
        return textPacketType;
    }

    public static TextPacketType getByName(String string) {
        for (TextPacketType textPacketType : TextPacketType.values()) {
            if (!textPacketType.name().equalsIgnoreCase(string)) continue;
            return textPacketType;
        }
        return null;
    }

    public static TextPacketType getByValue(int n) {
        return (TextPacketType)((Object)BY_VALUE.get(n));
    }

    public static TextPacketType getByValue(int n, TextPacketType textPacketType) {
        return (TextPacketType)((Object)BY_VALUE.getOrDefault(n, (Object)textPacketType));
    }

    static {
        BY_VALUE = new Int2ObjectOpenHashMap();
        for (TextPacketType value : TextPacketType.values()) {
            if (BY_VALUE.containsKey(value.value)) continue;
            BY_VALUE.put(value.value, (Object)value);
        }
    }
}

