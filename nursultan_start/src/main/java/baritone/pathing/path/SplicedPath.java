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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

public class SplicedPath
extends PathBase {
    private final List<BetterBlockPos> path;
    private final List<IMovement> movements;
    private final int numNodes;
    private final Goal goal;

    private SplicedPath(List<BetterBlockPos> list, List<IMovement> list2, int n, Goal goal) {
        this.path = list;
        this.movements = list2;
        this.numNodes = n;
        this.goal = goal;
        this.sanityCheck();
    }

    public int length() {
        return this.path.size();
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

    public static Optional<SplicedPath> trySplice(IPath iPath, IPath iPath2, boolean bl) {
        int n;
        if (iPath2 == null || iPath == null) {
            return Optional.empty();
        }
        if (!iPath.getDest().equals((Object)iPath2.getSrc())) {
            return Optional.empty();
        }
        HashSet hashSet = new HashSet(iPath2.positions());
        int n2 = -1;
        for (n = 0; n < iPath.length() - 1; ++n) {
            if (!hashSet.contains(iPath.positions().get(n))) continue;
            n2 = n;
            break;
        }
        if (n2 != -1) {
            if (!bl) {
                return Optional.empty();
            }
        } else {
            n2 = iPath.length() - 1;
        }
        n = iPath2.positions().indexOf(iPath.positions().get(n2));
        if (!bl && n != 0) {
            throw new IllegalStateException("Paths to be spliced are overlapping incorrectly");
        }
        ArrayList<BetterBlockPos> arrayList = new ArrayList<BetterBlockPos>();
        ArrayList<IMovement> arrayList2 = new ArrayList<IMovement>();
        arrayList.addAll(iPath.positions().subList(0, n2 + 1));
        arrayList2.addAll(iPath.movements().subList(0, n2));
        arrayList.addAll(iPath2.positions().subList(n + 1, iPath2.length()));
        arrayList2.addAll(iPath2.movements().subList(n, iPath2.length() - 1));
        return Optional.of(new SplicedPath(arrayList, arrayList2, iPath.getNumNodesConsidered() + iPath2.getNumNodesConsidered(), iPath.getGoal()));
    }

    public int getNumNodesConsidered() {
        return this.numNodes;
    }
}

