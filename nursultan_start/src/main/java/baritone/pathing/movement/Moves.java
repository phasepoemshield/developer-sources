/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.BetterBlockPos
 *  baritone.utils.pathing.MutableMoveResult
 */
package baritone.pathing.movement;

import baritone.api.utils.BetterBlockPos;
import baritone.pathing.movement.CalculationContext;
import baritone.pathing.movement.Movement;
import baritone.pathing.movement.Moves$1;
import baritone.pathing.movement.Moves$10;
import baritone.pathing.movement.Moves$11;
import baritone.pathing.movement.Moves$12;
import baritone.pathing.movement.Moves$13;
import baritone.pathing.movement.Moves$14;
import baritone.pathing.movement.Moves$15;
import baritone.pathing.movement.Moves$16;
import baritone.pathing.movement.Moves$17;
import baritone.pathing.movement.Moves$18;
import baritone.pathing.movement.Moves$19;
import baritone.pathing.movement.Moves$2;
import baritone.pathing.movement.Moves$20;
import baritone.pathing.movement.Moves$21;
import baritone.pathing.movement.Moves$22;
import baritone.pathing.movement.Moves$3;
import baritone.pathing.movement.Moves$4;
import baritone.pathing.movement.Moves$5;
import baritone.pathing.movement.Moves$6;
import baritone.pathing.movement.Moves$7;
import baritone.pathing.movement.Moves$8;
import baritone.pathing.movement.Moves$9;
import baritone.utils.pathing.MutableMoveResult;

public abstract sealed class Moves
extends Enum<Moves>
permits Moves$1, Moves$2, Moves$3, Moves$4, Moves$5, Moves$6, Moves$7, Moves$8, Moves$9, Moves$10, Moves$11, Moves$12, Moves$13, Moves$14, Moves$15, Moves$16, Moves$17, Moves$18, Moves$19, Moves$20, Moves$21, Moves$22 {
    public static final /* enum */ Moves DOWNWARD = new Moves$1(0, -1, 0);
    public static final /* enum */ Moves PILLAR = new Moves$2(0, 1, 0);
    public static final /* enum */ Moves TRAVERSE_NORTH = new Moves$3(0, 0, -1);
    public static final /* enum */ Moves TRAVERSE_SOUTH = new Moves$4(0, 0, 1);
    public static final /* enum */ Moves TRAVERSE_EAST = new Moves$5(1, 0, 0);
    public static final /* enum */ Moves TRAVERSE_WEST = new Moves$6(-1, 0, 0);
    public static final /* enum */ Moves ASCEND_NORTH = new Moves$7(0, 1, -1);
    public static final /* enum */ Moves ASCEND_SOUTH = new Moves$8(0, 1, 1);
    public static final /* enum */ Moves ASCEND_EAST = new Moves$9(1, 1, 0);
    public static final /* enum */ Moves ASCEND_WEST = new Moves$10(-1, 1, 0);
    public static final /* enum */ Moves DESCEND_EAST = new Moves$11(1, -1, 0, false, true);
    public static final /* enum */ Moves DESCEND_WEST = new Moves$12(-1, -1, 0, false, true);
    public static final /* enum */ Moves DESCEND_NORTH = new Moves$13(0, -1, -1, false, true);
    public static final /* enum */ Moves DESCEND_SOUTH = new Moves$14(0, -1, 1, false, true);
    public static final /* enum */ Moves DIAGONAL_NORTHEAST = new Moves$15(1, 0, -1, false, true);
    public static final /* enum */ Moves DIAGONAL_NORTHWEST = new Moves$16(-1, 0, -1, false, true);
    public static final /* enum */ Moves DIAGONAL_SOUTHEAST = new Moves$17(1, 0, 1, false, true);
    public static final /* enum */ Moves DIAGONAL_SOUTHWEST = new Moves$18(-1, 0, 1, false, true);
    public static final /* enum */ Moves PARKOUR_NORTH = new Moves$19(0, 0, -4, true, true);
    public static final /* enum */ Moves PARKOUR_SOUTH = new Moves$20(0, 0, 4, true, true);
    public static final /* enum */ Moves PARKOUR_EAST = new Moves$21(4, 0, 0, true, true);
    public static final /* enum */ Moves PARKOUR_WEST = new Moves$22(-4, 0, 0, true, true);
    public final boolean dynamicXZ;
    public final boolean dynamicY;
    public final int xOffset;
    public final int yOffset;
    public final int zOffset;
    private static final /* synthetic */ Moves[] $VALUES;

    Moves(int n2, int n3, int n4) {
        this(n2, n3, n4, false, false);
    }

    Moves(int n2, int n3, int n4, boolean bl, boolean bl2) {
        this.xOffset = n2;
        this.yOffset = n3;
        this.zOffset = n4;
        this.dynamicXZ = bl;
        this.dynamicY = bl2;
    }

    static {
        $VALUES = Moves.$values();
    }

    public static Moves[] values() {
        return (Moves[])$VALUES.clone();
    }

    public static Moves valueOf(String string) {
        return Enum.valueOf(Moves.class, string);
    }

    public void apply(CalculationContext calculationContext, int n, int n2, int n3, MutableMoveResult mutableMoveResult) {
        if (this.dynamicXZ || this.dynamicY) {
            throw new UnsupportedOperationException("Movements with dynamic offset must override `apply`");
        }
        mutableMoveResult.x = n + this.xOffset;
        mutableMoveResult.y = n2 + this.yOffset;
        mutableMoveResult.z = n3 + this.zOffset;
        mutableMoveResult.cost = this.cost(calculationContext, n, n2, n3);
    }

    private static /* synthetic */ Moves[] $values() {
        return new Moves[]{DOWNWARD, PILLAR, TRAVERSE_NORTH, TRAVERSE_SOUTH, TRAVERSE_EAST, TRAVERSE_WEST, ASCEND_NORTH, ASCEND_SOUTH, ASCEND_EAST, ASCEND_WEST, DESCEND_EAST, DESCEND_WEST, DESCEND_NORTH, DESCEND_SOUTH, DIAGONAL_NORTHEAST, DIAGONAL_NORTHWEST, DIAGONAL_SOUTHEAST, DIAGONAL_SOUTHWEST, PARKOUR_NORTH, PARKOUR_SOUTH, PARKOUR_EAST, PARKOUR_WEST};
    }

    public double cost(CalculationContext calculationContext, int n, int n2, int n3) {
        throw new UnsupportedOperationException("Movements must override `cost` or `apply`");
    }

    public abstract Movement apply0(CalculationContext var1, BetterBlockPos var2);
}

