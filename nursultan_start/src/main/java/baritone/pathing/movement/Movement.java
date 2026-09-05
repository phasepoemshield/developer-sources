/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.IBaritone
 *  baritone.api.pathing.movement.IMovement
 *  baritone.api.pathing.movement.MovementStatus
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.IPlayerContext
 *  baritone.api.utils.Rotation
 *  baritone.api.utils.RotationUtils
 *  baritone.api.utils.VecUtils
 *  baritone.api.utils.input.Input
 *  baritone.behavior.PathingBehavior
 *  baritone.utils.BlockStateInterface
 *  minecraft.class00701
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07211
 */
package baritone.pathing.movement;

import baritone.Baritone;
import baritone.api.IBaritone;
import baritone.api.pathing.movement.IMovement;
import baritone.api.pathing.movement.MovementStatus;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.Rotation;
import baritone.api.utils.RotationUtils;
import baritone.api.utils.VecUtils;
import baritone.api.utils.input.Input;
import baritone.behavior.PathingBehavior;
import baritone.pathing.movement.CalculationContext;
import baritone.pathing.movement.MovementHelper;
import baritone.pathing.movement.MovementState;
import baritone.pathing.movement.MovementState$MovementTarget;
import baritone.utils.BlockStateInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import minecraft.class00701;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07211;

