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

public enum SharedTypes_Legacy_ActorDamageCause {
    Override(0),
    Contact(1),
    EntityAttack(2),
    Projectile(3),
    Suffocation(4),
    Fall(5),
    Fire(6),
    FireTick(7),
    Lava(8),
    Drowning(9),
    BlockExplosion(10),
    EntityExplosion(11),
    Void(12),
    SelfDestruct(13),
    Magic(14),
    Wither(15),
    Starve(16),
    Anvil(17),
    Thorns(18),
    FallingBlock(19),
    Piston(20),
    FlyIntoWall(21),
    Magma(22),
    Fireworks(23),
    Lightning(24),
    Charging(25),
    Temperature(26),
    Freezing(27),
    Stalactite(28),
    Stalagmite(29),
    RamAttack(30),
    SonicBoom(31),
    Campfire(32),
    SoulCampfire(33),
    MaceSmash(34);

    private static final Int2ObjectMap<SharedTypes_Legacy_ActorDamageCause> BY_VALUE;
    private final int value;

    public static SharedTypes_Legacy_ActorDamageCause getByValue(int value) {
        return (SharedTypes_Legacy_ActorDamageCause)((Object)BY_VALUE.get(value));
    }

    public static SharedTypes_Legacy_ActorDamageCause getByValue(int value, SharedTypes_Legacy_ActorDamageCause fallback) {
        return (SharedTypes_Legacy_ActorDamageCause)((Object)BY_VALUE.getOrDefault(value, (Object)fallback));
    }

    public static SharedTypes_Legacy_ActorDamageCause getByName(String name) {
        for (SharedTypes_Legacy_ActorDamageCause value : SharedTypes_Legacy_ActorDamageCause.values()) {
            if (!value.name().equalsIgnoreCase(name)) continue;
            return value;
        }
        return null;
    }

    public static SharedTypes_Legacy_ActorDamageCause getByName(String name, SharedTypes_Legacy_ActorDamageCause fallback) {
        for (SharedTypes_Legacy_ActorDamageCause value : SharedTypes_Legacy_ActorDamageCause.values()) {
            if (!value.name().equalsIgnoreCase(name)) continue;
            return value;
        }
        return fallback;
    }

    private SharedTypes_Legacy_ActorDamageCause(SharedTypes_Legacy_ActorDamageCause value) {
        this(value.value);
    }

    private SharedTypes_Legacy_ActorDamageCause(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    static {
        BY_VALUE = new Int2ObjectOpenHashMap();
        for (SharedTypes_Legacy_ActorDamageCause value : SharedTypes_Legacy_ActorDamageCause.values()) {
            if (BY_VALUE.containsKey(value.value)) continue;
            BY_VALUE.put(value.value, (Object)value);
        }
    }
}

