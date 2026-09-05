/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06584
 *  minecraft.class07049
 */
package baritone.api.process;

import baritone.api.process.IBaritoneProcess;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class06584;
import minecraft.class07049;

public interface IFollowProcess
extends IBaritoneProcess {
    public void pickup(Predicate<class06584> var1);

    public void follow(Predicate<class07049> var1);

    public Predicate<class07049> currentFilter();

    default public void cancel() {
        this.onLostControl();
    }

    public List<class07049> following();
}

