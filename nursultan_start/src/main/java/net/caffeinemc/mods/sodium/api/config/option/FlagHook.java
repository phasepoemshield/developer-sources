/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 */
package net.caffeinemc.mods.sodium.api.config.option;

import java.util.Collection;
import java.util.function.BiConsumer;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.api.config.ConfigState;

public interface FlagHook
extends BiConsumer<Collection<class01894>, ConfigState> {
    public Collection<class01894> getTriggers();
}

