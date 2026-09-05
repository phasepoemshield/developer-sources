/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.IBaritone
 *  baritone.api.pathing.calc.IPath
 *  baritone.api.pathing.movement.IMovement
 *  baritone.api.pathing.movement.MovementStatus
 *  baritone.api.pathing.path.IPathExecutor
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.Helper
 *  baritone.api.utils.IPlayerContext
 *  baritone.api.utils.Rotation
 *  baritone.api.utils.RotationUtils
 *  baritone.api.utils.VecUtils
 *  baritone.api.utils.input.Input
 *  baritone.behavior.PathingBehavior
 *  baritone.pathing.calc.AbstractNodeCostSearch
 *  baritone.pathing.movement.CalculationContext
 *  baritone.pathing.movement.Movement
 *  baritone.pathing.movement.MovementHelper
 *  baritone.pathing.movement.movements.MovementAscend
 *  baritone.pathing.movement.movements.MovementDescend
 *  baritone.pathing.movement.movements.MovementDiagonal
 *  baritone.pathing.movement.movements.MovementFall
 *  baritone.pathing.movement.movements.MovementParkour
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class05034
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 */
package baritone.pathing.path;

import baritone.Baritone;
import baritone.api.IBaritone;
import baritone.api.pathing.calc.IPath;
import baritone.api.pathing.movement.IMovement;
import baritone.api.pathing.movement.MovementStatus;
import baritone.api.pathing.path.IPathExecutor;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.Helper;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.Rotation;
import baritone.api.utils.RotationUtils;
import baritone.api.utils.VecUtils;
import baritone.api.utils.input.Input;
import baritone.behavior.PathingBehavior;
import baritone.pathing.calc.AbstractNodeCostSearch;
import baritone.pathing.movement.CalculationContext;
import baritone.pathing.movement.Movement;
import baritone.pathing.movement.MovementHelper;
import baritone.pathing.movement.movements.MovementAscend;
import baritone.pathing.movement.movements.MovementDescend;
import baritone.pathing.movement.movements.MovementDiagonal;
import baritone.pathing.movement.movements.MovementFall;
import baritone.pathing.movement.movements.MovementParkour;
import baritone.pathing.movement.movements.MovementTraverse;
import baritone.pathing.path.CutoffPath;
import baritone.pathing.path.SplicedPath;
import baritone.utils.BlockStateInterface;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class05034;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;

