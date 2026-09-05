/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  minecraft.class01995
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition
 *  net.fabricmc.fabric.impl.datagen.loot.ConditionEntityLootTableGenerator
 */
package net.fabricmc.fabric.api.datagen.v1.loot;

import com.google.common.base.Preconditions;
import minecraft.class01995;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.impl.datagen.loot.ConditionEntityLootTableGenerator;

public interface FabricEntityLootTableGenerator {
    default public class01995 withConditions(ResourceCondition ... resourceConditionArray) {
        Preconditions.checkArgument((resourceConditionArray.length > 0 ? 1 : 0) != 0, (Object)"Must add at least one condition.");
        return new ConditionEntityLootTableGenerator((class01995)this, resourceConditionArray);
    }
}

