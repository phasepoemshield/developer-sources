/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.Settings
 *  baritone.api.behavior.look.ITickableAimProcessor
 *  baritone.api.event.events.BlockChangeEvent
 *  baritone.api.event.events.ChunkEvent
 *  baritone.api.event.events.PacketEvent
 *  baritone.api.event.events.RenderEvent
 *  baritone.api.event.events.TickEvent
 *  baritone.api.event.events.TickEvent$Type
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalBlock
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.Helper
 *  baritone.api.utils.IPlayerContext
 *  baritone.api.utils.Pair
 *  baritone.api.utils.Rotation
 *  baritone.api.utils.RotationUtils
 *  baritone.api.utils.input.Input
 *  baritone.pathing.movement.MovementHelper
 *  it.unimi.dsi.fastutil.floats.FloatArrayList
 *  it.unimi.dsi.fastutil.floats.FloatIterator
 *  minecraft.class00500
 *  minecraft.class00558
 *  minecraft.class00570
 *  minecraft.class00734
 *  minecraft.class00743
 *  minecraft.class02484
 *  minecraft.class02813
 *  minecraft.class04995
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class05862
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06663
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07085
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class07331
 *  minecraft.class07510
 *  minecraft.class07662
 *  minecraft.class08006
 *  minecraft.class08036
 */
package baritone.process.elytra;

import baritone.Baritone;
import baritone.api.Settings;
import baritone.api.behavior.look.ITickableAimProcessor;
import baritone.api.event.events.BlockChangeEvent;
import baritone.api.event.events.ChunkEvent;
import baritone.api.event.events.PacketEvent;
import baritone.api.event.events.RenderEvent;
import baritone.api.event.events.TickEvent;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.Helper;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.Pair;
import baritone.api.utils.Rotation;
import baritone.api.utils.RotationUtils;
import baritone.api.utils.input.Input;
import baritone.pathing.movement.MovementHelper;
import baritone.process.ElytraProcess;
import baritone.process.elytra.BlockStateOctreeInterface;
import baritone.process.elytra.ElytraBehavior$IntTriFunction;
import baritone.process.elytra.ElytraBehavior$IntTriple;
import baritone.process.elytra.ElytraBehavior$PathManager;
import baritone.process.elytra.ElytraBehavior$PitchResult;
import baritone.process.elytra.ElytraBehavior$Solution;
import baritone.process.elytra.ElytraBehavior$SolverContext;
import baritone.process.elytra.NetherPath;
import baritone.process.elytra.NetherPathfinderContext;
import baritone.utils.BaritoneMath;
import baritone.utils.BlockStateInterface;
import baritone.utils.IRenderer;
import baritone.utils.PathRenderer;
import baritone.utils.accessor.IFireworkRocketEntity;
import it.unimi.dsi.fastutil.floats.FloatArrayList;
import it.unimi.dsi.fastutil.floats.FloatIterator;
import java.awt.Color;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import minecraft.class00500;
import minecraft.class00558;
import minecraft.class00570;
import minecraft.class00734;
import minecraft.class00743;
import minecraft.class02484;
import minecraft.class02813;
import minecraft.class04995;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06663;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07085;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07331;
import minecraft.class07510;
import minecraft.class07662;
import minecraft.class08006;
import minecraft.class08036;

