/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.pathing.calc.IPath
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.movement.IMovement
 *  baritone.api.utils.BetterBlockPos
 */
package baritone.pathing.path;

import baritone.api.pathing.calc.IPath;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.movement.IMovement;
import baritone.api.utils.BetterBlockPos;
import baritone.utils.pathing.PathBase;
import java.util.Collections;
import java.util.List;

public class CutoffPath
extends PathBase {
    private final List<BetterBlockPos> path;
    private final List<IMovement> movements;
    private final int numNodes;
    private final Goal goal;

    public CutoffPath(IPath iPath, int n, int n2) {
        this.path = iPath.positions().subList(n, n2 + 1);
        this.movements = iPath.movements().subList(n, n2);
        this.numNodes = iPath.getNumNodesConsidered();
        this.goal = iPath.getGoal();
        this.sanityCheck();
    }

    public CutoffPath(IPath iPath, int n) {
        this(iPath, 0, n);
    }

    public List<BetterBlockPos> positions() {
        return Collections.unmodifiableList(this.path);
    }

    public Goal getGoal() {
        return this.goal;
    }

    public List<IMovement> movements() {
        return Collections.unmodifiableList(this.movements);
    }

    public int getNumNodesConsidered() {
        return this.numNodes;
    }
}