public class PathExecutor
implements IPathExecutor,
Helper {
    private static final double MAX_MAX_DIST_FROM_PATH = 3.0;
    private static final double MAX_DIST_FROM_PATH = 2.0;
    private static final double MAX_TICKS_AWAY = 200.0;
    private final IPath path;
    private int pathPosition;
    private int ticksAway;
    private int ticksOnCurrent;
    private Double currentMovementOriginalCostEstimate;
    private Integer costEstimateIndex;
    private boolean failed;
    private boolean recalcBP = true;
    private HashSet<class07209> toBreak = new HashSet();
    private HashSet<class07209> toPlace = new HashSet();
    private HashSet<class07209> toWalkInto = new HashSet();
    private final PathingBehavior behavior;
    private final IPlayerContext ctx;
    private boolean sprintNextTick;

    public PathExecutor(PathingBehavior pathingBehavior, IPath iPath) {
        this.behavior = pathingBehavior;
        this.ctx = pathingBehavior.ctx;
        this.path = iPath;
        this.pathPosition = 0;
    }

    private void cancel() {
        this.clearKeys();
        this.behavior.baritone.getInputOverrideHandler().getBlockBreakHelper().stopBreakingBlock();
        this.pathPosition = this.path.length() + 3;
        this.failed = true;
    }

    public IPath getPath() {
        return this.path;
    }

    public boolean finished() {
        return this.pathPosition >= this.path.length();
    }

    public boolean onTick() {
        double d;
        List list;
        Collection collection;
        Movement movement;
        class05034<Double, class07209> class050342;
        if (this.pathPosition == this.path.length() - 1) {
            ++this.pathPosition;
        }
        if (this.pathPosition >= this.path.length()) {
            return true;
        }
        Movement movement2 = (Movement)this.path.movements().get(this.pathPosition);
        BetterBlockPos betterBlockPos = this.ctx.playerFeet();
        if (!movement2.getValidPositions().contains(betterBlockPos)) {
            int n;
            for (n = 0; n < this.pathPosition && n < this.path.length(); ++n) {
                if (!((Movement)this.path.movements().get(n)).getValidPositions().contains(betterBlockPos)) continue;
                int n2 = this.pathPosition;
                for (int i = this.pathPosition = n; i <= n2; ++i) {
                    ((IMovement)this.path.movements().get(i)).reset();
                }
                this.onChangeInPathPosition();
                this.onTick();
                return false;
            }
            for (n = this.pathPosition + 3; n < this.path.length() - 1; ++n) {
                if (!((Movement)this.path.movements().get(n)).getValidPositions().contains(betterBlockPos)) continue;
                if (n - this.pathPosition > 2) {
                    this.logDebug("Skipping forward " + (n - this.pathPosition) + " steps, to " + n);
                }
                this.pathPosition = n - 1;
                this.onChangeInPathPosition();
                this.onTick();
                return false;
            }
        }
        if (this.possiblyOffPath(class050342 = this.closestPathPos(this.path), 2.0)) {
            ++this.ticksAway;
            System.out.println("FAR AWAY FROM PATH FOR " + this.ticksAway + " TICKS. Current distance: " + String.valueOf(class050342.N()) + ". Threshold: 2.0");
            if ((double)this.ticksAway > 200.0) {
                this.logDebug("Too far away from path for too long, cancelling path");
                this.cancel();
                return false;
            }
        } else {
            this.ticksAway = 0;
        }
        if (this.possiblyOffPath(class050342, 3.0)) {
            this.logDebug("too far from path");
            this.cancel();
            return false;
        }
        BlockStateInterface blockStateInterface = new BlockStateInterface(this.ctx);
        for (int i = this.pathPosition - 10; i < this.pathPosition + 10; ++i) {
            if (i < 0 || i >= this.path.movements().size()) continue;
            movement = (Movement)this.path.movements().get(i);
            collection = movement.toBreak(blockStateInterface);
            List list2 = movement.toPlace(blockStateInterface);
            list = movement.toWalkInto(blockStateInterface);
            movement.resetBlockCache();
            if (!collection.equals(movement.toBreak(blockStateInterface))) {
                this.recalcBP = true;
            }
            if (!list2.equals(movement.toPlace(blockStateInterface))) {
                this.recalcBP = true;
            }
            if (list.equals(movement.toWalkInto(blockStateInterface))) continue;
            this.recalcBP = true;
        }
        if (this.recalcBP) {
            HashSet hashSet = new HashSet();
            movement = new HashSet();
            collection = new HashSet();
            for (int i = this.pathPosition; i < this.path.movements().size(); ++i) {
                list = (Movement)this.path.movements().get(i);
                hashSet.addAll(list.toBreak(blockStateInterface));
                movement.addAll(list.toPlace(blockStateInterface));
                ((AbstractCollection)collection).addAll(list.toWalkInto(blockStateInterface));
            }
            this.toBreak = hashSet;
            this.toPlace = movement;
            this.toWalkInto = collection;
            this.recalcBP = false;
        }
        if (this.pathPosition < this.path.movements().size() - 1) {
            IMovement iMovement = (IMovement)this.path.movements().get(this.pathPosition + 1);
            if (!this.behavior.baritone.bsi.worldContainsLoadedChunk(iMovement.getDest().x, iMovement.getDest().z)) {
                this.logDebug("Pausing since destination is at edge of loaded chunks");
                this.clearKeys();
                return true;
            }
        }
        boolean bl = movement2.safeToCancel();
        if (this.costEstimateIndex == null || this.costEstimateIndex != this.pathPosition) {
            this.costEstimateIndex = this.pathPosition;
            this.currentMovementOriginalCostEstimate = movement2.getCost();
            for (int i = 1; i < (Integer)Baritone.settings().costVerificationLookahead.value && this.pathPosition + i < this.path.length() - 1; ++i) {
                if (!(((Movement)this.path.movements().get(this.pathPosition + i)).calculateCost(this.behavior.secretInternalGetCalculationContext()) >= 1000000.0) || !bl) continue;
                this.logDebug("Something has changed in the world and a future movement has become impossible. Cancelling.");
                this.cancel();
                return true;
            }
        }
        if ((d = movement2.recalculateCost(this.behavior.secretInternalGetCalculationContext())) >= 1000000.0 && bl) {
            this.logDebug("Something has changed in the world and this movement has become impossible. Cancelling.");
            this.cancel();
            return true;
        }
        if (!movement2.calculatedWhileLoaded() && d - this.currentMovementOriginalCostEstimate > (Double)Baritone.settings().maxCostIncrease.value && bl) {
            this.logDebug("Original cost " + this.currentMovementOriginalCostEstimate + " current cost " + d + ". Cancelling.");
            this.cancel();
            return true;
        }
        if (this.shouldPause()) {
            this.logDebug("Pausing since current best path is a backtrack");
            this.clearKeys();
            return true;
        }
        MovementStatus movementStatus = movement2.update();
        if (movementStatus == MovementStatus.UNREACHABLE || movementStatus == MovementStatus.FAILED) {
            this.logDebug("Movement returns status " + String.valueOf(movementStatus));
            this.cancel();
            return true;
        }
        if (movementStatus == MovementStatus.SUCCESS) {
            ++this.pathPosition;
            this.onChangeInPathPosition();
            this.onTick();
            return true;
        }
        this.sprintNextTick = this.shouldSprintNextTick();
        if (!this.sprintNextTick) {
            this.ctx.player().method_5728(false);
        }
        ++this.ticksOnCurrent;
        if ((double)this.ticksOnCurrent > this.currentMovementOriginalCostEstimate + (double)((Integer)Baritone.settings().movementTimeoutTicks.value).intValue()) {
            this.logDebug("This movement has taken too long (" + this.ticksOnCurrent + " ticks, expected " + this.currentMovementOriginalCostEstimate + "). Cancelling.");
            this.cancel();
            return true;
        }
        return bl;
    }

    public int getPosition() {
        return this.pathPosition;
    }

    public boolean failed() {
        return this.failed;
    }

    public PathExecutor trySplice(PathExecutor pathExecutor) {
        if (pathExecutor == null) {
            return this.cutIfTooLong();
        }
        return SplicedPath.trySplice(this.path, pathExecutor.path, false).map(splicedPath -> {
            if (!splicedPath.getDest().equals((Object)pathExecutor.getPath().getDest())) {
                throw new IllegalStateException(String.format("Path has end %s instead of %s after splicing", splicedPath.getDest(), pathExecutor.getPath().getDest()));
            }
            PathExecutor pathExecutor2 = new PathExecutor(this.behavior, (IPath)splicedPath);
            pathExecutor2.pathPosition = this.pathPosition;
            pathExecutor2.currentMovementOriginalCostEstimate = this.currentMovementOriginalCostEstimate;
            pathExecutor2.costEstimateIndex = this.costEstimateIndex;
            pathExecutor2.ticksOnCurrent = this.ticksOnCurrent;
            return pathExecutor2;
        }).orElseGet(this::cutIfTooLong);
    }

    public Set<class07209> toBreak() {
        return Collections.unmodifiableSet(this.toBreak);
    }

    public Set<class07209> toPlace() {
        return Collections.unmodifiableSet(this.toPlace);
    }

    public Set<class07209> toWalkInto() {
        return Collections.unmodifiableSet(this.toWalkInto);
    }

    private void clearKeys() {
        this.behavior.baritone.getInputOverrideHandler().clearAllKeys();
    }

    private static boolean skipNow(IPlayerContext iPlayerContext, IMovement iMovement) {
        double d = Math.abs((double)iMovement.getDirection().method_10263() * ((double)iMovement.getSrc().z + 0.5 - iPlayerContext.player().method_73189().Z)) + Math.abs((double)iMovement.getDirection().method_10260() * ((double)iMovement.getSrc().x + 0.5 - iPlayerContext.player().method_73189().M));
        if (d > 0.1) {
            return false;
        }
        class07209 class072092 = iMovement.getSrc().method_10059((class00753)iMovement.getDirection()).method_10086(2);
        if (MovementHelper.fullyPassable((IPlayerContext)iPlayerContext, (class07209)class072092)) {
            return true;
        }
        double d2 = Math.abs((double)iMovement.getDirection().method_10263() * ((double)class072092.method_10263() + 0.5 - iPlayerContext.player().method_73189().M)) + Math.abs((double)iMovement.getDirection().method_10260() * ((double)class072092.method_10260() + 0.5 - iPlayerContext.player().method_73189().Z));
        return d2 > 0.8;
    }

    private boolean shouldSprintNextTick() {
        IMovement iMovement;
        boolean bl = this.behavior.baritone.getInputOverrideHandler().isInputForcedDown(Input.SPRINT);
        this.behavior.baritone.getInputOverrideHandler().setInputForceState(Input.SPRINT, false);
        if (!new CalculationContext((IBaritone)this.behavior.baritone, (boolean)false).canSprint) {
            return false;
        }
        IMovement iMovement2 = (IMovement)this.path.movements().get(this.pathPosition);
        if (iMovement2 instanceof MovementTraverse && this.pathPosition < this.path.length() - 3 && (iMovement = (IMovement)this.path.movements().get(this.pathPosition + 1)) instanceof MovementAscend && PathExecutor.sprintableAscend(this.ctx, (MovementTraverse)iMovement2, (MovementAscend)iMovement, (IMovement)this.path.movements().get(this.pathPosition + 2))) {
            if (PathExecutor.skipNow(this.ctx, iMovement2)) {
                this.logDebug("Skipping traverse to straight ascend");
                ++this.pathPosition;
                this.onChangeInPathPosition();
                this.onTick();
                this.behavior.baritone.getInputOverrideHandler().setInputForceState(Input.JUMP, true);
                return true;
            }
            this.logDebug("Too far to the side to safely sprint ascend");
        }
        if (bl) {
            return true;
        }
        if (iMovement2 instanceof MovementDescend) {
            if (this.pathPosition < this.path.length() - 2 && MovementHelper.canUseFrostWalker((IPlayerContext)this.ctx, (class07209)(iMovement = (IMovement)this.path.movements().get(this.pathPosition + 1)).getDest().below()) && (iMovement instanceof MovementTraverse || iMovement instanceof MovementParkour)) {
                boolean bl2;
                boolean bl3 = (Boolean)Baritone.settings().allowPlace.value != false && this.behavior.baritone.getInventoryBehavior().hasGenericThrowaway() && iMovement instanceof MovementParkour;
                boolean bl4 = bl2 = !iMovement2.getDirection().method_10084().method_10081((class00753)iMovement.getDirection()).equals((Object)class07209.field_10980) && iMovement2.getDirection().method_10084().method_10075((class00753)iMovement.getDirection()).equals((Object)class07209.field_10980);
                if (bl2 && !bl3) {
                    ((MovementDescend)iMovement2).forceSafeMode();
                }
            }
            if (((MovementDescend)iMovement2).safeMode() && !((MovementDescend)iMovement2).skipToAscend()) {
                this.logDebug("Sprinting would be unsafe");
                return false;
            }
            if (this.pathPosition < this.path.length() - 2) {
                iMovement = (IMovement)this.path.movements().get(this.pathPosition + 1);
                if (iMovement instanceof MovementAscend && iMovement2.getDirection().method_10084().equals((Object)iMovement.getDirection().method_10074())) {
                    ++this.pathPosition;
                    this.onChangeInPathPosition();
                    this.onTick();
                    this.logDebug("Skipping descend to straight ascend");
                    return true;
                }
                if (PathExecutor.canSprintFromDescendInto(this.ctx, iMovement2, iMovement)) {
                    IMovement iMovement3;
                    if (iMovement instanceof MovementDescend && this.pathPosition < this.path.length() - 3 && (iMovement3 = (IMovement)this.path.movements().get(this.pathPosition + 2)) instanceof MovementDescend && !PathExecutor.canSprintFromDescendInto(this.ctx, iMovement, iMovement3)) {
                        return false;
                    }
                    if (this.ctx.playerFeet().equals((Object)iMovement2.getDest())) {
                        ++this.pathPosition;
                        this.onChangeInPathPosition();
                        this.onTick();
                    }
                    return true;
                }
            }
        }
        if (iMovement2 instanceof MovementAscend && this.pathPosition != 0) {
            BetterBlockPos betterBlockPos;
            iMovement = (IMovement)this.path.movements().get(this.pathPosition - 1);
            if (iMovement instanceof MovementDescend && iMovement.getDirection().method_10084().equals((Object)iMovement2.getDirection().method_10074()) && this.ctx.player().method_73189().B >= (double)(betterBlockPos = iMovement2.getSrc().above()).method_10264() - 0.07) {
                this.behavior.baritone.getInputOverrideHandler().setInputForceState(Input.JUMP, false);
                return true;
            }
            if (this.pathPosition < this.path.length() - 2 && iMovement instanceof MovementTraverse && PathExecutor.sprintableAscend(this.ctx, (MovementTraverse)iMovement, (MovementAscend)iMovement2, (IMovement)this.path.movements().get(this.pathPosition + 1))) {
                return true;
            }
        }
        if (iMovement2 instanceof MovementFall && (iMovement = this.overrideFall((MovementFall)iMovement2)) != null) {
            BetterBlockPos betterBlockPos = new BetterBlockPos((class07209)iMovement.y());
            if (!this.path.positions().contains(betterBlockPos)) {
                throw new IllegalStateException(String.format("Fall override at %s %s %s returned illegal destination %s %s %s", iMovement2.getSrc(), betterBlockPos));
            }
            if (this.ctx.playerFeet().equals((Object)betterBlockPos)) {
                this.pathPosition = this.path.positions().indexOf(betterBlockPos);
                this.onChangeInPathPosition();
                this.onTick();
                return true;
            }
            this.clearKeys();
            this.behavior.baritone.getLookBehavior().updateTarget(RotationUtils.calcRotationFromVec3d((class06889)this.ctx.playerHead(), (class06889)((class06889)iMovement.N()), (Rotation)this.ctx.playerRotations()), false);
            this.behavior.baritone.getInputOverrideHandler().setInputForceState(Input.MOVE_FORWARD, true);
            return true;
        }
        return false;
    }

    private void onChangeInPathPosition() {
        this.clearKeys();
        this.ticksOnCurrent = 0;
    }

    private static boolean canSprintFromDescendInto(IPlayerContext iPlayerContext, IMovement iMovement, IMovement iMovement2) {
        if (iMovement2 instanceof MovementDescend && iMovement2.getDirection().equals((Object)iMovement.getDirection())) {
            return true;
        }
        if (!MovementHelper.canWalkOn((IPlayerContext)iPlayerContext, (class07209)iMovement.getDest().method_10081((class00753)iMovement.getDirection()))) {
            return false;
        }
        if (iMovement2 instanceof MovementTraverse && iMovement2.getDirection().equals((Object)iMovement.getDirection())) {
            return true;
        }
        return iMovement2 instanceof MovementDiagonal && (Boolean)Baritone.settings().allowOvershootDiagonalDescend.value != false;
    }

    public boolean isSprinting() {
        return this.sprintNextTick;
    }

    public boolean snipsnapifpossible() {
        if (!this.ctx.player().method_24828() && this.ctx.world().method_8316((class07209)this.ctx.playerFeet()).W()) {
            return false;
        }
        if (this.ctx.player().method_18798().B < -0.1) {
            return false;
        }
        int n = this.path.positions().indexOf(this.ctx.playerFeet());
        if (n == -1) {
            return false;
        }
        this.pathPosition = n;
        this.clearKeys();
        return true;
    }

    private class05034<Double, class07209> closestPathPos(IPath iPath) {
        double d = -1.0;
        class07209 class072092 = null;
        for (IMovement iMovement : iPath.movements()) {
            for (class07209 class072093 : ((Movement)iMovement).getValidPositions()) {
                double d2 = VecUtils.entityDistanceToCenter((class07049)this.ctx.player(), (class07209)class072093);
                if (!(d2 < d) && d != -1.0) continue;
                d = d2;
                class072092 = class072093;
            }
        }
        return new class05034((Object)d, class072092);
    }

    private boolean possiblyOffPath(class05034<Double, class07209> class050342, double d) {
        double d2 = (Double)class050342.N();
        if (d2 > d) {
            if (this.path.movements().get(this.pathPosition) instanceof MovementFall) {
                class07209 class072092 = (class07209)this.path.positions().get(this.pathPosition + 1);
                return VecUtils.entityFlatDistanceToCenter((class07049)this.ctx.player(), (class07209)class072092) >= d;
            }
            return true;
        }
        return false;
    }

    private boolean shouldPause() {
        Optional optional = this.behavior.getInProgress();
        if (!optional.isPresent()) {
            return false;
        }
        if (!this.ctx.player().method_24828()) {
            return false;
        }
        if (!MovementHelper.canWalkOn((IPlayerContext)this.ctx, (BetterBlockPos)this.ctx.playerFeet().below())) {
            return false;
        }
        if (!MovementHelper.canWalkThrough((IPlayerContext)this.ctx, (BetterBlockPos)this.ctx.playerFeet()) || !MovementHelper.canWalkThrough((IPlayerContext)this.ctx, (BetterBlockPos)this.ctx.playerFeet().above())) {
            return false;
        }
        if (!((IMovement)this.path.movements().get(this.pathPosition)).safeToCancel()) {
            return false;
        }
        Optional optional2 = ((AbstractNodeCostSearch)optional.get()).bestPathSoFar();
        if (!optional2.isPresent()) {
            return false;
        }
        List list = ((IPath)optional2.get()).positions();
        if (list.size() < 3) {
            return false;
        }
        list = list.subList(1, list.size());
        return list.contains(this.ctx.playerFeet());
    }

    private static boolean sprintableAscend(IPlayerContext iPlayerContext, MovementTraverse movementTraverse, MovementAscend movementAscend, IMovement iMovement) {
        if (!((Boolean)Baritone.settings().sprintAscends.value).booleanValue()) {
            return false;
        }
        if (!movementTraverse.getDirection().equals((Object)movementAscend.getDirection().method_10074())) {
            return false;
        }
        if (iMovement.getDirection().method_10263() != movementAscend.getDirection().method_10263() || iMovement.getDirection().method_10260() != movementAscend.getDirection().method_10260()) {
            return false;
        }
        if (!MovementHelper.canWalkOn((IPlayerContext)iPlayerContext, (BetterBlockPos)movementTraverse.getDest().below())) {
            return false;
        }
        if (!MovementHelper.canWalkOn((IPlayerContext)iPlayerContext, (BetterBlockPos)movementAscend.getDest().below())) {
            return false;
        }
        if (!movementAscend.toBreakCached.isEmpty()) {
            return false;
        }
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 3; ++j) {
                BetterBlockPos betterBlockPos = movementTraverse.getSrc().above(j);
                if (i == 1) {
                    betterBlockPos = betterBlockPos.method_10081((class00753)movementTraverse.getDirection());
                }
                if (MovementHelper.fullyPassable((IPlayerContext)iPlayerContext, (class07209)betterBlockPos)) continue;
                return false;
            }
        }
        if (MovementHelper.avoidWalkingInto((class00500)iPlayerContext.world().method_8320((class07209)movementTraverse.getSrc().above(3)))) {
            return false;
        }
        return !MovementHelper.avoidWalkingInto((class00500)iPlayerContext.world().method_8320((class07209)movementAscend.getDest().above(2)));
    }

    private class05034<class06889, class07209> overrideFall(MovementFall movementFall) {
        IMovement iMovement;
        int n;
        class07209 class072092 = movementFall.getDirection();
        if (class072092.method_10264() < -3) {
            return null;
        }
        if (!movementFall.toBreakCached.isEmpty()) {
            return null;
        }
        class00753 class007532 = new class00753(class072092.method_10263(), 0, class072092.method_10260());
        block0: for (n = this.pathPosition + 1; n < this.path.length() - 1 && n < this.pathPosition + 3 && (iMovement = (IMovement)this.path.movements().get(n)) instanceof MovementTraverse && class007532.equals((Object)iMovement.getDirection()); ++n) {
            for (int i = iMovement.getDest().y; i <= movementFall.getSrc().y + 1; ++i) {
                class07209 class072093 = new class07209(iMovement.getDest().x, i, iMovement.getDest().z);
                if (!MovementHelper.fullyPassable((IPlayerContext)this.ctx, (class07209)class072093)) break block0;
            }
            if (!MovementHelper.canWalkOn((IPlayerContext)this.ctx, (BetterBlockPos)iMovement.getDest().below())) break;
        }
        if (--n == this.pathPosition) {
            return null;
        }
        double d = (double)(n - this.pathPosition) - 0.4;
        return new class05034((Object)new class06889((double)class007532.method_10263() * d + (double)movementFall.getDest().x + 0.5, (double)movementFall.getDest().y, (double)class007532.method_10260() * d + (double)movementFall.getDest().z + 0.5), (Object)movementFall.getDest().method_10069(class007532.method_10263() * (n - this.pathPosition), 0, class007532.method_10260() * (n - this.pathPosition)));
    }

    private PathExecutor cutIfTooLong() {
        if (this.pathPosition > (Integer)Baritone.settings().maxPathHistoryLength.value) {
            int n = (Integer)Baritone.settings().pathHistoryCutoffAmount.value;
            CutoffPath cutoffPath = new CutoffPath(this.path, n, this.path.length() - 1);
            if (!cutoffPath.getDest().equals((Object)this.path.getDest())) {
                throw new IllegalStateException(String.format("Path has end %s instead of %s after trimming its start", cutoffPath.getDest(), this.path.getDest()));
            }
            this.logDebug("Discarding earliest segment movements, length cut from " + this.path.length() + " to " + cutoffPath.length());
            PathExecutor pathExecutor = new PathExecutor(this.behavior, cutoffPath);
            pathExecutor.pathPosition = this.pathPosition - n;
            pathExecutor.currentMovementOriginalCostEstimate = this.currentMovementOriginalCostEstimate;
            if (this.costEstimateIndex != null) {
                pathExecutor.costEstimateIndex = this.costEstimateIndex - n;
            }
            pathExecutor.ticksOnCurrent = this.ticksOnCurrent;
            return pathExecutor;
        }
        return this;
    }
}