public final class ElytraBehavior
implements Helper {
    final Baritone baritone;
    final IPlayerContext ctx;
    private final List<Pair<class06889, class06889>> clearLines;
    private final List<Pair<class06889, class06889>> blockedLines;
    private List<class06889> simulationLine;
    private class07209 aimPos;
    private List<BetterBlockPos> visiblePath;
    public final NetherPathfinderContext context;
    public final ElytraBehavior$PathManager pathManager;
    final ElytraProcess process;
    private int remainingFireworkTicks;
    private int remainingSetBackTicks;
    public boolean landingMode;
    int minimumBoostTicks;
    boolean deployedFireworkLastTick;
    final int[] nextTickBoostCounter;
    private BlockStateInterface bsi;
    private final BlockStateOctreeInterface boi;
    public final BetterBlockPos destination;
    final boolean appendDestination;
    private final ExecutorService solverExecutor;
    private Future<ElytraBehavior$Solution> solver;
    private ElytraBehavior$Solution pendingSolution;
    private boolean solveNextTick;
    private long timeLastCacheCull = 0L;
    private int invTickCountdown = 0;
    private final Queue<Runnable> invTransactionQueue = new LinkedList<Runnable>();

    public void tick() {
        boolean bl;
        if (this.pathManager.getPath().isEmpty()) {
            return;
        }
        this.trySwapElytra();
        if (this.ctx.player().field_5976) {
            this.logVerbose("hbonk");
        }
        if (this.ctx.player().field_5992) {
            this.logVerbose("vbonk");
        }
        ElytraBehavior$SolverContext elytraBehavior$SolverContext = new ElytraBehavior$SolverContext(this, false);
        this.solveNextTick = true;
        ElytraBehavior$Solution elytraBehavior$Solution = this.pendingSolution == null || !this.pendingSolution.context.equals(elytraBehavior$SolverContext) ? this.solveAngles(elytraBehavior$SolverContext) : this.pendingSolution;
        if (this.deployedFireworkLastTick) {
            int n = elytraBehavior$SolverContext.boost.isBoosted() ? 1 : 0;
            this.nextTickBoostCounter[n] = this.nextTickBoostCounter[n] + 1;
            this.deployedFireworkLastTick = false;
        }
        if (bl = this.ctx.player().method_5771()) {
            this.baritone.getInputOverrideHandler().setInputForceState(Input.JUMP, true);
        }
        if (elytraBehavior$Solution == null) {
            this.logVerbose("no solution");
            return;
        }
        this.baritone.getLookBehavior().updateTarget(elytraBehavior$Solution.rotation, false);
        if (!elytraBehavior$Solution.solvedPitch) {
            this.logVerbose("no pitch solution, probably gonna crash in a few ticks LOL!!!");
            return;
        }
        this.aimPos = new BetterBlockPos(elytraBehavior$Solution.goingTo.M, elytraBehavior$Solution.goingTo.B, elytraBehavior$Solution.goingTo.Z);
        this.tickUseFireworks(elytraBehavior$Solution.context.start, elytraBehavior$Solution.goingTo, elytraBehavior$Solution.context.boost.isBoosted(), elytraBehavior$Solution.forceUseFirework || bl);
    }

    public ElytraBehavior(Baritone baritone, ElytraProcess elytraProcess, class07209 class072092, boolean bl) {
        this.baritone = baritone;
        this.ctx = baritone.getPlayerContext();
        this.clearLines = new CopyOnWriteArrayList<Pair<class06889, class06889>>();
        this.blockedLines = new CopyOnWriteArrayList<Pair<class06889, class06889>>();
        this.pathManager = new ElytraBehavior$PathManager(this);
        this.process = elytraProcess;
        this.destination = new BetterBlockPos(class072092);
        this.appendDestination = bl;
        this.solverExecutor = Executors.newSingleThreadExecutor();
        this.nextTickBoostCounter = new int[2];
        this.context = new NetherPathfinderContext((Long)Baritone.settings().elytraNetherSeed.value);
        this.boi = new BlockStateOctreeInterface(this.context);
    }

    public void destroy() {
        if (this.solver != null) {
            this.solver.cancel(true);
        }
        this.solverExecutor.shutdown();
        try {
            while (!this.solverExecutor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS)) {
            }
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        this.context.destroy();
    }

    private static class06889 step(class06889 class068892, class06889 class068893, float f) {
        double d;
        double d2 = class068892.M;
        double d3 = class068892.B;
        double d4 = class068892.Z;
        float f2 = f * ((float)Math.PI / 180);
        double d5 = Math.sqrt(class068893.M * class068893.M + class068893.Z * class068893.Z);
        double d6 = Math.sqrt(d2 * d2 + d4 * d4);
        double d7 = class068893.M();
        float f3 = class04995.P((double)f2);
        if ((d3 += -0.08 + (double)(f3 = (float)((double)f3 * (double)f3 * Math.min(1.0, d7 / 0.4))) * 0.06) < 0.0 && d5 > 0.0) {
            d = d3 * -0.1 * (double)f3;
            d3 += d;
            d2 += class068893.M * d / d5;
            d4 += class068893.Z * d / d5;
        }
        if (f2 < 0.0f) {
            d = d6 * (double)(-class04995.m((double)f2)) * 0.04;
            d3 += d * 3.2;
            d2 -= class068893.M * d / d5;
            d4 -= class068893.Z * d / d5;
        }
        if (d5 > 0.0) {
            d2 += (class068893.M / d5 * d6 - d2) * 0.1;
            d4 += (class068893.Z / d5 * d6 - d4) * 0.1;
        }
        return new class06889(d2 *= (double)0.99f, d3 *= (double)0.98f, d4 *= (double)0.99f);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void onTick() {
        Object object = this.context.cullingLock;
        synchronized (object) {
            this.onTick0();
        }
        long l = System.currentTimeMillis();
        if ((l - this.timeLastCacheCull) / 1000L > (Long)Baritone.settings().elytraTimeBetweenCacheCullSecs.value) {
            this.context.queueCacheCulling(this.ctx.player().method_31476().B, this.ctx.player().method_31476().Z, (Integer)Baritone.settings().elytraCacheCullDistance.value, this.boi);
            this.timeLastCacheCull = l;
        }
    }

    public void onBlockChange(BlockChangeEvent blockChangeEvent) {
        this.context.queueBlockUpdate(blockChangeEvent);
    }

    public void onChunkEvent(ChunkEvent chunkEvent) {
        if (chunkEvent.isPostPopulate() && this.context != null) {
            class00570 class005702 = this.ctx.world().method_8497(chunkEvent.getX(), chunkEvent.getZ());
            this.context.queueForPacking(class005702);
        }
    }

    public void onPostTick(TickEvent tickEvent) {
        if (tickEvent.getType() == TickEvent.Type.IN && this.solveNextTick) {
            this.pathManager.updatePlayerNear();
            ElytraBehavior$SolverContext elytraBehavior$SolverContext = new ElytraBehavior$SolverContext(this, true);
            this.solver = this.solverExecutor.submit(() -> this.solveAngles(elytraBehavior$SolverContext));
            this.solveNextTick = false;
        }
    }

    public void pathTo() {
        if (!((Boolean)Baritone.settings().elytraAutoJump.value).booleanValue() || this.ctx.player().method_6128()) {
            this.pathManager.pathToDestination();
        }
    }

    boolean passable(int n, int n2, int n3, boolean bl) {
        if (bl) {
            class00500 class005002 = this.bsi.get0(n, n2, n3);
            return class005002.i() instanceof class07662 || MovementHelper.isLava((class00500)class005002);
        }
        return !this.boi.get0(n, n2, n3);
    }

    void logVerbose(String string) {
        if (((Boolean)Baritone.settings().elytraChatSpam.value).booleanValue()) {
            this.logDebug(string);
        }
    }

    public boolean clearView(class06889 class068892, class06889 class068893, boolean bl) {
        boolean bl2;
        if (!bl) {
            bl2 = class068892.equals((Object)class068893) || this.context.raytrace(class068892, class068893);
        } else {
            boolean bl3 = bl2 = this.ctx.world().N(new class05862(class068892, class068893, class05849.field_17558, class05835.field_1348, (class07049)this.ctx.player())).N() == class07113.field_1333;
        }
        if (((Boolean)Baritone.settings().elytraRenderRaytraces.value).booleanValue()) {
            (bl2 ? this.clearLines : this.blockedLines).add((Pair<class06889, class06889>)new Pair((Object)class068892, (Object)class068893));
        }
        return bl2;
    }

    private void onTick0() {
        this.pendingSolution = null;
        if (this.solver != null) {
            try {
                this.pendingSolution = this.solver.get();
            }
            catch (Exception exception) {
            }
            finally {
                this.solver = null;
            }
        }
        this.tickInventoryTransactions();
        if (this.remainingFireworkTicks > 0) {
            --this.remainingFireworkTicks;
        }
        if (this.remainingSetBackTicks > 0) {
            --this.remainingSetBackTicks;
        }
        if (!this.getAttachedFirework().isPresent()) {
            this.minimumBoostTicks = 0;
        }
        this.clearLines.clear();
        this.blockedLines.clear();
        this.visiblePath = null;
        this.simulationLine = null;
        this.aimPos = null;
        NetherPath netherPath = this.pathManager.getPath();
        if (netherPath.isEmpty()) {
            return;
        }
        if (this.destination == null) {
            this.pathManager.clear();
            return;
        }
        this.bsi = new BlockStateInterface(this.ctx);
        this.pathManager.tick();
        int n = this.pathManager.getNear();
        this.visiblePath = netherPath.subList(Math.max(n - 30, 0), Math.min(n + 100, netherPath.size()));
    }

    private List<class06889> simulate(ElytraBehavior$SolverContext elytraBehavior$SolverContext, class06889 class068892, float f, int n, int n2, int n3) {
        ITickableAimProcessor iTickableAimProcessor = elytraBehavior$SolverContext.aimProcessor.fork();
        class06889 class068893 = class068892;
        class06889 class068894 = elytraBehavior$SolverContext.motion;
        class00734 class007342 = elytraBehavior$SolverContext.boundingBox;
        ArrayList<class06889> arrayList = new ArrayList<class06889>(n + 1);
        arrayList.add(class06889.L);
        int n4 = n2;
        for (int i = 0; i < n; ++i) {
            double d = class007342.N + (class007342.u - class007342.N) * 0.5;
            double d2 = class007342.L + (class007342.R - class007342.L) * 0.5;
            if (class068893.B() < 1.0) break;
            Rotation rotation = iTickableAimProcessor.nextRotation(RotationUtils.calcRotationFromVec3d((class06889)class06889.L, (class06889)class068893, (Rotation)this.ctx.playerRotations()).withPitch(f));
            class06889 class068895 = RotationUtils.calcLookDirectionFromRotation((Rotation)rotation);
            class068894 = ElytraBehavior.step(class068894, class068895, rotation.getPitch());
            class068893 = class068893.u(class068894);
            class00734 class007343 = class007342.L(class068894.M, class068894.B, class068894.Z).M(0.01);
            int n5 = BaritoneMath.fastFloor(class007343.N);
            int n6 = BaritoneMath.fastCeil(class007343.u);
            int n7 = BaritoneMath.fastFloor(class007343.y);
            int n8 = BaritoneMath.fastCeil(class007343.i);
            int n9 = BaritoneMath.fastFloor(class007343.L);
            int n10 = BaritoneMath.fastCeil(class007343.R);
            for (int j = n5; j < n6; ++j) {
                for (int k = n7; k < n8; ++k) {
                    for (int i2 = n9; i2 < n10; ++i2) {
                        if (this.passable(j, k, i2, elytraBehavior$SolverContext.ignoreLava)) continue;
                        return null;
                    }
                }
            }
            class007342 = class007342.L(class068894);
            arrayList.add(((class06889)arrayList.get(arrayList.size() - 1)).i(class068894));
            if (i < n3 || n4-- <= 0) continue;
            class068894 = class068894.y(class068895.M * 0.1 + (class068895.M * 1.5 - class068894.M) * 0.5, class068895.B * 0.1 + (class068895.B * 1.5 - class068894.B) * 0.5, class068895.Z * 0.1 + (class068895.Z * 1.5 - class068894.Z) * 0.5);
        }
        return arrayList;
    }

    private ElytraBehavior$PitchResult solvePitch(ElytraBehavior$SolverContext elytraBehavior$SolverContext, class06889 class068892, int n, FloatIterator floatIterator, int n2, int n3, int n4) {
        class06889 class068893 = class068892.u(elytraBehavior$SolverContext.start);
        class06889 class068894 = class068893.u();
        ArrayDeque<ElytraBehavior$PitchResult> arrayDeque = new ArrayDeque<ElytraBehavior$PitchResult>();
        while (floatIterator.hasNext()) {
            ElytraBehavior$PitchResult elytraBehavior$PitchResult;
            float f = floatIterator.nextFloat();
            List<class06889> list = this.simulate(elytraBehavior$SolverContext, class068893, f, n2, n3, n4);
            if (list == null) continue;
            class06889 class068895 = list.get(list.size() - 1);
            double d = class068894.y(class068895.u());
            if (this.landingMode) {
                d = -class068893.u(class068895).M();
            }
            if ((elytraBehavior$PitchResult = (ElytraBehavior$PitchResult)arrayDeque.peek()) != null && !(d > elytraBehavior$PitchResult.dot)) continue;
            arrayDeque.push(new ElytraBehavior$PitchResult(f, d, list));
        }
        block1: for (ElytraBehavior$PitchResult elytraBehavior$PitchResult : arrayDeque) {
            if (n < 2) {
                for (int i = elytraBehavior$PitchResult.steps.size() - 1; i >= 1; --i) {
                    if (!this.clearView(elytraBehavior$SolverContext.start.i(elytraBehavior$PitchResult.steps.get(i)), class068892, elytraBehavior$SolverContext.ignoreLava)) continue block1;
                }
            } else if (!this.clearView(elytraBehavior$SolverContext.start.i(elytraBehavior$PitchResult.steps.get(elytraBehavior$PitchResult.steps.size() - 1)), class068892, elytraBehavior$SolverContext.ignoreLava)) continue;
            this.simulationLine = elytraBehavior$PitchResult.steps;
            return elytraBehavior$PitchResult;
        }
        return null;
    }

    private Pair<Float, Boolean> solvePitch(ElytraBehavior$SolverContext elytraBehavior$SolverContext, class06889 class068892, int n) {
        int n5;
        boolean bl = n == 2;
        float f = RotationUtils.calcRotationFromVec3d((class06889)elytraBehavior$SolverContext.start, (class06889)class068892, (Rotation)this.ctx.playerRotations()).getPitch();
        FloatArrayList floatArrayList = ElytraBehavior.pitchesToSolveFor(f, bl);
        ElytraBehavior$IntTriFunction<ElytraBehavior$PitchResult> elytraBehavior$IntTriFunction = (n2, n3, n4) -> this.solvePitch(elytraBehavior$SolverContext, class068892, n, (FloatIterator)floatArrayList.iterator(), n2, n3, n4);
        ArrayList<ElytraBehavior$IntTriple> arrayList = new ArrayList<ElytraBehavior$IntTriple>();
        if (elytraBehavior$SolverContext.boost.isBoosted()) {
            n5 = elytraBehavior$SolverContext.boost.getGuaranteedBoostTicks();
            if (n5 == 0) {
                int n6 = Math.max(4, 10 - elytraBehavior$SolverContext.boost.getMaximumBoostTicks());
                arrayList.add(new ElytraBehavior$IntTriple(n6, 1, 0));
            } else if (n5 <= 5) {
                arrayList.add(new ElytraBehavior$IntTriple(n5 + 5, n5, 0));
            } else {
                arrayList.add(new ElytraBehavior$IntTriple(n5 + 1, n5, 0));
            }
        }
        n5 = bl ? 3 : (elytraBehavior$SolverContext.boost.isBoosted() ? Math.max(5, elytraBehavior$SolverContext.boost.getGuaranteedBoostTicks()) : (Integer)Baritone.settings().elytraSimulationTicks.value);
        arrayList.add(new ElytraBehavior$IntTriple(n5, elytraBehavior$SolverContext.boost.isBoosted() ? n5 : 0, 0));
        Optional<ElytraBehavior$PitchResult> optional = arrayList.stream().map(elytraBehavior$IntTriple -> (ElytraBehavior$PitchResult)elytraBehavior$IntTriFunction.apply(elytraBehavior$IntTriple.first, elytraBehavior$IntTriple.second, elytraBehavior$IntTriple.third)).filter(Objects::nonNull).findFirst();
        if (optional.isPresent()) {
            return new Pair((Object)Float.valueOf(optional.get().pitch), (Object)false);
        }
        if (bl) {
            ArrayList<ElytraBehavior$IntTriple> arrayList2 = new ArrayList<ElytraBehavior$IntTriple>();
            arrayList2.add(new ElytraBehavior$IntTriple(n5, 10, 3));
            arrayList2.add(new ElytraBehavior$IntTriple(n5, 10, 2));
            arrayList2.add(new ElytraBehavior$IntTriple(n5, 10, 1));
            Optional<ElytraBehavior$PitchResult> optional2 = arrayList2.stream().map(elytraBehavior$IntTriple -> (ElytraBehavior$PitchResult)elytraBehavior$IntTriFunction.apply(elytraBehavior$IntTriple.first, elytraBehavior$IntTriple.second, elytraBehavior$IntTriple.third)).filter(Objects::nonNull).findFirst();
            if (optional2.isPresent()) {
                return new Pair((Object)Float.valueOf(optional2.get().pitch), (Object)true);
            }
        }
        return null;
    }

    private static boolean isBoostingFireworks(class06584 class065842) {
        return ElytraBehavior.getFireworkBoost(class065842).isPresent();
    }

    Optional<class08006> getAttachedFirework() {
        return this.ctx.entitiesStream().filter(class070492 -> class070492 instanceof class08006).filter(class070492 -> Objects.equals(((IFireworkRocketEntity)class070492).getBoostedEntity(), this.ctx.player())).map(class070492 -> (class08006)class070492).findFirst();
    }

    private void tickInventoryTransactions() {
        Runnable runnable;
        if (this.invTickCountdown <= 0 && (runnable = this.invTransactionQueue.poll()) != null) {
            runnable.run();
            this.invTickCountdown = (Integer)Baritone.settings().ticksBetweenInventoryMoves.value;
        }
        if (this.invTickCountdown > 0) {
            --this.invTickCountdown;
        }
    }

    public void onRenderPass(RenderEvent renderEvent) {
        class07331 class073312;
        Settings settings = Baritone.settings();
        if (this.visiblePath != null) {
            PathRenderer.drawPath(renderEvent.getModelViewStack(), this.visiblePath, 0, Color.RED, false, 0, 0, 0.0);
        }
        if (this.aimPos != null) {
            PathRenderer.drawGoal(renderEvent.getModelViewStack(), this.ctx, (Goal)new GoalBlock(this.aimPos), renderEvent.getPartialTicks(), Color.GREEN);
        }
        if (!this.clearLines.isEmpty() && ((Boolean)settings.elytraRenderRaytraces.value).booleanValue()) {
            class073312 = IRenderer.startLines(Color.GREEN);
            for (Pair<class06889, class06889> pair : this.clearLines) {
                IRenderer.emitLine(class073312, renderEvent.getModelViewStack(), (class06889)pair.first(), (class06889)pair.second(), ((Float)settings.pathRenderLineWidthPixels.value).floatValue());
            }
            IRenderer.endLines(class073312, (Boolean)settings.renderPathIgnoreDepth.value);
        }
        if (!this.blockedLines.isEmpty() && ((Boolean)Baritone.settings().elytraRenderRaytraces.value).booleanValue()) {
            class073312 = IRenderer.startLines(Color.BLUE);
            for (Pair<class06889, class06889> pair : this.blockedLines) {
                IRenderer.emitLine(class073312, renderEvent.getModelViewStack(), (class06889)pair.first(), (class06889)pair.second(), ((Float)settings.pathRenderLineWidthPixels.value).floatValue());
            }
            IRenderer.endLines(class073312, (Boolean)settings.renderPathIgnoreDepth.value);
        }
        if (this.simulationLine != null && ((Boolean)Baritone.settings().elytraRenderSimulation.value).booleanValue()) {
            class073312 = IRenderer.startLines(new Color(3591388));
            class06889 class068892 = this.ctx.player().method_30950(renderEvent.getPartialTicks());
            for (int i = 0; i < this.simulationLine.size() - 1; ++i) {
                class06889 class068893 = this.simulationLine.get(i).i(class068892);
                class06889 class068894 = this.simulationLine.get(i + 1).i(class068892);
                IRenderer.emitLine(class073312, renderEvent.getModelViewStack(), class068893, class068894, ((Float)settings.pathRenderLineWidthPixels.value).floatValue());
            }
            IRenderer.endLines(class073312, (Boolean)settings.renderPathIgnoreDepth.value);
        }
    }

    public void repackChunks() {
        class00558 class005582 = this.ctx.world().method_8398();
        BetterBlockPos betterBlockPos = this.ctx.playerFeet();
        int n = betterBlockPos.method_10263() >> 4;
        int n2 = betterBlockPos.method_10260() >> 4;
        int n3 = n - 40;
        int n4 = n2 - 40;
        int n5 = n + 40;
        int n6 = n2 + 40;
        for (int i = n3; i <= n5; ++i) {
            for (int j = n4; j <= n6; ++j) {
                class00570 class005702 = class005582.N(i, j, false);
                if (class005702 == null || class005702.O()) continue;
                this.context.queueForPacking(class005702);
            }
        }
    }

    private int findGoodElytra() {
        class00743 class007432 = this.ctx.player().method_31548().u();
        for (int i = 0; i < class007432.size(); ++i) {
            class06584 class065842 = (class06584)class007432.get(i);
            if (class065842.B() != class06570.sT || class065842.s() - class065842.P() <= (Integer)Baritone.settings().elytraMinimumDurability.value) continue;
            return i;
        }
        return -1;
    }

    private boolean isHitboxClear(ElytraBehavior$SolverContext elytraBehavior$SolverContext, class06889 class068892, Double d) {
        class06889 class068893 = elytraBehavior$SolverContext.start;
        boolean bl = elytraBehavior$SolverContext.ignoreLava;
        if (!this.clearView(class068893, class068892, bl)) {
            return false;
        }
        if (d == null) {
            return true;
        }
        class00734 class007342 = elytraBehavior$SolverContext.boundingBox.M(d.doubleValue());
        double d2 = class068892.M - class068893.M;
        double d3 = class068892.B - class068893.B;
        double d4 = class068892.Z - class068893.Z;
        double[] dArray = new double[]{class007342.N, class007342.y, class007342.L, class007342.N, class007342.y, class007342.R, class007342.N, class007342.i, class007342.L, class007342.N, class007342.i, class007342.R, class007342.u, class007342.y, class007342.L, class007342.u, class007342.y, class007342.R, class007342.u, class007342.i, class007342.L, class007342.u, class007342.i, class007342.R};
        double[] dArray2 = new double[]{class007342.N + d2, class007342.y + d3, class007342.L + d4, class007342.N + d2, class007342.y + d3, class007342.R + d4, class007342.N + d2, class007342.i + d3, class007342.L + d4, class007342.N + d2, class007342.i + d3, class007342.R + d4, class007342.u + d2, class007342.y + d3, class007342.L + d4, class007342.u + d2, class007342.y + d3, class007342.R + d4, class007342.u + d2, class007342.i + d3, class007342.L + d4, class007342.u + d2, class007342.i + d3, class007342.R + d4};
        if (((Boolean)Baritone.settings().elytraRenderHitboxRaytraces.value).booleanValue()) {
            boolean bl2 = true;
            for (int i = 0; i < 8; ++i) {
                class06889 class068894 = new class06889(dArray[i * 3], dArray[i * 3 + 1], dArray[i * 3 + 2]);
                class06889 class068895 = new class06889(dArray2[i * 3], dArray2[i * 3 + 1], dArray2[i * 3 + 2]);
                if (this.clearView(class068894, class068895, false)) continue;
                bl2 = false;
            }
            return bl2;
        }
        return this.context.raytrace(8, dArray, dArray2, 0);
    }

    private void tickUseFireworks(class06889 class068892, class06889 class068893, boolean bl, boolean bl2) {
        block6: {
            block7: {
                double d;
                double d2;
                block8: {
                    if (this.remainingSetBackTicks > 0) {
                        this.logDebug("waiting for elytraFireworkSetbackUseDelay: " + this.remainingSetBackTicks);
                        return;
                    }
                    if (this.landingMode) {
                        return;
                    }
                    boolean bl3 = (Boolean)Baritone.settings().elytraConserveFireworks.value == false || this.ctx.player().method_73189().B < class068893.B + 5.0;
                    d2 = new class06889(this.ctx.player().method_18798().M, this.ctx.player().method_73189().B < class068893.B ? Math.max(0.0, this.ctx.player().method_18798().B) : this.ctx.player().method_18798().B, this.ctx.player().method_18798().Z).B();
                    d = (Double)Baritone.settings().elytraFireworkSpeed.value;
                    if (this.remainingFireworkTicks > 0) break block6;
                    if (bl2) break block7;
                    if (bl || !bl3) break block6;
                    if (this.ctx.player().method_73189().B < class068893.B - 5.0) break block8;
                    class06889 class068894 = new class06889(class068893.M + 0.5, this.ctx.player().method_73189().B, class068893.Z + 0.5);
                    if (!(class068892.R(class068894) > 5.0)) break block6;
                }
                if (!(d2 < d * d)) break block6;
            }
            if (!this.baritone.getInventoryBehavior().throwaway(true, ElytraBehavior::isBoostingFireworks) && !this.baritone.getInventoryBehavior().throwaway(true, ElytraBehavior::isFireworks)) {
                this.logDirect("no fireworks");
                return;
            }
            this.logVerbose("attempting to use firework" + (bl2 ? " (forced)" : ""));
            this.ctx.playerController().processRightClick(this.ctx.player(), this.ctx.world(), class07050.field_5808);
            this.minimumBoostTicks = 10 * (1 + ElytraBehavior.getFireworkBoost(this.ctx.player().method_5998(class07050.field_5808)).orElse(0));
            this.remainingFireworkTicks = 10;
            this.deployedFireworkLastTick = true;
        }
    }

    private static FloatArrayList pitchesToSolveFor(float f, boolean bl) {
        float f2;
        float f3 = bl ? -90.0f : Math.max(f - (float)((Integer)Baritone.settings().elytraPitchRange.value).intValue(), -89.0f);
        float f4 = bl ? 90.0f : Math.min(f + (float)((Integer)Baritone.settings().elytraPitchRange.value).intValue(), 89.0f);
        FloatArrayList floatArrayList = new FloatArrayList(BaritoneMath.fastCeil(f4 - f3) + 1);
        for (f2 = f; f2 <= f4; f2 += 1.0f) {
            floatArrayList.add(f2);
        }
        for (f2 = f - 1.0f; f2 >= f3; f2 -= 1.0f) {
            floatArrayList.add(f2);
        }
        return floatArrayList;
    }

    public static boolean isFireworks(class06584 class065842) {
        if (class065842.B() != class06570.GJ) {
            return false;
        }
        class02813 class028132 = (class02813)class065842.method_58694(class02484.NT);
        return class028132 != null && class028132.y().isEmpty();
    }

    private void trySwapElytra() {
        if (!((Boolean)Baritone.settings().elytraAutoSwap.value).booleanValue() || !this.invTransactionQueue.isEmpty()) {
            return;
        }
        class06584 class065842 = this.ctx.player().method_6118(class07085.field_6174);
        if (class065842.B() != class06570.sT || class065842.s() - class065842.P() > (Integer)Baritone.settings().elytraMinimumDurability.value) {
            return;
        }
        int n = this.findGoodElytra();
        if (n != -1) {
            int n2 = 6;
            int n3 = n < 9 ? n + 36 : n;
            this.queueWindowClick(this.ctx.player().fields_07fa3311b0e9d3e9b883d09222919bf5a_2.b, n3, 0, class07510.field_7790);
            this.queueWindowClick(this.ctx.player().fields_07fa3311b0e9d3e9b883d09222919bf5a_2.b, 6, 0, class07510.field_7790);
            this.queueWindowClick(this.ctx.player().fields_07fa3311b0e9d3e9b883d09222919bf5a_2.b, n3, 0, class07510.field_7790);
        }
    }

    private ElytraBehavior$Solution solveAngles(ElytraBehavior$SolverContext elytraBehavior$SolverContext) {
        NetherPath netherPath = elytraBehavior$SolverContext.path;
        int n = this.landingMode ? netherPath.size() - 1 : elytraBehavior$SolverContext.playerNear;
        class06889 class068892 = elytraBehavior$SolverContext.start;
        ElytraBehavior$Solution elytraBehavior$Solution = null;
        for (int i = 0; i < 3; ++i) {
            int[] nArray;
            if (elytraBehavior$SolverContext.boost.isBoosted()) {
                int[] nArray2 = new int[4];
                nArray2[0] = 20;
                nArray2[1] = 10;
                nArray2[2] = 5;
                nArray = nArray2;
                nArray2[3] = 0;
            } else {
                int[] nArray3 = new int[1];
                nArray = nArray3;
                nArray3[0] = 0;
            }
            int[] nArray4 = nArray;
            int n2 = i == 0 ? 2 : 3;
            int n3 = n;
            for (int j = Math.min(n + 20, netherPath.size() - 1); j >= n3; --j) {
                ArrayList<Pair> arrayList = new ArrayList<Pair>();
                for (int n4 : nArray4) {
                    Object object;
                    if (i == 0 || j == n3) {
                        arrayList.add(new Pair((Object)netherPath.getVec(j), (Object)n4));
                        continue;
                    }
                    if (i == 1) {
                        for (class06889 class068893 : object = (Object)new double[]{1.0, 0.75, 0.5, 0.25}) {
                            class06889 class068894 = class068893 == 1.0 ? netherPath.getVec(j) : netherPath.getVec(j).L((double)class068893).i(netherPath.getVec(j - 1).L(1.0 - class068893));
                            arrayList.add(new Pair((Object)class068894, (Object)n4));
                        }
                        continue;
                    }
                    object = netherPath.getVec(j).u(netherPath.getVec(j - 1));
                    int n5 = BaritoneMath.fastFloor(object.M());
                    class06889 class068895 = object.u();
                    class06889 class068896 = netherPath.getVec(j);
                    for (int k = 0; k < n5; ++k) {
                        arrayList.add(new Pair((Object)class068896, (Object)n4));
                        class068896 = class068896.u(class068895);
                    }
                }
                Object object = arrayList.iterator();
                while (object.hasNext()) {
                    Pair pair = (Pair)object.next();
                    Integer n6 = (Integer)pair.second();
                    class06889 class068897 = ((class06889)pair.first()).y(0.0, (double)n6.intValue(), 0.0);
                    if (this.landingMode) {
                        class068897 = class068897.y(0.5, 0.5, 0.5);
                    }
                    if (n6 != 0 && (j + n2 >= netherPath.size() || (class068892.R(class068897) < 40.0 ? !this.clearView(class068897, netherPath.getVec(j + n2).y(0.0, (double)n6.intValue(), 0.0), false) || !this.clearView(class068897, netherPath.getVec(j + n2), false) : !this.clearView(class068897, netherPath.getVec(j), false)))) continue;
                    double d = (Double)Baritone.settings().elytraMinimumAvoidance.value;
                    Double d2 = i == 2 ? null : Double.valueOf(i == 0 ? 2.0 * d : d);
                    if (!this.isHitboxClear(elytraBehavior$SolverContext, class068897, d2)) continue;
                    float f = RotationUtils.calcRotationFromVec3d((class06889)class068892, (class06889)class068897, (Rotation)this.ctx.playerRotations()).getYaw();
                    Pair<Float, Boolean> pair2 = this.solvePitch(elytraBehavior$SolverContext, class068897, i);
                    if (pair2 == null) {
                        elytraBehavior$Solution = new ElytraBehavior$Solution(elytraBehavior$SolverContext, new Rotation(f, this.ctx.playerRotations().getPitch()), null, false, false);
                        continue;
                    }
                    return new ElytraBehavior$Solution(elytraBehavior$SolverContext, new Rotation(f, ((Float)pair2.first()).floatValue()), class068897, true, (Boolean)pair2.second());
                }
            }
        }
        return elytraBehavior$Solution;
    }

    private static OptionalInt getFireworkBoost(class06584 class065842) {
        class02813 class028132 = (class02813)class065842.method_58694(class02484.NT);
        if (class028132 != null && class028132.y().isEmpty()) {
            return OptionalInt.of(class028132.N());
        }
        return OptionalInt.empty();
    }

    private void queueWindowClick(int n, int n2, int n3, class07510 class075102) {
        this.invTransactionQueue.add(() -> this.ctx.playerController().windowClick(n, n2, n3, class075102, (class08036)this.ctx.player()));
    }

    public void onReceivePacket(PacketEvent packetEvent) {
        if (packetEvent.getPacket() instanceof class06663) {
            this.ctx.minecraft().execute(() -> {
                this.remainingSetBackTicks = (Integer)Baritone.settings().elytraFireworkSetbackUseDelay.value;
            });
        }
    }
}

