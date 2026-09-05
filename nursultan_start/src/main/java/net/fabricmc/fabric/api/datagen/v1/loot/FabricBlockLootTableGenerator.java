/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  minecraft.class02015
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition
 *  net.fabricmc.fabric.impl.datagen.loot.ConditionBlockLootTableGenerator
 */
package net.fabricmc.fabric.api.datagen.v1.loot;

import com.google.common.base.Preconditions;
import minecraft.class02015;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.impl.datagen.loot.ConditionBlockLootTableGenerator;

public interface FabricBlockLootTableGenerator {
    default public class02015 withConditions(ResourceCondition ... resourceConditionArray) {
        Preconditions.checkArgument((resourceConditionArray.length > 0 ? 1 : 0) != 0, (Object)"Must add at least one condition.");
        return new ConditionBlockLootTableGenerator((class02015)this, resourceConditionArray);
    }
}

