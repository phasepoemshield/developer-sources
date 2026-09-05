/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.IBaritone
 *  baritone.api.process.PathingCommand
 *  baritone.api.process.PathingCommandType
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.Rotation
 *  baritone.api.utils.input.Input
 *  baritone.pathing.movement.Movement
 *  baritone.pathing.movement.MovementHelper
 *  baritone.pathing.movement.MovementState
 *  minecraft.class00500
 *  minecraft.class00561
 *  minecraft.class00869
 *  minecraft.class07209
 */
package baritone.process;

import baritone.Baritone;
import baritone.api.IBaritone;
import baritone.api.process.PathingCommand;
import baritone.api.process.PathingCommandType;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.Rotation;
import baritone.api.utils.input.Input;
import baritone.pathing.movement.Movement;
import baritone.pathing.movement.MovementHelper;
import baritone.pathing.movement.MovementState;
import baritone.pathing.path.PathExecutor;
import baritone.utils.BaritoneProcessHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import minecraft.class00500;
import minecraft.class00561;
import minecraft.class00869;
import minecraft.class07209;

public final class BackfillProcess
extends BaritoneProcessHelper {
    public HashMap<class07209, class00500> blocksToReplace = new HashMap();

    public BackfillProcess(Baritone baritone) {
        super(baritone);
    }

    public double priority() {
        return 5.0;
    }

    public boolean isActive() {
        if (this.ctx.player() == null || this.ctx.world() == null) {
            return false;
        }
        if (!((Boolean)Baritone.settings().backfill.value).booleanValue()) {
            return false;
        }
        if (((Boolean)Baritone.settings().allowParkour.value).booleanValue()) {
            this.logDirect("Backfill cannot be used with allowParkour true");
            Baritone.settings().backfill.value = false;
            return false;
        }
        for (class07209 class072092 : new ArrayList<class07209>(this.blocksToReplace.keySet())) {
            if (!(this.ctx.world().method_8500(class072092) instanceof class00561) && this.ctx.world().method_8320(class072092).i() == class00869.N) continue;
            this.blocksToReplace.remove(class072092);
        }
        this.amIBreakingABlockHMMMMMMM();
        this.baritone.getInputOverrideHandler().clearAllKeys();
        return !this.toFillIn().isEmpty();
    }

    public PathingCommand onTick(boolean bl, boolean bl2) {
        if (!bl2) {
            return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
        }
        this.baritone.getInputOverrideHandler().clearAllKeys();
        block5: for (class07209 class072092 : this.toFillIn()) {
            MovementState movementState = new MovementState();
            switch (MovementHelper.attemptToPlaceABlock((MovementState)movementState, (IBaritone)this.baritone, (class07209)class072092, (boolean)false, (boolean)false)) {
                case NO_OPTION: {
                    continue block5;
                }
                case READY_TO_PLACE: {
                    this.baritone.getInputOverrideHandler().setInputForceState(Input.CLICK_RIGHT, true);
                    return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
                }
                case ATTEMPTING: {
                    this.baritone.getLookBehavior().updateTarget((Rotation)movementState.getTarget().getRotation().get(), true);
                    return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
                }
            }
            throw new IllegalStateException();
        }
        return new PathingCommand(null, PathingCommandType.DEFER);
    }

    public List<class07209> toFillIn() {
        return this.blocksToReplace.keySet().stream().filter(class072092 -> this.ctx.world().method_8320(class072092).i() == class00869.N).filter(class072092 -> this.baritone.getBuilderProcess().placementPlausible((class07209)class072092, class00869.z.W())).filter(class072092 -> !this.partOfCurrentMovement((class07209)class072092)).sorted(Comparator.comparingDouble(arg_0 -> ((BetterBlockPos)this.ctx.playerFeet()).method_10262(arg_0)).reversed()).collect(Collectors.toList());
    }

    private boolean partOfCurrentMovement(class07209 class072092) {
        PathExecutor pathExecutor = this.baritone.getPathingBehavior().getCurrent();
        if (pathExecutor == null || pathExecutor.finished() || pathExecutor.failed()) {
            return false;
        }
        Movement movement = (Movement)pathExecutor.getPath().movements().get(pathExecutor.getPosition());
        return Arrays.asList(movement.toBreakAll()).contains(class072092);
    }

    private void amIBreakingABlockHMMMMMMM() {
        if (!this.ctx.getSelectedBlock().isPresent() || !this.baritone.getPathingBehavior().isPathing()) {
            return;
        }
        this.blocksToReplace.put((class07209)this.ctx.getSelectedBlock().get(), this.ctx.world().method_8320((class07209)this.ctx.getSelectedBlock().get()));
    }

    public String displayName0() {
        return "Backfill";
    }

    public void onLostControl() {
        if (this.blocksToReplace != null && !this.blocksToReplace.isEmpty()) {
            this.blocksToReplace.clear();
        }
    }

    @Override
    public boolean isTemporary() {
        return true;
    }
}

