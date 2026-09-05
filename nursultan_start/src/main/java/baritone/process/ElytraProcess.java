/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.IBaritone
 *  baritone.api.event.events.BlockChangeEvent
 *  baritone.api.event.events.ChunkEvent
 *  baritone.api.event.events.PacketEvent
 *  baritone.api.event.events.RenderEvent
 *  baritone.api.event.events.TickEvent
 *  baritone.api.event.events.WorldEvent
 *  baritone.api.event.events.type.EventState
 *  baritone.api.event.listener.AbstractGameEventListener
 *  baritone.api.event.listener.IGameEventListener
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalBlock
 *  baritone.api.pathing.goals.GoalXZ
 *  baritone.api.pathing.goals.GoalYLevel
 *  baritone.api.process.IBaritoneProcess
 *  baritone.api.process.IElytraProcess
 *  baritone.api.process.PathingCommand
 *  baritone.api.process.PathingCommandType
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.Rotation
 *  baritone.api.utils.RotationUtils
 *  baritone.api.utils.input.Input
 *  baritone.pathing.movement.movements.MovementFall
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  minecraft.class00392
 *  minecraft.class00743
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class03448
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07085
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07299
 *  minecraft.class07662
 */
package baritone.process;

import baritone.Baritone;
import baritone.api.IBaritone;
import baritone.api.event.events.BlockChangeEvent;
import baritone.api.event.events.ChunkEvent;
import baritone.api.event.events.PacketEvent;
import baritone.api.event.events.RenderEvent;
import baritone.api.event.events.TickEvent;
import baritone.api.event.events.WorldEvent;
import baritone.api.event.events.type.EventState;
import baritone.api.event.listener.AbstractGameEventListener;
import baritone.api.event.listener.IGameEventListener;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalXZ;
import baritone.api.pathing.goals.GoalYLevel;
import baritone.api.process.IBaritoneProcess;
import baritone.api.process.IElytraProcess;
import baritone.api.process.PathingCommand;
import baritone.api.process.PathingCommandType;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.Rotation;
import baritone.api.utils.RotationUtils;
import baritone.api.utils.input.Input;
import baritone.pathing.movement.movements.MovementFall;
import baritone.process.ElytraProcess$State;
import baritone.process.ElytraProcess$WalkOffCalculationContext;
import baritone.process.elytra.ElytraBehavior;
import baritone.process.elytra.NetherPathfinderContext;
import baritone.process.elytra.NullElytraProcess;
import baritone.utils.BaritoneProcessHelper;
import baritone.utils.PathingCommandContext;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import minecraft.class00392;
import minecraft.class00743;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class03448;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07085;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07299;
import minecraft.class07662;

