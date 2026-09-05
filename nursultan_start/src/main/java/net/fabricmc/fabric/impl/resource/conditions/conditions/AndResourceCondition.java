/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class03542
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.resource.conditions.conditions;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import minecraft.class03542;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.fabricmc.fabric.impl.resource.conditions.DefaultResourceConditionTypes;
import net.fabricmc.fabric.impl.resource.conditions.ResourceConditionsImpl;
import org.jspecify.annotations.Nullable;

public record AndResourceCondition(List<ResourceCondition> conditions) implements ResourceCondition
{
    public static final MapCodec<AndResourceCondition> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group((App)ResourceCondition.CODEC.listOf().fieldOf("values").forGetter(AndResourceCondition::conditions)).apply((Applicative)instance, AndResourceCondition::new));

    public boolean test(@Nullable class03542 class035422) {
        return ResourceConditionsImpl.conditionsMet(this.conditions(), class035422, true);
    }

    public ResourceConditionType<?> getType() {
        return DefaultResourceConditionTypes.AND;
    }
}

