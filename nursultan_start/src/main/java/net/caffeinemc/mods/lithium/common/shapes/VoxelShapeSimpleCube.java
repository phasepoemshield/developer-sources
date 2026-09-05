/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.doubles.DoubleArrayList
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 *  minecraft.class00406
 *  minecraft.class00494
 *  minecraft.class00734
 *  minecraft.class07185
 *  minecraft.class07214
 *  minecraft.class07739
 */
package net.caffeinemc.mods.lithium.common.shapes;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.List;
import minecraft.class00406;
import minecraft.class00494;
import minecraft.class00734;
import minecraft.class07185;
import minecraft.class07214;
import minecraft.class07739;
import net.caffeinemc.mods.lithium.common.shapes.VoxelShapeCaster;

public class VoxelShapeSimpleCube
extends class00494
implements VoxelShapeCaster {
    static final double EPSILON = 1.0E-7;
    final double minX;
    final double minY;
    final double minZ;
    final double maxX;
    final double maxY;
    final double maxZ;
    public final boolean isTiny;

    public DoubleList method_1109(class07185 class071852) {
        switch (class071852) {
            case field_11048: {
                return DoubleArrayList.wrap((double[])new double[]{this.minX, this.maxX});
            }
            case field_11052: {
                return DoubleArrayList.wrap((double[])new double[]{this.minY, this.maxY});
            }
            case field_11051: {
                return DoubleArrayList.wrap((double[])new double[]{this.minZ, this.maxZ});
            }
        }
        throw new IllegalArgumentException();
    }

    public VoxelShapeSimpleCube(class07739 class077392, double d, double d2, double d3, double d4, double d5, double d6) {
        super(class077392);
        this.minX = d;
        this.minY = d2;
        this.minZ = d3;
        this.maxX = d4;
        this.maxY = d5;
        this.maxZ = d6;
        this.isTiny = this.minX + 3.0E-7 >= this.maxX || this.minY + 3.0E-7 >= this.maxY || this.minZ + 3.0E-7 >= this.maxZ;
    }

    @Override
    public boolean intersects(class00734 class007342, double d, double d2, double d3) {
        return class007342.N + 1.0E-7 < this.maxX + d && class007342.u - 1.0E-7 > this.minX + d && class007342.y + 1.0E-7 < this.maxY + d2 && class007342.i - 1.0E-7 > this.minY + d2 && class007342.L + 1.0E-7 < this.maxZ + d3 && class007342.R - 1.0E-7 > this.minZ + d3;
    }

    boolean intersects(class07214 class072142, class00734 class007342) {
        switch (class072142) {
            case field_10962: {
                return VoxelShapeSimpleCube.lessThan(this.minY, class007342.i) && VoxelShapeSimpleCube.lessThan(class007342.y, this.maxY) && VoxelShapeSimpleCube.lessThan(this.minZ, class007342.R) && VoxelShapeSimpleCube.lessThan(class007342.L, this.maxZ);
            }
            case field_10963: {
                return VoxelShapeSimpleCube.lessThan(this.minX, class007342.u) && VoxelShapeSimpleCube.lessThan(class007342.N, this.maxX) && VoxelShapeSimpleCube.lessThan(this.minY, class007342.i) && VoxelShapeSimpleCube.lessThan(class007342.y, this.maxY);
            }
            case field_10965: {
                return VoxelShapeSimpleCube.lessThan(this.minZ, class007342.R) && VoxelShapeSimpleCube.lessThan(class007342.L, this.maxZ) && VoxelShapeSimpleCube.lessThan(this.minX, class007342.u) && VoxelShapeSimpleCube.lessThan(class007342.N, this.maxX);
            }
        }
        throw new IllegalArgumentException();
    }

    private double calculatePenetration(class07214 class072142, class00734 class007342, double d) {
        switch (class072142) {
            case field_10962: {
                return VoxelShapeSimpleCube.calculatePenetration(this.minX, this.maxX, class007342.N, class007342.u, d);
            }
            case field_10963: {
                return VoxelShapeSimpleCube.calculatePenetration(this.minZ, this.maxZ, class007342.L, class007342.R, d);
            }
            case field_10965: {
                return VoxelShapeSimpleCube.calculatePenetration(this.minY, this.maxY, class007342.y, class007342.i, d);
            }
        }
        throw new IllegalArgumentException();
    }

    private static double calculatePenetration(double d, double d2, double d3, double d4, double d5) {
        double d6;
        if (d5 > 0.0 ? (d6 = d - d4) < -1.0E-7 || d5 < d6 : (d6 = d2 - d3) > 1.0E-7 || d5 > d6) {
            return d5;
        }
        return d6;
    }

    public List<class00734> method_1090() {
        return Lists.newArrayList((Object[])new class00734[]{this.method_1107()});
    }

    public boolean method_1110() {
        return this.minX >= this.maxX || this.minY >= this.maxY || this.minZ >= this.maxZ;
    }

    public class00734 method_1107() {
        return new class00734(this.minX, this.minY, this.minZ, this.maxX, this.maxY, this.maxZ);
    }

    public double method_1105(class07185 class071852) {
        return class071852.N(this.maxX, this.maxY, this.maxZ);
    }

    public int method_1100(class07185 class071852, double d) {
        if (d < this.method_1091(class071852)) {
            return -1;
        }
        if (d >= this.method_1105(class071852)) {
            return 1;
        }
        return 0;
    }

    public double method_1099(class07185 class071852, int n) {
        if (n < 0 || n > 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        switch (class071852) {
            case field_11048: {
                return n == 0 ? this.minX : this.maxX;
            }
            case field_11052: {
                return n == 0 ? this.minY : this.maxY;
            }
            case field_11051: {
                return n == 0 ? this.minZ : this.maxZ;
            }
        }
        throw new IllegalArgumentException();
    }

    public double method_1091(class07185 class071852) {
        return class071852.N(this.minX, this.minY, this.minZ);
    }

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

    public void method_1089(class00406 class004062) {
        class004062.consume(this.minX, this.minY, this.minZ, this.maxX, this.maxY, this.maxZ);
    }

    public class00494 method_1096(double d, double d2, double d3) {
        return new VoxelShapeSimpleCube(this.field_1401, this.minX + d, this.minY + d2, this.minZ + d3, this.maxX + d, this.maxY + d2, this.maxZ + d3);
    }

    private static boolean lessThan(double d, double d2) {
        return d + 1.0E-7 < d2;
    }
}

