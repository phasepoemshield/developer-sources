/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class03542
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.resource.conditions.conditions;

import com.mojang.serialization.MapCodec;
import minecraft.class03542;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.fabricmc.fabric.impl.resource.conditions.DefaultResourceConditionTypes;
import org.jspecify.annotations.Nullable;

public class TrueResourceCondition
implements ResourceCondition {
    public static final MapCodec<TrueResourceCondition> CODEC = MapCodec.unit(TrueResourceCondition::new);

    public boolean test(@Nullable class03542 class035422) {
        return true;
    }

    public ResourceConditionType<?> getType() {
        return DefaultResourceConditionTypes.TRUE;
    }
}

