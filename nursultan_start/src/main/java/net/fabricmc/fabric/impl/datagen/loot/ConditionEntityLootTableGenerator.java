/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01995
 *  minecraft.class03794
 *  minecraft.class05062
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class07078
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition
 *  net.fabricmc.fabric.mixin.datagen.loot.EntityLootSubProviderAccessor
 */
package net.fabricmc.fabric.impl.datagen.loot;

import minecraft.class01995;
import minecraft.class03794;
import minecraft.class05062;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class07078;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.impl.datagen.FabricDataGenHelper;
import net.fabricmc.fabric.mixin.datagen.loot.EntityLootSubProviderAccessor;

public class ConditionEntityLootTableGenerator
extends class01995 {
    private final class01995 parent;
    private final ResourceCondition[] conditions;

    public ConditionEntityLootTableGenerator(class01995 class019952, ResourceCondition[] resourceConditionArray) {
        super(class03794.i.N(), ((EntityLootSubProviderAccessor)class019952).getRegistries());
        this.parent = class019952;
        this.conditions = resourceConditionArray;
    }

    public void method_10400() {
        throw new UnsupportedOperationException("generate() should not be called.");
    }

    public void method_46028(class07078<?> class070782, class05946<class05074> class059462, class05062 class050622) {
        FabricDataGenHelper.addConditions(class050622, this.conditions);
        this.parent.method_46028(class070782, class059462, class050622);
    }
}

