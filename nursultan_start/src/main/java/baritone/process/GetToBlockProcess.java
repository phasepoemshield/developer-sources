/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalBlock
 *  baritone.api.pathing.goals.GoalComposite
 *  baritone.api.pathing.goals.GoalGetToBlock
 *  baritone.api.pathing.goals.GoalTwoBlocks
 *  baritone.api.process.IGetToBlockProcess
 *  baritone.api.process.PathingCommand
 *  baritone.api.process.PathingCommandType
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.BlockOptionalMeta
 *  baritone.api.utils.BlockOptionalMetaLookup
 *  baritone.api.utils.IPlayerContext
 *  baritone.api.utils.Rotation
 *  baritone.api.utils.RotationUtils
 *  baritone.api.utils.input.Input
 *  baritone.pathing.movement.CalculationContext
 *  baritone.pathing.movement.MovementHelper
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class07209
 *  minecraft.class07482
 *  minecraft.class07492
 */
package baritone.process;

import baritone.Baritone;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalComposite;
import baritone.api.pathing.goals.GoalGetToBlock;
import baritone.api.pathing.goals.GoalTwoBlocks;
import baritone.api.process.IGetToBlockProcess;
import baritone.api.process.PathingCommand;
import baritone.api.process.PathingCommandType;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.BlockOptionalMeta;
import baritone.api.utils.BlockOptionalMetaLookup;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.Rotation;
import baritone.api.utils.RotationUtils;
import baritone.api.utils.input.Input;
import baritone.pathing.movement.CalculationContext;
import baritone.pathing.movement.MovementHelper;
import baritone.process.GetToBlockProcess$1;
import baritone.process.GetToBlockProcess$GetToBlockCalculationContext;
import baritone.process.MineProcess;
import baritone.utils.BaritoneProcessHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class07209;
import minecraft.class07482;
import minecraft.class07492;

