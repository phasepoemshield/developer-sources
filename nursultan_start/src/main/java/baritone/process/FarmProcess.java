/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.BaritoneAPI
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalBlock
 *  baritone.api.pathing.goals.GoalComposite
 *  baritone.api.pathing.goals.GoalGetToBlock
 *  baritone.api.process.IFarmProcess
 *  baritone.api.process.PathingCommand
 *  baritone.api.process.PathingCommandType
 *  baritone.api.selection.ISelection
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.IPlayerContext
 *  baritone.api.utils.RayTraceUtils
 *  baritone.api.utils.Rotation
 *  baritone.api.utils.RotationUtils
 *  baritone.api.utils.input.Input
 *  baritone.pathing.movement.MovementHelper
 *  minecraft.class00500
 *  minecraft.class00717
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00873
 *  minecraft.class05487
 *  minecraft.class06183
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07089
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07299
 *  minecraft.class07662
 */
package baritone.process;

import baritone.Baritone;
import baritone.api.BaritoneAPI;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalComposite;
import baritone.api.pathing.goals.GoalGetToBlock;
import baritone.api.process.IFarmProcess;
import baritone.api.process.PathingCommand;
import baritone.api.process.PathingCommandType;
import baritone.api.selection.ISelection;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.RayTraceUtils;
import baritone.api.utils.Rotation;
import baritone.api.utils.RotationUtils;
import baritone.api.utils.input.Input;
import baritone.pathing.movement.MovementHelper;
import baritone.process.BuilderProcess$GoalBreak;
import baritone.process.FarmProcess$Harvest;
import baritone.utils.BaritoneProcessHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import minecraft.class00500;
import minecraft.class00717;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00873;
import minecraft.class05487;
import minecraft.class06183;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07089;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07299;
import minecraft.class07662;

