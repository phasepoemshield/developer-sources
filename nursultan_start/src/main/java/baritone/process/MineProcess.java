/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalBlock
 *  baritone.api.pathing.goals.GoalComposite
 *  baritone.api.pathing.goals.GoalRunAway
 *  baritone.api.pathing.goals.GoalTwoBlocks
 *  baritone.api.process.IMineProcess
 *  baritone.api.process.PathingCommand
 *  baritone.api.process.PathingCommandType
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.BlockOptionalMeta
 *  baritone.api.utils.BlockOptionalMetaLookup
 *  baritone.api.utils.BlockUtils
 *  baritone.api.utils.IPlayerContext
 *  baritone.api.utils.Rotation
 *  baritone.api.utils.RotationUtils
 *  baritone.api.utils.input.Input
 *  baritone.cache.CachedChunk
 *  baritone.pathing.movement.CalculationContext
 *  baritone.pathing.movement.MovementHelper
 *  minecraft.class00500
 *  minecraft.class00717
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class03448
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07204
 *  minecraft.class07209
 *  minecraft.class07662
 */
package baritone.process;

import baritone.Baritone;
import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalComposite;
import baritone.api.pathing.goals.GoalRunAway;
import baritone.api.pathing.goals.GoalTwoBlocks;
import baritone.api.process.IMineProcess;
import baritone.api.process.PathingCommand;
import baritone.api.process.PathingCommandType;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.BlockOptionalMeta;
import baritone.api.utils.BlockOptionalMetaLookup;
import baritone.api.utils.BlockUtils;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.Rotation;
import baritone.api.utils.RotationUtils;
import baritone.api.utils.input.Input;
import baritone.cache.CachedChunk;
import baritone.pathing.movement.CalculationContext;
import baritone.pathing.movement.MovementHelper;
import baritone.process.MineProcess$1;
import baritone.process.MineProcess$GoalThreeBlocks;
import baritone.utils.BaritoneProcessHelper;
import baritone.utils.BlockStateInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import minecraft.class00500;
import minecraft.class00717;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class03448;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07204;
import minecraft.class07209;
import minecraft.class07662;

