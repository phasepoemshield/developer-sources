/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 */
package net.fabricmc.fabric.mixin.entity.event.effect;

import com.mojang.brigadier.context.CommandContext;
import java.util.List;

public interface ContextChainAccessor<S> {
    public List<CommandContext<S>> getModifiers();
}