public final class FarmProcess
extends BaritoneProcessHelper
implements IFarmProcess {
    private boolean active;
    private List<class07209> locations;
    private int tickCount;
    private int range;
    private class07209 center;
    private static final List<class06581> FARMLAND_PLANTABLE = Arrays.asList(class06570.lk, class06570.nu, class06570.by, class06570.nL, class06570.Gj, class06570.Gb);
    private static final List<class06581> PICKUP_DROPPED = Arrays.asList(class06570.lk, class06570.lw, class06570.nu, class06570.nN, class00869.Rq.B(), class06570.by, class06570.bL, class06570.nL, class00869.Ro.B(), class06570.Gj, class06570.Gb, class06570.nm, class06570.vE, class00869.it.B(), class00869.mx.B(), class00869.ij.B());

    public FarmProcess(Baritone baritone) {
        super(baritone);
    }

    public boolean isActive() {
        return this.active;
    }

    public PathingCommand onTick(boolean bl, boolean bl2) {
        class06889 class068892;
        Object object5;
        Object object2;
        Object object4;
        if ((Integer)Baritone.settings().mineGoalUpdateInterval.value != 0 && this.tickCount++ % (Integer)Baritone.settings().mineGoalUpdateInterval.value == 0) {
            object4 = new ArrayList();
            for (FarmProcess$Harvest object32 : FarmProcess$Harvest.values()) {
                ((ArrayList)object4).add(object32.block);
            }
            if (((Boolean)Baritone.settings().replantCrops.value).booleanValue()) {
                ((ArrayList)object4).add(class00869.Lr);
                ((ArrayList)object4).add(class00869.NN);
                if (((Boolean)Baritone.settings().replantNetherWart.value).booleanValue()) {
                    ((ArrayList)object4).add(class00869.iw);
                }
            }
            Baritone.getExecutor().execute(() -> this.lambda$onTick$0((ArrayList)object4));
        }
        if (this.locations == null) {
            return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
        }
        if (((Boolean)Baritone.settings().farmUsingSelection.value).booleanValue() && (object4 = this.baritone.getSelectionManager().getLastSelection()) != null) {
            this.locations.removeIf(arg_0 -> FarmProcess.lambda$onTick$1((ISelection)object4, arg_0));
        }
        object4 = new ArrayList();
        FarmProcess$Harvest[] farmProcess$HarvestArray = new ArrayList();
        ArrayList<class07209> arrayList = new ArrayList<class07209>();
        ArrayList<class07209> arrayList2 = new ArrayList<class07209>();
        ArrayList<class07209> arrayList3 = new ArrayList<class07209>();
        block1: for (class07209 d : this.locations) {
            if (this.range != 0 && d.method_10262((class00753)this.center) > (double)(this.range * this.range)) continue;
            class00500 class005002 = this.ctx.world().method_8320(d);
            boolean object5 = this.ctx.world().method_8320(d.method_10084()).i() instanceof class07662;
            if (class005002.i() == class00869.Lr) {
                if (!object5) continue;
                farmProcess$HarvestArray.add(d);
                continue;
            }
            if (class005002.i() == class00869.iw) {
                if (!object5) continue;
                arrayList2.add(d);
                continue;
            }
            if (class005002.i() == class00869.NN) {
                object2 = class07221.field_11062.iterator();
                while (object2.hasNext()) {
                    class07211 class072112 = (class07211)object2.next();
                    if (!(this.ctx.world().method_8320(d.method_10093(class072112)).i() instanceof class07662)) continue;
                    arrayList3.add(d);
                    continue block1;
                }
                continue;
            }
            if (this.readyForHarvest(this.ctx.world(), d, class005002)) {
                object4.add(d);
                continue;
            }
            if (!(class005002.i() instanceof class00873) || !(object2 = (class00873)class005002.i()).N((class05487)this.ctx.world(), d, class005002) || !object2.N(this.ctx.world(), this.ctx.world().field_9229, d, class005002)) continue;
            arrayList.add(d);
        }
        this.baritone.getInputOverrideHandler().clearAllKeys();
        BetterBlockPos betterBlockPos = this.ctx.playerFeet();
        double d = this.ctx.playerController().getBlockReachDistance();
        Object object3 = object4.iterator();
        while (object3.hasNext()) {
            Optional optional;
            object2 = (class07209)object3.next();
            if (betterBlockPos.method_10262((class00753)object2) > d * d || !(optional = RotationUtils.reachable((IPlayerContext)this.ctx, (class07209)object2)).isPresent() || !bl2) continue;
            this.baritone.getLookBehavior().updateTarget((Rotation)optional.get(), true);
            MovementHelper.switchToBestToolFor((IPlayerContext)this.ctx, (class00500)this.ctx.world().method_8320((class07209)object2));
            if (this.ctx.isLookingAt((class07209)object2)) {
                this.baritone.getInputOverrideHandler().setInputForceState(Input.CLICK_LEFT, true);
            }
            return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
        }
        object3 = new ArrayList(farmProcess$HarvestArray);
        ((ArrayList)object3).addAll(arrayList2);
        object2 = ((ArrayList)object3).iterator();
        while (object2.hasNext()) {
            class07209 class072092 = (class07209)object2.next();
            if (betterBlockPos.method_10262((class00753)class072092) > d * d) continue;
            boolean bl3 = arrayList2.contains(class072092);
            object5 = RotationUtils.reachableOffset((IPlayerContext)this.ctx, (class07209)class072092, (class06889)new class06889((double)class072092.method_10263() + 0.5, (double)(class072092.method_10264() + 1), (double)class072092.method_10260() + 0.5), (double)d, (boolean)false);
            if (!((Optional)object5).isPresent() || !bl2 || !this.baritone.getInventoryBehavior().throwaway(true, bl3 ? this::isNetherWart : this::isPlantable) || !((class068892 = RayTraceUtils.rayTraceTowards((class07049)this.ctx.player(), (Rotation)((Rotation)((Optional)object5).get()), (double)d)) instanceof class06183) || ((class06183)class068892).i() != class07211.field_11036) continue;
            this.baritone.getLookBehavior().updateTarget((Rotation)((Optional)object5).get(), true);
            if (this.ctx.isLookingAt(class072092)) {
                this.baritone.getInputOverrideHandler().setInputForceState(Input.CLICK_RIGHT, true);
            }
            return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
        }
        for (class07209 class072093 : arrayList3) {
            if (betterBlockPos.method_10262((class00753)class072093) > d * d) continue;
            for (Object object5 : class07221.field_11062) {
                class07089 class070892;
                Optional optional;
                if (!(this.ctx.world().method_8320(class072093.method_10093((class07211)object5)).i() instanceof class07662) || !(optional = RotationUtils.reachableOffset((IPlayerContext)this.ctx, (class07209)class072093, (class06889)(class068892 = class06889.y((class00753)class072093).i(class06889.N((class00753)object5.E()).L(0.5))), (double)d, (boolean)false)).isPresent() || !bl2 || !this.baritone.getInventoryBehavior().throwaway(true, this::isCocoa) || !((class070892 = RayTraceUtils.rayTraceTowards((class07049)this.ctx.player(), (Rotation)((Rotation)optional.get()), (double)d)) instanceof class06183) || ((class06183)class070892).i() != object5) continue;
                this.baritone.getLookBehavior().updateTarget((Rotation)optional.get(), true);
                if (this.ctx.isLookingAt(class072093)) {
                    this.baritone.getInputOverrideHandler().setInputForceState(Input.CLICK_RIGHT, true);
                }
                return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
            }
        }
        for (class07209 class072094 : arrayList) {
            Optional optional;
            if (betterBlockPos.method_10262((class00753)class072094) > d * d || !(optional = RotationUtils.reachable((IPlayerContext)this.ctx, (class07209)class072094)).isPresent() || !bl2 || !this.baritone.getInventoryBehavior().throwaway(true, this::isBoneMeal)) continue;
            this.baritone.getLookBehavior().updateTarget((Rotation)optional.get(), true);
            if (this.ctx.isLookingAt(class072094)) {
                this.baritone.getInputOverrideHandler().setInputForceState(Input.CLICK_RIGHT, true);
            }
            return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
        }
        if (bl) {
            this.logDirect("Farm failed");
            if (((Boolean)Baritone.settings().notificationOnFarmFail.value).booleanValue()) {
                this.logNotification("Farm failed", true);
            }
            this.onLostControl();
            return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
        }
        object2 = new ArrayList();
        Iterator iterator = object4.iterator();
        while (iterator.hasNext()) {
            class07209 class072095 = (class07209)iterator.next();
            object2.add(new BuilderProcess$GoalBreak(class072095));
        }
        if (this.baritone.getInventoryBehavior().throwaway(false, this::isPlantable)) {
            for (class07209 class072096 : farmProcess$HarvestArray) {
                object2.add(new GoalBlock(class072096.method_10084()));
            }
        }
        if (this.baritone.getInventoryBehavior().throwaway(false, this::isNetherWart)) {
            for (class07209 class072097 : arrayList2) {
                object2.add(new GoalBlock(class072097.method_10084()));
            }
        }
        if (this.baritone.getInventoryBehavior().throwaway(false, this::isCocoa)) {
            for (class07209 class072098 : arrayList3) {
                object5 = class07221.field_11062.iterator();
                while (object5.hasNext()) {
                    class068892 = (class07211)object5.next();
                    if (!(this.ctx.world().method_8320(class072098.method_10093((class07211)class068892)).i() instanceof class07662)) continue;
                    object2.add(new GoalGetToBlock(class072098.method_10093((class07211)class068892)));
                }
            }
        }
        if (this.baritone.getInventoryBehavior().throwaway(false, this::isBoneMeal)) {
            for (class07209 class072099 : arrayList) {
                object2.add(new GoalBlock(class072099));
            }
        }
        for (class07049 class070492 : this.ctx.entities()) {
            if (!(class070492 instanceof class00717) || !class070492.method_24828() || !PICKUP_DROPPED.contains((object5 = (class00717)class070492).N().B())) continue;
            object2.add(new GoalBlock((class07209)new BetterBlockPos(class070492.method_73189().M, class070492.method_73189().B + 0.1, class070492.method_73189().Z)));
        }
        if (object2.isEmpty()) {
            this.logDirect("Farm failed");
            if (((Boolean)Baritone.settings().notificationOnFarmFail.value).booleanValue()) {
                this.logNotification("Farm failed", true);
            }
            this.onLostControl();
            return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
        }
        return new PathingCommand((Goal)new GoalComposite(object2.toArray(new Goal[0])), PathingCommandType.SET_GOAL_AND_PATH);
    }

    public void farm(int n, class07209 class072092) {
        this.center = class072092 == null ? this.baritone.getPlayerContext().playerFeet() : class072092;
        this.range = n;
        this.active = true;
        this.locations = null;
    }

    private boolean isCocoa(class06584 class065842) {
        return !class065842.R() && class065842.B().equals(class06570.vE);
    }

    private boolean isBoneMeal(class06584 class065842) {
        return !class065842.R() && class065842.B().equals(class06570.vQ);
    }

    public String displayName0() {
        return "Farming";
    }

    public void onLostControl() {
        this.active = false;
    }

    private /* synthetic */ void lambda$onTick$0(ArrayList arrayList) {
        this.locations = BaritoneAPI.getProvider().getWorldScanner().scanChunkRadius(this.ctx, (List)arrayList, ((Integer)Baritone.settings().farmMaxScanSize.value).intValue(), 10, 10);
    }

    private static /* synthetic */ boolean lambda$onTick$1(ISelection iSelection, class07209 class072092) {
        return !iSelection.aabb().i((double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 0.5, (double)class072092.method_10260() + 0.5);
    }

    private boolean isPlantable(class06584 class065842) {
        return FARMLAND_PLANTABLE.contains(class065842.B());
    }

    private boolean isNetherWart(class06584 class065842) {
        return !class065842.R() && class065842.B().equals(class06570.nm);
    }

    private boolean readyForHarvest(class07299 class072992, class07209 class072092, class00500 class005002) {
        for (FarmProcess$Harvest farmProcess$Harvest : FarmProcess$Harvest.values()) {
            if (farmProcess$Harvest.block != class005002.i()) continue;
            return farmProcess$Harvest.readyToHarvest(class072992, class072092, class005002);
        }
        return false;
    }
}

