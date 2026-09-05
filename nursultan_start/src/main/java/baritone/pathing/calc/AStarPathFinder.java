/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.pathing.calc.IPath
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.SettingsUtil
 *  baritone.utils.pathing.BetterWorldBorder
 *  baritone.utils.pathing.Favoring
 *  baritone.utils.pathing.MutableMoveResult
 */
package baritone.pathing.calc;

import baritone.Baritone;
import baritone.api.pathing.calc.IPath;
import baritone.api.pathing.goals.Goal;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.SettingsUtil;
import baritone.pathing.calc.AbstractNodeCostSearch;
import baritone.pathing.calc.Path;
import baritone.pathing.calc.PathNode;
import baritone.pathing.calc.openset.BinaryHeapOpenSet;
import baritone.pathing.movement.CalculationContext;
import baritone.pathing.movement.Moves;
import baritone.utils.pathing.BetterWorldBorder;
import baritone.utils.pathing.Favoring;
import baritone.utils.pathing.MutableMoveResult;
import java.util.Optional;

public final class AStarPathFinder
extends AbstractNodeCostSearch {
    private final Favoring favoring;
    private final CalculationContext calcContext;

    public AStarPathFinder(BetterBlockPos betterBlockPos, int n, int n2, int n3, Goal goal, Favoring favoring, CalculationContext calculationContext) {
        super(betterBlockPos, n, n2, n3, goal, calculationContext);
        this.favoring = favoring;
        this.calcContext = calculationContext;
    }

    @Override
    protected Optional<IPath> calculate0(long l, long l2) {
        long l3;
        int n = this.calcContext.world.method_8597().B();
        int n2 = this.calcContext.world.method_8597().Z();
        this.startNode = this.getNodeAtPosition(this.startX, this.startY, this.startZ, BetterBlockPos.longHash((int)this.startX, (int)this.startY, (int)this.startZ));
        this.startNode.cost = 0.0;
        this.startNode.combinedCost = this.startNode.estimatedCostToGoal;
        BinaryHeapOpenSet binaryHeapOpenSet = new BinaryHeapOpenSet();
        binaryHeapOpenSet.insert(this.startNode);
        double[] dArray = new double[COEFFICIENTS.length];
        for (int i = 0; i < dArray.length; ++i) {
            dArray[i] = this.startNode.estimatedCostToGoal;
            this.bestSoFar[i] = this.startNode;
        }
        MutableMoveResult mutableMoveResult = new MutableMoveResult();
        BetterWorldBorder betterWorldBorder = new BetterWorldBorder(this.calcContext.world.method_8621());
        long l4 = System.currentTimeMillis();
        boolean bl = (Boolean)Baritone.settings().slowPath.value;
        if (bl) {
            this.logDebug("slowPath is on, path timeout will be " + String.valueOf(Baritone.settings().slowPathTimeoutMS.value) + "ms instead of " + l + "ms");
        }
        long l5 = l4 + (bl ? (Long)Baritone.settings().slowPathTimeoutMS.value : l);
        long l6 = l4 + (bl ? (Long)Baritone.settings().slowPathTimeoutMS.value : l2);
        boolean bl2 = true;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        boolean bl3 = !this.favoring.isEmpty();
        int n6 = 64;
        int n7 = (Integer)Baritone.settings().pathingMaxChunkBorderFetch.value;
        double d = (Boolean)Baritone.settings().minimumImprovementRepropagation.value != false ? 0.01 : 0.0;
        Moves[] movesArray = Moves.values();
        while (!(binaryHeapOpenSet.isEmpty() || n5 >= n7 || this.cancelRequested || (n3 & n6 - 1) == 0 && ((l3 = System.currentTimeMillis()) - l6 >= 0L || !bl2 && l3 - l5 >= 0L))) {
            PathNode pathNode;
            if (bl) {
                try {
                    Thread.sleep((Long)Baritone.settings().slowPathTimeDelayMS.value);
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
            }
            this.mostRecentConsidered = pathNode = binaryHeapOpenSet.removeLowest();
            ++n3;
            if (this.goal.isInGoal(pathNode.x, pathNode.y, pathNode.z)) {
                this.logDebug("Took " + (System.currentTimeMillis() - l4) + "ms, " + n4 + " movements considered");
                return Optional.of(new Path(this.realStart, this.startNode, pathNode, n3, this.goal, this.calcContext));
            }
            for (Moves moves : movesArray) {
                int n8 = pathNode.x + moves.xOffset;
                int n9 = pathNode.z + moves.zOffset;
                if (!(n8 >> 4 == pathNode.x >> 4 && n9 >> 4 == pathNode.z >> 4 || this.calcContext.isLoaded(n8, n9))) {
                    if (moves.dynamicXZ) continue;
                    ++n5;
                    continue;
                }
                if (!moves.dynamicXZ && !betterWorldBorder.entirelyContains(n8, n9) || pathNode.y + moves.yOffset > n2 || pathNode.y + moves.yOffset < n) continue;
                mutableMoveResult.reset();
                moves.apply(this.calcContext, pathNode.x, pathNode.y, pathNode.z, mutableMoveResult);
                ++n4;
                double d2 = mutableMoveResult.cost;
                if (d2 >= 1000000.0) continue;
                if (d2 <= 0.0 || Double.isNaN(d2)) {
                    throw new IllegalStateException(String.format("%s from %s %s %s calculated implausible cost %s", new Object[]{moves, SettingsUtil.maybeCensor((int)pathNode.x), SettingsUtil.maybeCensor((int)pathNode.y), SettingsUtil.maybeCensor((int)pathNode.z), d2}));
                }
                if (moves.dynamicXZ && !betterWorldBorder.entirelyContains(mutableMoveResult.x, mutableMoveResult.z)) continue;
                if (!(moves.dynamicXZ || mutableMoveResult.x == n8 && mutableMoveResult.z == n9)) {
                    throw new IllegalStateException(String.format("%s from %s %s %s ended at x z %s %s instead of %s %s", new Object[]{moves, SettingsUtil.maybeCensor((int)pathNode.x), SettingsUtil.maybeCensor((int)pathNode.y), SettingsUtil.maybeCensor((int)pathNode.z), SettingsUtil.maybeCensor((int)mutableMoveResult.x), SettingsUtil.maybeCensor((int)mutableMoveResult.z), SettingsUtil.maybeCensor((int)n8), SettingsUtil.maybeCensor((int)n9)}));
                }
                if (!moves.dynamicY && mutableMoveResult.y != pathNode.y + moves.yOffset) {
                    throw new IllegalStateException(String.format("%s from %s %s %s ended at y %s instead of %s", new Object[]{moves, SettingsUtil.maybeCensor((int)pathNode.x), SettingsUtil.maybeCensor((int)pathNode.y), SettingsUtil.maybeCensor((int)pathNode.z), SettingsUtil.maybeCensor((int)mutableMoveResult.y), SettingsUtil.maybeCensor((int)(pathNode.y + moves.yOffset))}));
                }
                long l7 = BetterBlockPos.longHash((int)mutableMoveResult.x, (int)mutableMoveResult.y, (int)mutableMoveResult.z);
                if (bl3) {
                    d2 *= this.favoring.calculate(l7);
                }
                PathNode pathNode2 = this.getNodeAtPosition(mutableMoveResult.x, mutableMoveResult.y, mutableMoveResult.z, l7);
                double d3 = pathNode.cost + d2;
                if (!(pathNode2.cost - d3 > d)) continue;
                pathNode2.previous = pathNode;
                pathNode2.cost = d3;
                pathNode2.combinedCost = d3 + pathNode2.estimatedCostToGoal;
                if (pathNode2.isOpen()) {
                    binaryHeapOpenSet.update(pathNode2);
                } else {
                    binaryHeapOpenSet.insert(pathNode2);
                }
                for (int i = 0; i < COEFFICIENTS.length; ++i) {
                    double d4 = pathNode2.estimatedCostToGoal + pathNode2.cost / COEFFICIENTS[i];
                    if (!(dArray[i] - d4 > d)) continue;
                    dArray[i] = d4;
                    this.bestSoFar[i] = pathNode2;
                    if (!bl2 || !(this.getDistFromStartSq(pathNode2) > 25.0)) continue;
                    bl2 = false;
                }
            }
        }
        if (this.cancelRequested) {
            return Optional.empty();
        }
        System.out.println(n4 + " movements considered");
        System.out.println("Open set size: " + binaryHeapOpenSet.size());
        System.out.println("PathNode map size: " + this.mapSize());
        System.out.println((int)((double)n3 * 1.0 / (double)((float)(System.currentTimeMillis() - l4) / 1000.0f)) + " nodes per second");
        Optional<IPath> optional = this.bestSoFar(true, n3);
        if (optional.isPresent()) {
            this.logDebug("Took " + (System.currentTimeMillis() - l4) + "ms, " + n4 + " movements considered");
        }
        return optional;
    }
}

