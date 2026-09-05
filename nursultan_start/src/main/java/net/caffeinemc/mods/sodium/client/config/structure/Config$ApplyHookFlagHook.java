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
import java.util.Set;
import java.util.function.Consumer;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.api.config.ConfigState;
import net.caffeinemc.mods.sodium.api.config.option.FlagHook;

record Config$ApplyHookFlagHook(class01894 applyHookId, Consumer<ConfigState> applyHook) implements FlagHook
{
    public void accept(Collection<class01894> collection, ConfigState configState) {
        this.applyHook.accept(configState);
    }

    public Collection<class01894> getTriggers() {
        return Set.of(this.applyHookId);
    }
}

