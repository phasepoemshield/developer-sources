/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01296
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortType
 *  net.caffeinemc.mods.sodium.client.util.MathUtil
 *  net.caffeinemc.mods.sodium.client.util.sorting.RadixSort
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data;

import java.nio.IntBuffer;
import minecraft.class01296;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortType;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.PresentTranslucentData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.Sorter;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.StaticSorter;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.TQuad;
import net.caffeinemc.mods.sodium.client.util.MathUtil;
import net.caffeinemc.mods.sodium.client.util.sorting.RadixSort;

public class StaticNormalRelativeData
extends PresentTranslucentData {
    private Sorter sorterOnce;

    public StaticNormalRelativeData(class01296 class012962, int n) {
        super(class012962, n);
    }

    @Override
    public SortType getSortType() {
        return SortType.STATIC_NORMAL_RELATIVE;
    }

    public static StaticNormalRelativeData fromMesh(int[] nArray, TQuad[] tQuadArray, class01296 class012962, boolean bl) {
        if (bl) {
            return StaticNormalRelativeData.fromDoubleUnaligned(tQuadArray, class012962);
        }
        return StaticNormalRelativeData.fromMixed(nArray, tQuadArray, class012962);
    }

    private static StaticNormalRelativeData fromMixed(int[] nArray, TQuad[] tQuadArray, class01296 class012962) {
        StaticNormalRelativeData staticNormalRelativeData = new StaticNormalRelativeData(class012962, tQuadArray.length);
        StaticSorter staticSorter = new StaticSorter(tQuadArray.length);
        staticNormalRelativeData.sorterOnce = staticSorter;
        IntBuffer intBuffer = staticSorter.getIntBuffer();
        int n = 0;
        for (int n2 : nArray) {
            if (n2 == -1) continue;
            n = Math.max(n, n2);
        }
        int n3 = 0;
        for (int n4 : nArray) {
            int n5;
            if (n4 == -1 || n4 == 0) continue;
            if (n4 == 1) {
                TranslucentData.writeQuadVertexIndexes(intBuffer, 0);
                ++n3;
                continue;
            }
            int[] nArray2 = new int[n4];
            int[] nArray3 = new int[n4];
            for (n5 = 0; n5 < n4; ++n5) {
                nArray2[n5] = MathUtil.floatToComparableInt((float)tQuadArray[n3++].getAccurateDotProduct());
                nArray3[n5] = n5;
            }
            RadixSort.sortIndirect((int[])nArray3, (int[])nArray2, (boolean)false);
            for (n5 = 0; n5 < n4; ++n5) {
                TranslucentData.writeQuadVertexIndexes(intBuffer, nArray3[n5]);
            }
        }
        return staticNormalRelativeData;
    }

    @Override
    public Sorter getSorter() {
        Sorter sorter = this.sorterOnce;
        if (sorter == null) {
            throw new IllegalStateException("Sorter already used!");
        }
        this.sorterOnce = null;
        return sorter;
    }

    private static StaticNormalRelativeData fromDoubleUnaligned(TQuad[] tQuadArray, class01296 class012962) {
        StaticNormalRelativeData staticNormalRelativeData = new StaticNormalRelativeData(class012962, tQuadArray.length);
        StaticSorter staticSorter = new StaticSorter(tQuadArray.length);
        staticNormalRelativeData.sorterOnce = staticSorter;
        IntBuffer intBuffer = staticSorter.getIntBuffer();
        if (tQuadArray.length <= 1) {
            TranslucentData.writeQuadVertexIndexes(intBuffer, 0);
        } else {
            int n;
            int[] nArray = new int[tQuadArray.length];
            int[] nArray2 = new int[tQuadArray.length];
            for (n = 0; n < tQuadArray.length; ++n) {
                nArray[n] = MathUtil.floatToComparableInt((float)tQuadArray[n].getAccurateDotProduct());
                nArray2[n] = n;
            }
            RadixSort.sortIndirect((int[])nArray2, (int[])nArray, (boolean)false);
            for (n = 0; n < tQuadArray.length; ++n) {
                TranslucentData.writeQuadVertexIndexes(intBuffer, nArray2[n]);
            }
        }
        return staticNormalRelativeData;
    }
}

