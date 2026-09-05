/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class05441
 *  minecraft.class08122
 */
package net.fabricmc.fabric.mixin.loot;

import java.util.List;
import java.util.Optional;
import minecraft.class01894;
import minecraft.class05441;
import minecraft.class08122;

public interface LootTableAccessor {
    public List<class05441> fabric_getPools();

    public Optional<class01894> fabric_getRandomSequenceId();

    public List<class08122> fabric_getFunctions();
}

