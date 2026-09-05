/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07211
 */
package net.caffeinemc.mods.sodium.client.model.light.smooth;

import minecraft.class07211;
import net.caffeinemc.mods.sodium.client.model.light.smooth.AoNeighborInfo$1;
import net.caffeinemc.mods.sodium.client.model.light.smooth.AoNeighborInfo$2;
import net.caffeinemc.mods.sodium.client.model.light.smooth.AoNeighborInfo$3;
import net.caffeinemc.mods.sodium.client.model.light.smooth.AoNeighborInfo$4;
import net.caffeinemc.mods.sodium.client.model.light.smooth.AoNeighborInfo$5;
import net.caffeinemc.mods.sodium.client.model.light.smooth.AoNeighborInfo$6;

abstract sealed class AoNeighborInfo
extends Enum<AoNeighborInfo>
permits AoNeighborInfo$1, AoNeighborInfo$2, AoNeighborInfo$3, AoNeighborInfo$4, AoNeighborInfo$5, AoNeighborInfo$6 {
    public static final /* enum */ AoNeighborInfo DOWN = new AoNeighborInfo$1(new class07211[]{class07211.field_11039, class07211.field_11034, class07211.field_11043, class07211.field_11035}, 0.5f);
    public static final /* enum */ AoNeighborInfo UP = new AoNeighborInfo$2(new class07211[]{class07211.field_11034, class07211.field_11039, class07211.field_11043, class07211.field_11035}, 1.0f);
    public static final /* enum */ AoNeighborInfo NORTH = new AoNeighborInfo$3(new class07211[]{class07211.field_11036, class07211.field_11033, class07211.field_11034, class07211.field_11039}, 0.8f);
    public static final /* enum */ AoNeighborInfo SOUTH = new AoNeighborInfo$4(new class07211[]{class07211.field_11039, class07211.field_11034, class07211.field_11033, class07211.field_11036}, 0.8f);
    public static final /* enum */ AoNeighborInfo WEST = new AoNeighborInfo$5(new class07211[]{class07211.field_11036, class07211.field_11033, class07211.field_11043, class07211.field_11035}, 0.6f);
    public static final /* enum */ AoNeighborInfo EAST = new AoNeighborInfo$6(new class07211[]{class07211.field_11033, class07211.field_11036, class07211.field_11043, class07211.field_11035}, 0.6f);
    public final class07211[] faces;
    public final float strength;
    private static final AoNeighborInfo[] VALUES;
    private static final /* synthetic */ AoNeighborInfo[] $VALUES;

    AoNeighborInfo(class07211[] class07211Array, float f) {
        this.faces = class07211Array;
        this.strength = f;
    }

    static {
        $VALUES = AoNeighborInfo.$values();
        VALUES = AoNeighborInfo.values();
    }

    public static AoNeighborInfo get(class07211 class072112) {
        return VALUES[class072112.L()];
    }

    public static AoNeighborInfo[] values() {
        return (AoNeighborInfo[])$VALUES.clone();
    }

    public static AoNeighborInfo valueOf(String string) {
        return Enum.valueOf(AoNeighborInfo.class, string);
    }

    private static /* synthetic */ AoNeighborInfo[] $values() {
        return new AoNeighborInfo[]{DOWN, UP, NORTH, SOUTH, WEST, EAST};
    }

    public abstract float getDepth(float var1, float var2, float var3);

    public abstract void calculateCornerWeights(float var1, float var2, float var3, float[] var4);

    public abstract void mapCorners(int[] var1, float[] var2, int[] var3, float[] var4);
}

