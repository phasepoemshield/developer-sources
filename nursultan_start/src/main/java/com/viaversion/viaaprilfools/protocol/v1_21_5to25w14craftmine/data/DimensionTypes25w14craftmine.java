/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.Tag
 */
package com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.data;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.Tag;

public final class DimensionTypes25w14craftmine {
    private static final CompoundTag OVERWORLD_CAVES_EFFECT = DimensionTypes25w14craftmine.createOverworldCavesEffect();
    private static final CompoundTag GENERATED_DIMENSION_TAG = DimensionTypes25w14craftmine.createGeneratedDimension();

    private static CompoundTag createGeneratedDimension() {
        CompoundTag tag = new CompoundTag();
        tag.putFloat("ambient_light", 0.0f);
        tag.putByte("bed_works", (byte)1);
        tag.putDouble("coordinate_scale", 1.0);
        tag.put("effects", (Tag)OVERWORLD_CAVES_EFFECT.copy());
        tag.putByte("has_ceiling", (byte)0);
        tag.putByte("has_raids", (byte)1);
        tag.putByte("has_skylight", (byte)1);
        tag.putInt("height", 384);
        tag.putString("infiniburn", "#minecraft:infiniburn_overworld");
        tag.putInt("logical_height", 384);
        tag.putInt("min_y", -64);
        tag.putInt("monster_spawn_block_light_limit", 0);
        CompoundTag monsterSpawnLightLevel = new CompoundTag();
        tag.put("monster_spawn_light_level", (Tag)monsterSpawnLightLevel);
        monsterSpawnLightLevel.putInt("max_inclusive", 7);
        monsterSpawnLightLevel.putInt("min_inclusive", 0);
        monsterSpawnLightLevel.putString("type", "minecraft:uniform");
        tag.putByte("natural", (byte)1);
        tag.putByte("piglin_safe", (byte)0);
        tag.putByte("respawn_anchor_works", (byte)0);
        tag.putByte("ultrawarm", (byte)0);
        return tag;
    }

    private static CompoundTag createOverworldCavesEffect() {
        CompoundTag tag = new CompoundTag();
        tag.putFloat("cloud_level", 192.0f);
        tag.putByte("constant_ambient_light", (byte)0);
        tag.putString("fog_scaler", "overworld");
        tag.putByte("force_bright_lightmap", (byte)0);
        tag.putByte("has_ground", (byte)1);
        tag.putByte("has_sunrise_and_sunset", (byte)1);
        tag.putByte("is_always_foggy", (byte)0);
        CompoundTag skyType = new CompoundTag();
        tag.put("sky_type", (Tag)skyType);
        skyType.putString("type", "overworld");
        return tag;
    }

    public static CompoundTag getGeneratedDimensionTag() {
        return GENERATED_DIMENSION_TAG.copy();
    }

    public static CompoundTag getOverworldCavesDimensionEffectsTag() {
        return OVERWORLD_CAVES_EFFECT.copy();
    }
}

