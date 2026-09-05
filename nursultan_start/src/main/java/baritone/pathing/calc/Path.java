/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.pathing.calc.IPath
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.movement.IMovement
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.Helper
 *  baritone.pathing.path.CutoffPath
 *  baritone.utils.pathing.PathBase
 *  com.google.common.collect.Lists
 *  minecraft.class00753
 */
package baritone.pathing.calc;

import baritone.api.pathing.calc.IPath;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.movement.IMovement;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.Helper;
import baritone.pathing.calc.PathNode;
import baritone.pathing.movement.CalculationContext;
import baritone.pathing.movement.Movement;
import baritone.pathing.movement.Moves;
import baritone.pathing.path.CutoffPath;
import baritone.utils.pathing.PathBase;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import minecraft.class00753;

class Path
extends PathBase {
    private final BetterBlockPos start;
    private final BetterBlockPos end;
    private final List<BetterBlockPos> path;
    private final List<Movement> movements;
    private final List<PathNode> nodes;
    private final Goal goal;
    private final int numNodes;
    private final CalculationContext context;
    private volatile boolean verified;

    Path(BetterBlockPos betterBlockPos, PathNode pathNode, PathNode pathNode2, int n, Goal goal, CalculationContext calculationContext) {
        this.end = new BetterBlockPos(pathNode2.x, pathNode2.y, pathNode2.z);
        this.numNodes = n;
        this.movements = new ArrayList<Movement>();
        this.goal = goal;
        this.context = calculationContext;
        PathNode pathNode3 = pathNode2;
        ArrayList<BetterBlockPos> arrayList = new ArrayList<BetterBlockPos>();
        ArrayList<PathNode> arrayList2 = new ArrayList<PathNode>();
        while (pathNode3 != null) {
            arrayList2.add(pathNode3);
            arrayList.add(new BetterBlockPos(pathNode3.x, pathNode3.y, pathNode3.z));
            pathNode3 = pathNode3.previous;
        }
        BetterBlockPos betterBlockPos2 = new BetterBlockPos(pathNode.x, pathNode.y, pathNode.z);
        if (!betterBlockPos.equals((Object)betterBlockPos2) && pathNode.equals(pathNode2)) {
            this.start = betterBlockPos;
            PathNode pathNode4 = new PathNode(betterBlockPos.x, betterBlockPos.y, betterBlockPos.z, goal);
            pathNode4.cost = 0.0;
            arrayList2.add(pathNode4);
            arrayList.add(betterBlockPos);
        } else {
            this.start = betterBlockPos2;
        }
        this.path = Lists.reverse(arrayList);
        this.nodes = Lists.reverse(arrayList2);
    }

    public List<BetterBlockPos> positions() {
        return Collections.unmodifiableList(this.path);
    }

    public Goal getGoal() {
        return this.goal;
    }

    public List<IMovement> movements() {
        if (!this.verified) {
            throw new IllegalStateException("Path not yet verified");
        }
        return Collections.unmodifiableList(this.movements);
    }

    public BetterBlockPos getSrc() {
        return this.start;
    }

    public BetterBlockPos getDest() {
        return this.end;
    }

    public IPath postProcess() {
        if (this.verified) {
            throw new IllegalStateException("Path must not be verified twice");
        }
        this.verified = true;
        boolean bl = this.assembleMovements();
        this.movements.forEach(movement -> movement.checkLoadedChunk(this.context));
        if (bl) {
            CutoffPath cutoffPath = new CutoffPath((IPath)this, this.movements().size());
            if (cutoffPath.movements().size() != this.movements.size()) {
                throw new IllegalStateException("Path has wrong size after cutoff");
            }
            return cutoffPath;
        }
        this.sanityCheck();
        return this;
    }

    private Movement runBackwards(BetterBlockPos betterBlockPos, BetterBlockPos betterBlockPos2, double d) {
        for (Moves moves : Moves.values()) {
            Movement movement = moves.apply0(this.context, betterBlockPos);
            if (!movement.getDest().equals((Object)betterBlockPos2)) continue;
            movement.override(Math.min(movement.calculateCost(this.context), d));
            return movement;
        }
        Helper.HELPER.logDebug("Movement became impossible during calculation " + String.valueOf(betterBlockPos) + " " + String.valueOf(betterBlockPos2) + " " + String.valueOf(betterBlockPos2.method_10059((class00753)betterBlockPos)));
        return null;
    }

    private boolean assembleMovements() {
        if (this.path.isEmpty() || !this.movements.isEmpty()) {
            throw new IllegalStateException("Path must not be empty");
        }
        for (int i = 0; i < this.path.size() - 1; ++i) {
            double d = this.nodes.get((int)(i + 1)).cost - this.nodes.get((int)i).cost;
            Movement movement = this.runBackwards(this.path.get(i), this.path.get(i + 1), d);
            if (movement == null) {
                return true;
            }
            this.movements.add(movement);
        }
        return false;
    }

    public int getNumNodesConsidered() {
        return this.numNodes;
    }
}

