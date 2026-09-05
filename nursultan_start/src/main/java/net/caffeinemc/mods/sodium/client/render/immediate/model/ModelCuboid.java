/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class07211
 *  net.caffeinemc.mods.sodium.client.util.Int2
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jspecify.annotations.NonNull
 */
package net.caffeinemc.mods.sodium.client.render.immediate.model;

import java.util.Set;
import minecraft.class07211;
import net.caffeinemc.mods.sodium.client.util.Int2;
import org.apache.commons.lang3.ArrayUtils;
import org.jspecify.annotations.NonNull;

public class ModelCuboid {
    public static final int NUM_CUBE_VERTICES = 8;
    public static final int NUM_CUBE_FACES = 6;
    public static final int NUM_FACE_VERTICES = 4;
    public static final int VERTEX_X0_Y0_Z0 = 0;
    public static final int VERTEX_X1_Y0_Z0 = 1;
    public static final int VERTEX_X1_Y1_Z0 = 2;
    public static final int VERTEX_X0_Y1_Z0 = 3;
    public static final int VERTEX_X0_Y0_Z1 = 4;
    public static final int VERTEX_X1_Y0_Z1 = 5;
    public static final int VERTEX_X1_Y1_Z1 = 6;
    public static final int VERTEX_X0_Y1_Z1 = 7;
    public static final int FACE_NEG_Y = 0;
    public static final int FACE_POS_Y = 1;
    public static final int FACE_NEG_X = 2;
    public static final int FACE_NEG_Z = 3;
    public static final int FACE_POS_X = 4;
    public static final int FACE_POS_Z = 5;
    public final float originX;
    public final float originY;
    public final float originZ;
    public final float sizeX;
    public final float sizeY;
    public final float sizeZ;
    private final int cullMask;
    public final int[] normals;
    public final int[] positions;
    public final long[] textures;

    public ModelCuboid(int n, int n2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean bl, float f10, float f11, Set<class07211> set) {
        float f12;
        float f13 = f + f4;
        float f14 = f2 + f5;
        float f15 = f3 + f6;
        f -= f7;
        f2 -= f8;
        f3 -= f9;
        f13 += f7;
        f14 += f8;
        f15 += f9;
        if (bl) {
            f12 = f13;
            f13 = f;
            f = f12;
        }
        f /= 16.0f;
        f2 /= 16.0f;
        f3 /= 16.0f;
        f13 /= 16.0f;
        f14 /= 16.0f;
        f15 /= 16.0f;
        this.originX = f;
        this.originY = f2;
        this.originZ = f3;
        this.sizeX = f13 - f;
        this.sizeY = f14 - f2;
        this.sizeZ = f15 - f3;
        f12 = 1.0f / f10;
        float f16 = 1.0f / f11;
        float f17 = f12 * (float)n;
        float f18 = f12 * ((float)n + f6);
        float f19 = f12 * ((float)n + f6 + f4);
        float f20 = f12 * ((float)n + f6 + f4 + f4);
        float f21 = f12 * ((float)n + f6 + f4 + f6);
        float f22 = f12 * ((float)n + f6 + f4 + f6 + f4);
        float f23 = f16 * (float)n2;
        float f24 = f16 * ((float)n2 + f6);
        float f25 = f16 * ((float)n2 + f6 + f5);
        this.cullMask = ModelCuboid.createCullMask(set);
        int[] nArray = new int[24];
        long[] lArray = new long[24];
        int[] nArray2 = new int[]{0, 1, 2, 3, 4, 5};
        ModelCuboid.writeVertexList(nArray, 0, 5, 4, 0, 1);
        ModelCuboid.writeTexCoords(lArray, 0, f18, f23, f19, f24);
        ModelCuboid.writeVertexList(nArray, 1, 2, 3, 7, 6);
        ModelCuboid.writeTexCoords(lArray, 1, f19, f24, f20, f23);
        ModelCuboid.writeVertexList(nArray, 3, 1, 0, 3, 2);
        ModelCuboid.writeTexCoords(lArray, 3, f18, f24, f19, f25);
        ModelCuboid.writeVertexList(nArray, 5, 4, 5, 6, 7);
        ModelCuboid.writeTexCoords(lArray, 5, f21, f24, f22, f25);
        ModelCuboid.writeVertexList(nArray, 2, 5, 1, 2, 6);
        ModelCuboid.writeTexCoords(lArray, 2, f19, f24, f21, f25);
        ModelCuboid.writeVertexList(nArray, 4, 0, 4, 7, 3);
        ModelCuboid.writeTexCoords(lArray, 4, f17, f24, f18, f25);
        if (bl) {
            ModelCuboid.reverseVertices(nArray, lArray);
            nArray2[4] = 2;
            nArray2[2] = 4;
        }
        this.normals = nArray2;
        this.positions = nArray;
        this.textures = lArray;
    }

    private static void writeTexCoords(long[] lArray, int n, float f, float f2, float f3, float f4) {
        lArray[n * 4 + 0] = Int2.pack((int)Float.floatToRawIntBits(f3), (int)Float.floatToRawIntBits(f2));
        lArray[n * 4 + 1] = Int2.pack((int)Float.floatToRawIntBits(f), (int)Float.floatToRawIntBits(f2));
        lArray[n * 4 + 2] = Int2.pack((int)Float.floatToRawIntBits(f), (int)Float.floatToRawIntBits(f4));
        lArray[n * 4 + 3] = Int2.pack((int)Float.floatToRawIntBits(f3), (int)Float.floatToRawIntBits(f4));
    }

    public boolean shouldDrawFace(int n) {
        return (this.cullMask & 1 << n) != 0;
    }

    private static int getFaceIndex(@NonNull class07211 class072112) {
        return switch (class072112) {
            default -> throw new MatchException(null, null);
            case class07211.field_11033 -> 0;
            case class07211.field_11036 -> 1;
            case class07211.field_11043 -> 3;
            case class07211.field_11035 -> 5;
            case class07211.field_11039 -> 4;
            case class07211.field_11034 -> 2;
        };
    }

    private static void reverseVertices(int[] nArray, long[] lArray) {
        for (int i = 0; i < 6; ++i) {
            int n = i * 4;
            ArrayUtils.swap((int[])nArray, (int)(n + 0), (int)(n + 3));
            ArrayUtils.swap((int[])nArray, (int)(n + 1), (int)(n + 2));
            ArrayUtils.swap((long[])lArray, (int)(n + 0), (int)(n + 3));
            ArrayUtils.swap((long[])lArray, (int)(n + 1), (int)(n + 2));
        }
    }

    private static void writeVertexList(int[] nArray, int n, int n2, int n3, int n4, int n5) {
        nArray[n * 4 + 0] = n2;
        nArray[n * 4 + 1] = n3;
        nArray[n * 4 + 2] = n4;
        nArray[n * 4 + 3] = n5;
    }

    private static int createCullMask(Set<class07211> set) {
        int n = 0;
        for (class07211 class072112 : set) {
            n |= 1 << ModelCuboid.getFaceIndex(class072112);
        }
        return n;
    }
}

