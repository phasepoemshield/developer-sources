/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalBlock
 *  baritone.api.pathing.goals.GoalComposite
 *  baritone.api.process.IBuilderProcess
 *  baritone.api.process.PathingCommand
 *  baritone.api.process.PathingCommandType
 *  baritone.api.schematic.FillSchematic
 *  baritone.api.schematic.ISchematic
 *  baritone.api.schematic.IStaticSchematic
 *  baritone.api.schematic.MirroredSchematic
 *  baritone.api.schematic.RotatedSchematic
 *  baritone.api.schematic.SubstituteSchematic
 *  baritone.api.schematic.format.ISchematicFormat
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.IPlayerContext
 *  baritone.api.utils.RayTraceUtils
 *  baritone.api.utils.Rotation
 *  baritone.api.utils.RotationUtils
 *  baritone.api.utils.input.Input
 *  baritone.pathing.movement.Movement
 *  baritone.pathing.movement.MovementHelper
 *  com.google.common.collect.ImmutableSet
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00624
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class05034
 *  minecraft.class05487
 *  minecraft.class06183
 *  minecraft.class06501
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06901
 *  minecraft.class06918
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07004
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07089
 *  minecraft.class07101
 *  minecraft.class07111
 *  minecraft.class07113
 *  minecraft.class07117
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07662
 *  minecraft.class07746
 *  minecraft.class08036
 *  minecraft.class08092
 */
package baritone.process;

import baritone.Baritone;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalComposite;
import baritone.api.process.IBuilderProcess;
import baritone.api.process.PathingCommand;
import baritone.api.process.PathingCommandType;
import baritone.api.schematic.FillSchematic;
import baritone.api.schematic.ISchematic;
import baritone.api.schematic.IStaticSchematic;
import baritone.api.schematic.MirroredSchematic;
import baritone.api.schematic.RotatedSchematic;
import baritone.api.schematic.SubstituteSchematic;
import baritone.api.schematic.format.ISchematicFormat;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.RayTraceUtils;
import baritone.api.utils.Rotation;
import baritone.api.utils.RotationUtils;
import baritone.api.utils.input.Input;
import baritone.pathing.movement.Movement;
import baritone.pathing.movement.MovementHelper;
import baritone.process.BuilderProcess$1;
import baritone.process.BuilderProcess$2;
import baritone.process.BuilderProcess$3;
import baritone.process.BuilderProcess$4;
import baritone.process.BuilderProcess$5;
import baritone.process.BuilderProcess$BuilderCalculationContext;
import baritone.process.BuilderProcess$GoalAdjacent;
import baritone.process.BuilderProcess$GoalBreak;
import baritone.process.BuilderProcess$GoalPlace;
import baritone.process.BuilderProcess$JankyGoalComposite;
import baritone.process.BuilderProcess$Placement;
import baritone.utils.BaritoneProcessHelper;
import baritone.utils.BlockStateInterface;
import baritone.utils.PathingCommandContext;
import baritone.utils.schematic.MapArtSchematic;
import baritone.utils.schematic.SchematicSystem;
import baritone.utils.schematic.SelectionSchematic;
import baritone.utils.schematic.litematica.LitematicaHelper;
import baritone.utils.schematic.schematica.SchematicaHelper;
import com.google.common.collect.ImmutableSet;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00624;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class05034;
import minecraft.class05487;
import minecraft.class06183;
import minecraft.class06501;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06901;
import minecraft.class06918;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07004;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07089;
import minecraft.class07101;
import minecraft.class07111;
import minecraft.class07113;
import minecraft.class07117;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07662;
import minecraft.class07746;
import minecraft.class08036;
import minecraft.class08092;