public class ElytraProcess
extends BaritoneProcessHelper
implements AbstractGameEventListener,
IBaritoneProcess,
IElytraProcess {
    public ElytraProcess$State state;
    private boolean goingToLandingSpot;
    private BetterBlockPos landingSpot;
    private boolean reachedGoal;
    private Goal goal;
    private ElytraBehavior behavior;
    private boolean predictingTerrain;
    private static final String AUTO_JUMP_FAILURE_MSG = "Failed to compute a walking path to a spot to jump off from. Consider starting from a higher location, near an overhang. Or, you can disable elytraAutoJump and just manually begin gliding.";
    private static final int LANDING_COLUMN_HEIGHT = 15;
    private Set<BetterBlockPos> badLandingSpots = new HashSet<BetterBlockPos>();

    public static IElytraProcess create(Baritone baritone) {
        return NetherPathfinderContext.isSupported() ? new ElytraProcess(baritone) : new NullElytraProcess(baritone);
    }

    private ElytraProcess(Baritone baritone) {
        super(baritone);
        baritone.getGameEventHandler().registerEventListener((IGameEventListener)this);
    }

    public double priority() {
        return 0.0;
    }

    public boolean isActive() {
        return this.behavior != null;
    }

    public void resetState() {
        class07209 class072092 = this.currentDestination();
        this.onLostControl();
        if (class072092 != null) {
            this.pathTo(class072092);
            this.repackChunks();
        }
    }

    public boolean isLoaded() {
        return true;
    }

    public PathingCommand onTick(boolean bl, boolean bl2) {
        class06889 class068892;
        class06889 class068893;
        Object object;
        long l = (Long)Baritone.settings().elytraNetherSeed.value;
        if (l != this.behavior.context.getSeed()) {
            this.logDirect("Nether seed changed, recalculating path");
            this.resetState();
        }
        if (this.predictingTerrain != (Boolean)Baritone.settings().elytraPredictTerrain.value) {
            this.logDirect("elytraPredictTerrain setting changed, recalculating path");
            this.predictingTerrain = (Boolean)Baritone.settings().elytraPredictTerrain.value;
            this.resetState();
        }
        this.behavior.onTick();
        if (bl) {
            this.onLostControl();
            this.logDirect(AUTO_JUMP_FAILURE_MSG);
            return new PathingCommand(null, PathingCommandType.CANCEL_AND_SET_GOAL);
        }
        boolean bl3 = false;
        if (this.ctx.player().method_6128() && this.shouldLandForSafety()) {
            if (((Boolean)Baritone.settings().elytraAllowEmergencyLand.value).booleanValue()) {
                this.logDirect("Emergency landing - almost out of elytra durability or fireworks");
                bl3 = true;
            } else {
                this.logDirect("almost out of elytra durability or fireworks, but I'm going to continue since elytraAllowEmergencyLand is false");
            }
        }
        if (this.ctx.player().method_6128() && this.state != ElytraProcess$State.LANDING && (this.behavior.pathManager.isComplete() || bl3)) {
            object = this.behavior.pathManager.path.getLast();
            if (object != null && (this.ctx.player().method_73189().M(object.method_46558()) < 2304.0 || bl3) && (!this.goingToLandingSpot || bl3 && this.landingSpot == null)) {
                this.logDirect("Path complete, picking a nearby safe landing spot...");
                class068893 = this.findSafeLandingSpot(this.ctx.playerFeet());
                if (class068893 != null) {
                    this.pathTo0((class07209)class068893, true);
                    this.landingSpot = class068893;
                }
                this.goingToLandingSpot = true;
            }
            if (object != null && this.ctx.player().method_73189().M(object.method_46558()) < 1.0) {
                if (((Boolean)Baritone.settings().notificationOnPathComplete.value).booleanValue() && !this.reachedGoal) {
                    this.logNotification("Pathing complete", false);
                }
                if (((Boolean)Baritone.settings().disconnectOnArrival.value).booleanValue() && !this.reachedGoal) {
                    this.onLostControl();
                    class07299 class072992 = this.ctx.world();
                    if (class072992 instanceof class03448) {
                        class068893 = (class03448)class072992;
                        class068893.N((class00392)class00392.y((String)"[Baritone] Arrived at goal!"));
                    }
                    return new PathingCommand(null, PathingCommandType.CANCEL_AND_SET_GOAL);
                }
                this.reachedGoal = true;
                if (this.goingToLandingSpot) {
                    this.state = ElytraProcess$State.LANDING;
                    this.logDirect("Above the landing spot, landing...");
                }
            }
        }
        if (this.state == ElytraProcess$State.LANDING) {
            BetterBlockPos betterBlockPos = object = this.landingSpot != null ? this.landingSpot : this.behavior.pathManager.path.getLast();
            if (this.ctx.player().method_6128() && object != null) {
                class068893 = this.ctx.player().method_73189();
                class068892 = new class06889((double)object.x + 0.5, class068893.B, (double)object.z + 0.5);
                Rotation rotation = RotationUtils.calcRotationFromVec3d((class06889)class068893, (class06889)class068892, (Rotation)this.ctx.playerRotations());
                this.baritone.getLookBehavior().updateTarget(new Rotation(rotation.getYaw(), 0.0f), false);
                if (this.ctx.player().method_73189().B < (double)(object.y - 15)) {
                    this.logDirect("bad landing spot, trying again...");
                    this.landingSpotIsBad((BetterBlockPos)object);
                }
            }
        }
        if (this.ctx.player().method_6128()) {
            this.behavior.landingMode = this.state == ElytraProcess$State.LANDING;
            this.goal = null;
            this.baritone.getInputOverrideHandler().clearAllKeys();
            this.behavior.tick();
            return new PathingCommand(null, PathingCommandType.CANCEL_AND_SET_GOAL);
        }
        if (this.state == ElytraProcess$State.LANDING) {
            if (this.ctx.playerMotion().u(1.0, 0.0, 1.0).M() > 0.001) {
                this.logDirect("Landed, but still moving, waiting for velocity to die down... ");
                this.baritone.getInputOverrideHandler().setInputForceState(Input.SNEAK, true);
                return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
            }
            this.logDirect("Done :)");
            this.baritone.getInputOverrideHandler().clearAllKeys();
            this.onLostControl();
            return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
        }
        if (this.state == ElytraProcess$State.FLYING || this.state == ElytraProcess$State.START_FLYING) {
            ElytraProcess$State elytraProcess$State = this.state = this.ctx.player().method_24828() && (Boolean)Baritone.settings().elytraAutoJump.value != false ? ElytraProcess$State.LOCATE_JUMP : ElytraProcess$State.START_FLYING;
        }
        if (this.state == ElytraProcess$State.LOCATE_JUMP) {
            if (this.shouldLandForSafety()) {
                this.logDirect("Not taking off, because elytra durability or fireworks are so low that I would immediately emergency land anyway.");
                this.onLostControl();
                return new PathingCommand(null, PathingCommandType.CANCEL_AND_SET_GOAL);
            }
            if (this.goal == null) {
                this.goal = new GoalYLevel(31);
            }
            if ((object = this.baritone.getPathingBehavior().getCurrent()) != null && object.getPath().getGoal() == this.goal) {
                class068893 = object.getPath().movements().stream().filter(iMovement -> iMovement instanceof MovementFall).findFirst().orElse(null);
                if (class068893 != null) {
                    class068892 = new BetterBlockPos((class068893.getSrc().x + class068893.getDest().x) / 2, (class068893.getSrc().y + class068893.getDest().y) / 2, (class068893.getSrc().z + class068893.getDest().z) / 2);
                    this.behavior.pathManager.pathToDestination((class07209)class068892).whenComplete((void_, throwable) -> {
                        if (throwable == null) {
                            this.state = ElytraProcess$State.GET_TO_JUMP;
                            return;
                        }
                        this.onLostControl();
                    });
                    this.state = ElytraProcess$State.PAUSE;
                } else {
                    this.onLostControl();
                    this.logDirect(AUTO_JUMP_FAILURE_MSG);
                    return new PathingCommand(null, PathingCommandType.CANCEL_AND_SET_GOAL);
                }
            }
            return new PathingCommandContext(this.goal, PathingCommandType.SET_GOAL_AND_PAUSE, new ElytraProcess$WalkOffCalculationContext((IBaritone)this.baritone));
        }
        if (this.state == ElytraProcess$State.PAUSE) {
            return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
        }
        if (this.state == ElytraProcess$State.GET_TO_JUMP) {
            boolean bl4;
            object = this.baritone.getPathingBehavior().getCurrent();
            boolean bl5 = bl4 = this.ctx.player().method_18798().B < -0.377 && !bl2 && object != null && object.getPath().movements().get(object.getPosition()) instanceof MovementFall;
            if (bl4) {
                this.state = ElytraProcess$State.START_FLYING;
            } else {
                return new PathingCommand(null, PathingCommandType.SET_GOAL_AND_PATH);
            }
        }
        if (this.state == ElytraProcess$State.START_FLYING) {
            if (!bl2) {
                this.baritone.getPathingBehavior().secretInternalSegmentCancel();
            }
            this.baritone.getInputOverrideHandler().clearAllKeys();
            if (this.ctx.player().method_18798().B < -0.377) {
                this.baritone.getInputOverrideHandler().setInputForceState(Input.JUMP, true);
            }
        }
        return new PathingCommand(null, PathingCommandType.CANCEL_AND_SET_GOAL);
    }

    public void onBlockChange(BlockChangeEvent blockChangeEvent) {
        if (this.behavior != null) {
            this.behavior.onBlockChange(blockChangeEvent);
        }
    }

    public void onChunkEvent(ChunkEvent chunkEvent) {
        if (this.behavior != null) {
            this.behavior.onChunkEvent(chunkEvent);
        }
    }

    public void onPostTick(TickEvent tickEvent) {
        IBaritoneProcess iBaritoneProcess = this.baritone.getPathingControlManager().mostRecentInControl().orElse(null);
        if (this.behavior != null && iBaritoneProcess == this) {
            this.behavior.onPostTick(tickEvent);
        }
    }

    public void pathTo(Goal goal) {
        int n;
        int n2;
        int n3;
        block8: {
            block7: {
                if (goal instanceof GoalXZ) {
                    GoalXZ goalXZ = (GoalXZ)goal;
                    n3 = goalXZ.getX();
                    n2 = 64;
                    n = goalXZ.getZ();
                } else if (goal instanceof GoalBlock) {
                    GoalBlock goalBlock = (GoalBlock)goal;
                    n3 = goalBlock.x;
                    n2 = goalBlock.y;
                    n = goalBlock.z;
                } else {
                    throw new IllegalArgumentException("The goal must be a GoalXZ or GoalBlock");
                }
                if (n2 <= 0) break block7;
                if (n2 < 128) break block8;
            }
            throw new IllegalArgumentException("The y of the goal is not between 0 and 128");
        }
        this.pathTo(new class07209(n3, n2, n));
    }

    public void pathTo(class07209 class072092) {
        this.pathTo0(class072092, false);
    }

    private void pathTo0(class07209 class072092, boolean bl) {
        if (this.ctx.player() == null || this.ctx.player().method_73183().method_27983() != class07299.field_25180) {
            return;
        }
        this.onLostControl();
        this.predictingTerrain = (Boolean)Baritone.settings().elytraPredictTerrain.value;
        this.behavior = new ElytraBehavior(this.baritone, this, class072092, bl);
        if (this.ctx.world() != null) {
            this.behavior.repackChunks();
        }
        this.behavior.pathTo();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean isInBounds(class07209 class072092) {
        if (class072092.method_10264() < 0) return false;
        if (class072092.method_10264() >= 128) return false;
        return true;
    }

    private boolean isAtEdge(class07209 class072092) {
        return !this.isSafeBlock(class072092.method_10095()) || !this.isSafeBlock(class072092.method_10072()) || !this.isSafeBlock(class072092.method_10078()) || !this.isSafeBlock(class072092.method_10067()) || !this.isSafeBlock(class072092.method_10095().method_10067()) || !this.isSafeBlock(class072092.method_10095().method_10078()) || !this.isSafeBlock(class072092.method_10072().method_10067()) || !this.isSafeBlock(class072092.method_10072().method_10078());
    }

    private boolean shouldLandForSafety() {
        class06584 class065842 = this.ctx.player().method_6118(class07085.field_6174);
        if (class065842.B() != class06570.sT || class065842.s() - class065842.P() < (Integer)Baritone.settings().elytraMinimumDurability.value) {
            return true;
        }
        class00743 class007432 = this.ctx.player().method_31548().u();
        int n = 0;
        for (int i = 0; i < 36; ++i) {
            if (!ElytraBehavior.isFireworks((class06584)class007432.get(i))) continue;
            n += ((class06584)class007432.get(i)).c();
        }
        return n <= (Integer)Baritone.settings().elytraMinFireworksBeforeLanding.value;
    }

    private BetterBlockPos findSafeLandingSpot(BetterBlockPos betterBlockPos3) {
        PriorityQueue<BetterBlockPos> priorityQueue = new PriorityQueue<BetterBlockPos>(Comparator.comparingInt(betterBlockPos2 -> (betterBlockPos2.x - betterBlockPos.x) * (betterBlockPos2.x - betterBlockPos.x) + (betterBlockPos2.z - betterBlockPos.z) * (betterBlockPos2.z - betterBlockPos.z)).thenComparingInt(betterBlockPos -> -betterBlockPos.y));
        HashSet<BetterBlockPos> hashSet = new HashSet<BetterBlockPos>();
        LongOpenHashSet longOpenHashSet = new LongOpenHashSet();
        priorityQueue.add(betterBlockPos3);
        while (!priorityQueue.isEmpty()) {
            BetterBlockPos betterBlockPos4 = (BetterBlockPos)priorityQueue.poll();
            if (!this.ctx.world().method_8477((class07209)betterBlockPos4) || !ElytraProcess.isInBounds((class07209)betterBlockPos4) || this.ctx.world().method_8320((class07209)betterBlockPos4).i() != class00869.N) continue;
            BetterBlockPos betterBlockPos5 = this.checkLandingSpot((class07209)betterBlockPos4, longOpenHashSet);
            if (betterBlockPos5 != null && this.isColumnAir((class07209)betterBlockPos5, 15) && this.hasAirBubble((class07209)betterBlockPos5.above(15)) && !this.badLandingSpots.contains(betterBlockPos5.above(15))) {
                return betterBlockPos5.above(15);
            }
            if (hashSet.add(betterBlockPos4.north())) {
                priorityQueue.add(betterBlockPos4.north());
            }
            if (hashSet.add(betterBlockPos4.east())) {
                priorityQueue.add(betterBlockPos4.east());
            }
            if (hashSet.add(betterBlockPos4.south())) {
                priorityQueue.add(betterBlockPos4.south());
            }
            if (hashSet.add(betterBlockPos4.west())) {
                priorityQueue.add(betterBlockPos4.west());
            }
            if (hashSet.add(betterBlockPos4.above())) {
                priorityQueue.add(betterBlockPos4.above());
            }
            if (!hashSet.add(betterBlockPos4.below())) continue;
            priorityQueue.add(betterBlockPos4.below());
        }
        return null;
    }

    private void destroyBehaviorAsync() {
        ElytraBehavior elytraBehavior = this.behavior;
        if (elytraBehavior != null) {
            this.behavior = null;
            Baritone.getExecutor().execute(elytraBehavior::destroy);
        }
    }

    public void onRenderPass(RenderEvent renderEvent) {
        if (this.behavior != null) {
            this.behavior.onRenderPass(renderEvent);
        }
    }

    public void onWorldEvent(WorldEvent worldEvent) {
        if (worldEvent.getWorld() != null && worldEvent.getState() == EventState.POST) {
            this.destroyBehaviorAsync();
        }
    }

    public boolean isSafeToCancel() {
        return !this.isActive() || this.state != ElytraProcess$State.FLYING && this.state != ElytraProcess$State.START_FLYING;
    }

    public class07209 currentDestination() {
        return this.behavior != null ? this.behavior.destination : null;
    }

    public String displayName0() {
        return "Elytra - " + this.state.description;
    }

    public void onLostControl() {
        this.state = ElytraProcess$State.START_FLYING;
        this.goingToLandingSpot = false;
        this.landingSpot = null;
        this.reachedGoal = false;
        this.goal = null;
        this.destroyBehaviorAsync();
    }

    public void repackChunks() {
        if (this.behavior != null) {
            this.behavior.repackChunks();
        }
    }

    private boolean isSafeBlock(class00891 class008912) {
        return class008912 == class00869.id || class008912 == class00869.X || class008912 == class00869.ML && (Boolean)Baritone.settings().elytraAllowLandOnNetherFortress.value != false;
    }

    private boolean isSafeBlock(class07209 class072092) {
        return this.isSafeBlock(this.ctx.world().method_8320(class072092).i());
    }

    private boolean isColumnAir(class07209 class072092, int n) {
        class07218 class072182 = new class07218(class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
        int n2 = class072182.method_10264() + n;
        for (int i = class072182.method_10264() + 1; i <= n2; ++i) {
            class072182.N(class072182.method_10263(), i, class072182.method_10260());
            if (this.ctx.world().method_8320((class07209)class072182).i() instanceof class07662) continue;
            return false;
        }
        return true;
    }

    private boolean hasAirBubble(class07209 class072092) {
        int n = 4;
        class07218 class072182 = new class07218();
        for (int i = -4; i <= 4; ++i) {
            for (int j = -4; j <= 4; ++j) {
                for (int k = -4; k <= 4; ++k) {
                    class072182.N(class072092.method_10263() + i, class072092.method_10264() + j, class072092.method_10260() + k);
                    if (this.ctx.world().method_8320((class07209)class072182).i() instanceof class07662) continue;
                    return false;
                }
            }
        }
        return true;
    }

    private BetterBlockPos checkLandingSpot(class07209 class072092, LongOpenHashSet longOpenHashSet) {
        class07218 class072182 = new class07218(class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
        while (class072182.method_10264() >= 0) {
            if (longOpenHashSet.contains(class072182.method_10063())) {
                return null;
            }
            longOpenHashSet.add(class072182.method_10063());
            class00891 class008912 = this.ctx.world().method_8320((class07209)class072182).i();
            if (this.isSafeBlock(class008912)) {
                if (!this.isAtEdge((class07209)class072182)) {
                    return new BetterBlockPos((class07209)class072182);
                }
                return null;
            }
            if (class008912 != class00869.N) {
                return null;
            }
            class072182.N(class072182.method_10263(), class072182.method_10264() - 1, class072182.method_10260());
        }
        return null;
    }

    public void landingSpotIsBad(BetterBlockPos betterBlockPos) {
        this.badLandingSpots.add(betterBlockPos);
        this.goingToLandingSpot = false;
        this.landingSpot = null;
        this.state = ElytraProcess$State.FLYING;
    }

    public void onReceivePacket(PacketEvent packetEvent) {
        if (this.behavior != null) {
            this.behavior.onReceivePacket(packetEvent);
        }
    }
}

