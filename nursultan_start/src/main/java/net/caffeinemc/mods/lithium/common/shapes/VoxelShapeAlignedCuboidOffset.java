/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 *  java.lang.MatchException
 *  minecraft.class00494
 *  minecraft.class00734
 *  minecraft.class04995
 *  minecraft.class07185
 *  minecraft.class07214
 *  minecraft.class07739
 */
package net.caffeinemc.mods.lithium.common.shapes;

import it.unimi.dsi.fastutil.doubles.DoubleList;
import minecraft.class00494;
import minecraft.class00734;
import minecraft.class04995;
import minecraft.class07185;
import minecraft.class07214;
import minecraft.class07739;
import net.caffeinemc.mods.lithium.common.shapes.VoxelShapeAlignedCuboid;
import net.caffeinemc.mods.lithium.common.shapes.lists.OffsetFractionalDoubleList;

public class VoxelShapeAlignedCuboidOffset
extends VoxelShapeAlignedCuboid {
    private final double xOffset;
    private final double yOffset;
    private final double zOffset;

    @Override
    public DoubleList method_1109(class07185 class071852) {
        return switch (class071852) {
            default -> throw new MatchException(null, null);
            case class07185.field_11048 -> new OffsetFractionalDoubleList(this.getXSegments(), this.xOffset);
            case class07185.field_11052 -> new OffsetFractionalDoubleList(this.getYSegments(), this.yOffset);
            case class07185.field_11051 -> new OffsetFractionalDoubleList(this.getZSegments(), this.zOffset);
        };
    }

    public VoxelShapeAlignedCuboidOffset(VoxelShapeAlignedCuboid voxelShapeAlignedCuboid, class07739 class077392, double d, double d2, double d3) {
        super(class077392, voxelShapeAlignedCuboid.minX + d, voxelShapeAlignedCuboid.minY + d2, voxelShapeAlignedCuboid.minZ + d3, voxelShapeAlignedCuboid.maxX + d, voxelShapeAlignedCuboid.maxY + d2, voxelShapeAlignedCuboid.maxZ + d3, voxelShapeAlignedCuboid.xyzResolution);
        if (voxelShapeAlignedCuboid instanceof VoxelShapeAlignedCuboidOffset) {
            this.xOffset = ((VoxelShapeAlignedCuboidOffset)voxelShapeAlignedCuboid).xOffset + d;
            this.yOffset = ((VoxelShapeAlignedCuboidOffset)voxelShapeAlignedCuboid).yOffset + d2;
            this.zOffset = ((VoxelShapeAlignedCuboidOffset)voxelShapeAlignedCuboid).zOffset + d3;
        } else {
            this.xOffset = d;
            this.yOffset = d2;
            this.zOffset = d3;
        }
    }

    private double calculatePenetration(class07214 class072142, class00734 class007342, double d) {
        switch (class072142) {
            case field_10962: {
                return VoxelShapeAlignedCuboidOffset.calculatePenetration(this.minX, this.maxX, this.getXSegments(), this.xOffset, class007342.N, class007342.u, d);
            }
            case field_10963: {
                return VoxelShapeAlignedCuboidOffset.calculatePenetration(this.minZ, this.maxZ, this.getZSegments(), this.zOffset, class007342.L, class007342.R, d);
            }
            case field_10965: {
                return VoxelShapeAlignedCuboidOffset.calculatePenetration(this.minY, this.maxY, this.getYSegments(), this.yOffset, class007342.y, class007342.i, d);
            }
        }
        throw new IllegalArgumentException();
    }

    private static double calculatePenetration(double d, double d2, int n, double d3, double d4, double d5, double d6) {
        if (d6 > 0.0) {
            double d7 = d - d5;
            if (d7 >= -1.0E-7) {
                return Math.min(d7, d6);
            }
            if (n == 1) {
                return d6;
            }
            int n2 = class04995.L((double)((d5 - 1.0E-6 - d3) * (double)n));
            double d8 = (double)n2 / (double)n + d3;
            if (d8 < d5 - 1.0E-7) {
                d8 = (double)(++n2) / (double)n + d3;
            }
            if (d8 < d2 - 1.0E-6) {
                return Math.min(d6, d8 - d5);
            }
            return d6;
        }
        double d9 = d2 - d4;
        if (d9 <= 1.0E-7) {
            return Math.max(d9, d6);
        }
        if (n == 1) {
            return d6;
        }
        int n3 = class04995.N((double)((d4 + 1.0E-6 - d3) * (double)n));
        double d10 = (double)n3 / (double)n + d3;
        if (d10 > d4 + 1.0E-7) {
            d10 = (double)(--n3) / (double)n + d3;
        }
        if (d10 > d + 1.0E-6) {
            return Math.max(d6, d10 - d4);
        }
        return d6;
    }

    @Override
    public int method_1100(class07185 class071852, double d) {
        int n;
        d = switch (class071852) {
            default -> throw new MatchException(null, null);
            case class07185.field_11048 -> {
                n = this.getXSegments();
                yield (d - this.xOffset) * (double)n;
            }
            case class07185.field_11052 -> {
                n = this.getYSegments();
                yield (d - this.yOffset) * (double)n;
            }
            case class07185.field_11051 -> {
                n = this.getZSegments();
                yield (d - this.zOffset) * (double)n;
            }
        };
        return class04995.N((int)class04995.N((double)d), (int)-1, (int)n);
    }

    @Override
    public double method_1099(class07185 class071852, int n) {
        return switch (class071852) {
            default -> throw new MatchException(null, null);
            case class07185.field_11048 -> this.xOffset + (double)n / (double)this.getXSegments();
            case class07185.field_11052 -> this.yOffset + (double)n / (double)this.getYSegments();
            case class07185.field_11051 -> this.zOffset + (double)n / (double)this.getZSegments();
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

