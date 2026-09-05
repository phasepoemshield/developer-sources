/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.entity.event.v1.effect;

import org.jspecify.annotations.Nullable;

public interface EffectEventContext {
    public boolean isFromCommand();

    public @Nullable String commandName();
}

