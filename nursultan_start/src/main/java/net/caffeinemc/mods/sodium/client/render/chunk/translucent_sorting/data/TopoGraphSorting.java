/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ReferenceMap
 *  net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing
 *  net.caffeinemc.mods.sodium.client.util.collections.BitArray
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data;

import it.unimi.dsi.fastutil.objects.Object2ReferenceMap;
import java.util.function.IntConsumer;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.TQuad;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.NormalList;
import net.caffeinemc.mods.sodium.client.util.collections.BitArray;
import org.joml.Vector3fc;

public class TopoGraphSorting {
    private static final float HALF_SPACE_EPSILON = 0.001f;

    private TopoGraphSorting() {
    }

    public static boolean orthogonalQuadVisibleThrough(TQuad tQuad, TQuad tQuad2, boolean bl) {
        boolean bl2;
        int n = tQuad.getFacing().ordinal();
        int n2 = tQuad.getFacing().getOpposite().ordinal();
        int n3 = tQuad2.getFacing().ordinal();
        int n4 = tQuad.getFacing().getSign();
        int n5 = tQuad2.getFacing().getSign();
        float[] fArray = tQuad.getExtents();
        float[] fArray2 = tQuad2.getExtents();
        float f = (float)n4 * fArray[n] - (float)n4 * fArray2[n2];
        float f2 = (float)n5 * fArray[n3] - (float)n5 * fArray2[n3];
        boolean bl3 = bl2 = f > 0.0f && f2 > 0.0f;
        if (bl2 && TQuad.extentsIntersect(fArray, fArray2)) {
            if (bl) {
                return true;
            }
            return f + f2 > 1.0f;
        }
        return bl2;
    }

    private static boolean pointInsideHalfSpaceEpsilon(float f, Vector3fc vector3fc, float f2, float f3, float f4) {
        return vector3fc.dot(f2, f3, f4) + 0.001f < f;
    }

    private static boolean pointOutsideHalfSpaceEpsilon(float f, Vector3fc vector3fc, float f2, float f3, float f4) {
        return vector3fc.dot(f2, f3, f4) - 0.001f > f;
    }

    public static boolean topoGraphSort(IntConsumer intConsumer, TQuad[] tQuadArray, Object2ReferenceMap<Vector3fc, float[]> object2ReferenceMap, Vector3fc vector3fc, boolean bl) {
        TQuad[] tQuadArray2;
        int[] nArray = null;
        int n = 0;
        if (vector3fc != null) {
            tQuadArray2 = new TQuad[tQuadArray.length];
            nArray = new int[tQuadArray.length];
            for (int i = 0; i < tQuadArray.length; ++i) {
                TQuad tQuad = tQuadArray[i];
                if (TopoGraphSorting.pointOutsideHalfSpace(tQuad.getAccurateDotProduct(), tQuad.getAccurateNormal(), vector3fc)) {
                    nArray[n] = i;
                    tQuadArray2[n] = tQuad;
                    ++n;
                    continue;
                }
                intConsumer.accept(i);
            }
        } else {
            tQuadArray2 = tQuadArray;
            n = tQuadArray.length;
        }
        return TopoGraphSorting.topoGraphSort(intConsumer, tQuadArray2, n, nArray, object2ReferenceMap, vector3fc, bl);
    }

    public static boolean topoGraphSort(IntConsumer intConsumer, TQuad[] tQuadArray, int n, int[] nArray, Object2ReferenceMap<Vector3fc, float[]> object2ReferenceMap, Vector3fc vector3fc, boolean bl) {
        if (n == 0) {
            return true;
        }
        if (n == 1) {
            if (nArray != null) {
                intConsumer.accept(nArray[0]);
            } else {
                intConsumer.accept(0);
            }
            return true;
        }
        if (n == 2) {
            int n2 = 0;
            int n3 = 1;
            if (TopoGraphSorting.quadVisibleThrough(tQuadArray[n2], tQuadArray[n3], null, null, bl)) {
                if (bl && TopoGraphSorting.quadVisibleThrough(tQuadArray[n3], tQuadArray[n2], null, null, true)) {
                    return false;
                }
                n2 = 1;
                n3 = 0;
            }
            if (nArray != null) {
                intConsumer.accept(nArray[n2]);
                intConsumer.accept(nArray[n3]);
            } else {
                intConsumer.accept(n2);
                intConsumer.accept(n3);
            }
            return true;
        }
        BitArray bitArray = new BitArray(n);
        bitArray.set(0, n);
        int n4 = 0;
        BitArray bitArray2 = new BitArray(n);
        int[] nArray2 = new int[n];
        int[] nArray3 = new int[n];
        while (n4 < n) {
            int n5;
            int n6 = 0;
            nArray2[n6] = n5 = bitArray.nextSetBit(0);
            bitArray2.set(n5);
            nArray3[n6] = 0;
            while (n6 >= 0) {
                int n7 = nArray2[n6];
                int n8 = bitArray.nextSetBit(nArray3[n6]);
                if (n8 != -1) {
                    TQuad tQuad;
                    TQuad tQuad2;
                    if (n7 != n8 && TopoGraphSorting.quadVisibleThrough(tQuad2 = tQuadArray[n7], tQuad = tQuadArray[n8], object2ReferenceMap, vector3fc, bl)) {
                        if (bitArray2.getAndSet(n8)) {
                            return false;
                        }
                        nArray3[n6] = n8 + 1;
                        nArray2[++n6] = n8;
                        nArray3[n6] = 0;
                        continue;
                    }
                    if (++n8 < n) {
                        nArray3[n6] = n8;
                        continue;
                    }
                }
                bitArray2.unset(n7);
                ++n4;
                bitArray.unset(n7);
                --n6;
                if (nArray != null) {
                    intConsumer.accept(nArray[n7]);
                    continue;
                }
                intConsumer.accept(n7);
            }
        }
        return true;
    }

