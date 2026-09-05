/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class04995
 *  minecraft.class07211
 *  net.caffeinemc.mods.sodium.api.util.NormI8
 *  net.caffeinemc.mods.sodium.client.util.DirectionUtil
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.model.quad.properties;

import java.util.Arrays;
import minecraft.class04995;
import minecraft.class07211;
import net.caffeinemc.mods.sodium.api.util.NormI8;
import net.caffeinemc.mods.sodium.client.util.DirectionUtil;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public enum ModelQuadFacing {
    POS_X,
    POS_Y,
    POS_Z,
    NEG_X,
    NEG_Y,
    NEG_Z,
    UNASSIGNED;

    public static final ModelQuadFacing[] VALUES;
    public static final int COUNT;
    public static final int DIRECTIONS;
    public static final int UNASSIGNED_ORDINAL;
    public static final int NONE = 0;
    public static final int ALL;
    public static final Vector3fc[] ALIGNED_NORMALS;
    public static final int[] PACKED_ALIGNED_NORMALS;
    public static final int OPPOSING_X;
    public static final int OPPOSING_Y;
    public static final int OPPOSING_Z;
    public static final int UNASSIGNED_MASK;

    public Vector3fc getAlignedNormal() {
        if (!this.isAligned()) {
            throw new IllegalStateException("Cannot get aligned normal for unassigned facing");
        }
        return ALIGNED_NORMALS[this.ordinal()];
    }

    public ModelQuadFacing getOpposite() {
        return switch (this.ordinal()) {
            case 1 -> NEG_Y;
            case 4 -> POS_Y;
            case 0 -> NEG_X;
            case 3 -> POS_X;
            case 2 -> NEG_Z;
            case 5 -> POS_Z;
            default -> UNASSIGNED;
        };
    }

    public int getPackedAlignedNormal() {
        if (!this.isAligned()) {
            throw new IllegalStateException("Cannot get packed aligned normal for unassigned facing");
        }
        return PACKED_ALIGNED_NORMALS[this.ordinal()];
    }

    public static boolean bitmapIsOpposingAligned(int n) {
        return n == OPPOSING_X || n == OPPOSING_Y || n == OPPOSING_Z;
    }

    public static boolean bitmapHasUnassigned(int n) {
        return (n & UNASSIGNED_MASK) != 0;
    }

    public int getSign() {
        return switch (this.ordinal()) {
            case 0, 1, 2 -> 1;
            case 3, 4, 5 -> -1;
            default -> 0;
        };
    }

    public boolean isAligned() {
        return this != UNASSIGNED;
    }

    public static ModelQuadFacing fromNormal(Vector3fc vector3fc) {
        for (class07211 class072112 : DirectionUtil.ALL_DIRECTIONS) {
            Vector3f vector3f = class072112.B();
            if (!vector3f.equals(vector3fc, 1.0E-5f)) continue;
            return ModelQuadFacing.fromDirection(class072112);
        }
        return UNASSIGNED;
    }

    public static ModelQuadFacing fromNormal(float f, float f2, float f3) {
        for (class07211 class072112 : DirectionUtil.ALL_DIRECTIONS) {
            Vector3f vector3f = class072112.B();
            if (!class04995.y((float)f, (float)vector3f.x()) || !class04995.y((float)f2, (float)vector3f.y()) || !class04995.y((float)f3, (float)vector3f.z())) continue;
            return ModelQuadFacing.fromDirection(class072112);
        }
        return UNASSIGNED;
    }

    public int getAxis() {
        return switch (this.ordinal()) {
            case 0, 3 -> 0;
            case 1, 4 -> 1;
            case 2, 5 -> 2;
            default -> -1;
        };
    }

    public static ModelQuadFacing fromPackedNormal(int n) {
        return ModelQuadFacing.fromNormal(NormI8.unpackX((int)n), NormI8.unpackY((int)n), NormI8.unpackZ((int)n));
    }

    public static ModelQuadFacing fromDirection(class07211 class072112) {
        return switch (class072112) {
            default -> throw new MatchException(null, null);
            case class07211.field_11033 -> NEG_Y;
            case class07211.field_11036 -> POS_Y;
            case class07211.field_11043 -> NEG_Z;
            case class07211.field_11035 -> POS_Z;
            case class07211.field_11039 -> NEG_X;
            case class07211.field_11034 -> POS_X;
        };
    }

    static {
        VALUES = ModelQuadFacing.values();
        COUNT = VALUES.length;
        DIRECTIONS = VALUES.length - 1;
        UNASSIGNED_ORDINAL = UNASSIGNED.ordinal();
        ALL = (1 << COUNT) - 1;
        ALIGNED_NORMALS = new Vector3fc[]{new Vector3f(1.0f, 0.0f, 0.0f), new Vector3f(0.0f, 1.0f, 0.0f), new Vector3f(0.0f, 0.0f, 1.0f), new Vector3f(-1.0f, 0.0f, 0.0f), new Vector3f(0.0f, -1.0f, 0.0f), new Vector3f(0.0f, 0.0f, -1.0f)};
        PACKED_ALIGNED_NORMALS = Arrays.stream(ALIGNED_NORMALS).mapToInt(NormI8::pack).toArray();
        OPPOSING_X = 1 << POS_X.ordinal() | 1 << NEG_X.ordinal();
        OPPOSING_Y = 1 << POS_Y.ordinal() | 1 << NEG_Y.ordinal();
        OPPOSING_Z = 1 << POS_Z.ordinal() | 1 << NEG_Z.ordinal();
        UNASSIGNED_MASK = 1 << UNASSIGNED.ordinal();
    }
}

