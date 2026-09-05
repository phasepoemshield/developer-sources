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
 *  baritone.utils.BlockStateInterface
 *  com.google.common.collect.ImmutableSet
 *  minecraft.class00410
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class06889
 *  minecraft.class07007
 *  minecraft.class07123
 *  minecraft.class07188
 *  minecraft.class07204
 *  minecraft.class07209
 *  minecraft.class07211
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
import baritone.pathing.movement.MovementState$MovementTarget;
import baritone.utils.BlockStateInterface;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import minecraft.class00410;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class06889;
import minecraft.class07007;
import minecraft.class07123;
import minecraft.class07188;
import minecraft.class07204;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07662;
import minecraft.class08054;
import minecraft.class08092;

public class MovementPillar
extends Movement {
    public MovementPillar(IBaritone iBaritone, BetterBlockPos betterBlockPos, BetterBlockPos betterBlockPos2) {
        super(iBaritone, betterBlockPos, betterBlockPos2, new BetterBlockPos[]{betterBlockPos.above(2)}, betterBlockPos);
    }

    public static double cost(CalculationContext calculationContext, int n, int n2, int n3) {
        class00500 class005002 = calculationContext.get(n, n2, n3);
        class00891 class008912 = class005002.i();
        boolean bl = class008912 == class00869.uW || class008912 == class00869.Rc;
        class00500 class005003 = calculationContext.get(n, n2 - 1, n3);
        if (!bl) {
            if (class005003.i() == class00869.uW || class005003.i() == class00869.Rc) {
                return 1000000.0;
            }
            if (class005003.i() instanceof class07007 && class005003.L((class08092)class07007.y) == class08054.field_12681) {
                return 1000000.0;
            }
        }
        if (class008912 == class00869.Rc && !MovementPillar.hasAgainst(calculationContext, n, n2, n3)) {
            return 1000000.0;
        }
        class00500 class005004 = calculationContext.get(n, n2 + 2, n3);
        class00891 class008913 = class005004.i();
        if (class008913 instanceof class07188) {
            return 1000000.0;
        }
        class00500 class005005 = null;
        if (MovementHelper.isWater(class005004) && MovementHelper.isWater(class005002) && MovementHelper.isWater(class005005 = calculationContext.get(n, n2 + 1, n3))) {
            return 8.51063829787234;
        }
        double d = 0.0;
        if (!bl) {
            d = calculationContext.costOfPlacingAt(n, n2, n3, class005002);
            if (d >= 1000000.0) {
                return 1000000.0;
            }
            if (class005003.i() instanceof class07662) {
                d += 0.1;
            }
        }
        if (MovementHelper.isLiquid(class005002) && !MovementHelper.canPlaceAgainst(calculationContext.bsi, n, n2 - 1, n3, class005003) || MovementHelper.isLiquid(class005003) && calculationContext.assumeWalkOnWater) {
            return 1000000.0;
        }
        if ((class008912 == class00869.RS || class008912 instanceof class00410) && !class005003.Y().W()) {
            return 1000000.0;
        }
        double d2 = MovementHelper.getMiningDurationTicks(calculationContext, n, n2 + 2, n3, class005004, true);
        if (d2 >= 1000000.0) {
            return 1000000.0;
        }
        if (d2 != 0.0) {
            if (class008913 == class00869.uW || class008913 == class00869.Rc) {
                d2 = 0.0;
            } else {
                class00500 class005006 = calculationContext.get(n, n2 + 3, n3);
                if (class005006.i() instanceof class07204) {
                    if (class005005 == null) {
                        class005005 = calculationContext.get(n, n2 + 1, n3);
                    }
                    if (!(class008913 instanceof class07204) || !(class005005.i() instanceof class07204)) {
                        return 1000000.0;
                    }
                }
            }
        }
        if (bl) {
            return 8.51063829787234 + d2 * 5.0;
        }
        return JUMP_ONE_BLOCK_COST + d + calculationContext.jumpPenalty + d2;
    }

    @Override
    public boolean prepared(MovementState movementState) {
        class00891 class008912;
        if ((this.ctx.playerFeet().equals((Object)this.src) || this.ctx.playerFeet().equals((Object)this.src.below())) && ((class008912 = BlockStateInterface.getBlock((IPlayerContext)this.ctx, (class07209)this.src.below())) == class00869.uW || class008912 == class00869.Rc)) {
            movementState.setInput(Input.SNEAK, true);
        }
        if (MovementHelper.isWater(this.ctx, (class07209)this.dest.above())) {
            return true;
        }
        return super.prepared(movementState);
    }

    public static boolean hasAgainst(CalculationContext calculationContext, int n, int n2, int n3) {
        return MovementHelper.isBlockNormalCube(calculationContext.get(n + 1, n2, n3)) || MovementHelper.isBlockNormalCube(calculationContext.get(n - 1, n2, n3)) || MovementHelper.isBlockNormalCube(calculationContext.get(n, n2, n3 + 1)) || MovementHelper.isBlockNormalCube(calculationContext.get(n, n2, n3 - 1));
    }

    public static class07209 getAgainst(CalculationContext calculationContext, BetterBlockPos betterBlockPos) {
        if (MovementHelper.isBlockNormalCube(calculationContext.get((class07209)betterBlockPos.north()))) {
            return betterBlockPos.north();
        }
        if (MovementHelper.isBlockNormalCube(calculationContext.get((class07209)betterBlockPos.south()))) {
            return betterBlockPos.south();
        }
        if (MovementHelper.isBlockNormalCube(calculationContext.get((class07209)betterBlockPos.east()))) {
            return betterBlockPos.east();
        }
        if (MovementHelper.isBlockNormalCube(calculationContext.get((class07209)betterBlockPos.west()))) {
            return betterBlockPos.west();
        }
        return null;
    }

    @Override
    public Set<BetterBlockPos> calculateValidPositions() {
        return ImmutableSet.of((Object)this.src, (Object)this.dest);
    }

    @Override
    public double calculateCost(CalculationContext calculationContext) {
        return MovementPillar.cost(calculationContext, this.src.x, this.src.y, this.src.z);
    }

    @Override
    public MovementState updateState(MovementState movementState) {
        boolean bl;
        super.updateState(movementState);
        if (movementState.getStatus() != MovementStatus.RUNNING) {
            return movementState;
        }
        if (this.ctx.playerFeet().y < this.src.y) {
            return movementState.setStatus(MovementStatus.UNREACHABLE);
        }
        class00500 class005002 = BlockStateInterface.get((IPlayerContext)this.ctx, (class07209)this.src);
        if (MovementHelper.isWater(class005002) && MovementHelper.isWater(this.ctx, (class07209)this.dest)) {
            movementState.setTarget(new MovementState$MovementTarget(RotationUtils.calcRotationFromVec3d((class06889)this.ctx.playerHead(), (class06889)VecUtils.getBlockPosCenter((class07209)this.dest), (Rotation)this.ctx.playerRotations()), false));
            class06889 class068892 = VecUtils.getBlockPosCenter((class07209)this.dest);
            if (Math.abs(this.ctx.player().method_73189().M - class068892.M) > 0.2 || Math.abs(this.ctx.player().method_73189().Z - class068892.Z) > 0.2) {
                movementState.setInput(Input.MOVE_FORWARD, true);
            }
            if (this.ctx.playerFeet().equals((Object)this.dest)) {
                return movementState.setStatus(MovementStatus.SUCCESS);
            }
            return movementState;
        }
        boolean bl2 = class005002.i() == class00869.uW || class005002.i() == class00869.Rc;
        boolean bl3 = class005002.i() == class00869.Rc;
        Rotation rotation2 = RotationUtils.calcRotationFromVec3d((class06889)this.ctx.playerHead(), (class06889)VecUtils.getBlockPosCenter((class07209)this.positionToPlace), (Rotation)this.ctx.playerRotations());
        if (!bl2) {
            movementState.setTarget(new MovementState$MovementTarget(this.ctx.playerRotations().withPitch(rotation2.getPitch()), true));
        }
        boolean bl4 = bl = MovementHelper.canWalkOn(this.ctx, this.src) || bl2;
        if (bl2) {
            class07209 class072092;
            Object object = class072092 = bl3 ? MovementPillar.getAgainst(new CalculationContext(this.baritone), this.src) : this.src.relative(((class07211)class005002.L((class08092)class07123.y)).b());
            if (class072092 == null) {
                this.logDirect("Unable to climb vines. Consider disabling allowVines.");
                return movementState.setStatus(MovementStatus.UNREACHABLE);
            }
            if (this.ctx.playerFeet().equals((Object)class072092.method_10084()) || this.ctx.playerFeet().equals((Object)this.dest)) {
                return movementState.setStatus(MovementStatus.SUCCESS);
            }
            if (MovementHelper.isBottomSlab(BlockStateInterface.get((IPlayerContext)this.ctx, (class07209)this.src.below()))) {
                movementState.setInput(Input.JUMP, true);
            }
            MovementHelper.moveTowards(this.ctx, movementState, class072092);
            return movementState;
        }
        if (!((Baritone)this.baritone).getInventoryBehavior().selectThrowawayForLocation(true, this.src.x, this.src.y, this.src.z)) {
            return movementState.setStatus(MovementStatus.UNREACHABLE);
        }
        movementState.setInput(Input.SNEAK, true);
        double d = this.ctx.player().method_73189().M - ((double)this.dest.method_10263() + 0.5);
        double d2 = this.ctx.player().method_73189().Z - ((double)this.dest.method_10260() + 0.5);
        double d3 = Math.sqrt(d * d + d2 * d2);
        double d4 = Math.sqrt(this.ctx.player().method_18798().M * this.ctx.player().method_18798().M + this.ctx.player().method_18798().Z * this.ctx.player().method_18798().Z);
        if (d3 > 0.17) {
            movementState.setInput(Input.MOVE_FORWARD, true);
            movementState.setTarget(new MovementState$MovementTarget(rotation2, true));
        } else if (d4 < 0.05) {
            movementState.setInput(Input.JUMP, this.ctx.player().method_73189().B < (double)this.dest.method_10264());
        }
        if (!bl) {
            class00500 class005003 = BlockStateInterface.get((IPlayerContext)this.ctx, (class07209)this.src);
            class00891 class008912 = class005003.i();
            if (!(class008912 instanceof class07662) && !class005003.d()) {
                RotationUtils.reachable((IPlayerContext)this.ctx, (class07209)this.src, (double)this.ctx.playerController().getBlockReachDistance()).map(rotation -> new MovementState$MovementTarget((Rotation)rotation, true)).ifPresent(movementState::setTarget);
                movementState.setInput(Input.JUMP, false);
                movementState.setInput(Input.CLICK_LEFT, true);
                bl = false;
            } else if (this.ctx.player().method_18276() && (this.ctx.isLookingAt((class07209)this.src.below()) || this.ctx.isLookingAt((class07209)this.src)) && this.ctx.player().method_73189().B > (double)this.dest.method_10264() + 0.1) {
                movementState.setInput(Input.CLICK_RIGHT, true);
            }
        }
        if (this.ctx.playerFeet().equals((Object)this.dest) && bl) {
            return movementState.setStatus(MovementStatus.SUCCESS);
        }
        return movementState;
    }
}

