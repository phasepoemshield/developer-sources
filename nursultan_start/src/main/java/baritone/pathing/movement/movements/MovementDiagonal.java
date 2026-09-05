/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.IBaritone
 *  baritone.api.pathing.movement.MovementStatus
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.input.Input
 *  baritone.utils.BlockStateInterface
 *  baritone.utils.pathing.MutableMoveResult
 *  com.google.common.collect.ImmutableSet
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class04453
 *  minecraft.class07209
 *  minecraft.class07211
 */
package baritone.pathing.movement.movements;

import baritone.Baritone;
import baritone.api.IBaritone;
import baritone.api.pathing.movement.MovementStatus;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.input.Input;
import baritone.pathing.movement.CalculationContext;
import baritone.pathing.movement.Movement;
import baritone.pathing.movement.MovementHelper;
import baritone.pathing.movement.MovementState;
import baritone.utils.BlockStateInterface;
import baritone.utils.pathing.MutableMoveResult;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class04453;
import minecraft.class07209;
import minecraft.class07211;

public class MovementDiagonal
extends Movement {
    private static final double SQRT_2 = Math.sqrt(2.0);

    private MovementDiagonal(IBaritone iBaritone, BetterBlockPos betterBlockPos, BetterBlockPos betterBlockPos2, BetterBlockPos betterBlockPos3, BetterBlockPos betterBlockPos4) {
        super(iBaritone, betterBlockPos, betterBlockPos2, new BetterBlockPos[]{betterBlockPos3, betterBlockPos3.above(), betterBlockPos4, betterBlockPos4.above(), betterBlockPos2, betterBlockPos2.above()});
    }

    private MovementDiagonal(IBaritone iBaritone, BetterBlockPos betterBlockPos, BetterBlockPos betterBlockPos2, BetterBlockPos betterBlockPos3, class07211 class072112, int n) {
        this(iBaritone, betterBlockPos, betterBlockPos2.relative(class072112).above(n), betterBlockPos2, betterBlockPos3);
    }

    public MovementDiagonal(IBaritone iBaritone, BetterBlockPos betterBlockPos, class07211 class072112, class07211 class072113, int n) {
        this(iBaritone, betterBlockPos, betterBlockPos.relative(class072112), betterBlockPos.relative(class072113), class072113, n);
    }

    public static void cost(CalculationContext calculationContext, int n, int n2, int n3, int n4, int n5, MutableMoveResult mutableMoveResult) {
        class00500 class005002;
        class00500 class005003;
        if (!MovementHelper.canWalkThrough(calculationContext, n4, n2 + 1, n5)) {
            return;
        }
        class00500 class005004 = calculationContext.get(n4, n2, n5);
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        if (!MovementHelper.canWalkThrough(calculationContext, n4, n2, n5, class005004)) {
            bl = true;
            if (!(calculationContext.allowDiagonalAscend && MovementHelper.canWalkThrough(calculationContext, n, n2 + 2, n3) && MovementHelper.canWalkOn(calculationContext, n4, n2, n5, class005004) && MovementHelper.canWalkThrough(calculationContext, n4, n2 + 2, n5))) {
                return;
            }
            class005003 = class005004;
            class005002 = calculationContext.get(n, n2 - 1, n3);
        } else {
            class005003 = calculationContext.get(n4, n2 - 1, n5);
            class005002 = calculationContext.get(n, n2 - 1, n3);
            boolean bl5 = MovementHelper.mustBeSolidToWalkOn(calculationContext, n, n2 - 1, n3, class005002);
            boolean bl6 = bl3 = bl5 && MovementHelper.canUseFrostWalker(calculationContext, class005003);
            if (!bl3 && !MovementHelper.canWalkOn(calculationContext, n4, n2 - 1, n5, class005003)) {
                bl2 = true;
                if (!(calculationContext.allowDiagonalDescend && MovementHelper.canWalkOn(calculationContext, n4, n2 - 2, n5) && MovementHelper.canWalkThrough(calculationContext, n4, n2 - 1, n5, class005003))) {
                    return;
                }
            }
            bl3 &= !calculationContext.assumeWalkOnWater;
        }
        double d = 4.63284688441047;
        if (class005003.N(class00869.iw)) {
            d += 2.316423442205235;
        } else if (calculationContext.allowWalkOnMagmaBlocks && class005003.N(class00869.EI)) {
            d += 5.375884250102457;
            bl4 = true;
        } else if (!bl3 && class005003.i() == class00869.K) {
            d += calculationContext.walkOnWaterOnePenalty * SQRT_2;
        }
        class00891 class008912 = class005002.i();
        if (class008912 == class00869.uW || class008912 == class00869.Rc) {
            return;
        }
        if (class008912 == class00869.iw) {
            d += 2.316423442205235;
        } else if (calculationContext.allowWalkOnMagmaBlocks && class008912.equals(class00869.EI)) {
            d += 5.375884250102457;
            bl4 = true;
        }
        class00500 class005005 = calculationContext.get(n, n2 - 1, n5);
        if (!calculationContext.allowWalkOnMagmaBlocks && class005005.N(class00869.EI) || MovementHelper.isLava(class005005)) {
            return;
        }
        class00500 class005006 = calculationContext.get(n4, n2 - 1, n3);
        if (!calculationContext.allowWalkOnMagmaBlocks && class005005.N(class00869.EI) || MovementHelper.isLava(class005006)) {
            return;
        }
        boolean bl7 = false;
        class00500 class005007 = calculationContext.get(n, n2, n3);
        class00891 class008913 = class005007.i();
        if (MovementHelper.isWater(class005007) || MovementHelper.isWater(class005004)) {
            if (bl) {
                return;
            }
            d = calculationContext.waterWalkSpeed;
            bl7 = true;
        }
        class00500 class005008 = calculationContext.get(n, n2, n5);
        class00500 class005009 = calculationContext.get(n4, n2, n3);
        if (bl) {
            boolean bl8 = MovementHelper.canWalkThrough(calculationContext, n, n2 + 2, n5);
            boolean bl9 = MovementHelper.canWalkThrough(calculationContext, n, n2 + 1, n5);
            boolean bl10 = MovementHelper.canWalkThrough(calculationContext, n, n2, n5, class005008);
            boolean bl11 = MovementHelper.canWalkThrough(calculationContext, n4, n2 + 2, n3);
            boolean bl12 = MovementHelper.canWalkThrough(calculationContext, n4, n2 + 1, n3);
            boolean bl13 = MovementHelper.canWalkThrough(calculationContext, n4, n2, n3, class005009);
            if ((!bl8 || !bl9 || !bl10) && (!bl11 || !bl12 || !bl13) || MovementHelper.avoidWalkingInto(class005008) || MovementHelper.avoidWalkingInto(class005009) || bl8 && bl9 && MovementHelper.canWalkOn(calculationContext, n, n2, n5, class005008) || bl11 && bl12 && MovementHelper.canWalkOn(calculationContext, n4, n2, n3, class005009) || !bl8 && bl9 && bl10 || !bl11 && bl12 && bl13) {
                return;
            }
            mutableMoveResult.cost = d * SQRT_2 + JUMP_ONE_BLOCK_COST;
            mutableMoveResult.x = n4;
            mutableMoveResult.z = n5;
            mutableMoveResult.y = n2 + 1;
            return;
        }
        double d2 = MovementHelper.getMiningDurationTicks(calculationContext, n, n2, n5, class005008, false);
        double d3 = MovementHelper.getMiningDurationTicks(calculationContext, n4, n2, n3, class005009, false);
        if (d2 != 0.0 && d3 != 0.0) {
            return;
        }
        class00500 class0050010 = calculationContext.get(n, n2 + 1, n5);
        if ((d2 += MovementHelper.getMiningDurationTicks(calculationContext, n, n2 + 1, n5, class0050010, true)) != 0.0 && d3 != 0.0) {
            return;
        }
        class00500 class0050011 = calculationContext.get(n4, n2 + 1, n3);
        if (d2 == 0.0 && (MovementHelper.avoidWalkingInto(class005009) && class005009.i() != class00869.K || MovementHelper.avoidWalkingInto(class0050011))) {
            return;
        }
        if (d2 != 0.0 && (d3 += MovementHelper.getMiningDurationTicks(calculationContext, n4, n2 + 1, n3, class0050011, true)) != 0.0) {
            return;
        }
        if (d3 == 0.0 && (MovementHelper.avoidWalkingInto(class005008) && class005008.i() != class00869.K || MovementHelper.avoidWalkingInto(class0050010))) {
            return;
        }
        if (d2 != 0.0 || d3 != 0.0) {
            d *= SQRT_2 - 0.001;
            if (class008913 == class00869.uW || class008913 == class00869.Rc) {
                return;
            }
        } else if (calculationContext.canSprint && !bl7 && !bl4) {
            d *= 0.7692444761225944;
        }
        mutableMoveResult.cost = d * SQRT_2;
        if (bl2) {
            mutableMoveResult.cost += Math.max(FALL_N_BLOCKS_COST[1], 0.9265693768820937);
            mutableMoveResult.y = n2 - 1;
        } else {
            mutableMoveResult.y = n2;
        }
        mutableMoveResult.x = n4;
        mutableMoveResult.z = n5;
    }

    @Override
    public List<class07209> toBreak(BlockStateInterface blockStateInterface) {
        if (this.toBreakCached != null) {
            return this.toBreakCached;
        }
        ArrayList<class07209> arrayList = new ArrayList<class07209>();
        for (int i = 4; i < 6; ++i) {
            if (MovementHelper.canWalkThrough(blockStateInterface, this.positionsToBreak[i].x, this.positionsToBreak[i].y, this.positionsToBreak[i].z)) continue;
            arrayList.add((class07209)this.positionsToBreak[i]);
        }
        this.toBreakCached = arrayList;
        return arrayList;
    }

    @Override
    public boolean prepared(MovementState movementState) {
        return true;
    }

    @Override
    public List<class07209> toWalkInto(BlockStateInterface blockStateInterface) {
        if (this.toWalkIntoCached == null) {
            this.toWalkIntoCached = new ArrayList();
        }
        ArrayList<BetterBlockPos> arrayList = new ArrayList<BetterBlockPos>();
        for (int i = 0; i < 4; ++i) {
            if (MovementHelper.canWalkThrough(blockStateInterface, this.positionsToBreak[i].x, this.positionsToBreak[i].y, this.positionsToBreak[i].z)) continue;
            arrayList.add(this.positionsToBreak[i]);
        }
        this.toWalkIntoCached = arrayList;
        return this.toWalkIntoCached;
    }

    @Override
    public Set<BetterBlockPos> calculateValidPositions() {
        BetterBlockPos betterBlockPos = new BetterBlockPos(this.src.x, this.src.y, this.dest.z);
        BetterBlockPos betterBlockPos2 = new BetterBlockPos(this.dest.x, this.src.y, this.src.z);
        if (this.dest.y < this.src.y) {
            return ImmutableSet.of((Object)this.src, (Object)this.dest.above(), (Object)betterBlockPos, (Object)betterBlockPos2, (Object)this.dest, (Object)betterBlockPos.below(), (Object[])new BetterBlockPos[]{betterBlockPos2.below()});
        }
        if (this.dest.y > this.src.y) {
            return ImmutableSet.of((Object)this.src, (Object)this.src.above(), (Object)betterBlockPos, (Object)betterBlockPos2, (Object)this.dest, (Object)betterBlockPos.above(), (Object[])new BetterBlockPos[]{betterBlockPos2.above()});
        }
        return ImmutableSet.of((Object)this.src, (Object)this.dest, (Object)betterBlockPos, (Object)betterBlockPos2);
    }

    private boolean sprint() {
        if (MovementHelper.isLiquid(this.ctx, (class07209)this.ctx.playerFeet()) && !((Boolean)Baritone.settings().sprintInWater.value).booleanValue()) {
            return false;
        }
        for (int i = 0; i < 4; ++i) {
            if (MovementHelper.canWalkThrough(this.ctx, this.positionsToBreak[i])) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean safeToCancel(MovementState movementState) {
        class04453 class044532 = this.ctx.player();
        double d = 0.25;
        double d2 = class044532.method_73189().M;
        double d3 = class044532.method_73189().B - 1.0;
        double d4 = class044532.method_73189().Z;
        if (this.ctx.playerFeet().equals((Object)this.src)) {
            return true;
        }
        if (MovementHelper.canWalkOn(this.ctx, new class07209(this.src.x, this.src.y - 1, this.dest.z)) && MovementHelper.canWalkOn(this.ctx, new class07209(this.dest.x, this.src.y - 1, this.src.z))) {
            return true;
        }
        if (this.ctx.playerFeet().equals((Object)new BetterBlockPos(this.src.x, this.src.y, this.dest.z)) || this.ctx.playerFeet().equals((Object)new BetterBlockPos(this.dest.x, this.src.y, this.src.z))) {
            return MovementHelper.canWalkOn(this.ctx, new BetterBlockPos(d2 + d, d3, d4 + d)) || MovementHelper.canWalkOn(this.ctx, new BetterBlockPos(d2 + d, d3, d4 - d)) || MovementHelper.canWalkOn(this.ctx, new BetterBlockPos(d2 - d, d3, d4 + d)) || MovementHelper.canWalkOn(this.ctx, new BetterBlockPos(d2 - d, d3, d4 - d));
        }
        return true;
    }

    @Override
    public double calculateCost(CalculationContext calculationContext) {
        MutableMoveResult mutableMoveResult = new MutableMoveResult();
        MovementDiagonal.cost(calculationContext, this.src.x, this.src.y, this.src.z, this.dest.x, this.dest.z, mutableMoveResult);
        if (mutableMoveResult.y != this.dest.y) {
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
        if (this.ctx.playerFeet().equals((Object)this.dest)) {
            return movementState.setStatus(MovementStatus.SUCCESS);
        }
        if (!(this.playerInValidPosition() || MovementHelper.isLiquid(this.ctx, (class07209)this.src) && this.getValidPositions().contains(this.ctx.playerFeet().above()))) {
            return movementState.setStatus(MovementStatus.UNREACHABLE);
        }
        if (this.dest.y > this.src.y && this.ctx.player().method_73189().B < (double)this.src.y + 0.1 && this.ctx.player().field_5976) {
            movementState.setInput(Input.JUMP, true);
        }
        if (this.sprint()) {
            movementState.setInput(Input.SPRINT, true);
        }
        movementState.setInput(Input.SNEAK, (Boolean)Baritone.settings().allowWalkOnMagmaBlocks.value != false && MovementHelper.steppingOnBlocks(this.ctx).stream().anyMatch(betterBlockPos -> this.ctx.world().method_8320((class07209)betterBlockPos).N(class00869.EI)));
        MovementHelper.moveTowards(this.ctx, movementState, (class07209)this.dest);
        return movementState;
    }
}

