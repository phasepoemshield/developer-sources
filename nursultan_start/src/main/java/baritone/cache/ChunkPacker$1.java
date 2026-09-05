/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.utils.pathing.PathingBlockType
 */
package baritone.cache;

import baritone.utils.pathing.PathingBlockType;

class ChunkPacker$1 {
    static final /* synthetic */ int[] $SwitchMap$baritone$utils$pathing$PathingBlockType;

    static {
        $SwitchMap$baritone$utils$pathing$PathingBlockType = new int[PathingBlockType.values().length];
        try {
            ChunkPacker$1.$SwitchMap$baritone$utils$pathing$PathingBlockType[PathingBlockType.AIR.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ChunkPacker$1.$SwitchMap$baritone$utils$pathing$PathingBlockType[PathingBlockType.WATER.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ChunkPacker$1.$SwitchMap$baritone$utils$pathing$PathingBlockType[PathingBlockType.AVOID.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ChunkPacker$1.$SwitchMap$baritone$utils$pathing$PathingBlockType[PathingBlockType.SOLID.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

