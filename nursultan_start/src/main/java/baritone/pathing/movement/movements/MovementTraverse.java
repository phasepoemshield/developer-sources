/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.IBaritone
 *  baritone.api.pathing.movement.MovementStatus
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.IPlayerContext
 *  baritone.api.utils.Rotation
 *  baritone.api.utils.RotationUtils
 *  baritone.api.utils.VecUtils
 *  baritone.api.utils.input.Input
 *  baritone.pathing.movement.CalculationContext
 *  baritone.pathing.movement.Movement
 *  baritone.pathing.movement.MovementHelper
 *  baritone.pathing.movement.MovementHelper$PlaceResult
 *  baritone.pathing.movement.MovementState
 *  baritone.pathing.movement.MovementState$MovementTarget
 *  baritone.pathing.movement.movements.MovementPillar
 *  baritone.pathing.movement.movements.MovementTraverse$1
 *  com.google.common.collect.ImmutableSet
 *  minecraft.class00410
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class06889
 *  minecraft.class07007
 *  minecraft.class07123
 *  minecraft.class07188
 *  minecraft.class07196
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07662
 *  minecraft.class08054
 *  minecraft.class08092
 */
package baritone.pathing.movement.movements;

import baritone.Baritone;
import baritone.api.IBaritone;
import baritone.api.pathing.movement.MovementStatus;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.Rotation;
import baritone.api.utils.RotationUtils;
import baritone.api.utils.VecUtils;
import baritone.api.utils.input.Input;
import baritone.pathing.movement.CalculationContext;
import baritone.pathing.movement.Movement;
import baritone.pathing.movement.MovementHelper;
import baritone.pathing.movement.MovementState;
import baritone.pathing.movement.movements.MovementPillar;
import baritone.pathing.movement.movements.MovementTraverse;
import baritone.utils.BlockStateInterface;
import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import minecraft.class00410;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class06889;
import minecraft.class07007;
import minecraft.class07123;
import minecraft.class07188;
import minecraft.class07196;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07662;
import minecraft.class08054;
import minecraft.class08092;

