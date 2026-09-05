/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07211
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.indigo.renderer.mesh.QuadViewImpl
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.aocalc;

import minecraft.class07211;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.indigo.renderer.aocalc.AoFace$1;
import net.fabricmc.fabric.impl.client.indigo.renderer.aocalc.AoFace$2;
import net.fabricmc.fabric.impl.client.indigo.renderer.aocalc.AoFace$3;
import net.fabricmc.fabric.impl.client.indigo.renderer.aocalc.AoFace$4;
import net.fabricmc.fabric.impl.client.indigo.renderer.aocalc.AoFace$5;
import net.fabricmc.fabric.impl.client.indigo.renderer.aocalc.AoFace$6;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.QuadViewImpl;

@Environment(value=EnvType.CLIENT)
abstract sealed class AoFace
extends Enum<AoFace>
permits AoFace$1, AoFace$2, AoFace$3, AoFace$4, AoFace$5, AoFace$6 {
    public static final /* enum */ AoFace DOWN = new AoFace$1(new class07211[]{class07211.field_11039, class07211.field_11034, class07211.field_11043, class07211.field_11035}, new int[]{0, 1, 2, 3});
    public static final /* enum */ AoFace UP = new AoFace$2(new class07211[]{class07211.field_11034, class07211.field_11039, class07211.field_11043, class07211.field_11035}, new int[]{2, 3, 0, 1});
    public static final /* enum */ AoFace NORTH = new AoFace$3(new class07211[]{class07211.field_11036, class07211.field_11033, class07211.field_11034, class07211.field_11039}, new int[]{3, 0, 1, 2});
    public static final /* enum */ AoFace SOUTH = new AoFace$4(new class07211[]{class07211.field_11039, class07211.field_11034, class07211.field_11033, class07211.field_11036}, new int[]{0, 1, 2, 3});
    public static final /* enum */ AoFace WEST = new AoFace$5(new class07211[]{class07211.field_11036, class07211.field_11033, class07211.field_11043, class07211.field_11035}, new int[]{3, 0, 1, 2});
    public static final /* enum */ AoFace EAST = new AoFace$6(new class07211[]{class07211.field_11033, class07211.field_11036, class07211.field_11043, class07211.field_11035}, new int[]{1, 2, 3, 0});
    private static final AoFace[] VALUES;
    final class07211[] neighbors;
    final int[] vertexMap;
    private static final /* synthetic */ AoFace[] $VALUES;

    AoFace(class07211[] class07211Array, int[] nArray) {
        this.neighbors = class07211Array;
        this.vertexMap = nArray;
    }

    static {
        $VALUES = AoFace.$values();
        VALUES = AoFace.values();
    }

    static AoFace get(class07211 class072112) {
        return VALUES[class072112.L()];
    }

    public static AoFace[] values() {
        return (AoFace[])$VALUES.clone();
    }

    public static AoFace valueOf(String string) {
        return Enum.valueOf(AoFace.class, string);
    }

    private static /* synthetic */ AoFace[] $values() {
        return new AoFace[]{DOWN, UP, NORTH, SOUTH, WEST, EAST};
    }

    abstract void computeCornerWeights(QuadViewImpl var1, int var2, float[] var3);

    abstract float computeDepth(QuadViewImpl var1, int var2);
}