public final class BuilderProcess
extends BaritoneProcessHelper
implements IBuilderProcess {
    private static final Set<class08092<?>> ORIENTATION_PROPS = ImmutableSet.of((Object)class07004.L, (Object)class07101.R, (Object)class07746.y, (Object)class07746.L, (Object)class07746.u, (Object)class06901.y, (Object[])new class08092[]{class06901.L, class06901.u, class06901.i, class06901.R, class00624.y, class00624.L});
    private HashSet<BetterBlockPos> incorrectPositions;
    private LongOpenHashSet observedCompleted;
    private String name;
    private ISchematic realSchematic;
    ISchematic schematic;
    class00753 origin;
    private int ticks;
    private boolean paused;
    private int layer;
    private int numRepeats;
    List<class00500> approxPlaceable;
    public int stopAtHeight = 0;

    static /* synthetic */ Baritone access$000(BuilderProcess builderProcess) {
        return builderProcess.baritone;
    }

    public BuilderProcess(Baritone baritone) {
        super(baritone);
    }

    private void trim() {
        HashSet<BetterBlockPos> hashSet = new HashSet<BetterBlockPos>(this.incorrectPositions);
        hashSet.removeIf(betterBlockPos -> betterBlockPos.method_10262((class00753)this.ctx.player().method_24515()) > 200.0);
        if (!hashSet.isEmpty()) {
            this.incorrectPositions = hashSet;
        }
    }

    public void resume() {
        this.paused = false;
    }

    public boolean isActive() {
        return this.schematic != null;
    }

    static boolean valid(class00500 class005002, class00500 class005003, boolean bl) {
        if (class005003 == null) {
            return true;
        }
        if (class005002.i() instanceof class07117 && ((Boolean)Baritone.settings().okIfWater.value).booleanValue()) {
            return true;
        }
        if (class005002.i() instanceof class07662 && class005003.i() instanceof class07662) {
            return true;
        }
        if (class005002.i() instanceof class07662 && ((List)Baritone.settings().okIfAir.value).contains(class005003.i())) {
            return true;
        }
        if (class005003.i() instanceof class07662 && ((List)Baritone.settings().buildIgnoreBlocks.value).contains(class005002.i())) {
            return true;
        }
        if (!(class005002.i() instanceof class07662) && ((Boolean)Baritone.settings().buildIgnoreExisting.value).booleanValue() && !bl) {
            return true;
        }
        if (((Map)Baritone.settings().buildValidSubstitutes.value).getOrDefault(class005003.i(), Collections.emptyList()).contains(class005002.i()) && !bl) {
            return true;
        }
        if (class005002.equals((Object)class005003)) {
            return true;
        }
        return BuilderProcess.sameBlockstate(class005002, class005003);
    }

    public void build(String string, ISchematic iSchematic, class00753 class007532) {
        this.name = string;
        this.schematic = iSchematic;
        this.realSchematic = null;
        boolean bl = iSchematic instanceof SelectionSchematic;
        if (!((Map)Baritone.settings().buildSubstitutes.value).isEmpty()) {
            this.schematic = new SubstituteSchematic(this.schematic, (Map)Baritone.settings().buildSubstitutes.value);
        }
        if (Baritone.settings().buildSchematicMirror.value != class07111.field_11302) {
            this.schematic = new MirroredSchematic(this.schematic, (class07111)Baritone.settings().buildSchematicMirror.value);
        }
        if (Baritone.settings().buildSchematicRotation.value != class06993.field_11467) {
            this.schematic = new RotatedSchematic(this.schematic, (class06993)Baritone.settings().buildSchematicRotation.value);
        }
        this.schematic = new BuilderProcess$1(this, this.schematic);
        int n = class007532.method_10263();
        int n2 = class007532.method_10264();
        int n3 = class007532.method_10260();
        if (((Boolean)Baritone.settings().schematicOrientationX.value).booleanValue()) {
            n += iSchematic.widthX();
        }
        if (((Boolean)Baritone.settings().schematicOrientationY.value).booleanValue()) {
            n2 += iSchematic.heightY();
        }
        if (((Boolean)Baritone.settings().schematicOrientationZ.value).booleanValue()) {
            n3 += iSchematic.lengthZ();
        }
        this.origin = new class00753(n, n2, n3);
        this.paused = false;
        this.layer = (Integer)Baritone.settings().startAtLayer.value;
        this.stopAtHeight = iSchematic.heightY();
        if (((Boolean)Baritone.settings().buildOnlySelection.value).booleanValue() && bl) {
            if (this.baritone.getSelectionManager().getSelections().length == 0) {
                this.logDirect("Poor little kitten forgot to set a selection while BuildOnlySelection is true");
                this.stopAtHeight = 0;
            } else if (((Boolean)Baritone.settings().buildInLayers.value).booleanValue()) {
                OptionalInt optionalInt = Stream.of(this.baritone.getSelectionManager().getSelections()).mapToInt(iSelection -> iSelection.min().y).min();
                OptionalInt optionalInt2 = Stream.of(this.baritone.getSelectionManager().getSelections()).mapToInt(iSelection -> iSelection.max().y).max();
                if (optionalInt.isPresent() && optionalInt2.isPresent()) {
                    int n4 = (Boolean)Baritone.settings().layerOrder.value != false ? n2 + iSchematic.heightY() - optionalInt2.getAsInt() : optionalInt.getAsInt() - n2;
                    this.stopAtHeight = ((Boolean)Baritone.settings().layerOrder.value != false ? n2 + iSchematic.heightY() - optionalInt.getAsInt() : optionalInt2.getAsInt() - n2) + 1;
                    this.layer = Math.max(this.layer, n4 / (Integer)Baritone.settings().layerHeight.value);
                    this.logDebug(String.format("Schematic starts at y=%s with height %s", n2, iSchematic.heightY()));
                    this.logDebug(String.format("Selection starts at y=%s and ends at y=%s", optionalInt.getAsInt(), optionalInt2.getAsInt()));
                    this.logDebug(String.format("Considering relevant height %s - %s", n4, this.stopAtHeight));
                }
            }
        }
        this.numRepeats = 0;
        this.observedCompleted = new LongOpenHashSet();
        this.incorrectPositions = null;
    }

    public boolean build(String string, File file, class00753 class007532) {
        IStaticSchematic iStaticSchematic;
        Optional<ISchematicFormat> optional = SchematicSystem.INSTANCE.getByFile(file);
        if (!optional.isPresent()) {
            return false;
        }
        try {
            iStaticSchematic = optional.get().parse((InputStream)new FileInputStream(file));
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
        ISchematic iSchematic = this.applyMapArtAndSelection(class007532, iStaticSchematic);
        this.build(string, iSchematic, class007532);
        return true;
    }

    private Goal assemble(BuilderProcess$BuilderCalculationContext builderProcess$BuilderCalculationContext, List<class00500> list) {
        return this.assemble(builderProcess$BuilderCalculationContext, list, false);
    }

    private Goal assemble(BuilderProcess$BuilderCalculationContext builderProcess$BuilderCalculationContext, List<class00500> list, boolean bl) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        HashMap hashMap = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        this.incorrectPositions.forEach(betterBlockPos -> {
            class00500 class005002 = builderProcess$BuilderCalculationContext.bsi.get0((class07209)betterBlockPos);
            if (class005002.i() instanceof class07662) {
                class00500 class005003 = builderProcess$BuilderCalculationContext.getSchematic(betterBlockPos.x, betterBlockPos.y, betterBlockPos.z, class005002);
                if (class005003 == null) {
                    arrayList5.add(betterBlockPos);
                } else if (BuilderProcess.containsBlockState(list, class005003)) {
                    arrayList.add(betterBlockPos);
                } else {
                    hashMap.put(class005003, 1 + hashMap.getOrDefault(class005003, 0));
                }
            } else if (class005002.i() instanceof class07117) {
                if (!MovementHelper.possiblyFlowing((class00500)class005002)) {
                    arrayList3.add(betterBlockPos);
                } else {
                    arrayList4.add(betterBlockPos);
                }
            } else {
                arrayList2.add(betterBlockPos);
            }
        });
        this.incorrectPositions.removeAll(arrayList5);
        ArrayList arrayList6 = new ArrayList();
        arrayList2.forEach(betterBlockPos -> arrayList6.add(this.breakGoal((class07209)betterBlockPos, builderProcess$BuilderCalculationContext)));
        ArrayList arrayList7 = new ArrayList();
        arrayList.forEach(betterBlockPos -> {
            if (!arrayList.contains(betterBlockPos.below()) && !arrayList.contains(betterBlockPos.below(2))) {
                arrayList7.add(this.placementGoal((class07209)betterBlockPos, builderProcess$BuilderCalculationContext));
            }
        });
        arrayList3.forEach(betterBlockPos -> arrayList7.add(new GoalBlock((class07209)betterBlockPos.above())));
        if (!arrayList7.isEmpty()) {
            return new BuilderProcess$JankyGoalComposite((Goal)new GoalComposite(arrayList7.toArray(new Goal[0])), (Goal)new GoalComposite(arrayList6.toArray(new Goal[0])));
        }
        if (arrayList6.isEmpty()) {
            if (bl && !hashMap.isEmpty()) {
                this.logDirect("Missing materials for at least:");
                this.logDirect(hashMap.entrySet().stream().map(entry -> String.format("%sx %s", entry.getValue(), entry.getKey())).collect(Collectors.joining("\n")));
            }
            if (bl && !arrayList4.isEmpty()) {
                this.logDirect("Unreplaceable liquids at at least:");
                this.logDirect(arrayList4.stream().map(betterBlockPos -> String.format("%s %s %s", betterBlockPos.x, betterBlockPos.y, betterBlockPos.z)).collect(Collectors.joining("\n")));
            }
            return null;
        }
        return new GoalComposite(arrayList6.toArray(new Goal[0]));
    }

    private PathingCommand onTick(boolean bl, boolean bl2, int n) {
        Goal goal;
        Optional<class05034<BetterBlockPos, Rotation>> optional;
        int n2;
        BuilderProcess$BuilderCalculationContext builderProcess$BuilderCalculationContext;
        if (n > 100) {
            return new PathingCommand(null, PathingCommandType.SET_GOAL_AND_PATH);
        }
        this.approxPlaceable = this.approxPlaceable(36);
        this.ticks = this.baritone.getInputOverrideHandler().isInputForcedDown(Input.CLICK_LEFT) ? 5 : --this.ticks;
        this.baritone.getInputOverrideHandler().clearAllKeys();
        if (this.paused) {
            return new PathingCommand(null, PathingCommandType.CANCEL_AND_SET_GOAL);
        }
        if (((Boolean)Baritone.settings().buildInLayers.value).booleanValue()) {
            int n3;
            if (this.realSchematic == null) {
                this.realSchematic = this.schematic;
            }
            builderProcess$BuilderCalculationContext = this.realSchematic;
            if (((Boolean)Baritone.settings().layerOrder.value).booleanValue()) {
                n2 = builderProcess$BuilderCalculationContext.heightY() - 1;
                n3 = builderProcess$BuilderCalculationContext.heightY() - this.layer * (Integer)Baritone.settings().layerHeight.value;
            } else {
                n2 = this.layer * (Integer)Baritone.settings().layerHeight.value - 1;
                n3 = 0;
            }
            this.schematic = new BuilderProcess$3(this, (ISchematic)builderProcess$BuilderCalculationContext, n3, n2);
        }
        if (!this.recalc(builderProcess$BuilderCalculationContext = new BuilderProcess$BuilderCalculationContext(this))) {
            if (((Boolean)Baritone.settings().buildInLayers.value).booleanValue() && this.layer * (Integer)Baritone.settings().layerHeight.value < this.stopAtHeight) {
                this.logDirect("Starting layer " + this.layer);
                ++this.layer;
                return this.onTick(bl, bl2, n + 1);
            }
            class00753 class007532 = (class00753)Baritone.settings().buildRepeat.value;
            n2 = (Integer)Baritone.settings().buildRepeatCount.value;
            ++this.numRepeats;
            if (class007532.equals((Object)new class00753(0, 0, 0)) || n2 != -1 && this.numRepeats >= n2) {
                this.logDirect("Done building");
                if (((Boolean)Baritone.settings().notificationOnBuildFinished.value).booleanValue()) {
                    this.logNotification("Done building", false);
                }
                this.onLostControl();
                return null;
            }
            this.layer = 0;
            this.origin = new class07209(this.origin).method_10081(class007532);
            if (!((Boolean)Baritone.settings().buildRepeatSneaky.value).booleanValue()) {
                this.schematic.reset();
            }
            this.logDirect("Repeating build in vector " + String.valueOf(class007532) + ", new origin is " + String.valueOf(this.origin));
            return this.onTick(bl, bl2, n + 1);
        }
        if (((Boolean)Baritone.settings().distanceTrim.value).booleanValue()) {
            this.trim();
        }
        if ((optional = this.toBreakNearPlayer(builderProcess$BuilderCalculationContext)).isPresent() && bl2 && this.ctx.player().method_24828()) {
            Rotation rotation = (Rotation)optional.get().y();
            BetterBlockPos betterBlockPos = (BetterBlockPos)optional.get().N();
            this.baritone.getLookBehavior().updateTarget(rotation, true);
            MovementHelper.switchToBestToolFor((IPlayerContext)this.ctx, (class00500)builderProcess$BuilderCalculationContext.get((class07209)betterBlockPos));
            if (this.ctx.player().method_18276()) {
                this.baritone.getInputOverrideHandler().setInputForceState(Input.SNEAK, true);
            }
            if (this.ctx.isLookingAt((class07209)betterBlockPos) || this.ctx.playerRotations().isReallyCloseTo(rotation)) {
                this.baritone.getInputOverrideHandler().setInputForceState(Input.CLICK_LEFT, true);
            }
            return new PathingCommand(null, PathingCommandType.CANCEL_AND_SET_GOAL);
        }
        ArrayList<class00500> arrayList = new ArrayList<class00500>();
        Optional<BuilderProcess$Placement> optional2 = this.searchForPlacables(builderProcess$BuilderCalculationContext, arrayList);
        if (optional2.isPresent() && bl2 && this.ctx.player().method_24828() && this.ticks <= 0) {
            Rotation rotation = optional2.get().rot;
            this.baritone.getLookBehavior().updateTarget(rotation, true);
            this.ctx.player().method_31548().N(optional2.get().hotbarSelection);
            this.baritone.getInputOverrideHandler().setInputForceState(Input.SNEAK, true);
            if (this.ctx.isLookingAt(optional2.get().placeAgainst) && ((class06183)this.ctx.objectMouseOver()).i().equals((Object)optional2.get().side) || this.ctx.playerRotations().isReallyCloseTo(rotation)) {
                this.baritone.getInputOverrideHandler().setInputForceState(Input.CLICK_RIGHT, true);
            }
            return new PathingCommand(null, PathingCommandType.CANCEL_AND_SET_GOAL);
        }
        if (((Boolean)Baritone.settings().allowInventory.value).booleanValue()) {
            goal = new ArrayList();
            ArrayList<class00500> arrayList2 = new ArrayList<class00500>();
            block0: for (class00500 object : arrayList) {
                for (int class005002 = 0; class005002 < 9; ++class005002) {
                    if (!BuilderProcess.valid(this.approxPlaceable.get(class005002), object, true)) continue;
                    goal.add(class005002);
                    continue block0;
                }
                arrayList2.add(object);
            }
            block2: for (int i = 9; i < 36; ++i) {
                for (class00500 class005002 : arrayList2) {
                    if (!BuilderProcess.valid(this.approxPlaceable.get(i), class005002, true)) continue;
                    if (this.baritone.getInventoryBehavior().attemptToPutOnHotbar(i, ((ArrayList)goal)::contains)) break block2;
                    return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
                }
            }
        }
        if ((goal = this.assemble(builderProcess$BuilderCalculationContext, this.approxPlaceable.subList(0, 9))) == null && (goal = this.assemble(builderProcess$BuilderCalculationContext, this.approxPlaceable, true)) == null) {
            if (((Boolean)Baritone.settings().skipFailedLayers.value).booleanValue() && ((Boolean)Baritone.settings().buildInLayers.value).booleanValue() && this.layer * (Integer)Baritone.settings().layerHeight.value < this.realSchematic.heightY()) {
                this.logDirect("Skipping layer that I cannot construct! Layer #" + this.layer);
                ++this.layer;
                return this.onTick(bl, bl2, n + 1);
            }
            this.logDirect("Unable to do it. Pausing. resume to resume, cancel to cancel");
            this.paused = true;
            return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
        }
        return new PathingCommandContext(goal, PathingCommandType.FORCE_REVALIDATE_GOAL_AND_PATH, builderProcess$BuilderCalculationContext);
    }

    public PathingCommand onTick(boolean bl, boolean bl2) {
        return this.onTick(bl, bl2, 0);
    }

    public void pause() {
        this.paused = true;
    }

    public void clearArea(class07209 class072092, class07209 class072093) {
        class07209 class072094 = new class07209(Math.min(class072092.method_10263(), class072093.method_10263()), Math.min(class072092.method_10264(), class072093.method_10264()), Math.min(class072092.method_10260(), class072093.method_10260()));
        int n = Math.abs(class072092.method_10263() - class072093.method_10263()) + 1;
        int n2 = Math.abs(class072092.method_10264() - class072093.method_10264()) + 1;
        int n3 = Math.abs(class072092.method_10260() - class072093.method_10260()) + 1;
        this.build("clear area", (ISchematic)new FillSchematic(n, n2, n3, class00869.N.W()), (class00753)class072094);
    }

    public boolean isPaused() {
        return this.paused;
    }

    public class00500 placeAt(int n, int n2, int n3, class00500 class005002) {
        if (!this.isActive()) {
            return null;
        }
        if (!this.schematic.inSchematic(n - this.origin.method_10263(), n2 - this.origin.method_10264(), n3 - this.origin.method_10260(), class005002)) {
            return null;
        }
        class00500 class005003 = this.schematic.desiredState(n - this.origin.method_10263(), n2 - this.origin.method_10264(), n3 - this.origin.method_10260(), class005002, this.approxPlaceable);
        if (class005003.i() instanceof class07662) {
            return null;
        }
        return class005003;
    }

    private void fullRecalc(BuilderProcess$BuilderCalculationContext builderProcess$BuilderCalculationContext) {
        this.incorrectPositions = new HashSet();
        for (int i = 0; i < this.schematic.heightY(); ++i) {
            for (int j = 0; j < this.schematic.lengthZ(); ++j) {
                for (int k = 0; k < this.schematic.widthX(); ++k) {
                    int n;
                    int n2;
                    int n3 = k + this.origin.method_10263();
                    class00500 class005002 = builderProcess$BuilderCalculationContext.bsi.get0(n3, n2 = i + this.origin.method_10264(), n = j + this.origin.method_10260());
                    if (!this.schematic.inSchematic(k, i, j, class005002)) continue;
                    if (builderProcess$BuilderCalculationContext.bsi.worldContainsLoadedChunk(n3, n)) {
                        if (BuilderProcess.valid(builderProcess$BuilderCalculationContext.bsi.get0(n3, n2, n), this.schematic.desiredState(k, i, j, class005002, this.approxPlaceable), false)) {
                            this.observedCompleted.add(BetterBlockPos.longHash((int)n3, (int)n2, (int)n));
                            continue;
                        }
                        this.incorrectPositions.add(new BetterBlockPos(n3, n2, n));
                        this.observedCompleted.remove(BetterBlockPos.longHash((int)n3, (int)n2, (int)n));
                        if (this.incorrectPositions.size() <= (Integer)Baritone.settings().incorrectSize.value) continue;
                        return;
                    }
                    if (this.observedCompleted.contains(BetterBlockPos.longHash((int)n3, (int)n2, (int)n))) continue;
                    this.incorrectPositions.add(new BetterBlockPos(n3, n2, n));
                    if (this.incorrectPositions.size() <= (Integer)Baritone.settings().incorrectSize.value) continue;
                    return;
                }
            }
        }
    }

    private boolean recalc(BuilderProcess$BuilderCalculationContext builderProcess$BuilderCalculationContext) {
        if (this.incorrectPositions == null) {
            this.incorrectPositions = new HashSet();
            this.fullRecalc(builderProcess$BuilderCalculationContext);
            if (this.incorrectPositions.isEmpty()) {
                return false;
            }
        }
        this.recalcNearby(builderProcess$BuilderCalculationContext);
        if (this.incorrectPositions.isEmpty()) {
            this.fullRecalc(builderProcess$BuilderCalculationContext);
        }
        return !this.incorrectPositions.isEmpty();
    }

    private Goal breakGoal(class07209 class072092, BuilderProcess$BuilderCalculationContext builderProcess$BuilderCalculationContext) {
        if (((Boolean)Baritone.settings().goalBreakFromAbove.value).booleanValue() && builderProcess$BuilderCalculationContext.bsi.get0(class072092.method_10084()).i() instanceof class07662 && builderProcess$BuilderCalculationContext.bsi.get0(class072092.method_10086(2)).i() instanceof class07662) {
            return new BuilderProcess$JankyGoalComposite((Goal)new BuilderProcess$GoalBreak(class072092), (Goal)new BuilderProcess$4(this, class072092.method_10084()));
        }
        return new BuilderProcess$GoalBreak(class072092);
    }

    private ISchematic applyMapArtAndSelection(class00753 class007532, IStaticSchematic iStaticSchematic) {
        Object object = iStaticSchematic;
        if (((Boolean)Baritone.settings().mapArtMode.value).booleanValue()) {
            object = new MapArtSchematic(iStaticSchematic);
        }
        if (((Boolean)Baritone.settings().buildOnlySelection.value).booleanValue()) {
            object = new SelectionSchematic((ISchematic)object, class007532, this.baritone.getSelectionManager().getSelections());
        }
        return object;
    }

    private static class06889[] aabbSideMultipliers(class07211 class072112) {
        switch (class072112) {
            case field_11036: {
                return new class06889[]{new class06889(0.5, 1.0, 0.5), new class06889(0.1, 1.0, 0.5), new class06889(0.9, 1.0, 0.5), new class06889(0.5, 1.0, 0.1), new class06889(0.5, 1.0, 0.9)};
            }
            case field_11033: {
                return new class06889[]{new class06889(0.5, 0.0, 0.5), new class06889(0.1, 0.0, 0.5), new class06889(0.9, 0.0, 0.5), new class06889(0.5, 0.0, 0.1), new class06889(0.5, 0.0, 0.9)};
            }
            case field_11043: 
            case field_11035: 
            case field_11034: 
            case field_11039: {
                double d = class072112.P() == 0 ? 0.5 : (double)(1 + class072112.P()) / 2.0;
                double d2 = class072112.T() == 0 ? 0.5 : (double)(1 + class072112.T()) / 2.0;
                return new class06889[]{new class06889(d, 0.25, d2), new class06889(d, 0.75, d2)};
            }
        }
        throw new IllegalStateException("Unexpected side " + String.valueOf(class072112));
    }

    private OptionalInt hasAnyItemThatWouldPlace(class00500 class005002, class07089 class070892, Rotation rotation) {
        for (int i = 0; i < 9; ++i) {
            class06584 class065842 = (class06584)this.ctx.player().method_31548().u().get(i);
            if (class065842.R() || !(class065842.B() instanceof class06918)) continue;
            float f = this.ctx.player().method_36454();
            float f2 = this.ctx.player().method_36455();
            this.ctx.player().method_36456(rotation.getYaw());
            this.ctx.player().method_36457(rotation.getPitch());
            class06942 class069422 = new class06942((class06501)new BuilderProcess$2(this, this.ctx.world(), (class08036)this.ctx.player(), class07050.field_5808, class065842, (class06183)class070892));
            class00500 class005003 = ((class06918)class065842.B()).L().N(class069422);
            this.ctx.player().method_36456(f);
            this.ctx.player().method_36457(f2);
            if (class005003 == null || !class069422.N() || !BuilderProcess.valid(class005003, class005002, true)) continue;
            return OptionalInt.of(i);
        }
        return OptionalInt.empty();
    }

    public void buildOpenLitematic(int n) {
        if (LitematicaHelper.isLitematicaPresent()) {
            if (LitematicaHelper.hasLoadedSchematic(n)) {
                class05034<IStaticSchematic, class00753> class050342 = LitematicaHelper.getSchematic(n);
                class00753 class007532 = (class00753)class050342.y();
                ISchematic iSchematic = this.applyMapArtAndSelection(class007532, (IStaticSchematic)class050342.N());
                this.build(((IStaticSchematic)class050342.N()).toString(), iSchematic, class007532);
            } else {
                this.logDirect(String.format("List of placements has no entry %s", n + 1));
            }
        } else {
            this.logDirect("Litematica is not present");
        }
    }

    public Optional<Integer> getMinLayer() {
        if (((Boolean)Baritone.settings().buildInLayers.value).booleanValue()) {
            return Optional.of(this.layer);
        }
        return Optional.empty();
    }

    public String displayName0() {
        return this.paused ? "Builder Paused" : "Building " + this.name;
    }

    public Optional<Integer> getMaxLayer() {
        if (((Boolean)Baritone.settings().buildInLayers.value).booleanValue()) {
            return Optional.of(this.stopAtHeight);
        }
        return Optional.empty();
    }

    public void onLostControl() {
        this.incorrectPositions = null;
        this.name = null;
        this.schematic = null;
        this.realSchematic = null;
        this.layer = (Integer)Baritone.settings().startAtLayer.value;
        this.numRepeats = 0;
        this.paused = false;
        this.observedCompleted = null;
    }

    public void buildOpenSchematic() {
        if (SchematicaHelper.isSchematicaPresent()) {
            Optional<class05034<IStaticSchematic, class07209>> optional = SchematicaHelper.getOpenSchematic();
            if (optional.isPresent()) {
                IStaticSchematic iStaticSchematic = (IStaticSchematic)optional.get().N();
                class07209 class072092 = (class07209)optional.get().y();
                ISchematic iSchematic = this.applyMapArtAndSelection((class00753)class072092, iStaticSchematic);
                this.build(iStaticSchematic.toString(), iSchematic, (class00753)class072092);
            } else {
                this.logDirect("No schematic currently open");
            }
        } else {
            this.logDirect("Schematica is not present");
        }
    }

    public List<class00500> getApproxPlaceable() {
        return new ArrayList<class00500>(this.approxPlaceable);
    }

    private Goal placementGoal(class07209 class072092, BuilderProcess$BuilderCalculationContext builderProcess$BuilderCalculationContext) {
        if (!(this.ctx.world().method_8320(class072092).i() instanceof class07662)) {
            return new BuilderProcess$GoalPlace(class072092);
        }
        boolean bl = !(this.ctx.world().method_8320(class072092.method_10084()).i() instanceof class07662);
        class00500 class005002 = this.ctx.world().method_8320(class072092);
        for (class07211 class072112 : Movement.HORIZONTALS_BUT_ALSO_DOWN_____SO_EVERY_DIRECTION_EXCEPT_UP) {
            if (!MovementHelper.canPlaceAgainst((IPlayerContext)this.ctx, (class07209)class072092.method_10093(class072112)) || !this.placementPlausible(class072092, builderProcess$BuilderCalculationContext.getSchematic(class072092.method_10263(), class072092.method_10264(), class072092.method_10260(), class005002))) continue;
            return new BuilderProcess$GoalAdjacent(class072092, class072092.method_10093(class072112), bl);
        }
        return new BuilderProcess$GoalPlace(class072092);
    }

    List<class00500> approxPlaceable(int n) {
        ArrayList<class00500> arrayList = new ArrayList<class00500>();
        for (int i = 0; i < n; ++i) {
            class06584 class065842 = (class06584)this.ctx.player().method_31548().u().get(i);
            if (class065842.R() || !(class065842.B() instanceof class06918)) {
                arrayList.add(class00869.N.W());
                continue;
            }
            class00500 class005002 = ((class06918)class065842.B()).L().N(new class06942((class06501)new BuilderProcess$5(this, this.ctx.world(), (class08036)this.ctx.player(), class07050.field_5808, class065842, new class06183(new class06889(this.ctx.player().method_73189().M, this.ctx.player().method_73189().B, this.ctx.player().method_73189().Z), class07211.field_11036, (class07209)this.ctx.playerFeet(), false))));
            if (class005002 != null) {
                arrayList.add(class005002);
                continue;
            }
            arrayList.add(class00869.N.W());
        }
        return arrayList;
    }

    private Optional<class05034<BetterBlockPos, Rotation>> toBreakNearPlayer(BuilderProcess$BuilderCalculationContext builderProcess$BuilderCalculationContext) {
        BetterBlockPos betterBlockPos = this.ctx.playerFeet();
        BetterBlockPos betterBlockPos2 = this.baritone.getPathingBehavior().pathStart();
        for (int i = -5; i <= 5; ++i) {
            int n;
            int n2 = n = (Boolean)Baritone.settings().breakFromAbove.value != false ? -1 : 0;
            while (n <= 5) {
                for (int j = -5; j <= 5; ++j) {
                    BetterBlockPos betterBlockPos3;
                    Optional optional;
                    class00500 class005002;
                    class00500 class005003;
                    int n3 = betterBlockPos.x + i;
                    int n4 = betterBlockPos.y + n;
                    int n5 = betterBlockPos.z + j;
                    if (n == -1 && n3 == betterBlockPos2.x && n5 == betterBlockPos2.z || (class005003 = builderProcess$BuilderCalculationContext.getSchematic(n3, n4, n5, builderProcess$BuilderCalculationContext.bsi.get0(n3, n4, n5))) == null || (class005002 = builderProcess$BuilderCalculationContext.bsi.get0(n3, n4, n5)).i() instanceof class07662 || class005002.i() == class00869.K || class005002.i() == class00869.V || BuilderProcess.valid(class005002, class005003, false) || !(optional = RotationUtils.reachable((IPlayerContext)this.ctx, (class07209)(betterBlockPos3 = new BetterBlockPos(n3, n4, n5)), (double)this.ctx.playerController().getBlockReachDistance())).isPresent()) continue;
                    return Optional.of(new class05034((Object)betterBlockPos3, (Object)((Rotation)optional.get())));
                }
                ++n;
            }
        }
        return Optional.empty();
    }

    private void recalcNearby(BuilderProcess$BuilderCalculationContext builderProcess$BuilderCalculationContext) {
        BetterBlockPos betterBlockPos = this.ctx.playerFeet();
        int n = (Integer)Baritone.settings().builderTickScanRadius.value;
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                for (int k = -n; k <= n; ++k) {
                    int n2 = betterBlockPos.x + i;
                    int n3 = betterBlockPos.y + j;
                    int n4 = betterBlockPos.z + k;
                    class00500 class005002 = builderProcess$BuilderCalculationContext.getSchematic(n2, n3, n4, builderProcess$BuilderCalculationContext.bsi.get0(n2, n3, n4));
                    if (class005002 == null) continue;
                    BetterBlockPos betterBlockPos2 = new BetterBlockPos(n2, n3, n4);
                    if (BuilderProcess.valid(builderProcess$BuilderCalculationContext.bsi.get0(n2, n3, n4), class005002, false)) {
                        this.incorrectPositions.remove(betterBlockPos2);
                        this.observedCompleted.add(BetterBlockPos.longHash((BetterBlockPos)betterBlockPos2));
                        continue;
                    }
                    this.incorrectPositions.add(betterBlockPos2);
                    this.observedCompleted.remove(BetterBlockPos.longHash((BetterBlockPos)betterBlockPos2));
                }
            }
        }
    }

    public boolean placementPlausible(class07209 class072092, class00500 class005002) {
        class00494 class004942 = class005002.M((class07290)this.ctx.world(), class072092);
        return class004942.method_1110() || this.ctx.world().method_8611(null, class004942.method_1096((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260()));
    }

    private Optional<BuilderProcess$Placement> searchForPlacables(BuilderProcess$BuilderCalculationContext builderProcess$BuilderCalculationContext, List<class00500> list) {
        BetterBlockPos betterBlockPos = this.ctx.playerFeet();
        for (int i = -5; i <= 5; ++i) {
            for (int j = -5; j <= 1; ++j) {
                for (int k = -5; k <= 5; ++k) {
                    class00500 class005002;
                    int n = betterBlockPos.x + i;
                    int n2 = betterBlockPos.y + j;
                    int n3 = betterBlockPos.z + k;
                    class00500 class005003 = builderProcess$BuilderCalculationContext.getSchematic(n, n2, n3, builderProcess$BuilderCalculationContext.bsi.get0(n, n2, n3));
                    if (class005003 == null || !MovementHelper.isReplaceable((int)n, (int)n2, (int)n3, (class00500)(class005002 = builderProcess$BuilderCalculationContext.bsi.get0(n, n2, n3)), (BlockStateInterface)builderProcess$BuilderCalculationContext.bsi) || BuilderProcess.valid(class005002, class005003, false) || j == 1 && builderProcess$BuilderCalculationContext.bsi.get0(n, n2 + 1, n3).i() instanceof class07662) continue;
                    list.add(class005003);
                    Optional<BuilderProcess$Placement> optional = this.possibleToPlace(class005003, n, n2, n3, builderProcess$BuilderCalculationContext.bsi);
                    if (!optional.isPresent()) continue;
                    return optional;
                }
            }
        }
        return Optional.empty();
    }

    private Optional<BuilderProcess$Placement> possibleToPlace(class00500 class005002, int n, int n2, int n3, BlockStateInterface blockStateInterface) {
        for (class07211 class072112 : class07211.values()) {
            class00494 class004942;
            BetterBlockPos betterBlockPos = new BetterBlockPos(n, n2, n3).relative(class072112);
            class00500 class005003 = blockStateInterface.get0((class07209)betterBlockPos);
            if (MovementHelper.isReplaceable((int)betterBlockPos.x, (int)betterBlockPos.y, (int)betterBlockPos.z, (class00500)class005003, (BlockStateInterface)blockStateInterface) || !class005002.N((class05487)this.ctx.world(), (class07209)new BetterBlockPos(n, n2, n3)) || !this.placementPlausible((class07209)new BetterBlockPos(n, n2, n3), class005002) || (class004942 = class005003.R((class07290)this.ctx.world(), (class07209)betterBlockPos)).method_1110()) continue;
            class00734 class007342 = class004942.method_1107();
            for (class06889 class068892 : BuilderProcess.aabbSideMultipliers(class072112)) {
                OptionalInt optionalInt;
                double d = (double)betterBlockPos.x + class007342.N * class068892.M + class007342.u * (1.0 - class068892.M);
                double d2 = (double)betterBlockPos.y + class007342.y * class068892.B + class007342.i * (1.0 - class068892.B);
                double d3 = (double)betterBlockPos.z + class007342.L * class068892.Z + class007342.R * (1.0 - class068892.Z);
                Rotation rotation = RotationUtils.calcRotationFromVec3d((class06889)RayTraceUtils.inferSneakingEyePosition((class07049)this.ctx.player()), (class06889)new class06889(d, d2, d3), (Rotation)this.ctx.playerRotations());
                Rotation rotation2 = this.baritone.getLookBehavior().getAimProcessor().peekRotation(rotation);
                class07089 class070892 = RayTraceUtils.rayTraceTowards((class07049)this.ctx.player(), (Rotation)rotation2, (double)this.ctx.playerController().getBlockReachDistance(), (boolean)true);
                if (class070892 == null || class070892.N() != class07113.field_1332 || !((class06183)class070892).u().equals((Object)betterBlockPos) || ((class06183)class070892).i() != class072112.b() || !(optionalInt = this.hasAnyItemThatWouldPlace(class005002, class070892, rotation2)).isPresent()) continue;
                return Optional.of(new BuilderProcess$Placement(optionalInt.getAsInt(), (class07209)betterBlockPos, class072112.b(), rotation));
            }
        }
        return Optional.empty();
    }

    private static boolean sameBlockstate(class00500 class005002, class00500 class005003) {
        if (class005002.i() != class005003.i()) {
            return false;
        }
        boolean bl = (Boolean)Baritone.settings().buildIgnoreDirection.value;
        List list = (List)Baritone.settings().buildIgnoreProperties.value;
        if (!bl && list.isEmpty()) {
            return class005002.equals((Object)class005003);
        }
        Map map = class005002.L();
        Map map2 = class005003.L();
        for (class08092 class080922 : map.keySet()) {
            if (map.get(class080922) == map2.get(class080922) || bl && ORIENTATION_PROPS.contains(class080922) || list.contains(class080922.R())) continue;
            return false;
        }
        return true;
    }

    private static boolean containsBlockState(Collection<class00500> collection, class00500 class005002) {
        for (class00500 class005003 : collection) {
            if (!BuilderProcess.sameBlockstate(class005003, class005002)) continue;
            return true;
        }
        return false;
    }
}

