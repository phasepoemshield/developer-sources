/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalComposite
 *  baritone.api.pathing.goals.GoalXZ
 *  baritone.api.process.IExploreProcess
 *  baritone.api.process.PathingCommand
 *  baritone.api.process.PathingCommandType
 *  minecraft.class07209
 */
package baritone.process;

import baritone.Baritone;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalComposite;
import baritone.api.pathing.goals.GoalXZ;
import baritone.api.process.IExploreProcess;
import baritone.api.process.PathingCommand;
import baritone.api.process.PathingCommandType;
import baritone.process.ExploreProcess$1;
import baritone.process.ExploreProcess$BaritoneChunkCache;
import baritone.process.ExploreProcess$EitherChunk;
import baritone.process.ExploreProcess$IChunkFilter;
import baritone.process.ExploreProcess$JsonChunkFilter;
import baritone.utils.BaritoneProcessHelper;
import java.nio.file.Path;
import java.util.ArrayList;
import minecraft.class07209;

public final class ExploreProcess
extends BaritoneProcessHelper
implements IExploreProcess {
    private class07209 explorationOrigin;
    private ExploreProcess$IChunkFilter filter;
    private int distanceCompleted;

    static /* synthetic */ Baritone access$000(ExploreProcess exploreProcess) {
        return exploreProcess.baritone;
    }

    public ExploreProcess(Baritone baritone) {
        super(baritone);
    }

    public boolean isActive() {
        return this.explorationOrigin != null;
    }

    public PathingCommand onTick(boolean bl, boolean bl2) {
        if (bl) {
            this.logDirect("Failed");
            if (((Boolean)Baritone.settings().notificationOnExploreFinished.value).booleanValue()) {
                this.logNotification("Exploration failed", true);
            }
            this.onLostControl();
            return null;
        }
        ExploreProcess$IChunkFilter exploreProcess$IChunkFilter = this.calcFilter();
        if (!((Boolean)Baritone.settings().disableCompletionCheck.value).booleanValue() && exploreProcess$IChunkFilter.countRemain() == 0) {
            this.logDirect("Explored all chunks");
            if (((Boolean)Baritone.settings().notificationOnExploreFinished.value).booleanValue()) {
                this.logNotification("Explored all chunks", false);
            }
            this.onLostControl();
            return null;
        }
        Goal[] goalArray = this.closestUncachedChunks(this.explorationOrigin, exploreProcess$IChunkFilter);
        if (goalArray == null) {
            this.logDebug("awaiting region load from disk");
            return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
        }
        return new PathingCommand((Goal)new GoalComposite(goalArray), PathingCommandType.FORCE_REVALIDATE_GOAL_AND_PATH);
    }

    public void explore(int n, int n2) {
        this.explorationOrigin = new class07209(n, 0, n2);
        this.distanceCompleted = 0;
    }

    private static Goal createGoal(int n, int n2) {
        if ((Integer)Baritone.settings().exploreMaintainY.value == -1) {
            return new GoalXZ(n, n2);
        }
        return new ExploreProcess$1(n, n2);
    }

    public ExploreProcess$IChunkFilter calcFilter() {
        ExploreProcess$IChunkFilter exploreProcess$IChunkFilter = this.filter != null ? new ExploreProcess$EitherChunk(this, this.filter, new ExploreProcess$BaritoneChunkCache(this)) : new ExploreProcess$BaritoneChunkCache(this);
        return exploreProcess$IChunkFilter;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Goal[] closestUncachedChunks(class07209 class072093, ExploreProcess$IChunkFilter exploreProcess$IChunkFilter) {
        int n = class072093.method_10263() >> 4;
        int n2 = class072093.method_10260() >> 4;
        int n3 = Math.min(exploreProcess$IChunkFilter.countRemain(), (Integer)Baritone.settings().exploreChunkSetMinimumSize.value);
        ArrayList<class07209> arrayList = new ArrayList<class07209>();
        int n4 = (Integer)Baritone.settings().worldExploringChunkOffset.value;
        int n5 = this.distanceCompleted;
        block5: while (true) {
            int n6 = -n5;
            while (true) {
                int n7;
                if (n6 <= n5) {
                    n7 = n5 - Math.abs(n6);
                } else {
                    if (n5 % 10 == 0) {
                        n3 = Math.min(exploreProcess$IChunkFilter.countRemain(), (Integer)Baritone.settings().exploreChunkSetMinimumSize.value);
                    }
                    if (arrayList.size() >= n3) {
                        return (Goal[])arrayList.stream().map(class072092 -> ExploreProcess.createGoal(class072092.method_10263(), class072092.method_10260())).toArray(Goal[]::new);
                    }
                    if (arrayList.isEmpty()) {
                        this.distanceCompleted = n5 + 1;
                    }
                    ++n5;
                    continue block5;
                }
                block7: for (int i = 0; i < 2; ++i) {
                    int n8 = (i * 2 - 1) * n7;
                    int n9 = Math.abs(n6) + Math.abs(n8);
                    if (n9 != n5) {
                        throw new IllegalStateException(String.format("Offset %s %s has distance %s, expected %s", n6, n8, n9, n5));
                    }
                    switch (exploreProcess$IChunkFilter.isAlreadyExplored(n + n6, n2 + n8).ordinal()) {
                        case 2: {
                            return null;
                        }
                        case 1: {
                            break;
                        }
                        case 0: {
                            continue block7;
                        }
                    }
                    int n10 = (n + n6 << 4) + 8;
                    int n11 = (n2 + n8 << 4) + 8;
                    int n12 = n4 << 4;
                    n10 = n6 < 0 ? (n10 -= n12) : (n10 += n12);
                    n11 = n8 < 0 ? (n11 -= n12) : (n11 += n12);
                    arrayList.add(new class07209(n10, 0, n11));
                }
                ++n6;
            }
            break;
        }
    }

    public String displayName0() {
        return "Exploring around " + String.valueOf(this.explorationOrigin) + ", distance completed " + this.distanceCompleted + ", currently going to " + String.valueOf(new GoalComposite(this.closestUncachedChunks(this.explorationOrigin, this.calcFilter())));
    }

    public void applyJsonFilter(Path path, boolean bl) throws Exception {
        this.filter = new ExploreProcess$JsonChunkFilter(this, path, bl);
    }

    public void onLostControl() {
        this.explorationOrigin = null;
    }
}

