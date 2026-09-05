/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08768
 */
package net.irisshaders.iris.pipeline;

import minecraft.class08768;

public enum WorldRenderingPhase {
    NONE,
    SKY,
    SUNSET,
    CUSTOM_SKY,
    SUN,
    MOON,
    STARS,
    VOID,
    TERRAIN_SOLID,
    TERRAIN_CUTOUT_MIPPED,
    TERRAIN_CUTOUT,
    ENTITIES,
    BLOCK_ENTITIES,
    DESTROY,
    OUTLINE,
    DEBUG,
    HAND_SOLID,
    TERRAIN_TRANSLUCENT,
    TRIPWIRE,
    PARTICLES,
    CLOUDS,
    RAIN_SNOW,
    WORLD_BORDER,
    HAND_TRANSLUCENT;


    public static WorldRenderingPhase fromTerrainRenderType(class08768 class087682) {
        if (class087682 == class08768.field_61022) {
            return TERRAIN_SOLID;
        }
        if (class087682 == class08768.field_61023) {
            return TERRAIN_TRANSLUCENT;
        }
        if (class087682 == class08768.field_61024) {
            return TRIPWIRE;
        }
        throw new IllegalStateException("Illegal render type!");
    }
}