    private static boolean quadVisibleThrough(TQuad tQuad, TQuad tQuad2, Object2ReferenceMap<Vector3fc, float[]> object2ReferenceMap, Vector3fc vector3fc, boolean bl) {
        if (tQuad == tQuad2) {
            return false;
        }
        ModelQuadFacing modelQuadFacing = tQuad.getFacing();
        ModelQuadFacing modelQuadFacing2 = tQuad2.getFacing();
        boolean bl2 = false;
        if (modelQuadFacing != ModelQuadFacing.UNASSIGNED && modelQuadFacing2 != ModelQuadFacing.UNASSIGNED) {
            if (modelQuadFacing.getOpposite() == modelQuadFacing2) {
                return false;
            }
            if (modelQuadFacing == modelQuadFacing2) {
                int n = modelQuadFacing.getSign();
                int n2 = modelQuadFacing.ordinal();
                bl2 = (float)n * tQuad.getExtents()[n2] > (float)n * tQuad2.getExtents()[n2];
            } else {
                bl2 = TopoGraphSorting.orthogonalQuadVisibleThrough(tQuad, tQuad2, bl);
            }
        } else {
            float f = tQuad.getAccurateDotProduct();
            Vector3fc vector3fc2 = tQuad.getAccurateNormal();
            float[] fArray = tQuad2.getVertexPositions();
            boolean bl3 = false;
            int n = 0;
            for (int i = 0; i < 4; ++i) {
                if (!TopoGraphSorting.pointInsideHalfSpaceEpsilon(f, vector3fc2, fArray[n++], fArray[n++], fArray[n++])) continue;
                bl3 = true;
                break;
            }
            if (bl3) {
                float f2 = tQuad2.getAccurateDotProduct();
                Vector3fc vector3fc3 = tQuad2.getAccurateNormal();
                float[] fArray2 = tQuad.getVertexPositions();
                boolean bl4 = false;
                int n3 = 0;
                for (int i = 0; i < 4; ++i) {
                    if (!TopoGraphSorting.pointOutsideHalfSpaceEpsilon(f2, vector3fc3, fArray2[n3++], fArray2[n3++], fArray2[n3++])) continue;
                    bl4 = true;
                    break;
                }
                bl2 = bl4;
            }
        }
        if (bl2 && object2ReferenceMap != null) {
            return TopoGraphSorting.visibilityWithSeparator(tQuad, tQuad2, object2ReferenceMap, vector3fc);
        }
        return bl2;
    }

    private static boolean testSeparatorRange(Object2ReferenceMap<Vector3fc, float[]> object2ReferenceMap, Vector3fc vector3fc, float f, float f2) {
        float[] fArray = (float[])object2ReferenceMap.get((Object)vector3fc);
        if (fArray == null) {
            return false;
        }
        return NormalList.queryRange(fArray, f, f2);
    }

    private static boolean pointOutsideHalfSpace(float f, Vector3fc vector3fc, Vector3fc vector3fc2) {
        return vector3fc.dot(vector3fc2) > f;
    }

    private static boolean visibilityWithSeparator(TQuad tQuad, TQuad tQuad2, Object2ReferenceMap<Vector3fc, float[]> object2ReferenceMap, Vector3fc vector3fc) {
        for (int i = 0; i < ModelQuadFacing.DIRECTIONS; ++i) {
            Vector3fc vector3fc2;
            float f;
            float f2;
            ModelQuadFacing modelQuadFacing = ModelQuadFacing.VALUES[i];
            ModelQuadFacing modelQuadFacing2 = modelQuadFacing.getOpposite();
            int n = modelQuadFacing2.ordinal();
            int n2 = modelQuadFacing.getSign();
            float f3 = (float)n2 * tQuad2.getExtents()[i];
            if (f3 > (f2 = (float)n2 * tQuad.getExtents()[n]) || (f = (vector3fc2 = ModelQuadFacing.ALIGNED_NORMALS[i]).dot(vector3fc)) > f2 || !TopoGraphSorting.testSeparatorRange(object2ReferenceMap, vector3fc2, f3 = f, f2)) continue;
            return false;
        }
        return true;
    }
}

