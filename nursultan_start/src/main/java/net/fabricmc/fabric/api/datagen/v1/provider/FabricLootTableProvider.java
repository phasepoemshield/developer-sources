/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  minecraft.class02013
 *  minecraft.class05062
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class07135
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition
 *  net.fabricmc.fabric.impl.datagen.FabricDataGenHelper
 */
package net.fabricmc.fabric.api.datagen.v1.provider;

import com.google.common.base.Preconditions;
import java.util.function.BiConsumer;
import minecraft.class02013;
import minecraft.class05062;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class07135;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.impl.datagen.FabricDataGenHelper;

public interface FabricLootTableProvider
extends class02013,
class07135 {
    default public BiConsumer<class05946<class05074>, class05062> withConditions(BiConsumer<class05946<class05074>, class05062> biConsumer, ResourceCondition ... resourceConditionArray) {
        Preconditions.checkArgument((resourceConditionArray.length > 0 ? 1 : 0) != 0, (Object)"Must add at least one condition.");
        return (class059462, class050622) -> {
            FabricDataGenHelper.addConditions((Object)class050622, (ResourceCondition[])resourceConditionArray);
            biConsumer.accept((class05946<class05074>)class059462, (class05062)class050622);
        };
    }
}

