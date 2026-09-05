/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.api.config.ConfigState
 *  net.caffeinemc.mods.sodium.api.config.option.FlagHook
 */
package net.caffeinemc.mods.sodium.client.config.structure;

import java.util.Collection;
import java.util.function.BiConsumer;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.api.config.ConfigState;
import net.caffeinemc.mods.sodium.api.config.option.FlagHook;

public class FlagHookImpl
implements FlagHook {
    private final BiConsumer<Collection<class01894>, ConfigState> hook;
    private final Collection<class01894> triggers;

    public FlagHookImpl(BiConsumer<Collection<class01894>, ConfigState> biConsumer, Collection<class01894> collection) {
        this.hook = biConsumer;
        this.triggers = collection;
    }

    public void accept(Collection<class01894> collection, ConfigState configState) {
        this.hook.accept(collection, configState);
    }

    public Collection<class01894> getTriggers() {
        return this.triggers;
    }
}

