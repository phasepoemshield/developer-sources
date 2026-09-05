/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 */
package net.fabricmc.fabric.api.event;

import minecraft.class01894;

public abstract class Event<T> {
    protected volatile T invoker;
    public static final class01894 DEFAULT_PHASE = class01894.N((String)"fabric", (String)"default");

    public void register(class01894 class018942, T t) {
        this.register(t);
    }

    public abstract void register(T var1);

    public final T invoker() {
        return this.invoker;
    }

    public void addPhaseOrdering(class01894 class018942, class01894 class018943) {
    }
}

