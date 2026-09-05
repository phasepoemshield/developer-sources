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

public enum Enchant_Type {
    Protection(0),
    FireProtection(1),
    FeatherFalling(2),
    BlastProtection(3),
    ProjectileProtection(4),
    Thorns(5),
    Respiration(6),
    DepthStrider(7),
    AquaAffinity(8),
    Sharpness(9),
    Smite(10),
    BaneOfArthropods(11),
    Knockback(12),
    FireAspect(13),
    Looting(14),
    Efficiency(15),
    SilkTouch(16),
    Unbreaking(17),
    Fortune(18),
    Power(19),
    Punch(20),
    Flame(21),
    Infinity(22),
    LuckOfTheSea(23),
    Lure(24),
    FrostWalker(25),
    Mending(26),
    CurseOfBinding(27),
    CurseOfVanishing(28),
    Impaling(29),
    Riptide(30),
    Loyalty(31),
    Channeling(32),
    Multishot(33),
    Piercing(34),
    QuickCharge(35),
    SoulSpeed(36),
    SwiftSneak(37),
    WindBurst(38),
    Density(39),
    Breach(40),
    Lunge(41);

    private static final Int2ObjectMap<Enchant_Type> BY_VALUE;
    private final int value;

    public static Enchant_Type getByValue(int value) {
        return (Enchant_Type)((Object)BY_VALUE.get(value));
    }

    public static Enchant_Type getByValue(int value, Enchant_Type fallback) {
        return (Enchant_Type)((Object)BY_VALUE.getOrDefault(value, (Object)fallback));
    }

    public static Enchant_Type getByName(String name) {
        for (Enchant_Type value : Enchant_Type.values()) {
            if (!value.name().equalsIgnoreCase(name)) continue;
            return value;
        }
        return null;
    }

    public static Enchant_Type getByName(String name, Enchant_Type fallback) {
        for (Enchant_Type value : Enchant_Type.values()) {
            if (!value.name().equalsIgnoreCase(name)) continue;
            return value;
        }
        return fallback;
    }

    private Enchant_Type(Enchant_Type value) {
        this(value.value);
    }

    private Enchant_Type(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    static {
        BY_VALUE = new Int2ObjectOpenHashMap();
        for (Enchant_Type value : Enchant_Type.values()) {
            if (BY_VALUE.containsKey(value.value)) continue;
            BY_VALUE.put(value.value, (Object)value);
        }
    }
}

