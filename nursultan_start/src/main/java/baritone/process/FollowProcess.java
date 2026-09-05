/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalBlock
 *  baritone.api.pathing.goals.GoalComposite
 *  baritone.api.pathing.goals.GoalNear
 *  baritone.api.pathing.goals.GoalXZ
 *  baritone.api.process.IFollowProcess
 *  baritone.api.process.PathingCommand
 *  baritone.api.process.PathingCommandType
 *  baritone.api.utils.BetterBlockPos
 *  minecraft.class00717
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 */
package baritone.process;

import baritone.Baritone;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalComposite;
import baritone.api.pathing.goals.GoalNear;
import baritone.api.pathing.goals.GoalXZ;
import baritone.api.process.IFollowProcess;
import baritone.api.process.PathingCommand;
import baritone.api.process.PathingCommandType;
import baritone.api.utils.BetterBlockPos;
import baritone.utils.BaritoneProcessHelper;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import minecraft.class00717;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;

public class FollowProcess
extends BaritoneProcessHelper
implements IFollowProcess {
    protected Predicate<class07049> filter;
    protected List<class07049> cache;
    private boolean into;

    public void pickup(Predicate<class06584> predicate) {
        this.filter = class070492 -> class070492 instanceof class00717 && predicate.test(((class00717)class070492).N());
        this.into = true;
    }

    public void follow(Predicate<class07049> predicate) {
        this.filter = predicate;
        this.into = false;
    }

    public Predicate<class07049> currentFilter() {
        return this.filter;
    }

    public FollowProcess(Baritone baritone) {
        super(baritone);
    }

    public boolean isActive() {
        if (this.filter == null) {
            return false;
        }
        this.scanWorld();
        return !this.cache.isEmpty();
    }

    public PathingCommand onTick(boolean bl, boolean bl2) {
        this.scanWorld();
        GoalComposite goalComposite = new GoalComposite((Goal[])this.cache.stream().map(this::towards).toArray(Goal[]::new));
        return new PathingCommand((Goal)goalComposite, PathingCommandType.REVALIDATE_GOAL_AND_PATH);
    }

    private Goal towards(class07049 class070492) {
        class07209 class072092;
        if ((Double)Baritone.settings().followOffsetDistance.value == 0.0 || this.into) {
            class072092 = class070492.method_24515();
        } else {
            GoalXZ goalXZ = GoalXZ.fromDirection((class06889)class070492.method_73189(), (float)((Float)Baritone.settings().followOffsetDirection.value).floatValue(), (double)((Double)Baritone.settings().followOffsetDistance.value));
            class072092 = new BetterBlockPos((double)goalXZ.getX(), class070492.method_73189().B, (double)goalXZ.getZ());
        }
        if (this.into) {
            return new GoalBlock(class072092);
        }
        return new GoalNear(class072092, ((Integer)Baritone.settings().followRadius.value).intValue());
    }

    public List<class07049> following() {
        return this.cache;
    }

    private boolean followable(class07049 class070492) {
        if (class070492 == null) {
            return false;
        }
        if (!class070492.method_5805()) {
            return false;
        }
        if (class070492.equals((Object)this.ctx.player())) {
            return false;
        }
        int n = (Integer)Baritone.settings().followTargetMaxDistance.value;
        if (n != 0 && class070492.method_5858((class07049)this.ctx.player()) > (double)(n * n)) {
            return false;
        }
        return this.ctx.entitiesStream().anyMatch(arg_0 -> ((class07049)class070492).equals(arg_0));
    }

    private void scanWorld() {
        this.cache = this.ctx.entitiesStream().filter(this::followable).filter(this.filter).distinct().collect(Collectors.toList());
    }

    public String displayName0() {
        return "Following " + String.valueOf(this.cache);
    }

    public void onLostControl() {
        this.filter = null;
        this.cache = null;
    }
}

