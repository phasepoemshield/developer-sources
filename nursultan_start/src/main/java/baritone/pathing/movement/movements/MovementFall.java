/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.pathing.movement.MovementStatus
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.Rotation
 *  baritone.api.utils.RotationUtils
 *  baritone.api.utils.VecUtils
 *  baritone.api.utils.input.Input
 *  baritone.utils.pathing.MutableMoveResult
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class04644
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07123
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class08044
 *  minecraft.class08092
 */
package baritone.pathing.movement.movements;

import baritone.api.IBaritone;
import baritone.api.pathing.movement.MovementStatus;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.Rotation;
import baritone.api.utils.RotationUtils;
import baritone.api.utils.VecUtils;
import baritone.api.utils.input.Input;
import baritone.pathing.movement.CalculationContext;
import baritone.pathing.movement.Movement;
import baritone.pathing.movement.MovementHelper;
import baritone.pathing.movement.MovementState;
import baritone.pathing.movement.MovementState$MovementTarget;
import baritone.pathing.movement.movements.MovementDescend;
import baritone.utils.pathing.MutableMoveResult;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class04644;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07123;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class08044;
import minecraft.class08092;

public class MovementFall
extends Movement {
    private static final class06584 STACK_BUCKET_WATER = new class06584((class07310)class06570.jE);
    private static final class06584 STACK_BUCKET_EMPTY = new class06584((class07310)class06570.jU);

    public MovementFall(IBaritone iBaritone, BetterBlockPos betterBlockPos, BetterBlockPos betterBlockPos2) {
        super(iBaritone, betterBlockPos, betterBlockPos2, MovementFall.buildPositionsToBreak(betterBlockPos, betterBlockPos2));
    }

    @Override
    public boolean prepared(MovementState movementState) {
        if (movementState.getStatus() == MovementStatus.WAITING) {
            return true;
        }
        for (int i = 0; i < 4 && i < this.positionsToBreak.length; ++i) {
            if (MovementHelper.canWalkThrough(this.ctx, this.positionsToBreak[i])) continue;
            return super.prepared(movementState);
        }
        return true;
    }

    @Override
    public Set<BetterBlockPos> calculateValidPositions() {
        HashSet<BetterBlockPos> hashSet = new HashSet<BetterBlockPos>();
        hashSet.add(this.src);
        for (int i = this.src.y - this.dest.y; i >= 0; --i) {
            hashSet.add(this.dest.above(i));
        }
        return hashSet;
    }

    private static BetterBlockPos[] buildPositionsToBreak(BetterBlockPos betterBlockPos, BetterBlockPos betterBlockPos2) {
        int n = betterBlockPos.method_10263() - betterBlockPos2.method_10263();
        int n2 = betterBlockPos.method_10260() - betterBlockPos2.method_10260();
        int n3 = Math.abs(betterBlockPos.method_10264() - betterBlockPos2.method_10264());
        BetterBlockPos[] betterBlockPosArray = new BetterBlockPos[n3 + 2];
        for (int i = 0; i < betterBlockPosArray.length; ++i) {
            betterBlockPosArray[i] = new BetterBlockPos(betterBlockPos.method_10263() - n, betterBlockPos.method_10264() + 1 - i, betterBlockPos.method_10260() - n2);
        }
        return betterBlockPosArray;
    }

    private class07211 avoid() {
        for (int i = 0; i < 15; ++i) {
            class00500 class005002 = this.ctx.world().method_8320((class07209)this.ctx.playerFeet().below(i));
            if (class005002.i() != class00869.uW) continue;
            return (class07211)class005002.L((class08092)class07123.y);
        }
        return null;
    }

    @Override
    public boolean safeToCancel(MovementState movementState) {
        return this.ctx.playerFeet().equals((Object)this.src) || movementState.getStatus() != MovementStatus.RUNNING;
    }

    @Override
    public double calculateCost(CalculationContext calculationContext) {
        MutableMoveResult mutableMoveResult = new MutableMoveResult();
        MovementDescend.cost(calculationContext, this.src.x, this.src.y, this.src.z, this.dest.x, this.dest.z, mutableMoveResult);
        if (mutableMoveResult.y != this.dest.y) {
            return 1000000.0;
        }
        return mutableMoveResult.cost;
    }

    private boolean willPlaceBucket() {
        CalculationContext calculationContext = new CalculationContext(this.baritone);
        MutableMoveResult mutableMoveResult = new MutableMoveResult();
        return MovementDescend.dynamicFallCost(calculationContext, this.src.x, this.src.y, this.src.z, this.dest.x, this.dest.z, 0.0, calculationContext.get(this.dest.x, this.src.y - 2, this.dest.z), mutableMoveResult);
    }

    @Override
    public MovementState updateState(MovementState movementState) {
        class00753 class007532;
        boolean bl;
        super.updateState(movementState);
        if (movementState.getStatus() != MovementStatus.RUNNING) {
            return movementState;
        }
        BetterBlockPos betterBlockPos2 = this.ctx.playerFeet();
        Rotation rotation = RotationUtils.calcRotationFromVec3d((class06889)this.ctx.playerHead(), (class06889)VecUtils.getBlockPosCenter((class07209)this.dest), (Rotation)this.ctx.playerRotations());
        Rotation rotation2 = null;
        class00500 class005002 = this.ctx.world().method_8320((class07209)this.dest);
        class00891 class008912 = class005002.i();
        if (this.ctx.world().method_8320((class07209)this.dest.below()).N(class00869.EI) && MovementHelper.steppingOnBlocks(this.ctx).stream().allMatch(betterBlockPos -> MovementHelper.canWalkThrough(this.ctx, betterBlockPos))) {
            movementState.setInput(Input.SNEAK, true);
        }
        if (!(bl = class005002.Y().N() instanceof class04644) && this.willPlaceBucket() && !betterBlockPos2.equals((Object)this.dest)) {
            if (!class08044.L((int)this.ctx.player().method_31548().u(STACK_BUCKET_WATER)) || this.ctx.world().method_27983() == class07299.field_25180) {
                return movementState.setStatus(MovementStatus.UNREACHABLE);
            }
            if (this.ctx.player().method_73189().B - (double)this.dest.method_10264() < this.ctx.playerController().getBlockReachDistance() && !this.ctx.player().method_24828()) {
                this.ctx.player().method_31548().N(this.ctx.player().method_31548().u(STACK_BUCKET_WATER));
                rotation2 = new Rotation(rotation.getYaw(), 90.0f);
                if (this.ctx.isLookingAt((class07209)this.dest) || this.ctx.isLookingAt((class07209)this.dest.below())) {
                    movementState.setInput(Input.CLICK_RIGHT, true);
                }
            }
        }
        if (rotation2 != null) {
            movementState.setTarget(new MovementState$MovementTarget(rotation2, true));
        } else {
            movementState.setTarget(new MovementState$MovementTarget(rotation, false));
        }
        if (betterBlockPos2.equals((Object)this.dest) && (this.ctx.player().method_73189().B - (double)betterBlockPos2.method_10264() < 0.094 || bl)) {
            if (bl) {
                if (class08044.L((int)this.ctx.player().method_31548().u(STACK_BUCKET_EMPTY))) {
                    this.ctx.player().method_31548().N(this.ctx.player().method_31548().u(STACK_BUCKET_EMPTY));
                    if (this.ctx.player().method_18798().B >= 0.0) {
                        return movementState.setInput(Input.CLICK_RIGHT, true);
                    }
                    return movementState;
                }
                if (this.ctx.player().method_18798().B >= 0.0) {
                    return movementState.setStatus(MovementStatus.SUCCESS);
                }
            } else {
                return movementState.setStatus(MovementStatus.SUCCESS);
            }
        }
        class06889 class068892 = VecUtils.getBlockPosCenter((class07209)this.dest);
        if (Math.abs(this.ctx.player().method_73189().M + this.ctx.player().method_18798().M - class068892.M) > 0.1 || Math.abs(this.ctx.player().method_73189().Z + this.ctx.player().method_18798().Z - class068892.Z) > 0.1) {
            if (!this.ctx.player().method_24828() && Math.abs(this.ctx.player().method_18798().B) > 0.4) {
                movementState.setInput(Input.SNEAK, true);
            }
            movementState.setInput(Input.MOVE_FORWARD, true);
        }
        if ((class007532 = (class00753)Optional.ofNullable(this.avoid()).map(class07211::E).orElse(null)) == null) {
            class007532 = this.src.method_10059((class00753)this.dest);
        } else {
            double d = Math.abs((double)class007532.method_10263() * (class068892.M - (double)class007532.method_10263() / 2.0 - this.ctx.player().method_73189().M)) + Math.abs((double)class007532.method_10260() * (class068892.Z - (double)class007532.method_10260() / 2.0 - this.ctx.player().method_73189().Z));
            if (d < 0.6) {
                movementState.setInput(Input.MOVE_FORWARD, true);
            } else if (!this.ctx.player().method_24828()) {
                movementState.setInput(Input.SNEAK, false);
            }
        }
        if (rotation2 == null) {
            class06889 class068893 = new class06889(class068892.M + 0.125 * (double)class007532.method_10263(), class068892.B, class068892.Z + 0.125 * (double)class007532.method_10260());
            movementState.setTarget(new MovementState$MovementTarget(RotationUtils.calcRotationFromVec3d((class06889)this.ctx.playerHead(), (class06889)class068893, (Rotation)this.ctx.playerRotations()), false));
        }
        return movementState;
    }
}