public class MovementTraverse
extends Movement {
    private boolean wasTheBridgeBlockAlwaysThere = true;

    public MovementTraverse(IBaritone iBaritone, BetterBlockPos betterBlockPos, BetterBlockPos betterBlockPos2) {
        super(iBaritone, betterBlockPos, betterBlockPos2, new BetterBlockPos[]{betterBlockPos2.above(), betterBlockPos2}, betterBlockPos2.below());
    }

    public void reset() {
        super.reset();
        this.wasTheBridgeBlockAlwaysThere = true;
    }

    public static double cost(CalculationContext calculationContext, int n, int n2, int n3, int n4, int n5) {
        boolean bl;
        class00500 class005002 = calculationContext.get(n4, n2 + 1, n5);
        class00500 class005003 = calculationContext.get(n4, n2, n5);
        class00500 class005004 = calculationContext.get(n4, n2 - 1, n5);
        class00500 class005005 = calculationContext.get(n, n2 - 1, n3);
        class00891 class008912 = class005005.i();
        boolean bl2 = MovementHelper.mustBeSolidToWalkOn((CalculationContext)calculationContext, (int)n, (int)(n2 - 1), (int)n3, (class00500)class005005);
        boolean bl3 = bl = bl2 && !calculationContext.assumeWalkOnWater && MovementHelper.canUseFrostWalker((CalculationContext)calculationContext, (class00500)class005004);
        if (bl || MovementHelper.canWalkOn((CalculationContext)calculationContext, (int)n4, (int)(n2 - 1), (int)n5, (class00500)class005004)) {
            double d = 4.63284688441047;
            boolean bl4 = false;
            boolean bl5 = false;
            if (MovementHelper.isWater((class00500)class005002) || MovementHelper.isWater((class00500)class005003)) {
                d = calculationContext.waterWalkSpeed;
                bl4 = true;
            } else {
                if (class005004.i() == class00869.iw) {
                    d += 2.316423442205235;
                } else if (!bl && class005004.i() == class00869.K) {
                    d += calculationContext.walkOnWaterOnePenalty;
                }
                if (class008912 == class00869.iw) {
                    d += 2.316423442205235;
                } else if (calculationContext.allowWalkOnMagmaBlocks && class008912.equals(class00869.EI)) {
                    bl5 = true;
                    d += 5.375884250102457;
                }
            }
            double d2 = MovementHelper.getMiningDurationTicks((CalculationContext)calculationContext, (int)n4, (int)n2, (int)n5, (class00500)class005003, (boolean)false);
            if (d2 >= 1000000.0) {
                return 1000000.0;
            }
            double d3 = MovementHelper.getMiningDurationTicks((CalculationContext)calculationContext, (int)n4, (int)(n2 + 1), (int)n5, (class00500)class005002, (boolean)true);
            if (d2 == 0.0 && d3 == 0.0) {
                if (!bl4 && !bl5 && calculationContext.canSprint) {
                    d *= 0.7692444761225944;
                }
                return d;
            }
            if (class008912 == class00869.uW || class008912 == class00869.Rc) {
                d2 *= 5.0;
                d3 *= 5.0;
            }
            return d + d2 + d3;
        }
        if (class008912 == class00869.uW || class008912 == class00869.Rc) {
            return 1000000.0;
        }
        if (MovementHelper.isReplaceable((int)n4, (int)(n2 - 1), (int)n5, (class00500)class005004, (BlockStateInterface)calculationContext.bsi)) {
            boolean bl6;
            boolean bl7 = bl6 = MovementHelper.isWater((class00500)class005002) || MovementHelper.isWater((class00500)class005003);
            if (MovementHelper.isWater((class00500)class005004) && bl6) {
                return 1000000.0;
            }
            double d = calculationContext.costOfPlacingAt(n4, n2 - 1, n5, class005004);
            if (d >= 1000000.0) {
                return 1000000.0;
            }
            double d4 = MovementHelper.getMiningDurationTicks((CalculationContext)calculationContext, (int)n4, (int)n2, (int)n5, (class00500)class005003, (boolean)false);
            if (d4 >= 1000000.0) {
                return 1000000.0;
            }
            double d5 = MovementHelper.getMiningDurationTicks((CalculationContext)calculationContext, (int)n4, (int)(n2 + 1), (int)n5, (class00500)class005002, (boolean)true);
            double d6 = bl6 ? calculationContext.waterWalkSpeed : 4.63284688441047;
            for (int i = 0; i < 5; ++i) {
                int n6 = n4 + HORIZONTALS_BUT_ALSO_DOWN_____SO_EVERY_DIRECTION_EXCEPT_UP[i].P();
                int n7 = n2 - 1 + HORIZONTALS_BUT_ALSO_DOWN_____SO_EVERY_DIRECTION_EXCEPT_UP[i].s();
                int n8 = n5 + HORIZONTALS_BUT_ALSO_DOWN_____SO_EVERY_DIRECTION_EXCEPT_UP[i].T();
                if (n6 == n && n8 == n3 || !MovementHelper.canPlaceAgainst((BlockStateInterface)calculationContext.bsi, (int)n6, (int)n7, (int)n8)) continue;
                return d6 + d + d4 + d5;
            }
            if (class008912 == class00869.iw || class008912 instanceof class07007 && class005005.L((class08092)class07007.y) != class08054.field_12682) {
                return 1000000.0;
            }
            if (!bl2) {
                return 1000000.0;
            }
            class00891 class008913 = calculationContext.getBlock(n, n2, n3);
            if ((class008913 == class00869.RS || class008913 instanceof class00410) && !class005005.Y().W()) {
                return 1000000.0;
            }
            return (d6 *= 3.3207692307692307) + d + d4 + d5;
        }
        return 1000000.0;
    }

    public boolean prepared(MovementState movementState) {
        class00891 class008912;
        if ((this.ctx.playerFeet().equals((Object)this.src) || this.ctx.playerFeet().equals((Object)this.src.below())) && ((class008912 = BlockStateInterface.getBlock(this.ctx, (class07209)this.src.below())) == class00869.uW || class008912 == class00869.Rc)) {
            movementState.setInput(Input.SNEAK, true);
        }
        return super.prepared(movementState);
    }

    public Set<BetterBlockPos> calculateValidPositions() {
        return ImmutableSet.of((Object)this.src, (Object)this.dest);
    }

    public boolean safeToCancel(MovementState movementState) {
        return movementState.getStatus() != MovementStatus.RUNNING || MovementHelper.canWalkOn((IPlayerContext)this.ctx, (BetterBlockPos)this.dest.below());
    }

    public double calculateCost(CalculationContext calculationContext) {
        return MovementTraverse.cost(calculationContext, this.src.x, this.src.y, this.src.z, this.dest.x, this.dest.z);
    }

    public MovementState updateState(MovementState movementState) {
        double d;
        super.updateState(movementState);
        class00500 class005002 = BlockStateInterface.get(this.ctx, (class07209)this.positionsToBreak[0]);
        class00500 class005003 = BlockStateInterface.get(this.ctx, (class07209)this.positionsToBreak[1]);
        if (movementState.getStatus() != MovementStatus.RUNNING) {
            if (!((Boolean)Baritone.settings().walkWhileBreaking.value).booleanValue()) {
                return movementState;
            }
            if (movementState.getStatus() != MovementStatus.PREPPING) {
                return movementState;
            }
            if (MovementHelper.avoidWalkingInto((class00500)class005002)) {
                return movementState;
            }
            if (MovementHelper.avoidWalkingInto((class00500)class005003)) {
                return movementState;
            }
            double d2 = Math.max(Math.abs(this.ctx.player().method_73189().M - ((double)this.dest.method_10263() + 0.5)), Math.abs(this.ctx.player().method_73189().Z - ((double)this.dest.method_10260() + 0.5)));
            if (d2 < 0.83) {
                return movementState;
            }
            if (!movementState.getTarget().getRotation().isPresent()) {
                return movementState;
            }
            float f = RotationUtils.calcRotationFromVec3d((class06889)this.ctx.playerHead(), (class06889)VecUtils.calculateBlockCenter((class07299)this.ctx.world(), (class07209)this.dest), (Rotation)this.ctx.playerRotations()).getYaw();
            float f2 = ((Rotation)movementState.getTarget().getRotation().get()).getPitch();
            if (MovementHelper.isBlockNormalCube((class00500)class005002) || class005002.i() instanceof class07662 && (MovementHelper.isBlockNormalCube((class00500)class005003) || class005003.i() instanceof class07662)) {
                f2 = 26.0f;
            }
            return movementState.setTarget(new MovementState.MovementTarget(new Rotation(f, f2), true)).setInput(Input.MOVE_FORWARD, true).setInput(Input.SPRINT, true);
        }
        class00891 class008912 = BlockStateInterface.get(this.ctx, (class07209)this.src.below()).i();
        boolean bl = class008912 == class00869.uW || class008912 == class00869.Rc;
        movementState.setInput(Input.SNEAK, (Boolean)Baritone.settings().allowWalkOnMagmaBlocks.value != false && MovementHelper.steppingOnBlocks((IPlayerContext)this.ctx).stream().anyMatch(betterBlockPos -> this.ctx.world().method_8320((class07209)betterBlockPos).N(class00869.EI)));
        if (class005002.i() instanceof class07196 || class005003.i() instanceof class07196) {
            boolean bl2;
            boolean bl3 = class005002.i() instanceof class07196 && !MovementHelper.isDoorPassable((IPlayerContext)this.ctx, (class07209)this.src, (class07209)this.dest) || class005003.i() instanceof class07196 && !MovementHelper.isDoorPassable((IPlayerContext)this.ctx, (class07209)this.dest, (class07209)this.src);
            boolean bl4 = bl2 = !class00869.ur.equals(class005002.i()) && !class00869.ur.equals(class005003.i());
            if (bl3 && bl2) {
                return movementState.setTarget(new MovementState.MovementTarget(RotationUtils.calcRotationFromVec3d((class06889)this.ctx.playerHead(), (class06889)VecUtils.calculateBlockCenter((class07299)this.ctx.world(), (class07209)this.positionsToBreak[0]), (Rotation)this.ctx.playerRotations()), true)).setInput(Input.CLICK_RIGHT, true);
            }
        }
        if (class005002.i() instanceof class07188 || class005003.i() instanceof class07188) {
            Optional optional;
            BetterBlockPos betterBlockPos2;
            Object object = !MovementHelper.isGatePassable((IPlayerContext)this.ctx, (class07209)this.positionsToBreak[0], (class07209)this.src.above()) ? this.positionsToBreak[0] : (betterBlockPos2 = !MovementHelper.isGatePassable((IPlayerContext)this.ctx, (class07209)this.positionsToBreak[1], (class07209)this.src) ? this.positionsToBreak[1] : null);
            if (betterBlockPos2 != null && (optional = RotationUtils.reachable((IPlayerContext)this.ctx, (class07209)betterBlockPos2)).isPresent()) {
                return movementState.setTarget(new MovementState.MovementTarget((Rotation)optional.get(), true)).setInput(Input.CLICK_RIGHT, true);
            }
        }
        boolean bl5 = MovementHelper.canWalkOn((IPlayerContext)this.ctx, (BetterBlockPos)this.positionToPlace) || bl || MovementHelper.canUseFrostWalker((IPlayerContext)this.ctx, (class07209)this.positionToPlace);
        BetterBlockPos betterBlockPos3 = this.ctx.playerFeet();
        if (betterBlockPos3.method_10264() != this.dest.method_10264() && !bl) {
            this.logDebug("Wrong Y coordinate");
            if (betterBlockPos3.method_10264() < this.dest.method_10264()) {
                System.out.println("In movement traverse");
                return movementState.setInput(Input.JUMP, true);
            }
            return movementState;
        }
        if (bl5) {
            if (betterBlockPos3.equals((Object)this.dest)) {
                return movementState.setStatus(MovementStatus.SUCCESS);
            }
            if (((Boolean)Baritone.settings().overshootTraverse.value).booleanValue() && (betterBlockPos3.equals((Object)this.dest.method_10081((class00753)this.getDirection())) || betterBlockPos3.equals((Object)this.dest.method_10081((class00753)this.getDirection()).method_10081((class00753)this.getDirection())))) {
                return movementState.setStatus(MovementStatus.SUCCESS);
            }
            class00891 class008913 = BlockStateInterface.get(this.ctx, (class07209)this.src).i();
            class00891 class008914 = BlockStateInterface.get(this.ctx, (class07209)this.src.above()).i();
            if (this.ctx.player().method_73189().B > (double)this.src.y + 0.1 && !this.ctx.player().method_24828() && (class008913 == class00869.Rc || class008913 == class00869.uW || class008914 == class00869.Rc || class008914 == class00869.uW)) {
                return movementState;
            }
            class07209 class072092 = this.dest.method_10059((class00753)this.src).method_10081((class00753)this.dest);
            class00500 class005004 = BlockStateInterface.get(this.ctx, class072092);
            class00500 class005005 = BlockStateInterface.get(this.ctx, class072092.method_10084());
            if (!(!this.wasTheBridgeBlockAlwaysThere || MovementHelper.isLiquid((IPlayerContext)this.ctx, (class07209)betterBlockPos3) && !((Boolean)Baritone.settings().sprintInWater.value).booleanValue() || MovementHelper.avoidWalkingInto((class00500)class005004) && !MovementHelper.isWater((class00500)class005004) || MovementHelper.avoidWalkingInto((class00500)class005005))) {
                movementState.setInput(Input.SPRINT, true);
            }
            class00500 class005006 = BlockStateInterface.get(this.ctx, (class07209)this.dest.below());
            BetterBlockPos betterBlockPos4 = this.positionsToBreak[0];
            if (betterBlockPos3.method_10264() != this.dest.method_10264() && bl && (class005006.i() == class00869.Rc || class005006.i() == class00869.uW)) {
                Object object = betterBlockPos4 = class005006.i() == class00869.Rc ? MovementPillar.getAgainst((CalculationContext)new CalculationContext(this.baritone), (BetterBlockPos)this.dest.below()) : this.dest.relative(((class07211)class005006.L((class08092)class07123.y)).b());
                if (betterBlockPos4 == null) {
                    this.logDirect("Unable to climb vines. Consider disabling allowVines.");
                    return movementState.setStatus(MovementStatus.UNREACHABLE);
                }
            }
            MovementHelper.moveTowards((IPlayerContext)this.ctx, (MovementState)movementState, (class07209)betterBlockPos4);
            return movementState;
        }
        this.wasTheBridgeBlockAlwaysThere = false;
        class00891 class008915 = BlockStateInterface.get(this.ctx, betterBlockPos3.method_10074()).i();
        if ((class008915.equals(class00869.iw) || class008915 instanceof class07007) && (d = Math.max(Math.abs((double)this.dest.method_10263() + 0.5 - this.ctx.player().method_73189().M), Math.abs((double)this.dest.method_10260() + 0.5 - this.ctx.player().method_73189().Z))) < 0.85) {
            MovementHelper.moveTowards((IPlayerContext)this.ctx, (MovementState)movementState, (class07209)this.dest);
            return movementState.setInput(Input.MOVE_FORWARD, false).setInput(Input.MOVE_BACK, true);
        }
        d = Math.max(Math.abs(this.ctx.player().method_73189().M - ((double)this.dest.method_10263() + 0.5)), Math.abs(this.ctx.player().method_73189().Z - ((double)this.dest.method_10260() + 0.5)));
        MovementHelper.PlaceResult placeResult = MovementHelper.attemptToPlaceABlock((MovementState)movementState, (IBaritone)this.baritone, (class07209)this.dest.below(), (boolean)false, ((Boolean)Baritone.settings().assumeSafeWalk.value == false ? 1 : 0) != 0);
        if ((placeResult == MovementHelper.PlaceResult.READY_TO_PLACE || d < 0.6) && !((Boolean)Baritone.settings().assumeSafeWalk.value).booleanValue()) {
            movementState.setInput(Input.SNEAK, true);
        }
        switch (1.$SwitchMap$baritone$pathing$movement$MovementHelper$PlaceResult[placeResult.ordinal()]) {
            case 1: {
                if (this.ctx.player().method_18276() || ((Boolean)Baritone.settings().assumeSafeWalk.value).booleanValue()) {
                    movementState.setInput(Input.CLICK_RIGHT, true);
                }
                return movementState;
            }
            case 2: {
                if (d > 0.83) {
                    float f = RotationUtils.calcRotationFromVec3d((class06889)this.ctx.playerHead(), (class06889)VecUtils.getBlockPosCenter((class07209)this.dest), (Rotation)this.ctx.playerRotations()).getYaw();
                    if ((double)Math.abs(movementState.getTarget().rotation.getYaw() - f) < 0.1) {
                        return movementState.setInput(Input.MOVE_FORWARD, true);
                    }
                } else if (this.ctx.playerRotations().isReallyCloseTo(movementState.getTarget().rotation)) {
                    return movementState.setInput(Input.CLICK_LEFT, true);
                }
                return movementState;
            }
        }
        if (betterBlockPos3.equals((Object)this.dest)) {
            double d3 = ((double)(this.dest.method_10263() + this.src.method_10263()) + 1.0) * 0.5;
            double d4 = ((double)(this.dest.method_10264() + this.src.method_10264()) - 1.0) * 0.5;
            double d5 = ((double)(this.dest.method_10260() + this.src.method_10260()) + 1.0) * 0.5;
            BetterBlockPos betterBlockPos5 = this.src.below();
            Rotation rotation = RotationUtils.calcRotationFromVec3d((class06889)this.ctx.playerHead(), (class06889)new class06889(d3, d4, d5), (Rotation)this.ctx.playerRotations());
            float f = rotation.getPitch();
            double d6 = Math.max(Math.abs(this.ctx.player().method_73189().M - d3), Math.abs(this.ctx.player().method_73189().Z - d5));
            if (d6 < 0.29) {
                float f3 = RotationUtils.calcRotationFromVec3d((class06889)VecUtils.getBlockPosCenter((class07209)this.dest), (class06889)this.ctx.playerHead(), (Rotation)this.ctx.playerRotations()).getYaw();
                movementState.setTarget(new MovementState.MovementTarget(new Rotation(f3, f), true));
                movementState.setInput(Input.MOVE_BACK, true);
            } else {
                movementState.setTarget(new MovementState.MovementTarget(rotation, true));
            }
            if (this.ctx.isLookingAt((class07209)betterBlockPos5)) {
                return movementState.setInput(Input.CLICK_RIGHT, true);
            }
            if (this.ctx.playerRotations().isReallyCloseTo(movementState.getTarget().rotation)) {
                movementState.setInput(Input.CLICK_LEFT, true);
            }
            return movementState;
        }
        MovementHelper.moveTowardsWithSlightRotation((IPlayerContext)this.ctx, (MovementState)movementState, (class07209)this.dest);
        return movementState;
    }
}

