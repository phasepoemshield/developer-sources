/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleArrayList
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 *  java.lang.MatchException
 *  minecraft.class00494
 *  minecraft.class07185
 *  minecraft.class07536
 *  minecraft.class07739
 *  net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.collisions.empty_space.ArrayVoxelShapeInvoker
 */
package minecraft;

import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;
import minecraft.class00494;
import minecraft.class07185;
import minecraft.class07536;
import minecraft.class07739;
import net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.collisions.empty_space.ArrayVoxelShapeInvoker;

public class class06864
extends class00494
implements ArrayVoxelShapeInvoker {
    private final DoubleList N;
    private final DoubleList y;
    private final DoubleList L;

    public DoubleList method_1109(class07185 class071852) {
        return switch (class071852) {
            default -> throw new MatchException(null, null);
            case class07185.field_11048 -> this.N;
            case class07185.field_11052 -> this.y;
            case class07185.field_11051 -> this.L;
        };
    }

    protected class06864(class07739 class077392, double[] dArray, double[] dArray2, double[] dArray3) {
        this(class077392, (DoubleList)DoubleArrayList.wrap((double[])Arrays.copyOf(dArray, class077392.method_1050() + 1)), (DoubleList)DoubleArrayList.wrap((double[])Arrays.copyOf(dArray2, class077392.method_1047() + 1)), (DoubleList)DoubleArrayList.wrap((double[])Arrays.copyOf(dArray3, class077392.method_1048() + 1)));
    }

    class06864(class07739 class077392, DoubleList doubleList, DoubleList doubleList2, DoubleList doubleList3) {
        super(class077392);
        int n = class077392.method_1050() + 1;
        int n2 = class077392.method_1047() + 1;
        int n3 = class077392.method_1048() + 1;
        if (n != doubleList.size() || n2 != doubleList2.size() || n3 != doubleList3.size()) {
            throw (IllegalArgumentException)class07536.y((Throwable)new IllegalArgumentException("Lengths of point arrays must be consistent with the size of the VoxelShape."));
        }
        this.N = doubleList;
        this.y = doubleList2;
        this.L = doubleList3;
    }

    public static /* synthetic */ class06864 N(class07739 class077392, DoubleList doubleList, DoubleList doubleList2, DoubleList doubleList3) {
        return new class06864(class077392, doubleList, doubleList2, doubleList3);
    }
}

