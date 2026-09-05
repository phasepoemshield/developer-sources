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

public enum NoteBlockInstrument {
    Harp(0),
    BassDrum(1),
    Snare(2),
    Hat(3),
    Bass(4),
    Flute(5),
    Bell(6),
    Guitar(7),
    Chime(8),
    Xylophone(9),
    IronXylophone(10),
    CowBell(11),
    Didgeridoo(12),
    Bit(13),
    Banjo(14),
    Pling(15),
    Trumpet(16),
    TrumpetExposed(17),
    TrumpetWeathered(18),
    TrumpetOxidized(19),
    Zombie(20),
    Skeleton(21),
    Creeper(22),
    Dragon(23),
    WitherSkeleton(24),
    Piglin(25);

    private static final Int2ObjectMap<NoteBlockInstrument> BY_VALUE;
    private final int value;

    public static NoteBlockInstrument getByValue(int value) {
        return (NoteBlockInstrument)((Object)BY_VALUE.get(value));
    }

    public static NoteBlockInstrument getByValue(int value, NoteBlockInstrument fallback) {
        return (NoteBlockInstrument)((Object)BY_VALUE.getOrDefault(value, (Object)fallback));
    }

    public static NoteBlockInstrument getByName(String name) {
        for (NoteBlockInstrument value : NoteBlockInstrument.values()) {
            if (!value.name().equalsIgnoreCase(name)) continue;
            return value;
        }
        return null;
    }

    public static NoteBlockInstrument getByName(String name, NoteBlockInstrument fallback) {
        for (NoteBlockInstrument value : NoteBlockInstrument.values()) {
            if (!value.name().equalsIgnoreCase(name)) continue;
            return value;
        }
        return fallback;
    }

    private NoteBlockInstrument(NoteBlockInstrument value) {
        this(value.value);
    }

    private NoteBlockInstrument(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    static {
        BY_VALUE = new Int2ObjectOpenHashMap();
        for (NoteBlockInstrument value : NoteBlockInstrument.values()) {
            if (BY_VALUE.containsKey(value.value)) continue;
            BY_VALUE.put(value.value, (Object)value);
        }
    }
}

