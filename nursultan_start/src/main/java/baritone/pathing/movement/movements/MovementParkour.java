/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.IBaritone
 *  baritone.api.pathing.movement.MovementStatus
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.IPlayerContext
 *  baritone.api.utils.input.Input
 *  baritone.utils.BlockStateInterface
 *  baritone.utils.pathing.MutableMoveResult
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class04644
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07746
 */
package baritone.pathing.movement.movements;

import baritone.Baritone;
import baritone.api.IBaritone;
import baritone.api.pathing.movement.MovementStatus;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.input.Input;
import baritone.pathing.movement.CalculationContext;
import baritone.pathing.movement.Movement;
import baritone.pathing.movement.MovementHelper;
import baritone.pathing.movement.MovementHelper$PlaceResult;
import baritone.pathing.movement.MovementState;
import baritone.utils.BlockStateInterface;
import baritone.utils.pathing.MutableMoveResult;
import java.util.HashSet;
import java.util.Set;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class04644;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07746;

public class MovementParkour
extends Movement {
    private static final BetterBlockPos[] EMPTY = new BetterBlockPos[0];
    private final class07211 direction;
    private final int dist;
    private final boolean ascend;

    private MovementParkour(IBaritone iBaritone, BetterBlockPos betterBlockPos, int n, class07211 class072112, boolean bl) {
        super(iBaritone, betterBlockPos, betterBlockPos.relative(class072112, n).above(bl ? 1 : 0), EMPTY, betterBlockPos.relative(class072112, n).below(bl ? 0 : 1));
        this.direction = class072112;
        this.dist = n;
        this.ascend = bl;
    }

    public static MovementParkour cost(CalculationContext calculationContext, BetterBlockPos betterBlockPos, class07211 class072112) {
        MutableMoveResult mutableMoveResult = new MutableMoveResult();
        MovementParkour.cost(calculationContext, betterBlockPos.x, betterBlockPos.y, betterBlockPos.z, class072112, mutableMoveResult);
        int n = Math.abs(mutableMoveResult.x - betterBlockPos.x) + Math.abs(mutableMoveResult.z - betterBlockPos.z);
        return new MovementParkour(calculationContext.getBaritone(), betterBlockPos, n, class072112, mutableMoveResult.y > betterBlockPos.y);
    }

    public static void cost(CalculationContext calculationContext, int n, int n2, int n3, class07211 class072112, MutableMoveResult mutableMoveResult) {
        class00500 class005002;
        int n4;
        int n5;
        int n6;
        if (!calculationContext.allowParkour) {
            return;
        }
        if (!calculationContext.allowJumpAtBuildLimit && n2 >= calculationContext.world.method_31600()) {
            return;
        }
        int n7 = class072112.P();
        if (!MovementHelper.fullyPassable(calculationContext, n + n7, n2, n3 + (n6 = class072112.T()))) {
            return;
        }
        class00500 class005003 = calculationContext.get(n + n7, n2 - 1, n3 + n6);
        if (MovementHelper.canWalkOn(calculationContext, n + n7, n2 - 1, n3 + n6, class005003)) {
            return;
        }
        if (MovementHelper.avoidWalkingInto(class005003) && !(class005003.Y().N() instanceof class04644)) {
            return;
        }
        if (!MovementHelper.fullyPassable(calculationContext, n + n7, n2 + 1, n3 + n6)) {
            return;
        }
        if (!MovementHelper.fullyPassable(calculationContext, n + n7, n2 + 2, n3 + n6)) {
            return;
        }
        if (!MovementHelper.fullyPassable(calculationContext, n, n2 + 2, n3)) {
            return;
        }
        class00500 class005004 = calculationContext.get(n, n2 - 1, n3);
        if (class005004.i() == class00869.Rc || class005004.i() == class00869.uW || class005004.i() instanceof class07746 || MovementHelper.isBottomSlab(class005004)) {
            return;
        }
        if (calculationContext.assumeWalkOnWater && !class005004.Y().W()) {
            return;
        }
        if (!calculationContext.get(n, n2, n3).Y().W()) {
            return;
        }
        int n8 = calculationContext.allowWalkOnMagmaBlocks && class005004.N(class00869.EI) ? 2 : (class005004.i() == class00869.iw ? 2 : (calculationContext.canSprint ? 4 : 3));
        int n9 = 1;
        int n10 = 2;
        while (n10 <= n8 && MovementHelper.fullyPassable(calculationContext, n5 = n + n7 * n10, n2 + 1, n4 = n3 + n6 * n10) && MovementHelper.fullyPassable(calculationContext, n5, n2 + 2, n4)) {
            class005002 = calculationContext.bsi.get0(n5, n2, n4);
            if (!MovementHelper.fullyPassable(calculationContext, n5, n2, n4, class005002)) {
                if (n10 > 3 || !calculationContext.allowParkourAscend || !calculationContext.canSprint || !MovementHelper.canWalkOn(calculationContext, n5, n2, n4, class005002) || !MovementParkour.checkOvershootSafety(calculationContext.bsi, n5 + n7, n2 + 1, n4 + n6)) break;
                mutableMoveResult.x = n5;
                mutableMoveResult.y = n2 + 1;
                mutableMoveResult.z = n4;
                mutableMoveResult.cost = (double)n10 * 3.563791874554526 + calculationContext.jumpPenalty;
                return;
            }
            class00500 class005005 = calculationContext.bsi.get0(n5, n2 - 1, n4);
            if (class005005.i() != class00869.Lr && MovementHelper.canWalkOn(calculationContext, n5, n2 - 1, n4, class005005) || Math.min(16, calculationContext.frostWalker + 2) >= n10 && MovementHelper.canUseFrostWalker(calculationContext, class005005)) {
                if (!MovementParkour.checkOvershootSafety(calculationContext.bsi, n5 + n7, n2, n4 + n6)) break;
                mutableMoveResult.x = n5;
                mutableMoveResult.y = n2;
                mutableMoveResult.z = n4;
                mutableMoveResult.cost = MovementParkour.costFromJumpDistance(n10) + calculationContext.jumpPenalty;
                return;
            }
            if (!MovementHelper.fullyPassable(calculationContext, n5, n2 + 3, n4)) break;
            n9 = n10++;
        }
        if (!calculationContext.allowParkourPlace) {
            return;
        }
        for (n10 = n9; n10 > 1; --n10) {
            n5 = n + n10 * n7;
            n4 = n3 + n10 * n6;
            class005002 = calculationContext.get(n5, n2 - 1, n4);
            double d = calculationContext.costOfPlacingAt(n5, n2 - 1, n4, class005002);
            if (d >= 1000000.0 || !MovementHelper.isReplaceable(n5, n2 - 1, n4, class005002, calculationContext.bsi) || !MovementParkour.checkOvershootSafety(calculationContext.bsi, n5 + n7, n2, n4 + n6)) continue;
            for (int i = 0; i < 5; ++i) {
                int n11 = n5 + HORIZONTALS_BUT_ALSO_DOWN_____SO_EVERY_DIRECTION_EXCEPT_UP[i].P();
                int n12 = n2 - 1 + HORIZONTALS_BUT_ALSO_DOWN_____SO_EVERY_DIRECTION_EXCEPT_UP[i].s();
                int n13 = n4 + HORIZONTALS_BUT_ALSO_DOWN_____SO_EVERY_DIRECTION_EXCEPT_UP[i].T();
                if (n11 == n5 - n7 && n13 == n4 - n6 || !MovementHelper.canPlaceAgainst(calculationContext.bsi, n11, n12, n13)) continue;
                mutableMoveResult.x = n5;
                mutableMoveResult.y = n2;
                mutableMoveResult.z = n4;
                mutableMoveResult.cost = MovementParkour.costFromJumpDistance(n10) + d + calculationContext.jumpPenalty;
                return;
            }
        }
    }

    private static boolean checkOvershootSafety(BlockStateInterface blockStateInterface, int n, int n2, int n3) {
        return !MovementHelper.avoidWalkingInto(blockStateInterface.get0(n, n2, n3)) && !MovementHelper.avoidWalkingInto(blockStateInterface.get0(n, n2 + 1, n3));
    }

    @Override
    public Set<BetterBlockPos> calculateValidPositions() {
        HashSet<BetterBlockPos> hashSet = new HashSet<BetterBlockPos>();
        for (int i = 0; i <= this.dist; ++i) {
            for (int j = 0; j < 2; ++j) {
                hashSet.add(this.src.relative(this.direction, i).above(j));
            }
        }
        return hashSet;
    }

    private static double costFromJumpDistance(int n) {
        switch (n) {
            case 2: {
                return 9.26569376882094;
            }
            case 3: {
                return 13.89854065323141;
            }
            case 4: {
                return 14.255167498218103;
            }
        }
        throw new IllegalStateException("LOL " + n);
    }

    @Override
    public boolean safeToCancel(MovementState movementState) {
        return movementState.getStatus() != MovementStatus.RUNNING;
    }

    @Override
    public double calculateCost(CalculationContext calculationContext) {
        MutableMoveResult mutableMoveResult = new MutableMoveResult();
        MovementParkour.cost(calculationContext, this.src.x, this.src.y, this.src.z, this.direction, mutableMoveResult);
        if (mutableMoveResult.x != this.dest.x || mutableMoveResult.y != this.dest.y || mutableMoveResult.z != this.dest.z) {
            return 1000000.0;
        }
        return mutableMoveResult.cost;
    }

    @Override
    public MovementState updateState(MovementState movementState) {
        super.updateState(movementState);
        if (movementState.getStatus() != MovementStatus.RUNNING) {
            return movementState;
        }
        if (this.ctx.playerFeet().y < this.src.y) {
            this.logDebug("sorry");
            return movementState.setStatus(MovementStatus.UNREACHABLE);
        }
        if (this.dist >= 4 || this.ascend) {
            movementState.setInput(Input.SPRINT, true);
        }
        if (((Boolean)Baritone.settings().allowWalkOnMagmaBlocks.value).booleanValue() && this.ctx.world().method_8320((class07209)this.ctx.playerFeet().below()).N(class00869.EI)) {
            movementState.setInput(Input.SNEAK, true);
        }
        MovementHelper.moveTowards(this.ctx, movementState, (class07209)this.dest);
        if (this.ctx.playerFeet().equals((Object)this.dest)) {
            class00891 class008912 = BlockStateInterface.getBlock((IPlayerContext)this.ctx, (class07209)this.dest);
            if (class008912 == class00869.Rc || class008912 == class00869.uW) {
                return movementState.setStatus(MovementStatus.SUCCESS);
            }
            if (this.ctx.player().method_73189().B - (double)this.ctx.playerFeet().method_10264() < 0.094) {
                movementState.setStatus(MovementStatus.SUCCESS);
            }
        } else if (!this.ctx.playerFeet().equals((Object)this.src)) {
            if (this.ctx.playerFeet().equals((Object)this.src.relative(this.direction)) || this.ctx.player().method_73189().B - (double)this.src.y > 1.0E-4) {
                if (((Boolean)Baritone.settings().allowPlace.value).booleanValue() && ((Baritone)this.baritone).getInventoryBehavior().hasGenericThrowaway() && !MovementHelper.canWalkOn(this.ctx, this.dest.below()) && !this.ctx.player().method_24828() && MovementHelper.attemptToPlaceABlock(movementState, this.baritone, (class07209)this.dest.below(), true, false) == MovementHelper$PlaceResult.READY_TO_PLACE) {
                    movementState.setInput(Input.CLICK_RIGHT, true);
                }
                if (this.dist == 3 && !this.ascend) {
                    double d = (double)this.src.x + 0.5 - this.ctx.player().method_73189().M;
                    double d2 = (double)this.src.z + 0.5 - this.ctx.player().method_73189().Z;
                    double d3 = Math.max(Math.abs(d), Math.abs(d2));
                    if (d3 < 0.7) {
                        return movementState;
                    }
                }
                movementState.setInput(Input.JUMP, true);
            } else if (!this.ctx.playerFeet().equals((Object)this.dest.relative(this.direction, -1))) {
                movementState.setInput(Input.SPRINT, false);
                if (this.ctx.playerFeet().equals((Object)this.src.relative(this.direction, -1))) {
                    MovementHelper.moveTowards(this.ctx, movementState, (class07209)this.src);
                } else {
                    MovementHelper.moveTowards(this.ctx, movementState, (class07209)this.src.relative(this.direction, -1));
                }
            }
        }
        return movementState;
    }
}

