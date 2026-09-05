/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.pathing.calc.IPath
 *  baritone.api.pathing.calc.IPathFinder
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.Helper
 *  baritone.api.utils.PathCalculationResult
 *  baritone.api.utils.PathCalculationResult$Type
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  minecraft.class07209
 */
package baritone.pathing.calc;

import baritone.Baritone;
import baritone.api.pathing.calc.IPath;
import baritone.api.pathing.calc.IPathFinder;
import baritone.api.pathing.goals.Goal;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.Helper;
import baritone.api.utils.PathCalculationResult;
import baritone.pathing.calc.Path;
import baritone.pathing.calc.PathNode;
import baritone.pathing.movement.CalculationContext;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Optional;
import minecraft.class07209;

public abstract class AbstractNodeCostSearch
implements IPathFinder,
Helper {
    protected final BetterBlockPos realStart;
    protected final int startX;
    protected final int startY;
    protected final int startZ;
    protected final Goal goal;
    private final CalculationContext context;
    private final Long2ObjectOpenHashMap<PathNode> map;
    protected PathNode startNode;
    protected PathNode mostRecentConsidered;
    protected final PathNode[] bestSoFar = new PathNode[COEFFICIENTS.length];
    private volatile boolean isFinished;
    protected boolean cancelRequested;
    protected static final double[] COEFFICIENTS = new double[]{1.5, 2.0, 2.5, 3.0, 4.0, 5.0, 10.0};
    protected static final double MIN_DIST_PATH = 5.0;
    protected static final double MIN_IMPROVEMENT = 0.01;

    AbstractNodeCostSearch(BetterBlockPos betterBlockPos, int n, int n2, int n3, Goal goal, CalculationContext calculationContext) {
        this.realStart = betterBlockPos;
        this.startX = n;
        this.startY = n2;
        this.startZ = n3;
        this.goal = goal;
        this.context = calculationContext;
        this.map = new Long2ObjectOpenHashMap(((Integer)Baritone.settings().pathingMapDefaultSize.value).intValue(), ((Float)Baritone.settings().pathingMapLoadFactor.value).floatValue());
    }

    public void cancel() {
        this.cancelRequested = true;
    }

    protected int mapSize() {
        return this.map.size();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public synchronized PathCalculationResult calculate(long l, long l2) {
        if (this.isFinished) {
            throw new IllegalStateException("Path finder cannot be reused!");
        }
        this.cancelRequested = false;
        try {
            IPath iPath = this.calculate0(l, l2).map(IPath::postProcess).orElse(null);
            if (this.cancelRequested) {
                PathCalculationResult pathCalculationResult = new PathCalculationResult(PathCalculationResult.Type.CANCELLATION);
                return pathCalculationResult;
            }
            if (iPath == null) {
                PathCalculationResult pathCalculationResult = new PathCalculationResult(PathCalculationResult.Type.FAILURE);
                return pathCalculationResult;
            }
            int n = iPath.length();
            if ((iPath = iPath.cutoffAtLoadedChunks((Object)this.context.bsi)).length() < n) {
                Helper.HELPER.logDebug("Cutting off path at edge of loaded chunks");
                Helper.HELPER.logDebug("Length decreased by " + (n - iPath.length()));
            } else {
                Helper.HELPER.logDebug("Path ends within loaded chunks");
            }
            n = iPath.length();
            iPath = iPath.staticCutoff(this.goal);
            if (iPath.length() < n) {
                Helper.HELPER.logDebug("Static cutoff " + n + " to " + iPath.length());
            }
            if (this.goal.isInGoal((class07209)iPath.getDest())) {
                PathCalculationResult pathCalculationResult = new PathCalculationResult(PathCalculationResult.Type.SUCCESS_TO_GOAL, iPath);
                return pathCalculationResult;
            }
            PathCalculationResult pathCalculationResult = new PathCalculationResult(PathCalculationResult.Type.SUCCESS_SEGMENT, iPath);
            return pathCalculationResult;
        }
        catch (Exception exception) {
            Helper.HELPER.logDirect("Pathing exception: " + String.valueOf(exception));
            exception.printStackTrace();
            PathCalculationResult pathCalculationResult = new PathCalculationResult(PathCalculationResult.Type.EXCEPTION);
            return pathCalculationResult;
        }
        finally {
            this.isFinished = true;
        }
    }

    public final boolean isFinished() {
        return this.isFinished;
    }

    public final Goal getGoal() {
        return this.goal;
    }

    protected Optional<IPath> bestSoFar(boolean bl, int n) {
        if (this.startNode == null) {
            return Optional.empty();
        }
        double d = 0.0;
        for (int i = 0; i < COEFFICIENTS.length; ++i) {
            if (this.bestSoFar[i] == null) continue;
            double d2 = this.getDistFromStartSq(this.bestSoFar[i]);
            if (d2 > d) {
                d = d2;
            }
            if (!(d2 > 25.0)) continue;
            if (bl) {
                if (COEFFICIENTS[i] >= 3.0) {
                    System.out.println("Warning: cost coefficient is greater than three! Probably means that");
                    System.out.println("the path I found is pretty terrible (like sneak-bridging for dozens of blocks)");
                    System.out.println("But I'm going to do it anyway, because yolo");
                }
                System.out.println("Path goes for " + Math.sqrt(d2) + " blocks");
                this.logDebug("A* cost coefficient " + COEFFICIENTS[i]);
            }
            return Optional.of(new Path(this.realStart, this.startNode, this.bestSoFar[i], n, this.goal, this.context));
        }
        if (bl) {
            this.logDebug("Even with a cost coefficient of " + COEFFICIENTS[COEFFICIENTS.length - 1] + ", I couldn't get more than " + Math.sqrt(d) + " blocks");
            this.logDebug("No path found =(");
            this.logNotification("No path found =(", true);
        }
        return Optional.empty();
    }

    protected abstract Optional<IPath> calculate0(long var1, long var3);

    public BetterBlockPos getStart() {
        return new BetterBlockPos(this.startX, this.startY, this.startZ);
    }

    public Optional<IPath> pathToMostRecentNodeConsidered() {
        return Optional.ofNullable(this.mostRecentConsidered).map(pathNode -> new Path(this.realStart, this.startNode, (PathNode)pathNode, 0, this.goal, this.context));
    }

    public Optional<IPath> bestPathSoFar() {
        return this.bestSoFar(false, 0);
    }

    protected PathNode getNodeAtPosition(int n, int n2, int n3, long l) {
        PathNode pathNode = (PathNode)this.map.get(l);
        if (pathNode == null) {
            pathNode = new PathNode(n, n2, n3, this.goal);
            this.map.put(l, (Object)pathNode);
        }
        return pathNode;
    }

    protected double getDistFromStartSq(PathNode pathNode) {
        int n = pathNode.x - this.startX;
        int n2 = pathNode.y - this.startY;
        int n3 = pathNode.z - this.startZ;
        return n * n + n2 * n2 + n3 * n3;
    }
}

