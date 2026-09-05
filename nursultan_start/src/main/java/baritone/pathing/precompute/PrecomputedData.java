/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.pathing.movement.MovementHelper
 *  minecraft.class00500
 *  minecraft.class00891
 */
package baritone.pathing.precompute;

import baritone.pathing.movement.MovementHelper;
import baritone.pathing.precompute.Ternary;
import baritone.utils.BlockStateInterface;
import minecraft.class00500;
import minecraft.class00891;

public class PrecomputedData {
    private final byte[] data = new byte[class00891.U.L()];
    private static final byte COMPLETED_MASK = 1;
    private static final byte FULLY_PASSABLE_MAYBE_MASK = 2;
    private static final byte FULLY_PASSABLE_MASK = 4;
    private static final byte CAN_WALK_THROUGH_MAYBE_MASK = 8;
    private static final byte CAN_WALK_THROUGH_MASK = 16;
    private static final byte CAN_WALK_ON_MAYBE_MASK = 32;
    private static final byte CAN_WALK_ON_MASK = 64;

    public boolean canWalkOn(BlockStateInterface blockStateInterface, int n, int n2, int n3, class00500 class005002) {
        int n4 = class00891.U.N((Object)class005002);
        int n5 = this.data[n4];
        if ((n5 & 1) == 0) {
            n5 = this.fillData(n4, class005002);
        }
        if ((n5 & 0x20) != 0) {
            return MovementHelper.canWalkOnPosition((BlockStateInterface)blockStateInterface, (int)n, (int)n2, (int)n3, (class00500)class005002);
        }
        return (n5 & 0x40) != 0;
    }

    private int fillData(int n, class00500 class005002) {
        int n2 = 0;
        Ternary ternary = MovementHelper.canWalkOnBlockState((class00500)class005002);
        switch (ternary) {
            case YES: {
                n2 = (byte)(n2 | 0x40);
                break;
            }
            case MAYBE: {
                n2 = (byte)(n2 | 0x20);
            }
        }
        Ternary ternary2 = MovementHelper.canWalkThroughBlockState((class00500)class005002);
        switch (ternary2) {
            case YES: {
                n2 = (byte)(n2 | 0x10);
                break;
            }
            case MAYBE: {
                n2 = (byte)(n2 | 8);
            }
        }
        Ternary ternary3 = MovementHelper.fullyPassableBlockState((class00500)class005002);
        switch (ternary3) {
            case YES: {
                n2 = (byte)(n2 | 4);
                break;
            }
            case MAYBE: {
                n2 = (byte)(n2 | 2);
            }
        }
        this.data[n] = n2 = (int)((byte)(n2 | 1));
        return n2;
    }

    public boolean canWalkThrough(BlockStateInterface blockStateInterface, int n, int n2, int n3, class00500 class005002) {
        int n4 = class00891.U.N((Object)class005002);
        int n5 = this.data[n4];
        if ((n5 & 1) == 0) {
            n5 = this.fillData(n4, class005002);
        }
        if ((n5 & 8) != 0) {
            return MovementHelper.canWalkThroughPosition((BlockStateInterface)blockStateInterface, (int)n, (int)n2, (int)n3, (class00500)class005002);
        }
        return (n5 & 0x10) != 0;
    }

    public boolean fullyPassable(BlockStateInterface blockStateInterface, int n, int n2, int n3, class00500 class005002) {
        int n4 = class00891.U.N((Object)class005002);
        int n5 = this.data[n4];
        if ((n5 & 1) == 0) {
            n5 = this.fillData(n4, class005002);
        }
        if ((n5 & 2) != 0) {
            return MovementHelper.fullyPassablePosition((BlockStateInterface)blockStateInterface, (int)n, (int)n2, (int)n3, (class00500)class005002);
        }
        return (n5 & 4) != 0;
    }
}