public final class GetToBlockProcess
extends BaritoneProcessHelper
implements IGetToBlockProcess {
    private BlockOptionalMeta gettingTo;
    private List<class07209> knownLocations;
    private List<class07209> blacklist;
    private class07209 start;
    private int tickCount = 0;
    private int arrivalTickCount = 0;

    public GetToBlockProcess(Baritone baritone) {
        super(baritone);
    }

    public boolean isActive() {
        return this.gettingTo != null;
    }

    public synchronized PathingCommand onTick(boolean bl, boolean bl2) {
        if (this.knownLocations == null) {
            this.rescan(new ArrayList<class07209>(), new GetToBlockProcess$GetToBlockCalculationContext(this, false));
        }
        if (this.knownLocations.isEmpty()) {
            if (((Boolean)Baritone.settings().exploreForBlocks.value).booleanValue() && !bl) {
                return new PathingCommand((Goal)new GetToBlockProcess$1(this, 1.0, this.start), PathingCommandType.FORCE_REVALIDATE_GOAL_AND_PATH);
            }
            this.logDirect("No known locations of " + String.valueOf(this.gettingTo) + ", canceling GetToBlock");
            if (bl2) {
                this.onLostControl();
            }
            return new PathingCommand(null, PathingCommandType.CANCEL_AND_SET_GOAL);
        }
        GoalComposite goalComposite = new GoalComposite((Goal[])this.knownLocations.stream().map(this::createGoal).toArray(Goal[]::new));
        if (bl) {
            if (((Boolean)Baritone.settings().blacklistClosestOnFailure.value).booleanValue()) {
                this.logDirect("Unable to find any path to " + String.valueOf(this.gettingTo) + ", blacklisting presumably unreachable closest instances...");
                this.blacklistClosest();
                return this.onTick(false, bl2);
            }
            this.logDirect("Unable to find any path to " + String.valueOf(this.gettingTo) + ", canceling GetToBlock");
            if (bl2) {
                this.onLostControl();
            }
            return new PathingCommand((Goal)goalComposite, PathingCommandType.CANCEL_AND_SET_GOAL);
        }
        int n = (Integer)Baritone.settings().mineGoalUpdateInterval.value;
        if (n != 0 && this.tickCount++ % n == 0) {
            ArrayList<class07209> arrayList = new ArrayList<class07209>(this.knownLocations);
            GetToBlockProcess$GetToBlockCalculationContext getToBlockProcess$GetToBlockCalculationContext = new GetToBlockProcess$GetToBlockCalculationContext(this, true);
            Baritone.getExecutor().execute(() -> this.rescan(arrayList, getToBlockProcess$GetToBlockCalculationContext));
        }
        if (goalComposite.isInGoal((class07209)this.ctx.playerFeet()) && goalComposite.isInGoal((class07209)this.baritone.getPathingBehavior().pathStart()) && bl2) {
            if (this.rightClickOnArrival(this.gettingTo.getBlock())) {
                if (this.rightClick()) {
                    this.onLostControl();
                    return new PathingCommand(null, PathingCommandType.CANCEL_AND_SET_GOAL);
                }
            } else {
                this.onLostControl();
                return new PathingCommand(null, PathingCommandType.CANCEL_AND_SET_GOAL);
            }
        }
        return new PathingCommand((Goal)goalComposite, PathingCommandType.REVALIDATE_GOAL_AND_PATH);
    }

    private synchronized void rescan(List<class07209> list, CalculationContext calculationContext) {
        List<class07209> list2 = MineProcess.searchWorld(calculationContext, new BlockOptionalMetaLookup(new BlockOptionalMeta[]{this.gettingTo}), 64, list, this.blacklist, Collections.emptyList());
        list2.removeIf(this.blacklist::contains);
        this.knownLocations = list2;
    }

    public void getToBlock(BlockOptionalMeta blockOptionalMeta) {
        this.onLostControl();
        this.gettingTo = blockOptionalMeta;
        this.start = this.ctx.playerFeet();
        this.blacklist = new ArrayList<class07209>();
        this.arrivalTickCount = 0;
        this.rescan(new ArrayList<class07209>(), new GetToBlockProcess$GetToBlockCalculationContext(this, false));
    }

    private Goal createGoal(class07209 class072092) {
        if (this.walkIntoInsteadOfAdjacent(this.gettingTo.getBlock())) {
            return new GoalTwoBlocks(class072092);
        }
        if (this.blockOnTopMustBeRemoved(this.gettingTo.getBlock()) && MovementHelper.isBlockNormalCube((class00500)this.baritone.bsi.get0(class072092.method_10084()))) {
            return new GoalBlock(class072092.method_10084());
        }
        return new GoalGetToBlock(class072092);
    }

    private boolean rightClick() {
        for (class07209 class072092 : this.knownLocations) {
            Optional optional = RotationUtils.reachable((IPlayerContext)this.ctx, (class07209)class072092, (double)this.ctx.playerController().getBlockReachDistance());
            if (!optional.isPresent()) continue;
            this.baritone.getLookBehavior().updateTarget((Rotation)optional.get(), true);
            if (this.knownLocations.contains(this.ctx.getSelectedBlock().orElse(null))) {
                this.baritone.getInputOverrideHandler().setInputForceState(Input.CLICK_RIGHT, true);
                System.out.println((class07482)this.ctx.player().fields_07fa3311b0e9d3e9b883d09222919bf5a_3);
                if (!((class07482)this.ctx.player().fields_07fa3311b0e9d3e9b883d09222919bf5a_3 instanceof class07492)) {
                    return true;
                }
            }
            if (this.arrivalTickCount++ > 20) {
                this.logDirect("Right click timed out");
                return true;
            }
            return false;
        }
        this.logDirect("Arrived but failed to right click open");
        return true;
    }

    private boolean blockOnTopMustBeRemoved(class00891 class008912) {
        if (!this.rightClickOnArrival(class008912)) {
            return false;
        }
        return class008912 == class00869.Mt || class008912 == class00869.LA || class008912 == class00869.BH;
    }

    private boolean walkIntoInsteadOfAdjacent(class00891 class008912) {
        if (!((Boolean)Baritone.settings().enterPortal.value).booleanValue()) {
            return false;
        }
        return class008912 == class00869.iq;
    }

    private boolean rightClickOnArrival(class00891 class008912) {
        if (!((Boolean)Baritone.settings().rightClickContainerOnArrival.value).booleanValue()) {
            return false;
        }
        return class008912 == class00869.LD || class008912 == class00869.uN || class008912 == class00869.Pf || class008912 == class00869.Mt || class008912 == class00869.LA || class008912 == class00869.BH;
    }

    static /* synthetic */ Baritone access$001(GetToBlockProcess getToBlockProcess) {
        return getToBlockProcess.baritone;
    }

    public synchronized boolean blacklistClosest() {
        ArrayList<class07209> arrayList = new ArrayList<class07209>();
        this.knownLocations.stream().min(Comparator.comparingDouble(arg_0 -> ((BetterBlockPos)this.ctx.playerFeet()).method_10262(arg_0))).ifPresent(arrayList::add);
        block2: while (true) {
            block3: for (class07209 class072092 : this.knownLocations) {
                for (class07209 class072093 : arrayList) {
                    if (!this.areAdjacent(class072092, class072093)) continue;
                    arrayList.add(class072092);
                    this.knownLocations.remove(class072092);
                    continue block2;
                    continue block3;
                }
            }
            break;
        }
        switch (arrayList.size()) {
            default: 
        }
        this.logDebug("Blacklisting unreachable locations " + String.valueOf(arrayList));
        this.blacklist.addAll(arrayList);
        return !arrayList.isEmpty();
    }

    public String displayName0() {
        if (this.knownLocations.isEmpty()) {
            return "Exploring randomly to find " + String.valueOf(this.gettingTo) + ", no known locations";
        }
        return "Get To " + String.valueOf(this.gettingTo) + ", " + this.knownLocations.size() + " known locations";
    }

    public synchronized void onLostControl() {
        this.gettingTo = null;
        this.knownLocations = null;
        this.start = null;
        this.blacklist = null;
        this.baritone.getInputOverrideHandler().clearAllKeys();
    }

    private boolean areAdjacent(class07209 class072092, class07209 class072093) {
        int n;
        int n2;
        int n3 = Math.abs(class072092.method_10263() - class072093.method_10263());
        return n3 + (n2 = Math.abs(class072092.method_10264() - class072093.method_10264())) + (n = Math.abs(class072092.method_10260() - class072093.method_10260())) == 1;
    }
}

