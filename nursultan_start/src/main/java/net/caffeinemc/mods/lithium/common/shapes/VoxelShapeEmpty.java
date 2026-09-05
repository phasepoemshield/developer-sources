/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleArrayList
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 *  minecraft.class00494
 *  minecraft.class00734
 *  minecraft.class07185
 *  minecraft.class07214
 *  minecraft.class07739
 */
package net.caffeinemc.mods.lithium.common.shapes;

import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import minecraft.class00494;
import minecraft.class00734;
import minecraft.class07185;
import minecraft.class07214;
import minecraft.class07739;
import net.caffeinemc.mods.lithium.common.shapes.VoxelShapeCaster;

public class VoxelShapeEmpty
extends class00494
implements VoxelShapeCaster {
    private static final DoubleList EMPTY_LIST = DoubleArrayList.wrap((double[])new double[]{0.0});

    public DoubleList method_1109(class07185 class071852) {
        return EMPTY_LIST;
    }

    public VoxelShapeEmpty(class07739 class077392) {
        super(class077392);
    }

    @Override
    public boolean intersects(class00734 class007342, double d, double d2, double d3) {
        return false;
    }

    public boolean method_1110() {
        return true;
    }

    public double method_1105(class07185 class071852) {
        return Double.NEGATIVE_INFINITY;
    }

    public double method_1091(class07185 class071852) {
        return Double.POSITIVE_INFINITY;
    }

    public double method_1103(class07214 class072142, class00734 class007342, double d) {
        return d;
    }
}

