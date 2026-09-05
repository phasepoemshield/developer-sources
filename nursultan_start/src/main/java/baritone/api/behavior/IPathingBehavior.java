/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.pathing.calc.IPath
 *  baritone.api.pathing.calc.IPathFinder
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.path.IPathExecutor
 */
package baritone.api.behavior;

import baritone.api.behavior.IBehavior;
import baritone.api.pathing.calc.IPath;
import baritone.api.pathing.calc.IPathFinder;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.path.IPathExecutor;
import java.util.Optional;

public interface IPathingBehavior
extends IBehavior {
    default public Optional<IPath> getPath() {
        return Optional.ofNullable(this.getCurrent()).map(IPathExecutor::getPath);
    }

    public IPathExecutor getNext();

    default public boolean hasPath() {
        return this.getCurrent() != null;
    }

    public Goal getGoal();

    public boolean isPathing();

    public IPathExecutor getCurrent();

    public Optional<? extends IPathFinder> getInProgress();

    public boolean cancelEverything();

    public void forceCancel();

    default public Optional<Double> ticksRemainingInSegment(boolean bl) {
        IPathExecutor iPathExecutor = this.getCurrent();
        if (iPathExecutor == null) {
            return Optional.empty();
        }
        int n = bl ? iPathExecutor.getPosition() : iPathExecutor.getPosition() + 1;
        return Optional.of(iPathExecutor.getPath().ticksRemainingFrom(n));
    }

    default public Optional<Double> ticksRemainingInSegment() {
        return this.ticksRemainingInSegment(true);
    }

    public Optional<Double> estimatedTicksToGoal();
}

