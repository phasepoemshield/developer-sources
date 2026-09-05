/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class02015
 *  minecraft.class03794
 *  minecraft.class05062
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition
 *  net.fabricmc.fabric.mixin.datagen.loot.BlockLootSubProviderAccessor
 */
package net.fabricmc.fabric.impl.datagen.loot;

import java.util.Collections;
import minecraft.class00891;
import minecraft.class02015;
import minecraft.class03794;
import minecraft.class05062;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.impl.datagen.FabricDataGenHelper;
import net.fabricmc.fabric.mixin.datagen.loot.BlockLootSubProviderAccessor;

public class ConditionBlockLootTableGenerator
extends class02015 {
    private final class02015 parent;
    private final ResourceCondition[] conditions;

    public ConditionBlockLootTableGenerator(class02015 class020152, ResourceCondition[] resourceConditionArray) {
        super(Collections.emptySet(), class03794.i.N(), ((BlockLootSubProviderAccessor)class020152).getRegistries());
        this.parent = class020152;
        this.conditions = resourceConditionArray;
    }

    public void method_10379() {
        throw new UnsupportedOperationException("generate() should not be called.");
    }

    public void method_45988(class00891 class008912, class05062 class050622) {
        FabricDataGenHelper.addConditions(class050622, this.conditions);
        this.parent.method_45988(class008912, class050622);
    }
}