public abstract class Movement
implements IMovement,
MovementHelper {
    public static final class07211[] HORIZONTALS_BUT_ALSO_DOWN_____SO_EVERY_DIRECTION_EXCEPT_UP = new class07211[]{class07211.field_11043, class07211.field_11035, class07211.field_11034, class07211.field_11039, class07211.field_11033};
    protected final IBaritone baritone;
    protected final IPlayerContext ctx;
    private MovementState currentState = new MovementState().setStatus(MovementStatus.PREPPING);
    protected final BetterBlockPos src;
    protected final BetterBlockPos dest;
    protected final BetterBlockPos[] positionsToBreak;
    protected final BetterBlockPos positionToPlace;
    private Double cost;
    public List<class07209> toBreakCached = null;
    public List<class07209> toPlaceCached = null;
    public List<class07209> toWalkIntoCached = null;
    private Set<BetterBlockPos> validPositionsCached = null;
    private Boolean calculatedWhileLoaded;

    public Movement(IBaritone iBaritone, BetterBlockPos betterBlockPos, BetterBlockPos betterBlockPos2, BetterBlockPos[] betterBlockPosArray, BetterBlockPos betterBlockPos3) {
        this.baritone = iBaritone;
        this.ctx = iBaritone.getPlayerContext();
        this.src = betterBlockPos;
        this.dest = betterBlockPos2;
        this.positionsToBreak = betterBlockPosArray;
        this.positionToPlace = betterBlockPos3;
    }

    public Movement(IBaritone iBaritone, BetterBlockPos betterBlockPos, BetterBlockPos betterBlockPos2, BetterBlockPos[] betterBlockPosArray) {
        this(iBaritone, betterBlockPos, betterBlockPos2, betterBlockPosArray, null);
    }

    public void reset() {
        this.currentState = new MovementState().setStatus(MovementStatus.PREPPING);
    }

    public MovementStatus update() {
        this.ctx.player().method_31549().y = false;
        this.currentState = this.updateState(this.currentState);
        if (MovementHelper.isLiquid(this.ctx, (class07209)this.ctx.playerFeet()) && this.ctx.player().method_73189().B < (double)this.dest.y + 0.6) {
            this.currentState.setInput(Input.JUMP, true);
        }
        if (this.ctx.player().method_5757()) {
            this.ctx.getSelectedBlock().ifPresent(class072092 -> MovementHelper.switchToBestToolFor(this.ctx, BlockStateInterface.get((IPlayerContext)this.ctx, (class07209)class072092)));
            this.currentState.setInput(Input.CLICK_LEFT, true);
        }
        this.currentState.getTarget().getRotation().ifPresent(rotation -> this.baritone.getLookBehavior().updateTarget(rotation, this.currentState.getTarget().hasToForceRotations()));
        this.baritone.getInputOverrideHandler().clearAllKeys();
        this.currentState.getInputStates().forEach((input, bl) -> this.baritone.getInputOverrideHandler().setInputForceState(input, bl.booleanValue()));
        this.currentState.getInputStates().clear();
        if (this.currentState.getStatus().isComplete()) {
            this.baritone.getInputOverrideHandler().clearAllKeys();
        }
        return this.currentState.getStatus();
    }

    public void override(double d) {
        this.cost = d;
    }

    public double getCost(CalculationContext calculationContext) {
        if (this.cost == null) {
            this.cost = this.calculateCost(calculationContext);
        }
        return this.cost;
    }

    public double getCost() throws NullPointerException {
        return this.cost;
    }

    public BetterBlockPos getSrc() {
        return this.src;
    }

    public BetterBlockPos getDest() {
        return this.dest;
    }

    public List<class07209> toBreak(BlockStateInterface blockStateInterface) {
        if (this.toBreakCached != null) {
            return this.toBreakCached;
        }
        ArrayList<class07209> arrayList = new ArrayList<class07209>();
        for (BetterBlockPos betterBlockPos : this.positionsToBreak) {
            if (MovementHelper.canWalkThrough(blockStateInterface, betterBlockPos.x, betterBlockPos.y, betterBlockPos.z)) continue;
            arrayList.add((class07209)betterBlockPos);
        }
        this.toBreakCached = arrayList;
        return arrayList;
    }

    public class07209[] toBreakAll() {
        return this.positionsToBreak;
    }

    public boolean prepared(MovementState movementState) {
        if (movementState.getStatus() == MovementStatus.WAITING) {
            return true;
        }
        boolean bl = false;
        for (BetterBlockPos betterBlockPos : this.positionsToBreak) {
            if (!this.ctx.world().N(class00701.class, new class00734(0.0, 0.0, 0.0, 1.0, 1.1, 1.0).N((class07209)betterBlockPos)).isEmpty() && ((Boolean)Baritone.settings().pauseMiningForFallingBlocks.value).booleanValue()) {
                return false;
            }
            if (MovementHelper.canWalkThrough(this.ctx, betterBlockPos)) continue;
            bl = true;
            MovementHelper.switchToBestToolFor(this.ctx, BlockStateInterface.get((IPlayerContext)this.ctx, (class07209)betterBlockPos));
            Optional optional = RotationUtils.reachable((IPlayerContext)this.ctx, (class07209)betterBlockPos, (double)this.ctx.playerController().getBlockReachDistance());
            if (optional.isPresent()) {
                Rotation rotation = (Rotation)optional.get();
                movementState.setTarget(new MovementState$MovementTarget(rotation, true));
                if (this.ctx.isLookingAt((class07209)betterBlockPos) || this.ctx.playerRotations().isReallyCloseTo(rotation)) {
                    movementState.setInput(Input.CLICK_LEFT, true);
                }
                return false;
            }
            movementState.setTarget(new MovementState$MovementTarget(RotationUtils.calcRotationFromVec3d((class06889)this.ctx.playerHead(), (class06889)VecUtils.getBlockPosCenter((class07209)betterBlockPos), (Rotation)this.ctx.playerRotations()), true));
            movementState.setInput(Input.CLICK_LEFT, true);
            return false;
        }
        if (bl) {
            movementState.setStatus(MovementStatus.UNREACHABLE);
            return true;
        }
        return true;
    }

    public List<class07209> toPlace(BlockStateInterface blockStateInterface) {
        if (this.toPlaceCached != null) {
            return this.toPlaceCached;
        }
        ArrayList<class07209> arrayList = new ArrayList<class07209>();
        if (this.positionToPlace != null && !MovementHelper.canWalkOn(blockStateInterface, this.positionToPlace.x, this.positionToPlace.y, this.positionToPlace.z)) {
            arrayList.add((class07209)this.positionToPlace);
        }
        this.toPlaceCached = arrayList;
        return arrayList;
    }

    public List<class07209> toWalkInto(BlockStateInterface blockStateInterface) {
        if (this.toWalkIntoCached == null) {
            this.toWalkIntoCached = new ArrayList<class07209>();
        }
        return this.toWalkIntoCached;
    }

    public class07209 getDirection() {
        return this.getDest().method_10059((class00753)this.getSrc());
    }

    protected abstract Set<BetterBlockPos> calculateValidPositions();

    protected boolean playerInValidPosition() {
        return this.getValidPositions().contains(this.ctx.playerFeet()) || this.getValidPositions().contains(((PathingBehavior)this.baritone.getPathingBehavior()).pathStart());
    }

    protected boolean safeToCancel(MovementState movementState) {
        return true;
    }

    public boolean safeToCancel() {
        return this.safeToCancel(this.currentState);
    }

    public void resetBlockCache() {
        this.toBreakCached = null;
        this.toPlaceCached = null;
        this.toWalkIntoCached = null;
    }

    public abstract double calculateCost(CalculationContext var1);

    public void checkLoadedChunk(CalculationContext calculationContext) {
        this.calculatedWhileLoaded = calculationContext.bsi.worldContainsLoadedChunk(this.dest.x, this.dest.z);
    }

    public double recalculateCost(CalculationContext calculationContext) {
        this.cost = null;
        return this.getCost(calculationContext);
    }

    public Set<BetterBlockPos> getValidPositions() {
        if (this.validPositionsCached == null) {
            this.validPositionsCached = this.calculateValidPositions();
            Objects.requireNonNull(this.validPositionsCached);
        }
        return this.validPositionsCached;
    }

    public MovementState updateState(MovementState movementState) {
        if (!this.prepared(movementState)) {
            return movementState.setStatus(MovementStatus.PREPPING);
        }
        if (movementState.getStatus() == MovementStatus.PREPPING) {
            movementState.setStatus(MovementStatus.WAITING);
        }
        if (movementState.getStatus() == MovementStatus.WAITING) {
            movementState.setStatus(MovementStatus.RUNNING);
        }
        return movementState;
    }

    public boolean calculatedWhileLoaded() {
        return this.calculatedWhileLoaded;
    }
}

