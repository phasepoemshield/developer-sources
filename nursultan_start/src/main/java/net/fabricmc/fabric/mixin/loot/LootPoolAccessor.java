/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04129
 *  minecraft.class05957
 *  minecraft.class06378
 *  minecraft.class08122
 */
package net.fabricmc.fabric.mixin.loot;

import java.util.List;
import minecraft.class04129;
import minecraft.class05957;
import minecraft.class06378;
import minecraft.class08122;

public interface LootPoolAccessor {
    public class06378 fabric_getRolls();

    public List<class04129> fabric_getEntries();

    public class06378 fabric_getBonusRolls();

    public List<class05957> fabric_getConditions();

    public List<class08122> fabric_getFunctions();
}

