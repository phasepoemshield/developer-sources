/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 *  java.lang.MatchException
 *  minecraft.class00494
 *  minecraft.class00734
 *  minecraft.class04995
 *  minecraft.class06857
 *  minecraft.class07185
 *  minecraft.class07214
 *  minecraft.class07739
 */
package net.caffeinemc.mods.lithium.common.shapes;

import it.unimi.dsi.fastutil.doubles.DoubleList;
import minecraft.class00494;
import minecraft.class00734;
import minecraft.class04995;
import minecraft.class06857;
import minecraft.class07185;
import minecraft.class07214;
import minecraft.class07739;
import net.caffeinemc.mods.lithium.common.shapes.CuboidVoxelSet;
import net.caffeinemc.mods.lithium.common.shapes.VoxelShapeAlignedCuboidOffset;
import net.caffeinemc.mods.lithium.common.shapes.VoxelShapeSimpleCube;

public class VoxelShapeAlignedCuboid
extends VoxelShapeSimpleCube {
    static final double LARGE_EPSILON = 1.0E-6;
    protected final byte xyzResolution;

    @Override
    public DoubleList method_1109(class07185 class071852) {
        return switch (class071852) {
            default -> throw new MatchException(null, null);
            case class07185.field_11048 -> new class06857(this.getXSegments());
            case class07185.field_11052 -> new class06857(this.getYSegments());
            case class07185.field_11051 -> new class06857(this.getZSegments());
        };
    }

    public VoxelShapeAlignedCuboid(double d, double d2, double d3, double d4, double d5, double d6, int n, int n2, int n3) {
        super(new CuboidVoxelSet(1 << n, 1 << n2, 1 << n3, d, d2, d3, d4, d5, d6), d, d2, d3, d4, d5, d6);
        if (n > 3 || n2 > 3 || n3 > 3 || n < 0 || n2 < 0 || n3 < 0) {
            throw new IllegalArgumentException("Resolution must be between 0 and 3");
        }
        this.xyzResolution = (byte)(n << 4 | n2 << 2 | n3);
    }

    public VoxelShapeAlignedCuboid(class07739 class077392, double d, double d2, double d3, double d4, double d5, double d6, byte by) {
        super(class077392, d, d2, d3, d4, d5, d6);
        this.xyzResolution = by;
    }

    private static double calculatePenetration(double d, double d2, int n, double d3, double d4, double d5) {
        if (d5 > 0.0) {
            double d6 = d - d4;
            if (d6 >= -1.0E-7) {
                return Math.min(d6, d5);
            }
            if (n == 1) {
                return d5;
            }
            double d7 = (double)class04995.L((double)((d4 - 1.0E-7) * (double)n)) / (double)n;
            if (d7 < d2 - 1.0E-6) {
                return Math.min(d5, d7 - d4);
            }
            return d5;
        }
        double d8 = d2 - d3;
        if (d8 <= 1.0E-7) {
            return Math.max(d8, d5);
        }
        if (n == 1) {
            return d5;
        }
        double d9 = (double)class04995.N((double)((d3 + 1.0E-7) * (double)n)) / (double)n;
        if (d9 > d + 1.0E-6) {
            return Math.max(d5, d9 - d3);
        }
        return d5;
    }

    private double calculatePenetration(class07214 class072142, class00734 class007342, double d) {
        switch (class072142) {
            case field_10962: {
                return VoxelShapeAlignedCuboid.calculatePenetration(this.minX, this.maxX, this.getXSegments(), class007342.N, class007342.u, d);
            }
            case field_10963: {
                return VoxelShapeAlignedCuboid.calculatePenetration(this.minZ, this.maxZ, this.getZSegments(), class007342.L, class007342.R, d);
            }
            case field_10965: {
                return VoxelShapeAlignedCuboid.calculatePenetration(this.minY, this.maxY, this.getYSegments(), class007342.y, class007342.i, d);
            }
        }
        throw new IllegalArgumentException();
    }

    protected int getXSegments() {
        return 1 << (this.xyzResolution >>> 4);
    }

    protected int getZSegments() {
        return 1 << (this.xyzResolution & 3);
    }

    protected int getYSegments() {
        return 1 << (this.xyzResolution >>> 2 & 3);
    }

    @Override
    public int method_1100(class07185 class071852, double d) {
        int n = switch (class071852) {
            default -> throw new MatchException(null, null);
            case class07185.field_11048 -> this.getXSegments();
            case class07185.field_11052 -> this.getYSegments();
            case class07185.field_11051 -> this.getZSegments();
        };
        return class04995.N((int)class04995.N((double)(d * (double)n)), (int)-1, (int)n);
    }

    @Override
    public double method_1099(class07185 class071852, int n) {
        return switch (class071852) {
            default -> throw new MatchException(null, null);
            case class07185.field_11048 -> (double)n / (double)this.getXSegments();
            case class07185.field_11052 -> (double)n / (double)this.getYSegments();
            case class07185.field_11051 -> (double)n / (double)this.getZSegments();
        };
    }

    @Override
    public double method_1103(class07214 class072142, class00734 class007342, double d) {
        if (Math.abs(d) < 1.0E-7) {
            return 0.0;
        }
        double d2 = this.calculatePenetration(class072142, class007342, d);
        if (d2 != d && this.intersects(class072142, class007342)) {
            return d2;
        }
        return d;
    }

    @Override
    public class00494 method_1096(double d, double d2, double d3) {
        return new VoxelShapeAlignedCuboidOffset(this, this.field_1401, d, d2, d3);
    }
}

