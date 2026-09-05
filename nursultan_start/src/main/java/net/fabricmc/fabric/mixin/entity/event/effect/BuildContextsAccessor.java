/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.ContextChain
 */
package net.fabricmc.fabric.mixin.entity.event.effect;

import com.mojang.brigadier.context.ContextChain;

public interface BuildContextsAccessor<S> {
    public ContextChain<S> getCommand();
}

