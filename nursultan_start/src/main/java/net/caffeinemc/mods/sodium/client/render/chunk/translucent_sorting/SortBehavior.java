/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.chunk.DeferMode
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting;

import net.caffeinemc.mods.sodium.client.render.chunk.DeferMode;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortBehavior$PriorityMode;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortBehavior$SortMode;

public enum SortBehavior {
    OFF("OFF", SortBehavior$SortMode.NONE),
    STATIC("S", SortBehavior$SortMode.STATIC),
    DYNAMIC_DEFER_ALWAYS("DF", SortBehavior$PriorityMode.NONE, DeferMode.ALWAYS),
    DYNAMIC_DEFER_NEARBY_ONE_FRAME("N1", SortBehavior$PriorityMode.NEARBY, DeferMode.ONE_FRAME),
    DYNAMIC_DEFER_NEARBY_ZERO_FRAMES("N0", SortBehavior$PriorityMode.NEARBY, DeferMode.ZERO_FRAMES),
    DYNAMIC_DEFER_ALL_ONE_FRAME("A1", SortBehavior$PriorityMode.ALL, DeferMode.ONE_FRAME),
    DYNAMIC_DEFER_ALL_ZERO_FRAMES("A0", SortBehavior$PriorityMode.ALL, DeferMode.ZERO_FRAMES);

    private final String shortName;
    private final SortBehavior$SortMode sortMode;
    private final SortBehavior$PriorityMode priorityMode;
    private final DeferMode deferMode;

    private SortBehavior(String string2, SortBehavior$SortMode sortBehavior$SortMode) {
        this(string2, sortBehavior$SortMode, null, null);
    }

    private SortBehavior(String string2, SortBehavior$PriorityMode sortBehavior$PriorityMode, DeferMode deferMode) {
        this(string2, SortBehavior$SortMode.DYNAMIC, sortBehavior$PriorityMode, deferMode);
    }

    private SortBehavior(String string2, SortBehavior$SortMode sortBehavior$SortMode, SortBehavior$PriorityMode sortBehavior$PriorityMode, DeferMode deferMode) {
        this.shortName = string2;
        this.sortMode = sortBehavior$SortMode;
        this.priorityMode = sortBehavior$PriorityMode;
        this.deferMode = deferMode;
    }

    public DeferMode getDeferMode() {
        return this.deferMode;
    }

    public SortBehavior$PriorityMode getPriorityMode() {
        return this.priorityMode;
    }

    public SortBehavior$SortMode getSortMode() {
        return this.sortMode;
    }

    public String getShortName() {
        return this.shortName;
    }
}