public final class MineProcess
extends BaritoneProcessHelper
implements IMineProcess {
    private BlockOptionalMetaLookup filter;
    private List<class07209> knownOreLocations;
    private List<class07209> blacklist;
    private Map<class07209, Long> anticipatedDrops;
    private class07209 branchPoint;
    private GoalRunAway branchPointRunaway;
    private int desiredQuantity;
    private int tickCount;

    public void mine(int n, BlockOptionalMetaLookup blockOptionalMetaLookup) {
        this.filter = blockOptionalMetaLookup;
        if (this.filterFilter() == null) {
            this.filter = null;
        }
        this.desiredQuantity = n;
        this.knownOreLocations = new ArrayList<class07209>();
        this.blacklist = new ArrayList<class07209>();
        this.branchPoint = null;
        this.branchPointRunaway = null;
        this.anticipatedDrops = new HashMap<class07209, Long>();
        if (blockOptionalMetaLookup != null) {
            this.rescan(new ArrayList<class07209>(), new CalculationContext((IBaritone)this.baritone));
        }
    }

    private Goal coalesce(class07209 class072092, List<class07209> list, CalculationContext calculationContext) {
        boolean bl;
        boolean bl2 = bl = !(this.baritone.bsi.get0(class072092.method_10084()).i() instanceof class07204);
        if (!((Boolean)Baritone.settings().forceInternalMining.value).booleanValue()) {
            if (bl) {
                return new MineProcess$GoalThreeBlocks(class072092);
            }
            return new GoalTwoBlocks(class072092);
        }
        boolean bl3 = this.internalMiningGoal(class072092.method_10084(), calculationContext, list);
        boolean bl4 = this.internalMiningGoal(class072092.method_10074(), calculationContext, list);
        boolean bl5 = this.internalMiningGoal(class072092.method_10087(2), calculationContext, list);
        if (bl3 == bl4) {
            if (bl5 && bl) {
                return new MineProcess$GoalThreeBlocks(class072092);
            }
            return new GoalTwoBlocks(class072092);
        }
        if (bl3) {
            return new GoalBlock(class072092);
        }
        if (bl5 && bl) {
            return new GoalTwoBlocks(class072092.method_10074());
        }
        return new GoalBlock(class072092.method_10074());
    }

    public MineProcess(Baritone baritone) {
        super(baritone);
    }

    public boolean isActive() {
        return this.filter != null;
    }

    public PathingCommand onTick(boolean bl, boolean bl2) {
        PathingCommand pathingCommand;
        Object object;
        int n;
        if (this.desiredQuantity > 0 && (n = this.ctx.player().method_31548().u().stream().filter(class065842 -> this.filter.has(class065842)).mapToInt(class06584::c).sum()) >= this.desiredQuantity) {
            this.logDirect("Have " + n + " valid items");
            this.cancel();
            return null;
        }
        if (bl) {
            if (!this.knownOreLocations.isEmpty() && ((Boolean)Baritone.settings().blacklistClosestOnFailure.value).booleanValue()) {
                this.logDirect("Unable to find any path to " + String.valueOf(this.filter) + ", blacklisting presumably unreachable closest instance...");
                if (((Boolean)Baritone.settings().notificationOnMineFail.value).booleanValue()) {
                    this.logNotification("Unable to find any path to " + String.valueOf(this.filter) + ", blacklisting presumably unreachable closest instance...", true);
                }
                this.knownOreLocations.stream().min(Comparator.comparingDouble(arg_0 -> ((BetterBlockPos)this.ctx.playerFeet()).method_10262(arg_0))).ifPresent(this.blacklist::add);
                this.knownOreLocations.removeIf(this.blacklist::contains);
            } else {
                this.logDirect("Unable to find any path to " + String.valueOf(this.filter) + ", canceling mine");
                if (((Boolean)Baritone.settings().notificationOnMineFail.value).booleanValue()) {
                    this.logNotification("Unable to find any path to " + String.valueOf(this.filter) + ", canceling mine", true);
                }
                this.cancel();
                return null;
            }
        }
        this.updateLoucaSystem();
        n = (Integer)Baritone.settings().mineGoalUpdateInterval.value;
        ArrayList<class07209> arrayList = new ArrayList<class07209>(this.knownOreLocations);
        if (n != 0 && this.tickCount++ % n == 0) {
            object = new CalculationContext((IBaritone)this.baritone, true);
            Baritone.getExecutor().execute(() -> this.lambda$onTick$1(arrayList, (CalculationContext)object));
        }
        if (((Boolean)Baritone.settings().legitMine.value).booleanValue() && !this.addNearby()) {
            this.cancel();
            return null;
        }
        object = arrayList.stream().filter(class072092 -> class072092.method_10263() == this.ctx.playerFeet().method_10263() && class072092.method_10260() == this.ctx.playerFeet().method_10260()).filter(class072092 -> class072092.method_10264() >= this.ctx.playerFeet().method_10264()).filter(class072092 -> !(BlockStateInterface.get(this.ctx, class072092).i() instanceof class07662)).min(Comparator.comparingDouble(arg_0 -> ((BetterBlockPos)this.ctx.playerFeet().above()).method_10262(arg_0)));
        this.baritone.getInputOverrideHandler().clearAllKeys();
        if (((Optional)object).isPresent() && this.ctx.player().method_24828()) {
            Optional optional;
            pathingCommand = (class07209)((Optional)object).get();
            class00500 class005002 = this.baritone.bsi.get0((class07209)pathingCommand);
            if (!MovementHelper.avoidBreaking((BlockStateInterface)this.baritone.bsi, (int)pathingCommand.method_10263(), (int)pathingCommand.method_10264(), (int)pathingCommand.method_10260(), (class00500)class005002) && (optional = RotationUtils.reachable((IPlayerContext)this.ctx, (class07209)pathingCommand)).isPresent() && bl2) {
                this.baritone.getLookBehavior().updateTarget((Rotation)optional.get(), true);
                MovementHelper.switchToBestToolFor((IPlayerContext)this.ctx, (class00500)this.ctx.world().method_8320((class07209)pathingCommand));
                if (this.ctx.isLookingAt((class07209)pathingCommand) || this.ctx.playerRotations().isReallyCloseTo((Rotation)optional.get())) {
                    this.baritone.getInputOverrideHandler().setInputForceState(Input.CLICK_LEFT, true);
                }
                return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
            }
        }
        if ((pathingCommand = this.updateGoal()) == null) {
            this.cancel();
            return null;
        }
        return pathingCommand;
    }

    private void rescan(List<class07209> list, CalculationContext calculationContext) {
        BlockOptionalMetaLookup blockOptionalMetaLookup = this.filterFilter();
        if (blockOptionalMetaLookup == null) {
            return;
        }
        if (((Boolean)Baritone.settings().legitMine.value).booleanValue()) {
            return;
        }
        List<class07209> list2 = this.droppedItemsScan();
        List<class07209> list3 = MineProcess.searchWorld(calculationContext, blockOptionalMetaLookup, (Integer)Baritone.settings().mineMaxOreLocationsCount.value, list, this.blacklist, list2);
        list3.addAll(list2);
        if (list3.isEmpty() && !((Boolean)Baritone.settings().exploreForBlocks.value).booleanValue()) {
            this.logDirect("No locations for " + String.valueOf(blockOptionalMetaLookup) + " known, cancelling");
            if (((Boolean)Baritone.settings().notificationOnMineFail.value).booleanValue()) {
                this.logNotification("No locations for " + String.valueOf(blockOptionalMetaLookup) + " known, cancelling", true);
            }
            this.cancel();
            return;
        }
        this.knownOreLocations = list3;
    }

    public void mineByName(int n, String ... stringArray) {
        this.mine(n, new BlockOptionalMetaLookup(stringArray));
    }

    private boolean addNearby() {
        List<class07209> list = this.droppedItemsScan();
        this.knownOreLocations.addAll(list);
        BetterBlockPos betterBlockPos = this.ctx.playerFeet();
        BlockStateInterface blockStateInterface = new BlockStateInterface(this.ctx);
        BlockOptionalMetaLookup blockOptionalMetaLookup = this.filterFilter();
        if (blockOptionalMetaLookup == null) {
            return false;
        }
        int n = 10;
        double d = 20.0;
        for (int i = betterBlockPos.method_10263() - n; i <= betterBlockPos.method_10263() + n; ++i) {
            for (int j = betterBlockPos.method_10264() - n; j <= betterBlockPos.method_10264() + n; ++j) {
                for (int k = betterBlockPos.method_10260() - n; k <= betterBlockPos.method_10260() + n; ++k) {
                    if (!blockOptionalMetaLookup.has(blockStateInterface.get0(i, j, k))) continue;
                    class07209 class072092 = new class07209(i, j, k);
                    if ((!((Boolean)Baritone.settings().legitMineIncludeDiagonals.value).booleanValue() || !this.knownOreLocations.stream().anyMatch(class072093 -> class072093.method_10262((class00753)class072092) <= 2.0)) && !RotationUtils.reachable((IPlayerContext)this.ctx, (class07209)class072092, (double)d).isPresent()) continue;
                    this.knownOreLocations.add(class072092);
                }
            }
        }
        this.knownOreLocations = MineProcess.prune(new CalculationContext((IBaritone)this.baritone), this.knownOreLocations, blockOptionalMetaLookup, (Integer)Baritone.settings().mineMaxOreLocationsCount.value, this.blacklist, list);
        return true;
    }

    private PathingCommand updateGoal() {
        BlockOptionalMetaLookup blockOptionalMetaLookup = this.filterFilter();
        if (blockOptionalMetaLookup == null) {
            return null;
        }
        boolean bl = (Boolean)Baritone.settings().legitMine.value;
        List<class07209> list = this.knownOreLocations;
        if (!list.isEmpty()) {
            CalculationContext calculationContext = new CalculationContext((IBaritone)this.baritone);
            List<class07209> list2 = MineProcess.prune(calculationContext, new ArrayList<class07209>(list), blockOptionalMetaLookup, (Integer)Baritone.settings().mineMaxOreLocationsCount.value, this.blacklist, this.droppedItemsScan());
            GoalComposite goalComposite = new GoalComposite((Goal[])list2.stream().map(class072092 -> this.coalesce((class07209)class072092, list2, calculationContext)).toArray(Goal[]::new));
            this.knownOreLocations = list2;
            return new PathingCommand((Goal)goalComposite, bl ? PathingCommandType.FORCE_REVALIDATE_GOAL_AND_PATH : PathingCommandType.REVALIDATE_GOAL_AND_PATH);
        }
        if (!bl && !((Boolean)Baritone.settings().exploreForBlocks.value).booleanValue()) {
            return null;
        }
        int n = (Integer)Baritone.settings().legitMineYLevel.value;
        if (this.branchPoint == null) {
            this.branchPoint = this.ctx.playerFeet();
        }
        if (this.branchPointRunaway == null) {
            this.branchPointRunaway = new MineProcess$1(this, 1.0, n, this.branchPoint);
        }
        return new PathingCommand((Goal)this.branchPointRunaway, PathingCommandType.REVALIDATE_GOAL_AND_PATH);
    }

    public String displayName0() {
        return "Mine " + String.valueOf(this.filter);
    }

    public void onLostControl() {
        this.mine(0, null);
    }

    private static List<class07209> prune(CalculationContext calculationContext, List<class07209> list, BlockOptionalMetaLookup blockOptionalMetaLookup, int n, List<class07209> list2, List<class07209> list3) {
        list3.removeIf(class072092 -> {
            for (class07209 class072093 : list) {
                if (!(class072093.method_10262((class00753)class072092) <= 9.0) || !blockOptionalMetaLookup.has(calculationContext.get(class072093.method_10263(), class072093.method_10264(), class072093.method_10260())) || !MineProcess.plausibleToBreak(calculationContext, class072093)) continue;
                return true;
            }
            return false;
        });
        List<class07209> list4 = list.stream().distinct().filter(class072092 -> !calculationContext.bsi.worldContainsLoadedChunk(class072092.method_10263(), class072092.method_10260()) || blockOptionalMetaLookup.has(calculationContext.get(class072092.method_10263(), class072092.method_10264(), class072092.method_10260())) || list3.contains(class072092)).filter(class072092 -> MineProcess.plausibleToBreak(calculationContext, class072092)).filter(class072092 -> {
            if (((Boolean)Baritone.settings().allowOnlyExposedOres.value).booleanValue()) {
                return MineProcess.isNextToAir(calculationContext, class072092);
            }
            return true;
        }).filter(class072092 -> class072092.method_10264() >= (Integer)Baritone.settings().minYLevelWhileMining.value + calculationContext.world.method_8597().B()).filter(class072092 -> class072092.method_10264() <= (Integer)Baritone.settings().maxYLevelWhileMining.value).filter(class072092 -> !list2.contains(class072092)).sorted(Comparator.comparingDouble(arg_0 -> ((class07209)calculationContext.getBaritone().getPlayerContext().player().method_24515()).method_10262(arg_0))).collect(Collectors.toList());
        if (list4.size() > n) {
            return list4.subList(0, n);
        }
        return list4;
    }

    private /* synthetic */ void lambda$onTick$1(List list, CalculationContext calculationContext) {
        this.rescan(list, calculationContext);
    }

    public List<class07209> droppedItemsScan() {
        if (!((Boolean)Baritone.settings().mineScanDroppedItems.value).booleanValue()) {
            return Collections.emptyList();
        }
        ArrayList<class07209> arrayList = new ArrayList<class07209>();
        for (class07049 class070492 : ((class03448)this.ctx.world()).M()) {
            class00717 class007172;
            if (!(class070492 instanceof class00717) || !this.filter.has((class007172 = (class00717)class070492).N())) continue;
            arrayList.add(class070492.method_24515());
        }
        arrayList.addAll(this.anticipatedDrops.keySet());
        return arrayList;
    }

    public static boolean isNextToAir(CalculationContext calculationContext, class07209 class072092) {
        int n = (Integer)Baritone.settings().allowOnlyExposedOresDistance.value;
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                for (int k = -n; k <= n; ++k) {
                    if (Math.abs(i) + Math.abs(j) + Math.abs(k) > n || !MovementHelper.isTransparent((class00891)calculationContext.getBlock(class072092.method_10263() + i, class072092.method_10264() + j, class072092.method_10260() + k))) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public static List<class07209> searchWorld(CalculationContext calculationContext, BlockOptionalMetaLookup blockOptionalMetaLookup, int n, List<class07209> list, List<class07209> list2, List<class07209> list3) {
        List<class07209> list4 = new ArrayList<class07209>();
        ArrayList<class00891> arrayList = new ArrayList<class00891>();
        for (BlockOptionalMeta blockOptionalMeta : blockOptionalMetaLookup.blocks()) {
            class00891 class008912 = blockOptionalMeta.getBlock();
            if (CachedChunk.BLOCKS_TO_KEEP_TRACK_OF.contains((Object)class008912)) {
                BetterBlockPos betterBlockPos = calculationContext.baritone.getPlayerContext().playerFeet();
                list4.addAll(calculationContext.worldData.getCachedWorld().getLocationsOf(BlockUtils.blockToString((class00891)class008912), ((Integer)Baritone.settings().maxCachedWorldScanCount.value).intValue(), betterBlockPos.x, betterBlockPos.z, 2));
                continue;
            }
            arrayList.add(class008912);
        }
        list4 = MineProcess.prune(calculationContext, list4, blockOptionalMetaLookup, n, list2, list3);
        if (!arrayList.isEmpty() || ((Boolean)Baritone.settings().extendCacheOnThreshold.value).booleanValue() && list4.size() < n) {
            list4.addAll(BaritoneAPI.getProvider().getWorldScanner().scanChunkRadius(calculationContext.getBaritone().getPlayerContext(), blockOptionalMetaLookup, n, 10, 32));
        }
        list4.addAll(list);
        return MineProcess.prune(calculationContext, list4, blockOptionalMetaLookup, n, list2, list3);
    }

    private BlockOptionalMetaLookup filterFilter() {
        if (this.filter == null) {
            return null;
        }
        if (!((Boolean)Baritone.settings().allowBreak.value).booleanValue()) {
            BlockOptionalMetaLookup blockOptionalMetaLookup = new BlockOptionalMetaLookup((BlockOptionalMeta[])this.filter.blocks().stream().filter(blockOptionalMeta -> ((List)Baritone.settings().allowBreakAnyway.value).contains(blockOptionalMeta.getBlock())).toArray(BlockOptionalMeta[]::new));
            if (blockOptionalMetaLookup.blocks().isEmpty()) {
                this.logDirect("Unable to mine when allowBreak is false and target block is not in allowBreakAnyway!");
                return null;
            }
            return blockOptionalMetaLookup;
        }
        return this.filter;
    }

    private void updateLoucaSystem() {
        HashMap<class07209, Long> hashMap = new HashMap<class07209, Long>(this.anticipatedDrops);
        this.ctx.getSelectedBlock().ifPresent(class072092 -> {
            if (this.knownOreLocations.contains(class072092)) {
                hashMap.put((class07209)class072092, System.currentTimeMillis() + (Long)Baritone.settings().mineDropLoiterDurationMSThanksLouca.value);
            }
        });
        for (class07209 class072093 : this.anticipatedDrops.keySet()) {
            if ((Long)hashMap.get(class072093) >= System.currentTimeMillis()) continue;
            hashMap.remove(class072093);
        }
        this.anticipatedDrops = hashMap;
    }

    private boolean internalMiningGoal(class07209 class072092, CalculationContext calculationContext, List<class07209> list) {
        if (list.contains(class072092)) {
            return true;
        }
        class00500 class005002 = calculationContext.bsi.get0(class072092);
        if (((Boolean)Baritone.settings().internalMiningAirException.value).booleanValue() && class005002.i() instanceof class07662) {
            return true;
        }
        return this.filter.has(class005002) && MineProcess.plausibleToBreak(calculationContext, class072092);
    }

    public static boolean plausibleToBreak(CalculationContext calculationContext, class07209 class072092) {
        class00500 class005002 = calculationContext.bsi.get0(class072092);
        if (MovementHelper.getMiningDurationTicks((CalculationContext)calculationContext, (int)class072092.method_10263(), (int)class072092.method_10264(), (int)class072092.method_10260(), (class00500)class005002, (boolean)true) >= 1000000.0) {
            return false;
        }
        if (MovementHelper.avoidBreaking((BlockStateInterface)calculationContext.bsi, (int)class072092.method_10263(), (int)class072092.method_10264(), (int)class072092.method_10260(), (class00500)class005002)) {
            return false;
        }
        return calculationContext.bsi.get0(class072092.method_10084()).i() != class00869.q || calculationContext.bsi.get0(class072092.method_10074()).i() != class00869.q;
    }
}

