/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.types.EnumType
 *  com.viaversion.viaversion.api.type.types.EnumType$Fallback
 *  com.viaversion.viaversion.api.type.types.FakeEnumType
 *  com.viaversion.viaversion.api.type.types.FakeEnumType$Entry
 *  com.viaversion.viaversion.api.type.types.misc.RegistryValueType
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.type.types.EnumType;
import com.viaversion.viaversion.api.type.types.FakeEnumType;
import com.viaversion.viaversion.api.type.types.misc.RegistryValueType;
import com.viaversion.viaversion.util.Key;
import java.util.List;

public final class EnumTypes {
    public static final EnumType DYE_COLOR = new EnumType(new String[]{"white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"});
    public static final EnumType RARITY = new EnumType(new String[]{"common", "uncommon", "rare", "epic"});
    public static final EnumType FOX_VARIANT = new EnumType(new String[]{"red", "snow"});
    public static final EnumType SALMON_VARIANT = new EnumType(EnumType.Fallback.CLAMP, new String[]{"small", "medium", "large"});
    public static final EnumType PARROT_VARIANT = new EnumType(EnumType.Fallback.CLAMP, new String[]{"red_blue", "blue", "green", "yellow_blue", "gray"});
    public static final EnumType MUSHROOM_COW_VARIANT = new EnumType(EnumType.Fallback.CLAMP, new String[]{"red", "brown"});
    public static final EnumType HORSE_VARIANT = new EnumType(EnumType.Fallback.WRAP, new String[]{"white", "creamy", "chestnut", "brown", "black", "gray", "dark_brown"});
    public static final EnumType LLAMA_VARIANT = new EnumType(EnumType.Fallback.CLAMP, new String[]{"creamy", "white", "brown", "gray"});
    public static final EnumType AXOLOTL_VARIANT = new EnumType(new String[]{"lucy", "wild", "gold", "cyan", "blue"});
    public static final EnumType EQUIPMENT_SLOT = new EnumType(new String[]{"mainhand", "feet", "legs", "chest", "head", "offhand", "body", "saddle"});
    public static final EnumType SWING_ANIMATION = new EnumType(new String[]{"none", "whack", "stab"});
    public static final EnumType ITEM_USE_ANIMATION = new EnumType(new String[]{"none", "eat", "drink", "block", "bow", "trident", "crossbow", "spyglass", "toot_horn", "brush", "bundle", "spear"});
    public static final FakeEnumType RABBIT_VARIANT = new FakeEnumType(List.of("brown", "white", "black", "white_splotched", "gold", "salt"), new FakeEnumType.Entry[]{FakeEnumType.Entry.of((int)99, (String)"evil")});
    public static final RegistryValueType VILLAGER_TYPE = new RegistryValueType(Key.of((String)"villager_type"), new String[]{"desert", "jungle", "plains", "savanna", "snow", "swamp", "taiga"});
    public static final RegistryValueType POTION = new RegistryValueType(Key.of((String)"potion"), new String[]{"water", "mundane", "thick", "awkward", "night_vision", "long_night_vision", "invisibility", "long_invisibility", "leaping", "long_leaping", "strong_leaping", "fire_resistance", "long_fire_resistance", "swiftness", "long_swiftness", "strong_swiftness", "slowness", "long_slowness", "strong_slowness", "turtle_master", "long_turtle_master", "strong_turtle_master", "water_breathing", "long_water_breathing", "healing", "strong_healing", "harming", "strong_harming", "poison", "long_poison", "strong_poison", "regeneration", "long_regeneration", "strong_regeneration", "strength", "long_strength", "strong_strength", "weakness", "long_weakness", "luck", "slow_falling", "long_slow_falling", "wind_charged", "weaving", "oozing", "infested"});
    public static final RegistryValueType MOB_EFFECT = new RegistryValueType(Key.of((String)"mob_effect"), new String[]{"speed", "slowness", "haste", "mining_fatigue", "strength", "instant_health", "instant_damage", "jump_boost", "nausea", "regeneration", "resistance", "fire_resistance", "water_breathing", "invisibility", "blindness", "night_vision", "hunger", "weakness", "poison", "wither", "health_boost", "absorption", "saturation", "glowing", "levitation", "luck", "unluck", "slow_falling", "conduit_power", "dolphins_grace", "bad_omen", "hero_of_the_village", "darkness", "trial_omen", "raid_omen", "wind_charged", "weaving", "oozing", "infested", "breath_of_the_nautilus"});
    public static final RegistryValueType CONSUME_EFFECT = new RegistryValueType(Key.of((String)"consume_effect_type"), new String[]{"apply_effects", "remove_effects", "clear_all_effects", "teleport_randomly", "play_sound"});
}

